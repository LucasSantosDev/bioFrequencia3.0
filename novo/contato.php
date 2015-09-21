<?php
	@$template = $_GET['template'];
			if ($template == '') {$template = '';}
			else {$template = '(Template : ' . $template . ') - ';}
 ?>
<!-- HEADER E MENU -->
<?php require_once 'header.php';?>
<!-- FIM DO HEADER E MENU -->
		<!-- BANNER -->
		<div class="container banner">
			<?php require_once 'banner-contato.php'; ?>
		</div>
		<!-- FIM DO BANNER -->

		<!-- CONTEUDO CENTRAL -->
		<div class="container">
			<!-- BARRA CENTRAL -->
			<div class="row barra">
				<div class="col-md-12"></div>
			</div>
			<!-- FIM DA BARRA CENTRAL -->
			<div class="row conteudo-contato-central">
				<h2>ENVIE-NOS UM EMAIL</h2>
				<form  class="form-horizontal" action="envia-contato.php" method="post">
					<table class="table table-bordered">
						<div class="form-group">
							<tr>
								<td>
									<div class="input-group">
										<div class="input-group-addon">NOME</div>
										<input class="form-control" type="text" name="nome" placeholder="NOME DO USUARIO" required>
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="input-group">
										<div class="input-group-addon">EMAIL</div>
										<input class="form-control" type="email" name="email" placeholder="EMAIL DO USUARIO" required>
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="input-group">
										<div class="input-group-addon">MENSAGEM</div>
										<textarea id="content" maxlength="200" class="form-control maxlength" name="mensagem" placeholder="" rows="5" required><?=$template;?></textarea>
										<div class="input-group-addon"><span id="content-countdown" title="200">200</span></div>
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<a href="#" class="btn-contato"><button class="btn btn-primary botao" type="submit">ENVIAR</button></a>
								</td>
							</tr>
						</div>
					</table>
				</form>
			</div>
		</div>
		<!-- FIM DO CONTEUDO CENTRAL -->

<!-- RODAPE -->
<?php require_once 'footer.php'; ?>
<!-- FIM DO RODAPE -->