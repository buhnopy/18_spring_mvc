package com.spring.mvc.dataTransfer.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.spring.mvc.dataTransfer.dto.MemberDto;
import com.sun.javafx.collections.MappingChange.Map;


@Controller
public class Ex {

	@RequestMapping(value="/#" , method=RequestMethod.GET)
	public String exexex(Model model) {
		
		List<MemberDto> memberList = new ArrayList<>();
		MemberDto memberDto = new MemberDto();
		memberDto.setEmail("#");
		memberList.add(memberDto);
		
		model.addAttribute("memberList", memberList);		
		return "#";
	}
	
	@RequestMapping(value="/#" , method=RequestMethod.GET)
	public ModelAndView modelEx() {
		
		ModelAndView mv = new ModelAndView("transfer");
		List<MemberDto> memberList = new ArrayList<>();
		mv.addObject("memberList", memberList);
		return mv;
	}
	
	@RequestMapping(value="/#" , method=RequestMethod.GET)
	public String ecece1(HttpServletRequest request) {
		List<MemberDto> memberList = new ArrayList<>();
		request.setAttribute("memberList", memberList);
		
		return "#";
	}
	
	@RequestMapping(value="/#" , method=RequestMethod.GET)
	public ResponseEntity<Object> entity() {
		String data = "";
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type" , "text/html; charset=UTF-8");
		return new ResponseEntity<Object>(data , header , HttpStatus.OK);
	}
	
	@RequestMapping(value="/#" , method=RequestMethod.GET)
	public @ResponseBody String ertre1() {
		
		String data = "";
		return data;
	}
	
	@RequestMapping(value="/#" , method=RequestMethod.GET)
	public String ewrw(HttpServletRequest request) {
		
		return "home";
	}
	
	@RequestMapping(value="/#" , method=RequestMethod.GET)
	public String erwr(@ModelAttribute MemberDto memberDto) {
		
		return "home";
	}
	
	@RequestMapping(value="/#" , method=RequestMethod.GET)
	public String werwe(@RequestParam Map<String , Object> memberMap) {
		
		return "home";
	}
	
	@RequestMapping(value="/#" , method=RequestMethod.GET)
	public String werr(@RequestParam(name="#" , defaultValue="#") String memberName) {
		return "home";
	}
	
	@RequestMapping(value="/transfer/{isMember}/{isSession}" , method=RequestMethod.GET)
	public String qwre(@PathVariable String isMember) {
		
		return "home";
	}
 	
	
	
	
}

@RestController
class erewr {
	
	public String ertre() {
			
			String data = "";
			return data;
	}
}



