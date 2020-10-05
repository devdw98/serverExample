package com.wtw.catfriendsServer.dto;

import com.wtw.catfriendsServer.domain.Dia;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Builder
public class DiaDto {
    private Long did;
    private String originFilename;
    private String filename;
    private String filepath;
    private String description;
    private Integer diaNum;
    private Integer actualNum;

    public Dia toEntity(){
        Dia build = Dia.builder()
                .did(did)
                .originFilename(originFilename)
                .filename(filename)
                .filePath(filepath)
                .description(description)
                .diaNum(diaNum)
                .actualNum(actualNum)
                .build();
        return build;
    }
}
