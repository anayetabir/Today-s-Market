package Market;
import java.awt.Color;
import java.awt.Font;
import java.util.regex.Pattern;

import javax.swing.border.LineBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
 
public class registration extends JFrame {
	
	public registration() {
		
		setSize(500, 460);
		setTitle("Today's Market");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setLayout(null);
 
		Font labelFont = ((new Font("Arial", Font.BOLD, 16)));
 
		JPanel headerpanel = new JPanel();
		headerpanel.setBackground(Color.pink);
		headerpanel.setBounds(5, 5, 490, 60);
		add(headerpanel);
 
		JLabel headerTxt = new JLabel("Registration");
		headerTxt.setFont((new Font("Arial", Font.BOLD, 30)));
		headerpanel.add(headerTxt);
 
		JPanel inputpanel = new JPanel();
		inputpanel.setBackground(new Color(142, 133, 162));
		inputpanel.setBounds(5, 70, 490, 425);
		inputpanel.setLayout(null);
		add(inputpanel);
		
		// NameField
		JLabel namelabel = new JLabel("Name :");
		namelabel.setBounds(130,50, 100, 25);
		namelabel.setFont(labelFont);
		inputpanel.add(namelabel);
 
		JTextField nameTxt = new JTextField();
		nameTxt.setBounds(200, 50, 200, 25);
		nameTxt.setFont(labelFont);
		inputpanel.add(nameTxt);
 
 
 
		// PassworsField
		JLabel passlabel = new JLabel("Password :");
		passlabel.setBounds(95, 100, 100, 25);
		passlabel.setFont(labelFont);
		inputpanel.add(passlabel);
 
		JPasswordField passTxt = new JPasswordField();
		passTxt.setBounds(200, 100, 200, 25);
		passTxt.setFont(labelFont);
		inputpanel.add(passTxt);
 
		// ConfirmPassword
		JLabel conPasslabel = new JLabel("Confirm Password :");
		conPasslabel.setBounds(30, 150, 170, 25);
		conPasslabel.setFont(labelFont);
		inputpanel.add(conPasslabel);
 
		JPasswordField conPassTxt = new JPasswordField();
		conPassTxt.setBounds(200, 150, 200, 25);
		conPassTxt.setFont(labelFont);
		inputpanel.add(conPassTxt);
 
		JButton registerBtn = new JButton("Register");
		registerBtn.setBounds(300, 200, 100, 30);
		registerBtn.setBackground(new Color(219, 143, 160));
		registerBtn.setFont(labelFont);
		registerBtn.setForeground(Color.white);
		registerBtn.setBorder(new LineBorder(Color.RED));
		inputpanel.add(registerBtn);
		
		registerBtn.addActionListener(l->{
	        	
	        	dispose();
	        	new login();
	        });
		
	    registerBtn.addActionListener(new ActionListener(){
		
		
		        public void actionPerformed(ActionEvent e)
		        {
		            String name = nameTxt.getText();
		            String pass = passTxt.getText();
		            String conpass = conPassTxt.getText();
		            
	           
		
		           String regexname = "^[a-z A-Z 0-9]+$";

		           String regexpass = "^[a-z A-Z 0-9]+$";
		            

		           
		           
		            if(!Pattern.matches(regexname, name))
		            {
		            	JOptionPane.showMessageDialog(null, "In-Valid Name! Try Again");	
		            }

		            
		            else if(!Pattern.matches(regexpass, pass))
		            {
		            	JOptionPane.showMessageDialog(null, "In-Valid password! Try Again");
		                
		            }
		            else if(!pass.equals(conpass))
		            {
		            	JOptionPane.showMessageDialog(null, "Unmatched Password! Try Again");   
		            }
		            
		            
		           else {
		

		               
		               
		               
		        	   
		                try{
		                    Class.forName("com.mysql.cj.jdbc.Driver");
		                    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/market","root","");
		                    java.sql.Statement stmt = con.createStatement();
		                    String sql = "SELECT * FROM registration WHERE name = '"+name+"'";

		                    ResultSet rs = stmt.executeQuery(sql);

		                    if(rs.next())
		                    {
		                        JOptionPane.showMessageDialog(null, "This username already exist");

		                    }
		                    else{
		                        String sql2 = "Insert into registration(name,password) Values('"+name+"','"+pass+"')";
		                        stmt.executeUpdate(sql2);
		                        JOptionPane.showMessageDialog(null , "Registered");
		                    }

		                }catch(SQLException x){
		                    x.printStackTrace();
		                }
		                catch (ClassNotFoundException ex) {

		                }       
		               
		               

		               		        
		        
		               
		               
		            }
		        }
		        
		
		    });
 
		setVisible(true);
	}
	
	
	
}
 
 