<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<c:url value="/entrada" var="linkEntradaServlet"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <c:import url="logout-parcial.jsp"/>
    
   <form action="${linkentradaServlet}" method ="post">
   
         Nome: <input type ="text" name ="Login" value="${empresa.nome }"/>
         Senha: <input type ="password" name="senha" />
          <input type="hidden" name="acao" value="Login">
          
          
          
          <input type="submit" />
         
         

   </form>


</body>
</html>