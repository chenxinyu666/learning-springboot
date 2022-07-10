package com.bjpowernode.dao;

import com.bjpowernode.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

//声明当前接口是Dao接口，MyBatis需要创建此接口的代理对象
@Mapper
public interface StudentDao {
    Student selectStudentById(
            @Param("stuId")
            Integer id);
}
