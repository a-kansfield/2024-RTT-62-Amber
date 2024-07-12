<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="include/header.jsp" />

<section style="background-color:gray">
    <div class="container">
        <div class = "row pt-5 pb-5">
            <div class="text-center">
                <h1>Search Page</h1>
            </div>
        </div>
    </div>
</section>

<section>
    <div class="container">
        <div class = "row pt-5">
            <div class="col-12">
                <h2 class="text-center">Products Found(${products.size()})</h2>
                <table class="table">
                    <tr>
                        <th>id</th>
                        <th>code</th>
                        <th>name</th>
                        <th>description</th>
                    </tr>
                    <c:forEach items="${products}" var="product">
                    <tr>
                        <td>${product.id}</td>
                        <td>${product.productCode}</td>
                        <td>${product.productName}</td>
                        <td>${product.productDescription}</td>
                    </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</section>
<jsp:include page="include/footer.jsp" />