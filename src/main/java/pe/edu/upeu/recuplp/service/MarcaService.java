package pe.edu.upeu.recuplp.service;

import java.util.List;

import pe.edu.upeu.recuplp.entity.Marca;

public interface MarcaService {
	Marca create(Marca m);
	Marca update(Marca m);
	void delete(Long id);
	Marca read(Long id);
	List<Marca>readAll();
}
