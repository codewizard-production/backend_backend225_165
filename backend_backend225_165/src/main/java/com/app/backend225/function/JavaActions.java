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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  