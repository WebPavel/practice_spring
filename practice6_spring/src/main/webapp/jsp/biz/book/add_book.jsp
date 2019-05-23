<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/22
  Time: 23:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>添加图书</title>
</head>
<body>
    <s:form action="book_add" namespace="/biz/book" method="POST" theme="simple">
        图书名称：<s:textfield id="name" name="name"/><br>
        图书作者：<s:textfield id="author" name="author"/><br>
        图书价格：<s:textfield id="price" name="price"/><br>
        出版社：<s:textfield id="press" name="press"/><br>
        条形码：<s:textfield id="barcode" name="barcode"/><br>
        库存：<s:textfield id="stock" name="stock"/><br>
        摘要：<s:textarea id="description" name="description" cols="30" rows="3"/><br>
        <s:submit value="添加"/>
    </s:form>
</body>
</html>
