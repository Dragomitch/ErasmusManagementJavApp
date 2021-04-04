package erasmus.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data @Builder @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode
public class Payment implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;
    @ManyToOne(fetch = FetchType.LAZY)
    private MobilityChoice mobilityChoice;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    private NominatedStudent nominatedStudent;
    private String mobilityType;
    private int academicYear;
    private int term;
    @ManyToOne(fetch = FetchType.LAZY)
    private ErasmusProgram erasmusProgram;
    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;
    @ManyToOne(fetch = FetchType.LAZY)
    private Partner partner;
    private LocalDateTime paymentDate;
    private String paymentType;
}
