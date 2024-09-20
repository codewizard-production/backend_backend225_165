package com.app.backend225.function;

import com.app.backend225.model.PerformanceAppraisal;
import com.app.backend225.model.Organization;
import com.app.backend225.model.Training;
import com.app.backend225.model.EmployeePersonalInfo;
import com.app.backend225.model.EmlpoyeeProfile;
import com.app.backend225.enums.EmploymentType;
import com.app.backend225.enums.OrgDept;
import com.app.backend225.enums.TrainingLevel;
import com.app.backend225.enums.OrgBranch;
import com.app.backend225.converter.OrgBranchConverter;
import com.app.backend225.converter.TrainingLevelConverter;
import com.app.backend225.converter.EmploymentTypeConverter;
import com.app.backend225.converter.OrgDeptConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.backend225.repository.TrainingRepository;
import com.app.backend225.repository.PerformanceAppraisalRepository;
import com.app.backend225.repository.OrganizationRepository;
import com.app.backend225.repository.EmployeePersonalInfoRepository;
import com.app.backend225.repository.EmlpoyeeProfileRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
