onload=function () {
	var check = $("input[name='check']").val().trim();
	var account = $("input[name='account']").val().trim();
	if(check>0) {
		// document.getElementById("sub").value = "请稍后... ...";
		$(".validate").show(200)
		$(".user").hide(200);
		document.getElementById("tell").innerHTML = account;
		$(".user_y").css("box-shadow", "0px 0px 5px 4px #fff");
	}
	if(check>1){
		$(".complete").show(200);
		$(".validate").hide(200);
		document.getElementById("mob").innerHTML=account;
		$(".user_z").css("box-shadow","0px 0px 5px 4px #fff");
	}
};
 $(".submit").click(function(){
	 var account = $("input[name='account']").val().trim();
	 var name = $("input[name='name']").val().trim();
	 var sex = $("input[name='sex']").val().trim();
	 var phone = $("input[name='phone']").val().trim();
	 var idc = $("input[name='idc']").val().trim();
	 var pw = $("input[name='pw']").val().trim();
	 var pw1 = $("input[name='pw1']").val().trim();
	 var p_name=/^[\u4e00-\u9fa5]{2,6}$/;
	 var p_sex=/^['男'|'女']$/;
	 var p_phone=/^1[34578]\d{9}$/;/*验证手机号*/
	 var p_idc = /^[1-9]\d{5}(18|19|20)\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/;
	 var p=/^.{8,20}$/;/*匹配8-20的除开空格*/

	 if(account.length<1)
	 {
		 $(".t6").html('请输入账号').css("color","#F00").css("font-size","16px");
		 alert("请输入账号");
		 return;
	 }
	 if(name.length<1)
	 {
		 $(".t5").html('请输入姓名').css("color","#F00").css("font-size","16px");
		 alert("请输入姓名");
		 return;
	 }
	 if(!p_name.test(name)/* && !patrn_1.test(username)*/)
	 {
		 $(".t5").html('×').css("color","#F00").css("font-size","25px");
		 alert("姓名格式不正确");
		 return;
	 }
	 if(sex.length<1)
	 {
		 $(".t4").html('请输入性别（男/女）').css("color","#F00").css("font-size","16px");
		 alert("请输入性别（男/女）");
		 return;
	 }
	 if(!p_sex.test(sex)/* && !patrn_1.test(username)*/)
	 {
		 $(".t4").html('×').css("color","#F00").css("font-size","25px");
		 alert("性别格式不正确");
		 return;
	 }
	 if(phone.length<1)
	 {
	 	$(".t").html('请输入手机号').css("color","#F00").css("font-size","16px");
	 	alert("请输入手机号");
	 	return;
	 }
	 if(!p_phone.test(phone)/* && !patrn_1.test(username)*/)
	 {
	 	$(".t").html('×').css("color","#F00").css("font-size","25px");
	 	alert("手机号格式不正确");
	 	return;
	 }
	 if(idc.length<1)
	 {
		 $(".t3").html('请输入身份证号').css("color","#F00").css("font-size","16px");
		 alert("请输入身份证号");
		 return;
	 }
	 if(!p_idc.test(idc)/* && !patrn_1.test(username)*/)
	 {
		 $(".t3").html('×').css("color","#F00").css("font-size","25px");
		 alert("身份证号格式不正确");
		 return;
	 }

	 if(pw.length==0)
	 {
	 	$(".t1").html('请输入密码').css("font-size","16px").css("color","red");
	 	alert("请输入密码");
	 	return;
	 }
	 if(!p.test(pw))
	 {
	 	$(".t1").html('密码格式不正确').css("font-size","16px").css("color","red");
	 	alert("密码格式不正确");
	 	return;
	 }
	 if(pw!=pw1){
	 	$(".t2").html('密码不一致,请重试！').css("font-size","16px").css("color","red");
	 }

	 else{
	 	document.getElementById('check').value=0;
		document.getElementById('f1').submit();
	 }
			
	 

   });
 
$(document).ready(function(e) {
	$(".enter").on("click",function(){
		$(".validate").hide(200);
		$(".user").show(200);
		document.getElementById("submit").value="下一步";
		 $(".user_y").css("box-shadow","none");
		});
});

<!--完成-->
 function y_z_m(){
        var arr = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'];
        var str = '';
        for(var i = 0 ; i < 4 ; i ++ )
            str += ''+arr[Math.floor(Math.random() * arr.length)];
        return str;
    }
$("#wanc").click(function(){
	   
	var account = $("input[name='account']").val().trim();
	    var yz= $("input[name='yz']").val().trim();
	    var yz1=/^['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9']{4}$/;
			if(yz.length==0){
				$(".yzm").html('请输入验证码').css("font-size","16px").css("color","red");
				return;		
				}
				if(document.getElementById("y_z_m").innerHTML!=yz){
					$(".yzm").html('请输正确入验证码').css("font-size","16px").css("color","red");
					return;	
					
					}
			if(!yz1.test(yz)){
				
				$(".yzm").html('验证码格式不正确').css("font-size","16px").css("color","red");
				return;		
				
				}
				else{
				document.getElementById('f1').submit();
				}
	
	});
$(".dj").click(function(){
	
	window.location="/";
	});
<!--完成 end-->
  
   //清空
   $("#name,#pw,#pw1,#yz").focus(function(){
   	   $(".t,.t1,.t2,.yzm").html('');
   });
