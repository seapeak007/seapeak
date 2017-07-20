package com.stockdata.scheduled;

import com.google.gson.Gson;
import com.stockdata.repository.SBStockARepository;
import com.stockdata.repository.SBStockATempRepository;

import com.stockdata.repository.entity.SBStockA;
import com.stockdata.repository.entity.SBStockATemp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by UI03 on 2017/6/26.
 */
@Lazy(false)
@Slf4j
@Component
public class SnowBallStockAsch {

    @Autowired
    private SBStockARepository sbStockARepository ;
    @Autowired
    private SBStockATempRepository sbStockATempRepository ;

    @Scheduled(cron = "${snowball.stock.a}")
    public void genSnowBallStockA(){
        log.info("start genSnowBallStockA:"+new Date());
        try {
            List<SBStockATemp> templist = sbStockATempRepository.findAll();
            List<SBStockA> list = new ArrayList<SBStockA>();
            Gson gson = new Gson();

            for (SBStockATemp t : templist) {

                String value = t.getContent();
                if (value != null && value.length() > 10) {
                    SBStockA sa = new SBStockA();
                    sa = gson.fromJson(value, SBStockA.class);
                    list.add(sa);
                }
            }

            sbStockARepository.save(list) ;
        }catch (Exception e){
            log.error("genSnowBallStockA error:"+e);
        }

        log.info("end genSnowBallStockA:"+new Date());
    }

    public static void main(String args[]){

    }


}
