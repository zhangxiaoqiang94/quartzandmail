package com.example.maildemo.util;

import org.springframework.mail.SimpleMailMessage;

public class SendMail {

    //发送text格式(文本)邮件
    public static SimpleMailMessage sendSimple(String fromto,String sendto ,String subject,String text){

        SimpleMailMessage mes= new SimpleMailMessage();

        try {
            mes.setFrom(fromto);//邮件的发送者
            mes.setTo(sendto);//给送给的邮箱
            mes.setSubject(subject);//发送标题
            mes.setText(text);//发送内容
            //用JavaMailSender 工具类  发送邮件
            System.out.println("工具类执行正常");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("工具类出现异常");
            throw new RuntimeException();
        }
        return mes;
    }

}
