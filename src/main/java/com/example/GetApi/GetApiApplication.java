package com.example.GetApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class GetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetApiApplication.class, args);

		String url = "https://api.github.com/repos/symfony/symfony-docs";

		WebClient.Builder builder = WebClient.builder();

		RepositoryInfo repositoryInfo = builder.build()
				.get()
				.uri(url)
				.retrieve()
				.bodyToMono(RepositoryInfo.class)
				.block();

		System.out.println("--------------------------------------------");
		System.out.println(repositoryInfo);
		System.out.println("--------------------------------------------");
	}
}
