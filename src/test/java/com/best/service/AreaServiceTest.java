package com.best.service;

import com.best.bean.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author luodun
 *         Date 2018/12/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaServiceTest {
    @Autowired
    private AreaService areaService;

    @Test
    public void insertArea() throws Exception {
        Area area = new Area();
        area.setAreaId(13);
        area.setAreaName("12");
        area.setPriority(2);
        int count = areaService.insertArea(area);
        System.out.println(count);
    }

}