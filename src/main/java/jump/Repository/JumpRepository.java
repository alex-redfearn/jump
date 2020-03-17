package jump.Repository;

import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.reactive.RxJavaCrudRepository;
import io.reactivex.Maybe;
import jump.model.Planet;

@JdbcRepository(dialect = Dialect.H2)
public interface JumpRepository extends RxJavaCrudRepository<Planet, Long> {

  Maybe<Planet> findByName(String planet);

}
