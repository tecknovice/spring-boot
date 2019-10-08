package springbootdemo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@Value("${coach.name}")
	private String coachName;
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "coachname:" + coachName + " teamname: " + teamName;
	}
	
	//expose  "/" that return "Helloworld"
	
	@GetMapping("/")
	public String hello() {
		return "HelloWorld! Time on server is "+ LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a 5km";
	}
	
}
