<jsp:include page="../include/header.jsp" />

<%--Banner--%>
<section style="background-color:#a7c987">
    <div class = "row pt-5 pb-5">
        <div class="text-center">
            <h1>${customer.customerName}</h1>
        </div>
    </div>
</section>

<section class="container">
    <table class="table info-table">
        <tr>
            <th>ID</th>
            <th>Customer Name</th>
            <th>Contact First</th>
            <th>Contact Last</th>
            <th>Sales Rep</th>
            <th>edit</th>
        </tr>
        <tr>
            <td>${customer.id}</td>
            <td>${customer.customerName}</td>
            <td>${customer.contactFirstName}</td>
            <td>${customer.contactLastName}</td>
            <td><a href="../employee/${customer.salesRepID}">${customer.salesRepID}</a></td>
            <td><a href="customer/${customer.id}">Edit &#x1F589;</a></td>
        </tr>
    </table>
</section>

<jsp:include page="../include/footer.jsp" />