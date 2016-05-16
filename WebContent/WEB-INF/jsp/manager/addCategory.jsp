<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<script >


$(function(){
	
	$("#addCategoryForm").off();
	$("#addCategoryForm").on("submit",function(){
	
	alert("success");
	
	return false;
	});
	
	
});

</script>


<h1>添加栏目</h1>
<hr>
<div align="center">
	<form action="addCategory.action" method="post">
		<font color="red"  size="+3">
			<div align="center">栏目名字：<input type="text" name="name"  /><br/>
			栏目编号：<input type="text" name="code"/><br/>
			<input type="submit"  id="addCategoryForm" value="添加"  />
		</font>
	</form>
</div>
