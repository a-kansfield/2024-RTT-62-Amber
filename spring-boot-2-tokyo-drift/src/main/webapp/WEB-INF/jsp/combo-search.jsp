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


<!-- a search form -->
<section>
    <div class="container">
        <div class="row justify-content-center pt-5 pb-3">
            <div class="col-8 text-center">
                <form action="/product-search">
                    <div class="mb-3">
                        <label for="search" class="form-label"><h4>Search</h4></label>
                        <input type="text" value="${search}" class="form-control" id="search" name="search" placeholder="Enter search term">
                    </div>
                    <button type="submit" class="btn btn-primary">Search</button>
                </form>
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
                        <th>edit</th>
                    </tr>
                    <c:forEach items="${products}" var="product">
                        <tr>
                            <td><a href="/?id=${product.id}">${product.id}</a></td>
                            <td>${product.productCode}</td>
                            <td>${product.productName}</td>
                            <td>${product.productDescription}</td>
                            <td><a href="/?id=${product.id}">Edit</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</section>

<jsp:include page="include/footer.jsp" />>