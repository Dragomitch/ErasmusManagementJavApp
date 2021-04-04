package org.dragomitch.erasmusmanagementjavapp.main.business;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PartnerOptionId implements Serializable {
    @Column(name = "partnerId")
    private Long partnerid;
    @Column(name = "optionId")
    private Long optionId;
}
