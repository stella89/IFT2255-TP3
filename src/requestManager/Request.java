package requestManager;

import java.sql.ResultSet;
import java.util.Date;
import storage.*;

import acl.Account;

public class Request
{
	private Account author;
	private Account tech;
	private int id;
	private int status;
	private String subject;
	private String description;
	private Date creationDate;
	
	public Request()
	{
		
	}
	
	public Request(ResultSet data)
	{

	}
	
	public boolean validate()
	{
		return true;
	}
	
	/* 
	 * ----------------------------------------
	 * 		GETTER / SETTER
	 * ----------------------------------------
	 */

	public Account getAuthor()
	{
		return author;
	}

	public void setAuthor(Account author)
	{
		this.author = author;
	}

	public Account getTech()
	{
		return tech;
	}

	public void setTech(Account tech)
	{
		this.tech = tech;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getStatus()
	{
		return status;
	}

	public void setStatus(int status)
	{
		this.status = status;
	}

	public String getSubject()
	{
		return subject;
	}

	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public Date getCreationDate()
	{
		return creationDate;
	}

	public void setCreationDate(Date creationDate)
	{
		this.creationDate = creationDate;
	}
}
