package com.wtw.catfriendsServer.service;

import com.wtw.catfriendsServer.dto.DiaDto;

public interface GoodsService {
    //재화 데이터 관련
    public Long saveDiaInfo(DiaDto dto);
    public DiaDto getDiaInfo(Long did);
}
