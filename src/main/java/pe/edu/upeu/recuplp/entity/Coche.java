package pe.edu.upeu.recuplp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
@Entity
@Table(name="coches")
public class Coche {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="matricula")
	private String matricula;
	@Column(name="NumPuertas")
	private int NumPuertas;
	@ManyToOne
    @JoinColumn(name="idmarca", nullable = false)
    private Marca marca;
	
	@ManyToOne
    @JoinColumn(name="idtipocoche", nullable = false)
    private TipoCoche tipocoche;
	
}
