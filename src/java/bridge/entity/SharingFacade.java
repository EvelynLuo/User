/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bridge.entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @date    2019-9-2 14:04:47
 * @author  luoe
 */
@Stateless
public class SharingFacade extends AbstractFacade<Sharing> {

    @PersistenceContext(unitName = "bridgePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SharingFacade() {
        super(Sharing.class);
    }

}
