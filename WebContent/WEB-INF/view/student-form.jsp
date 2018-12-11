<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="confirmeStudent" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		
		
		<br><br>
		
		<form:select path="country">
		
		<form:options items="${options}"/>
		
<%-- 		<form:option value="Turkey" label="Türkiye"></form:option> --%>
		
<%-- 		<form:option value="India" label="Hindistan"></form:option> --%>
		
<%-- 		<form:option value="Brazil" label="Brezilya"></form:option> --%>
		
<%-- 		<form:option value="Germany" label="Almanya"></form:option> --%>
		
		</form:select>
		
		<br><br>
		
		<form:radiobuttons path="favoriteLanguages" items="${student.radioButtonList}" />
		
<%-- 		Java: <form:radiobutton path="favoriteLanguages" value="Java"/> --%>
		
<%-- 		C: <form:radiobutton path="favoriteLanguages" value="C"/> --%>
		
<%-- 		C++: <form:radiobutton path="favoriteLanguages" value="C++"/> --%>
		
<%-- 		ios: <form:radiobutton path="favoriteLanguages" value="ios"/> --%>
		
		
		<br><br>
		
<%-- 		<form:checkboxes path="operatingSystem" items="${student.osList}"/> --%>

<form:checkboxes items="${student.osList}" path="operatingSystem"/>
		
<%-- 		Windows : <form:checkbox path="operatingSystem" value="Windows"/> --%>
		
<%-- 		Linux : <form:checkbox path="operatingSystem" value="Linux"/> --%>
		
		<br><br>
	
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>
