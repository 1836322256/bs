<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页左侧导航</title>
<link rel="stylesheet" type="text/css" href="css/public.css" />
<script type="text/javascript" src="css/jquery.min.js"></script>
<script type="text/javascript" src="css/public.js"></script>
<head></head>

<body id="bg">
	<!-- 左边节点 -->
	<div class="container">

		<div class="leftsidebar_box">
			<a href="main.jsp" target="main"><div class="line">
					<img src="img/coin01.png" />&nbsp;&nbsp;首页
				</div></a>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="img/coin03.png" />
					<img class="icon2" src="img/coin04.png" /> 职工管理
					<img class="icon3" src="img/coin19.png" />
					<img class="icon4" src="img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="img/coin111.png" />
					<img class="coin22" src="img/coin222.png" />
					<a class="cks" href="tab.jsp" target="main">查找职工</a>
					<img class="icon5" src="img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="img/coin111.png" />
					<img class="coin22" src="img/coin222.png" />
					<a class="cks" href="addemployee.jsp" target="main">职工入职</a>
					<img class="icon5" src="img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="img/coin111.png" />
					<img class="coin22" src="img/coin222.png" />
					<a class="cks" href="tab.jsp" target="main">职工离职</a>
					<img class="icon5" src="img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="img/coin111.png" />
					<img class="coin22" src="img/coin222.png" />
					<a class="cks" href="tab.jsp" target="main">职工调动</a>
					<img class="icon5" src="img/coin21.png" />
				</dd>
			</dl>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="img/coin01.png" />
					<img class="icon2" src="img/coin02.png" /> 资料管理
					<img class="icon3" src="img/coin19.png" />
					<img class="icon4" src="img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="img/coin111.png" />
					<img class="coin22" src="img/coin222.png" />
					<a class="cks" href="p3.jsp" target="main">查询资料</a>
					<img class="icon5" src="img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="img/coin111.png" />
					<img class="coin22" src="img/coin222.png" />
					<a class="cks" href="p2.jsp" target="main">资料审核</a>
					<img class="icon5" src="img/coin21.png" />
				</dd>
			</dl>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="img/coin07.png" />
					<img class="icon2" src="img/coin08.png" /> 考勤状况
					<img class="icon3" src="img/coin19.png" />
					<img class="icon4" src="img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="img/coin111.png" />
					<img class="coin22" src="img/coin222.png" />
					<a href="p1.jsp" target="main" class="cks">查询考勤</a>
					<img class="icon5" src="img/coin21.png" />
				</dd>
			</dl>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="img/coin10.png" />
					<img class="icon2" src="img/coin09.png" /> 项目管理
					<img class="icon3" src="img/coin19.png" />
					<img class="icon4" src="img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="img/coin111.png" />
					<img class="coin22" src="img/coin222.png" />
					<a class="cks">查询项目</a>
					<img class="icon5" src="img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="img/coin111.png" />
					<img class="coin22" src="img/coin222.png" />
					<a class="cks">发布项目</a>
					<img class="icon5" src="img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="img/coin111.png" />
					<img class="coin22" src="img/coin222.png" />
					<a class="cks">审核项目</a>
					<img class="icon5" src="img/coin21.png" />
				</dd>
			</dl>
			<dl class="system_log">
				<dt>
					<img class="icon1" src="img/coinL1.png" />
					<img class="icon2" src="img/coinL2.png" /> 系统管理
					<img class="icon3" src="img/coin19.png" />
					<img class="icon4" src="img/coin20.png" />
				</dt>
				<dd>
					<img class="coin11" src="img/coin111.png" />
					<img class="coin22" src="img/coin222.png" />
					<a href="changepwd.jsp" target="main" class="cks">修改密码</a>
					<img class="icon5" src="img/coin21.png" />
				</dd>
				<dd>
					<img class="coin11" src="img/coin111.png" />
					<img class="coin22" src="img/coin222.png" />
					<a href ="index.jsp" target="_top" class="cks">退出</a>
					<img class="icon5" src="img/coin21.png" />
				</dd>
			</dl>

		</div>

	</div>
</body>
</html>
