package com.stockdata.repository;

import com.stockdata.repository.entity.StockAHold;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by UI03 on 2017/7/26.
 */
public interface StockAHoldRepository extends JpaRepository<StockAHold,String>{
}
