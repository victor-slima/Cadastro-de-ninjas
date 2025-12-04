package com.victordev.cadastrodeninjas;

import jakarta.persistence.*;

// Entity transforma a classe em uma entidade no banco de dados.
@Entity
// Table define o nome da tabela no banco de dados.
@Table(name = "tb_cadastro_ninjas")
public class NinjaModel {

    // Id auto incrementa o id para cada registro.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private int idade;

    // NoArgsConstructor
    public NinjaModel() {}

    // ALlArgsConstructor
    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

