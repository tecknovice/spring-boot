package springboot.thymeleafdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springboot.thymeleafdemo.entity.Employee;
import springboot.thymeleafdemo.service.EmployeeService;

@Controller	
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
//	@Autowired
//	public EmployeeController(EmployeeService employeeService) {
//		this.employeeService = employeeService;
//	}

	@GetMapping("/list")
	public String list(Model model) {
		List<Employee> employees = employeeService.findAll();
		model.addAttribute("employees", employees);
		return "employees/list";
	}
	
	@GetMapping("/create")
	public String getFormForCreate(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "employees/form";
	}
	
	@GetMapping("/update")
	public String getFormForUpdate(@RequestParam("id") int id, Model model) {
		Employee employee = employeeService.findById(id);
		model.addAttribute("employee", employee);
		return "employees/form";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("employee") Employee employee) {
		System.out.println("employee: " + employee);
		employeeService.save(employee);
		return "redirect:/employees/list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id, Model model) {
		employeeService.deleteById(id);
		return "redirect:/employees/list";
	}
}
