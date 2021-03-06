package com.itgarden.mapper;

import com.itgarden.dto.UserDTO;
import com.itgarden.entity.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(implementationPackage = "mapper.impl")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    User userDTOtoUser(UserDTO userDto);
    @InheritInverseConfiguration
    UserDTO userToUserDTO(User user);

}
