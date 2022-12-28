/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author prame
 */
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    private String user ;
    private String pwd ; //password koneksi database, tidak ada maka kosong
    private String host ;
    private String db ; //ganti dan isi dgn nama database
    private String url;
    private Statement  st  = null;
    private Connection con = null;
    private ResultSet  rs  = null;
    
    public Koneksi(){
        user = "root";
        pwd  = "";
        host = "localhost";
        db   = "akademik";
        url  = "jdbc:mysql//localhost/akademik";
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Ada kesalahan Driver JDBC " + "tidak barhasil Load");
        }
        try{
            url = "jdbc:mysql://"+host+"/"+db;
            con = (Connection) DriverManager.getConnection(url,user,pwd);
//            JOptionPane.showMessageDialog(null, "Driver Terhubung.");
        }
        catch (SQLException se){
            JOptionPane.showMessageDialog(null, "Perintah salah.");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Driver tidak Terhubung");
        }
    }
    
    public ResultSet getData(String SQLString){
        try {
            st = (Statement) con.createStatement();
            rs = st.executeQuery(SQLString);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(),
                                          "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }
    
    public void query(String SQLString){
        int hsl;
        try{
            st  = (Statement) con.createStatement();
            hsl = st.executeUpdate(SQLString);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(),
                                          "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
