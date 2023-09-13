package com.sjuchat.sjucjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.sjuchat.sjucjava")
@EntityScan(basePackages = "com.sjuchat.sjucjava.sjuccommon")
public class SjucJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SjucJavaApplication.class, args);
    }

}
