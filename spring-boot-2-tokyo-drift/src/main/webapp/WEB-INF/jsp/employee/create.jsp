<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp" />

<%--Banner--%>
<section style="background-color:#89e0ee">
    <div class = "row pt-5 pb-5">
        <div class="text-center">
            <h1>Create Employee</h1>
        </div>
    </div>
</section>
<section class="container createForm">
    <form action="/employee/submit">
        <div class="row">
            <div class="col-6 mb-2">
                <input type="text" id="firstName" name="firstName" placeholder = "First Name" class="form-control">
            </div>
            <div class="col-6 mb-2">
                <input type="text" id="lastName" name="lastName" placeholder = "Last Name" class="form-control">
            </div>
        </div>
        <div class="row">
            <div class="col-12 mt-2 mb-2">
                <input type="text" id="email" name="email" placeholder = "Email" class="form-control">
            </div>
        </div>
        <div class="row">
            <div class="col-sm-4 mt-2 mb-2">
                <input type="text" id="extension" name="email" placeholder = "Extension" class="form-control">
            </div>
            <div class="col-sm-4 mt-2 mb-2">
                <input type="text" id="jobTitle" name="email" placeholder = "Job Title" class="form-control">
            </div>
            <div class="col-sm-4 mt-2 mb-2">
                <input type="text" id="vacation" name="email" placeholder = "Vacation Hours" class="form-control">
            </div>
        </div>
    </form>

</section>

<%--<section>--%>
<%--    <div class="container">--%>
<%--        <div class="row pt-5 align-items-center justify-content-center">--%>
<%--            <div class="col-12">--%>
<%--                <form action="/employee/submit">--%>

<%--                    <div class="row g-3 align-items-center justify-content-center">--%>
<%--                        <div class="col-1">--%>
<%--                            <label for="emailId" class="col-form-label">Email</label>--%>
<%--                        </div>--%>

<%--                        <div class="col-auto">--%>
<%--                            <input type="text" id="emailId" name="email" class="form-control">--%>
<%--                        </div>--%>

<%--                        <div class="row g-3 align-items-center justify-content-center">--%>
<%--                            <div class="col-1">--%>
<%--                                <label for="firstNameId" class="col-form-label">First Name</label>--%>
<%--                            </div>--%>
<%--                            <div class="col-auto">--%>
<%--                                <input type="text" id="firstNameId" name="firstName" class="form-control">--%>
<%--                            </div>--%>
<%--                        </div>--%>

<%--                        <div class="row g-3 align-items-center justify-content-center">--%>
<%--                            <div class="col-1">--%>
<%--                                <label for="lastNameId" class="col-form-label">Last Name</label>--%>
<%--                            </div>--%>
<%--                            <div class="col-auto">--%>
<%--                                <input type="text" id="lastNameId" name="lastName" class="form-control">--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>

<%--                    <div class="row align-items-center justify-content-center pb-3">--%>
<%--                        <div class="col-2">--%>
<%--                            <label for="reportsTo" class="col-form-label">Reports To</label>--%>
<%--                        </div>--%>
<%--                        <div class="col-4">--%>
<%--                            <select id="reportsTo" name="reportsTo" class="form-control">--%>
<%--                                <c:forEach items="${reportsToEmployees}" var="employee">--%>
<%--                                    <option value="${employee.id}">${employee.firstName} ${employee.lastName}</option>--%>
<%--                                </c:forEach>--%>
<%--                            </select>--%>
<%--                        </div>--%>
<%--                    </div>--%>

<%--                    <div class="row justify-content-center">--%>
<%--                        <div class="col-auto text-center mt-4">--%>
<%--                            <button type="submit" class="btn btn-primary">Submit</button>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </form>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</section>--%>
<%--<section class="container">--%>
<%--    <div class="row justify-content-center mt-5 mb-2">--%>
<%--        <div class="col-8">--%>
<%--            <form action="">--%>
<%--                <div class="mb-3">--%>
<%--                    <label for="exampleInputEmail1" class="form-label">Email address</label>--%>
<%--                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">--%>
<%--                    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>--%>
<%--                </div>--%>
<%--            </form>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</section>--%>
<jsp:include page="../include/footer.jsp" />