package com.salary.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object arg2) throws Exception {
		Object user=req.getSession().getAttribute("USER_SESSION_KEY");
		Object user1=req.getSession().getAttribute("USER_SESSION_KEY1");
		Object user2=req.getSession().getAttribute("USER_SESSION_KEY2");
		if (user==null) {
			System.out.println("空");
			res.sendRedirect("/SSM-Salary/loginview");
			return false;
		}
	
		return true;
	}

}
