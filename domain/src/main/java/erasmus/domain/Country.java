package erasmus.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data @Builder @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode
public class Country  implements Serializable {
    @Id
    private String countryCode;
    private String shortCountryCode;
    private String fullCountryName;
    private int numericCountryValue;
    @ManyToOne(fetch = FetchType.LAZY)
    private ErasmusProgram erasmusProgram;
}
