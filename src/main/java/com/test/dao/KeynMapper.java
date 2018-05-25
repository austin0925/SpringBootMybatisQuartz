package com.test.dao;

import com.test.domain.Keyn;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Service
public interface KeynMapper {
    int insert(Keyn record);

    List<Keyn> selectGpCode(String gpCode);
}