package service;

import dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by parkjihyoung on 15. 5. 1..
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userDao")
    private UserDao userDao;

    public int GetUserCnt() {
        return userDao.cntUsers();
    }
}
