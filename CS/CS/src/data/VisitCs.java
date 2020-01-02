package data;

import java.io.*;
import java.util.*;
public class VisitCs {
	
	private static VisitCs instance=null;
	private static Scanner in;
	private static String cs1;
	private static String cs2;
	private static String cs3;
	private static HashMap<String,String> idcs =new HashMap<String,String>();
	
	private static LineNumberReader lr;
	private static FileReader fr;
	private static FileWriter fw;
	
	private VisitCs() throws Exception {
		getAllcs();
	}
	public  void getAllcs() throws Exception {
		 fr=new FileReader("cs.txt");
		lr=new LineNumberReader(fr);
		String str;
		while((str=lr.readLine())!=null) {
			setAllcs(str);
			
		}
	}
	public static void setAllcs(String line) {
		String[] str=line.split(",");
		idcs = new HashMap<String,String>();
		idcs.put(str[0],line);	
	}	
	
	public static VisitCs getinstance() throws Exception{
		if(instance==null){
			synchronized(VisitCs.class){
				if(instance==null){
					instance=new VisitCs();
				}
			}
		}
		return instance;
	}
	public   void  cs(String  id) throws Exception{
		 
		StringBuffer strbuffer=new StringBuffer();
		strbuffer.append(id+",");
		System.out.println("欢迎来到选课系统");
		System.out.println("以下为可选择课程---任意选择三门学科");
		System.out.println("1--离散数学");
		System.out.println("2--大学英语");
		System.out.println("3--面向对象程序设计");
		System.out.println("4--Linux");
		System.out.println("5--大学物理");
		System.out.println("6--概率论");
		
		
		in = new Scanner(System.in);
		System.out.println("请输入第一门学科,输入数字即可");
		cs1 = in.nextLine();
		strbuffer.append(cs1+",");
		System.out.println("请输入第二门学科,输入数字即可");
		cs2 = in.nextLine();
		strbuffer.append(cs2+",");
		System.out.println("请输入第三门学科,输入数字即可");
		cs3 = in.nextLine();
		strbuffer.append(cs3+","+"\n");
		
		String str=strbuffer.toString();
		idcs.put(id,str);
		update();
	}
	public  void update() throws Exception {
		StringBuffer strbuffer=new StringBuffer();
		fw=new FileWriter("cs.txt");
		Set<String> keys=idcs.keySet();
		for(String key:keys) {
			String css=idcs.get(key);
			String[] cs=css.split(",");
			strbuffer.append(cs[0]+","+
							cs[1]+","+
							cs[2]+","+
							cs[3]+","+"\n"
					);
		}
			 
			fw.write(strbuffer.toString() );
			fw.close();
		}
		
	
	public  String  getCs(String id){
		String str=idcs.get(id);
		///////////////////////////////////////////////  
	//	System.out.println(str);
		return str;
	}
	
	public  HashMap<String, String> getIdcs() {
		return idcs;
	}
	
	
}
