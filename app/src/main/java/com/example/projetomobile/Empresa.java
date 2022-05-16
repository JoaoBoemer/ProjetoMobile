package com.example.projetomobile;

public class Empresa {

    protected int cnpj;
    protected String razaoSocial;
    protected String nomeFantasia;
    protected String email;
    protected int cep;
    protected String uf;
    protected String municipio;
    protected int telefone;

    public Empresa(int cnpj, String razaoSocial, String nomeFantasia, String email, int cep, String uf, String municipio, int telefone){
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.email = email;
        this.cep = cep;
        this.uf = uf;
        this.municipio = municipio;
        this.telefone = telefone;
    }
}
