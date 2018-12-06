package com.best.dao;

import com.best.bean.Mobile;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author luodun
 *         Date 2018/12/1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MobileDaoTest {

    @Autowired
    private MobileDao mobileDao;

    @Test
    public void selectOne() throws Exception {
        Mobile mobile = mobileDao.selectOne("1700995");
        System.out.println(mobile);
    }

    @Test
    public void selectAll() throws Exception {
        List<Mobile> list = mobileDao.selectAll();
        list.forEach(mobile -> {
            System.out.println(mobile);
        });
    }

}