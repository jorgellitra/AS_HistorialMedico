/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import conf.Recetas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author entrar
 */
@Stateless
public class RecetasFacade extends AbstractFacade<Recetas> {
    @PersistenceContext(unitName = "AS-HistorialMedico-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RecetasFacade() {
        super(Recetas.class);
    }
    
}
