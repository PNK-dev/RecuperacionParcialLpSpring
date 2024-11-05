package pe.edu.upeu.recuplp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.recuplp.dao.MarcaDao;
import pe.edu.upeu.recuplp.entity.Marca;
import pe.edu.upeu.recuplp.service.MarcaService;

@Service
public class MarcaServiceImpl implements MarcaService {
    @Autowired
    private MarcaDao marcaDao;

    @Override
    public Marca create(Marca m) {
        return marcaDao.create(m);
    }

    @Override
    public Marca update(Marca m) {
        return marcaDao.update(m);
    }

    @Override
    public void delete(Long id) {
        marcaDao.delete(id);
    }

    @Override
    public Marca read(Long id) {
        return marcaDao.read(id);
    }

    @Override
    public List<Marca> readAll() {
        return marcaDao.readAll();
    }
}
