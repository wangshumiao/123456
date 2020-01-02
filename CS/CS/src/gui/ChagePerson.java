package gui;
import data.*;
import ui.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
public class ChagePerson extends JFrame  {
      JTextField f1 =new JTextField(8);
      JTextField f2 =new JTextField(8);
      JTextField f3 =new JTextField(8);
      public void change (String id ) {
    	  this .setLayout(new FlowLayout(FlowLayout.CENTER,300,20));
    	  this.setSize(600,600);
    	  this.setLocation(600,260);
    	  this.setTitle("修改个人信息");
    	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  this.setVisible(true);
    	  JLabel l0 =new JLabel("请选择更改信息的选项");
    	  
    	  JButton b1 = new JButton ("新的信息---年龄 :");
    	  JButton b2 = new JButton ("新的信息---性别 :");
    	  JButton b3 = new JButton ("新的信息---院系: ");
    	  
    	  JPanel p1 =new JPanel ();
    	  JPanel p2 =new JPanel ();
    	  JPanel p3 =new JPanel ();
    	  
    	  p1.add(f1);
    	  p1.add(b1);
    	  
    	  p2.add(f2);
    	  p2.add(b2);
    	  
    	  p3.add(f3);
    	  p3.add(b3);
    	  
    	  this.add(l0);
    	  this.add(p1);
    	  this.add(p2);
    	  this.add(p3);
    	  
    	  b1.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String str1=f1.getText();
  				try {
  					Modify.information(id, "1",str1);
  					JOptionPane.showMessageDialog(null,"修改成功","提示消息",JOptionPane.WARNING_MESSAGE);
  					PersonUi p=new PersonUi();
  					p.guisystem(id);
  				} catch (Exception e1) {
  					// TODO Auto-generated catch block
  					e1.printStackTrace();
  				}
  			}
  		});
    	  b2.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String str2=f2.getText();
  				try {
  					Modify.information(id, "2",str2);
  					JOptionPane.showMessageDialog(null,"修改成功","提示消息",JOptionPane.WARNING_MESSAGE);
  					PersonUi person=new PersonUi();
  					person.guisystem(id);
  					
  				} catch (Exception e1) {
  					// TODO Auto-generated catch block
  					e1.printStackTrace();
  				}
  			}
  		});
    	  
    	  b3.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String str3=f3.getText();
  				try {
  					Modify.information(id, "3",str3);
  					JOptionPane.showMessageDialog(null,"修改成功","提示消息",JOptionPane.WARNING_MESSAGE);
  					PersonUi person=new PersonUi();
  					person.guisystem(id);
  				} catch (Exception e1) {
  					// TODO Auto-generated catch block
  					e1.printStackTrace();
  				}
  			}
  		});
    	  
    	  }
    	  
          }   
      







