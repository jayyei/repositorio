/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.kodikas.testformulario2.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mrjay
 */
@WebServlet(name = "servletElementosFormulario", urlPatterns = {"/elementosFormulario"})
public class servletFormulario2 extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String title = "Elementos de formulario";
            
            String docType =
                    "<!DOCTYPE html>";
            out.println(docType +
                    "<html>\n" +
                        "<head><title>" + title + "</title></head>\n" +
                        "<body bgcolor = \"#f0f0f0\">\n" +
                            "<form action = \""+request.getContextPath()+"/recibirformulario\" method = \"POST\">"+
                            "Nombre:<br>"+
                            "<input type=\"text\" name = \"nombre\"><br>"+
                            "Apellido:<br>"+
                            "<input type=\"text\" name=\"apellido\"><br>"+
                            "Usuario:<br>"+
                            "<input type=\"text\" name=\"usuario\"><br>"+
                            "Password:<br>"+
                            "<input type=\"password\" name=\"psw\"><br><br>"+
                            "Seleccione un auto de su preferencia:<br>"+
                            "<select name=\"auto\">"+
                                "<option value=\"volvo\">Volvo</option>"+
                                 "<option value=\"saab\">Saab</option>"+
                                 "<option value=\"fiat\">Fiat</option>"+
                                 "<option value=\"audi\">Audi</option>"+
                            "</select><br>"+
                            "Elija su sexo: <br>"+
                            "<input type=\"radio\" name=\"genero\" value=\"hombre\" checked> Hombre<br>"+
                            "<input type=\"radio\" name=\"genero\" value=\"mujer\"> Mujer<br>"+
                            "Deje un mensaje: <br>"+
                            "<textarea name=\"mensaje\" rows=\"10\" cols=\"30\">"+
                            
                            "</textarea><br>"+
                            "Selecciona tu color favorito:<br>"+
                            "<input type=\"color\" name=\"favcolor\"><br>"+
                            "Fecha de cumpleaños:<br>"+
                            "<input type=\"date\" name=\"bday\"><br>"+
                            "Lenguajes de programacion que conoces: <br>"+
                            "<input type = \"checkbox\" name = \"java\" checked = \"checked\" /> Java"+
                            "<input type = \"checkbox\" name = \"ruby\"  /> Ruby"+
                            "<br>"+
                            "<input type = \"checkbox\" name = \"c#\" checked = \"checked\" /> c#"+
                            "<br>"+
                            "<input type = \"submit\" value = \"Enviar datos\" />"+
                          "</form>"+
                        "</body>"+
                       "</html>"  
                );
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
