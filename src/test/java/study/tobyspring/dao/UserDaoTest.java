package study.tobyspring.dao;

import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import study.tobyspring.domain.User;

import java.beans.Transient;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    @DisplayName("UserDAO의 getUser와 addUser 테스트")
    @Transient
    public void userDaoTest() throws Exception {
        UserDao userDao = new UserDao();
        //given
        User user = new User();
        user.setId("9999");
        user.setName("토비");
        user.setPassword("password");
        //when
        userDao.addUser(user);
        User findUser = userDao.getUser(user.getId());
        //then
        assertThat(findUser).isNotNull();
        assertThat(findUser).isEqualTo(user);
    }
}