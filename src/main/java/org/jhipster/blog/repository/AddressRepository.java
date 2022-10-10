package org.jhipster.blog.repository;

import java.util.List;
import org.jhipster.blog.domain.Address;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Address entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AddressRepository extends JpaRepository<Address, Long>, JpaSpecificationExecutor<Address> {
    @Query("select address from Address address where address.addressUSer.login = ?#{principal.username}")
    List<Address> findByAddressUSerIsCurrentUser();
}
