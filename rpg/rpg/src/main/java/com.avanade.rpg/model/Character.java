package com.avanade.rpg.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


@Table(name = "TB_Character")
@Entity
public class Character implements Serializable {

    private static final long serialVersionUID = 1l;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    private String nome;

    private BigDecimal vida;

    public BigDecimal getFaces() {
        return faces;
    }

    public void setFaces(BigDecimal faces) {
        this.faces = faces;
    }

    public BigDecimal getDados() {
        return dados;
    }

    public void setDados(BigDecimal dados) {
        this.dados = dados;
    }

    public BigDecimal getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(BigDecimal agilidade) {
        this.agilidade = agilidade;
    }

    public BigDecimal getDefesa() {
        return defesa;
    }

    public void setDefesa(BigDecimal defesa) {
        this.defesa = defesa;
    }

    public BigDecimal getForça() {
        return força;
    }

    public void setForça(BigDecimal força) {
        this.força = força;
    }

    public BigDecimal getVida() {
        return vida;
    }

    public void setVida(BigDecimal vida) {
        this.vida = vida;
    }

    private BigDecimal força;

    private BigDecimal defesa;

    private BigDecimal agilidade;

    private BigDecimal dados;

    private BigDecimal faces;


}
