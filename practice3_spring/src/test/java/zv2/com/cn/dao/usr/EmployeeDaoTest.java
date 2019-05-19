package zv2.com.cn.dao.usr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lb
 * @date 2019/5/19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-db.xml")
public class EmployeeDaoTest {
    @Test
    public void test() {
        // 创建连接池：使用Spring默认连接池
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/practice_spring");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        // 使用JdbcTemplate
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        String sql = "CREATE TABLE usr_employee(id VARCHAR(255) PRIMARY KEY, name VARCHAR(255) NOT NULL, password VARCHAR(255) NOT NULL)";
        jdbcTemplate.execute(sql);
    }

    @Test
    public void testJdbcTemplate() {
        String sql = "INSERT INTO usr_employee VALUES ('a90b81gol','admin','123456')";
        jdbcTemplate.execute(sql);
    }

    @Autowired
    @Qualifier("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
}
