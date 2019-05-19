package zv2.com.cn.dao.usr.employee;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import zv2.com.cn.entity.usr.employee.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author lb
 * @date 2019/5/16
 */
public class EmployeeDao extends JdbcDaoSupport {
//    private JdbcTemplate jdbcTemplate;
//
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    public void add(Employee employee) {
        System.out.println("添加员工");
        JdbcTemplate jdbcTemplate = this.getJdbcTemplate();
        String sql = "INSERT INTO usr_employee VALUES (?,?,?)";
        jdbcTemplate.update(sql, employee.getId(), employee.getName(), employee.getPassword());
    }
    public int update(Employee employee) {
        System.out.println("修改员工");
        String sql = "UPDATE usr_employee SET password = ? WHERE id = ?";
        this.getJdbcTemplate().update(sql, employee.getPassword(), employee.getId());
        return 1;
    }
    public void delete(Employee employee) {
        System.out.println("删除员工");
        String sql = "DELETE FROM usr_employee WHERE id = ?";
        getJdbcTemplate().update(sql, employee.getId());
    }
    public void find() {
        System.out.println("查询员工");
        //        double rate = 1/0;
    }
    public long countRows() {
        String sql = "SELECT count(*) FROM usr_employee";
        return getJdbcTemplate().queryForLong(sql);
    }
    public String findPasswordByName(String name) {
        String sql = "SELECT ue.password FROM usr_employee ue WHERE ue.name = ?";
        return getJdbcTemplate().queryForObject(sql, String.class, name);
    }
    public Employee findById(String id) {
        String sql = "select * from usr_employee where id = ?";
        return getJdbcTemplate().queryForObject(sql, new EmployeeRowMapper(), id);
    }
    public List<Employee> findAll() {
        String sql = "select * from usr_employee";
        return getJdbcTemplate().query(sql, new EmployeeRowMapper());
    }
    private class EmployeeRowMapper implements RowMapper<Employee> {
        @Override
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
            Employee employee = new Employee();
            employee.setId(rs.getString("id"));
            employee.setName(rs.getString("name"));
            employee.setPassword(rs.getString("password"));
            return employee;
        }
    }
}
