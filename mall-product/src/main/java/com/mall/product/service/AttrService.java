package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import common.utils.utils.PageUtils;
import com.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author lichi
 * @email lichi29565035@gmail.com
 * @date 2021-11-18 22:55:16
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

