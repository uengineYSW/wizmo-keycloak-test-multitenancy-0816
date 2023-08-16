package wizmokeycloak.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import wizmokeycloak.domain.*;
import wizmokeycloak.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CompanyDeleted extends AbstractEvent {

    private String code;

    public CompanyDeleted(Company aggregate) {
        super(aggregate);
    }

    public CompanyDeleted() {
        super();
    }
}
//>>> DDD / Domain Event
