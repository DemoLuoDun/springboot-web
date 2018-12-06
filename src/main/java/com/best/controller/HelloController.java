package com.best.controller;

import com.best.bean.Area;
import com.best.dao.AreaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private AreaDao areaDao;

    @GetMapping("/abc")
    public String hello(Model model) {
        model.addAttribute("msg", "你好");
        return "success";
    }

    @GetMapping("/getArea/{id}")
    public String getArea(@PathVariable("id") Integer id) {
        Area area = areaDao.selectOne(id);
        return area.toString();
    }

}
