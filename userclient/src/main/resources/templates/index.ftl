<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>火车购票系统</title>
<link rel="stylesheet" type="text/css" href="css/home.css" />
</head>

<body>
<!--head-->
   <div class="header">
   		<div class="inner">
   			<div class="logo">
                <a><img src="images/gdpu.png" width="350" height="60"/></a>
   			</div>
   			<div class="headlink">
   				<#--<a href="login.html">登录</a>-->
   				<#--&nbsp;|&nbsp;-->
   				<#--<a href="zhuce.html">注册</a>-->
                <#--&nbsp;|&nbsp;-->
			  <#--<a href="login.html">▶注销</a>-->
                <a>火车购票系统</a>
                &nbsp;|&nbsp;
                <a href="/logout">注销</a>
   				
   			</div>
   		</div>
   </div>
<!--head end-->
   <!--middle-->
<div class="middle">
   <div class="cont">
   <!--菜单-->
       <div class="class">
         <ul>
           <h3 style="color:#FFF;">栏目分类</h3>
           <a href="#" class="net"><li>申请订票</li></a>
           <a href="#" class="_all2"><li>火车时刻表</li></a>
           <a href="#" class="_all3"><li>我的火车票</li></a>
           <a href="#" class="_all4"><li>修改密码</li></a>
           <a href="#" class="_all5"><li>联系我们</li></a>
         </ul>
       </div>
       <!--菜单 end-->
       <!--指南-->
     <div class="class_a">
      <!--申请订票-->
           <div class="all1">
             <h4 style="color:#fff">申请订票</h4>
             <form runat="server" method="get" action="">
             <table width="800" height="300" style="margin:auto; margin-top:50px; border:1px solid #FFF;" border="1" cellpadding="0" cellspacing="0" >
  <tr>
    <td width="120">姓名:</td>
    <td width="277.6"><input style="width:250px; background:none;" type="text" /><span>*</span></td>
    <td width="120">身份证:</td>
    <td width="277.6"><input style="width:250px; background:none;" type="text" /><span>*</span></td>
  </tr>
  <tr>
    <td width="120">联系电话:</td>
     <td width="277.6"><input style="width:250px; background:none;" type="text" /><span>*</span></td>
    <td width="120">备用电话:</td>
    <td  width="277.6"><input style="width:250px; background:none;" type="text" /></td>
  </tr>
  <tr>
    <td width="120">车次:</td>
    <td width="277.6"><select  style="width:250px; background:none; border:0; outline:none; color:#CCC">
      <option>C6402</option>
      <option>G8708</option>
        <option>G8715</option>
       
    </select><span>*</span></td>
    <td width="120">起点站:</td>
    <td><input style="width:250px; background:none;" type="text" /><span>*</span></td>
  </tr>
  <tr>
    <td width="120">终点站:</td>
    <td><input style="width:250px; background:none;" type="text" /><span>*</span></td>
    <td width="120">出发日期:</td>
    <td><input  style="width:250px; background:none;" type="datetime-local" /><span>*</span></td>
  </tr>
  <tr>
    <td>备注:</td>
    <td colspan="3">
    <textarea placeholder="有需要请详细填写！" style="; color:#FFF; outline:none;resize:none;width:670px; height:70px; border:0; background:none;"   name="" cols="0" rows="0"></textarea></td>
    </tr>
</table>
<div class="tom" style="margin-top:20px;">
<input name="clear" style="width:80px; height:30px;" type="reset" value="清空" />

<input name="play" style="width:80px; height:30px; " type="submit" value="预定" />

</div>
<span style="float:right;">注：标注*为必填项！</span>
</form>                     
   </div>
  <!--申请订票 end--> 
  <!--火车时刻表-->
           <div class="all2">
           <h4 style="color:#fff">火车时刻表</h4>
        <iframe style="border:0; background:rgba(255,255,255,0.5);" scrolling="auto" src="http://www.chepiao100.com/application/views/statics/doc/demo/yupiao.php" width="1000" height="544"></iframe>
           </div>
   <!--火车时刻表--> 
    <!--我的火车票--> 
           <div class="all3">
           <h4 style="color:#fff">我的火车票</h4>
           
           </div>
         <!--我的火车票 end--> 
          <!--修改密码-->    
           <div class="all4" id="all4">
           <h4 style="color:#fff">修改密码</h4>
           </div>
           
            <!--修改密码 end--> 
             <!--联系我们--> 
           <div class="all5">
          <h4 style="color:#fff">☏&nbsp;&nbsp;联系我们</h4>
          
       
          </div>
             <!--联系我们 end--> 
         </div>
          <!--指南 end-->
   </div>
   </div>
   
   
   <!--middle end-->
<div class="foot">
      
     <p>
         火车购票系统
     <br />
         广东药科大学——腾科实训
     </p>
    </div>
<div style="text-align:center;">
<p>更多模板：<a href="http://www.mycodes.net/" target="_blank">源码之家</a></p>
</div>
</body>
<script src="js/jquery.min.js"></script>
<script src="js/home.js"></script>

</html>
