import java.awt.*;  
import java.awt.event.*;  
public class Calculator
{
	static int a=0;
	static String operator;  

	public static void main(String[] args) 
	{  
    		Frame f=new Frame("Maddy's Calculator"); 
			f.setBackground(new Color(0, 0, 128));  


    		TextField t1=new TextField("");  
    		t1.setBounds(20,50, 260,50); 
			//t1.setBackground(Color.black);
		
    		Button badd=new Button("+");  
    		badd.setBounds(216,150,60,30); 
			badd.setBackground(new Color(128, 128, 128)); 
  			badd.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{  
					
					a = Integer.parseInt(t1.getText());
					operator = "+";
					t1.setText("");			
				}  
			});  


			Button bsub=new Button("-");  
    		bsub.setBounds(216,200,60,30); 
			bsub.setBackground(new Color(128, 128, 128)); 
  			bsub.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{  
					
					a = Integer.parseInt(t1.getText());
					operator = "-";
					t1.setText("");		
								
				}  
			});  


			Button bmultiply=new Button("x");  
    		bmultiply.setBounds(216,250,60,30); 
			bmultiply.setBackground(new Color(128, 128, 128)); 
  			bmultiply.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{
					
					a = Integer.parseInt(t1.getText());
					operator = "x";
					t1.setText("");
				}  
			});


			Button bdivide=new Button("/");  
    		bdivide.setBounds(216,300,60,30); 
			bdivide.setBackground(new Color(128, 128, 128)); 
  			bdivide.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{  
					
					a = Integer.parseInt(t1.getText());
					operator = "/";
					t1.setText("");
				}  
			});


			Button bequals=new Button("=");  
    		bequals.setBounds(152,300,60,30); 
			bequals.setBackground(new Color(250, 0, 0)); 
  			bequals.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{
					int b = Integer.parseInt(t1.getText());
					int result = 0;

					switch (operator) 
					{
						case "+":
							result = a+b;
							break;
						case "-":
							result = a-b;
							break;
						case "x":
							result = a*b;
							break;
						case "/":
							result = a/b;
							break;					
						default:
							break;
					}
					t1.setText(String.valueOf(result));

				}  
			});


			Button clear=new Button("CE");  
    		clear.setBounds(88,300,60,30); 
			clear.setBackground(Color.darkGray); 
  			clear.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{  
					t1.setText("0");
				}  
			});



			Button one=new Button("1");  
    		one.setBounds(24,150,60,30); 
			one.setBackground(Color.lightGray); 
  			one.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{  
					String  exp = t1.getText();
					exp += "1";
					t1.setText(exp);
				}  
			});  




			Button two=new Button("2");  
    		two.setBounds(88,150,60,30); 
			two.setBackground(Color.lightGray);
  			two.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{  
					String  exp = t1.getText();
					exp += "2";
					t1.setText(exp);  
				}  
			});  


			Button three=new Button("3");  
    		three.setBounds(152,150,60,30); 
			three.setBackground(Color.lightGray);
  			three.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{  
					String  exp = t1.getText();
					exp += "3";
					t1.setText(exp);  
				}  
			});  


			Button four=new Button("4");  
    		four.setBounds(24,200,60,30); 
			four.setBackground(Color.lightGray);
  			four.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{  
					String  exp = t1.getText();
					exp += "4";
					t1.setText(exp);  
				}  
			});  


			Button five=new Button("5");  
    		five.setBounds(88,200,60,30); 
			five.setBackground(Color.lightGray);
  			five.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{  
					String  exp = t1.getText();
					exp += "5";
					t1.setText(exp);  
				}  
			});  


			Button six=new Button("6");  
    		six.setBounds(152,200,60,30); 
			six.setBackground(Color.lightGray);
  			six.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{  
					String  exp = t1.getText();
					exp += "6";
					t1.setText(exp);  
				}  
			});  


			Button seven=new Button("7");  
    		seven.setBounds(24,250,60,30); 
			seven.setBackground(Color.lightGray);
  			seven.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{  
					String  exp = t1.getText();
					exp += "7";
					t1.setText(exp);  
				}  
			});  


			Button eight=new Button("8");  
    		eight.setBounds(88,250,60,30); 
			eight.setBackground(Color.lightGray);
  			eight.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{  
					String  exp = t1.getText();
					exp += "8";
					t1.setText(exp);  
				}  
			});  


			Button nine=new Button("9");  
    		nine.setBounds(152,250,60,30); 
			nine.setBackground(Color.lightGray);
  			nine.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{  
					String  exp = t1.getText();
					exp += "9";
					t1.setText(exp);  
				}  
			});  


			Button zero=new Button("0");  
    		zero.setBounds(24,300,60,30); 
			zero.setBackground(Color.lightGray);
  			zero.addActionListener(new ActionListener()
			{  
				public void actionPerformed(ActionEvent e)
				{  
					String  exp = t1.getText();
					exp += "0";
					t1.setText(exp); 
				}  
			});  









	    	f.add(badd);
			f.add(bsub);
			f.add(bmultiply);
			f.add(bdivide);
			f.add(bequals);
			f.add(clear);
			f.add(one);
			f.add(two);
			f.add(three);
			f.add(four);
			f.add(five);
			f.add(six);
			f.add(seven);
			f.add(eight);
			f.add(nine);
			f.add(zero);
			f.add(t1);  
    		f.setSize(300,400);  
    		f.setLayout(null);  
    		f.setVisible(true);   
//-----------------------------------------

	}  
}  