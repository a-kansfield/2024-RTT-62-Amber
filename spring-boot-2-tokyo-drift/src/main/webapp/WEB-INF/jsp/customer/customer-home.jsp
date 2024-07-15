<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp" />

<%--Banner--%>
<section style="background-color:#a7c987">
    <div class = "row pt-5 pb-5">
        <div class="text-center">
            <h1>Customers</h1>
        </div>
    </div>
</section>

<%--Customer List--%>
<section class="container">
    <div class = "row pt-5">
        <div class="col-12">
            <h2 class="text-center">Total Customers(${customers.size()})</h2>
            <table class="table info-table">
                <tr>
                    <th>ID</th>
                    <th>Customer Name</th>
                    <th>Contact First</th>
                    <th>Contact Last</th>
                    <th>Sales Rep</th>
                    <th>Edit</th>
                </tr>
                <c:forEach items="${customers}" var="customer">
                    <tr>
                        <td><a href="../customer/${customer.id}">${customer.id}</a></td>
                        <td>${customer.customerName}</td>
                        <td>${customer.contactFirstName}</td>
                        <td>${customer.contactLastName}</td>
                        <td><a href="../employee/${customer.salesRepID}">${customer.salesRepID}</a></td>
                        <td><a href="/customer/${customer.id}">Edit</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</section>

<jsp:include page="../include/footer.jsp" />
