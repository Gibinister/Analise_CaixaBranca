package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/**
 * This classe is used to connect to the database and check if the user is registered.
 */
public class User {
     /**
     * This method is used to connect to the database.
     * @return conn
     */
    public Connection ConectarBD(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.Driver.Manager");
            String url = "jdbc::mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        }catch (Exception e){ }
        return conn;
    }
        public String nome="";
        public boolean result=false;
         /**
         * This method is used to check if the user is registered.
         * @param login  the user login
         * @param senha the user password
         * @return result of user
         */
        public boolean verificiarUsuario(String login, String senha){
            String sql ="";
            Connection conn = ConectarBD();
            //INSTRUÇÃO SQL
            sql += "select nome from usuarios ";
            sql +="where login='"+login+"' ";
            sql += "and senha='"+senha+"'";
            try{
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                if(rs.next()){
                    result = true;
                    nome = rs.getString("nome");
                }
            }catch (Exception e){ }
            return result;
        }
}
