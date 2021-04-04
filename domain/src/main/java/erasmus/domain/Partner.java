package erasmus.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data @Builder @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode
public class Partner implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long partnerId;
    private String legalName;
    private String businessName;
    private String fullName;
    private String organisationType;
    private int employeeCount;
    @ManyToOne(fetch = FetchType.LAZY)
    private Address address;
    private String phoneNumber;
    private String email;
    private String website;
    private boolean archived;
    private boolean archivable;
    private boolean status;
    @OneToMany
    private List<PartnerOption> options;
    @ManyToOne(fetch = FetchType.LAZY)
    private ErasmusProgram programme;
}
