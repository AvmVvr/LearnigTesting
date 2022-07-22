package org.emp;
import org.client.Client;
import org.company.Company;
import org.project.Project;


public class Employee {
	public void empName() {
		System.out.println("Emp name is Vinothraj");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		Client cli = new Client();
		Company com = new Company();
		Project pro = new Project();
		e.empName();
		cli.clientName();
		com.companyname();
		pro.projectName();
	}
}
