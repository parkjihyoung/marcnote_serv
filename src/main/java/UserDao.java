
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by parkjihyoung on 15. 4. 27..
 */

@Repository("userDao")
public class UserDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;


    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.dataSource = dataSource;


    }

    public int cntUsers(){

        return jdbcTemplate.queryForObject("select count(*) from users", Integer.class);
    }
}
