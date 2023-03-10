<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">

		First name: <form:input path="firstName" />

		<br><br>

		Last name: <form:input path="lastName" />

		<br><br>

		Country:

		<form:select path="country">

			<form:options items="${student.countryOptions}" />

		</form:select>

		<br><br>
			Select your favorite language:

		 <br></br>

        		Java <form:radiobutton path="favoriteLanguage" value="Java" />
        		C# <form:radiobutton path="favoriteLanguage" value="PHP" />
        		PHP <form:radiobutton path="favoriteLanguage" value="Java" />
        		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />

        <br><br>

        Select your favorite operating system:

        		 <br></br>

                		Linux <form:checkbox path="operatingSystem" value="Linux" />
                		Windows <form:checkbox path="operatingSystem" value="Windows" />
                		Mac OS <form:checkbox path="operatingSystem" value="Mac OS" />

                <br><br>


		<input type="submit" value="Submit" />

	</form:form>


</body>

</html>
