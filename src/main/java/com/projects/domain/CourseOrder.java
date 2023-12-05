package com.projects.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CourseOrder {
    // Identificador único para cada pedido
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // Campos adicionais para representar detalhes de um pedido de curso
    private String cursoNome; // Nome do curso
    private int quantidadeInscricoes; // Quantidade de inscrições no curso
    private double precoTotal; // Preço total do pedido

    // Construtores, getters e setters

    // Construtor padrão sem argumentos
    public Order() {
        // Construtor padrão
    }

    // Construtor com argumentos para criar um pedido de curso
    public Order(String cursoNome, int quantidadeInscricoes, double precoTotal) {
        this.cursoNome = cursoNome;
        this.quantidadeInscricoes = quantidadeInscricoes;
        this.precoTotal = precoTotal;
    }

    // Getter para obter o ID do pedido
    public Long getId() {
        return id;
    }

    // Setter para definir o ID do pedido
    public void setId(Long id) {
        this.id = id;
    }

    // Getter para obter o nome do curso
    public String getCursoNome() {
        return cursoNome;
    }

    // Setter para definir o nome do curso
    public void setCursoNome(String cursoNome) {
        this.cursoNome = cursoNome;
    }

    // Getter para obter a quantidade de inscrições
    public int getQuantidadeInscricoes() {
        return quantidadeInscricoes;
    }

    // Setter para definir a quantidade de inscrições
    public void setQuantidadeInscricoes(int quantidadeInscricoes) {
        this.quantidadeInscricoes = quantidadeInscricoes;
    }

    // Getter para obter o preço total
    public double getPrecoTotal() {
        return precoTotal;
    }

    // Setter para definir o preço total
    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
}
