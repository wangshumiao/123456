package gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import ui.*;
@SuppressWarnings("serial")
public class GRegister extends  JFrame {
     JTextField jt1=new  JTextField(10);
     JTextField jt2 =new JTextField(10);
     JTextField jt3 =new JTextField(10);
     JTextField jt4 =new JTextField(10);
     JTextField jt5 =new JTextField(10);
     JTextField jt6 =new JTextField(10);
     
     public void register   (){
    	 this.setLayout(new FlowLayout(FlowLayout.CENTER,300,20));
    	 this.setSize(600,600);
    	 this.setTitle("ѧ��ѡ��");
    	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 this.setVisible(true);
    	 JLabel l0 =new JLabel("-----��ӭ��ͬѧ-----");
    	 JLabel l1 =new JLabel("����ѧ�ţ�");
    	 JLabel l2 =new JLabel("�������룺");
    	 JLabel l3 =new JLabel("����������");
    	 JLabel l4 =new JLabel("�������䣺");
    	 JLabel l5 =new JLabel("�����Ա�");
    	 JLabel l6 =new JLabel("����ѧԺ��");
    	 
    	 JPanel p1=new JPanel();
    	 JPanel p2=new JPanel();
    	 JPanel p3=new JPanel();
    	 JPanel p4=new JPanel();
    	 JPanel p5=new JPanel();
    	 JPanel p6=new JPanel();
    	 
    	 
    	 p1.add(l1);
    	 p1.add(jt1);
    	 p2.add(l2);
    	 p2.add(jt2);
    	 p3.add(l3);
    	 p3.add(jt3);
    	 p4.add(l4);
    	 p4.add(jt4);
    	 p5.add(l5);
    	 p5.add(jt5);
    	 p6.add(l6);
    	 p6.add(jt6);
    	 
    	 
    	JButton  b1= new JButton("ȷ��");
    	b1.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e ){
    			String id=jt1.getText();
    			String pwd=jt2.getText();
    			String name =jt3.getText();
    			String sex =jt4.getText();
    			String age =jt5.getText();
    			String dt =jt6.getText();
    			try{
    				Register.register(id,pwd,name,sex,age,dt);
    				  JOptionPane.showMessageDialog(null, "��ӭ���뱾У԰","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
    				   Mainui  mu =new Mainui();
    				   mu.ui();
    			}catch(Exception e1){
    				e1.printStackTrace();
    			}
    		}
    	});
    	this.add(p1);
    	this.add(p2);
    	this.add(p3);
    	this.add(p4);
    	this.add(p5);
    	this.add(p6);
    	this.add(b1);
     }
     
     
}
