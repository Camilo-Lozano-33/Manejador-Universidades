package co.edu.ucentral.manejadorUniveridades.servicios;

import co.edu.ucentral.manejadorUniveridades.entidades.Mascota;
import co.edu.ucentral.manejadorUniveridades.repositorios.RepositorioMascotas;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor

public class ServicioMascotas {
    @Autowired
    private RepositorioMascotas repositorioMascotas;

    public void crear(Mascota mascota){this.repositorioMascotas.save(mascota);}
    public void borrar(Mascota mascota){this.repositorioMascotas.delete(mascota);}
}
