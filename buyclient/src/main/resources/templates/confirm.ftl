<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>火车购票系统</title>
<link rel="stylesheet" type="text/css" href="/css/home.css" />
<script type="text/javascript" src="/js/hide.js"></script>
</head>

<body>
<!--head-->
<input type="hidden" id="show" value="m1"/>
   <div class="header">
   		<div class="inner">
   			<div class="logo">
                <a><img src="/images/gdpu.png" width="350" height="60"/></a>
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
       <#include "left.ftl">
       <#--<div class="class">-->
         <#--<ul>-->
           <#--<h3 style="color:#FFF;">栏目分类</h3>-->
           <#--<a href="#" class="net"><li>申请订票</li></a>-->
           <#--<a href="#" class="_all2"><li>火车时刻表</li></a>-->
           <#--<a href="#" class="_all3"><li>我的火车票</li></a>-->
           <#--<a href="#" class="_all4"><li>修改密码</li></a>-->
           <#--<a href="#" class="_all5"><li>联系我们</li></a>-->
         <#--</ul>-->
       <#--</div>-->
       <!--菜单 end-->
       <!--指南-->
     <div class="class_a">
      <!--申请订票-->
           <div class="all1">
             <h4 style="color:#fff">申请订票</h4>
             <form id="f" method="post" action="/user/buying">
             <table width="800" height="300" style="margin:auto; margin-top:50px; border:1px solid #FFF;" border="1" cellpadding="0" cellspacing="0" >
                 <tr>
                     <td width="120">车次：</td>
                     <td width="277.6"><input name="train" value="${train!}" style="width:250px; background:none;" type="text" readonly="readonly"/></td>
                     <td width="120">开出时刻：</td>
                     <td width="277.6"><input value="${tr.start?time!}" style="width:250px; background:none;" type="text" readonly="readonly"/></td>
                 </tr>
                 <tr>
                     <td width="120">座位类型：</td>
                     <td width="277.6"><input name="style" value="${tt.style!}" style="width:250px; background:none;" type="text" readonly="readonly"/></td>
                     <td width="120">预计用时：</td>
                     <td width="277.6"><input value="${tr.time!}" style="width:250px; background:none;" type="text" readonly="readonly"/></td>
                 </tr>
                 <tr>
                     <td width="120">出发地：</td>
                     <td width="277.6"><input value="${tr.come!}" style="width:250px; background:none;" type="text" readonly="readonly"/></td>
                     <td width="120">票价：</td>
                     <td width="277.6"><input value="${tt.price!}" style="width:250px; background:none;" type="text" readonly="readonly"/></td>
                 </tr>
                 <tr>
                     <td width="120">目的地：</td>
                     <td width="277.6"><input value="${tr.destination!}" style="width:250px; background:none;" type="text" readonly="readonly"/></td>
                     <td width="120">订购票数：</td>
                     <td width="277.6"><input name="ticket" value="${ticket!}" style="width:250px; background:none;" type="text" readonly="readonly"/></td>
                 </tr>
                 <tr>
                     <td width="120">发车日期：</td>
                     <td width="277.6"><input value="${tr.data?date!}" style="width:250px; background:none;" type="text" readonly="readonly"/></td>
                     <td width="120">总价：</td>
                     <td width="277.6"><input value="${(tt.price!0)*(ticket?number!0)}" style="width:250px; background:none;" type="text" readonly="readonly"/></td>
                 </tr>


</table>
<div class="tom" style="margin-top:20px;">
<input name="clear" style="width:80px; height:30px;" type="button" value="返回" onclick="window.history.go(-1)"/>

<input name="play" style="width:80px; height:30px; " type="submit" value="确认订票" />

</div>
<#--<span style="float:right;">注：标注*为必填项！</span>-->
</form>                     
   </div>
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
<script src="/js/jquery.min.js"></script>
<script src="/js/home.js"></script>
<script type="text/javascript" src="/js/file.js"></script>

</html>
