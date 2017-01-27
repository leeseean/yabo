/**   
* 文件名称: CpDayProfitServiceImpl.java<br/>
* 版本号: V1.0<br/>   
* 创建人: alex<br/>  
* 创建时间 : 2016-12-1 下午2:27:45<br/>
*/  
package com.mh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mh.commons.orm.Page;
import com.mh.dao.CpDayProfitDao;
import com.mh.entity.CpDayProfit;
import com.mh.service.CpDayProfitService;

/** 
 * 类描述: TODO<br/>
 * 创建人: TODO alex<br/>
 * 创建时间: 2016-12-1 下午2:27:45<br/>
 */

@Service
public class CpDayProfitServiceImpl implements CpDayProfitService{
	
	
	@Autowired
	private CpDayProfitDao cpDayProfitDao;
	
	
	/**
	 * 盈亏列表
	 * 方法描述: TODO</br> 
	 * @param page
	 * @param cpDayProfit
	 * @return  
	 * Page
	 */
	@Override
	public Page findPage(Page page, CpDayProfit cpDayProfit){
		return this.cpDayProfitDao.findPage(page, cpDayProfit);
	}
	
	
	

}
