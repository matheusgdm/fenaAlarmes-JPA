package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Compra implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_compra;
    @Column(precision = 2)
    private double valor_total_compra;
    @Column
    @Temporal(TemporalType.DATE)
    private Date dataCompra;
    @ManyToOne
    private CadastroCliente cadastrocliente;
    @OneToMany(mappedBy = "compra")
    private List<Produto> produtos = new ArrayList<>();

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public double getValor_total_compra() {
        return valor_total_compra;
    }

    public void setValor_total_compra(double valor_total_compra) {
        this.valor_total_compra = valor_total_compra;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    } 

    public CadastroCliente getCadastrocliente() {
        return cadastrocliente;
    }

    public void setCadastrocliente(CadastroCliente cadastrocliente) {
        this.cadastrocliente = cadastrocliente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id_compra;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compra other = (Compra) obj;
        if (this.id_compra != other.id_compra) {
            return false;
        }
        return true;
    }
    
    
}
