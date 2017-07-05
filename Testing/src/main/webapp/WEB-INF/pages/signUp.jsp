<html>
<head>
<%@ page isELIgnored="false" %>
	<title>Geico Insurance</title>
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
	<h1>Account Information</h1>
	<form action="signUp" method="post">
		<table>
			<tr>
				<td><label>Name : </label></td>
				<td><input type = "text" name = "name"></td>
			</tr>
			<tr>
				<td><label>Email : </label></td>
				<td><input type = "text" name = "email"></td>
			</tr>
			<tr>
				<td><label>Gender : </label></td>
				<td>  <input type="radio" name="gender" value="m"> Male 
  					  <input type="radio" name="gender" value="f"> Female 
  					  <input type="radio" name="gender" value="o"> Other</td>
			</tr>
			<tr>
				<td><label>Ssn  : </label></td>
				<td><input type = "text" name = "ssn"></td>
			</tr>
			<tr>
				<td><label>DrivingLicenseNo  : </label></td>
				<td><input type = "text" name = "drivingLicenseNo"></td>
			</tr>
			<tr>
				<td><label>Address  : </label></td>
				<td><input type = "text" name = "address"></td>
			</tr>
			<tr>
				<td><label>City : </label></td>
				<td><input type = "text" name = "city"></td>
			</tr>
			<tr>
				<td><label>State : </label></td>
				<td>
				<select name = "state">
  					<option value="VA">Virginia</option>
  					<option value="DE">Delaware</option>
  					<option value="NJ">New Jersey</option>
  					<option value="NY">New York</option>
				</select>
				</td>
			</tr>
			
			<tr>
				<td><input type="submit" value = "signUp"></td>
				<td><button type="reset" value="Reset">Reset</button></td>
			</tr>
		</table>
	</form>
  	
</div>

</body>
</html>
