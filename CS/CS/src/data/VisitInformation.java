package data;

 import entity.*;

  public class VisitInformation {
 	public static void show(String id) throws Exception{
 		System.out.println("------������Ϣ------");
 		VisitStudent visitstudent=VisitStudent.getinstance();
 		Student stu=visitstudent.getStudent(id);
 		System.out.println("���ѧ��:"+stu.getId());
 		System.out.println("�������:"+stu.getName());
 		System.out.println("����Ա�:"+stu.getSex());
 		System.out.println("�������:"+stu.getAge());
 		System.out.println("���Ժϵ:"+stu.getDepartment());
 		System.out.println("------ѡ����Ϣ------");
 		VisitCs visitcs=VisitCs.getinstance();
 		String str=(String) visitcs.getCs(id);
 		String[] cs=str.split(",");
 		System.out.println("��ѡ���ĵ�һ�ſ�:"+  Course.getinstance().getAllcourse().get(cs[1]));
 		System.out.println("��ѡ���ĵڶ��ſ�:"+  Course.getinstance().getAllcourse().get(cs[2]));
 		System.out.println("��ѡ���ĵ����ſ�:"+  Course.getinstance().getAllcourse().get(cs[3]));

  	}

  }