package com.dearjua.mybatis.mapper;

import com.dearjua.mybatis.pojo.Emp;

import java.util.List;

public interface DynamicMapper {
    List<Emp> getEmpByChoose(Emp emp);
}
