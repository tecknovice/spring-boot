package springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springboot.thymeleafdemo.model.Employee;

@Controller	
@RequestMapping("/employees")
public class EmployeeController {

	private List<Employee> employees;
	
	@PostConstruct
	private void loadData() {
		Employee e1 = new Employee(1, "Hung", "Nguyen", "tecknovice@gmail.com");
		Employee e2 = new Employee(2, "Kevin", "Nguyen", "kevin@gmail.com");
		Employee e3 = new Employee(3, "John", "Doe", "john.doe@gmail.com");
		
		employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("employees", employees);
		return "list";
	}
}
