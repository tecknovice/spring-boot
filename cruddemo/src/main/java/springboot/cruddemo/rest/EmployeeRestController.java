package springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.cruddemo.dao.EmployeeDAO;
import springboot.cruddemo.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	private EmployeeDAO ed;
	
	//inject employee dao
	@Autowired
	public EmployeeRestController(EmployeeDAO ed) {
		this.ed = ed;
	}
	
	//expose "/employees"
	@RequestMapping("/employees")
	public List<Employee> findAll(){
		return ed.findAll();
	}
}
