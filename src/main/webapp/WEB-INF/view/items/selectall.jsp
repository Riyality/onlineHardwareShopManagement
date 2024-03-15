<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="../../jsp/modules/header.jsp"%>

<!-- Rest of your JSP page content goes here -->
<%@ page isELIgnored="false"%>

<!-- Page Wrapper -->
<div class="page-wrapper">
	<div class="content container-fluid">

		<!-- Page Header -->
		<div class="page-header">
			<div class="row align-items-center">
				<div class="col">
					
					<ul class="breadcrumb">

						<li class="breadcrumb-item"><a href="#">Dashboard</a></li>
						<li class="breadcrumb-item active">Items</li>

					</ul>
				</div>
			</div>
		</div>
		<!-- /Page Header -->

		<div class="row">
			<div class="col-sm-12">

				<div class="card card-table">
					<div class="card-body">
						<!-- Page Header -->





						<!-- /Page Header -->
						<div class="table-responsive">
							<table
								class="table border-0 star-student table-hover table-center mb-0 datatable table-striped">
								<thead class="customer-thread">
									<tr>
										<th>Id</th>
										<th>name</th>
										<th>price</th>
										<th>Category</th>
										<th>manufacturer</th>
											<th>stock</th>
											<th>Action</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="list" items="${data}">
										<tr>

											<td>${list.id}</td>
											<td>${list.name}</td>
											<td>${list.price}</td>
											<td>${list.category}</td>
											<td>${list.manufacturer}</td>
											<td>${list.stock}</td>
											
											

											<td data-th="Movie Title"><a
												href="updateitems?id=${list.id}&name=${list.name}&price=${list.price}&category=${list.category}&manufacturer=${list.manufacturer}&stock=${list.stock}"><i
													class="fa-solid fa-pen-to-square"></i></a> <a
												class="btn btn-sm bg-danger-light" href="#"
												onclick="confirmDelete(${list.id});"> <i
													class="fa-solid fa-trash" style="color: red;"></i>
											</a></td>

										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script>
    function confirmDelete(id)
 {
        if (confirm('Are you sure you want to delete this record?')) {
            window.location.href = 'delete?id=' + id;
        }
    }
</script>
</div>

<!-- Datatables JS -->
<script
	src="<c:url value="resources/assets/plugins/datatables/datatables.min.js"/>"></script>



<%@include file="../../jsp/modules/footer.jsp"%>