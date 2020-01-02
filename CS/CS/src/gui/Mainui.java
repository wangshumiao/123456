package gui;
import javax.swing.*;
import data.*;
import entity.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
@SuppressWarnings("serial")
public class Mainui extends  JFrame {
   private JLabel l1;
   private JLabel l2 ;
   JTextField  f=new JTextField(15);
   JPasswordField p =new JPasswordField (15);
   public void ui ( ) {
	   JButton b1 =new JButton ("登陆");
	   JButton b2 =new JButton ("退出");
	   JButton b3 =new JButton ("注册");
	   b1.addActionListener(new ActionListener(){
		   public void actionPerformed (ActionEvent e ){
			   try {
				    login();
			   } catch (Exception e1){
				   
				    e1.printStackTrace();
			   }
		   }
	   });
	   b2.addActionListener(new ActionListener(){
		   public void actionPerformed (ActionEvent  e){
			   System.exit(0);
		   }
	   });
	  b3.addActionListener (new ActionListener (){
		  public void actionPerformed (ActionEvent e){
			  GRegister r =new GRegister ();
			  r.register();
		  }
	  });
	  JPanel p1 =new JPanel ();
	  JPanel p2 =new JPanel ();
	  JPanel p3 =new JPanel ();
	   
	    l1 =new JLabel ("学号：");
	    l2 =new JLabel ("密     码:");
	    
	    p1.add(l1);
	    p1.add(f);
	    
	    p2.add (l2);
	    p2.add(p);
	    
	    p3.add(b1);
	    p3.add(b2);
	    p3.add(b3);
	    this.add(p1);
	    this.add(p2);
	    this.add(p3);
	    
	    this.setLayout(new FlowLayout(FlowLayout.CENTER,300,20));
	    this.setSize(600,600);
	    this.setLocation(600,260);
	    this.setTitle ("登录页面");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
   }
   
   public void login () throws Exception{
	   String id =f.getText();
	   String pwd =p.getText();
	   VisitStudent vt = VisitStudent.getinstance();
	 HashMap<String,Student> stu =vt.getAllStudent ();
	 if(stu.containsKey(id)&&stu.get(id).getPwd().equals(pwd)){
		   JOptionPane.showMessageDialog(null,"登陆成功","提示信息",JOptionPane.WARNING_MESSAGE);
		   dispose();
		   this.setVisible(false);
		   PersonUi p =new PersonUi ();
		   p.guisystem(id);
	   }else{
		   JOptionPane.showMessageDialog(null, "登录错误，请重新登录!","提示信息",JOptionPane.WARNING_MESSAGE);
		   
	   }
   }
}







