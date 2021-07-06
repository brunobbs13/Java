<!DOCTYPE html>
<html>
	<head>
		<title>Agendamento - Boas vindas</title>
	</head>
	<body>
	
	
		<h1>Boas Vindas</h1>
		<p> Agende o seu horário aqui </p>
		

<form action="Agendamento2.jsp" method='POST'>	
 
		 <label for="floatingInput">Nome</label>
		<input type="text" class="form-control" id="UsuaName" name='usuario' placeholder="Bruno Barreto">
     
		<label>Tipo de animal</label>
	 	<input type="text" class="form-control" id="animal" name='escolha' placeholder="Cachorro / Gato">
      
     	<label>Escolha uma data</label>
     	<input type="date" class="form-control" id="data123" name='data' placeholder="12/12/2019">
     	
     	 <button class="botao" type="submit">Entrar</button>
   	 
 </form>
      	
	</body>
</html>