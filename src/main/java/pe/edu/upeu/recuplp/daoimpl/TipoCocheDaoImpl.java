package pe.edu.upeu.recuplp.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.recuplp.dao.TipoCocheDao;
import pe.edu.upeu.recuplp.entity.TipoCoche;
import pe.edu.upeu.recuplp.repository.TipoCocheRepository;

@Component
public class TipoCocheDaoImpl implements TipoCocheDao {
    @Autowired
    private TipoCocheRepository tipoCocheRepository;

    @Override
    public TipoCoche create(TipoCoche t) {
        return tipoCocheRepository.save(t);
    }

    @Override
    public TipoCoche update(TipoCoche t) {
        return tipoCocheRepository.save(t);
    }

    @Override
    public void delete(Long id) {
        tipoCocheRepository.deleteById(id);
    }

    @Override
    public TipoCoche read(Long id) {
        return tipoCocheRepository.findById(id).get();
    }

    @Override
    public List<TipoCoche> readAll() {
        return tipoCocheRepository.findAll();
    }
}
