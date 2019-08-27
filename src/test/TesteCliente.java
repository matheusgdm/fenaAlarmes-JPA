package test;

import java.util.ArrayList;
import java.util.List;
import model.CadastroCliente;
import model.Telefone;
import util.ConexaoBD;

public class TesteCliente {
    public static void main(String[] args) {
        CadastroCliente cli = new CadastroCliente();
        cli.setNome("testewww");
        
        Telefone tel1 = new Telefone();
        tel1.setNumero_telefone("3333-3333");
        tel1.setCadastrocliente(cli);
        
        Telefone tel2 = new Telefone();
        tel2.setNumero_telefone("6666-6666");
        tel2.setCadastrocliente(cli);
        
        List<Telefone> telefones = new ArrayList<>();
        telefones.add(tel1);
        telefones.add(tel2);
                
        
        
        cli.setTelefones(telefones);
        
        ConexaoBD.getEm().persist(cli);
        ConexaoBD.getEm().getTransaction().begin();
        ConexaoBD.getEm().getTransaction().commit();
        
    }
}
