package Market;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.util.regex.*;
import javax.swing.JOptionPane;
import java.sql.*;

public class DbConnection   {
    
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	
	public DbConnection() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/market","root","");
		     st = con.createStatement();
		  
		} catch(Exception e) {
			
			System.out.println(e);
		}
	    
	}

	
}