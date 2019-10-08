package springboot.thymeleafdemo.service;

import java.util.List;

import springboot.thymeleafdemo.entity.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	public Employee findById(int id);
	public void save(Employee e);
	public void deleteById(int id);
}
