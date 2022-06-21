package jp.co.futureantiques.webapptraining.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Created by YaoHaitao on 2018/3/15.
 * @since 2018-03-15 10:26
 */

@Controller
@RequestMapping(value = "/menu")
public class MenuController {

	@RequestMapping(method = RequestMethod.GET)
	public String showMenu() {
		return "menu";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String toAssignment(String assignment) {
		return "redirect:/" + assignment;
	}
}
