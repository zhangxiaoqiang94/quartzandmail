package com.example.maildemo.quartz;

import com.example.maildemo.servcie.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JobQuartz {
    @Autowired
    private MailService mailService;

    @Scheduled(cron = "0/10 * * * * ?")
    public void Job(){
        mailService.sendSimple();
        System.out.println("定时任务已执行  "+new Date());

    }

}
