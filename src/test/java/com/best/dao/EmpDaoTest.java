package com.best.dao;

import com.best.bean.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author luodun
 *         Date 2018/12/1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmpDaoTest {

    @Autowired
    private EmpDao empDao;

    @Test
    public void selectOne(){
        Emp emp = empDao.findOne("1");
        System.out.println(emp);
    }

}