package data;

import java.io.*;
import java.util.*;
public class VisitCs2 {
	
	private static VisitCs2 instance=null;
	private static Scanner in;
	private static String cs1;
	private static String cs2;
	private static String cs3;
	private static HashMap<String,String> idcs =new HashMap<String,String>();
	
	private static LineNumberReader lr;
	private static FileReader fr;
	private static FileWriter fw;
	
	private VisitCs2() throws Exception {
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
	
	public static VisitCs2 getinstance() throws Exception{
		if(instance==null){
			synchronized(VisitCs2.class){
				if(instance==null){
					instance=new VisitCs2();
				}
			}
		}
		return instance;
	}
	public   void  cs(String  id) throws Exception{
		 
		StringBuffer strbuffer=new StringBuffer();
		strbuffer.append(id+",");
		System.out.println("��ӭ����ѡ��ϵͳ");
		System.out.println("����Ϊ��ѡ��γ�---����ѡ������ѧ��");
		System.out.println("1--��ɢ��ѧ");
		System.out.println("2--��ѧӢ��");
		System.out.println("3--�������������");
		System.out.println("4--Linux");
		System.out.println("5--��ѧ����");
		System.out.println("6--������");
		
		
		in = new Scanner(System.in);
		System.out.println("�������һ��ѧ��,�������ּ���");
		cs1 = in.nextLine();
		strbuffer.append(cs1+",");
		System.out.println("������ڶ���ѧ��,�������ּ���");
		cs2 = in.nextLine();
		strbuffer.append(cs2+",");
		System.out.println("�����������ѧ��,�������ּ���");
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
