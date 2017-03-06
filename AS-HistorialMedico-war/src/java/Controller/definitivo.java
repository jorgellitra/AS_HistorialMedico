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
public class definitivo extends FrontCommand{

    @Override
    public void proccess() {
        //Artist art = Artist.find(request.getParameter("name"));
        //request.setAttribute("helper", new ArtistHelper(art));
        try {
            forward("/definitivo.jsp");
        } catch (ServletException ex) {
            Logger.getLogger(definitivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(definitivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
