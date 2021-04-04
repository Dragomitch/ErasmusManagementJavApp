package erasmus.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data @Builder @NoArgsConstructor @AllArgsConstructor @ToString @EqualsAndHashCode
public class Mobility implements Serializable {
    @Id
    private Long id;
    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    private MobilityChoice mobilityChoiceId;
    private LocalDateTime submissionDate;
    private String state;
    private String stateBeforeCancellation;
    @OneToMany
    private List<RequiredMobilityDocument> documents;
    private LocalDateTime firstPaymentRequestDate;
    private LocalDateTime secondPaymentRequestDate;
    private boolean proEcoEncoding;
    private boolean secondSoftwareEncoding;
    @OneToOne
    private User professorInCharge;
    @OneToOne
    private NominatedStudent nominatedStudent;
}
