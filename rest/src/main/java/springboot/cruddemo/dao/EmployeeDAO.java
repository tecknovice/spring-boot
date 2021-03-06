package springboot.cruddemo.dao;

import java.util.List;

import springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {
	public List<Employee> findAll();
	public Employee findById(int id);
	public void save(Employee e);
	public void deleteById(int id);
}
