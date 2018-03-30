/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.FactureElectricite;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sabrine
 */
@Stateless
public class FactureElectriciteFacade extends AbstractFacade<FactureElectricite> {

    @PersistenceContext(unitName = "radeemaProjectPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FactureElectriciteFacade() {
        super(FactureElectricite.class);
    }
    
}
