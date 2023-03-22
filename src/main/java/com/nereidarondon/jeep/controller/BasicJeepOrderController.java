package com.nereidarondon.jeep.controller;

import org.springframework.web.bind.annotation.RestController;
import com.nereidarondon.jeep.entity.Order;
import com.nereidarondon.jeep.entity.OrderRequest;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class BasicJeepOrderController implements JeepOrderController {

  @Override
  public Order createOrder(OrderRequest orderRequest) {
    log.debug("Order={}", orderRequest);
    return null;
  }

}
