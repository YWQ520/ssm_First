package com.ssm_top1.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm_top1.pojo.Subjects;
import com.ssm_top1.pojo.SubjectsExample;
import com.ssm_top1.service.SubjectsService;

@Controller
public class SubjectsController {
	
	@Autowired
	private SubjectsService subjectsService;
	
	@RequestMapping("/showAll")
	public ModelAndView showAll() {
		List<Subjects> lists = subjectsService.getAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("lists", lists);
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	//获取subjectNo大于1  并且classHour大于220
	@RequestMapping("/showAll2")
	public ModelAndView showAll2() {
		SubjectsExample subjectsExample = new SubjectsExample();
		//封装条件
		com.ssm_top1.pojo.SubjectsExample.Criteria createCriteria = subjectsExample.createCriteria();
		createCriteria.andSubjectnoGreaterThan(1);
		createCriteria.andClasshourGreaterThan(220);
		
		com.ssm_top1.pojo.SubjectsExample.Criteria createCriteria2 = subjectsExample.createCriteria();
		createCriteria2.andSubjectnameLike("%黄%");
		subjectsExample.or(createCriteria2);
		
		List<Subjects> lists = subjectsService.getIf(subjectsExample);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("lists", lists);
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping("/add")
	public ModelAndView showAll3() {
		int addSub = subjectsService.addSub(new Subjects(0,"倚天屠龙记",650,2));
		System.out.println(addSub);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("add");
		return modelAndView;
	}
	
}
