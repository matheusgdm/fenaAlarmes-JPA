package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Endereco;
import model.Telefone;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-26T21:40:51")
@StaticMetamodel(CadastroCliente.class)
public class CadastroCliente_ { 

    public static volatile SingularAttribute<CadastroCliente, String> senha;
    public static volatile SingularAttribute<CadastroCliente, Endereco> endereco_cliente;
    public static volatile SingularAttribute<CadastroCliente, String> nome;
    public static volatile SingularAttribute<CadastroCliente, Integer> id;
    public static volatile SingularAttribute<CadastroCliente, String> sobrenome;
    public static volatile SingularAttribute<CadastroCliente, String> nascionalidade;
    public static volatile ListAttribute<CadastroCliente, Telefone> telefones;
    public static volatile SingularAttribute<CadastroCliente, String> email;

}