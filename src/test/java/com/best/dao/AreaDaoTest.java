package com.best.dao;

import com.best.bean.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

/**
 * @author luodun
 *         Date 2018/11/8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;
    @Autowired
    private DataSource dataSource;

    @Ignore
    @Test
    public void test()throws Exception{
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Ignore
    @Test
    public void selectOne(){
        Area area = areaDao.selectOne(1);
        System.out.println(area);
    }

    @Test
    public void selectList() {
        List<Area> list = areaDao.selectList(new Area());
        list.forEach(a -> {
            System.out.println(a.toString());
        });
    }

}