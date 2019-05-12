<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Lista de Exames</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<h1>Lista de Exames</h1>
	<div class="container">
		<div id="listaDeExames">
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
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>