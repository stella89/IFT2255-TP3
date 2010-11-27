package requestManager;

import java.sql.SQLException;

import acl.Account;

import storage.SqliteHandler;

public class Controller
{
	Administration database;					// Define where the data are stored, amd handle all the database CRUD operation
	Account user;
	RequestController requestController;
	FileController fileController;
	CommentController commentController;

	public Controller(Account user) throws SQLException, ClassNotFoundException
	{
		this.database = new SqliteHandler();
		this.user = user;
		this.requestController = new RequestController();
		this.fileController = new FileController();
		this.commentController = new CommentController();
	}
	
	/**
	 * Controller which receive all the UI actions.
	 * After receiving an order to do an action on an object, it will check for user permissions, then do it 
	 * 
	 * @param action type of action to do
	 * @param object object that have to do the action
	 * @throw NoPermissionException when user doesn't have the right privilege
	 * @return an object
	 */
	public Object doAction(String action, String object)
	{
		if (user.getRole().hasPermission(action, object))
		{
			
		}
		else throw new NoPermissionException();
		
		return object;
	}
}
