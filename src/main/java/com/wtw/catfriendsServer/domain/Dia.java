package com.wtw.catfriendsServer.domain;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "Dia")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@AllArgsConstructor
@Builder
public class Dia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long did;

    @Column(nullable = false)
    private String originFilename;

    @Column(nullable = false)
    private String filename;

    @Column(nullable = false)
    private String filePath;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Integer diaNum; //다이아 개수

    @Column(nullable = false)
    private Integer actualNum; //실제 결제되는 돈
}
