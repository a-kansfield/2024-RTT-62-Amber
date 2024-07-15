<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp" />

<%--Banner--%>
<section style="background-color:#89e0ee">
    <div class = "row pt-5 pb-5">
        <div class="text-center">
            <h1>Employees</h1>
        </div>
    </div>
</section>

<section class="container">
    <div class = "row pt-5">
        <div class="col-12">
            <h2 class="text-center">Total Employees(${employees.size()})</h2>
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
                        <td><a href="/?id=${employee.id}">Edit</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</section>

<jsp:include page="../include/footer.jsp" />
