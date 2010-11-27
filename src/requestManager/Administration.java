package requestManager;

import java.util.List;

public interface Administration
{
	void createRequest(Request rq);
	List<Request> retrieveRequest(String[] args);
	void updateRequest(Request rq);
	void deleteRequest(Request rq);
	
	void createComment(Comment cmt);
	List<Comment> retrieveComment(String[] args);
	void updateComment(Comment cmt);
	void deleteComment(Comment cmt);
	
	void createFile(File file);
	List<File> retrieveFile(String[] args);
	void updateFile(File file);
	void deleteFile(File file);
}
