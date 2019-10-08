package springboot.thymeleafdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.thymeleafdemo.dao.EmployeeRepository;
import springboot.thymeleafdemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

//	private EmployeeDAO employeeDAO;
	
//	@Autowired
//	public EmployeeServiceImpl(@Qualifier("employeeDAOJpaImpl") EmployeeDAO employeeDAO) {
//		this.employeeDAO = employeeDAO;
//	}
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAll() {
//		return employeeRepository.findAll();
		return employeeRepository.findAllByOrderByLastNameAsc();
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> result = employeeRepository.findById(id);
		Employee e = null;
		if(result.isPresent()) {
			e = result.get();
		}else {
			throw new RuntimeException("Employee ID not found");
		}
		return e;
	}

	@Override
	public void save(Employee e) {
		employeeRepository.save(e);

	}

	@Override
	public void deleteById(int id) {
		employeeRepository.deleteById(id);

	}

}
