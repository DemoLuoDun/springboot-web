package com.best.dao;

import com.best.bean.Area;

import java.util.List;

/**
 * @author luodun
 *         Date 2018/11/8
 */
//@Mapper
public interface AreaDao {

    /**
     * 查询一个
     * @param id
     * @return
     */
    Area selectOne(int id);

    /**
     * 查询集合
     * @param area
     * @return
     */
    List<Area> selectList(Area area);

}
