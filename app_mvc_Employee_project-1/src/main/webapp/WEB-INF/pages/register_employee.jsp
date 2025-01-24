<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Register Employee</title>
    <style>
        h1 {
            color: red;
            text-align: center;
        }
        table {
            margin: auto;
            background-color: cyan;
            border-collapse: collapse;
            padding: 20px;
        }
        td {
            padding: 10px;
        }
        input[type="submit"], input[type="reset"] {
            padding: 5px 15px;
            font-size: 14px;
            border-radius: 5px;
        }
    </style>
</head>
<body>
    <h1>Register Employee</h1>
    <form:form modelAttribute="employee">
        <table>
            <tr>
                <td>Employee Name:</td>
                <td><form:input path="employeeName" /></td>
            </tr>
            <tr>
                <td>Employee Job:</td>
                <td><form:input path="employeeJob" /></td>
            </tr>
            <tr>
                <td>Employee Salary:</td>
                <td><form:input path="employeeSalary" /></td>
            </tr>
            <tr>
                <td>Employee Dept Number:</td>
                <td><form:input path="employeeDepartmentNumber" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit" /></td>
                <td><input type="reset" value="Cancel" /></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
