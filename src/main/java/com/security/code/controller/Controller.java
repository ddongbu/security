package com.security.code.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
		@ResponseBody
		@GetMapping("/")
		public String getAll() {
			System.out.println("테스트");
			return "Success Test";
		}
}
