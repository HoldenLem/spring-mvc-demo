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

    <br><br>

    <form:form action="processForm" modelAttribute="customer" >

        First name: <form:input path="firstName" />

        <br><br>

        Last name: <form:input path="lastName" />

        <form:errors path="lastName" cssClass="error" />

        <br><br>

        Free passes: <form:input path="freePasses" />

        <form:errors path="freePasses" cssClass="error" />

        <br></br>

        <input type="submit" value="Submit" />

    </form:form>

</html>