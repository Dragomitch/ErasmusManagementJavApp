package erasmus.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data @Builder @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode
public class ErasmusProgram implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long erasmusProgramId;
    private String programName;
    private String externalSoftName;
}
