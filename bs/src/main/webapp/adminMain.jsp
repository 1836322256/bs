<%--
  Created by IntelliJ IDEA.
  User: Eills
  Date: 2018/5/9
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/jsp; charset=utf-8" />
    <title>首页</title>
</head>
<frameset rows="100,*" cols="*" scrolling="No" framespacing="0"
          frameborder="no" border="0"> <frame src="adminhead.jsp"
                                              name="headmenu" id="mainFrame" title="mainFrame"><!-- 引用头部 -->
    <!-- 引用左边和主体部分 --> <frameset rows="100*" cols="220,*" scrolling="No"
                                 framespacing="0" frameborder="no" border="0"> <frame
            src="adminleft.jsp" name="leftmenu" id="mainFrame" title="mainFrame">
        <frame src="main.jsp" name="main" scrolling="yes" noresize="noresize"
               id="rightFrame" title="rightFrame"></frameset></frameset>
</html>
