package com.stockdata.repository.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by UI03 on 2017/7/26.
 */
@Data
@Entity
@Table(name = "stocka_hold")
public class StockAHold {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long tid ;
    private String code ;
    private String name ;
    private long num  ;
    @Column(name = "hold_price",precision=10,scale = 5)
    private BigDecimal holdPrice ;
    private long date ;
    /**
     * 持有依据
     */
    private String accord ;
    private String remark ;
}
