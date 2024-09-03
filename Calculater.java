package gui;

import java.awt.Color;


import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CFrame frame=new CFrame();
	}

}

class CFrame extends JFrame{
	
	CPanel panel =new CPanel();
	CFrame()
	{
		this.add(panel);
		this.setSize(400,500);
		this.setLayout(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
	}
}
class CPanel extends JPanel implements ActionListener
{
	double n1=0;
	
	double res=0;
	boolean p=false;
	boolean s=false;
	boolean m=false;
	boolean d=false;
	boolean module=false;
	JTextField text=new JTextField();
	JPanel panel2=new JPanel();
	JLabel label=new JLabel();
	
	///numbers
	JButton num0=new JButton("0");
	JButton num1=new JButton("1");
	JButton num2=new JButton("2");
	JButton num3=new JButton("3");
	JButton num4=new JButton("4");
	JButton num5=new JButton("5");
	JButton num6=new JButton("6");
	JButton num7=new JButton("7");
	JButton num8=new JButton("8");
	JButton num9=new JButton("9");
	JButton per=new JButton("%");
	JButton dec=new JButton(".");
	JButton add=new JButton("+");
	JButton sub=new JButton("-");
	JButton mul=new JButton("x");
	JButton div=new JButton("/");
	JButton equ=new JButton("=");
	JButton del=new JButton("del");
	JButton Ac=new JButton("AC");
	JButton ps=new JButton("+/-");
	JButton NBut[][]={{Ac,del,ps,div},{num7,num8,num9,mul},{num4,num5,num6,sub},{num1,num2,num3,add},{per,num0,dec,equ}};
	
	
	CPanel()
	{
		////Action listener to numbers
		
		
		panel2.setBounds(0,30,200,400);
		
		panel2.setLayout(new GridLayout(5,4));
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i==0||j==3)
				{
					NBut[i][j].addActionListener(this);
					NBut[i][j].setPreferredSize(new Dimension(99,76));
					NBut[i][j].setBackground(new Color(46,46,46));
					NBut[i][j].setFont(new Font("Arial",Font.PLAIN,20));
					NBut[i][j].setForeground(Color.blue);
					NBut[i][j].setFocusable(false);
					panel2.add(NBut[i][j]);
				}
				else {
				NBut[i][j].addActionListener(this);
				NBut[i][j].setPreferredSize(new Dimension(99,76));
				NBut[i][j].setBackground(new Color(46,46,46));
				NBut[i][j].setFont(new Font("Arial",Font.BOLD,20));
				NBut[i][j].setForeground(Color.white);
				NBut[i][j].setFocusable(false);
				panel2.add(NBut[i][j]);
				}
			}
			
		}
		
		
		text.setPreferredSize(new Dimension(400,70));
		text.setFont(new Font("Arial",Font.PLAIN,25));
		text.setBackground(Color.black);
		text.setForeground(Color.white);
		this.add(text);
		this.add(panel2);
		this.setBounds(0,0,400,600);
		this.setBackground(Color.black);
		
	}
			
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String sn;
		try {
			/////for AllClear
				if(e.getSource()==Ac)
				{
					text.setText("");
				res=0;
				n1=0;
				
				s=false;
				p=false;
				}
				////delete
				if(e.getSource()==del)
				{
					text.setText("");
				}
///////////////////////////////////////// operations/////////////////////////////////////////////////////
				
				
			/////Addition//
				if(e.getSource()==add)
				{
				
				
				if(!text.getText().isEmpty())
				{
					sn=text.getText();
					n1=Double.parseDouble(sn);
					
				if(p)
				{
					res+=n1;
						
				}
				else if(s)
				{	
					res-=n1;
	
				}
				else if(m)
				{	
					res*=n1;
	
				}
				else if(d)
				{	
					res/=n1;
	
				}
				else if(module)
				{	
					res%=n1;
	
				}
				else {
					res=n1;
				}
				 p=true;
				 s=false;
				 m=false;
				 d=false;
				 module=false;
				
				text.setText("");
				}
				}
				
			/////Subtraction
				if(e.getSource()==sub)
				{
					
				if(!text.getText().isEmpty())
				{
					sn=text.getText();
					n1=Double.parseDouble(sn);
					
				if(p)
				{
					res+=n1;
						
				}
				else if(s)
				{	
					res-=n1;
	
				}
				else if(m)
				{	
					res*=n1;
	
				}
				else if(d)
				{	
					res/=n1;
	
				}
				else if(module)
				{	
					res%=n1;
	
				}
				else {
					res=n1;
				}
				text.setText(Double.toString(res));
				
				 s=true;
				 p=false;
				 m=false;
				 d=false;
				 module=false;
				text.setText("");
				}
				}
				////////Multiplication
				if(e.getSource()==mul)
				{
					if(!text.getText().isEmpty())
					{
						sn=text.getText();
						n1=Double.parseDouble(sn);;
						
					if(p)
					{
						res+=n1;
							
					}
					else if(s)
					{	
						res-=n1;
		
					}
					else if(m)
					{	
						res*=n1;
		
					}
					else if(d)
					{	
						res/=n1;
		
					}
					else if(module)
					{	
						res%=n1;
		
					}
					else {
						res=n1;
					}
					text.setText(Double.toString(res));
					
					 m=true;
					 p=false;
					 s=false;
					 d=false;
					 module=false;
					text.setText("");
					}
				}
				/////Division
				if(e.getSource()==div)
				{
					if(!text.getText().isEmpty())
					{
						sn=text.getText();
						n1=Double.parseDouble(sn);
						
					if(p)
					{
						res+=n1;
							
					}
					else if(s)
					{	
						res-=n1;
		
					}
					else if(m)
					{	
						res*=n1;
		
					}
					else if(d)
					{	
						res/=n1;
		
					}
					else if(module)
					{	
						res%=n1;
		
					}
					else {
						res=n1;
					}
					text.setText(Double.toString(res));
					
					 d=true;
					 p=false;
					 s=false;
					 m=false;
					 module=false;
					text.setText("");
					}
				}
				
			/////module
				if(e.getSource()==per)
				{
					if(!text.getText().isEmpty())
					{
						sn=text.getText();
						n1=Double.parseDouble(sn);
						
					if(p)
					{
						res+=n1;
							
					}
					else if(s)
					{	
						res-=n1;
		
					}
					else if(m)
					{	
						res*=n1;
		
					}
					else if(d)
					{	
						res/=n1;
		
					}
					else if(module)
					{	
						res%=n1;
		
					}
					else {
						res=n1;
					}
					text.setText(Double.toString(res));
					
					 module=true;
					 p=false;
					 s=false;
					 d=false;
					 d=false;
					text.setText("");
					}
				}
				
				
			/////Equal to
				if(e.getSource()==equ)
				{
					sn=text.getText();
					n1=Double.parseDouble(sn);
					if(!text.getText().isEmpty())
					{
					if(p)
					{
						res+=n1;
							
					}
					else if(s)
					{	
						res-=n1;
		
					}
					else if(m)
					{	
						res*=n1;
		
					}
					else if(d)
					{	
						res/=n1;
		
					}
					else if(module)
					{	
						res%=n1;
		
					}
					else {
						res=n1;
					}
					
					text.setText(Double.toString(res));
					
					 p=false;
					 s=false;
					 m=false;
					 d=false;
					 module=false;
				}
					
				}
/////////////////////////////////////////////////////////////////////////////////////////////////////////	
				if(e.getSource()==dec)
				{
					
					text.setText(text.getText()+dec.getText());
				}

				if(e.getSource()==num0)
				{
				
				text.setText(text.getText()+num0.getText());
				
				}
				if(e.getSource()==num1)
				{
				
				text.setText(text.getText()+num1.getText());
				
				}
				if(e.getSource()==num2)
				{
				
				text.setText(text.getText()+num2.getText());
				
				}
				if(e.getSource()==num3)
				{
				
				text.setText(text.getText()+num3.getText());
				}
				if(e.getSource()==num4)
				{
				
				text.setText(text.getText()+num4.getText());
				}
				if(e.getSource()==num5)
				{
				text.setText(text.getText()+num5.getText());
				}
				if(e.getSource()==num6)
				{
				
				text.setText(text.getText()+num6.getText());
				}
				if(e.getSource()==num7)
				{
				
				text.setText(text.getText()+num7.getText());
				}
				if(e.getSource()==num8)
				{
				
				text.setText(text.getText()+num8.getText());
				}
				if(e.getSource()==num9)
				{
				
				text.setText(text.getText()+num9.getText());
				}
				
		}
		catch(Exception e1)
		{
			text.setText("Clear the Screen !!");
			
		}
}
}
				
				

		


    
	

