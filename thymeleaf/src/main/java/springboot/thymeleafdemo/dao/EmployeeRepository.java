package springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	//that is spring data JPA. No need to write any code (for interface and implemented classes)
	public List<Employee> findAllByOrderByLastNameAsc();
}
