package gui;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;
import data.*;
import entity.*;
import ui.*;
public class Selectui extends JFrame  {
  JTextField f1 =new JTextField (6); 
  JTextField f2 =new JTextField (6);
  JTextField f3=new JTextField (6); 
  public void select (String id ){
	  JLabel ll=new JLabel("-----欢迎来到选课系统---");
		JLabel l0=new JLabel("以下为可选择课程---任意选择三门学科");
		JLabel l1=new JLabel("1--离散数学");
		JLabel l2=new JLabel("2--大学英语");
		JLabel l3=new JLabel("3--面向对象程序设计");
		JLabel l4=new JLabel("4--Linux");
		JLabel l5=new JLabel("5--大学物理");
		JLabel l6=new JLabel("6--概率论");
		
		this.add(ll);
		this.add(l0);
		this.add(l1);
		this.add(l2);
		this.add(l3);
		this.add(l4);
		this.add(l5);
		this.add(l6);
		JLabel ll1 =new JLabel (",请输去第一门，输入数字即可");
		JLabel ll2 =new JLabel ("请输入第二门学科，输入数字即可");
		JLabel ll3 =new JLabel ("请输入第三门学科,输入数字即可");
		JPanel p1 =new JPanel ();
		JPanel p2 =new JPanel ();
		JPanel p3 =new JPanel (); 
		
		  p1.add(ll1);
		  p1.add(f1);
		  p2.add(ll2);
		  p2.add(f2);
		  p3.add(ll3);
		  p3.add(f3);
		  
		  this.add(p1);
		  this.add(p2);
		  this.add(p3);
		  JButton b1 = new JButton ("确定");
		  this.add(b1);
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						queding(id);
						
					} catch (Exception e1) {
						
						e1.printStackTrace();
					}
				}		
		});		
			this.setLayout(new FlowLayout(FlowLayout.CENTER,300,20) );
			this.setSize(600,600);
			this.setLocation(600,260);
			this.setTitle("学生选课界面");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setVisible(true);  	  
  }
  
  public void queding(String id) throws Exception {
		VisitCs visitcourse=VisitCs.getinstance();
		HashMap<String, String> idcourse=visitcourse.getIdcs();

		StringBuffer strbufer=new StringBuffer();
		String s1=f1.getText();
		String s2=f2.getText();
		String s3=f3.getText();
		
		strbufer.append(id+",");
		strbufer.append(s1+",");
		strbufer.append(s2+",");
		strbufer.append(s3+","+'\n');
		
		String str=strbufer.toString();
		idcourse.put(id,str);
		visitcourse.update();	
		JOptionPane.showMessageDialog(null,"恭喜你,选课成功","提示消息",JOptionPane.WARNING_MESSAGE); 
		PersonUi personui=new PersonUi();
		personui.guisystem(id);
	}		
  
  
  
  
  
  
  
}
