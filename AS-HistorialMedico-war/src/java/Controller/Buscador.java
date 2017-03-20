/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;

/**
 *
 * @author entrar
 */
public class Buscador extends FrontCommand{

    @Override
    public void proccess() {
        
                /*public class ClientInformation extends HttpServlet
{
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
  {
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
 
    String str = req.getQueryString();
        $sesionquenoessesion = select * where name = str from cliente;;
 
    out.close();
  }
        SI PONES GETQUERYSTIRNG PUEDES PIYAR LA BUSQUEDA EN CUESTION DE ESTA FORMA COMPARARIAS CON LA BD Y tal
        EN CADA .java de controller buscarias algo en concreto, en este caso es el buscador de pacientes.
}*/     
        
        try {
            forward("/Buscador.jsp");
        } catch (ServletException | IOException ex) {
            Logger.getLogger(Buscador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
