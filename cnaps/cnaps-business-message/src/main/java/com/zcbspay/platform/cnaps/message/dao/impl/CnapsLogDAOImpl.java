package com.zcbspay.platform.cnaps.message.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zcbspay.platform.cnaps.common.dao.impl.HibernateBaseDAOImpl;
import com.zcbspay.platform.cnaps.message.dao.CnapsLogDAO;
import com.zcbspay.platform.cnaps.message.pojo.CnapsLogDO;

@Repository
public class CnapsLogDAOImpl extends HibernateBaseDAOImpl<CnapsLogDO> implements CnapsLogDAO {

	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Throwable.class)
	public void saveCNAPSLog(CnapsLogDO cnapsLog){
		saveCNAPSLog(cnapsLog);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Throwable.class)
	public CnapsLogDO getCnapsLogDOByMsgId(String msgId) {
		Criteria criteria = getSession().createCriteria(CnapsLogDO.class);
		criteria.add(Restrictions.eq("msgid", msgId));
		CnapsLogDO uniqueResult = (CnapsLogDO) criteria.uniqueResult();
		return uniqueResult;
	}
	
	
}