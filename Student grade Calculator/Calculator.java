import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
	    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
		void window() {
			JFrame jf=new JFrame();
			
		    JLabel l0=new JLabel("Student Grade Calculator");
			l0.setFont(new Font("Lucida Sans", Font.BOLD, 24));
			l0.setForeground(Color.blue);
		    l0.setBounds(140, 20, 340, 50);
		    jf.add(l0);
			
			JLabel l1=new JLabel("Math ");
			l1.setBounds(60, 90, 150, 50);
			l1.setFont(new Font("Lucida Sans", Font.BOLD, 14));
			l1.setForeground(Color.black);
			jf.add(l1);
			JLabel l2=new JLabel("Physics ");
			l2.setBounds(60, 140, 150, 50);
			l2.setFont(new Font("Lucida Sans", Font.BOLD, 14));
			l2.setForeground(Color.black);
			jf.add(l2);
			JLabel l3=new JLabel("Chemistry ");
			l3.setBounds(60, 190, 150, 50);
			l3.setFont(new Font("Lucida Sans", Font.BOLD, 14));
			l3.setForeground(Color.black);
			jf.add(l3);
			JLabel l4=new JLabel("Biology ");
			l4.setBounds(60,240, 150, 50);
			l4.setFont(new Font("Lucida Sans", Font.BOLD, 14));
			l4.setForeground(Color.black);
			jf.add(l4);
			JLabel l5=new JLabel("English ");
			l5.setBounds(60, 290, 150, 50);
			l5.setFont(new Font("Lucida Sans", Font.BOLD, 14));
			l5.setForeground(Color.black);
			jf.add(l5);
			JLabel l6=new JLabel("Computer");
			l6.setBounds(60, 340, 150, 50);
			l6.setFont(new Font("Lucida Sans", Font.BOLD, 14));
			l6.setForeground(Color.black);
			jf.add(l6);
			
			
			t1=new JTextField();
			t1.setBounds(140, 95, 80, 40);
			t1.setFont(new Font("Lucida Sans", Font.BOLD, 14));
			t1.setForeground(Color.black);
			jf.add(t1);
			t2=new JTextField();
			t2.setBounds(140, 145, 80, 40);
			t2.setFont(new Font("Lucida Sans", Font.BOLD, 14));
			t2.setForeground(Color.black);
			jf.add(t2);
			t3=new JTextField();
			t3.setBounds(140, 195, 80, 40);
			t3.setFont(new Font("Lucida Sans", Font.BOLD, 14));
			t3.setForeground(Color.black);
			jf.add(t3);
			t4=new JTextField();
			t4.setBounds(140, 245, 80, 40);
			t4.setFont(new Font("Lucida Sans", Font.BOLD, 14));
			t4.setForeground(Color.black);
			jf.add(t4);
			t5=new JTextField();
			t5.setBounds(140, 295, 80, 40);
			t5.setFont(new Font("Lucida Sans", Font.BOLD, 14));
			t5.setForeground(Color.black);
			jf.add(t5);
			t6=new JTextField();
			t6.setBounds(140, 345, 80, 40);
			t6.setFont(new Font("Lucida Sans", Font.BOLD, 14));
			t6.setForeground(Color.black);
			jf.add(t6);
			
			JLabel l7=new JLabel("Total ");
			l7.setBounds(350, 120, 150, 50);
			l7.setFont(new Font("Lucida Sans", Font.BOLD, 14));
			l7.setForeground(Color.black);
			jf.add(l7);
			JLabel l8=new JLabel("Average ");
			l8.setBounds(350, 180, 150, 50);
			l8.setFont(new Font("Lucida Sans", Font.BOLD, 14));
			l8.setForeground(Color.black);
			jf.add(l8);
			JLabel l9=new JLabel("Grade ");
			l9.setBounds(350, 240, 150, 50);
			l9.setFont(new Font("Lucida Sans", Font.BOLD, 14));
			l9.setForeground(Color.black);
			jf.add(l9);
			
			t7=new JTextField();
			t7.setBounds(430, 125, 80, 40);
			t7.setFont(new Font("Lucida Sans", Font.BOLD, 14));
			t7.setForeground(Color.black);
			jf.add(t7);
			t8=new JTextField();
			t8.setBounds(430, 185, 80, 40);
			t8.setFont(new Font("Lucida Sans", Font.BOLD, 14));
			t8.setForeground(Color.black);
			jf.add(t8);
			t9=new JTextField();
			t9.setBounds(430, 245, 80, 40);
			t9.setFont(new Font("Lucida Sans", Font.BOLD, 14));
			t9.setForeground(Color.black);
			jf.add(t9);
			
			
			JButton b1 = new JButton("Calculate ");
			b1.setBounds(360, 335, 150, 50);
			b1.setFont(new Font("Lucida Sans", Font.BOLD, 16));
			b1.setForeground(Color.darkGray);
			jf.add(b1);
			b1.addActionListener(this);
			JButton b2 = new JButton("Clear ");
			b2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {

					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
					t7.setText("");
					t8.setText("");
					t9.setText("");
				}
				
			});
			b2.setBounds(200, 450, 100, 50);
			b2.setFont(new Font("Lucida Sans", Font.BOLD, 16));
			b2.setForeground(Color.darkGray);
			jf.add(b2);
			b2.addActionListener(this);
			JButton b3 = new JButton("Exit");
			b3.setBounds(360, 450, 100, 50);
			b3.setFont(new Font("Lucida Sans", Font.BOLD, 16));
			b3.setForeground(Color.darkGray);
			jf.add(b3);
			b3.addActionListener(this);
			
			
	        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			jf.setSize(600, 600);
			jf.setLayout(null);
			jf.setVisible(true);
		}
	public static void main(String[] args) {
		Calculator ac = new Calculator();
		ac.window();
	}
	public void actionPerformed(ActionEvent e) {
		int math,phy,chem,bio,eng,comp,tot,avg;
		String grade;
		
        
    
		math=Integer.parseInt(t1.getText());
		phy=Integer.parseInt(t2.getText());
		chem=Integer.parseInt(t3.getText());
		bio=Integer.parseInt(t4.getText());
		eng=Integer.parseInt(t5.getText());
		comp=Integer.parseInt(t6.getText());

    
		tot=math+phy+chem+bio+eng+comp;
		avg=tot/6;
		
		if(avg>=90) {
			grade="A+";
		}
		else if(avg>=80) {
			grade="A";
		}
		else if(avg>=70) {
			grade="B";
		}
		else if(avg>=60) {
			grade="C";
		}
		else if(avg>=50) {
			grade="D";
		}
		else {
			grade="F";
		}
		t7.setText(String.valueOf(tot));
		t8.setText(String.valueOf(avg));
		t9.setText(grade);
		
		if(e.getActionCommand().equals("Exit"))
		{
			System.exit(0);
		}
			
		
	}
	

}
