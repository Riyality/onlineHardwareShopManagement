
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

						<li class="breadcrumb-item"><a href="index">Dashboard</a></li>
						<li class="breadcrumb-item active">Customer</li>

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
										<th>Name</th>
										<th>Mobile Number</th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="list" items="${customer }">
										<tr>

											<td>${list.id}</td>
											<td>${list.name}</td>
											<td>${list.mobileNo}</td>

											<td data-th="Movie Title"><a
												href="editCustomer?id=${list.id}&name=${list.name}&mobileNo=${list.mobileNo}"><i
													class="fa-solid fa-pen-to-square"></i></a> <a
												class="btn btn-sm bg-danger-light" href="deletes"
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
    function confirmDelete(id) {
        if (confirm('Are you sure you want to delete this record?')) {
            window.location.href = 'deletes?id=' + id;
        }
    }
</script>
</div>

<!-- Datatables JS -->
<script
	src="<c:url value="resources/assets/plugins/datatables/datatables.min.js"/>"></script>



<%@include file="../../jsp/modules/footer.jsp"%>
