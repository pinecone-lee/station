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
<input type="hidden" id="show" value="m4"/>
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
                <h4 style="color:#fff">修改密码</h4>
                <form method="post" action="/user/pwd.save" id="f">
                    <table width="800" height="200" style="margin:auto; margin-top:50px; border:1px solid #FFF;" border="1" cellpadding="0" cellspacing="0" >
                        <tr>
                            <td width="120">旧密码：</td>
                            <td width="277.6"><input maxlength="20" name="pw" value="" placeholder="请输入当前密码" style="width:250px; background:none;" type="password" /></td>
                        </tr>
                        <tr>
                            <td width="120">新密码：</td>
                            <td width="277.6"><input maxlength="20" name="pw1" value="" placeholder="8-20位字母、数字和符号"  style="width:250px; background:none;" type="password" /></td>
                        </tr>
                        <tr>
                            <td width="120">确认密码：</td>
                            <td width="277.6"><input maxlength="20" name="pw2" value="" placeholder="再次输入密码" style="width:250px; background:none;" type="password" /></td>
                        </tr>
                    </table>
                    <div class="tom" style="margin-top:20px;">
                        <input name="clear" style="width:80px; height:30px;" type="reset" value="重置" />
                        <input name="play" style="width:80px; height:30px; " type="submit" class="alter" value="修改" />
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
