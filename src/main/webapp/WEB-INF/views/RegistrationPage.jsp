<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html;charset=utf-8"%>

<!DOCTYPE html>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <%--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/css/bootstrap.min.css"
          integrity="2hfp1SzUoho7/TsGGGDaFdsuuDL0LX2hnUp6VkX3CUQ2K4K+xjboZdsXyp4oUHZj" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/js/bootstrap.min.js"
            integrity="VjEeINv9OSwtWFLAtmc4JCtEJXXBub00gtSnszmspDLCtC0I4z4nqz7rEFbIZLLU"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <form:form action="/registered" method="POST" modelAttribute="newUser" class="form-signin">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <h2 class="form-signin-heading">Add info about yourself</h2>

        <spring:bind path="firstname">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="firstname" class="form-control" placeholder="First name"
                            autofocus="true"/>
                <form:errors path="firstname">
                </form:errors>
            </div>
        </spring:bind>
        <spring:bind path="lastname">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="lastname" class="form-control" placeholder="Last name"
                            autofocus="true"/>
                <form:errors path="lastname">
                </form:errors>
            </div>
        </spring:bind>
        <spring:bind path="patronymic">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="patronymic" class="form-control" placeholder="Patronymic"
                            autofocus="true"/>
                <form:errors path="patronymic">
                </form:errors>
            </div>
        </spring:bind>
        <spring:bind path="age">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:input type="text" path="age" class="form-control" placeholder="Age"
                            autofocus="true"/>
                <form:errors path="age">
                </form:errors>
            </div>
        </spring:bind>
        <spring:bind path="sex">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:select path="sex" class="form-control">
                    <option value="male">Male</option>
                    <option value="female">Female</option>
                </form:select>
            </div>
        </spring:bind>

        <spring:bind path="profile">
            <div class="form-group ${status.error ? 'has-error' : ''}">
                <form:select path="profile" class="form-control">
                    <option value="mathphys">Physics-mathematics</option>
                    <option value="himbio">Chemistry-biology</option>
                    <option value="mathlang">Mathematics-english</option>
                </form:select>
            </div>
        </spring:bind>

        <form action="/registered" method="post">
            <input type="submit" value="Save" class="btn btn-lg btn-primary btn-block"/>
        </form>
    </form:form>
</div>
</body>
</html>
