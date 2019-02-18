<%--
  Created by IntelliJ IDEA.
  User: Wolfh
  Date: 08/02/2019
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
<!-- data contained in the modelAttribute "student" is accessed here-->
The Students name is: ${student.firstName} ${student.lastName}
<br>
Country of origin: ${student.country}
<br>
Favourite Language: ${student.favouriteLanguage}

</body>
</html>
