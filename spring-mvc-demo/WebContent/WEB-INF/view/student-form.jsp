<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Student Registration Form</title>
	</head>
	<body>
	
		<form:form action="processForm" modelAttribute="student">
		
		First Name: <form:input path="firstName" />
		
		<br><br>
		
		Last Name: <form:input path="lastName" />
		
		<br><br>
		
		Country:
		
	    <form:select path="country"> 
	    
	    	<form:options items="${theCountryOptions}" />
	    
	    </form:select>
		
		<br><br>
		
		Favorite Language:

		<form:radiobuttons path="favoriteLanguage" items="${theFavoriteLanguageOptions}"  />
		
		<br><br>
		
		Operating Systems:
		
		<form:checkboxes path="operatingSystems" items="${theOperatingSystemsOptions}"  />
		
		<br><br>
				
		<input type="submit" value="Submit" />
		
		</form:form>
	
	</body>
</html>