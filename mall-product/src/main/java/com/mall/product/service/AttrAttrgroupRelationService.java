package com.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import common.utils.PageUtils;
import com.mall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author lichi
 * @email lichi29565035@gmail.com
 * @date 2021-11-18 22:55:16
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

