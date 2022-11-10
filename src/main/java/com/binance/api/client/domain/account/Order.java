package com.binance.api.client.domain.account;

import com.binance.api.client.domain.OrderSide;
import com.binance.api.client.domain.OrderStatus;
import com.binance.api.client.domain.OrderType;
import com.binance.api.client.domain.TimeInForce;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Trade order information.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {
  /**
   * Order id.
   */
  private Long orderId;

  /**
   * Client order id.
   */
  private String clientId;

  /**
   * Binance order id.
   */
  private Long bOrderId;

  /**
   * Binance client order id.
   */
  private String bClientId;

  /**
   * Binance order LIST id.
   */
  private String bOrderListId;

  /**
   * Symbol that the order was put on.
   */
  private String symbol;
  private String symbolType;
  /**
   * Type of order.
   */
  private OrderType type;

  /**
   * Buy/Sell order side.
   */
  private OrderSide side;

  /**
   * Price.
   */
  private String price;

  /**
   * Original quantity.
   */
  private String origQty;

  /**
   * Original quote order quantity.
   */
  private String origQuoteOrderQty;

  /**
   * Executed quantity.
   */
  private String executedQty;

  /**
   * Executed quote quantity.
   */
  private String executedQuoteQty;

  /**
   * Time in force to indicate how long will the order remain active.
   */
  private TimeInForce timeInForce;

  /**
   * Used with stop orders.
   */
  private String stopPrice;

  /**
   * Used with iceberg orders.
   */
  private String icebergQty;

  /**
   * Order status.
   */
  private OrderStatus status;

  /**
   * Order creation time.
   */
  private long createTime;

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public Long getbOrderId() {
    return bOrderId;
  }

  public void setbOrderId(Long bOrderId) {
    this.bOrderId = bOrderId;
  }

  public String getbClientId() {
    return bClientId;
  }

  public void setbClientId(String bClientId) {
    this.bClientId = bClientId;
  }

  public String getbOrderListId() {
    return bOrderListId;
  }

  public void setbOrderListId(String bOrderListId) {
    this.bOrderListId = bOrderListId;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getSymbolType() {
    return symbolType;
  }

  public void setSymbolType(String symbolType) {
    this.symbolType = symbolType;
  }

  public OrderType getType() {
    return type;
  }

  public void setType(OrderType type) {
    this.type = type;
  }

  public OrderSide getSide() {
    return side;
  }

  public void setSide(OrderSide side) {
    this.side = side;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getOrigQty() {
    return origQty;
  }

  public void setOrigQty(String origQty) {
    this.origQty = origQty;
  }

  public String getOrigQuoteOrderQty() {
    return origQuoteOrderQty;
  }

  public void setOrigQuoteOrderQty(String origQuoteOrderQty) {
    this.origQuoteOrderQty = origQuoteOrderQty;
  }

  public String getExecutedQty() {
    return executedQty;
  }

  public void setExecutedQty(String executedQty) {
    this.executedQty = executedQty;
  }

  public String getExecutedQuoteQty() {
    return executedQuoteQty;
  }

  public void setExecutedQuoteQty(String executedQuoteQty) {
    this.executedQuoteQty = executedQuoteQty;
  }

  public TimeInForce getTimeInForce() {
    return timeInForce;
  }

  public void setTimeInForce(TimeInForce timeInForce) {
    this.timeInForce = timeInForce;
  }

  public String getStopPrice() {
    return stopPrice;
  }

  public void setStopPrice(String stopPrice) {
    this.stopPrice = stopPrice;
  }

  public String getIcebergQty() {
    return icebergQty;
  }

  public void setIcebergQty(String icebergQty) {
    this.icebergQty = icebergQty;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  public long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(long createTime) {
    this.createTime = createTime;
  }

  @Override
  public String toString() {
    return "Order{" +
            "orderId=" + orderId +
            ", clientId='" + clientId + '\'' +
            ", bOrderId=" + bOrderId +
            ", bClientId='" + bClientId + '\'' +
            ", bOrderListId='" + bOrderListId + '\'' +
            ", symbol='" + symbol + '\'' +
            ", symbolType='" + symbolType + '\'' +
            ", type=" + type +
            ", side=" + side +
            ", price='" + price + '\'' +
            ", origQty='" + origQty + '\'' +
            ", origQuoteOrderQty='" + origQuoteOrderQty + '\'' +
            ", executedQty='" + executedQty + '\'' +
            ", executedQuoteQty='" + executedQuoteQty + '\'' +
            ", timeInForce=" + timeInForce +
            ", stopPrice='" + stopPrice + '\'' +
            ", icebergQty='" + icebergQty + '\'' +
            ", status=" + status +
            ", createTime=" + createTime +
            '}';
  }
}
