package com.wtw.catfriendsServer.domain;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "Dia")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Dia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Integer diaNum; //다이아 개수

    @Column(nullable = false)
    private Integer actualNum; //실제 결제되는 돈

    @Builder
    public Dia(Long id, String description, Integer diaNum, Integer actualNum){
        this.id = id;
        this.description = description;
        this.diaNum = diaNum;
        this.actualNum = actualNum;
    }
}
