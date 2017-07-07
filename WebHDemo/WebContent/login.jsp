<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Post Resume</title>
<!-- <meta charset="utf-8"> -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
<!-- <link rel="stylesheet" type="text/css"
	href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.1/css/bootstrap.min.css"> -->

<!-- <script>
	$(function() {
		$("#tabs").tabs();
	});
</script> -->
</head>
<body>
	<div class="container-fulid">
		<nav class="navbar navbar-default">
		<div class="navbar-header">
			<a class="navbar-brand" href="PostResume2.jsp">TalentTurbo</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><i class="fa fa-bell-o"><span
						class="badge">4</span></i></a></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-out"></span></a></li>
			</ul>
		</div>
		</nav>
	</div>
	
	<div class="container-fulid">
		<ul class="list-inline">
			<li><a href="#"><i class="fa fa-home"></i></a></li>
			<li><span class="fa fa-angle-right"></span></li>
			<li>Post Resume</li>
		</ul>
	</div>
	<div class="container-fulid">
	<form class="form-horizontal">
		<div class="row">
			<div class="col-md-8">
				<h4>Post Resume</h4>
			</div>
			<div class="col-md-4">
				<div class="col-md-4" style="font-size: 12px">Profile
					Completion:</div>
				<div class="col-md-8">
					<div class="progress" style="">
						<div
							class="progress-bar progress-bar-success progress-bar-striped"
							role="progressbar" aria-valuenow="60" aria-valuemin="0"
							aria-valuemax="100" style="width: 60%">60%</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3">
				<span>First Name</span> <span><input type="text"
					class="form-control" id="ex3" placeholder="enter your first name"></span>
			</div>
		</div>

	</div>
	<div class="row">
		<div class="col-md-4">
			<div class="col-md-4">Last Name</div>
			<div class="col-md-8">
				<input type="text" class="form-control" id="ex3"
					placeholder="enter your last name">
			</div>
		</div>
		<div class="col-md-6">
			<div class="col-md-6">
				<img style="float: left" src="<c:url value='images/user.png'/>"
					class="img-circle" alt="Photo" width="75" height="75">
				<nav aria-label="...">
				<ul class="pager">
					<li><a href="#">Upload photo</a></li>
				</ul>
				</nav>

				<!-- </div> -->
			</div>
		</div>
		<div class="col-md-6">
			<div class="col-md-6">
				<div class="row">
					<img style="float: left" src="<c:url value='images/resume.png'/>"
						class="img-circle" alt="Photo" width="75" height="75">
					<nav aria-label="...">
					<ul class="pager">
						<li><a href="#">Upload Resume</a></li>
					</ul>
					</nav>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4">
			<div class="col-md-4">Email ID</div>
			<div class="col-md-8">
				<input type="text" class="form-control" id="ex3"
					placeholder="enter your email-id">
			</div>
		</div>
		<div class="form-group">
				<label for="inputEmail" class="col-md-2 control-label">Email</label>
				<div class="col-md-4">
					<input class="form-control" id="inputEmail" placeholder="Email"
						type="text">
				</div>
			</div>
	</div>
	<%-- <div class="row">
			<div class="col-md-4">
				<div class="col-md-4">
					<h5>First Name</h5>
				</div>
				<div class="col-md-8">
					<input type="text" class="form-control" id="ex3"
						placeholder="enter your first Name">
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-md-4">
				<div class="col-md-4">
					<h5>Last Name</h5>
				</div>
				<div class="col-md-8">
					<input type="text" class="form-control" id="ex3"
						placeholder="enter your last Name">
				</div>
			</div>
			<div class="col-md-4">
				<div class="col-md-6">
					<img src="<c:url value='images/user.png'/>" class="img-circle"
						alt="Photo" width="50" height="50">
				</div>
				<div class="col-md-6">
					<nav aria-label="...">
					<ul class="pager">
						<li><a href="#">Upload photo here</a></li>
					</ul>
					</nav>
				</div>
			</div>
			<div class="col-md-4">
				<div class="col-md-6">
					<img src="<c:url value='images/user.png'/>" class="img-circle"
						alt="Resume" width="50" height="50">
				</div>
				<div class="col-md-6">
					<nav aria-label="...">
					<ul class="pager">
						<li><a href="#">Upload Resume</a></li>
					</ul>
					</nav>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div class="col-md-4">
					<h5>Email ID</h5>
				</div>
				<div class="col-md-8">
					<input type="text" class="form-control" id="ex3"
						placeholder="enter your email Id">
				</div>
			</div>
		</div> --%>

	<div class="container-defalut" style="padding-top: 50px">
		<ul class="nav nav-tabs">
			<li><a data-toggle="tab" href="#home">Personal and
					Communication Details</a></li>
			<li class="active"><a data-toggle="tab" href="#menu1">Education</a></li>
			<li><a data-toggle="tab" href="#menu2">Experience</a></li>
			<li><a data-toggle="tab" href="#menu3">Skills</a></li>
		</ul>
		<div class="tab-content">
			<div id="home" class="tab-pane fade">
				<div class="row">
					<div class="col-md-2">Gender</div>
					<div class="col-md-1">
						<span><input name="gender" type="radio"
							class="form-control" id="ex3" checked="checked"></span><span>Male</span>
					</div>
					<div class="col-md-1">
						<span><input name="gender" type="radio"
							class="form-control" id="ex3"></span><span>Female</span>
					</div>
				</div>
				<div class="row">
					<div class="col-md-2">Mobile Number</div>
					<div class="col-md-2">
						<input type="text" class="form-control" id="ex3"
							placeholder="Mobile Number">
					</div>
				</div>
				<div class="row">
					<div class="col-md-2">Date of Birth</div>
					<div class="col-md-2">
						<input type="text" class="form-control" id="ex3"
							placeholder="Date of Birth">
					</div>
				</div>
				<div class="row">
					<div class="col-md-2">Address1</div>
					<div class="col-md-2">
						<input type="text" class="form-control" id="ex3"
							placeholder="Address1">
					</div>
					<div class="col-md-2">Address2</div>
					<div class="col-md-2">
						<input type="text" class="form-control" id="ex3"
							placeholder="Address2">
					</div>
				</div>
				<div class="row">
					<div class="col-md-2">Country</div>
					<div class="col-md-2">
						<input type="text" class="form-control" id="ex3"
							placeholder="Country">
					</div>
					<div class="col-md-2">State</div>
					<div class="col-md-2">
						<input type="text" class="form-control" id="ex3"
							placeholder="State">
					</div>
				</div>
				<div class="row">
					<div class="col-md-2">City</div>
					<div class="col-md-2">
						<input type="text" class="form-control" id="ex3"
							placeholder="City">
					</div>
					<div class="col-md-2">ZipCode</div>
					<div class="col-md-2">
						<input type="text" class="form-control" id="ex3"
							placeholder="ZipCode">
					</div>
				</div>
			</div>
			<div id="menu1" class="tab-pane fade in active">
				<p>Education</p>
			</div>
			<div id="menu2" class="tab-pane fade">
				<p>Experience</p>
			</div>
			<div id="menu3" class="tab-pane fade">
				<p>Skills</p>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<nav aria-label="...">
				<ul class="pager">
					<li><a href="#">Save</a></li>
					<li><a href="#">Cancel</a></li>
				</ul>
				</nav>
			</div>
		</div>
	</div>
	</div>
	</div>
	<div class="navbar navbar-default navbar-fixed-bottom">
		<div class="container">
			<div class="navbar-text-pull-left">
				<p align="center">&copy2016 Talent Turbo. All Right Received</p>
			</div>
		</div>
	</div>
</body>
</html>