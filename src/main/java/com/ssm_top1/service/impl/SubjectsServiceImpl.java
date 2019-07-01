package com.ssm_top1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm_top1.mapper.SubjectsMapper;
import com.ssm_top1.pojo.Subjects;
import com.ssm_top1.pojo.SubjectsExample;
import com.ssm_top1.service.SubjectsService;

@Service
public class SubjectsServiceImpl implements SubjectsService {
	
	@Autowired
	private SubjectsMapper subjectsMapper;
	
	@Override
	public List<Subjects> getAll() {
		return subjectsMapper.selectByExample(null);
	}

	@Override
	public List<Subjects> getIf(SubjectsExample subjectsExample) {
		return subjectsMapper.selectByExample(subjectsExample);
	}

	@Override
	public int addSub(Subjects subjects) {
		return subjectsMapper.insert(subjects);
	}

}
