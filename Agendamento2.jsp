<html>

<head>
    <title>Bem-vindo ao nosso site</title>
</head>

<body>
  
   <%   
        String nome=request.getParameter("usuario");  
    	String escolha=request.getParameter("escolha");
		String date=request.getParameter("data");
        
        
        session.setAttribute("identiicadordapessoa",nome);
        
    %>
    <p>Olá, <%=nome%>, o animal escolhida foi: <%=escolha%>. Sendo assim a data do agendamento foi: <%=date%></p>
  
</body>

</html>