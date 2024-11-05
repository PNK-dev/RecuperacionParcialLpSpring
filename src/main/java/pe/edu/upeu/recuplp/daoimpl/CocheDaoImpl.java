package pe.edu.upeu.recuplp.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.recuplp.dao.CocheDao;
import pe.edu.upeu.recuplp.entity.Coche;
import pe.edu.upeu.recuplp.repository.CocheRepository;

@Component
public class CocheDaoImpl implements CocheDao {
    @Autowired
    private CocheRepository cocheRepository;

    @Override
    public Coche create(Coche c) {
        return cocheRepository.save(c);
    }

    @Override
    public Coche update(Coche c) {
        return cocheRepository.save(c);
    }

    @Override
    public void delete(Long id) {
        cocheRepository.deleteById(id);
    }

    @Override
    public Coche read(Long id) {
        return cocheRepository.findById(id).get();
    }

    @Override
    public List<Coche> readAll() {
        return cocheRepository.findAll();
    }
}
