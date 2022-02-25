<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Confirmation</title>

</head>
<body>
    <h2>The customer is confirmed: ${customer.firstName} ${customer.lastName}</h2>
    <br><br>

    <h3>Free passes: ${customer.freePasses}</h3>
    <br><br>

    <h3>Postal code: ${customer.postalCode}</h3>

    <br><br>

    <h3>Course code: ${customer.courseCode}</h3>
</body>
</html>