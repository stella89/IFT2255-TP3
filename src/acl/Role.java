package acl;

public class Role
{
	String name;
	
	public Role()
	{
		
	}
	
	public boolean hasPermission(String action, String object)
	{
		return true;
	}
}
