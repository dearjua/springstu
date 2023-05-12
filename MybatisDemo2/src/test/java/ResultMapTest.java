import com.dearjua.mybatis.mapper.DeptMapper;
import com.dearjua.mybatis.mapper.DynamicMapper;
import com.dearjua.mybatis.mapper.EmpMapper;
import com.dearjua.mybatis.pojo.Dept;
import com.dearjua.mybatis.pojo.Emp;
import com.dearjua.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ResultMapTest {
    @Test
    public void getAllUserTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> allEmp = mapper.getAllEmp();
        allEmp.forEach(emp->{
            System.out.println(emp);
        });
    }

    @Test
    public void getEmpByIdTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empById = mapper.getEmpById(1);
        System.out.println("empById = " + empById);
    }

    @Test
    public void getEmpBystepTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empByStep = mapper.getEmpByStep(2);
        System.out.println(empByStep);
    }

    @Test
    public void getDeptEmpByOneTOMore(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptEmpOneToMore = mapper.getDeptEmpOneToMore(1);
        System.out.println(deptEmpOneToMore);
    }
    @Test
    public void getEmpByDidTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptEmpByDid = mapper.getDeptEmpByDid(1);
        System.out.println(deptEmpByDid);
    }

    @Test
    public void getEmpByDynamicSqlTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> empByDynamicSql = mapper.getEmpByDynamicSql(new Emp(null, "sam", 20, "", "123@qq.com"));
        System.out.println(empByDynamicSql);
    }
    @Test
    public void getEmpByChooseTest(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicMapper mapper = sqlSession.getMapper(DynamicMapper.class);
        List<Emp> emp1 = mapper.getEmpByChoose(new Emp(1, "sam", 20, "x", null));
        emp1.forEach(emp -> {
            System.out.println(emp);
        });
    }
}
