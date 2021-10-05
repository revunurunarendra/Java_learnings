package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class DemoApplication  {

	public static void main(String[] args) {
		
		B.print();
		B b= new B();
		b.print();
		A.print();
		
	}

}
