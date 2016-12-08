package com.jun.mapper;


import java.util.List;

import com.jun.po.ItemsCustom;
import com.jun.po.ItemsCustomQueryVo;

/**
 * Author: jun
 * 
 */
public interface ItemsCustomMapper {

	List<ItemsCustom> getAllItemsLikeName(ItemsCustomQueryVo itemsCustomQueryVo) throws Exception;
}

