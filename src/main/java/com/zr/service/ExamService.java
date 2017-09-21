package com.zr.service;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public interface ExamService {
	/**
	 * 根据关键词查询考试
	 * @param key		关键字
	 * @param currentPage	当前页码
	 * @param pageSize		每页行数
	 * @return	考试信息的json对象(total:总数,row:[(examName：考试名,examId:考试id,examTime:考试时间,examState：考试状态)])
	 */
	public JSONObject getExamByKey(String key,int currentPage,int pageSize);
}
