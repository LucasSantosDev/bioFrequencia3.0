<?php
	session_start();
	@$nome = $_POST['nome'];
	@$email = $_POST['email'];
	@$assunto = $_POST['email'];
	@$mensagem = $_POST['mensagem'];

	require_once 'phpmailer/PHPMailerAutoload.php';

	$mail = new PHPMailer();
	$mail->setLanguage('pt', 'phpmailer/language/phpmailer.lang-pt.php');
	$mail->isSMTP();
	//$mail->SMTPDebug = 0;		// Debugar: 1 = erros e mensagens, 2 = mensagens apenas
	$mail->Host = 'smtp.live.com'; //'mail.empresasgrupogrand.com.br';
	$mail->Port = 587; //465
	$mail->SMTPSecure = false; //ssl
	$mail->SMTPAuth = true;
	$mail->Username = 'lucas_ss.arts@live.com';
	$mail->Password = '9559smurf';

	$mail->setFrom($email, $assunto);
	$mail->addAddress('lucas_ss.arts@live.com');
	$mail->Subject = $assunto;
	$mail->msgHTML('<html>De: <b>' . $nome . '</b><br>Email:<b> '. $email . '</b><br>Assunto:<b> ' . $assunto . '</b><br>Mensagem:<b> '. $mensagem . '</b></html>');
	$mail->AltBody = 'De: "$nome"\nEmail: "$email"\nAssunto: "$assunto"\nMensagem: "$mensagem"';

	if ($mail->send()) {
		$_SESSION['success'] = 'Mensagem enviada com sucesso!';
		header("Location:contato.php");
	} else {
		$_SESSION['danger'] = 'Erro ao enviar a mensagem ' . $mail->ErrorInfo;
		header("Location:contato.php");
	}
	die();