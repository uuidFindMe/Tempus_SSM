package cn.tempus.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TaskTest {

    @Scheduled(cron="0/1 * * * * ?")
    public void execute(){
        System.out.println("let's go on " + new SimpleDateFormat().format(new Date()).toString());
    }
}
