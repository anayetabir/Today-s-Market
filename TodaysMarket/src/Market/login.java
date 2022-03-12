package Market;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.util.regex.*;
import javax.swing.JOptionPane;
import java.sql.*;

public class login extends JFrame {
    
    JPanel hpanel, inputpanel;
    
    public login(){

        setSize(500,450);
        setTitle("Today's Market");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setLayout(null);

        hpanel = new JPanel();
        hpanel.setBackground(Color.LIGHT_GRAY);
        hpanel.setBounds(5,5,490,60);
        add(hpanel);

        JLabel headerTxt = new JLabel("LoginForm");
        headerTxt.setFont((new Font("Arial",Font.BOLD,30)));
        hpanel.add(headerTxt);

        inputpanel = new JPanel();
        inputpanel.setBounds(5,70,490,425);
        inputpanel.setBackground(new Color(199,227,240));
        inputpanel.setLayout(null);
        add(inputpanel);

        JLabel username = new JLabel("Username :");
        username.setBounds(130,5,100,25);
        username.setFont(new Font("Arial",Font.BOLD,16));
        inputpanel.add(username);
        
        JTextField userTxt = new JTextField();
        userTxt.setBounds(240, 5, 100, 25);
        inputpanel.add(userTxt);

        JLabel password = new JLabel("Password :");
        password.setBounds(130,50,100,25);
        password.setFont(new Font("Arial",Font.BOLD,16));
        inputpanel.add(password);
        
        JPasswordField passTxt = new JPasswordField();
        passTxt.setBounds(240, 50, 100, 25);
        inputpanel.add(passTxt);
        
        JButton login = new JButton("Login");
        login.setBounds(200,120,100,25);
        login.setFont(new Font("Arial",Font.BOLD,16));
        inputpanel.add(login);
        
    

       JLabel undrTxt = new JLabel("Click Registration Button If You Don't Have An Account !");
        undrTxt.setBounds(90, 200, 300, 50);
        undrTxt.setFont(new Font("Arial",Font.BOLD,10));
        inputpanel.add(undrTxt);
        
        JButton reg = new JButton("Registration");
        reg.setBounds(200, 250, 100, 25);
        reg.setFont(new Font("Arial",Font.BOLD,10));
        inputpanel.add(reg);
        
        reg.addActionListener(l->{
        	
        	dispose();
        	new registration();
        });
        
      login.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e)
      {
    	  
    	  String user = userTxt.getText();
          String pass = passTxt.getText();

          try{
              Class.forName("com.mysql.cj.jdbc.Driver");

              java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/market","root","");



              java.sql.Statement stmt = con.createStatement();
              String sql = "SELECT * FROM registration WHERE name = '"+user+"' AND password ='"+pass+"'";

              ResultSet rs = stmt.executeQuery(sql);

              if(rs.next())
              {

                  
                  JOptionPane.showMessageDialog(null, "Login Successfull");
                  new DiviSelection();

              }
              else{
                  JOptionPane.showMessageDialog(null, "Incorrect Username Or Password");
              }

          }catch(SQLException x){
              x.printStackTrace();
          }
          catch (ClassNotFoundException ex) {

          }
    	  
    	  
         



     }

  });
        
        setVisible(true);


  
    
}
    

    
   }