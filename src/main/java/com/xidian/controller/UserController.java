package com.xidian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 整合jsp
 */

@Controller
public class UserController {
	@RequestMapping("/pageIndex")
	public String pageIndex() {
		return "pageIndex";
	}
}