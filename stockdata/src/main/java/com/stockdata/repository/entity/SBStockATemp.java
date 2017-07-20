package com.stockdata.repository.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by UI03 on 2017/7/20.
 */
@Data
@Entity
@Table(name = "snowball_stocka_temp")
public class SBStockATemp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long tid ;
    private String code ;
    private String content ;
    private Date date ;

}
