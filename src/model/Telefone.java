package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Telefone implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_telefone;
    @Column(length = 20)
    private String numero_telefone;
    @ManyToOne
    private CadastroCliente cadastrocliente;

    public int getId_telefone() {
        return id_telefone;
    }

    public void setId_telefone(int id_telefone) {
        this.id_telefone = id_telefone;
    }

    public String getNumero_telefone() {
        return numero_telefone;
    }

    public void setNumero_telefone(String numero_telefone) {
        this.numero_telefone = numero_telefone;
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
        hash = 89 * hash + this.id_telefone;
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
        final Telefone other = (Telefone) obj;
        if (this.id_telefone != other.id_telefone) {
            return false;
        }
        return true;
    }
    
    
}
