
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Rol"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Rol</h1>
            <a class="btn btn-success" href="ControladorRol?accion=add">Agregar Nuevo</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID ROL</th>
                        <th class="text-center">DESCRIPCIÓN</th>
                    </tr>
                </thead>
                <%
                    RolDAO dao=new RolDAO();
                    List<Rol>list=dao.listar();
                    Iterator<Rol>iter=list.iterator();
                    Rol per=null;
                    while(iter.hasNext()){
                        per=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= per.getId_rol()%></td>
                        <td class="text-center"><%= per.getDesc_rol()%></td>
                        <td class="text-center">
                            <a class="btn btn-warning" href="Controlador?accion=editar&id=<%= per.getId_rol()%>">Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&id=<%= per.getId_rol()%>">Remove</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
                <div class="container">
                    <a class="btn btn-success btn-lg" href="index.jsp">Listar Persona</a>
                </div>
        </div>
    </body>
</html>
