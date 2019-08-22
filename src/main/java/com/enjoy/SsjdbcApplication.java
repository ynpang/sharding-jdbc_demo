package com.enjoy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.enjoy.mapper")
public class SsjdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsjdbcApplication.class, args);
	}

}
