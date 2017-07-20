package com.stockdata.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by UI03 on 2017/7/18.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "snowball_stockA")
public class SBStockA {
    /**
     * snowball ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long stockid ;
    /**
     * 交易所+代码
     */
    private String symbol ;//"SH518880"
    /**
     * 交易所
     */
    private String exchange ;//	"SH"
    /**
     * 代码
     */
    private String code ;//	"518880"
    /**
     * 名称
     */
    private String name ;//	"黄金ETF"
    /**
     * 当前价格
     */
   //  @Column(precision=30,scale = 5)
    private String current ;//	"2.708"
    /**
     * 涨幅比例,单位%
     */
   //  @Column(precision=30,scale = 5)
    private String percentage ;//	"0.48"
    /**
     * 距昨天收盘的涨幅大小
     */
    @Column(name = "change_data" ,precision=30,scale = 5)
    private String change ;//	"0.013"
    /**
     * 今天开盘价格
     */
   //  @Column(precision=30,scale = 5)
    private String open	;//"2.71"
    /**
     * 今天最高价
     */
   //  @Column(precision=30,scale = 5)
    private String high	;//"2.712"
    /**
     * 今日最低价
     */
   //  @Column(precision=30,scale = 5)
    private String low	;//"2.708"
    /**
     * 今日收盘价
     */
   //  @Column(precision=30,scale = 5)
    private String close ;//	"2.708"
    /**
     * 昨日收盘价
     */
   //  @Column(precision=30,scale = 5)
    private String last_close	;//"2.695"
    /**
     * 52周最高价
     */
   //  @Column(precision=30,scale = 5)
    private String high52week	;//"2.919"
    /**
     * 52周最低价
     */
   //  @Column(precision=30,scale = 5)
    private String low52week	;//"2.575"
    /**
     * 成交量（股）
     */
   //  @Column(precision=30,scale = 5)
    private String volume ;//	"1.38019601E8"
    /**
     * 成交量（手）
     */
   //  @Column(precision=30,scale = 5)
    private String lot_volume ;//	"1380196.01"
    /**
     * 30日成交均量
     */
   //  @Column(precision=30,scale = 5)
    private String volumeAverage ;//	"14514902"
    /**
     * 总市值
     */
   //  @Column(precision=30,scale = 5)
    private String marketCapital ;//	"5.4188956969E9"
    /**
     * 每股收益
     */
   //  @Column(precision=30,scale = 5)
    private String eps ;//	"0.0"
    /**
     * 累计净值或者市盈率（动态）
     */
   //  @Column(precision=30,scale = 5)
    private String pe_ttm ;//	"1.0203"
    /**
     * 单位净值或者市盈率（静态）
     */
   //  @Column(precision=30,scale = 5)
    private String pe_lyr ;//	"2.7021"
   //  @Column(precision=30,scale = 5)
    private String beta ;//	"0.0"
    /**
     * 总股本
     */
   //  @Column(precision=30,scale = 5)
    private String totalShares	;//"2001069312"
    /**
     * 请求时间
     */
    private String time	;//"Tue Jul 18 11:29:43 +0800 2017"
    private String afterHours;	//"0.0"
    private String afterHoursPct ;//	"0.0"
    private String afterHoursChg ;//	"0.0"
    /**
     * 基础数据修改时间 unit毫秒
     */
    private long updateAt ;//	"1493004628761"
    /**
     * 股息
     */
    private String dividend ;//	""
    /**
     * 股息收益率（%）
     */
   //  @Column(precision=30,scale = 5)
    private String yield ;//	"0.0"
    /**
     * 换手率（%）
     */
   //  @Column(precision=30,scale = 5)
    private String turnover_rate	;//"0.35"
    private String instOwn	;//"0.0"
    /**
     * 涨停价
     */
   //  @Column(precision=30,scale = 5)
    private String rise_stop ;//	"2.965"
    /**
     * 跌停价
     */
   //  @Column(precision=30,scale = 5)
    private String fall_stop ;//	"2.426"
    /**
     * 当前货币单位，人民币
     */
    private String currency_unit ;//	"CNY"
    /**
     * 成交额
     */
   //  @Column(precision=30,scale = 5)
    private String amount ;//	"3.74066856E8"
    /**
     * 每股净资产
     */
   //  @Column(precision=30,scale = 5)
    private String net_assets ;//	"0.0026"
    private String hasexist ;//	""
    private String has_warrant ;//	"0"
    /**
     * 内部类型，11为SZ，13为SH
     */
    private int type	 ;//"13"
    /**
     * n内部类型，1正常交易，2：停牌
     */
    private int flag ;//	"1"
    private String rest_day	;//""
    /**
     * 一天振动幅度（%）
     */
    private String amplitude ;//	"0.15%"
    /**
     * 当前股市状态
     */
    private String market_status ;	//"交易中"
    /**
     * 手单位，1手=100股
     */
    private int lot_size ;//	"100"
    private String min_order_quantity ;//	"0"
    private String max_order_quantity ;//	"0"
    /**
     * 价格交易最小值
     */
   //  @Column(precision=30,scale = 5)
    private String tick_size ;//	"0.001"
    private String kzz_stock_symbol	;//""
    private String kzz_stock_name ;//	"商品型"
    private String kzz_stock_current ;//	"0.0"
    private String kzz_convert_price ;//	"0.0"
    private String kzz_covert_value	;//"0.0"
    private String kzz_cpr	;//"0.0"
    private String kzz_putback_price ;//	"0.0"
    private String kzz_convert_time	;//""
    private String kzz_redempt_price	;//"0.0"
    private String kzz_straight_price;//	"0.0"
    private String kzz_stock_percent;//	""
    /**
     * 市净率
     */
   //  @Column(precision=30,scale = 5)
    private String pb ;//	"1041.92"
    private String benefit_before_tax;//	"0.0"
    private String benefit_after_tax;//	"0.0"
    private String convert_bond_ratio;//	""
    private String totalissuescale;//	""
    private String outstandingamt;//	""
    private String maturitydate	;//""
    private String remain_year	;//""
    private String convertrate	;//"0.0"
    private String interestrtmemo;//	""
    private String release_date	;//""
   //  @Column(precision=30,scale = 5)
    private String circulation ;//	"2.001069312E9"
    private String par_value ;//	"0.0"
    private String due_time	;//"0.0"
    private String value_date ;//	""
    private String due_date ;//	""
    private String publisher	;//""
    private String redeem_type	;//"T"
    private String issue_type	;//""
    private String bond_type	;//""
    private String warrant;//	"许之彦、徐宜宜"
    private String sale_rrg	;//"华安基金管理有限公司"
    private String rate	;//""
    private String after_hour_vol ;//	"0"
    /**
     * 流通股本
     */
   //  @Column(precision=30,scale = 5)
    private String float_shares	 ; //"0"
    /**
     * 流通市值
     */
   //  @Column(precision=30,scale = 5)
    private String float_market_capital	;//"0.0"
    private String disnext_pay_date;//	""
    private String convert_rate	;//"0.0"
    private String volume_ratio	;//"1.1"
    private String percent5m	;//"0.0"
    /**
     * 盘口委比
     */
    private String pankou_ratio	;//"-10.43%"
    private String psr	;//""
    private String end_date ;//	""
    private String subscription_status;//	"0"
    private String redemption_status;//	"0"
    private String afterHoursTime;//	"Thu Jul 18 00:00:00 +0800 2013"
    private String rating	;//"0"
    private String rating_agencies;//	""
}
