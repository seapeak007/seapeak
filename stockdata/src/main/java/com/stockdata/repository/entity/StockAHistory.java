package com.stockdata.repository.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by UI03 on 2017/7/26.
 */
@Data
@Entity
@Table(name = "stocka_history")
public class StockAHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long tid  ;
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
    private long date ;
    /**
     * 操作原因
     */
    private String reason ;
    private String remark ;
}
