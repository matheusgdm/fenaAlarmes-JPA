package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Endereco implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_endereco;
    @Column(name = "nome_rua", length = 50)
    private String rua;
    @Column
    private String bairro;
    @Column
    private String cep;
    @Column
    private String numero_endereco;
    @ManyToOne
    private CadastroCliente cadastrocliente;
    @ManyToOne
    private Cidade cidades;
    

    public int getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero_endereco() {
        return numero_endereco;
    }

    public void setNumero_endereco(String numero_endereco) {
        this.numero_endereco = numero_endereco;
    }

    public CadastroCliente getCadastrocliente() {
        return cadastrocliente;
    }

    public void setCadastrocliente(CadastroCliente cadastrocliente) {
        this.cadastrocliente = cadastrocliente;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.id_endereco;
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
        final Endereco other = (Endereco) obj;
        if (this.id_endereco != other.id_endereco) {
            return false;
        }
        return true;
    }
    
    
}
