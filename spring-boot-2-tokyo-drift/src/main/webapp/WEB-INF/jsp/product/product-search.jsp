<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp" />

<%--Banner--%>
<section style="background-color:#ea8d71">
    <div class = "row pt-5 pb-5">
        <div class="text-center">
            <h1>Product Search</h1>
        </div>
    </div>
</section>


<!-- a search form -->
<section class="container">
    <div class="row justify-content-center">
        <div class="col-6 text-center mt-5 mb-2">
            <form action="/product/product-search" class="searchBar">
                <div class="input-group">
                    <div class="input-group-prepend">
                        <span class="input-group-text">&#x1F50D;</span>
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
            <h2 class="text-center">Products Found(${products.size()})</h2>
            <table class="table info-table">
                <tr>
                    <th>id</th>
                    <th>code</th>
                    <th>name</th>
                    <th>description</th>
                    <th>edit</th>
                </tr>
                <c:forEach items="${products}" var="product">
                <tr>
                    <td><a href="../product/${product.id}">${product.id}</a></td>
                    <td>${product.productCode}</td>
                    <td>${product.productName}</td>
                    <td>${product.productDescription}</td>
                    <td><a href="/?id=${product.id}">Edit</a></td>
                </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</section>

<jsp:include page="../include/footer.jsp" />