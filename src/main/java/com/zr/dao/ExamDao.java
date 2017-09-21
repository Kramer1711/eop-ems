package com.zr.dao;

import java.util.List;

import com.zr.model.Exam;

public interface ExamDao {
	/**
	 * 根据关键词实现对exam的分页查找
	 * @param key		关键词
	 * @param start		起始位置
	 * @param pageSize	该页记录行数
	 * @param examList	存exam的链表
	 * @return
	 */
	int getExamByKey(String key, int start, int pageSize,List<Exam> examList);
	
}
