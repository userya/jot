package jot.persistent.dao.impl;

import jot.persistent.dao.BaseObject;
import jot.persistent.dao.EntityDao;
import jot.persistent.model.Entity;

public class EntityDaoImpl implements EntityDao {

	private Entity entity;

	public EntityDaoImpl(Entity entity) {
		super();
		this.entity = entity;
	}

	@Override
	public BaseObject findById(String id) {
		return null;
	}

	public Entity getEntity() {
		return entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}
}
