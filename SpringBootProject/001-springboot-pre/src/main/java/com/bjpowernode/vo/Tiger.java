package com.bjpowernode.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("tiger")
public class Tiger {
    /*注意，在SpringConfig类中读取了属性配置文件，这里才能将给属性赋值*/
    @Value("${tiger.name}")
    private String name;
    @Value("${tiger.age}")
    private Integer age;
    public Tiger() {
    }

    public Tiger(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
