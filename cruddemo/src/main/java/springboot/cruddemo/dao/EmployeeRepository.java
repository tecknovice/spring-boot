package springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	//that is spring data JPA. No need to write any code (for interface and implemented classes)
}
