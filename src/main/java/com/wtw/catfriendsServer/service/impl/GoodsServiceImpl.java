package com.wtw.catfriendsServer.service.impl;

import com.wtw.catfriendsServer.domain.Dia;
import com.wtw.catfriendsServer.dto.DiaDto;
import com.wtw.catfriendsServer.repository.DiaRepository;
import com.wtw.catfriendsServer.service.GoodsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class GoodsServiceImpl implements GoodsService {
    private DiaRepository diaRepository;

    @Transactional
    @Override
    public Long saveDiaInfo(DiaDto dto) {
        return diaRepository.save(dto.toEntity()).getDid();
    }

    @Transactional
    @Override
    public DiaDto getDiaInfo(Long did) {
        Dia dia = diaRepository.findById(did).get();

        DiaDto dto = DiaDto.builder()
                .did(did)
                .originFilename(dia.getOriginFilename())
                .filename(dia.getFilename())
                .filepath(dia.getFilePath())
                .description(dia.getDescription())
                .diaNum(dia.getDiaNum())
                .actualNum(dia.getActualNum())
                .build();
        return dto;
    }
}
