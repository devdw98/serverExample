package com.wtw.catfriendsServer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class FileInfo {
    @Column(nullable = false)
    private String originFilename;

    @Column(nullable = false)
    private String filename;

    @Column(nullable = false)
    private String filePath;
}
