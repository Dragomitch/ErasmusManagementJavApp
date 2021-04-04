package erasmus.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data @Builder @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode
public class Address implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private String street;
    private String number;
    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;
    private String city;
    private String postalCode;
    private String region;
}
