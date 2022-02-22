<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Student Confirmation</title>
</head>
<body>
      <h1>
          Student first name is <strong> ${student.firstName} </strong>
      </h1>
      <h1>
          Student last name is <strong> ${student.lastName} </strong>
      </h1>
      <h2> Country is : ${student.country} </h2>
      <h4>Favourite Programming language: ${student.favoriteLanguage}</h4>
      <h4>Which Operation system have you worked on?: ${student.operatingSystems}</h4>
      <br><br>
      Operating Systems:
      <ul>
      	<c:forEach var="temp" items="${student.operatingSystems}">
      		<li> ${temp} </li>
      	</c:forEach>
      </ul>
</body>
</html>