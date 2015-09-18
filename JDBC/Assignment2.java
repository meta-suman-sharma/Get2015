import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import pojoClasses.BookIssue;
import pojoClasses.Books;
import connection.ConnectionUtil;

public class Assignment2 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter Book name and member id to issue book : ");
		String titleName = scanner.nextLine();
		String memberId = scanner.nextLine();

		executeQueryUsingPreparedStatement(titleName, memberId);
		System.out.println("\nExiting . . .");
	}

	/* execute query using prepared statement */
	public static void executeQueryUsingPreparedStatement(String titleName,
			String memberId) {

		System.out.println("\nFetching data using PreparedStatement ....");
		Connection con = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		PreparedStatement ps3 = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		ConnectionUtil connectionUtil = new ConnectionUtil();
		con = connectionUtil.getConnection();

		try {

			BookIssue bookIssue = new BookIssue();
			Books books = new Books();
			int flag = 0;
			bookIssue.setMemberId(memberId);

			String query1 = "SELECT * FROM member WHERE member_id='" + memberId
					+ "';";
			ps1 = con.prepareStatement(query1);
			boolean row = ps1.execute(query1);
			
			if (!row) {
				System.out.println("Member not Exist");
				return;
			}

			String query2 = "SELECT b.accession_no FROM books b INNER JOIN titles t ON t.title_id=b.title_id WHERE t.title_name='"
					+ titleName + "'";
			ps2 = con.prepareStatement(query2);
			rs1 = ps2.executeQuery(query2);
			if (rs1.next()){
				bookIssue.setAccessionNo(rs1.getInt(1));
			}
			else {
				System.out.println("Accession No not Exist for book "
						+ titleName);
				return;
			}

			String query3 = "SELECT status FROM books WHERE accession_no="
					+ bookIssue.getAccessionNo() + ";";
			ps3 = con.prepareStatement(query3);
			rs2 = ps3.executeQuery(query3);

			if (rs2.next())
				books.setStatus(rs2.getString(1));
			else {
				System.out.println("Book " + titleName + " not available");
				return;
			}
		
			if (books.getStatus().equals("NOT ISSUED")) {

				String mainQuery = "INSERT INTO book_issue(accession_no,member_id) "
						+ "VALUES ("
						+bookIssue.getAccessionNo()
						+ ",'"
						+ memberId
						+ "');";
				ps1 = con.prepareStatement(mainQuery);
				flag = ps1.executeUpdate();

				String query4 = "UPDATE books SET status='ISSUED' WHERE books.accession_no ="
						+ bookIssue.getAccessionNo() + ";";
				ps2 = con.prepareStatement(query4);
				ps2.executeUpdate();

				if (flag > 0)
					System.out.println("Book issued ");
				else
					System.out.println("Book for title " + titleName
							+ " not availabe");
			} else
				System.out.println("Books already issued to someone else");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (con != null) {
					con.close();
				}
				if (ps1 != null) {
					ps1.close();
				}
				if (ps2 != null) {
					ps2.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
