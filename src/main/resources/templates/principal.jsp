<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="navbar navbar-inverse navbar-fixed-top"
		th:fragment="header">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".nav-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" th:href="@{/principal}">Sistema de Venda</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="#" th:href="@{/clientes}">Clientes</a></li>
					<li><a href="#" th:href="@{/produtos}">Produtos</a></li>
					<li><a href="#" th:href="@{/vendas}">Vendas</a></li>
				</ul>

			</div>
		</div>
	</div>

</body>

</html>