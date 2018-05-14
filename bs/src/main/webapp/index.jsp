<%--
  Created by IntelliJ IDEA.
  User: Eills
  Date: 2018/5/8
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>Login Form</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/style.css" rel='stylesheet' type='text/css' />
    <script src="/css/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#submit").click(function () {
                login();

            })
            function login() {
                console.log(111)
                var eId = $("#userName").val();
                var ePassword = $("#password").val();
            $.ajax(
                {
                    url:"/test/login",
                    type:"post",
                    contentType:'application/json;charset=UTF-8',
                    async:true,
                    data: '{"eId":"'+eId+'","ePassword":"'+ePassword+'"}',
                    dataType:"json",
                    success:function (data) {
                        if (data.check == "false"){
                            alert("用户名或密码错误");
                        }
                        else {

                            window.location.href="/employeeMain.jsp"

/*                            $("#login-form-tips").html("用户名或密码错误");
                            $("#login-form-tips").css("display", "block");*/
                        }
                    },
                    error:function () {
                        alert("服务器请求错误！！！")
                    }
                });
            }
        })
    </script>
</head>
<body>
<div class="main">
    <div class="login">
        <h1>企业职工业绩管理系统</h1>
        <div class="inset">
            <!--start-main-->
            <form action="javascript:">
                <div>
                    <h2>管理登录</h2>
                    <span><label>用户名</label></span>
                    <span><input id="userName" type="text" class="textbox" ></span>
                </div>
                <div>
                    <span><label>密码</label></span>
                    <span><input id="password" type="password" class="password"></span>
                </div>
                <div class="box">
                    <input type="radio"  id="radio1"  name="radio"  checked="checked"/><label for="radio1">管理员</label>
                </div>
                <div class="line"></div>
                <div class="box">
                    <input type="radio"  id="radio2"  name="radio"/><label for="radio2">职工</label>
                </div>
                <div class="line"></div>

                <div class="sign">
                    <input  id="submit" type="submit" value="登录" class="submit" />
                </div>
            </form>
        </div>
    </div>
    <!--//end-main-->
</div>

<div class="copy-right">
    <p>&copy;wkl</p>

</div>
</body>
</html>