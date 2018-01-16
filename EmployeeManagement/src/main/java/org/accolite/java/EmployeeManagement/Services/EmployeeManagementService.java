package org.accolite.java.EmployeeManagement.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.accolite.java.EmployeeManagement.Model.*;

public class EmployeeManagementService {
	
	static List<Employee> employeeList=new ArrayList<Employee>();
	
	public EmployeeManagementService() {
		Employee e1= new Employee();
		e1.setEmployeeId(1);
		e1.setEmployeeName("Payal");
		employeeList.add(e1);
	}
	
	public List<Employee> getAllEmployee(){
		return this.employeeList;
	}
	
	public Employee getEmployee(int Id) {
		
		Optional<Employee> matchingEmployee= employeeList.stream().filter(p ->p.getEmployeeId()==Id).findFirst();
		if(matchingEmployee.isPresent())
			return matchingEmployee.get();
		else
			return null;
	}

	public String insert(Employee employee) {
		employeeList.add(employee);
		return "Successfully inserted employee with id"+employee.getEmployeeId();
	}
	
}
