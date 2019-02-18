<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Wolfh
  Date: 08/02/2019
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Entry Form</title>
</head>
<body>

<!-- this will call the mapping for processForm and wrap up first and last name
    within the modelAttribute "student" -->
<form:form action="processForm" modelAttribute="student">

    First Name: <form:input path="firstName"/>
    <br><br>
    Last Name: <form:input path="lastName"/>


    <!--This way we hard-code the country options into the web page -->
    <br><br>
    Country of origin:

    <form:select path="countryTwo">

        <form:option value="unitedKingdom" label="United Kingdom"/>
        <form:option value="ireland" label="Ireland"/>
        <form:option value="scotland" label="Scotland"/>
        <form:option value="wales" label="Wales"/>
        <form:option value="unitedStates" label="United States"/>

    </form:select>

    <br><br>
    Country:
    <form:select path="country">
        <!--This way we get the list from a java class in this case StudentClass.java -->
        <form:options items="${student.countryOptions}"/>
    </form:select>
    <br><br>

    <!--add in nice radio buttons to select favourite coding language -->
    Favourite Language:
    Java<form:radiobutton path="favouriteLanguage" value="Java"/>
    C#<form:radiobutton path="favouriteLanguage" value="C#"/>
    Ruby<form:radiobutton path="favouriteLanguage" value="Ruby"/>
    JavaScript<form:radiobutton path="favouriteLanguage" value="JavaScript"/>
    <br><br>
    <input type="submit" value="Submit">

</form:form>


</body>
</html>
