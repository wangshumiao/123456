package data;

import java.io.*;

import java.util.*;
import entity.*;

  public class VisitStudent {
 	private static VisitStudent instance=null;
 	private  HashMap<String,Student> student=new HashMap<String,Student> ();
 	private LineNumberReader lr;
 	
 	private FileReader fr;
 	
 	private FileWriter fw;

  	private VisitStudent() {
 		try {
 			getallStudent();
 		} catch (Exception e)
 		{
 			e.printStackTrace();
 		}
 		}
 	public void getallStudent() throws Exception{
 		fr=new FileReader("st.txt");
 		lr=new LineNumberReader(fr);
 		String line;
 		while((line=lr.readLine())!=null){
 			setStudent(line);
 		}
 	}
 	public void setStudent(String line){
 		String[] strs=line.split(",");
 		Student stu=new Student();
 		stu.setId(strs[0]);
 		stu.setPwd(strs[1]);
 		stu.setName(strs[2]);
 		stu.setAge(strs[3]);
 		stu.setSex(strs[4]);
 		stu.setDepartment(strs[5]);
 		student.put(stu.getId(),stu);
 	}
 	public static VisitStudent getinstance() throws Exception{
 		if(instance==null){
 			synchronized(VisitStudent.class){
 				if(instance==null){
 					instance=new VisitStudent();
 				}
 			}
 		}
 		return instance;
 	}
 	public Student getStudent(String id){
 		Student stu=(Student) student.get(id);
 		return stu;
 	}
 	public  HashMap<String,Student> getAllStudent(){
 		return student;
 	}
 	public void setStudent(String key,Student stu) throws Exception{
 		student.put(key,stu);
 		this.update();
 	}
 	public void update() throws Exception{
 		fw=new FileWriter("st.txt");
 		Set<String> keys=student.keySet();
 		StringBuffer strbuffer=new StringBuffer();
 		for(String key:keys) {
 			Student stu=student.get(key);
 			strbuffer.append(stu.getId()+","+
 			                 stu.getPwd()+","+
 					         stu.getName()+","+
 			                 stu.getAge()+","+
 					         stu.getSex()+","+
 			                 stu.getDepartment()+","+"\n"
 					         );

  		}
 		String str=strbuffer.toString();
 		fw.write(str);
 		fw.close();
 	}

  }