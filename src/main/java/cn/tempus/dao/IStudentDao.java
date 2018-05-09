package cn.tempus.dao;

import cn.tempus.bean.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentDao {
    public Student find();
}
