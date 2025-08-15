package co.edu.ucentral.manejadorUniveridades.controladores;

import co.edu.ucentral.manejadorUniveridades.entidades.Mascota;
import co.edu.ucentral.manejadorUniveridades.servicios.ServicioMascotas;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/Mascotas")

public class ControladorMascotas {
    @Autowired
    private ServicioMascotas servicioMascotas;

    @PostMapping ("/")
    public void crear(@RequestBody Mascota mascota){this.servicioMascotas.crear(mascota);}
    @GetMapping ("/")
    public void borrar(@RequestBody Mascota mascota){this.servicioMascotas.borrar(mascota);}

}
