package data;

 import entity.*;

  public class VisitInformation {
 	public static void show(String id) throws Exception{
 		System.out.println("------个人信息------");
 		VisitStudent visitstudent=VisitStudent.getinstance();
 		Student stu=visitstudent.getStudent(id);
 		System.out.println("你的学号:"+stu.getId());
 		System.out.println("你的姓名:"+stu.getName());
 		System.out.println("你的性别:"+stu.getSex());
 		System.out.println("你的年龄:"+stu.getAge());
 		System.out.println("你的院系:"+stu.getDepartment());
 		System.out.println("------选课信息------");
 		VisitCs visitcs=VisitCs.getinstance();
 		String str=(String) visitcs.getCs(id);
 		String[] cs=str.split(",");
 		System.out.println("你选定的第一门课:"+  Course.getinstance().getAllcourse().get(cs[1]));
 		System.out.println("你选定的第二门课:"+  Course.getinstance().getAllcourse().get(cs[2]));
 		System.out.println("你选定的第三门课:"+  Course.getinstance().getAllcourse().get(cs[3]));

  	}

  }