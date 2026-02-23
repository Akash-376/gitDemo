package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitcmdDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitcmdDemoApplication.class, args);
		System.out.println("commit 1");
		System.out.println("branch-B commit-1");
	}

}
