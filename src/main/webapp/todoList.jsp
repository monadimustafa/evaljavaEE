<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Todos</title>
</head>
<body>
<div id="wrapper">
  <div id="header">
    <h2>List Todos</h2>
  </div>
  <div id="container">
    <div id="content">
      <table>
        <tr>
          <th>Description</th>
          <th>Statut</th>
        </tr>
        <c:forEach var="tempTodo" items="${listTodos}">
          <c:set var="done" value="${tempTodo.statut}" />
          <tr>
            <td> ${tempTodo.description}</td>
            <td> ${tempTodo.statut}</td>
            <c:if test="${done eq '0'}">
              <td><a href="ChangeStatusServlet?id=${tempTodo.id}">Done</a></td>
            </c:if>
          </tr>
        </c:forEach>
      </table>
    </div>
  </div>
</div>
</body>
</html>