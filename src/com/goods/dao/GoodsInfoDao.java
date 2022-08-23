/**
 * 
 */
package com.goods.dao;

import java.sql.SQLException;

import com.goods.bean.GoodsInfo;

public interface GoodsInfoDao {
	GoodsInfo selectGoodsInfoByName(String name) throws SQLException;
}
