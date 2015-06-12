

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Привет!</title>
      <link type="text/css" rel="stylesheet" href="style/style-index.css"/>
  </head>
  <body class="body">
  <div class="main">
  <h2 class="welcome">Добро пожаловать в электронную библиотеку!</h2>
  <div class="enterDiv">
      <p>Введите Ваше имя</p>
      <form class="enterForm" name="username" action="pages/main.jsp" method="post">
          Имя: <input class="text" type="text" name="username" width="50"><br>
          <input type="submit" value="Войти" class="enterButton">
       </form>
  </div>
  </div>
  </body>
</html>
