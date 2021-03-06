package io.javabrains;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLdapCrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLdapCrudDemoApplication.class, args);
	}
	
}
