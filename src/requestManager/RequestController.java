package requestManager;
import java.util.List;

import acl.*;

public class RequestController extends Controller
{
	public RequestController()
	{
		
	}
	
	public void addRequest(Request request)
	{

	}
	
	public void finalizeRequest(Request request, int status)
	{
		request.setStatus(status);
		database.update(request);
	}
	
	
	/**
	 * Get a single request
	 * @return
	 */
	public Request getRequest(int requestId)
	{
		return New Request(database.getRequest(requestId));
	}
	
	/**
	 * Get a request list filtered by role type
	 * @param roleType
	 * @return
	 */
	public List<Request> getRequestsList(Role roleType)
	{

	}

	/**
	 * Assign a technician to a request
	 * @param tech
	 * @param request
	 * @return
	 */
	public void assignTech(Account tech, Request request)
	{
		request.setTech(tech.getPerson().getId());
		request.update();
	}
	
	public List<Request> generateReports()
	{
		
	}
	
	public void createRequest(Request request)
	{
		request.validate();
	}
	
	public void updateRequest(Request request)
	{
		request.update();
	}
	
	public void deleteRequest(Request request)
	{
		request.delete();
	}
	
	
}
