function checks() {

    var name = $("#username");
    if (name.val()==""){
        alert("请输入昵称！");
        return false;
    }
    return true;
}