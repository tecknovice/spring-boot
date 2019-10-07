package springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.cruddemo.entity.Employee;
import springboot.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	private EmployeeService employeeService;
	
	//inject employee service
	@Autowired
	public EmployeeRestController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	//expose "/employees"
	@RequestMapping("/employees")
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	
	@RequestMapping("/employees/{id}")
	public Employee findById(@PathVariable int id) {
		Employee e = employeeService.findById(id);
		if(e== null) {
			throw new RuntimeException("Employee Id not found");
		}
		return e;
	}
	
	@PostMapping("/employees")
	public Employee create(@RequestBody Employee e) {
		//force create new employee by assign 0 to Id
		e.setId(0);
		employeeService.save(e);
		return e;
	}
	
	@PutMapping("/employees")
	public Employee update(@RequestBody Employee e) {
		employeeService.save(e);
		return e;
	}
	
	@DeleteMapping("/employees/{id}")
	public String delete(@PathVariable int id) {
		Employee e = employeeService.findById(id);
		if(e== null) {
			throw new RuntimeException("Employee Id not found");
		}
		employeeService.deleteById(id);
		return "Deleted: " + id;
	}
}
