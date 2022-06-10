package com.matheuscosta.psame.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String hash;

    //cpf
    private String document;

    //nome
    private String name;

    //email
    private String email;

    //data de nascimento
    private String birthDate;

    //sexo
    private String gender;

    //renda mensal
    private BigDecimal monthlyIncome;

//    public Client(ClientRequestDTO clientRequestDTO, String uuidHash) {
//        this.document = clientRequestDTO.getCpf();
//        this.name = clientRequestDTO.getNome();
//        this.email = clientRequestDTO.getEmail();
//        this.birthDate = clientRequestDTO.getDataDeNascimento();
//        this.gender = clientRequestDTO.getSexo().getDescription();
//        this.monthlyIncome = clientRequestDTO.getRendaMensal().setScale(2, BigDecimal.ROUND_HALF_EVEN);;
//        this.hash = uuidHash;
//    }
}
