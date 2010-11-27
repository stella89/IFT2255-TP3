package storage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import requestManager.*;


public class SqliteHandler implements Administration
{
	Connection conn;
	
	public SqliteHandler() throws SQLException, ClassNotFoundException
	{
		Class.forName("org.sqlite.JDBC");
		conn = DriverManager.getConnection("jdbc:sqlite:Vinit");
	}

	@Override
	public void createRequest(Request rq)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Request> retrieveRequest(String[] args)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateRequest(Request rq)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRequest(Request rq)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createComment(Comment cmt)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Comment> retrieveComment(String[] args)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateComment(Comment cmt)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteComment(Comment cmt)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createFile(File file)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<File> retrieveFile(String[] args)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateFile(File file)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFile(File file)
	{
		// TODO Auto-generated method stub
		
	}




	
	
}
