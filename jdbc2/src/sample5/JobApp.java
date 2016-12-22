package sample5;

public class JobApp {
	public static void main(String[] args) throws Exception{
		JobDAO dao = new JobDAO();
		dao.getJobsBySalary(30000);
		
		
	}
}
