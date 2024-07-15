<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp" />

<%--Banner--%>
<section style="background-color:#87bac9">
    <div class = "row pt-5 pb-5">
        <div class="text-center">
            <h1>Employee Search</h1>
        </div>
    </div>
</section>

<%--search bar--%>
<%--<section class="container">--%>
<%--    <div class="row justify-content-center pt-5 pb-3">--%>
<%--        <div class="col-8 text-center">--%>
<%--            <form action="/employee/employee-search">--%>
<%--                <div class="mb-3">--%>
<%--                    <label for="search" class="form-label"><h4>Search</h4></label>--%>
<%--                    <input type="text" value="${search}" class="form-control" id="search" name="search" placeholder="Enter search term">--%>
<%--                </div>--%>
<%--                <button type="submit" class="btn btn-primary">Search</button>--%>
<%--            </form>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</section>--%>

<section class="container">
    <div class="row justify-content-center">
        <div class="col-6 text-center mt-5 mb-2">
            <form action="/employee/employee-search" class="searchBar">
                <div class="input-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text">&#x1F50D; </span>
                    </div>
                    <input type="text" value="${search}" class="form-control" id="search" name="search" placeholder="Enter search term" aria-label="search employee">
                    <button type="submit" class="btn btn-primary">Search</button>
                </div>
            </form>
        </div>
    </div>
</section>

<section class="container">
    <div class = "row pt-5">
        <div class="col-12">
            <h2 class="text-center">Employees Found(${employees.size()})</h2>
            <table class="table info-table">
                <tr>
                    <th>ID</th>
                    <th>office ID</th>
                    <th>first name</th>
                    <th>last name</th>
                    <th>edit</th>
                </tr>
                <c:forEach items="${employees}" var="employee">
                    <tr>
                        <td><a href="../employee/${employee.id}">${employee.id}</a></td>
                        <td>${employee.officeID}</td>
                        <td>${employee.firstName}</td>
                        <td>${employee.lastName}</td>
                        <td><a href="employee/${employee.id}">Edit</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</section>

<jsp:include page="../include/footer.jsp" />