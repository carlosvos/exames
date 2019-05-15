<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<s:set var="title" value="%{'Novo Exame'}" />
<s:if test="exame.id > 0">
	<s:set var="title" value="%{'Atualizar Exame'}" />
</s:if>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title><s:property value="title" /></title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
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
		<h4><s:property value="title" /></h4>

		<s:form action="salvar" acceptcharset="UTF-8" class="mt-4">
			<div class="form-row">
				<s:hidden name="exame.id" id="idHidden"></s:hidden>
				<div class="form-group col">
					<label for="codigoInput">Código</label> 
					<s:textfield name="exame.codigo" class="form-control" id="codigoInput"></s:textfield>
				</div>
				<div class="form-group col">
					<label for="nomeInput">Nome</label> 
					<s:textfield name="exame.nome" type="text" class="form-control" id="nomeInput"></s:textfield>
				</div>
			</div>
			<div class="form-group">
				<label for="descricaoInput">Descrição</label> 
				<s:textfield name="exame.descricao" type="text" class="form-control" id="descricaoInput"></s:textfield>
			</div>
			<s:submit class="mt-4 mr-3 btn btn-primary btn-lg" value="Salvar"></s:submit>
			
			<s:a class="mt-4 btn btn-secondary btn-lg" role="button" action="exames">
				<i class="mr-2 fas fa-long-arrow-alt-left"></i> Voltar
			</s:a>
		</s:form>
		
		
		</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<script defer src="https://use.fontawesome.com/releases/v5.8.2/js/all.js"
	integrity="sha384-DJ25uNYET2XCl5ZF++U8eNxPWqcKohUUBUpKGlNLMchM7q4Wjg2CUpjHLaL8yYPH"
	crossorigin="anonymous"></script>
</body>
</html>