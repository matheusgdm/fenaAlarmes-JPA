package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.CadastroCliente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-26T21:40:51")
@StaticMetamodel(Telefone.class)
public class Telefone_ { 

    public static volatile SingularAttribute<Telefone, Integer> id_telefone;
    public static volatile SingularAttribute<Telefone, CadastroCliente> cadastrocliente;
    public static volatile SingularAttribute<Telefone, String> numero_telefone;

}