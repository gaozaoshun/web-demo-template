package com.gzs.webdemotemp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gzs.webdemotemp.dao")
public class WebDemoTempApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebDemoTempApplication.class, args);
	}
}
