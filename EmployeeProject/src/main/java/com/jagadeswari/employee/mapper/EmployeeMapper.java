package com.jagadeswari.employee.mapper;

import java.util.List;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.jagadeswari.employee.dto.EmployeeDTO;
import com.jagadeswari.employee.entity.EmployeeEntity;


@Component
@Mapper(
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
        )
public interface EmployeeMapper {
    EmployeeDTO toEmployeeDTO(EmployeeEntity employeeEntity);

    //@Mapping(target = "infoType", constant = "Morbidity")
    EmployeeEntity toEmployeeEntity(EmployeeDTO employeeDto);

    List<EmployeeDTO> toEmployeeDTOList(List<EmployeeEntity> employeeList);
}

