package com.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@Controller
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	private String index(Model model) {
		Boolean validation = false;
		List<String> lista = Arrays.asList("José Vieira","Outro Nome","Outro Nome","Outro Nome");
		model.addAttribute("validation", false);
		model.addAttribute("list", lista);
		return "index";
	}
	
}
