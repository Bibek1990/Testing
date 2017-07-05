<html>
<head>
<%@ page isELIgnored="false" %>
	<title>Confirmation</title>
	<link>
	<style>
	h1 {
    color: blue;
    }
    
	#loginDiv {
		margin: auto;
    		width: 50%;
	}
	</style>
</head>
<body>

<div id="loginDiv">
	<h1>Confirmation</h1>
	<table>
	<tr>
		<td><label>Id : </label></td>
		<td>${profile.id}</td>
	</tr>
	<tr>
		<td><label>Name : </label></td>
		<td>${profile.name}</td>
	</tr>
	<tr>
		<td><label>Email : </label></td>
		<td>${profile.email}</td>
	</tr>
	<tr>
		<td><label>Gender : </label></td>
		<td>${profile.gender}</td>
	</tr>
	<tr>
		<td><label>Ssn : </label></td>
		<td>${profile.gender}</td>
	</tr>
	<tr>
		<td><label>State : </label></td>
		<td>${profile.state}</td>
	</tr>
	</table>
  	
</div>
<div id="linkDiv">
  <a href = "addVehicle" >Add Vehicle</a>
  </div>
  </body>
  </html>