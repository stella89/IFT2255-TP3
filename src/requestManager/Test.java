package requestManager;
import java.sql.*;

public class Test
{

	public static void main(String[] args) throws Exception
	{
		Class.forName("org.sqlite.JDBC");
		Connection conn = DriverManager.getConnection("jdbc:sqlite:Vinit");
		Statement stat = conn.createStatement();
		stat.executeUpdate("drop table if exists school;");
		stat.executeUpdate("create table school (name, state);");
		PreparedStatement prep = conn.prepareStatement("insert into school values (?, ?);");

		prep.setString(1, "UTD");
		prep.setString(2, "texas");
		prep.addBatch();
		prep.setString(1, "USC");
		prep.setString(2, "california");
		prep.addBatch();
		prep.setString(1, "MIT");
		prep.setString(2, "massachusetts");
		prep.addBatch();

		conn.setAutoCommit(false);
		prep.executeBatch();
		conn.setAutoCommit(true);

		ResultSet rs = stat.executeQuery("select * from school;");
		while (rs.next())
		{
			System.out.print("Name of School = " + rs.getString("name") + " ");
			System.out.println("state = " + rs.getString("state"));
		}
		rs.close();
		conn.close();
	}
}