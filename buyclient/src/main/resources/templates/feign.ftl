<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>火车购票系统</title>
    <script type="text/javascript">
        onload=function () {
            alert('恭喜您，订票成功')
            window.location = document.getElementById('feign').value;
        }
    </script>
</head>
<body>
<input type="hidden" id="feign" value="${feign!}">
</body>
</html>