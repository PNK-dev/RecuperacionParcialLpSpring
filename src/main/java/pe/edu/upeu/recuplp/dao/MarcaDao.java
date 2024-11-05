package pe.edu.upeu.recuplp.dao;

import java.util.List;

import pe.edu.upeu.recuplp.entity.Marca;

public interface MarcaDao {
	Marca create(Marca m);
	Marca update(Marca m);
	void delete(Long id);
	Marca read(Long id);
	List<Marca>readAll();
}
