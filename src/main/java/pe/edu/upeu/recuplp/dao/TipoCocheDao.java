package pe.edu.upeu.recuplp.dao;

import java.util.List;

import pe.edu.upeu.recuplp.entity.TipoCoche;

public interface TipoCocheDao {
	TipoCoche create(TipoCoche t);
	TipoCoche update(TipoCoche t);
	void delete(Long id);
	TipoCoche read(Long id);
	List<TipoCoche>readAll();
}
