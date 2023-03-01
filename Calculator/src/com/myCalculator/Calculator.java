package com.myCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f=new JFrame();
		
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		JButton b1=new JButton();
		b1.setText("Add");
		
		t1.setBounds(100,100,120,30);
		t2.setBounds(100,140,120,30);
		t3.setBounds(100,210,120,30);
		b1.setBounds(100,180,120,20);
		
		t3.setEditable(false);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int x=Integer.parseInt(t1.getText());
				int y=Integer.parseInt(t2.getText());
				t3.setText(Integer.toString(x+y));
				
			}
			
		});
		
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);
		
		f.setLayout(null);
		f.setTitle("My Calculator");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600,600);
		f.setVisible(true);
	}

}
