package br.dev.phcm.api_todo_list.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O nome não pode estar em branco.")
    private String nome;
    @NotBlank(message = "A descrição não pode estar em branco.")
    private String descricao;
    private Boolean realizado;
    private Integer prioridade;

    public Todo(String nome, String descricao, Boolean realizado, Integer prioridade) {
        this.nome = nome;
        this.descricao = descricao;
        this.realizado = realizado;
        this.prioridade = prioridade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getRealizado() {
        return realizado;
    }

    public void setRealizado(Boolean realizado) {
        this.realizado = realizado;
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }
}
