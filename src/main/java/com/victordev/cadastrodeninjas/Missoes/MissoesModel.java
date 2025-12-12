package com.victordev.cadastrodeninjas.Missoes;

import com.victordev.cadastrodeninjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nomeMissao", nullable = false)
    private String nome;

    @Column(name = "dificuldade", nullable = false)
    private char dificuldade;

    // Uma missao pode ter varios ninjas.
    @OneToMany(mappedBy = "missoes") // os ninjas serao mapeados para essa missao.
    private List<NinjaModel> ninjas;
}
