package com.mysite.buddy.buddy;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.RequiredArgsConstructor;


@RequestMapping("/buddy")
@RequiredArgsConstructor
@Controller
public class BuddyController {
	
	@GetMapping("/main")
	public String main() {
		return "main";
	}
	
	@GetMapping("/detail1")
	public String detail1() {
		return "detail1";
	}
	
	@GetMapping("/detail2")
	public String detail2() {
		return "detail2";
	}

}
