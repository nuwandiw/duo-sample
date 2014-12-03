<%@ page import="wso2.com.Authenticator" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="Duo-Web-v1.bundled.js"></script>
<script type="text/javascript">
		<%String sRequest = Authenticator.login("nuwandi", "admin"); %>
		var value = "<%=sRequest%>" ;
		Duo.init({
		    'host': 'api-b1b75575.duosecurity.com',
		    'sig_request': value,
		    'post_action': 'home.jsp'
		  });

</script>
<body>
<iframe id="duo_iframe" width="620" height="330" frameborder="0"></iframe>
</body>
</html>