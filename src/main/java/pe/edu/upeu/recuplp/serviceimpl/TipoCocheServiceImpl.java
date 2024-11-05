package pe.edu.upeu.recuplp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.recuplp.dao.TipoCocheDao;
import pe.edu.upeu.recuplp.entity.TipoCoche;
import pe.edu.upeu.recuplp.service.TipoCocheService;

@Service
public class TipoCocheServiceImpl implements TipoCocheService {
    @Autowired
    private TipoCocheDao tipoCocheDao;

    @Override
    public TipoCoche create(TipoCoche t) {
        return tipoCocheDao.create(t);
    }

    @Override
    public TipoCoche update(TipoCoche t) {
        return tipoCocheDao.update(t);
    }

    @Override
    public void delete(Long id) {
        tipoCocheDao.delete(id);
    }

    @Override
    public TipoCoche read(Long id) {
        return tipoCocheDao.read(id);
    }

    @Override
    public List<TipoCoche> readAll() {
        return tipoCocheDao.readAll();
    }
}
