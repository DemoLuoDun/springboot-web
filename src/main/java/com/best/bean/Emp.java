package com.best.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author luodun
 *         Date 2018/12/27
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "emp")
public class Emp {
    @Id
    private String id;

    @Column(name = "ename")
    private String eName;

    @Column(name = "tupian")
    private String tuPian;

    @Column(name = "dname")
    private String dName;
}
