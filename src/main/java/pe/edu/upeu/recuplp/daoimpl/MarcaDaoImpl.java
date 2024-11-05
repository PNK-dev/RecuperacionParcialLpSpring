package pe.edu.upeu.recuplp.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.recuplp.dao.MarcaDao;
import pe.edu.upeu.recuplp.entity.Marca;
import pe.edu.upeu.recuplp.repository.MarcaRepository;

@Component
public class MarcaDaoImpl implements MarcaDao {
    @Autowired
    private MarcaRepository marcaRepository;

    @Override
    public Marca create(Marca m) {
        return marcaRepository.save(m);
    }

    @Override
    public Marca update(Marca m) {
        return marcaRepository.save(m);
    }

    @Override
    public void delete(Long id) {
        marcaRepository.deleteById(id);
    }

    @Override
    public Marca read(Long id) {
        return marcaRepository.findById(id).get();
    }

    @Override
    public List<Marca> readAll() {
        return marcaRepository.findAll();
    }
}
