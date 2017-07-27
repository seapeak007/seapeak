package com.stockdata.repository.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by UI03 on 2017/7/26.
 */
@Data
@Entity
@Table(name = "stocka_history")
public class StockAHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id  ;
    /**
     * 1买入2卖出
     */
    private int deal ;
    private String code ;
    private String name ;
    @Column(precision=10,scale = 5)
    private BigDecimal price ;
    private long num  ;
    /**
     * 费用
     */
    @Column(precision=10,scale = 5)
    private BigDecimal fee ;
    /**
     * 操作原因
     */
    private String reason ;

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
