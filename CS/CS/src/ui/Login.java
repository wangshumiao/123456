package ui;

import java.util.HashMap;
import java.util.Scanner;
import entity.*;
import data.*;

public class Login {
	
	private static Scanner in;
	
	public static void login() throws Exception{
		in = new Scanner(System.in);
		System.out.println("请输入学号");
		String id = in.nextLine();
		System.out.println("请输入密码");
		String pwd = in.nextLine();
		
		VisitStudent visitstudent = VisitStudent.getinstance();	
		HashMap<String,Student> stu=visitstudent.getAllStudent();
		if(stu.containsKey(id)&&stu.get(id).getPwd().equals(pwd)){
			System.out.println("登陆成功");
			SystemUi.SystemUi(id);
		}
		else{
			System.out.println("密码错误，请重新输入");
		}
	}

}
