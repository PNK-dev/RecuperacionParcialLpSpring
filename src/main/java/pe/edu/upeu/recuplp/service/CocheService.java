package pe.edu.upeu.recuplp.service;

import java.util.List;

import pe.edu.upeu.recuplp.entity.Coche;

public interface CocheService {
	Coche create(Coche m);
	Coche update(Coche m);
	void delete(Long id);
	Coche read(Long id);
	List<Coche>readAll();
}
