package com.best.controller;

import com.alibaba.fastjson.JSONObject;
import com.best.bean.Area;
import com.best.dao.AreaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author luodun
 *         Date 2018/12/1
 */
@RestController
@RequestMapping("/area")
public class AreaController {
    @Autowired
    private AreaDao areaDao;

    @GetMapping("/getArea/{id}")
    public String getArea(@PathVariable("id") Integer id){
        Area area = areaDao.selectOne(id);
        return area.toString();
    }

    @GetMapping("getAllArea")
    public String getAllArea(){
        List<Area> list= areaDao.selectList(new Area());
        return JSONObject.toJSONString(list);
    }
}
