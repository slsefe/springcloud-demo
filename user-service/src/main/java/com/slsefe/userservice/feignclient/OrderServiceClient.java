package com.slsefe.userservice.feignclient;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("order-service")
public interface OrderServiceClient {
}
