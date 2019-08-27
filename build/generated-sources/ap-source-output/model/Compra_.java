package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.CadastroCliente;
import model.Produto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-26T21:40:51")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Double> valor_total_compra;
    public static volatile SingularAttribute<Compra, Integer> id_compra;
    public static volatile ListAttribute<Compra, Produto> produtos;
    public static volatile SingularAttribute<Compra, CadastroCliente> cadastrocliente;
    public static volatile SingularAttribute<Compra, Date> dataCompra;

}