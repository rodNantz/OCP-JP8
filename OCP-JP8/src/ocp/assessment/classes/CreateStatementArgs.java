package ocp.assessment.classes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateStatementArgs {
	
	public void stmt(java.sql.Connection conn, int a) throws SQLException {
		/* 
		 * 2nd argument is the concurrency mode:
		 */
		Statement stmt = conn.createStatement(a, ResultSet.CONCUR_READ_ONLY);
		Statement stmt2 = conn.createStatement(a, ResultSet.CONCUR_UPDATABLE);
		
		/* 1st argument is the ResultSet type
		 */
		Statement stmt3 = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, a);
		Statement stmt4 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, a);
		Statement stmt5 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, a);
		
		// invalid constant
		// ResultSet.CONCUR_INSERTABLE;
	}
	
}
