package pe.edu.upeu.recuplp.dao;

import java.util.List;

import pe.edu.upeu.recuplp.entity.Coche;

public interface CocheDao {
	Coche create(Coche m);
	Coche update(Coche m);
	void delete(Long id);
	Coche read(Long id);
	List<Coche>readAll();
}
