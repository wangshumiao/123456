package DateVisit;

import Entiy.*;

public class VisitInformation {
	public static void show(String id) throws Exception{
		System.out.println("------������Ϣ------");
		VisitStudent visitstudent=VisitStudent.getinstance();
		Student stu=visitstudent.getstudent(id);
		System.out.println("���ѧ��:"+stu.getId());
		System.out.println("�������:"+stu.getName());
		System.out.println("����Ա�:"+stu.getGender());
		System.out.println("�������:"+stu.getAge());
		System.out.println("���Ժϵ:"+stu.getDepartment());
		System.out.println("------ѡ����Ϣ------");
		VisitCs visitcs=VisitCs.getinstance();
		String str=(String) visitcs.getCs(id);
		String[] cs=str.split(",");
		System.out.println("��ѡ���ĵ�һ�ſ�:"+  Cs.getinstance().getAllcs(),get(cs[1]));
		System.out.println("��ѡ���ĵڶ��ſ�:"+  Cs.getinstance().getAllcs(),get(cs[2])");
		System.out.println("��ѡ���ĵ����ſ�:"+  Cs.getinstance().getAllcs(),get(cs[3])");
		
	}

}
