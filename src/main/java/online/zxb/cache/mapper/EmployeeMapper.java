package online.zxb.cache.mapper;

import online.zxb.cache.entity.Employee;
import org.apache.ibatis.annotations.*;

/**
 * @ClassName EmployeeMapper
 * @Description TODO
 * @Author zxb
 * @Date 2019/8/29 15:47
 * @Version 1.0
 */
@Mapper
public interface EmployeeMapper {

    @Select("SELECT * FROM employee WHERE id = #{id}")
     public Employee getById(Integer id);
    @Insert("INSERT INTO employee (lastName,email,gender,d_id) values(#{lastName},#{email},#{gender},#{dId})")
    public void insert(Employee employee);
    @Delete("DELETE FROM employee WHERE id={id}")
    public void delete(Integer id);
    @Update("update employee set lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{dId} where id=#{id}")
    public void update(Employee employee);
    @Select("select * from employee where lastName=#{lastName}")
    Employee getByLastName(String lastName);
}
