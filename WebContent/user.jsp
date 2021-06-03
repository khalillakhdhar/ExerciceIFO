<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Gestion des utilisateurs</title>
</head>
<body>
<div class="container">
  <div class="row">
    <div class="col">
    </div>
    <div class="col">
<form action="UserServlet" method="post">
  <div class="mb-3">
    <label for="exampleInputnom1" class="form-label">nom </label>
    <input type="text" required pattern="[a-z A-Z]{4,30}"  name="nom" class="form-control" id="exampleInputnom1" >
  </div>
  <div class="mb-3">
    <label for="prenom" class="form-label">Prenom</label>
    <input type="text" pattern="[a-z A-Z]{4,30}"  name="prenom" class="form-control" id="pr">
  </div>
  <div class="mb-3">
    <label for="login" class="form-label">Login</label>
    <input type="text"   name="login" class="form-control" id="login">
  </div>
  <div class="mb-3">
    <label for="tel" class="form-label">Mot de passe</label>
    <input type="text"   name="mdp" class="form-control" id="mdp">
  </div>
   

  <button type="submit" class="btn btn-primary">Ajouter</button>
</form>  
<% if(request.getAttribute("erreur")!=null)
	{%>
<div>
<h3>
<%=request.getAttribute("erreur") %></h3>
</div>
<%
	}
%>
  </div>
    <div class="col">
      
    </div>
  </div>
</div>


</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>

</html>