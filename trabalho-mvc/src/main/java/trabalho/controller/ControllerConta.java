package trabalho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerConta {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
}
