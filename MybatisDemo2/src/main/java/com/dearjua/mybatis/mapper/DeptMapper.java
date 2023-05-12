package com.dearjua.mybatis.mapper;

import com.dearjua.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    Dept getDeptByStep2(@Param("did") Integer did);

    Dept getDeptEmpOneToMore(@Param("did")Integer did);

    /**
     * 根据部门id查新部门以及部门中的员工信息
     * @param did
     * @return
     */
    Dept getDeptEmpByDid(@Param("did")Integer did);
}
