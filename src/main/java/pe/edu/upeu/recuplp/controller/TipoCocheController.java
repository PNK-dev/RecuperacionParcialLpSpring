package pe.edu.upeu.recuplp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.recuplp.entity.TipoCoche;
import pe.edu.upeu.recuplp.service.TipoCocheService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/tipocoche")
@CrossOrigin(origins = "http://localhost:4200")
public class TipoCocheController {
    @Autowired
    private TipoCocheService tipoCocheService;

    @GetMapping
    public ResponseEntity<List<TipoCoche>> readAll() {
        try {
            List<TipoCoche> tiposCoche = tipoCocheService.readAll();
            if (tiposCoche.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(tiposCoche, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<TipoCoche> create(@Valid @RequestBody TipoCoche tipoCoche) {
        try {
            TipoCoche t = tipoCocheService.create(tipoCoche);
            return new ResponseEntity<>(t, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoCoche> getTipoCocheById(@PathVariable("id") Long id) {
        try {
            TipoCoche t = tipoCocheService.read(id);
            return new ResponseEntity<>(t, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTipoCoche(@PathVariable("id") Long id) {
        try {
            tipoCocheService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoCoche> updateTipoCoche(@PathVariable("id") Long id, @Valid @RequestBody TipoCoche tipoCoche) {
        tipoCoche.setId(id);
        TipoCoche updatedTipoCoche = tipoCocheService.update(tipoCoche);
        if (updatedTipoCoche != null) {
            return new ResponseEntity<>(updatedTipoCoche, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
