package co.edu.ucentral.manejadorUniveridades.repositorios;

import co.edu.ucentral.manejadorUniveridades.entidades.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioMascotas  extends JpaRepository<Mascota, Long> {

}
