package cn.tempus.controller;

import cn.tempus.bean.Student;
import cn.tempus.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    public TestController(){
        System.out.println("TestController init.....");
    }

    @Autowired
    private IStudentService studentService;

    @RequestMapping("/stuTest")
    public String test(Model model){
        System.out.println("find stu .......");
        Student student = studentService.findStu();
        model.addAttribute("name", "leonardoEzio");
        System.out.println(student);
        return "student";
    }
}
