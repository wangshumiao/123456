package ui;

import java.util.Scanner;

import data.*;
import entity.*;
public class SystemUi {
	private static Scanner in;
	public static void SystemUi(String id) throws Exception{
		System.out.println("��ӭ����ѧ��ѡ��ϵͳ");
		System.out.println("1---ѡ��---");
		System.out.println("2---��ѡ---");
		System.out.println("3---�鿴ѡ�ν��---");
		System.out.println("4---�޸ĸ�����Ϣ---");
		System.out.println("5---�޸�����---");
		System.out.println("6---ע���˺�---");
		System.out.println("0---�˳�ѡ��ϵͳ---");
		in = new Scanner(System.in);
		while(true){
			System.out.println("������ѡ��");
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
				System.out.println("���˳�ѧ��ѡ��ϵͳ");
			}
		}
	}

}
