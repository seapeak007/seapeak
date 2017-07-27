package com.stockdata.repository.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by UI03 on 2017/7/20.
 */
@Data
@Entity
@Table(name = "snowball_stocka_config")
public class SBStockAConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id ;
    private String code ;
    private String name ;

    protected String remarks; // 备注
    @Column(name = "create_by")
    protected String createBy; // 创建者
    @Column(name = "create_date")
    protected Date createDate; // 创建日期
    @Column(name = "update_by")
    protected String updateBy; // 更新者
    @Column(name = "update_date")
    protected Date updateDate; // 更新日期
    @Column(name = "del_flag")
    protected String delFlag; // 删除标记（0：正常；1：删除；2：审核）
}
