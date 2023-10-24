package login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

 public class User {
  (1) public Connection ConectarBD(){
    (2) Connection conn = null;
    (3) try{ (4)
         (4) Class.forName("com.mysql.Driver.Manager");
         (4) String url = "jdbc::mysql://127.0.0.1/test?user=lopes&password=123";
         (4) conn = DriverManager.getConnection(url);
         } (5) catch (6) (Exception e){ } (7)
         return conn; (8)
     } (9)
        (10) public String nome="";
        (10) public boolean result=false;
        (11) public boolean verificiarUsuario(String login, String senha){
         (12) String sql ="";
           (12) Connection conn = ConectarBD();
            INSTRUÇÃO SQL
           (12) sql += "select nome from usuarios ";
           (12) sql +="where login='"+login+"' ";
           (12) sql += "and senha='"+senha+"'";
           (13) try{
               (14) Statement st = conn.createStatement();
               (14) ResultSet rs = st.executeQuery(sql);
               (15) if(rs.next()){
                   (16) result = true;
                   (16) nome = rs.getString("nome");
                } (17)
            } (18) catch (19) (Exception e){ } (20)
            (21) return result;
        }
 }
