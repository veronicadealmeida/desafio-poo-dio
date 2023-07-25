package br.com.dio.desafio.dominio.conteudo;

import br.com.dio.desafio.dominio.CalcularXp;

public abstract class Conteudo implements CalcularXp {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
