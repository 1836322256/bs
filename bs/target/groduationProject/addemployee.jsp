<%--
  Created by IntelliJ IDEA.
  User: Eills
  Date: 2018/5/10
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>职工入职</title>
    <link rel="stylesheet" type="text/css" href="css/css.css" />
    <script type="text/javascript" src="css/jquery.min.js"></script>
</head>
<body>
<div id="pageAll">
    <div class="pageTop">
        <div class="page">
            <img src="img/coin02.png" /><span><a href="#">首页</a>&nbsp;-&nbsp;<a
                href="#">职工管理</a>&nbsp;-</span>&nbsp;职工入职
        </div>
    </div>
    <div class="page ">
        <!-- 会员注册页面样式 -->
        <div class="banneradd bor">
            <div class="baTopNo">
                <span>新增职工</span>
            </div>
            <div class="baBody">
                <div class="bbD">
                    姓名：<input type="text" class="input3" />
                </div>
                <div class="bbD">
                    密码：<input type="password" class="input3" />
                </div>
                <div class="bbD">
                    入职时间：<input type="date"/>
                </div>
                <div class="bbD">
                    头像：<input type="file"/>
                </div>
                <div class="bbD">
                    性别：<select>
                    <option>男</option>
                    <option>女</option>
                </select>
                </div>
                <div class="bbD">
                    民族：<input type="text" class="input3" />
                </div>
                <div class="bbD">
                    籍贯：<input type="text" class="input3" />
                </div>
                <div class="bbD">
                    电话号码：<input type="text" class="input3" />
                </div>
                <div class="bbD">
                    电子邮箱：<input type="text" class="input3" />
                </div>
                <div class="bbD">
                    出生日期：<input type="date" />
                </div>
                <div class="bbD">
                    年龄：<input type="text" class="input3" />
                </div>
                <div class="bbD">
                    所属部门：<select>
                    <option>财务部</option>
                    <option>销售部</option>
                    <option>生产部</option>
                    <option>管理部</option>
                </select>
                </div>
                <div class="bbD">
                    身份证号码：<input type="text" class="input3" />
                </div>
                <div class="bbD">
                    <p class="bbDP">
                        <button class="btn_ok btn_yes" href="#">提交</button>
                        <a class="btn_ok btn_no" href="#">取消</a>
                    </p>
                </div>
            </div>
        </div>

        <!-- 会员注册页面样式end -->
    </div>
</div>
</body>
</html>