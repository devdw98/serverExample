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
public class Mail {

    private Long id;
    private MailType type;
    private String title;
    private boolean read;
    private Date readTime;
}
