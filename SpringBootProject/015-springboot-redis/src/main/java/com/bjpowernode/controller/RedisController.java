package com.bjpowernode.controller;

import com.bjpowernode.vo.Student;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class RedisController {
    //添加数据到Redis
    /*
    * 注入RedisTemplate
    * RedisTemplate的泛型情况：
    *   RedisTemplate<String,String>
    *   RedisTemplate<Object,Object>
    *   RedisTemplate
    * 注意：RedisTemplate对象的名称就是redisTemplate
    * */
    @Resource
    private RedisTemplate redisTemplate;

    //向redis添加数据
    @PostMapping("/redis/add/{key}/{value}")
    @ResponseBody
    public String addStringToRedis(@PathVariable("key") String key,@PathVariable("value") String value){
        //设置key的序列化方式(默认是JDK序列化方式)
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //设置value的序列化方式
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        //操作string类型的数据，获取操作对象
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key,value);
        return "向redis添加了String类型的数据: "+key+":"+value;
    }

    //从redis获取数据
    @GetMapping("/redis/get/{key}")
    @ResponseBody
    public String getData(@PathVariable("key") String key){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        String value=(String) valueOperations.get(key);
        return value;
    }

    /**
     * 使用JSON序列化，把JAVA转为JSON存储
     */
    @PostMapping("/redis/addjson")
    @ResponseBody
    public String addJson(){
        Student student = new Student();
        student.setName("zhangsan");
        student.setAge(20);
        student.setId(1);
        //设置key的序列化方式为String
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //设置value的序列化方式为JSON
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));
        redisTemplate.opsForValue().set("myStudent",student);
        return "JSON的序列化";
    }
    @GetMapping("/redis/getjson")
    @ResponseBody
    public String getJson(){
        //设置key的序列化方式为String
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //设置value的序列化方式为JSON
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));
        Student student = (Student) redisTemplate.opsForValue().get("myStudent");
        return student.toString();
    }
}
