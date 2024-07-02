<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sistema Contas - Autenticar</title>

<!-- inclusao do bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body class="bg-secondary">

	<div class="row mt-5">
		<div class="col-md-4 offset-md-4">
			<div class="card">
				<div class="card-body text-center">
					<h4>Sistema de controle de contas</h4>
					<p>Autenticacao de usuarios.</p>
					<hr>
					<p>Entre com suas credenciais de acesso:</p>
					
					<form class="text-start">
						<div class="mt-2">
							<label>Entre com seu email:</label>
							<input type="text" class="form-control" placeholder="Digite com seu email" />
						</div>
						<div class="mt-2">
							<label>Entre com sua senha:</label>
							<input type="password" class="form-control" placeholder="Digite com sua senha" />
						</div>					
						<div class="mt-2 d-grid">
							<input type="submit" value="Acessar Sistema" class="btn btn-primary"/>
						</div>
						<div class="mt-2 d-grid">
							<a href="/javaContasMvc/criar-usuario" class="btn btn-light">
								Nao possui conta? <strong>Cadastre-se aqui!</strong>
							</a>
						</div>
					</form>
				</div>
			</div>
			</div>
		</div>
		<!-- JavaScript -->
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>