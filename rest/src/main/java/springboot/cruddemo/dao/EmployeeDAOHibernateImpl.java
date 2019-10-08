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
	private EntityManager entityManager;
	
	//setup constructor injection
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
		
	@Override
	public List<Employee> findAll() {
		//get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		//create a query
		Query<Employee> query = currentSession.createQuery("from Employee",Employee.class);
		//execute query and get result list
		List<Employee> employees = query.getResultList();
		//return the result		
		return employees;
	}

	@Override
	public Employee findById(int id) {
		//get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		//get the employee
		Employee e = currentSession.get(Employee.class, id);	
		return e;
	}

	@Override
	public void save(Employee e) {
		//get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		//save the employee
		currentSession.saveOrUpdate(e);
	}

	@Override
	public void deleteById(int id) {
		//get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		//create a query
		Query<Employee> query = currentSession.createQuery("delete from Employee where id=:id");
		query.setParameter("id", id);
		query.executeUpdate();
	}
	
	

	

}
