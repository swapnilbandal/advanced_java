<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login Page</title>
</head>
<body>
    <div class="container">
        <h1>Login Form</h1>
        <form action="serv1" method="post" onsubmit="return validate()" name="loginform">
            <table>
                <tr>
                    <td>Enter Your Email</td>
                    <td><input type="email" name="email"></td>
                </tr>
                <tr>
                    <td>Enter Password</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><button type="submit">Log In</button></td>
                </tr>
            </table>
        </form>
    </div>

    <script>
        function validate() {
            if (document.loginform.email.value.trim() == "") {
                alert("Enter User Email");
                return false;
            }
            if (document.loginform.password.value.trim() == "") {
                alert("Please Enter Password");
                return false;
            }
            return true;
        }
    </script>
</body>
</html>