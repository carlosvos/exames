<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Lista de Exames</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

	<header>
		<div class="navbar navbar-dark bg-primary">
			<div class="container">
				<div class="navbar-brand"> 
				<i class="fas fa-clipboard-list"></i> <strong>Exames</strong>
				</div>
			</div>
		</div>
	</header>

	<div class="mt-4 container">
		<h4>Lista de Exames</h4>
		
		<div id="listaDeExames" class="mt-4">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>Código</th>
						<th>Nome</th>
						<th>Descrição</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<s:iterator value="exames">
					<tr>
						<td><s:property value="codigo" /></span></td>
						<td><s:property value="nome" /></span></td>
						<td><s:property value="descricao" /></span></td>
						<td>
							<s:url action="carregar" var="urlTagEdit" >
							    <s:param name="exameId"><s:property value="id" /></s:param>
							</s:url>
							<s:a href="%{urlTagEdit}">
								<i class="fas fa-edit"></i>
							</s:a>
						</td>
						<td>
							<s:url action="remover" var="urlTagRemove" >
							    <s:param name="exameId"><s:property value="id" /></s:param>
							</s:url>
							<s:a href="%{urlTagRemove}">
								<i class="fas fa-trash"></i>
							</s:a>
						</td>
					</tr>
				</s:iterator>
			</table>

			<s:a class="mt-4 btn btn-primary btn-lg" role="button" action="carregar">
				<i class="mr-2 fas fa-plus"></i> Novo Exame
			</s:a>
			
		</div>
		</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script defer src="https://use.fontawesome.com/releases/v5.8.2/js/all.js" integrity="sha384-DJ25uNYET2XCl5ZF++U8eNxPWqcKohUUBUpKGlNLMchM7q4Wjg2CUpjHLaL8yYPH" crossorigin="anonymous"></script>

</body>
</html>