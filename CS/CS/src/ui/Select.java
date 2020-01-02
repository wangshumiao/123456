package ui;
import data.*;
import entity.*;
public class Select {
	
	public static void select(String id) throws Exception{
		VisitCs visitcourse=VisitCs.getinstance();
		visitcourse.cs(id);
		}

}
