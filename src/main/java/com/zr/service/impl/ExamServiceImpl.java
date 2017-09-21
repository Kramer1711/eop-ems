package com.zr.service.impl;

import java.util.LinkedList;
import java.util.List;

import com.zr.dao.ExamDao;
import com.zr.dao.impl.ExamDaoImpl;
import com.zr.model.Exam;
import com.zr.service.ExamService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ExamServiceImpl implements ExamService {
	ExamDao examDao = new ExamDaoImpl();

	@Override
	public JSONObject getExamByKey(String key, int currentPage, int pageSize) {
		JSONObject json = new JSONObject();
		List<Exam> examList = new LinkedList<>();
		//count是记录总数即json中的total
		int count = examDao.getExamByKey(key, (currentPage - 1) * pageSize, pageSize, examList);
		json.put("total", count);
		JSONArray examsJson = new JSONArray();
		for (Exam ee : examList) {
			//rows数组
			JSONObject exam = new JSONObject();
			exam.put("examId", ee.getE_id());
			exam.put("examName", ee.getE_name());
			int length = ee.getE_endtime().length();
			exam.put("examTime", ee.getE_starttime()+" - "+ee.getE_endtime().substring(length-8, length));
			exam.put("examTotal", ee.getE_total());
			exam.put("examState", ee.getE_state());
			examsJson.add(exam);
		}
		json.put("rows", examsJson);
		return json;
	}

}
