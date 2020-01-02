package gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import entity.*;
import data.*;

public class Message extends JFrame {
    String c1,c2,c3;
    public void message (String id ) throws Exception{
    	this.setLayout(new FlowLayout(FlowLayout.CENTER,300,20));
    	this.setSize(600,600);
    	this.setLocation(600,260);
    	this .setTitle("学生选课界面");
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    	
    	VisitStudent  vst =VisitStudent.getinstance();  
    	Student st = vst.getStudent(id);
    	JLabel l0 = new  JLabel("------个人信息------");
    	JLabel  l1 =new JLabel ("你的学号： "  +st.getId() );
    	JLabel l2 =new  JLabel("你的姓名："   +st.getName()  );
    	JLabel l3 =new JLabel ("你的性别： "   +st.getSex()  );
    	JLabel l4 =new JLabel ("你的年龄： "    +st.getAge() );
    	JLabel l5 =new JLabel ("你的院系： "    +st.getDepartment() );
    	JLabel l6 =new JLabel ( "------选课信息------ "    );
    	
    VisitCs vc =VisitCs.getinstance ();
    String str =(String ) vc.getCs(id);
    if (str !=null){
    	String [] c = str.split(",");
    	c1=(String ) Course.getinstance().getAllcourse().get(c[1]);
    	c2=(String ) Course.getinstance().getAllcourse().get(c[2]);
    	c3=(String ) Course.getinstance().getAllcourse().get(c[3]);
    }else
    {  
    	c1=(String ) Course.getinstance().getAllcourse().get(0);
    	c2=(String ) Course.getinstance().getAllcourse().get(0);
    	c3=(String ) Course.getinstance().getAllcourse().get(0);
    }
      JLabel  jl1 =new JLabel ("你的第一节课是:"+c1);
      JLabel  jl2 =new JLabel("你的第一节课是:"+c2);
      JLabel  jl3 =new  JLabel("你的第一节课是:"+c3);
       this.add(l0);
       this.add(l1);
       this.add(l2);
       this.add(l3);
       this.add(l4);
       this.add(l5);
       this.add(l6);
       
       this.add(jl1);
       this.add(jl2);
       this.add(jl3);
      JButton  b =new JButton("返回");
      b.addActionListener(new ActionListener ()
    		  {
    	  public void actionPerformed (ActionEvent e){
    		  PersonUi  p= new PersonUi();
    		  p.guisystem(id);
    				  }
    		  });
    	this.add(b);
    
    }
}
