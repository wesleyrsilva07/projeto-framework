package com.financeiro.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {
	@RequestMapping("/")
	@ResponseBody
	public String teste() {
		return "Teste";
	}
}