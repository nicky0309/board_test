package com.project.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {

	@RequestMapping("/")
	public String test(Model model) {
		String name = "nikki";
		model.addAttribute("name", name);
		return "Test";
	}


}
