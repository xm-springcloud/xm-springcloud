package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "xm-provider",fallback = GoodsServiceFallback.class)
public interface GoodsServiceFeign extends GoodsService {
}
