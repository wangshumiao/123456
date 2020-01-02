package ui;

import java.util.Scanner;

import data.*;
import entity.*;
public class SystemUi {
	private static Scanner in;
	public static void SystemUi(String id) throws Exception{
		System.out.println("欢迎来到学生选课系统");
		System.out.println("1---选课---");
		System.out.println("2---退选---");
		System.out.println("3---查看选课结果---");
		System.out.println("4---修改个人信息---");
		System.out.println("5---修改密码---");
		System.out.println("6---注销账号---");
		System.out.println("0---退出选课系统---");
		in = new Scanner(System.in);
		while(true){
			System.out.println("请输入选项");
			String str = in.nextLine();
			if(str.equals("1")){
				Select.select(id);
			}
			else if(str.equals("2")){
				Modify.modify(id,str);
			}
			else if(str.equals("3")){
				VisitInformation.show(id);
			}
			else if(str.equals("4")){
				Modify.information(id,str,str);
			}
			else if(str.equals("5")){
				Modify.pwd(id,str);
			}
			else if(str.equals("6")){
				Cancel.cancel(id);
			}
			else {
				System.out.println("已退出学生选课系统");
			}
		}
	}

}
