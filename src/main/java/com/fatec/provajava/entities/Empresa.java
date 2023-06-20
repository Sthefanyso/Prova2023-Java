package com.fatec.provajava.entities;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Empresa {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id; 


    private String nome; 
    private String endereco; 
    private Integer contato; 
    private String atividade; 

    @Column(unique = true)
    Integer cnpj;

    public Empresa(){

    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Integer getContato() {
        return contato;
    }
    public void setContato(Integer contato) {
        this.contato = contato;
    }
    public String getAtividade() {
        return atividade;
    }
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    public Integer getCnpj() {
        return cnpj;
    }
    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }


    
}
