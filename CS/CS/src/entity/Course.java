package entity;

import java.util.HashMap;

public class Course {
	private String courseNum;
	private static String course;
	private static HashMap<String,String> allcourse;
	private static Course instance=null;
	public Course(){
		allcourse =new HashMap<String,String> ();
		allcourse.put("1","�������������");
		allcourse.put("2","��ɢ��ѧ");
		allcourse.put("3","������" );
		allcourse.put("4","��ѧ����");
		allcourse.put("5","Linux" );
		allcourse.put("6","��ѧӢ��" );
		allcourse.put("0","��" );
	}
	public String getCourseNum(){
		return courseNum;
	}
	public void setCourseNum(String courseNum){
		this.courseNum=courseNum;
	}
	
	public String getCourse(){
		return course;
	}
	public void setCourse(String course){
		Course.course=course;
	}
	
	public HashMap<String, String> getAllcourse(){
		return allcourse;	
	}
	public static Course getinstance() {
		if(instance==null) {
			synchronized(Course.class){
				instance=new Course();
			}
		}
		return instance;
	}
	

}
