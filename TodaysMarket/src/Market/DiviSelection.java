package Market;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class DiviSelection extends JFrame {
	    
	   JFrame f=new JFrame();
	   JPanel hpanel, inputpanel;
	
	  public DiviSelection(){
		  setSize(500, 460);
		  setTitle("Today's Market");
		  setLocationRelativeTo(null);
		  setDefaultCloseOperation(3);
		  setLayout(null);
			
			  hpanel = new JPanel();
		      hpanel.setBackground(Color.LIGHT_GRAY);
		      hpanel.setBounds(5,5,490,60);
		      add(hpanel);
		      
		      JLabel undrTxt = new JLabel("Choose you Option?");
		      undrTxt.setBounds(90, 200, 300, 50);
		      undrTxt.setFont(new Font("Arial",Font.BOLD,30));
		      hpanel.add(undrTxt);
		        
		        inputpanel = new JPanel();
		        inputpanel.setBounds(5,70,490,425);
		        inputpanel.setBackground(new Color(26, 66, 139));
		        inputpanel.setLayout(null);
		        add(inputpanel);
		        
		        
		        JButton d = new JButton("Dhaka");
		        d.setBounds(200, 10, 110, 30);
		        d.setFont(new Font("Arial",Font.BOLD,12));
		        inputpanel.add(d);
		        
		        d.addActionListener(l->{
		        	
		        	dispose();
		        	new Dhaka();
		        });
		        
		        JButton s = new JButton("Sylhet");
		        s.setBounds(200, 45, 110, 30);
		        s.setFont(new Font("Arial",Font.BOLD,12));
		        inputpanel.add(s);
		        
               s.addActionListener(l->{
		        	
		        	dispose();
		        	new Sylhet();
		        });
		        
		        JButton c = new JButton("Chattogram");
		        c.setBounds(200, 80, 110, 30);
		        c.setFont(new Font("Arial",Font.BOLD,12));
		        inputpanel.add(c);
		        
                c.addActionListener(l->{
		        	
		        	dispose();
		        	new Chattogram();
		        });
		        
		        JButton b = new JButton("Barishal");
		        b.setBounds(200, 115, 110, 30);
		        b.setFont(new Font("Arial",Font.BOLD,12));
		        inputpanel.add(b);
		         
                b.addActionListener(l->{
		        	
		        	dispose();
		        	new Barishal();
		        });
 
 
		        JButton raj = new JButton("Rajshahi");
		        raj.setBounds(200, 150, 110, 30);
		        raj.setFont(new Font("Arial",Font.BOLD,12));
		        inputpanel.add(raj);
		        
               raj.addActionListener(l->{
		        	
		        	dispose();
		        	new Rajshahi();
		        });
		        
		        JButton k = new JButton("Khulna");
		        k.setBounds(200, 185, 110, 30);
		        k.setFont(new Font("Arial",Font.BOLD,12));
		        inputpanel.add(k);
		        
               k.addActionListener(l->{
		        	
		        	dispose();
		        	new Khulna();
		        });
		        
		        JButton ran = new JButton("Rangpur");
		        ran.setBounds(200, 220, 110, 30);
		        ran.setFont(new Font("Arial",Font.BOLD,12));
		        inputpanel.add(ran);
		        
	            ran.addActionListener(l->{
			        	
			        	dispose();
			        	new Rangpur();
			        });
		        
		        JButton m = new JButton("Mymensingh");
		        m.setBounds(200, 255, 110, 30);
		        m.setFont(new Font("Arial",Font.BOLD,12));
		        inputpanel.add(m);
		        
	            m.addActionListener(l->{
			        	
			        	dispose();
			        	new Mymensingh();
			        });

			
			
			
	      
	      
	      setVisible(true);
	  
		  
		  
		  
		  
		  
		  
		  
	  }
	
	
	

}
