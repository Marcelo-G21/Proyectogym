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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author srtel
 */
public class InsertarUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            RequestDispatcher requestDispatcher = null;
            String rut, nombre, apellido, correo, direccion, username, password, sub, resp;
            int fono, tipologin;
            
            rut = request.getParameter("rut");
            nombre = request.getParameter("nombre");
            apellido = request.getParameter("apellido");
            correo = request.getParameter("correo");
            fono = Integer.parseInt(request.getParameter("fono"));
            direccion = request.getParameter("direccion");
            username = request.getParameter("username");
            password = request.getParameter("password");
            sub = request.getParameter("sub");
            tipologin = 0;
            
            //En case de que en un futuro se implemente otro submit de insertado (Entrenador),
            //el switch permitirá darle el valor correspondiente a tipologin
            switch (sub){ 
                case "Ingresar Usuario":
                    tipologin = 3;
                break;
            }
            
            Usuario usuario = new Usuario();
            DaoUsuario daoUsuario = new DaoUsuario();
            
            daoUsuario.setRut(rut);
            daoUsuario.setNombre(nombre);
            daoUsuario.setApellido(apellido);
            daoUsuario.setCorreo(correo);
            daoUsuario.setFono(fono);
            daoUsuario.setDireccion(direccion);
            daoUsuario.setUsername(username);
            daoUsuario.setPassword(password);
            daoUsuario.setTipologin(tipologin);
            
            resp = usuario.InsertarUsuario(daoUsuario);
            
            request.setAttribute("resp", resp);
            requestDispatcher = request.getRequestDispatcher("VistaMensaje.jsp");
            requestDispatcher.forward(request, response);
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
