<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta charset="utf-8"> -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Post Resume</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
<script src="css/respond.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<link rel="stylesheet" href="css/style.css">

</head>
<body>
	<!--header Start  -->
	<header class="row"><!--1st Container Start  -->
	<div class="container-fluid">

		<!-- Brand and toggle get grouped for better mobile display -->
		<nav class="navbar navbar-default" role="navigation">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-tt-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">TalentTurbo</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse navbar-tt-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><i class="fa fa-bell-o"></i><span
						class="badge">4</span></a></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-out"></span></a></li>

			</ul>
		</div>
		</nav>
		<!-- /.navbar-collapse -->
	</div>
	<!--1st Container End  --> </header>
	<!--header End  -->

	<!--2nd Container Start  -->
	<div class="container-fluid">
		<!--1st Row Start  -->
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><i class="fa fa-home"></i></a></li>
				<li><a href="#"><span class="fa fa-angle-right"></span></a></li>
				<li><a href="#"></a>Post Resume</li>
			</ol>
		</div>
		<!--1st Row End  -->
		<!--form Start  -->
		<form class="form-horizontal">
			<!--2nd Row Start  -->
			<div class="row">
				<div class="col-md-6">
					<h4>Post Resume</h4>
				</div>
				<div class="col-md-3 col-md-offset-3">
					<div class="form-group">
						<div class="col-md-5">
							<small>Profile Completion:<b> 40%</b></small>
						</div>
						<div class="col-md-6">
							<div class="progress" style="">
								<div class="progress-bar progress-bar-warning"
									id="inputprogressbar" role="progressbar" aria-valuenow="40"
									aria-valuemin="0" aria-valuemax="100" style="width: 40%">40%</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--2nd Row End  -->
			<!--3rd Row Start  -->
			<div class="row">
				<div class="col-md-6">
					<div class="form-group">
						<label for="inputFirstName" class="col-md-2 control-label">First
							Name</label>
						<div class="col-md-4">
							<input class="form-control" id="inputFirstName"
								placeholder="First Name" type="text">
						</div>
					</div>
					<div class="form-group">
						<label for="inputLastName" class="col-md-2 control-label">Last
							Name</label>
						<div class="col-md-4">
							<input class="form-control" id="inputLastName"
								placeholder="Last Name" type="text">
						</div>
					</div>
					<div class="form-group">
						<label for="inputEmailID" class="col-md-2 control-label">Email
							ID</label>
						<div class="col-md-4">
							<input class="form-control" id="inputEmailID"
								placeholder="Email ID" type="text">
						</div>
					</div>
				</div>
				<div class="col-md-6">
					<div class="col-md-6">
						<img style="float: left" src="<c:url value='images/user.png'/>"
							class="img-responsive img-circle img-thumbnail" alt="Photo"
							width="75" height="75">
						<nav aria-label="...">
						<ul class="pager">
							<li><a href="#">Upload photo</a></li>
						</ul>
						</nav>
					</div>
					<div class="col-md-6">
						<img style="float: left" src="<c:url value='images/resume.png'/>"
							class="img-responsive img-circle img-thumbnail" alt="Resume"
							width="75" height="75">
						<nav aria-label="...">
						<ul class="pager">
							<li><a href="#">Upload Resume </a></li>
						</ul>
					</div>
				</div>
			</div>
			<!--3rd Row End  -->

			<!--Container Default Start  -->
			<div class="container-default">
				<!--4th Row End  -->
				<!--5th Row Start  -->
				<div class="row"></div>
				<!--Panel Body Start  -->
				<div class="panel panel-body">
					<div class="form-group">
						<ul class="nav nav-tabs">
							<li class="active"><a href="#PersonalCommunication"
								data-toggle="tab">Personal & Communication</a></li>
							<li><a href="#Education" data-toggle="tab">Education</a></li>
							<li><a href="#Experience" data-toggle="tab">Experience</a></li>
							<li><a href="#Skills" data-toggle="tab">Skills</a></li>
						</ul>
					</div>
					<!-- Tab panes  -->
					<div class="tab-content">
						<div class="tab-pane active" id="PersonalCommunication">
							<div class="form-group">
								<div class="col-md-12">
									<div class="col-md-4">
										<label for="genderRadios" class="col-md-4 control-label">Gender</label>
										<div class="col-md-6 col-md-offset-1">
											<div class="radio">
												<div class="col-md-6">
													<input type="radio" name="gender" id="genderRadios"
														value="Male" checked="checked">Male
												</div>
												<div class="col-md-6">
													<input type="radio" name="gender" id="genderRadios"
														value="Female">Female
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="col-md-12">
								<div class="col-md-4">
									<div class="form-group">
										<label for="inputMobileNumber" class="col-md-4 control-label">Mobile
											Number</label>
										<div class="col-md-6">
											<input class="form-control" id="inputMobileNumber"
												placeholder="Mobile Number" type="text">
										</div>
									</div>
								</div>
							</div>
							<div class="col-md-12">
								<div class="col-md-4">
									<div class="form-group">
										<label for="inputDataOfBirth" class="col-md-4 control-label">DataOf
											Birth</label>
										<div class="col-md-6">
											<input class="form-control" id="inputDataOfBirth"
												placeholder="DD/MM/YYYY" type="text">
										</div>
									</div>
								</div>
							</div>
							<div class="col-md-12">
								<div class="col-md-4">
									<div class="form-group">
										<label for="inputAddress1" class="col-md-4 control-label">Address
											1</label>
										<div class="col-md-6">
											<input class="form-control" id="inputAddress1"
												placeholder="Address 1" type="text">
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label for="inputAddress2" class="col-md-4 control-label">Address
											2</label>
										<div class="col-md-6">
											<input class="form-control" id="inputAddress2"
												placeholder="Address 2" type="text">
										</div>
									</div>
								</div>
							</div>
							<div class="col-md-12">
								<div class="col-md-4">
									<div class="form-group">
										<label for="inputCountry" class="col-md-4 control-label">Country</label>
										<div class="col-md-6">
											<input class="form-control" id="inputCountry"
												placeholder="Country" type="text">
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label for="inputState" class="col-md-4 control-label">State</label>
										<div class="col-md-6">
											<input class="form-control" id="inputState"
												placeholder="State" type="text">
										</div>
									</div>
								</div>
							</div>
							<div class="col-md-12">
								<div class="col-md-4">
									<div class="form-group">
										<label for="inputCity" class="col-md-4 control-label">City</label>
										<div class="col-md-6">
											<input class="form-control" id="inputCity" placeholder="City"
												type="text">
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label for="inputZipCode" class="col-md-4 control-label">ZipCode</label>
										<div class="col-md-6">
											<input class="form-control" id="inputZipCode"
												placeholder="ZipCode" type="text">
										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- Start of Education tab-pane -->
						<div class="tab-pane" id="Education">
							<div class="col-md-12">
								<div class="col-md-4">
									<div class="form-group">
										<label for="Qualification" class="col-md-4 control-label">Qualification</label>
										<div class="col-md-6">
											<select class="form-control" id="Qualification">
												<option>Select</option>
												<option>CA</option>
												<option>cs</option>
												<option>icwa</option>
												<option>M.A</option>
												<option>MCA</option>
												<option>M.Ed</option>
											</select>
										</div>
									</div>
								</div>
							</div>
							<div class="col-md-12">
								<div class="col-md-4">
									<div class="form-group">
										<label for="Specialization" class="col-md-4 control-label">Specialization</label>
										<div class="col-md-6">
											<select multiple="" class="form-control" id="Specialization">
												<option>Computer</option>
												<option>Chemical</option>
												<option>Civil</option>
												<option>Electrical</option>
											</select>
										</div>
									</div>
								</div>
							</div>
							<div class="col-md-12">
								<div class="col-md-4">
									<div class="form-group">
										<label for="inputGrade" class="col-md-4 control-label">Grade</label>
										<div class="col-md-6">
											<input class="form-control" id="inputGrade"
												placeholder="Grade" type="text">
										</div>
									</div>
								</div>
							</div>
							<div class="col-md-12">
								<div class="col-md-4">
									<div class="form-group">
										<label for="inputUniversityInstitute"
											class="col-md-4 control-label"> University /
											Institute</label>
										<div class="col-md-6">
											<input class="form-control" id="inputUniversityInstitute"
												placeholder="University / Institute" type="text">
										</div>
									</div>
								</div>
							</div>
							<div class="col-md-12">
								<div class="col-md-4">
									<div class="form-group">
										<label for="inputYear" class="col-md-4 control-label">Year</label>
										<div class="col-md-6">
											<input class="form-control" id="inputYear" placeholder="Year"
												type="text">
										</div>
									</div>
								</div>
							</div>
						</div>
						<!--End of Education tab-pane -->
						<div class="tab-pane" id="Experience">
							<!-- Experience tab Content -->

							<div class="form-group">
								<label for="textArea" class="col-md-2 control-label">Textarea</label>
								<div class="col-md-10">
									<textarea class="form-control" rows="3" id="textArea"></textarea>
									<span class="help-block">A longer block of help text
										that breaks onto a new line and may extend beyond one line.</span>
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-2 control-label">Radios</label>
								<div class="col-md-10">
									<div class="radio">
										<label> <input name="optionsRadios"
											id="optionsRadios1" value="option1" checked="" type="radio">
											Option one is this
										</label>
									</div>
									<div class="radio">
										<label> <input name="optionsRadios"
											id="optionsRadios2" value="option2" type="radio">
											Option two can be something else
										</label>
									</div>
								</div>
							</div>
						</div>
						<div class="tab-pane" id="Skills">
							<!-- Skills tab Content -->
						</div>
					</div>
				</div>
				<!--Panel Body End  -->
				<!-- <div class="panel-footer">
					<div class="form-group">
						<nav aria-label="...">
						<ul class="pager">
							<li><a href="#" type="submit">Save</a></li>
							<li><a href="#" type="reset">Cancel</a></li>
						</ul>
						</nav>
					</div>
				</div> -->
				<!--6th Row Start  -->
				<div class="row row-offset-1">
					<div class="form-group">
						<nav aria-label="...">
						<ul class="pager">
							<li><a href="#" type="submit">Save</a></li>
							<li><a href="#" type="reset">Cancel</a></li>
						</ul>
						</nav>
					</div>
				</div>
				<!--6th Row End  -->

			</div>
			<!--Container Default End  -->

		</form>
		<!--form End  -->
	</div>
	<!--2nd Container End  -->

	<!--footer Start  -->
	<footer class="row">
	<p>
		<small>&copy2016 TalentTurbo. All Right Received</small>
	</p>
	</footer>
	<!--footer End  -->
</body>
</html>