package com.best.dao;

import com.best.bean.Mobile;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author luodun
 *         Date 2018/12/1
 */
public interface MobileDao {

    /**
     * 查询条记录
     * @param code
     * @return
     */
    @Select("select * from t_info_mobile_h t where t.MOBILE_H_CODE=#{code}")
    Mobile selectOne(String code);

    /**
     * 查询所有记录
     * @return
     */
    @Select("select * from t_info_mobile_h")
    List<Mobile> selectAll();

}
