package com.wtw.catfriendsServer.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class QuestInfo {

    private Long id;
    private String title;
    private String description;
    private Long reward;
    private Date receivedTime;
    private QuestType type;
    private Long fileId; //이미지 불러오기

}
