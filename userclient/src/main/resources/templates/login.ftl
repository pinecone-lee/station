<!doctype html>
<html xmlns="http://www.w3.org/1999/html" xmlns="http://www.w3.org/1999/html">
<head>
<meta charset="utf-8">
<!--手机自适应<meta name="viewport" content="width=device,initial-scale=1.0">-->
<title>火车购票系统</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/comm.js"></script>
</head>
<body>
<!--head-->${alert!}
   <div class="header">
   		<div class="inner">
   			<div class="logo">
   <a><img src="images/gdpu.png" width="350" height="60"/></a>
   			</div>
   			<div class="headlink">
            <#--<a href="index.html">网站导航</a>-->
   				<#--&nbsp;|&nbsp;-->
   				<a>火车购票系统</a>
   				&nbsp;|&nbsp;
   				<a href="/reg">注册</a>


   			</div>
   		</div>
   </div>
   <!--head end-->
   <!--banner-->
   <div class="middle">
   <div class="cont">
   		<div class="banner">
   			<img src="images/tr.png" width="860" height="400" style="opacity:0.3"/>
   		</div>
   		<div class="loginbox">
        
   			<div class="head">
   				<a class="left" ></a>
   				<a class="left sel" >账号密码登录</a>
   				<#--<div class="bottomline"></div>-->
   			</div>
            
            <div class="ct">
            	<div class="item" id="itme">          <!--关闭记录 autocomplete="off"-->

 <#--<div class="input">-->
 <#--<label for="name">手机号</label><input placeholder="可用作登录名"  autocomplete="off" type="text" /></div>-->
 <#--<div class="input">-->
 <#--<label for="pw">验证码</label><input placeholder="动态密码" type="password"/>-->
 <#--<br />-->
 <#--</div>-->
 <#--<div class="input">-->
 <#--<label></label>-->
 <#--<input type="submit" class="submit" style="width:220px;" autocomplete="off" value="登录" />-->
 <#--</div>-->
<#--</form>-->
               </div>
            	<div class="item">
                    <form method="post" action="/log" name="myform" onsubmit="checkpost()">
            		<div class="logintip"></div>
            		<div class="inputbox">
            			<input maxlength="8" name="account" autocomplete="off" placeholder="账号" value="${account!}" />
            			<#--<a href="javascript:void(0)" class="delusername"></a>-->
            		</div>
                    <div class="inputbox">
                    	<input maxlength="20" name="pwd" type="password" placeholder="密码" />
                    </div>
                    <#--<div class="outbox">-->
	                    <#--<div class="checkbox">-->
	                    	<#--<input type="checkbox" />-->
	                    <#--</div>-->
	                    <#--下次登录-->
                    <#--</div>-->
                        <br>
                    <div class="submitBtn">
                    	<input type="submit" value="登 录"/>
                    </div>
                    <div style="margin-top:20px;">
                     <#--<a href="/reg" >立即注册</a>-->
                     <#--<a href="#" style="float:right;">忘记密码？</a>-->
                     </div>
                    </form>
            	</div>
            </div>
   		</div>
   </div> 
   </div>
    <!--banner end-->
    <div class="foot">

     <p>
         火车购票系统
     <br>
         广东药科大学——腾科实训
     </p>
    </div>
</body>
</html>
