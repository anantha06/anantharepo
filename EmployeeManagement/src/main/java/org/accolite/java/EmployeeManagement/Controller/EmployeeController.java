package org.accolite.java.EmployeeManagement.Controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.accolite.java.EmployeeManagement.Model.*;
import org.accolite.java.EmployeeManagement.Services.EmployeeManagementService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("employee")
public class EmployeeController {

	static EmployeeManagementService service= new EmployeeManagementService();
	/**
	 * Method handling HTTP GET requests. The returned object will be sent
	 * to the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Employee> getAllEmployeeDetails() {
		
		return service.getAllEmployee();
	}
	
	@GET
	@Path("{Id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployeeDetails(
			@PathParam("Id") int id) {
	
		return service.getEmployee(id);
	}
	
	

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertEmployee(Employee employee) {
		//use logging within controller functions- which is useful for debugging
		System.out.println("inserting a new employee");
		return service.insert(employee);
	}
	
	
	@POST
	public void insertEmployee(@FormParam ("id")int id,
			@FormParam("name") String name,
			@FormParam("salary") Float salary
			) {
		System.out.println("id"+id );
	}
	
	



}
