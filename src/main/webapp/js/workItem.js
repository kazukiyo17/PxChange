function addItem(){
	var authoridtmp=$("#author_id").val();
	var itemtitletmp=$("#item_title").val();
	var itemsubtitletmp=$("#item_subtitle").val();
	var itemdata={'authorid':authoridtmp,'itemtitle':itemtitletmp,'itemsubtitle':itemsubtitletmp};
	$.ajax({
		type: "post",
		url:"../items/additem.do",
		data: itemdata,
		dataType: "json",
		success: function(data){
			if(data.result){
				alert("发布成功");
			}else{
				alert("发布失败");
			}
		},
		error: function(){
			alert("异常");
		}
	})
}

function uploadFile(){
	var itemidtmp=$("#item_id").val();
	var self=this;//用于回显
	var formData = new FormData();
	formData.append("file_data", $("#uploadfile")[0].files[0]);
	formData.append("file_id", itemidtmp);
	$.ajax({
		url: "../items/uploadimg.do",
		type: "post",
		dataType: "json",
		cache: false,
		data: formData,
		processData: false,// 不处理数据
		contentType: false, // 不设置内容类型
		success: function(data){
			if(data.type=="success"){
				/*
				 * 返回{"url":"xxxx"}
				 */
				$(self).parent().css({
					"background-image": "url("+data.url+")"
				})
			}else{
				alert(data.msg);
			}
		},
		error: function(){
			alert("异常");
		}
	})
}
