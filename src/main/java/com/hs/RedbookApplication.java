package com.hs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hs.dao")
public class RedbookApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedbookApplication.class, args);
    }

}
