package springHibernate;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;

public class koneksi {
    static Connection c;
    
    public static Connection connection(){
        if(c == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("belajar");
            data.setUser("root");
            data.setPassword("");
            try{
                c = (Connection) data.getConnection();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        return c;
    }
}
