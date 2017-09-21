<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引入主题样式 -->
<link href="${pageContext.request.contextPath }/statics/themes/default/easyui.css" rel="stylesheet">
<!-- 引入图标的样式 -->
<link href="${pageContext.request.contextPath }/statics/themes/icon.css" rel="stylesheet">
<!-- 先引入jquery -->
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery-1.9.1.js"></script>
<!-- 引入easyui.js -->
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery.easyui.min.js"></script>
<title>考试管理</title>
</head>
<script type="text/javascript">
	$(function() {
		$('#tb').datagrid({
			url : '${pageContext.request.contextPath}/search',
			pageNumber : 1,
			pageSize : 5,
			pageList : [ 1, 2 , 3, 5, 10, 15, 20 ],
			columns : [[
				{field : 'examId', title : '考试id', width : 100, align : 'center',hidden:true}, 
				{field : 'examName',title : '考试名',width : 100,align : 'center'}, 
				{field : 'examTime',title : '考试时间',width : 100,align : 'center'}, 
				{field : 'examTotal',title : '总分',width : 100,align : 'center'}, 
				{field: 'functions', title: '具有功能', width: 400,align:'center'}  
			]],
            singleSelect: true,
            fitColumns: false,  
            border: false,  
			pagination : true,
			rownumbers : true,
			fitColumns : true,
			onClickRow:function(index,row){
	        },
	    	toolbar: [{
	    		iconCls: 'icon-save',
	    		text : "保存",
	    		handler: function(){}	    			
	    	},'-',{
	    		iconCls: 'icon-cancel',
	    		text : "取消",
	    		handler: function(){alert('取消')}
	    	}]
		});
	});
</script>
<body>
	<div id='tb'></div>
</body>
</html>