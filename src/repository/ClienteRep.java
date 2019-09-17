package repository;

import model.CadastroCliente;
import util.ConexaoBD;

public class ClienteRep {

    public CadastroCliente logar(String email, String senha) {
        CadastroCliente c = (CadastroCliente) ConexaoBD.getEm().createQuery("select c from CadastroCliente c where c.email = :email and c.senha = :senha").
                setParameter("email", email).setParameter("senha", senha).getSingleResult();
        
        return c;
    }
}
