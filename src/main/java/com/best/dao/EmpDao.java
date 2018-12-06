package com.best.dao;

import com.best.bean.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author luodun
 *         Date 2018/12/1
 */
public interface EmpDao extends JpaRepository<Emp, String> {
}
