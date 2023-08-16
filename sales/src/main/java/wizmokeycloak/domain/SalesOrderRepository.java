package wizmokeycloak.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import wizmokeycloak.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "salesOrders",
    path = "salesOrders"
)
public interface SalesOrderRepository
    extends PagingAndSortingRepository<SalesOrder, String> {}
