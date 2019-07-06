package com.example.maildemo.servcie;

import com.example.maildemo.util.SendMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MailServiceImpl implements MailService {
    @Autowired
    private  JavaMailSender sender;
    @Value("${spring.mail.username}")
    private String from;
    public void sendSimple(){
        //String from="17736551235@163.com";
        String to="514333689@qq.com";
        String title="来自@177...的邮件";
        String text="来自177……@163的邮件  :"+new  Date();
        try {
            SimpleMailMessage message =SendMail.sendSimple(from,to,title,text);
            System.out.println("from::"+from);
           System.out.println( "邮件内容为："+message.getText());
            sender.send(message);
        } catch (Exception e) {
            System.out.println("发送失败   erro！！");
            e.printStackTrace();
        }


    }


}
