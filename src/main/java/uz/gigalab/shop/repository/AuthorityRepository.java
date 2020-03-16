package uz.gigalab.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.gigalab.shop.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
