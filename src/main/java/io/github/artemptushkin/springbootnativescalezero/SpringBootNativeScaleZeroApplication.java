package io.github.artemptushkin.springbootnativescalezero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class SpringBootNativeScaleZeroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNativeScaleZeroApplication.class, args);
	}

}
