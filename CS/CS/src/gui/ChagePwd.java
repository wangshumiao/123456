package gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import data.*;
import entity.*;
import ui.*;
public class ChagePwd extends JFrame  {
  JPasswordField p =new JPasswordField(15);
  public void changepwd (String id ) throws Exception {
	  
	  this.setLayout(new FlowLayout(FlowLayout.CENTER,300,20) );
		this.setSize(600,600);
		this.setLocation(600,260);
		this.setTitle("ѧ��ѡ�ν���");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		JLabel l0 = new JLabel ("-----�޸������У�......------");
		JLabel l1 =new JLabel ("�����������룺");
		JButton b1 = new JButton ("ȷ��");
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String pwd=p.getText();
				try {
					Modify.pwd(id,pwd);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 JOptionPane.showMessageDialog(null,"�����޸ĳɹ���","��ʾ��Ϣ",JOptionPane.WARNING_MESSAGE);       
				PersonUi p=new PersonUi();
				p.guisystem(id);
			}
		});
		
		JPanel p1 =new JPanel ();
		p1.add(l1);
		p1.add(p);
		p1.add(b1);
		this.add(l0);
		this.add(p1);
		
		
  }
}
