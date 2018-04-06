package naracka;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class myapplet extends JApplet{
	
	
	JPanel prv,vtor,main;
	public void init(){
	   prv=new JPanel();
	   prv.setLayout(new GridLayout(6,1));
	   prv.setBorder(new TitledBorder("Лични Податоци"));
	   JLabel l1=new JLabel("Име:");
	   JTextField tx1=new JTextField();
	   JLabel l2=new JLabel("Презиме:");
	   JTextField tx2=new JTextField();
	   JLabel l3=new JLabel("Емаил:");
	   JTextField tx3=new JTextField();
	   prv.add(l1);
	   prv.add(tx1);
	   prv.add(l2);
	   prv.add(tx2);
	   prv.add(l3);
	   prv.add(tx3);
	   getContentPane().add(prv);
	   
	   vtor=new JPanel();
	   vtor.setLayout(new GridLayout(2,3));
	   vtor.setBorder(new TitledBorder("Избор"));
	   String []s={" ","Капка","Вселенски Каубојци","Лавирнтниот тркач","Луси","Еквилајзер"};
	   JComboBox<String> ch1=new JComboBox<String>(s);
	   String []s1={" ","Deep Purple","Мајкл Џексон","Led Zeppelin","Џеси Џеј","Гери Мур","The Beatles"};
	   JComboBox<String>ch2=new JComboBox<String>(s1);
	   String []s2={" ","Ролекс","Свач","Касио","Ситизен","Марвин","Дизел"};
	   JComboBox<String> ch3=new JComboBox<String>(s2);
	   String []s3={" ","Дел","Асус","Леново","HP","Епл"};
	   JComboBox<String> ch4=new JComboBox<String>(s3);
	   String []s4={" ","Игра на Гладните","Гордост и предрасуди","Одвеано со ветерот","Животинска фарма","Кодот на Да Винчи"};
	   JComboBox<String> ch5=new JComboBox<String>(s4);
	   vtor.add(ch1);
	   vtor.add(ch2);
	   vtor.add(ch3);
	   vtor.add(ch4);
	   vtor.add(ch5);
	   getContentPane().add(vtor);
	   
	   JPanel kopce=new JPanel();
	   kopce.setLayout(new BorderLayout());
	   JButton naracaj=new JButton("Нарачај");
	   kopce.add(naracaj,BorderLayout.SOUTH);
	   getContentPane().add(kopce);
	   
	   JPanel centar=new JPanel();
	   centar.setLayout(new GridLayout(2,1));
	   centar.add(prv);
	   centar.add(vtor);
	   getContentPane().add(centar);
	   
	   main=new JPanel();
	   main.setLayout(new BorderLayout());
	   main.add(centar,BorderLayout.CENTER);
	   main.add(kopce,BorderLayout.SOUTH);
	   getContentPane().add(main);
	   
	   
	   naracaj.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String s=" ";
			s+=tx1.getText();
			s+=" ";
			s+=tx2.getText();
			s+=" со емаил: ";
			s+=tx3.getText();
			s+=" нарача ";
			s+=ch1.getSelectedItem();
			s+=" ";
			s+=ch2.getSelectedItem();
			s+=" ";
			s+=ch3.getSelectedItem();
			s+=" ";
			s+=ch4.getSelectedItem();
			s+=" ";
			s+=ch5.getSelectedIndex();
			JOptionPane.showMessageDialog(null, s);
		}
	});
	}
}
