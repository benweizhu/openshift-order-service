package me.zpeh.openshift.order.controller;

import me.zpeh.openshift.order.model.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
  @RequestMapping(value = "/orders/{id}")
  public Order gerOrder(@PathVariable long id){
    return new Order(id);
  }
}
