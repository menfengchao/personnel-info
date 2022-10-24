package com.byd.personnel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.byd.personnel.dao.mapper")
public class PersonnelInfoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonnelInfoWebApplication.class, args);
    }

}
