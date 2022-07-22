package org.col;
import org.staff.Staff;
import org.stu.Student;
public class College {
	public void colegeName() {
		System.out.println("MIT University");
	}
	public static void main(String[] args) {
		College col = new College();
		Student stu = new Student();
		Staff stf = new Staff();
		col.colegeName();
		stu.stuId();
		stu.stuName();
		stu.stuDept();
		stf.stfId();
		stf.stfName();
		stf.stfDept();
	}
}