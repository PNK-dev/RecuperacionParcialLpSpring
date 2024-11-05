package pe.edu.upeu.recuplp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.recuplp.dao.CocheDao;
import pe.edu.upeu.recuplp.entity.Coche;
import pe.edu.upeu.recuplp.service.CocheService;

@Service
public class CocheServiceImpl implements CocheService {
    @Autowired
    private CocheDao cocheDao;

    @Override
    public Coche create(Coche c) {
        return cocheDao.create(c);
    }

    @Override
    public Coche update(Coche c) {
        return cocheDao.update(c);
    }

    @Override
    public void delete(Long id) {
        cocheDao.delete(id);
    }

    @Override
    public Coche read(Long id) {
        return cocheDao.read(id);
    }

    @Override
    public List<Coche> readAll() {
        return cocheDao.readAll();
    }
}
