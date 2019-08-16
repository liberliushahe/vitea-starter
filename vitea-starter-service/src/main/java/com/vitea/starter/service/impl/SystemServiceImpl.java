package com.vitea.starter.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.vitea.starter.api.SystemService;

public class SystemServiceImpl implements SystemService<Object>{

	@Override
	public boolean save(Object entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveBatch(Collection entityList, int batchSize) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveOrUpdateBatch(Collection entityList, int batchSize) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeById(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeByMap(Map columnMap) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Wrapper queryWrapper) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeByIds(Collection idList) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateById(Object entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Object entity, Wrapper updateWrapper) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBatchById(Collection entityList, int batchSize) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveOrUpdate(Object entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getById(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection listByIds(Collection idList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection listByMap(Map columnMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getOne(Wrapper queryWrapper, boolean throwEx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map getMap(Wrapper queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getObj(Wrapper queryWrapper, Function mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(Wrapper queryWrapper) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List list(Wrapper queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPage page(IPage page, Wrapper queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List listMaps(Wrapper queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List listObjs(Wrapper queryWrapper, Function mapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPage pageMaps(IPage page, Wrapper queryWrapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseMapper getBaseMapper() {
		// TODO Auto-generated method stub
		return null;
	}

}
