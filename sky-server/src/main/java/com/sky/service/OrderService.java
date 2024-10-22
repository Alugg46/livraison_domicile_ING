package com.sky.service;

import com.sky.dto.OrderSubmitDTO;
import com.sky.vo.OrderSubmitVO;

public interface OrderService {

    OrderSubmitVO submitOrder(OrderSubmitDTO orderSubmitDTO);
}
