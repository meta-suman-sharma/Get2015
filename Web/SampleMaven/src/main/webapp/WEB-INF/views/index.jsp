<html>
<head>
	
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
</head>
<body>
<form:form method="POST" modelAttribute="myuser" action="addStudent.html">
   <table>
    <tr>
        <td><form:label path="userName">Name</form:label></td>
        <td><form:input path="userName" /></td>
    </tr>
    <tr>
        <td><form:label path="passWord">password</form:label></td>
        <td><form:input path="passWord" /></td>
    </tr>

    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>

</body>
</html>
