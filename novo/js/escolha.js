function inicia() {
	escolha = 'vazia';
}

function escolhe(layout) {
	escolha = layout;
}

function escolheTemplate() {
	if (escolha == 'vazia'){
		alert('<center>'+'Opa! Nada selecionado.'+'</center>'+'\nSelecione um template antes de clicar em "ESCOLHI"!');
	} else if (escolha != 'vazia') {
		document.formulario.action="contato.php?template="+escolha;
		document.formulario.submit();
	}
}