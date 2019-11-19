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
${alert!}
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
             <form id="f" method="post" action="/user/confirm">
             <table width="800" height="300" style="margin:auto; margin-top:50px; border:1px solid #FFF;" border="1" cellpadding="0" cellspacing="0" >
                 <tr>
                     <td width="120">姓名：</td>
                     <td width="277.6"><input value="${user.name!}" style="width:250px; background:none;" type="text" readonly="readonly"/></td>
                     <td width="120">车次：</td>
                     <td width="277.6" colspan="2"><input value="${train!}" name="train" placeholder="请输入车次" maxlength="10" style="width:250px; background:none;" type="text" /></td>
                 </tr>
                 <tr>
                     <td width="120">性别：</td>
                     <td width="277.6"><input value="${user.sex!}" style="width:250px; background:none;" type="text" readonly="readonly"/></td>
                     <td width="120">座位类型：</td>
                     <td  width="277.6" colspan="2">
                         <select name="style" id="style" style="width:250px; background:none; border:0; outline:none; color:#CCC">
                             <option value="0" selected>——请选择——</option>
                             <option value="一等座" <#if (style!"0")=="一等座">selected</#if>>一等座</option>
                             <option value="二等座" <#if (style!"0")=="二等座">selected</#if>>二等座</option>
                             <option value="三等座" <#if (style!"0")=="三等座">selected</#if>>三等座</option>
                         </select>
                     </td>
                 </tr>
                 <tr>
                     <td width="120">手机号：</td>
                     <td width="277.6"><input value="${user.phone!}" style="width:250px; background:none;" type="text" readonly="readonly"/></td>
                     <td width="120">订购票数：</td>
                     <td  width="277.6" colspan="2"><input value="${ticket!}" name="ticket" placeholder="累计最多订购5张" maxlength="1" style="width:250px; background:none;" type="text" /></td>
                 </tr>
                 <tr>
                     <td width="120">身份证号：</td>
                     <td width="277.6"><input value="${user.idcard!}" style="width:250px; background:none;" type="text" readonly="readonly"/></td>
                     <td width="120">验证码：</td>
                     <td width="177.6"><input autocomplete="off" id="code_input" placeholder="请输入右边图片的内容" maxlength="4" style="width:150px; background:none;" type="text" /></td>
                     <td width="100"><div id="v_container" style="width: 100px;height: 50px;"/></td>
                 </tr>

</table>
<div class="tom" style="margin-top:20px;">
<input name="clear" style="width:80px; height:30px;" type="reset" value="重置" />

<input name="play" class="next" style="width:80px; height:30px; " type="submit" value="申请订票" />

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
<script type="text/javascript" src="/js/yzm.js"></script>
<script type="text/javascript" src="/js/file.js"></script>
<script>
    var verifyCode = new GVerify("v_container");
</script>
</html>
