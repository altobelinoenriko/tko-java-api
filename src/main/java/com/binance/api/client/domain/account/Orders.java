package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Orders {

  private List<Order> list;

  public List<Order> getList() {
    return list;
  }

  public void setList(List<Order> list) {
    this.list = list;
  }
}
