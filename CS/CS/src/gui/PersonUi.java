package gui;
import javax.swing.*;
import ui.*;
import java.awt.*;
import java.awt.event.*;
import data.*;
import entity.*;
public class PersonUi extends JFrame  {
     JTextField f =new JTextField (10);
     public void  guisystem (String id ){
    	 
    	 JLabel l = new JLabel ("------个人系统中心------");
    	 JLabel l1 =new JLabel ("1.选课"); 
 		 JLabel l2=new JLabel("2.退课---");
 		 JLabel l3=new JLabel("3.修改密码---");
 		 JLabel l4=new JLabel("4.修改个人信息----");
 		 JLabel l5=new JLabel("5.注销账号----");
 		 JLabel l6=new JLabel("6.查看选课结果----");
 		 JLabel l0=new JLabel("0.推出系统---");
 		 JLabel lx=new JLabel("请输入指令:");
 		JButton b1=new JButton("确认");

		b1.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					confirm(id);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JPanel p1 = new JPanel ();
		p1.add(lx);
		p1.add(f);
		p1.add(b1);
		
		
		this.add(l);
		this.add(l1);
		this.add(l2);
		this.add(l3);
		this.add(l4);
		this.add(l5);
		this.add(l6);
		this.add(l0);
		this.add(p1);
		this.setLayout(new FlowLayout(FlowLayout.CENTER,300,20) );
		this.setSize(600,600);
		this.setLocation(600,260);
		this.setTitle("个人系统界面");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
     }
     
     public void confirm (String id ) throws Exception {
    	 String str =f.getText();
    	 if(str.equals("1")) {	
			 //选课
    	Selectui s=new Selectui();
    	s.select (id);
    	 }else if(str.equals("2")) {		//退课
    		 ChangeCourse course=new ChangeCourse();
    		 	course.change(id);
    		 	 
    	 }else if(str.equals("3")) {		//修改密码
    		 	ChagePwd mo=new ChagePwd();
    		 	mo.changepwd(id);
    		 	
    	 }else if(str.equals("5")) {			//注销账号
    		 Cancel can=new Cancel();
    		 Cancel.cancel(id);
    		 JOptionPane.showMessageDialog(null,"注销成功！","提示消息",JOptionPane.WARNING_MESSAGE);
    		 Mainui m=new Mainui();
    		 m.ui();
    		 
    	 }else if(str.equals("4")) {				//修改个人信息
    		 	ChagePerson p=new ChagePerson();
    		 	p.change(id);
    		 	
    	 }else if(str.equals("0")) {				//退出系统
    		Mainui mainui=new Mainui();
    		mainui.ui();
    	 }else if(str.equals("6")) {				//查看选课结果
    		Message m=new Message();
    		m.message(id);
    	 }else {									//0以外数字，提醒
    		 JOptionPane.showMessageDialog(null,"请输入有效数字！","提示消息",JOptionPane.WARNING_MESSAGE);       
    	 }
		
	}
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     

