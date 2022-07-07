package test;

import javax.annotation.Resource;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Test;

import du.user.dao.UserDAO;
import du.user.domain.UserVO;

public class DAOTest extends TestConfig{
	@Resource(name="userDAO")
	private UserDAO userDAO;
	
	@Test
	public void dbTest() {
		try {
			String userId = "user001";
			UserVO vo = userDAO.selectUserInfo(userId);
			
			System.out.println(ToStringBuilder.reflectionToString(vo));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
