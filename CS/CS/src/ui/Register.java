package ui;

import entity.Student;
import data.*;
public class Register {
	public static void register(String id, String pwd,String name,String age,String sex,String department) throws Exception{
		VisitStudent visitstudent = VisitStudent.getinstance();
		Student stu =new Student();
		
		stu.setId(id);
		stu.setPwd(pwd);
		stu.setName(name);
		stu.setAge(age);
		stu.setSex(sex);
		stu.setDepartment(department);
		visitstudent.setStudent(id,stu);
	}

}
