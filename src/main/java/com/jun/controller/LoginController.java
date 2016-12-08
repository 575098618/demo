package com.jun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Author: jun
 * 
 */
@Controller
public class LoginController {

	@RequestMapping("/login")
	public String login(HttpSession session, String username, String password) throws Exception {
		// 调用 service 层验证登录
		// ...

		// 模拟登录成功
		session.setAttribute("username", username);
		return "redirect:/items/query_items";
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception {
		// Invalidates this session then unbinds any objects bound to it.
		session.invalidate();
		// 重定向到登录页面 或 首页等

		return "redirect:/items/query_items";
	}
}