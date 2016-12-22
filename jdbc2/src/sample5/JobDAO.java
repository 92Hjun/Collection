package sample5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.ConnectionUtil;

/*sql문을 String말고 다른방법으로.*/
public class JobDAO {
	public ArrayList<Job> getJobsBySalary(int salary) throws Exception {
		ArrayList<Job> jobList = new ArrayList<>();
		String sql = QueryUtil.gerSql("getJobsBySalary");
		System.out.println(sql);
		Connection con = null;
		PreparedStatement pr = null;
		ResultSet rs = null;

		try {

			con = ConnectionUtil.getConnection();
			pr = con.prepareStatement(sql);
			rs = pr.executeQuery();
			pr.setInt(1, salary);
			pr.setInt(2, salary);
			
			rs = pr.executeQuery();
			while (rs.next()) {
				Job job = new Job();
				job.setId(rs.getString("job_id"));
				job.setTitle(rs.getString("job_title"));
				job.setMin(rs.getInt("min_salary"));
				job.setMax(rs.getInt("max_salary"));
				
				jobList.add(job);
			}
		} finally {

			// rs,pr,con이 null이 아닐경우에만 close();를 실행하기때문에 nullpointexception을
			// 피할수있다.
			if (rs != null)
				rs.close();
			if (pr != null)
				pr.close();
			if (con != null)
				con.close();

		}

		return jobList;
	}
}
