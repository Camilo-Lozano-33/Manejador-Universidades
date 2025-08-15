package co.edu.ucentral.manejadorUniveridades.entidades;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Mascotas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Mascota {

    @Id

    private Long id;
    private String color;
    private String nombre;
    private String raza;
    private String especie;

}
