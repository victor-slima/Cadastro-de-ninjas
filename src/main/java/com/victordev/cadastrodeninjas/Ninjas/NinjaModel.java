package com.victordev.cadastrodeninjas.Ninjas;

import com.victordev.cadastrodeninjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

// Entity transforma a classe em uma entidade no banco de dados.
@Entity
// Table define o nome da tabela no banco de dados.
@Table(name = "tb_cadastro")
// Anotacao do lombok para construtor
@NoArgsConstructor
@AllArgsConstructor
@Data  // cria automaticamente getters e setters.
public class NinjaModel {

    // Id auto incrementa o id para cada registro.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "idade", nullable = false)
    private int idade;

    // um ninja tem uma unica missao.
    @ManyToOne
    @JoinColumn(name = "missoes_id") // chave estrangeira (foreing key)
    private MissoesModel missoes;


}

