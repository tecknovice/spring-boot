package springboot.cruddemo.dao;

import java.util.List;

import springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {
	public List<Employee> findAll();
}
