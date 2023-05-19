package com.lyk.coursearrange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling//开启定时任务
public class CoursearrangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursearrangeApplication.class, args);
    }

}
