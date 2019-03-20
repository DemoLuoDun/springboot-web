package com.best.service.impl;

import com.best.bean.Area;
import com.best.dao.AreaDao;
import com.best.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author luodun
 *         Date 2018/12/27
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    AreaDao areaDao;

    @Transactional
    @Override
    public int insertArea(Area area) {
        int count = areaDao.insertArea(area);
        int i = 1/0;
        return count;
    }
}
