package du.user.dao.Impl;

import org.springframework.stereotype.Repository;

import du.user.dao.UserDAO;
import du.user.domain.UserVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository("userDAO")
public class UserDAOImpl extends EgovAbstractMapper implements UserDAO {

	@Override
	public UserVO selectUserInfo(String userId) {

		return selectOne("userDAO.selectUserInfo",userId);
	}

	@Override
	public String selectPwd(String userId) {

		return selectOne("userDAO.selectPwd",userId);
	}

}
 