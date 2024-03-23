package com.example.SpringLabProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLabProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringLabProjectApplication.class, args);

		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		// Create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();
		// Navigate to a website
		driver.get("http://localhost:3000/patient");

		// Perform some actions (e.g., print the title)
		System.out.println("Page Title: " + driver.getTitle());
		// Close the browser
		driver.quit();


	}
}
