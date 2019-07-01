package com.ssm_top1.service;

import java.util.List;

import com.ssm_top1.pojo.Subjects;
import com.ssm_top1.pojo.SubjectsExample;

public interface SubjectsService {
	
	/**
	 * 获得所有信息
	 * @return
	 */
	List<Subjects> getAll();
	
	/**
	 * 根据条件或的所有对象
	 * @param subjectsExample
	 * @return
	 */
	List<Subjects> getIf(SubjectsExample subjectsExample);
	
	/**
	 * 新增
	 * @param subjects
	 * @return
	 */
	int addSub(Subjects subjects);
	
}
