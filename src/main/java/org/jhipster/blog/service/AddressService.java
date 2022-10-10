package org.jhipster.blog.service;

import java.util.List;
import java.util.Optional;
import org.jhipster.blog.service.dto.AddressDTO;

/**
 * Service Interface for managing {@link org.jhipster.blog.domain.Address}.
 */
public interface AddressService {
    /**
     * Save a address.
     *
     * @param addressDTO the entity to save.
     * @return the persisted entity.
     */
    AddressDTO save(AddressDTO addressDTO);

    /**
     * Partially updates a address.
     *
     * @param addressDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<AddressDTO> partialUpdate(AddressDTO addressDTO);

    /**
     * Get all the addresses.
     *
     * @return the list of entities.
     */
    List<AddressDTO> findAll();

    /**
     * Get the "id" address.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<AddressDTO> findOne(Long id);

    /**
     * Delete the "id" address.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
