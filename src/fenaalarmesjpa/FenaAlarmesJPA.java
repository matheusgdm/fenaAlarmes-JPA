package fenaalarmesjpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.CadastroCliente;

public class FenaAlarmesJPA {

    static EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("FenaAlarmesJPAPU");
        
       static EntityManager em = emf.createEntityManager();
    
    public static void main(String[] args) {
        
    }

}
