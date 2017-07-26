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
    private long tid ;
    private String code ;
    private String name ;
    private int status ;
    private Date add_time ;
}
