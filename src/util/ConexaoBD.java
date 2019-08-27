package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexaoBD {
    static EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("FenaAlarmesJPAPU");
        
       static EntityManager em = emf.createEntityManager();

    public static EntityManager getEm() {
        return em;
    }
}
