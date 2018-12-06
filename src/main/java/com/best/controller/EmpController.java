package com.best.controller;

import com.alibaba.fastjson.JSONObject;
import com.best.bean.Emp;
import com.best.dao.EmpDao;
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
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpDao empDao;

    @GetMapping("/findOne/{id}")
    public String findOne(@PathVariable("id") String id) {
        Emp emp = empDao.findOne(id);
        return emp.toString();
    }

    @GetMapping("/findAll")
    public String findAll() {
        List<Emp> list = empDao.findAll();
        return JSONObject.toJSONString(list);
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id){
        Emp emp = new Emp();
        emp.setId(id);
        empDao.delete(emp);
        return "SUCCESS";
    }

    @GetMapping("/insert")
    public Emp  insert(Emp emp){
        Emp save = empDao.save(emp);
        return save;
    }
}
