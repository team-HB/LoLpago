package com.hb.lolpago.utlis;

import com.hb.lolpago.champions.dto.ChampionsDto;
import com.hb.lolpago.champions.entity.Champions;
import org.springframework.beans.BeanUtils;

public class AppUtils {

    public static ChampionsDto entityToDto(Champions Champions) {
        ChampionsDto ChampionsDto = new ChampionsDto();
        BeanUtils.copyProperties(Champions, ChampionsDto);
        return ChampionsDto;
    }

    public static Champions dtoToEntity(ChampionsDto ChampionsDto) {
        Champions Champions = new Champions(null, null, 0, null);
        BeanUtils.copyProperties(ChampionsDto, Champions);
        return Champions;
    }
}