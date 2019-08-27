package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.CadastroCliente;
import model.Cidade;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-26T21:40:51")
@StaticMetamodel(Endereco.class)
public class Endereco_ { 

    public static volatile SingularAttribute<Endereco, String> bairro;
    public static volatile SingularAttribute<Endereco, String> numero_endereco;
    public static volatile SingularAttribute<Endereco, Cidade> cidades;
    public static volatile SingularAttribute<Endereco, Integer> id_endereco;
    public static volatile SingularAttribute<Endereco, CadastroCliente> cadastrocliente;
    public static volatile SingularAttribute<Endereco, String> rua;
    public static volatile SingularAttribute<Endereco, String> cep;

}