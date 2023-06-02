<html>
<head>
  <title>Web Student Tracker</title>
  <link type="text/css" rel="stylesheet" href="css/add-student-style.css">
  <link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
<div id="wrapper">
  <div id="header">
    <h2>Login</h2>
  </div>
  <div id="container">
    <div id="content">
      <form method="post" action="loginServlet">
        <table>
          <tr>
            <td>username</td><td><input type="text" name="username" required></td>
          </tr>
          <tr>
            <td>password</td><td><input type="password" name="psw" required></td>
          </tr>
          <tr>
            <td></td><td><input type="submit" value="login"></td>
          </tr>
        </table>
        <span style="color: red">${error}</span>
      </form>
    </div>
  </div>
</div>
</body>
</html>