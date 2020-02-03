package native_jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import native_jdbc.dao.EmployeeDao;
import native_jdbc.daoimpl.EmployeeDaoImpl;
import native_jdbc.ds.C3P0DataSource;
import native_jdbc.ds.DBCPDataSource;
import native_jdbc.ds.Hikari_DataSource;
import native_jdbc.ds.MySqlDataSource;
import native_jdbc.dto.Employee;

public class Main {
	public static void main(String[] args) throws SQLException {
//		EmployeeDao dao1 = new EmployeeDaoImpl();
//		EmployeeDao dao2 = new EmployeeDaoImpl();
//		System.out.println(dao1);
//		System.out.println(dao2);
		
//		for(int i=0;i<100;i++) {
//			EmployeeDao dao3 = EmployeeDaoImpl.getInstance();
//			System.out.println(dao3);
//		}
		
		EmployeeDao dao3 = EmployeeDaoImpl.getInstance();
		List<Employee> list = dao3.selectEmployeeByAll(MySqlDataSource.getConnection());
		
		for(Employee e:list) {
			System.out.println(e);
		}
		
//		hikari_connection();
//		dbcp_connection();
//		c3p0_connection();
	}

	private static void c3p0_connection() throws SQLException {
		Connection con = C3P0DataSource.getConnection();
		System.out.println(con);
	}

	private static void dbcp_connection() throws SQLException {
		Connection con = DBCPDataSource.getConnection();
		System.out.println(con);
	}

	private static void hikari_connection() {
		try (Connection con = Hikari_DataSource.getConnection();){
			System.out.println(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try (Connection con = MySqlDataSource.getConnection();){
			System.out.println(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
