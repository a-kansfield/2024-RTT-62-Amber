<jsp:include page="../include/header.jsp" />

<%--Banner--%>
<section style="background-color:#89e0ee">
    <div class = "row pt-5 pb-5">
        <div class="text-center">
            <h1>${employee.firstName} ${employee.lastName}</h1>
        </div>
    </div>
</section>

<section class="container">
    <table class="table info-table">
        <tr>
            <th>ID</th>
            <th>office ID</th>
            <th>first name</th>
            <th>last name</th>
            <th>edit</th>
        </tr>
        <tr>
            <td>${employee.id}</td>
            <td>${employee.officeID}</td>
            <td>${employee.firstName}</td>
            <td>${employee.lastName}</td>
            <td><a href="/${employee.id}">Edit</a></td>
        </tr>
    </table>
</section>


<jsp:include page="../include/footer.jsp" />