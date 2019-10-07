package springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	//define fields for entity manager
	private EntityManager em;
	
	//setup constructor injection
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager em) {
		this.em = em;
	}
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		//get the current hibernate session
		Session currentSession = em.unwrap(Session.class);
		//create a query
		Query<Employee> query = currentSession.createQuery("from Employee",Employee.class);
		//execute query and get result list
		List<Employee> employees = query.getResultList();
		//return the result		
		return employees;
	}

	

}
