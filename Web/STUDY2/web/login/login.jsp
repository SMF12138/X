<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="演示Struts2中Action通过ActionContext访问Servlet API"/></title>
    </head>
    <body>
        <s:form action="login" method="post">
            <s:textfield name="userName" label="用户名称" size="18"/>
            <br>
            <s:password name="passWord" label="用户密码" size="18"/>
            <br>
            <s:submit value="登录"/>
       </s:form>
      <hr>
    </body>
</html>

