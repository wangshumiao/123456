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
    	 
    	 JLabel l = new JLabel ("------����ϵͳ����------");
    	 JLabel l1 =new JLabel ("1.ѡ��"); 
 		 JLabel l2=new JLabel("2.�˿�---");
 		 JLabel l3=new JLabel("3.�޸�����---");
 		 JLabel l4=new JLabel("4.�޸ĸ�����Ϣ----");
 		 JLabel l5=new JLabel("5.ע���˺�----");
 		 JLabel l6=new JLabel("6.�鿴ѡ�ν��----");
 		 JLabel l0=new JLabel("0.�Ƴ�ϵͳ---");
 		 JLabel lx=new JLabel("������ָ��:");
 		JButton b1=new JButton("ȷ��");

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
		this.setTitle("����ϵͳ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
     }
     
     public void confirm (String id ) throws Exception {
    	 String str =f.getText();
    	 if(str.equals("1")) {	
			 //ѡ��
    	Selectui s=new Selectui();
    	s.select (id);
    	 }else if(str.equals("2")) {		//�˿�
    		 ChangeCourse course=new ChangeCourse();
    		 	course.change(id);
    		 	 
    	 }else if(str.equals("3")) {		//�޸�����
    		 	ChagePwd mo=new ChagePwd();
    		 	mo.changepwd(id);
    		 	
    	 }else if(str.equals("5")) {			//ע���˺�
    		 Cancel can=new Cancel();
    		 Cancel.cancel(id);
    		 JOptionPane.showMessageDialog(null,"ע���ɹ���","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);
    		 Mainui m=new Mainui();
    		 m.ui();
    		 
    	 }else if(str.equals("4")) {				//�޸ĸ�����Ϣ
    		 	ChagePerson p=new ChagePerson();
    		 	p.change(id);
    		 	
    	 }else if(str.equals("0")) {				//�˳�ϵͳ
    		Mainui mainui=new Mainui();
    		mainui.ui();
    	 }else if(str.equals("6")) {				//�鿴ѡ�ν��
    		Message m=new Message();
    		m.message(id);
    	 }else {									//0�������֣�����
    		 JOptionPane.showMessageDialog(null,"��������Ч���֣�","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);       
    	 }
		
	}
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     

