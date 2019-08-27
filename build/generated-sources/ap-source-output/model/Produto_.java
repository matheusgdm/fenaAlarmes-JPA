package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Compra;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-08-26T21:40:51")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, Double> valor_produto;
    public static volatile SingularAttribute<Produto, Compra> compra;
    public static volatile SingularAttribute<Produto, String> nome_produto;
    public static volatile SingularAttribute<Produto, Integer> quantidade_produto;
    public static volatile SingularAttribute<Produto, Integer> id_produto;

}