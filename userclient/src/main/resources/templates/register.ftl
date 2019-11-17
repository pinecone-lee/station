<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>火车购票系统</title>
<link type="text/css" rel="stylesheet" href="css/zhuce.css" />
</head>
<body>
${alert!}
<!--head-->
   <div class="header">
   		<div class="inner">
   			<div class="logo">
                <a><img src="images/gdpu.png" width="350" height="60"/></a>
   			</div>
   			<div class="headlink">
   				<a >火车购票系统</a>
   				&nbsp;|&nbsp;
   				<a href="/">登录</a>
   			</div>
   		</div>
   </div>
<!--head end-->
<!--middle-->
<div class="middle">
   <div class="cont">
   <!--填写-->
     <ul>
        <li>
        <span class="user_t" style="box-shadow:0px 0px 5px 4px #fff; ">
        </span>填写
        </li>
        <li><span class="user_y"></span>验证</li>
        <li><span class="user_z"></span>注册成功</li>
     </ul>
     
     <div class="user">
     <h3>用户注册</h3>
 <form method="post" action="/reg.check" name="f1" id="f1">
     <input type="hidden" name="check" id="check" value="${check!'0'}"/>
     <div class="input">
         <label>账号</label><input value="${account!}" maxlength="8" placeholder="请输入账号"  autocomplete="off" type="text" name="account" id="account" />&nbsp;<span class="t6"></span></div>
     <div class="input">
         <label>姓名</label><input value="${name!}" maxlength="6" placeholder="请输入姓名"  autocomplete="off" type="text" name="name" id="name" />&nbsp;<span class="t5"></span></div>
     <div class="input">
         <label>性别</label><input value="${sex!}" maxlength="1" placeholder="请输入性别（男/女）"  autocomplete="off" type="text" name="sex" id="sex" />&nbsp;<span class="t4"></span></div>
     <div class="input">
         <label>手机号</label><input value="${phone!}" maxlength="11" placeholder="请输入手机号"  autocomplete="off" type="text" name="phone" id="phone" />&nbsp;<span class="t"></span></div>
     <div class="input">
         <label>身份证号</label><input value="${idc!}" maxlength="18" placeholder="请输入身份证号"  autocomplete="off" type="text" name="idc" id="idc" />&nbsp;<span class="t3"></span></div>
     <div class="input">
         <label style="letter-spacing:15px">密码</label><input maxlength="20" value="${pwd!}" placeholder="8-20位字母、数字和符号" type="password" name="pw" id="pw" />&nbsp;<span class="t1"></span><br /></div>
     <div class="input">
      <label for="pw">确认密码</label><input value="${pwd!}" maxlength="20" placeholder="再次输入密码" type="password" name="pw1" id="pw1" />&nbsp;<span class="t2"></span></div>
 
 <div class="input" id="input">
 <label></label>
 <input type="button" id="sub" class="submit" style="width:220px;" value="下一步" />
 </div>
</form> 
<br />
<a style="color:#FFC; display:block; margin-top:20px;">
注册即代表您同意我们的服务协议和隐私政策
</a>
    </div>
  <!--填写 end-->
  
  <!--验证-->
   <div class="validate">
      <h3>用户验证</h3>
      <p id="tel">请点击获取以下该账号<span style="text-decoration:underline;" id="tell"></span>的验证码,
<br />请在重新获取验证之前完成验证。注:请勿刷新页面！</p>
    <div style="padding-left:88px;">
      <input type="text" id="yz" name="yz" placeholder="区分大小写" />
      
     

      <button style=" cursor:pointer;background:#fabf1f; border:0; border-radius:5px; color:#FFF;width:100px; height:30px" onclick="document.getElementById('y_z_m').innerHTML = y_z_m();">点击获取验证码</button> <span id="y_z_m"></span>
      &nbsp;<span class="yzm"></span>
    </div>
    <div style="padding-left:88px; margin-top:50px;">
    <input type="button" id="wanc" class="wanc" style="width:220px;" autocomplete="off" value="完成注册" />
    </div>
     <div style="padding-left:88px; margin-top:50px;">
    <input type="button" id="enter" class="enter" style="width:220px;" autocomplete="off" value="返回上一层" />
    </div>
   </div>
  <!--验证 end-->
  <!--完成-->
      <div class="complete">
         
          <p><img src="images/timg.png" width="100" height="100" />恭喜您，<span id="mob"></span>，注册成功！</p>
          
          <div class="dj">点击我，登录账号！</div>
      
      
      </div>
  
  
  <!--完成 end-->
   </div>
   </div>
   
   <!--middle end-->
   
   <div class="foot">
      
     <p>
         火车购票系统
     <br>
         广东药科大学——腾科实训
     </p>
    </div>
    
</body>

<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="js/zhuce.js"></script>
</html>
