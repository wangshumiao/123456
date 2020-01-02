package ui;

import java.util.HashMap;
import data.*;
import entity.*;
public class Cancel {
	public static void cancel (String id)throws Exception{
		
		HashMap<String,Student> stu= VisitStudent.getinstance().getAllStudent();
		stu.remove(id);
		VisitStudent.getinstance().update();
		HashMap<String,String> idcourse = VisitCs.getinstance().getIdcs();
		idcourse.remove(id);
		VisitCs.getinstance().update();
	}

}
