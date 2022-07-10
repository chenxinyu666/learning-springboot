package com.bjpowernode.service.impl;
import com.bjpowernode.dao.StudentMapper;
import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    /**
     *
     * @Transactional被声明的方法有事务支持
     *      隔离级别 默认使用数据库的
     *      传播行为为 REQUIRED
     *      超时时间为 -1
     */
    @Transactional
    @Override
    public int addStudent(Student student) {
        System.out.println("业务方法addStudent");
        int rows = studentMapper.insert(student);
        System.out.println("执行SQL语句");
        //手动抛出一个运行时异常，目的是回滚事务
        int m = 1/0;

        return rows;
    }
}
