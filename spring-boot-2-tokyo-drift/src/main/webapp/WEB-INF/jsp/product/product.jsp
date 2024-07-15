<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp" />

<%--Banner--%>
<section style="background-color:#ea8d71">
    <div class = "row pt-5 pb-5">
        <div class="text-center">
            <h1>${product.productName}</h1>
        </div>
    </div>
</section>

<section class="container">
    <div class = "row pt-5">
        <div class="col-12">
            <table class="table info-table">
                <tr>
                    <th>id</th>
                    <th>code</th>
                    <th>name</th>
                    <th>description</th>
                    <th>edit</th>
                </tr>
                <tr>
                    <td>${product.id}</td>
                    <td>${product.productCode}</td>
                    <td>${product.productName}</td>
                    <td>${product.productDescription}</td>
                    <td><a href="/?id=${product.id}">Edit</a></td>
                </tr>
            </table>
        </div>
    </div>
</section>



<jsp:include page="../include/footer.jsp" />