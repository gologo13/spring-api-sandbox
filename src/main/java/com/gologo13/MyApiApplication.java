//package com.gologo13;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class MyApiApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(MyApiApplication.class, args);
//    }
//}

package com.gologo13;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class MyApiApplication {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext")) {
			MyApiApplication data = context.getBean(MyApiApplication.class);
			data.exectute();
		}
	}
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Transactional
	public void exectute() {
		// do some work.
	}
	
}