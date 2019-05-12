<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Lista de Exames</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
	<h1>Lista de exames</h1>
	<div class="container">
		<div id="listaDeConvidados">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Código</th>
						<th>Nome</th>
						<th>Descrição</th>
					</tr>
				</thead>
				<s:iterator value="exames">
					<tr>
						<td style="display: none"><s:property value="id" /></td>
						<td><s:property value="codigo" /></span></td>
						<td><s:property value="nome" /></span></td>
						<td><s:property value="descricao" /></span></td>
					</tr>
				</s:iterator>
			</table>
		</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>