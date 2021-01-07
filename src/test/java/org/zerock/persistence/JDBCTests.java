package org.zerock.persistence;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
	  String url="jdbc:oracle:thin:@mydb501_high?TNS_ADMIN=C:\\Users\\yeol.DESKTOP-KPJCM64\\Documents\\Wallet_mydb501";
	  String user="mydb01";
	  String password="adminAdmin12";
	  try (
		  Connection con = DriverManager.getConnection(url, user, password);
	      ) {
		  assertNotNull(con);
	  } catch (Exception e) {
		  fail(e.getMessage());
		  log.info(e);
	  }
	}

}
