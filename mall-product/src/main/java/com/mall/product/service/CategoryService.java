package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import common.utils.utils.PageUtils;
import com.mall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author lichi
 * @email lichi29565035@gmail.com
 * @date 2021-11-18 22:55:16
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

