/*
 * 监听事件
 */
$(document).ready(function(){
    $('#type-select').change(function(){
        if ( document.getElementById('type-select').value == 1){
            $('#type-select-text').show();
        }else{
            $('#type-select-text').hide();
        }
    })
    $('#add-styles').click(function(){
    	if($('#add-styles').is(':checked')){
    		$('#styles-text').show();
    	}else{
            $('#styles-text').hide();
        }
    })

    $('#add-color-patten').change(function(){
    	if($('#add-color-patten').is(':checked')){
    		$('#color-patten-text').show();
    	}else{
            $('#color-patten-text').hide();
        }
    })

    $('#apply-button').click(function(){
    	$('#apply-button').style.display = "block";
    })
})

function getCheckbox(input_name){
	var arr=new Array();
	$("#"+input_name+":checked").each(function(){ 
		arr.push($(this).val());//向数组中添加元素
	});
	if($("#add-"+input_name).is(':checked')){
		arr.push($("#add-"+input_name).val());//向数组中添加元素
		arr.push($("#"+input_name+"-text").val());//向数组中添加元素
	}
	str = arr.join(',');
	return str;
}

function getSelected(input_name){
	var str;
	if($("#"+input_name).val()=="1"){
		str=$("#"+input_name).val()+","+$("#"+input_name+"-text").val();
	}else{
		str=$("#"+input_name).val();
	}
	return str;
}
/**
 * 发送委托信息表单
 * @returns
 */
function sendOfferInfo(){
	var usage=$("#usage").val();
	var title=$("#title").val();
	var type=getSelected("type-select");
	var styles=getCheckbox("styles");
	var price_min=$("#price-min").val();
	var price_max=$("#price-max").val();
	var patten=getCheckbox("color-patten");
	var size_width=$("#size-width").val();
	var size_height=$("#size-height").val();
	var size_unit=$("#size-unit").val();
	var format=getCheckbox("format");
	var test_drw=$("#test-drw").val();
	var feedback=$("#feedback").val();
	var deadline=$("#deadline").val();
	var description=$("#description").val();
	
	var offerdata={'usage':usage,'title':title,'type':type,
			'styles':styles,'pricemin':price_min,'pricemax':price_max,
			'patten':patten,'sizewidth':size_width,'sizeheight':size_height,
			'sizeunit':size_unit,'format':format,'testdrw':test_drw,
			'feedback':feedback,'deadline':deadline,'description':description};
	$.ajax({
		type: "post",
		url:"../offer/addoffer.do",
		data: offerdata,
		dataType: "json",
		success: function(data){
			if(data.result=="success"){
				window.location.href = "/exchange/items/itemlist.do";
			}else{
				alert("发布失败");
			}
		},
		error: function(){
			alert("异常");
		}
	})
}