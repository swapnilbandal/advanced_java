<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<h1>User Registration Form</h1>
    <form action="serv2" method="post" onsubmit="return validate();" name="signupform">
        <table class="login">
            <tr>
                <td>Enter Your Name</td>
                <td><input type="text" name="name" id="name" ></td>
            </tr>
            <tr>
                <td>Enter Your Email</td>
                <td><input type="email" name="email" id="email" ></td>
            </tr>
           
            <tr>
                <td>Enter Mobile Number</td>
                <td><input type="text" name="phoneNo"></td>
            </tr>
            <tr>
                <td>Enter Your Password </td>
                <td><input type="password" name="password" id="password"></td>
            </tr>
            <tr>
                <td>I Agree to Terms and Conditions</td>
                <td><input type="checkbox" name="check" ></td>
            </tr>
            <tr>
                <td></td>
                <td><button type="submit">Sign Up</button></td>
            </tr>
        </table>
    </form>

<script type="text/javascript">
function validate() {
    var fname = document.forms["signupform"]["name"].value;
    if (fname.trim() == "") {
        alert("Enter Name!");
        return false;
    }

    var email = document.forms["signupform"]["email"].value;
    if (email.trim() == "") {
        alert("Enter Email!");
        return false;
    }

    var password = document.forms["signupform"]["password"].value;
    if (password.trim() == "") {
        alert("Password is Mandatory!");
        return false;
    }
    if (password.trim().length < 8) {
        alert("Password should be at least 8 characters long!");
        return false;
    }

    if (!document.forms["signupform"]["check"].checked) {
        alert("Please Agree to Terms and Conditions!");
        return false;
    }
}
</script>
</body>
</html>