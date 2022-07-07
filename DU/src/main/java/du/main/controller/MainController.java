package du.main.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import du.user.service.UserService;

@Controller
public class MainController {
	
	private Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	private UserService userService;
	
	/*
	@RequestMapping(value="/main.do", method = RequestMethod.GET)
	public String mainPageByGet(HttpServletRequest request){
		
		logger.info(request.getQueryString());
		
		return "main.html";
	}
	*/
	
	@RequestMapping(value="/main.do", method = RequestMethod.POST)
	public String mainPageByPOST(
		@RequestParam("user_id")String userId,
		@RequestParam("user_pw")String userPw,
		HttpServletResponse response
		)throws Exception{
			
			boolean isLogin = userService.isLogin(userId,userPw);
			if(isLogin) {
				return "main.html";
			}else {
				PrintWriter out = response.getWriter();
				out.println("<script>");
				out.println("alert(아이디 또는 비밀번호가 틀렸습니다.");
				out.println("location.href='loginPage.do';");
				out.println("</script>");
				
				return null;
			}
	}
		
}
