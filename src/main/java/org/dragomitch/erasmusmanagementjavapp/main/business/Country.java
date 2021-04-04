package org.dragomitch.erasmusmanagementjavapp.main.business;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
