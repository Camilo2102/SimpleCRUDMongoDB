package cloud.webgen.web.crud.mongodb.repository;

import cloud.webgen.web.crud.core.domain.model.WebGenAuditModel;
import cloud.webgen.web.crud.core.domain.ports.WebgenAuditRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface SimpleCRUDMongoRepository<T extends WebGenAuditModel> extends WebgenAuditRepository<T> {
}
