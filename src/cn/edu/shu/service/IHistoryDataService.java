package cn.edu.shu.service;

import java.util.List;

import cn.edu.shu.entity.Data;


/**
 * 
 * @author 
 *
 *历史数据查询接口
 */
public interface IHistoryDataService {

	//获取所有的历史数据
	public List<Data> getAllData();
}
