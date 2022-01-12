import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN PC
 */
public class db {
public static void main(String[] arg)
    {
    String url="jdbc:derby://localhost:1527/mob";
    String user="mob";
    String pass="";
            Connection con=null;

            
        
        ResultSet res=null;
        String query="insert into  TAB(MOB,VAL,DET) values(?,?,?)";
         System.out.print("entered");
        try{
              System.out.print("entered");
            con=DriverManager.getConnection(url,user,pass);
             System.out.print("entered");
           PreparedStatement  stmt= con.prepareStatement(query);
            stmt.setString(1,"j5");
             System.out.print("entered");
             stmt.setInt(2,6500);
             stmt.setString(3,"*4GB");
             int i=stmt.executeUpdate();
            /*while(res.next())
            {
                String ITEM=res.getString("ITEM");
                int values=res.getInt("values");
                System.out.println(ITEM);
                
            }*/
             //System.out.print("entered");
             con.close();
        }
        catch(Exception e)
        {

        }


}
}

