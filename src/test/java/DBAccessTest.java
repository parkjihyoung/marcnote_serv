/**
 * Created by parkjihyoung on 15. 4. 27..
 */

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


import java.sql.SQLException;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import dao.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:web/WEB-INF/applicationContext.xml"})
public class DBAccessTest {
    @Autowired
    private ApplicationContext context;
    private UserDao userDao;


    @Before
    public void setUp() {
        this.userDao = this.context.getBean("userDao", UserDao.class);
    }


    @Test
    public void count() throws SQLException {
        assertThat(Integer.valueOf(this.userDao.cntUsers()), is(Integer.valueOf(1)));
    }

}
