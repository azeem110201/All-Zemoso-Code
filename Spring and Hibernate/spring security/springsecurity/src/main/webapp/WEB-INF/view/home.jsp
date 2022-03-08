<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Welcome!</title>
  </head>
  <body>
    <h1>Hello, world! This is Me</h1>

    <!-- display user name and role -->

    	<p>
    		User: <security:authentication property="principal.username" />    <!--  display user name -->
    		<br><br>
    		Role(s): <security:authentication property="principal.authorities" />   <!--  display user roles -->
    	</p>


    	<security:authorize access="hasRole('MANAGER')">

    	<!-- Add a link to point to /leaders ... this is for the managers -->

        <p>
        	<a href="${pageContext.request.contextPath}/leaders">Managers Meeting</a>
        	(Only for Manager peeps)
        </p>

        </security:authorize>


        <security:authorize access="hasRole('ADMIN')">

        <!-- Add a link to point to /systems ... this is for the admins -->

                <p>
                	<a href="${pageContext.request.contextPath}/systems">Admins Meeting</a>
                	(Only for Admin peeps)
                </p>

        </security:authorize>

    <!-- Add a logout button -->
    	<form:form action="${pageContext.request.contextPath}/logout"
    			   method="POST">

    		<input type="submit" value="Logout" />

    	</form:form>

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

  </body>
</html>