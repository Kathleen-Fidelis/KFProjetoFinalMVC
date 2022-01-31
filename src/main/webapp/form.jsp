<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-success mb-5">
	  <div class="container-fluid">
	    <a class="navbar-brand" href="#">RaiaDrogasil</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    <div class="collapse navbar-collapse" id="navbarSupportedContent">
	      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
	        <li class="nav-item">
	          <a class="nav-link active" aria-current="page" href="#">Usuário</a>
	        </li>
	      </ul>
	    </div>
	  </div>
	</nav>

	<div class="container w-50" style="outline: 1px solid #cccccc;">
		<form method="post" action="ProjetoFinalServlet">
		 <h1 class="mt-3">Adicionar usuário</h1>
		 <input type="hidden" name="id" value=${id}>
		  <div class="mb-3">
		    <label for="exampleInputNome1" class="form-label">Nome</label>
		    <input type="text" class="form-control" name="nome" value=${nome}>
		  </div>
		  <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Email</label>
		    <input type="email" class="form-control" name="email" value=${email}>
		  </div>
		  <div class="mb-3">
		    <label for="exampleInputPais" class="form-label">País</label>
		    <input type="text" class="form-control" name="pais" value=${pais}>
		  </div>
		  <a href="index.jsp"><button type="submit" class="btn btn-primary col-2 mb-3">Salvar</button></a>
		</form>
	</div>
</body>
</html>