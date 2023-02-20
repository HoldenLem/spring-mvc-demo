<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<DOCTYPE!>
<html>


<head>

<title> Customer form </title>

<style>
    .error {color:red}
</style>

</head>

<body>

    Fill out the form:

    <br>/<br>

    <form:form action="processForm" modelAttribute="customer" >

        First name: <form:input path="firstName" />

        <br><br>

        Last name: <form:input path="lastName" />

        <form:error path="lastName" cssClass="error" />

        <input type="submit" value="Submit" />

    </form:form>

</html>