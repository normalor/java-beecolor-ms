package com.beecolorshop.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class BeeColorApiApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(BeeColorApiApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BeeColorApiApplication.class);
    }
}

//@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//public class BeeColorApiApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(BeeColorApiApplication.class, args);
//	}
//
//}

