package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import common.utils.utils.PageUtils;
import com.mall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author lichi
 * @email lichi29565035@gmail.com
 * @date 2021-11-18 22:55:16
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

