<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
<!-- data contained in the modelAttribute "student" is accessed here-->
The Students name is: ${student.firstName} ${student.lastName}
<br><br>
Country of origin: ${student.countryTwo}
<br><br>
Country of origin: ${student.country}
<br><br>
Favourite Language: ${student.favouriteLanguage}
<br><br>
Known Operating Systems:
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">

        <li> ${temp} </li>
    </c:forEach>

</ul>

</body>
</html>
