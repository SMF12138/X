<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="登录成功页面"/></title>
    </head>
    <body>
        欢迎<s:property value="#application.userName"/>
        <br/>
        欢迎<s:property value="#session.userName"/>
    </body>
</html>
