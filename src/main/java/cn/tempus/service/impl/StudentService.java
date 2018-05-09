package cn.tempus.service.impl;

import cn.tempus.bean.Student;
import cn.tempus.dao.IStudentDao;
import cn.tempus.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {

    public StudentService(){
        System.out.println("studentService init ....");
    }
    
    @Autowired
    private IStudentDao studentDao;

    @Override
    public Student findStu() {
        return studentDao.find();
    }
}
