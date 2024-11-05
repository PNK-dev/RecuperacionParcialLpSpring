package pe.edu.upeu.recuplp.service;

import java.util.List;

import pe.edu.upeu.recuplp.entity.TipoCoche;

public interface TipoCocheService {
	TipoCoche create(TipoCoche t);
	TipoCoche update(TipoCoche t);
	void delete(Long id);
	TipoCoche read(Long id);
	List<TipoCoche>readAll();
}
