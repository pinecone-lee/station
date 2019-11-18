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
<input type="hidden" id="show" value="m5"/>
<div class="header">
    <div class="inner">
        <div class="logo">
            <a><img src="/images/gdpu.png" width="350" height="60"/></a>
        </div>
        <div class="headlink">
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
        <!--菜单 end-->
        <!--指南-->
        <div class="class_a">
            <div class="all1">
                <h4 style="color:#fff">个人资料</h4>
                <form method="post" action="/user/file.save" id="f">
                    <table width="800" height="300" style="margin:auto; margin-top:50px; border:1px solid #FFF;" border="1" cellpadding="0" cellspacing="0" >
                        <tr>
                            <td width="120">账号：</td>
                            <td width="277.6"><input placeholder="请输入账号" maxlength="8" name="account" value="${user.account!}" style="width:250px; background:none;" type="text" /></td>
                        </tr>
                        <tr>
                            <td width="120">姓名：</td>
                            <td width="277.6"><input placeholder="请输入姓名" maxlength="6" name="name" value="${user.name!}" style="width:250px; background:none;" type="text" /></td>
                        </tr>
                        <tr>
                            <td width="120">性别：</td>
                            <td width="277.6"><input placeholder="请输入性别" maxlength="1" name="sex" value="${user.sex!}" style="width:250px; background:none;" type="text" /></td>
                        </tr>
                        <tr>
                            <td width="120">手机号：</td>
                            <td width="277.6"><input placeholder="请输入手机号" maxlength="11" name="phone" value="${user.phone!}" style="width:250px; background:none;" type="text" /></td>
                        </tr>
                        <tr>
                            <td width="120">身份证号：</td>
                            <td width="277.6"><input placeholder="请输入身份证号" maxlength="18" name="idc" value="${user.idcard!}" style="width:250px; background:none;" type="text" /></td>
                        </tr>
                        <tr>
                            <td width="120">用户状态：</td>
                            <td width="277.6"><input value="<#if user.status==2>异常<#else >正常</#if>" style="width:250px; background:none;" type="text" readonly="readonly"/></td>
                        </tr>
                    </table>
                    <div class="tom" style="margin-top:20px;">
                        <input name="clear" style="width:80px; height:30px;" type="button" onclick="window.location='/user/file'" value="还原" />
                        <input name="play" style="width:80px; height:30px; " type="submit" class="update" value="修改" />
                    </div>
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
<script src="/js/file.js"></script>
</html>
