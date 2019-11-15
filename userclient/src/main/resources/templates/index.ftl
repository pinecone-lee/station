<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
${alert!}
<form action="/log" method="post">
    用户：<input type="text" name="id">
    密码：<input type="password" name="pwd">
    <input type="submit" value="登录">
</form>
</body>
</html>