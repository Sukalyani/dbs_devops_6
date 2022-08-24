<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <body>
    <h2>How to iterate list on JSP in Spring MVC</h2>
    <div align="left">
      <table border="1" cellpadding="5">
        <caption>
          <h2>List of Employees</h2>
        </caption>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Salary</th>
         
        </tr>
        <c:forEach var="emp" items="${AllEmps}">
          <tr>
            <td>
              <c:out value="${emp.id}" />
            </td>
            <td>
              <c:out value="${emp.name}" />
            </td>
            <td>
              <c:out value="${emp.salary}" />
            </td>
           
          </tr>
        </c:forEach>
      </table>
    </div>
  </body>
</html>  