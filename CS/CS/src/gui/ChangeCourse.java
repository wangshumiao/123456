package gui;
import javax.swing.*;
import data.*;
import entity.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ui.*;
public class ChangeCourse extends JFrame  {
   public void change(String id ) throws Exception{
	   this.setLayout(new FlowLayout (FlowLayout.CENTER,300,20));
	   this.setSize(600,600);
	   this.setLocation(600,260);
	   this.setTitle("修改密码页面");
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setVisible(true);
	   JLabel l0 = new JLabel("-----请输入推选课程-----");
	   JButton b1 = new JButton ("退选");
	   JButton b2 = new JButton ("退选");
	   JButton b3 =new JButton ("退选");
	   b1.addActionListener(new ActionListener(){
		   public void actionPerformed (ActionEvent e ) {
			   try {
			         Modify.modify(id,"1");
			   } catch (Exception e1 ){
				   e1.printStackTrace();
			   }
			   JOptionPane.showConfirmDialog(null,"退课成功！","提示信息",JOptionPane.WARNING_MESSAGE);
			    PersonUi  p = new PersonUi ();
			     p.guisystem(id);
		   }
	   }); 
	   b2.addActionListener(new ActionListener (){
	   public void actionPerformed (ActionEvent e ){
		   try {
			    Modify.modify (id ,"2");
			    JOptionPane.showMessageDialog(null,"退课成功！","提示消息",JOptionPane.WARNING_MESSAGE);
			   PersonUi p =new PersonUi ();
			      p.guisystem (id);
			   
		   }catch (Exception e1 ){
			   e1.printStackTrace();
		   }
	   }
	   
   });
	   b3.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent e){
		    	try {
		    		Modify.modify(id,"3");
		    	}catch (Exception e1) {
		    		e1 .printStackTrace();
		    	}
		    }
	   }); 
	  VisitCs vt = VisitCs.getinstance ();
	  String str = (String ) vt .getCs(id);
	  String [] course = str.split(","); 
	  
	  String c1 =Course.getinstance().getAllcourse().get(course[1]);
	  String c2 =Course.getinstance().getAllcourse().get(course[2]);
	  String c3 =Course.getinstance().getAllcourse().get(course[3]);
	  JLabel l1 =new JLabel (c1);
	  JLabel l2 =new JLabel (c2);
	  JLabel l3 =new JLabel (c3);
	  
	  JPanel p1 =new JPanel ();
	  JPanel p2 =new JPanel ();
	  JPanel p3 =new JPanel ();
	  
	  
	  p1.add(l1);
	  p1.add(b1);
	  p2.add(l2);
	  p2.add(b2);
	  p3.add(l3);
	  p3.add(b3);
	  
	  
	  this.add(l0);
	  this.add(p1);
	  this.add(p2);
	  this.add(p3);
	  
	  
	  
	  
	  
   } 
	   
}
