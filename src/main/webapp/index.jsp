<%@ page import="com.duosecurity.duoweb.DuoWeb" %>
<%@ page import="wso2.com.Authenticator" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

  <meta charset="UTF-8">

  <title>Log-in Duo Demo</title>

  <link rel='stylesheet' href='http://codepen.io/assets/libs/fullpage/jquery-ui.css'>

  <link rel="stylesheet" href="css/style.css" media="screen" type="text/css" />

</head>
<body>
  <div class="login-card">
    <h1>Log-in Duo Demo</h1><br>
  <form>
    <input type="text" name="user" value="nuwandi">
    <input type="password" name="pass" placeholder="Password" value="admin">
    
	<button class="login login-submit"><a href="duoAuth.jsp"> Login</a></button>
  </form>

</div>

<!-- <div id="error"><img src="https://dl.dropboxusercontent.com/u/23299152/Delete-icon.png" /> Your caps-lock is on.</div> -->

  <script src='http://codepen.io/assets/libs/fullpage/jquery_and_jqueryui.js'></script>

<br>
<iframe id="duo_iframe" width="620" height="330" frameborder="0"></iframe>
</body>
</html>