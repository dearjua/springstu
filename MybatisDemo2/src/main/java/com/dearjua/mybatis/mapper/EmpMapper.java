package com.dearjua.mybatis.mapper;

import com.dearjua.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface EmpMapper {
    /**
     * 查询员工信息
     */
    List<Emp> getAllEmp();

    Emp getEmpById(@Param("eid")Integer eid);

    Emp getEmpByStep(@Param("eid") Integer eid);

    List<Emp> GetMepByDid(@Param("did") Integer did);

    /*
    * 动态SQL
    * */
    List<Emp> getEmpByDynamicSql(Emp emp);


}
