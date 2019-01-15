package dao;
import java.sql.*;
import java.util.*;
public class BaseDao {
      //����������t����ݿ�
	public Connection getcon() throws ClassNotFoundException, SQLException{
		//阿斯顿飞
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con=DriverManager.getConnection("jdbc:mysql://172.28.250.127:3306/ecmis?useUnicode=true&amp;characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull","queryer","queryer.12");
//		Connection con=DriverManager.getConnection("jdbc:mysql://172.28.250.133:3306/ecmis?useUnicode=true&amp;characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull","root","123456");
//		Connection con=DriverManager.getConnection("jdbc:mysql://10.99.1.8:3306/dlmis?useUnicode=true&amp;characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull","dlmis","dlmis.SAND");
//		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bsd?useUnicode=true&amp;characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull","root","root");
		
		//DB2
//		Class.forName("com.ibm.db2.jcc.DB2Driver");
//		Connection con=DriverManager.getConnection("jdbc:db2://172.28.250.75:50001/scs","scs_read","qawsedrf");
		//DB2
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection con=DriverManager.getConnection("jdbc:sqlserver://192.168.3.67:1433;DatabaseName=keyuan;sendStringParametersAsUnicode=false;","hujie","9sBn7xy9");
		return con;
	}
       //�ر���ݿ�t�ӳ���
	public void CloseAll(Connection con,PreparedStatement pst,ResultSet res){
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pst!=null){
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(res!=null){
			try {
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


}
