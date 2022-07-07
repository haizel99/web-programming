package du.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import du.user.dao.UserDAO;
import du.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public boolean isLogin(String userId, String userPw) throws Exception {
		if(!StringUtils.hasText(userId) || !StringUtils.hasText(userPw)) {
			throw new RuntimeException();
		}
		
		String pwd = userDAO.selectPwd(userId);
		if(userPw.equals(pwd)) {
			return true;
		}
		
		return false;
	}

}
