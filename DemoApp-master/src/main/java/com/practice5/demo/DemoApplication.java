package com.practice5.demo;

import com.practice5.demo.routing.SomeBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        context.getBean(SomeBean.class).putData();

	}

}
