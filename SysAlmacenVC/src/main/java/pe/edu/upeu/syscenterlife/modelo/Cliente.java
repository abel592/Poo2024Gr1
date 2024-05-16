package pe.edu.upeu.syscenterlife.modelo;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@ToString

public class Cliente {

    @Id
    @Basic(optional=false)
    String dniruc;
    String nombrers;
    String documento;

}
