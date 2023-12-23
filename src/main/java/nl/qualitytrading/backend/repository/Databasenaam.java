package nl.qualitytrading.backend.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@Entity
@Table(name = "databasenaam")
@NoArgsConstructor
public class Databasenaam {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String naam;

}
