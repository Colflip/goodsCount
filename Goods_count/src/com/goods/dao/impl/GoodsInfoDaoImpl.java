package com.goods.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.goods.bean.GoodsInfo;
import com.goods.dao.GoodsInfoDao;
import com.goods.utils.MySQLTool;

public class GoodsInfoDaoImpl implements GoodsInfoDao {

	@Override
	public GoodsInfo selectGoodsInfoByName(String name) throws SQLException {

		String sql = "select * from goodsinfo where name=?";
		Connection conn = MySQLTool.getConnection();
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, name);
		ResultSet rs =stmt.executeQuery();
		GoodsInfo goods = null;
		if (rs.next()) {
			goods = new GoodsInfo(rs.getInt("id"), rs.getString("name"), rs.getFloat("price"));
		}
		MySQLTool.free(rs, stmt, conn);
		return goods;
	}

}
