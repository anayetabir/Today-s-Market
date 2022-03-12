package Market;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Chattogram extends JFrame{
	
	JFrame f=new JFrame();
	JPanel hpanel, inputpanel;
	private JLabel imgLabel;
	private ImageIcon img1;
	private ImageIcon img2;
	private ImageIcon img3;
	private ImageIcon img4;
	private ImageIcon img5;
	private ImageIcon img6;
	private ImageIcon img7;
	private ImageIcon img8;
	private ImageIcon img9;
	
	public Chattogram () {
		

		setSize(800, 1000);
		setTitle("Today's Market");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);
		
		 hpanel = new JPanel();
	     hpanel.setBackground(Color.LIGHT_GRAY);
	     hpanel.setBounds(5,5,790,80);
	     add(hpanel);
	      
         JLabel undrTxt = new JLabel("Price name and list:");
	     undrTxt.setBounds(90, 200, 300, 50);
	     undrTxt.setFont(new Font("Arial",Font.BOLD,40));
         hpanel.add(undrTxt);
		
         inputpanel = new JPanel();
	     inputpanel.setBounds(5,90,790,1000);
	     inputpanel.setBackground(new Color(253, 213, 192));
	     inputpanel.setLayout(null);
	     add(inputpanel);
	        
	        
	    

	     img1 = new ImageIcon(getClass().getResource("Medium-Prawn1.jpg"));
			imgLabel = new JLabel(img1);
			imgLabel.setBounds(10,10,200,100);
			inputpanel.add(imgLabel);

			JLabel l1 = new JLabel("Prawn");
		     l1.setBounds(70, 110, 150, 40);
		     l1.setFont(new Font("Arial",Font.ITALIC,25));
	         inputpanel.add(l1);
	         
	         JLabel l2 = new JLabel("Price(Per kg):500 Taka");
		     l2.setBounds(50, 135, 160, 40);
		     l2.setFont(new Font("Arial",Font.ITALIC,15));
	         inputpanel.add(l2);  
	        
	         
	         
	         img2 = new ImageIcon(getClass().getResource("Rui Fish1.jpg"));
		     imgLabel = new JLabel(img2);
		     imgLabel.setBounds(270,10,200,100);
		     inputpanel.add(imgLabel);

		     JLabel l3 = new JLabel("Rui Fish");
			 l3.setBounds(310, 110, 150, 40);
			 l3.setFont(new Font("Arial",Font.ITALIC,25));
		     inputpanel.add(l3);
		         
		     JLabel l4= new JLabel("Price(Per kg):300 Taka");
			 l4.setBounds(300, 135, 160, 40);
			 l4.setFont(new Font("Arial",Font.ITALIC,15));
		     inputpanel.add(l4);  
		         
		         
		    img3 = new ImageIcon(getClass().getResource("Ilish1.jpg"));
			imgLabel = new JLabel(img3);
			imgLabel.setBounds(530,10,200,100);
			inputpanel.add(imgLabel);

			JLabel l5 = new JLabel("Ilish Fish");
	        l5.setBounds(570, 110, 150, 40);
	        l5.setFont(new Font("Arial",Font.ITALIC,25));
         inputpanel.add(l5);
      
         JLabel l6= new JLabel("Price(Per kg):600 Taka");
	        l6.setBounds(560, 135, 160, 40);
	        l6.setFont(new Font("Arial",Font.ITALIC,15));
         inputpanel.add(l6);
		         
		         
		    img4 = new ImageIcon(getClass().getResource("Chicken1.jpg"));
			imgLabel = new JLabel(img4);
			imgLabel.setBounds(10,175,200,100);
			inputpanel.add(imgLabel);

			JLabel l7 = new JLabel("Chicken");
		    l7.setBounds(70, 275, 150, 40);
		    l7.setFont(new Font("Arial",Font.ITALIC,25));
	        inputpanel.add(l7);
	         
	        JLabel l8= new JLabel("Price(Per kg):160 Taka");
		    l8.setBounds(50, 300, 160, 40);
		    l8.setFont(new Font("Arial",Font.ITALIC,15));
	        inputpanel.add(l8);
				         
				         
	        img5 = new ImageIcon(getClass().getResource("Duck1.jpg"));
			imgLabel = new JLabel(img5);
			imgLabel.setBounds(270,175,200,100);
			inputpanel.add(imgLabel);

			JLabel l9 = new JLabel("Duck");
		    l9.setBounds(310, 275, 150, 40);
		    l9.setFont(new Font("Arial",Font.ITALIC,25));
	        inputpanel.add(l9);
	         
	        JLabel l10= new JLabel("Price(Per kg):300 Taka");
		    l10.setBounds(300, 300, 160, 40);
		    l10.setFont(new Font("Arial",Font.ITALIC,15));
	        inputpanel.add(l10);
		        
         img6 = new ImageIcon(getClass().getResource("Goat1.jpg"));
			imgLabel = new JLabel(img6);
			imgLabel.setBounds(530,175,200,100);
			inputpanel.add(imgLabel);

			JLabel l11 = new JLabel("Goat");
		    l11.setBounds(570, 275, 150, 40);
		    l11.setFont(new Font("Arial",Font.ITALIC,25));
	        inputpanel.add(l11);
	         
	        JLabel l12= new JLabel("Price(Per kg):650 Taka");
		    l12.setBounds(560, 300, 160, 40);
		    l12.setFont(new Font("Arial",Font.ITALIC,15));
	        inputpanel.add(l12);
						         
						         
		    img7 = new ImageIcon(getClass().getResource("Banana1.jpg"));
			imgLabel = new JLabel(img7);
			imgLabel.setBounds(10,340,200,100);
			inputpanel.add(imgLabel);

			JLabel l13 = new JLabel("Banana");
		    l13.setBounds(70, 440, 150, 40);
		    l13.setFont(new Font("Arial",Font.ITALIC,25));
	        inputpanel.add(l13);
	         
	        JLabel l14= new JLabel("Price(Per Haley):20 Taka");
		    l14.setBounds(50, 465, 180, 40);
		    l14.setFont(new Font("Arial",Font.ITALIC,15));
	        inputpanel.add(l14);	
							        
	        
	        img8 = new ImageIcon(getClass().getResource("Onion1.jpg"));
			imgLabel = new JLabel(img8);
			imgLabel.setBounds(270,340,200,100);
			inputpanel.add(imgLabel);

			JLabel l15 = new JLabel("Onion");
		    l15.setBounds(310, 440, 150, 40);
		    l15.setFont(new Font("Arial",Font.ITALIC,25));
	        inputpanel.add(l15);
	         
	        JLabel l16= new JLabel("Price(Per kg):40 Taka");
		    l16.setBounds(300, 465, 160, 40);
		    l16.setFont(new Font("Arial",Font.ITALIC,15));
	        inputpanel.add(l16);							         
	        
		    img9 = new ImageIcon(getClass().getResource("Carrot1.jpg"));
			imgLabel = new JLabel(img9);
			imgLabel.setBounds(530,340,200,100);
			inputpanel.add(imgLabel);

			JLabel l17 = new JLabel("Carrot");
		    l17.setBounds(570, 440, 150, 40);
		    l17.setFont(new Font("Arial",Font.ITALIC,25));
	        inputpanel.add(l17);
	         
	        JLabel l18= new JLabel("Price(Per kg):120 Taka");
		    l18.setBounds(560, 465, 160, 40);
		    l18.setFont(new Font("Arial",Font.ITALIC,15));
	        inputpanel.add(l18);					         
		        					         
								  
	        
      
      JLabel undrTxt1 = new JLabel("Click back Button If You want to back previous menu!");
      undrTxt1.setBounds(180, 500, 500, 50);
      undrTxt1.setFont(new Font("Arial",Font.BOLD,15));
      inputpanel.add(undrTxt1);
      
      JButton back = new JButton("Back");
      back.setBounds(310, 550, 100, 25);
      back.setFont(new Font("Arial",Font.BOLD,15));
      inputpanel.add(back);
      
      back.addActionListener(l->{
      	
      	dispose();
      	new DiviSelection();
      	
      });
      
      JLabel undrTxt2 = new JLabel("Click log out button If You want to log out!");
      undrTxt2.setBounds(200, 570, 600, 50);
      undrTxt2.setFont(new Font("Arial",Font.BOLD,15));
      inputpanel.add(undrTxt2);
      
      JButton lout = new JButton("Log out");
      lout.setBounds(310, 620, 100, 25);
      lout.setFont(new Font("Arial",Font.BOLD,15));
      inputpanel.add(lout);
      
      lout.addActionListener(l->{
      	
      	dispose();
      	new login();
      	
      });
      
         setVisible(true);
	
	}

}
