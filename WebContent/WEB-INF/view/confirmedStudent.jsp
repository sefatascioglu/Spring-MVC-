<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<title>Confirmed Student</title>
</head>

<body>

Student confirmed : ${student.firstName} ${student.lastName}  

<br>

Country : ${student.country} 

Favorite Languages : ${student.favoriteLanguages}

<br>
Operating System : 

<c:forEach var="temp" items="${student.operatingSystem}">
<ul>
<li> ${temp}
</li>
</ul>
</c:forEach>

</body>

</html>