package com.stockdata.repository.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by UI03 on 2017/7/18.
 */
@Data
@Entity
@Table(name = "snowball_stockA")
public class SnowBallStockA {
    /**
     * snowball ID
     */
    @Id
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
    private double current ;//	"2.708"
    /**
     * 涨幅比例,单位%
     */
    private double percentage ;//	"0.48"
    /**
     * 距昨天收盘的涨幅大小
     */
    private double change ;//	"0.013"
    /**
     * 今天开盘价格
     */
    private double open	;//"2.71"
    /**
     * 今天最高价
     */
    private double high	;//"2.712"
    /**
     * 今日最低价
     */
    private double low	;//"2.708"
    /**
     * 今日收盘价
     */
    private double close ;//	"2.708"
    /**
     * 昨日收盘价
     */
    private double last_close	;//"2.695"
    /**
     * 52周最高价
     */
    private double high52week	;//"2.919"
    /**
     * 52周最低价
     */
    private double low52week	;//"2.575"
    /**
     * 成交量（股）
     */
    private double volume ;//	"1.38019601E8"
    /**
     * 成交量（手）
     */
    private double lot_volume ;//	"1380196.01"
    /**
     * 30日成交均量
     */
    private double volumeAverage ;//	"14514902"
    /**
     * 总市值
     */
    private double marketCapital ;//	"5.4188956969E9"
    /**
     * 每股收益
     */
    private double eps ;//	"0.0"
    /**
     * 累计净值或者市盈率（动态）
     */
    private double pe_ttm ;//	"1.0203"
    /**
     * 单位净值或者市盈率（静态）
     */
    private double pe_lyr ;//	"2.7021"
    private double beta ;//	"0.0"
    /**
     * 总股本
     */
    private double totalShares	;//"2001069312"
    /**
     * 请求时间
     */
    private String time	;//"Tue Jul 18 11:29:43 +0800 2017"
    private double afterHours;	//"0.0"
    private double afterHoursPct ;//	"0.0"
    private double afterHoursChg ;//	"0.0"
    /**
     * 基础数据修改时间 unit毫秒
     */
    private double updateAt ;//	"1493004628761"
    /**
     * 股息
     */
    private double dividend ;//	""
    /**
     * 股息收益率（%）
     */
    private double yield ;//	"0.0"
    /**
     * 换手率（%）
     */
    private double turnover_rate	;//"0.35"
    private double instOwn	;//"0.0"
    /**
     * 涨停价
     */
    private double rise_stop ;//	"2.965"
    /**
     * 跌停价
     */
    private double fall_stop ;//	"2.426"
    /**
     * 当前货币单位，人民币
     */
    private String currency_unit ;//	"CNY"
    /**
     * 成交额
     */
    private double amount ;//	"3.74066856E8"
    /**
     * 每股净资产
     */
    private double net_assets ;//	"0.0026"
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
    private double amplitude ;//	"0.15%"
    /**
     * 当前股市状态
     */
    private String market_status ;	//"交易中"
    /**
     * 手单位，1手=100股
     */
    private int lot_size ;//	"100"
    private double min_order_quantity ;//	"0"
    private double max_order_quantity ;//	"0"
    /**
     * 价格交易最小值
     */
    private double tick_size ;//	"0.001"
    private String kzz_stock_symbol	;//""
    private String kzz_stock_name ;//	"商品型"
    private double kzz_stock_current ;//	"0.0"
    private double kzz_convert_price ;//	"0.0"
    private double kzz_covert_value	;//"0.0"
    private double kzz_cpr	;//"0.0"
    private double kzz_putback_price ;//	"0.0"
    private String kzz_convert_time	;//""
    private double kzz_redempt_price	;//"0.0"
    private double kzz_straight_price;//	"0.0"
    private String kzz_stock_percent;//	""
    /**
     * 市净率
     */
    private double pb ;//	"1041.92"
    private double benefit_before_tax;//	"0.0"
    private double benefit_after_tax;//	"0.0"
    private double convert_bond_ratio;//	""
    private String totalissuescale;//	""
    private String outstandingamt;//	""
    private String maturitydate	;//""
    private String remain_year	;//""
    private double convertrate	;//"0.0"
    private String interestrtmemo;//	""
    private String release_date	;//""
    private double circulation ;//	"2.001069312E9"
    private double par_value ;//	"0.0"
    private double due_time	;//"0.0"
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
    private double float_shares	 ; //"0"
    /**
     * 流通市值
     */
    private double float_market_capital	;//"0.0"
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
