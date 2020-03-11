$(document).ready(function(){
    $('#regi-password-again').change(function(){
        if ( $("#regi-password-again").val() !== $("#regi-password").val()){
        	$('#regi-password-again')[0].style.border="1px solid red";
        }else{
        	$('#regi-password-again')[0].style.border="1px solid green";
        }
    })
})

function login(){
	var useraccount=$("#useraccount").val();
	var password=$("#password").val();
	$.ajax({
		type: "post",
		url:"./login.do",
		data: {"useraccount":useraccount,"password":password},
		dataType: "json",
		success: function(data){
			if(data.result=="success"){
				alert("登录成功");
				window.location.href = "/exchange/items/itemlist.do";
			}else{
				alert("登录失败");
			}
		},
		error: function(){
			alert("异常");
		}
	})
}

function register(){
	var email=$("#regi-email").val();
	var username=$("#regi-name").val();
	var password=$("#regi-password").val();
	$.ajax({
		type: "post",
		url:"./register.do",
		data: {"email":email,"username":username,"password":password},
		dataType: "json",
		success: function(data){
			if(data.result=="success"){
				window.location.href = "/exchange/items/itemlist.do";
			}else{
				alert("登录失败");
			}
		},
		error: function(){
			alert("异常");
		}
	})
}