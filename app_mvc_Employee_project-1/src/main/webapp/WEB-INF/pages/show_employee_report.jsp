<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<c:choose>
    <c:when test="${!empty empsList}">
        <h1 style="color:red; text-align: center;">Employee Report</h1>
        <table border="1" align="center" bgcolor="cyan">
            <tr style="color: red;">
                <th>Employee Number</th>
                <th>Employee Name</th>
                <th>Employee Job</th>
                <th>Employee Salary</th>
                <th>Employee Department Number</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>

            <c:forEach var="emp" items="${empsList}">
                <h1 style="color: red; text-align: center;">${resultMsg}</h1>
                <tr style="color: blue;">
                    
                    <td>${emp.employeeNumber}</td>
                    <td>${emp.employeeName}</td>
                    <td>${emp.employeeJob}</td>
                    <td>${emp.employeeSalary}</td>
                    <td>${emp.employeeDepartmentNumber}</td>
                    <td>
                        <a href="emp_edit?no=${emp.employeeNumber}">
                            <img src="<c:url value='/images/edit.jpeg'/>" width="30px" height="30px" alt="Edit">
                        </a>
                    </td>
                    <td>
                        <a href="emp_delete?no=${emp.employeeNumber}">
                            <img src="<c:url value='/images/delete.jpeg'/>" width="30px" height="30px" alt="Delete">
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <h1 style="color:red; text-align: center;">Employee Not Found</h1>
    </c:otherwise>
</c:choose>

<center>
    <a href="emp_add">
        <img src="<c:url value='/images/addEmployee.jpeg'/>" width="40px" height="50px" alt="Add Employee">
    </a>&nbsp;&nbsp;&nbsp;
    <a href="./">
        <img src="<c:url value='/images/report1.jpeg'/>" width="40px" height="50px" alt="Employee Report">
    </a>
</center>
