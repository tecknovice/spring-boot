package springbootdemo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	//expose  "/" that return "Helloworld	"
	
	@GetMapping("/")
	public String hello() {
		return "HelloWorld! Time on server is "+ LocalDateTime.now();
	}
}
