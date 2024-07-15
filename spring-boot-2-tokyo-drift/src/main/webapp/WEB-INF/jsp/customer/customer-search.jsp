<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp" />

<%--Banner--%>
<section style="background-color:#a7c987">
    <div class = "row pt-5 pb-5">
        <div class="text-center">
            <h1>Customer Search</h1>
        </div>
    </div>
</section>

<%--Search Bar--%>
<section class="container">
    <div class="row justify-content-center">
        <div class="col-6 text-center mt-5 mb-2">
            <form action="/customer/customer-search" class="searchBar">
                <div class="input-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text">&#x1F50D; Search By Name</span>
                    </div>
                    <input type="text" value="${search}" class="form-control" id="search" name="search" placeholder="Enter Customer By Name" aria-label="enter customer by name">
                    <button type="submit" class="btn btn-primary">Search</button>
                </div>
            </form>
        </div>
    </div>
</section>

<%--Search By Rep ID--%>
<section class="container">
    <div class="row justify-content-center">
        <div class="col-6 text-center mt-2 mb-2">
            <form action="../customer/customer-search-by-rep" class="searchBar">
                <div class="input-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text">&#x1F50D; Search By Rep ID</span>
                    </div>
                    <input type="number" value="${search}" class="form-control" id="search2" name="search" placeholder="Enter Sales Rep ID" aria-label="search employee">
                    <button type="submit" class="btn btn-primary">Search</button>
                </div>
            </form>
        </div>
    </div>
</section>

<%--Customer List--%>
<section class="container">
    <div class="row">

    </div>
    <div class = "row pt-5">
        <div class="col-12">
            <h2 class="text-center">Customers Found(${customers.size()})</h2>
            <table class="table info-table">
                <tr>
                    <th>ID</th>
                    <th>Customer Name</th>
                    <th>Contact First</th>
                    <th>Contact Last</th>
                    <th>Sales Rep</th>
                    <th>edit</th>
                </tr>
                <c:forEach items="${customers}" var="customer">
                    <tr>
                        <td><a href="../customer/${customer.id}">${customer.id}</a></td>
                        <td>${customer.customerName}</td>
                        <td>${customer.contactFirstName}</td>
                        <td>${customer.contactLastName}</td>
                        <td><a href="../employee/${customer.salesRepID}">${customer.salesRepID}</a></td>
                        <td><a href="customer/${customer.id}">Edit</a></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</section>
<jsp:include page="../include/footer.jsp" />