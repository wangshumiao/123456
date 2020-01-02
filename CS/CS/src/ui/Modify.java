package ui;

import java.util.*;

import entity.*;
import data.*;

public class Modify {
	private static Scanner in;
	
	
	//课程修改（退选）
	public static void modify(String id,String number) throws Exception{
		VisitCs visitcourse =VisitCs.getinstance();
	    int number2=Integer.parseInt(number);
	    HashMap<String,String> idcourse = visitcourse.getIdcs();
	    String str = idcourse.get(id);
	    String[] course = str.split(",");
	    StringBuffer strbuffer = new StringBuffer();
	    
	    for(int i=0;i<course.length;i++){
	    	if(i==number2){
	    		course[i]="0"+",";
	    		strbuffer.append(course[i]);
	    	}
	    	else{
	    		course[i]=course[i]+",";
	    		strbuffer.append(course[i]);
	    		
	    	}
	    }
	    String str3 = strbuffer.toString();
	    idcourse.put(id, str3);
	    visitcourse.update();
    }
	
	
	//个人信息修改
	public static void information(String id,String number,String information) throws Exception{
		
		HashMap<String,Student> stu=VisitStudent.getinstance().getAllStudent();
		Student stu2 = stu.get(id);
		
		if(number.equals("1")){
			stu2.setAge(information);
			stu.put(id, stu2);
		}
		else if(number.equals("2")){
			stu2.setSex(information);
			stu.put(id, stu2);
		}
		else if(number.equals("3")){
			stu2.setDepartment(information);
			stu.put(id, stu2);
		}
		VisitStudent.getinstance().update();
	}
	
	
	//个人密码修改
	public static void pwd (String id,String pwd) throws Exception{
		
		HashMap<String,Student> stu= VisitStudent.getinstance().getAllStudent();
		Student stu2= stu.get(id);
		stu2.setPwd(pwd);
		stu.put(id, stu2);
		VisitStudent.getinstance().update();
		
	}

}
