<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Register Page</title>
<style>
  body {
    font-family: Arial, sans-serif;
    background-color: pink;
    text-align: center;
    padding: 20px;
  }
  
  h3 {
    color: #333;
  }
  
  .container {
    max-width: 400px;
    margin: 0 auto;
    background-color: #fff;
    padding: 20px;
    border-radius: 8px;
  }
  
  input[type="text"], input[type="password"] {
    width: calc(100% - 20px);
    padding: 10px;
    margin: 5px 0;
    border: 1px solid #ccc;
    border-radius: 5px;
    font-size: 16px;
  }
  
  input[type="submit"] {
    background-color: #007bff;
    color: #fff;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    font-size: 16px;
    cursor: pointer;
  }
  
  input[type="submit"]:hover {
    background-color: #0056b3;
  }
</style>
</head>
<body>

<div class="container">
  <h3>Registeration Page</h3>
  
  <form action="Register1servlet" method="post">
    <label for="username">Create username:</label>
    <input type="text" id="username" name="username" required>
    
    <label for="password">Create password:</label>
    <input type="password" id="password" name="password" required>
    
    <input type="submit" value="Sign In">
  </form>
</div>

</body>
</html>
