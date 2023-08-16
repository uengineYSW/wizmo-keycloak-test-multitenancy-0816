package wizmokeycloak.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import wizmokeycloak.BasicApplication;
import wizmokeycloak.domain.CompanyCreated;
import wizmokeycloak.domain.CompanyDeleted;

@Entity
@Table(name = "Company_table")
@Data
//<<< DDD / Aggregate Root
public class Company {

    @Id
    private String code;

    private String name;

    private String industry;

    private String foundedDate;

    @PostPersist
    public void onPostPersist() {
        CompanyCreated companyCreated = new CompanyCreated(this);
        companyCreated.publishAfterCommit();

        CompanyDeleted companyDeleted = new CompanyDeleted(this);
        companyDeleted.publishAfterCommit();
    }

    @PreRemove
    public void onPreRemove() {}

    public static CompanyRepository repository() {
        CompanyRepository companyRepository = BasicApplication.applicationContext.getBean(
            CompanyRepository.class
        );
        return companyRepository;
    }

    //<<< Clean Arch / Port Method
    public void updateCompany(UpdateCompanyCommand updateCompanyCommand) {
        //implement business logic here:

        CompanyUpdated companyUpdated = new CompanyUpdated(this);
        companyUpdated.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
