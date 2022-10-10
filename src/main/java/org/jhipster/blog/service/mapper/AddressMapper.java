package org.jhipster.blog.service.mapper;

import org.jhipster.blog.domain.*;
import org.jhipster.blog.service.dto.AddressDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Address} and its DTO {@link AddressDTO}.
 */
@Mapper(componentModel = "spring", uses = { UserMapper.class })
public interface AddressMapper extends EntityMapper<AddressDTO, Address> {
    @Mapping(target = "addressUSer", source = "addressUSer", qualifiedByName = "login")
    AddressDTO toDto(Address s);
}
