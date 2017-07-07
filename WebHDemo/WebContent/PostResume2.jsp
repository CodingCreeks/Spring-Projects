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
</head>
<!-- <body style='margin: 30px'> -->
<body>
	<div class="container-fulid" id="menu1">
		<nav class="navbar navbar-default">
		<div class="navbar-header">
			<a class="navbar-brand" href="PostResume.jsp">TalentTurbo</a>
		</div>
		<div class="collapse navbar-collapse" id="myNavbar">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><i class="fa fa-bell-o"></i><span
						class="badge">4</span></a></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-out"></span></a></li>
			</ul>
		</div>
		</nav>
	</div>
	<fieldset>
		<legend>
			<a href="#"><i class="fa fa-home"></i></a> <span
				class="fa fa-angle-right"></span> Post Resume
		</legend>
	</fieldset>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span8">
				<form class="form-horizontal">
					<div class="control-group">
						<label class="control-label">Field 1</label>
						<div class="controls">
							<input type="text" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">Field 2</label>
						<div class="controls">
							<div class="input-append">
								<input type="text" /> <span class="add-on">%</span>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<form class="form-horizontal">
		<fieldset>
			<legend>Legend</legend>
			<div class="form-group">
				<label for="inputEmail" class="col-md-2 control-label">Email</label>
				<div class="col-md-4">
					<input class="form-control" id="inputEmail" placeholder="Email"
						type="text">
				</div>
			</div>
			<div class="form-group">
				<label for="inputPassword" class="col-md-2 control-label">Password</label>
				<div class="col-md-4">
					<input class="form-control" id="inputPassword"
						placeholder="Password" type="password">
					<div class="checkbox">
						<label> <input type="checkbox"> Checkbox
						</label>
					</div>
				</div>
			</div>
			<div class="form-group">
				<label for="textArea" class="col-lg-2 control-label">Textarea</label>
				<div class="col-lg-10">
					<textarea class="form-control" rows="3" id="textArea"></textarea>
					<span class="help-block">A longer block of help text that
						breaks onto a new line and may extend beyond one line.</span>
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-2 control-label">Radios</label>
				<div class="col-lg-10">
					<div class="radio">
						<label> <input name="optionsRadios" id="optionsRadios1"
							value="option1" checked="" type="radio"> Option one is
							this
						</label>
					</div>
					<div class="radio">
						<label> <input name="optionsRadios" id="optionsRadios2"
							value="option2" type="radio"> Option two can be something
							else
						</label>
					</div>
				</div>
			</div>
			<div class="form-group">
				<label for="select" class="col-lg-2 control-label">Qualification</label>
				<div class="col-lg-4">
					<select class="form-control" id="select">
						<option>Select</option>
						<option>CA</option>
						<option>cs</option>
						<option>icwa</option>
						<option>M.A</option>
						<option>MCA</option>
						<option>M.Ed</option>
					</select> <br> <label for="select2" class="col-lg-2 control-label">Specialization</label>
					<div class="col-lg-4">
						<select multiple="" class="form-control" id="select2">
							<option>Computer</option>
							<option>Chemical</option>
							<option>Civil</option>
							<option>Electrical</option>
							<option>5</option>
						</select>
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-lg-10 col-lg-offset-2">
					<button type="reset" class="btn btn-default">Cancel</button>
					<button type="submit" class="btn btn-primary">Submit</button>
				</div>
			</div>

		</fieldset>
	</form>
	<div class="navbar navbar-default navbar-fixed-bottom">
		<div class="container">
			<div class="navbar-text-pull-left">
				<p align="center">&copy2016 TalentTurbo. All Right Received</p>
			</div>
		</div>
	</div>
</body>
</html>