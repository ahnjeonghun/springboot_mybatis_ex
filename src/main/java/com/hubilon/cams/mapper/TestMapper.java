package com.hubilon.cams.mapper;

import com.hubilon.cams.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface TestMapper {
    List<Test> findAll();
}
