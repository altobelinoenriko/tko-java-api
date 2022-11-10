package com.binance.api.examples;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.TimeInForce;
import com.binance.api.client.domain.account.*;
import com.binance.api.client.domain.account.request.AllOrdersRequest;
import com.binance.api.client.domain.account.request.CancelOrderRequest;
import com.binance.api.client.domain.account.request.CancelOrderResponse;
import com.binance.api.client.domain.account.request.OrderRequest;
import com.binance.api.client.domain.account.request.OrderStatusRequest;
import com.binance.api.client.exception.BinanceApiException;

import java.util.List;

import static com.binance.api.client.domain.account.NewOrder.limitBuy;
import static com.binance.api.client.domain.account.NewOrder.marketBuy;

/**
 * Examples on how to place orders, cancel them, and query account information.
 */
public class OrdersExample {

  public static void main(String[] args) {
    BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance("eDaa42429f3D65894834F98F7d2194873ZIn2DgsPGgWDtLFOYY5DafQYMwe5vND", "1B03834D3b474AdB43f4dE028340A00DbDcCp1SfNjUlgCLcMOCFKjnBnNCURMSL");
    BinanceApiRestClient client = factory.newRestClient();

    // Getting list of open orders
    //TkoResponse<Orders> openOrders = client.getOpenOrders(new OrderRequest("ETH_BUSD"));
    //System.out.println(openOrders);

    // Get status of a particular order
    TkoResponse<Order> order = client.getOrderStatus(new OrderStatusRequest("ETH_BUSD", 156132278L));
    System.out.println(order);

    // Canceling an order
    /*try {
      CancelOrderResponse cancelOrderResponse = client.cancelOrder(new CancelOrderRequest("LINKETH", 756762l));
      System.out.println(cancelOrderResponse);
    } catch (BinanceApiException e) {
      System.out.println(e.getError().getMsg());
    }*/

    // Placing a test LIMIT order
    //client.newOrderTest(limitBuy("LINKETH", TimeInForce.GTC, "1000", "0.0001"));

    // Placing a test MARKET order
    //client.newOrderTest(marketBuy("LINKETH", "1000"));

    // Placing a real LIMIT order
    //NewOrderResponse newOrderResponse = client.newOrder(limitBuy("LINKETH", TimeInForce.GTC, "1000", "0.0001").newOrderRespType(NewOrderResponseType.FULL));
    //System.out.println(newOrderResponse);
  }

}
