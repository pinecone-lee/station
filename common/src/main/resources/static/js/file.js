$(".update").click(function(){
    var account = $("input[name='account']").val().trim();
    var name = $("input[name='name']").val().trim();
    var sex = $("input[name='sex']").val().trim();
    var phone = $("input[name='phone']").val().trim();
    var idc = $("input[name='idc']").val().trim();

    var p_name=/^[\u4e00-\u9fa5]{2,6}$/;
    var p_sex=/^['男'|'女']$/;
    var p_phone=/^1[34578]\d{9}$/;/*验证手机号*/
    var p_idc = /^[1-9]\d{5}(18|19|20)\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/;


        if (account.length < 1) {
            alert("请输入账号");
            return false;
        }
        if (name.length < 1) {
            alert("请输入姓名");
            return false;
        }
        if (!p_name.test(name)/* && !patrn_1.test(username)*/) {
            alert("姓名格式不正确");
            return false;
        }
        if (sex.length < 1) {
            alert("请输入性别（男/女）");
            return false;
        }
        if (!p_sex.test(sex)/* && !patrn_1.test(username)*/) {
            alert("性别格式不正确");
            return false;
        }
        if (phone.length < 1) {
            alert("请输入手机号");
            return false;
        }
        if (!p_phone.test(phone)/* && !patrn_1.test(username)*/) {
            alert("手机号格式不正确");
            return false;
        }
        if (idc.length < 1) {
            alert("请输入身份证号");
            return false;
        }
        if (!p_idc.test(idc)/* && !patrn_1.test(username)*/) {
            alert("身份证号格式不正确");
            return false;
        } else {
            if(confirm('修改成功后将无法还原至上一次资料')) {
                document.getElementById('f').submit();
                return true;
            }
            return false;
        }



});

$(".alter").click(function(){
    var pw = $("input[name='pw']").val().trim();
    var pw1 = $("input[name='pw1']").val().trim();
    var pw2 = $("input[name='pw2']").val().trim();
    var p=/^.{8,20}$/;/*匹配8-20的除开空格*/

    if(pw.length==0)
    {
        alert("请输入旧密码");
        return false;
    }
    if(pw1.length==0)
    {
        alert("请输入新密码");
        return false;
    }
    if(!p.test(pw1))
    {
        alert("新密码格式不正确");
        return false;
    }
    if(pw1!=pw2){
        alert("确认密码不一致");
        return false;
    }

    else{
        if(confirm('确认修改密码？')){
            document.getElementById('f').submit();
            return true;
        }
        return false;
    }
});

$(".next").click(function(){
    var res = verifyCode.validate(document.getElementById("code_input").value);
    var train = $("input[name='train']").val().trim();
    var style = document.getElementById('style').value;
    var ticket = $("input[name='ticket']").val().trim();
    var p_ticket=/^[1-5]$/;
    if(!res){
        alert("验证码错误");
        document.getElementById("code_input").value="";
        return false;
    }
    if(train.length==0)
    {
        alert("请输入车次");
        return false;
    }
    if(style==0)
    {
        alert("请选择座位类型");
        return false;
    }
    if(!p_ticket.test(ticket)){
        alert("订购票数格式不正确");
        return false;
    }
    else {
        document.getElementById('f').submit();
        return true;
    }
});