package com.ssomwanshi.bugout.service;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import com.ssomwanshi.bugout.dao.BugDao;
import com.ssomwanshi.bugout.entity.BugIssueEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssomwanshi.bugout.enums.BugPriorityEnum;
import com.ssomwanshi.bugout.enums.BugStatusEnum;


@Service
public class BugService {
	
	@Autowired
	private BugDao bugDao;
	
	public List<BugIssueEntity> getBugs(){
		return bugDao.findAll();
	}
	
	public BugIssueEntity getById(Integer id) {
		return bugDao.findOne(id);
	}

	public BugIssueEntity add(BugIssueEntity bug) {
		bug.setCreationDate(Calendar.getInstance().getTime());
		return bugDao.save(bug);
	}

	public BugIssueEntity update(BugIssueEntity bug) {
		return bugDao.save(bug);
	}

	public void delete(Integer developerId) {
		bugDao.delete(developerId);;
	}
	
	public HashMap<Integer, String> getBugPriorityMap() {
		return (HashMap<Integer, String>) BugPriorityEnum.getMap();
	}
	
	public HashMap<Integer, String> getBugStatusMap() {
		return (HashMap<Integer, String>) BugStatusEnum.getMap();
	}

	public BugIssueEntity getBug(Integer bugId) {
		return bugDao.findOne(bugId);
	}
}
