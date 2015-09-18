import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import connection.ConnectionUtil;

public class Assignment3 {

	public static void main(String[] args) {

		executeQueryUsingStatement();

		System.out.println("\nExiting . . .");
	}

	/* execute query using statement */
	public static void executeQueryUsingStatement() {

		String query = "DELETE from b Using books AS b WHERE b.accession_no IN (SELECT accession_no FROM book_issue WHERE ((DATEDIFF(NOW(),issue_date))>=360)) "
				+ "OR  NOT EXISTS(SELECT bi.issue_date FROM Book_Issue bi WHERE bi.accession_no=b.accession_no ORDER BY bi.issue_date);;";

		Connection con = null;
		ResultSet rs = null;
		Statement stmt = null;

		ConnectionUtil connectionUtil = new ConnectionUtil();
		con = connectionUtil.getConnection();
		try {
			stmt = con.createStatement();
			int flag = stmt.executeUpdate(query);
			System.out.println("\nNO OF Records Deleted : "+flag);

		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
