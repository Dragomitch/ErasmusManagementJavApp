package erasmus.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PartnerOptionId implements Serializable {
    private Long partnerid;
    private Long optionId;
}
