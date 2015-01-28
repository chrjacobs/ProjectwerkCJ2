/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Christel
 */
@Stateless
public class WijntblFacade extends AbstractFacade<Wijntbl> {
    @PersistenceContext(unitName = "DeDruiwekorrelJSF3PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WijntblFacade() {
        super(Wijntbl.class);
    }
    
}
