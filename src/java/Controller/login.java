/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.DaoUsuario;
import Model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author srtel
 */
public class login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher requestDispatcher = null;
        String usuario, password, resp;
        int tipologin;
        
        DaoUsuario daoUsuario = new DaoUsuario();
        Usuario user = new Usuario();
        
        usuario = request.getParameter("usuario");
        password = request.getParameter("password");
        tipologin = Integer.parseInt(request.getParameter("tipologin"));
        
        daoUsuario.setUsername(usuario);
        daoUsuario.setPassword(password);
        daoUsuario.setTipologin(tipologin);
        
        List<DaoUsuario> datosLogin = user.login(daoUsuario);
        
        if(datosLogin == null || datosLogin.isEmpty()){
            resp = "Usuario o contraseña incorrectos.";
            request.setAttribute("resp", resp);
            requestDispatcher = request.getRequestDispatcher("VistaMensaje.jsp");
            requestDispatcher.forward(request, response);
        }else{
            switch (tipologin) {
                case 1:
                    request.setAttribute("datosLogin", datosLogin);
                    requestDispatcher = request.getRequestDispatcher("Administracion.jsp");
                    requestDispatcher.forward(request, response);
                    break;
                case 2:
                    request.setAttribute("datosLogin", datosLogin);
                    requestDispatcher = request.getRequestDispatcher("PerfilEntrenador.jsp");
                    requestDispatcher.forward(request, response);
                    break;
                case 3:
                    request.setAttribute("datosLogin", datosLogin);
                    requestDispatcher = request.getRequestDispatcher("PerfilUsuario.jsp");
                    requestDispatcher.forward(request, response);
                    break;
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
