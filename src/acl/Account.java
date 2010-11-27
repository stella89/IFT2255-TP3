package acl;

import person.*;

public class Account
{

	private Person person;
	private Role role;
	
	public Account(Person person, Role role)
	{
		this.person = person;
		this.role = role;
	}
	
	public Role getRole()
	{
		return role;
	}

	public void setRole(Role role)
	{
		this.role = role;
	}

	public void setPerson(Person person)
	{
		this.person = person;
	}

	public Person getPerson()
	{
		return this.person;
	}
}
