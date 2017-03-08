package com.zcbspay.platform.cnaps.message.dao;

import com.zcbspay.platform.cnaps.common.dao.BaseDAO;
import com.zcbspay.platform.cnaps.message.pojo.CnapsLogDO;

public interface CnapsLogDAO extends BaseDAO<CnapsLogDO> {

	/**
	 * 保存人行核心交易流水数据
	 * @param cnapsLog
	 */
	public void saveCNAPSLog(CnapsLogDO cnapsLog);
	
	/**
	 * 通过报文标示号获核心交易流水数据
	 * @param msgId
	 * @return
	 */
	public CnapsLogDO getCnapsLogDOByMsgId(String msgId);
}