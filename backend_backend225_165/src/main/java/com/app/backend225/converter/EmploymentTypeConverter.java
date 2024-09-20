package com.app.backend225.converter;

import com.app.backend225.enums.EmploymentType;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class EmploymentTypeConverter implements AttributeConverter<EmploymentType, Integer> {

    @Override
    public Integer convertToDatabaseColumn(EmploymentType employmentType) {
        return employmentType != null ? employmentType.ordinal() : null;
    }

    @Override
    public EmploymentType convertToEntityAttribute(Integer dbData) {
      if (dbData == null) {
        return null;
      }
		  return EmploymentType.getEmploymentType(dbData);
    }
}
