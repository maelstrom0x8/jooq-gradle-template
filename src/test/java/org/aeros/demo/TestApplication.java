package org.aeros.demo;

import org.springframework.boot.SpringApplication;

class TestApplication {

	public static void main(String[] args) {
		SpringApplication.from(Application::main)
				.with(TestContainersConfig.class)
				.run(args);
	}

}
