/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.isotc211._2005.gmd.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.ObjectReferencePropertyType;

import org.isotc211._2005.gmd.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.isotc211._2005.gmd.GMDPackage
 * @generated
 */
public class GMDSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GMDPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMDSwitch() {
		if (modelPackage == null) {
			modelPackage = GMDPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GMDPackage.ABSTRACT_DQ_COMPLETENESS_TYPE: {
				AbstractDQCompletenessType abstractDQCompletenessType = (AbstractDQCompletenessType)theEObject;
				T result = caseAbstractDQCompletenessType(abstractDQCompletenessType);
				if (result == null) result = caseAbstractDQElementType(abstractDQCompletenessType);
				if (result == null) result = caseAbstractObjectType(abstractDQCompletenessType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.ABSTRACT_DQ_ELEMENT_TYPE: {
				AbstractDQElementType abstractDQElementType = (AbstractDQElementType)theEObject;
				T result = caseAbstractDQElementType(abstractDQElementType);
				if (result == null) result = caseAbstractObjectType(abstractDQElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.ABSTRACT_DQ_LOGICAL_CONSISTENCY_TYPE: {
				AbstractDQLogicalConsistencyType abstractDQLogicalConsistencyType = (AbstractDQLogicalConsistencyType)theEObject;
				T result = caseAbstractDQLogicalConsistencyType(abstractDQLogicalConsistencyType);
				if (result == null) result = caseAbstractDQElementType(abstractDQLogicalConsistencyType);
				if (result == null) result = caseAbstractObjectType(abstractDQLogicalConsistencyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.ABSTRACT_DQ_POSITIONAL_ACCURACY_TYPE: {
				AbstractDQPositionalAccuracyType abstractDQPositionalAccuracyType = (AbstractDQPositionalAccuracyType)theEObject;
				T result = caseAbstractDQPositionalAccuracyType(abstractDQPositionalAccuracyType);
				if (result == null) result = caseAbstractDQElementType(abstractDQPositionalAccuracyType);
				if (result == null) result = caseAbstractObjectType(abstractDQPositionalAccuracyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.ABSTRACT_DQ_RESULT_TYPE: {
				AbstractDQResultType abstractDQResultType = (AbstractDQResultType)theEObject;
				T result = caseAbstractDQResultType(abstractDQResultType);
				if (result == null) result = caseAbstractObjectType(abstractDQResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.ABSTRACT_DQ_TEMPORAL_ACCURACY_TYPE: {
				AbstractDQTemporalAccuracyType abstractDQTemporalAccuracyType = (AbstractDQTemporalAccuracyType)theEObject;
				T result = caseAbstractDQTemporalAccuracyType(abstractDQTemporalAccuracyType);
				if (result == null) result = caseAbstractDQElementType(abstractDQTemporalAccuracyType);
				if (result == null) result = caseAbstractObjectType(abstractDQTemporalAccuracyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.ABSTRACT_DQ_THEMATIC_ACCURACY_TYPE: {
				AbstractDQThematicAccuracyType abstractDQThematicAccuracyType = (AbstractDQThematicAccuracyType)theEObject;
				T result = caseAbstractDQThematicAccuracyType(abstractDQThematicAccuracyType);
				if (result == null) result = caseAbstractDQElementType(abstractDQThematicAccuracyType);
				if (result == null) result = caseAbstractObjectType(abstractDQThematicAccuracyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.ABSTRACT_DS_AGGREGATE_TYPE: {
				AbstractDSAggregateType abstractDSAggregateType = (AbstractDSAggregateType)theEObject;
				T result = caseAbstractDSAggregateType(abstractDSAggregateType);
				if (result == null) result = caseAbstractObjectType(abstractDSAggregateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.ABSTRACT_EX_GEOGRAPHIC_EXTENT_TYPE: {
				AbstractEXGeographicExtentType abstractEXGeographicExtentType = (AbstractEXGeographicExtentType)theEObject;
				T result = caseAbstractEXGeographicExtentType(abstractEXGeographicExtentType);
				if (result == null) result = caseAbstractObjectType(abstractEXGeographicExtentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.ABSTRACT_MD_CONTENT_INFORMATION_TYPE: {
				AbstractMDContentInformationType abstractMDContentInformationType = (AbstractMDContentInformationType)theEObject;
				T result = caseAbstractMDContentInformationType(abstractMDContentInformationType);
				if (result == null) result = caseAbstractObjectType(abstractMDContentInformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.ABSTRACT_MD_IDENTIFICATION_TYPE: {
				AbstractMDIdentificationType abstractMDIdentificationType = (AbstractMDIdentificationType)theEObject;
				T result = caseAbstractMDIdentificationType(abstractMDIdentificationType);
				if (result == null) result = caseAbstractObjectType(abstractMDIdentificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.ABSTRACT_MD_SPATIAL_REPRESENTATION_TYPE: {
				AbstractMDSpatialRepresentationType abstractMDSpatialRepresentationType = (AbstractMDSpatialRepresentationType)theEObject;
				T result = caseAbstractMDSpatialRepresentationType(abstractMDSpatialRepresentationType);
				if (result == null) result = caseAbstractObjectType(abstractMDSpatialRepresentationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.ABSTRACT_RS_REFERENCE_SYSTEM_TYPE: {
				AbstractRSReferenceSystemType abstractRSReferenceSystemType = (AbstractRSReferenceSystemType)theEObject;
				T result = caseAbstractRSReferenceSystemType(abstractRSReferenceSystemType);
				if (result == null) result = caseAbstractObjectType(abstractRSReferenceSystemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_ADDRESS_PROPERTY_TYPE: {
				CIAddressPropertyType ciAddressPropertyType = (CIAddressPropertyType)theEObject;
				T result = caseCIAddressPropertyType(ciAddressPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_ADDRESS_TYPE: {
				CIAddressType ciAddressType = (CIAddressType)theEObject;
				T result = caseCIAddressType(ciAddressType);
				if (result == null) result = caseAbstractObjectType(ciAddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_CITATION_PROPERTY_TYPE: {
				CICitationPropertyType ciCitationPropertyType = (CICitationPropertyType)theEObject;
				T result = caseCICitationPropertyType(ciCitationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_CITATION_TYPE: {
				CICitationType ciCitationType = (CICitationType)theEObject;
				T result = caseCICitationType(ciCitationType);
				if (result == null) result = caseAbstractObjectType(ciCitationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_CONTACT_PROPERTY_TYPE: {
				CIContactPropertyType ciContactPropertyType = (CIContactPropertyType)theEObject;
				T result = caseCIContactPropertyType(ciContactPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_CONTACT_TYPE: {
				CIContactType ciContactType = (CIContactType)theEObject;
				T result = caseCIContactType(ciContactType);
				if (result == null) result = caseAbstractObjectType(ciContactType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_DATE_PROPERTY_TYPE: {
				CIDatePropertyType ciDatePropertyType = (CIDatePropertyType)theEObject;
				T result = caseCIDatePropertyType(ciDatePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_DATE_TYPE: {
				CIDateType ciDateType = (CIDateType)theEObject;
				T result = caseCIDateType(ciDateType);
				if (result == null) result = caseAbstractObjectType(ciDateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_DATE_TYPE_CODE_PROPERTY_TYPE: {
				CIDateTypeCodePropertyType ciDateTypeCodePropertyType = (CIDateTypeCodePropertyType)theEObject;
				T result = caseCIDateTypeCodePropertyType(ciDateTypeCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_ON_LINE_FUNCTION_CODE_PROPERTY_TYPE: {
				CIOnLineFunctionCodePropertyType ciOnLineFunctionCodePropertyType = (CIOnLineFunctionCodePropertyType)theEObject;
				T result = caseCIOnLineFunctionCodePropertyType(ciOnLineFunctionCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_ONLINE_RESOURCE_PROPERTY_TYPE: {
				CIOnlineResourcePropertyType ciOnlineResourcePropertyType = (CIOnlineResourcePropertyType)theEObject;
				T result = caseCIOnlineResourcePropertyType(ciOnlineResourcePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE: {
				CIOnlineResourceType ciOnlineResourceType = (CIOnlineResourceType)theEObject;
				T result = caseCIOnlineResourceType(ciOnlineResourceType);
				if (result == null) result = caseAbstractObjectType(ciOnlineResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_PRESENTATION_FORM_CODE_PROPERTY_TYPE: {
				CIPresentationFormCodePropertyType ciPresentationFormCodePropertyType = (CIPresentationFormCodePropertyType)theEObject;
				T result = caseCIPresentationFormCodePropertyType(ciPresentationFormCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_RESPONSIBLE_PARTY_PROPERTY_TYPE: {
				CIResponsiblePartyPropertyType ciResponsiblePartyPropertyType = (CIResponsiblePartyPropertyType)theEObject;
				T result = caseCIResponsiblePartyPropertyType(ciResponsiblePartyPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE: {
				CIResponsiblePartyType ciResponsiblePartyType = (CIResponsiblePartyType)theEObject;
				T result = caseCIResponsiblePartyType(ciResponsiblePartyType);
				if (result == null) result = caseAbstractObjectType(ciResponsiblePartyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_ROLE_CODE_PROPERTY_TYPE: {
				CIRoleCodePropertyType ciRoleCodePropertyType = (CIRoleCodePropertyType)theEObject;
				T result = caseCIRoleCodePropertyType(ciRoleCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_SERIES_PROPERTY_TYPE: {
				CISeriesPropertyType ciSeriesPropertyType = (CISeriesPropertyType)theEObject;
				T result = caseCISeriesPropertyType(ciSeriesPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_SERIES_TYPE: {
				CISeriesType ciSeriesType = (CISeriesType)theEObject;
				T result = caseCISeriesType(ciSeriesType);
				if (result == null) result = caseAbstractObjectType(ciSeriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_TELEPHONE_PROPERTY_TYPE: {
				CITelephonePropertyType ciTelephonePropertyType = (CITelephonePropertyType)theEObject;
				T result = caseCITelephonePropertyType(ciTelephonePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.CI_TELEPHONE_TYPE: {
				CITelephoneType ciTelephoneType = (CITelephoneType)theEObject;
				T result = caseCITelephoneType(ciTelephoneType);
				if (result == null) result = caseAbstractObjectType(ciTelephoneType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.COUNTRY_PROPERTY_TYPE: {
				CountryPropertyType countryPropertyType = (CountryPropertyType)theEObject;
				T result = caseCountryPropertyType(countryPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY_PROPERTY_TYPE: {
				DQAbsoluteExternalPositionalAccuracyPropertyType dqAbsoluteExternalPositionalAccuracyPropertyType = (DQAbsoluteExternalPositionalAccuracyPropertyType)theEObject;
				T result = caseDQAbsoluteExternalPositionalAccuracyPropertyType(dqAbsoluteExternalPositionalAccuracyPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY_TYPE: {
				DQAbsoluteExternalPositionalAccuracyType dqAbsoluteExternalPositionalAccuracyType = (DQAbsoluteExternalPositionalAccuracyType)theEObject;
				T result = caseDQAbsoluteExternalPositionalAccuracyType(dqAbsoluteExternalPositionalAccuracyType);
				if (result == null) result = caseAbstractDQPositionalAccuracyType(dqAbsoluteExternalPositionalAccuracyType);
				if (result == null) result = caseAbstractDQElementType(dqAbsoluteExternalPositionalAccuracyType);
				if (result == null) result = caseAbstractObjectType(dqAbsoluteExternalPositionalAccuracyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_ACCURACY_OF_ATIME_MEASUREMENT_PROPERTY_TYPE: {
				DQAccuracyOfATimeMeasurementPropertyType dqAccuracyOfATimeMeasurementPropertyType = (DQAccuracyOfATimeMeasurementPropertyType)theEObject;
				T result = caseDQAccuracyOfATimeMeasurementPropertyType(dqAccuracyOfATimeMeasurementPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_ACCURACY_OF_ATIME_MEASUREMENT_TYPE: {
				DQAccuracyOfATimeMeasurementType dqAccuracyOfATimeMeasurementType = (DQAccuracyOfATimeMeasurementType)theEObject;
				T result = caseDQAccuracyOfATimeMeasurementType(dqAccuracyOfATimeMeasurementType);
				if (result == null) result = caseAbstractDQTemporalAccuracyType(dqAccuracyOfATimeMeasurementType);
				if (result == null) result = caseAbstractDQElementType(dqAccuracyOfATimeMeasurementType);
				if (result == null) result = caseAbstractObjectType(dqAccuracyOfATimeMeasurementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_COMPLETENESS_COMMISSION_PROPERTY_TYPE: {
				DQCompletenessCommissionPropertyType dqCompletenessCommissionPropertyType = (DQCompletenessCommissionPropertyType)theEObject;
				T result = caseDQCompletenessCommissionPropertyType(dqCompletenessCommissionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_COMPLETENESS_COMMISSION_TYPE: {
				DQCompletenessCommissionType dqCompletenessCommissionType = (DQCompletenessCommissionType)theEObject;
				T result = caseDQCompletenessCommissionType(dqCompletenessCommissionType);
				if (result == null) result = caseAbstractDQCompletenessType(dqCompletenessCommissionType);
				if (result == null) result = caseAbstractDQElementType(dqCompletenessCommissionType);
				if (result == null) result = caseAbstractObjectType(dqCompletenessCommissionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_COMPLETENESS_OMISSION_PROPERTY_TYPE: {
				DQCompletenessOmissionPropertyType dqCompletenessOmissionPropertyType = (DQCompletenessOmissionPropertyType)theEObject;
				T result = caseDQCompletenessOmissionPropertyType(dqCompletenessOmissionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_COMPLETENESS_OMISSION_TYPE: {
				DQCompletenessOmissionType dqCompletenessOmissionType = (DQCompletenessOmissionType)theEObject;
				T result = caseDQCompletenessOmissionType(dqCompletenessOmissionType);
				if (result == null) result = caseAbstractDQCompletenessType(dqCompletenessOmissionType);
				if (result == null) result = caseAbstractDQElementType(dqCompletenessOmissionType);
				if (result == null) result = caseAbstractObjectType(dqCompletenessOmissionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_COMPLETENESS_PROPERTY_TYPE: {
				DQCompletenessPropertyType dqCompletenessPropertyType = (DQCompletenessPropertyType)theEObject;
				T result = caseDQCompletenessPropertyType(dqCompletenessPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_CONCEPTUAL_CONSISTENCY_PROPERTY_TYPE: {
				DQConceptualConsistencyPropertyType dqConceptualConsistencyPropertyType = (DQConceptualConsistencyPropertyType)theEObject;
				T result = caseDQConceptualConsistencyPropertyType(dqConceptualConsistencyPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_CONCEPTUAL_CONSISTENCY_TYPE: {
				DQConceptualConsistencyType dqConceptualConsistencyType = (DQConceptualConsistencyType)theEObject;
				T result = caseDQConceptualConsistencyType(dqConceptualConsistencyType);
				if (result == null) result = caseAbstractDQLogicalConsistencyType(dqConceptualConsistencyType);
				if (result == null) result = caseAbstractDQElementType(dqConceptualConsistencyType);
				if (result == null) result = caseAbstractObjectType(dqConceptualConsistencyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_CONFORMANCE_RESULT_PROPERTY_TYPE: {
				DQConformanceResultPropertyType dqConformanceResultPropertyType = (DQConformanceResultPropertyType)theEObject;
				T result = caseDQConformanceResultPropertyType(dqConformanceResultPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_CONFORMANCE_RESULT_TYPE: {
				DQConformanceResultType dqConformanceResultType = (DQConformanceResultType)theEObject;
				T result = caseDQConformanceResultType(dqConformanceResultType);
				if (result == null) result = caseAbstractDQResultType(dqConformanceResultType);
				if (result == null) result = caseAbstractObjectType(dqConformanceResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_DATA_QUALITY_PROPERTY_TYPE: {
				DQDataQualityPropertyType dqDataQualityPropertyType = (DQDataQualityPropertyType)theEObject;
				T result = caseDQDataQualityPropertyType(dqDataQualityPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_DATA_QUALITY_TYPE: {
				DQDataQualityType dqDataQualityType = (DQDataQualityType)theEObject;
				T result = caseDQDataQualityType(dqDataQualityType);
				if (result == null) result = caseAbstractObjectType(dqDataQualityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_DOMAIN_CONSISTENCY_PROPERTY_TYPE: {
				DQDomainConsistencyPropertyType dqDomainConsistencyPropertyType = (DQDomainConsistencyPropertyType)theEObject;
				T result = caseDQDomainConsistencyPropertyType(dqDomainConsistencyPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_DOMAIN_CONSISTENCY_TYPE: {
				DQDomainConsistencyType dqDomainConsistencyType = (DQDomainConsistencyType)theEObject;
				T result = caseDQDomainConsistencyType(dqDomainConsistencyType);
				if (result == null) result = caseAbstractDQLogicalConsistencyType(dqDomainConsistencyType);
				if (result == null) result = caseAbstractDQElementType(dqDomainConsistencyType);
				if (result == null) result = caseAbstractObjectType(dqDomainConsistencyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_ELEMENT_PROPERTY_TYPE: {
				DQElementPropertyType dqElementPropertyType = (DQElementPropertyType)theEObject;
				T result = caseDQElementPropertyType(dqElementPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_EVALUATION_METHOD_TYPE_CODE_PROPERTY_TYPE: {
				DQEvaluationMethodTypeCodePropertyType dqEvaluationMethodTypeCodePropertyType = (DQEvaluationMethodTypeCodePropertyType)theEObject;
				T result = caseDQEvaluationMethodTypeCodePropertyType(dqEvaluationMethodTypeCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_FORMAT_CONSISTENCY_PROPERTY_TYPE: {
				DQFormatConsistencyPropertyType dqFormatConsistencyPropertyType = (DQFormatConsistencyPropertyType)theEObject;
				T result = caseDQFormatConsistencyPropertyType(dqFormatConsistencyPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_FORMAT_CONSISTENCY_TYPE: {
				DQFormatConsistencyType dqFormatConsistencyType = (DQFormatConsistencyType)theEObject;
				T result = caseDQFormatConsistencyType(dqFormatConsistencyType);
				if (result == null) result = caseAbstractDQLogicalConsistencyType(dqFormatConsistencyType);
				if (result == null) result = caseAbstractDQElementType(dqFormatConsistencyType);
				if (result == null) result = caseAbstractObjectType(dqFormatConsistencyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_GRIDDED_DATA_POSITIONAL_ACCURACY_PROPERTY_TYPE: {
				DQGriddedDataPositionalAccuracyPropertyType dqGriddedDataPositionalAccuracyPropertyType = (DQGriddedDataPositionalAccuracyPropertyType)theEObject;
				T result = caseDQGriddedDataPositionalAccuracyPropertyType(dqGriddedDataPositionalAccuracyPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_GRIDDED_DATA_POSITIONAL_ACCURACY_TYPE: {
				DQGriddedDataPositionalAccuracyType dqGriddedDataPositionalAccuracyType = (DQGriddedDataPositionalAccuracyType)theEObject;
				T result = caseDQGriddedDataPositionalAccuracyType(dqGriddedDataPositionalAccuracyType);
				if (result == null) result = caseAbstractDQPositionalAccuracyType(dqGriddedDataPositionalAccuracyType);
				if (result == null) result = caseAbstractDQElementType(dqGriddedDataPositionalAccuracyType);
				if (result == null) result = caseAbstractObjectType(dqGriddedDataPositionalAccuracyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_LOGICAL_CONSISTENCY_PROPERTY_TYPE: {
				DQLogicalConsistencyPropertyType dqLogicalConsistencyPropertyType = (DQLogicalConsistencyPropertyType)theEObject;
				T result = caseDQLogicalConsistencyPropertyType(dqLogicalConsistencyPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_NON_QUANTITATIVE_ATTRIBUTE_ACCURACY_PROPERTY_TYPE: {
				DQNonQuantitativeAttributeAccuracyPropertyType dqNonQuantitativeAttributeAccuracyPropertyType = (DQNonQuantitativeAttributeAccuracyPropertyType)theEObject;
				T result = caseDQNonQuantitativeAttributeAccuracyPropertyType(dqNonQuantitativeAttributeAccuracyPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_NON_QUANTITATIVE_ATTRIBUTE_ACCURACY_TYPE: {
				DQNonQuantitativeAttributeAccuracyType dqNonQuantitativeAttributeAccuracyType = (DQNonQuantitativeAttributeAccuracyType)theEObject;
				T result = caseDQNonQuantitativeAttributeAccuracyType(dqNonQuantitativeAttributeAccuracyType);
				if (result == null) result = caseAbstractDQThematicAccuracyType(dqNonQuantitativeAttributeAccuracyType);
				if (result == null) result = caseAbstractDQElementType(dqNonQuantitativeAttributeAccuracyType);
				if (result == null) result = caseAbstractObjectType(dqNonQuantitativeAttributeAccuracyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_POSITIONAL_ACCURACY_PROPERTY_TYPE: {
				DQPositionalAccuracyPropertyType dqPositionalAccuracyPropertyType = (DQPositionalAccuracyPropertyType)theEObject;
				T result = caseDQPositionalAccuracyPropertyType(dqPositionalAccuracyPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_QUANTITATIVE_ATTRIBUTE_ACCURACY_PROPERTY_TYPE: {
				DQQuantitativeAttributeAccuracyPropertyType dqQuantitativeAttributeAccuracyPropertyType = (DQQuantitativeAttributeAccuracyPropertyType)theEObject;
				T result = caseDQQuantitativeAttributeAccuracyPropertyType(dqQuantitativeAttributeAccuracyPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_QUANTITATIVE_ATTRIBUTE_ACCURACY_TYPE: {
				DQQuantitativeAttributeAccuracyType dqQuantitativeAttributeAccuracyType = (DQQuantitativeAttributeAccuracyType)theEObject;
				T result = caseDQQuantitativeAttributeAccuracyType(dqQuantitativeAttributeAccuracyType);
				if (result == null) result = caseAbstractDQThematicAccuracyType(dqQuantitativeAttributeAccuracyType);
				if (result == null) result = caseAbstractDQElementType(dqQuantitativeAttributeAccuracyType);
				if (result == null) result = caseAbstractObjectType(dqQuantitativeAttributeAccuracyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_QUANTITATIVE_RESULT_PROPERTY_TYPE: {
				DQQuantitativeResultPropertyType dqQuantitativeResultPropertyType = (DQQuantitativeResultPropertyType)theEObject;
				T result = caseDQQuantitativeResultPropertyType(dqQuantitativeResultPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE: {
				DQQuantitativeResultType dqQuantitativeResultType = (DQQuantitativeResultType)theEObject;
				T result = caseDQQuantitativeResultType(dqQuantitativeResultType);
				if (result == null) result = caseAbstractDQResultType(dqQuantitativeResultType);
				if (result == null) result = caseAbstractObjectType(dqQuantitativeResultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_RELATIVE_INTERNAL_POSITIONAL_ACCURACY_PROPERTY_TYPE: {
				DQRelativeInternalPositionalAccuracyPropertyType dqRelativeInternalPositionalAccuracyPropertyType = (DQRelativeInternalPositionalAccuracyPropertyType)theEObject;
				T result = caseDQRelativeInternalPositionalAccuracyPropertyType(dqRelativeInternalPositionalAccuracyPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_RELATIVE_INTERNAL_POSITIONAL_ACCURACY_TYPE: {
				DQRelativeInternalPositionalAccuracyType dqRelativeInternalPositionalAccuracyType = (DQRelativeInternalPositionalAccuracyType)theEObject;
				T result = caseDQRelativeInternalPositionalAccuracyType(dqRelativeInternalPositionalAccuracyType);
				if (result == null) result = caseAbstractDQPositionalAccuracyType(dqRelativeInternalPositionalAccuracyType);
				if (result == null) result = caseAbstractDQElementType(dqRelativeInternalPositionalAccuracyType);
				if (result == null) result = caseAbstractObjectType(dqRelativeInternalPositionalAccuracyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_RESULT_PROPERTY_TYPE: {
				DQResultPropertyType dqResultPropertyType = (DQResultPropertyType)theEObject;
				T result = caseDQResultPropertyType(dqResultPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_SCOPE_PROPERTY_TYPE: {
				DQScopePropertyType dqScopePropertyType = (DQScopePropertyType)theEObject;
				T result = caseDQScopePropertyType(dqScopePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_SCOPE_TYPE: {
				DQScopeType dqScopeType = (DQScopeType)theEObject;
				T result = caseDQScopeType(dqScopeType);
				if (result == null) result = caseAbstractObjectType(dqScopeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_TEMPORAL_ACCURACY_PROPERTY_TYPE: {
				DQTemporalAccuracyPropertyType dqTemporalAccuracyPropertyType = (DQTemporalAccuracyPropertyType)theEObject;
				T result = caseDQTemporalAccuracyPropertyType(dqTemporalAccuracyPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_TEMPORAL_CONSISTENCY_PROPERTY_TYPE: {
				DQTemporalConsistencyPropertyType dqTemporalConsistencyPropertyType = (DQTemporalConsistencyPropertyType)theEObject;
				T result = caseDQTemporalConsistencyPropertyType(dqTemporalConsistencyPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_TEMPORAL_CONSISTENCY_TYPE: {
				DQTemporalConsistencyType dqTemporalConsistencyType = (DQTemporalConsistencyType)theEObject;
				T result = caseDQTemporalConsistencyType(dqTemporalConsistencyType);
				if (result == null) result = caseAbstractDQTemporalAccuracyType(dqTemporalConsistencyType);
				if (result == null) result = caseAbstractDQElementType(dqTemporalConsistencyType);
				if (result == null) result = caseAbstractObjectType(dqTemporalConsistencyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_TEMPORAL_VALIDITY_PROPERTY_TYPE: {
				DQTemporalValidityPropertyType dqTemporalValidityPropertyType = (DQTemporalValidityPropertyType)theEObject;
				T result = caseDQTemporalValidityPropertyType(dqTemporalValidityPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_THEMATIC_ACCURACY_PROPERTY_TYPE: {
				DQThematicAccuracyPropertyType dqThematicAccuracyPropertyType = (DQThematicAccuracyPropertyType)theEObject;
				T result = caseDQThematicAccuracyPropertyType(dqThematicAccuracyPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_THEMATIC_CLASSIFICATION_CORRECTNESS_PROPERTY_TYPE: {
				DQThematicClassificationCorrectnessPropertyType dqThematicClassificationCorrectnessPropertyType = (DQThematicClassificationCorrectnessPropertyType)theEObject;
				T result = caseDQThematicClassificationCorrectnessPropertyType(dqThematicClassificationCorrectnessPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_TOPOLOGICAL_CONSISTENCY_PROPERTY_TYPE: {
				DQTopologicalConsistencyPropertyType dqTopologicalConsistencyPropertyType = (DQTopologicalConsistencyPropertyType)theEObject;
				T result = caseDQTopologicalConsistencyPropertyType(dqTopologicalConsistencyPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_AGGREGATE_PROPERTY_TYPE: {
				DSAggregatePropertyType dsAggregatePropertyType = (DSAggregatePropertyType)theEObject;
				T result = caseDSAggregatePropertyType(dsAggregatePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_ASSOCIATION_PROPERTY_TYPE: {
				DSAssociationPropertyType dsAssociationPropertyType = (DSAssociationPropertyType)theEObject;
				T result = caseDSAssociationPropertyType(dsAssociationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_ASSOCIATION_TYPE_CODE_PROPERTY_TYPE: {
				DSAssociationTypeCodePropertyType dsAssociationTypeCodePropertyType = (DSAssociationTypeCodePropertyType)theEObject;
				T result = caseDSAssociationTypeCodePropertyType(dsAssociationTypeCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_DATA_SET_PROPERTY_TYPE: {
				DSDataSetPropertyType dsDataSetPropertyType = (DSDataSetPropertyType)theEObject;
				T result = caseDSDataSetPropertyType(dsDataSetPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_DATA_SET_TYPE: {
				DSDataSetType dsDataSetType = (DSDataSetType)theEObject;
				T result = caseDSDataSetType(dsDataSetType);
				if (result == null) result = caseAbstractObjectType(dsDataSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_INITIATIVE_TYPE_CODE_PROPERTY_TYPE: {
				DSInitiativeTypeCodePropertyType dsInitiativeTypeCodePropertyType = (DSInitiativeTypeCodePropertyType)theEObject;
				T result = caseDSInitiativeTypeCodePropertyType(dsInitiativeTypeCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.EX_EXTENT_PROPERTY_TYPE: {
				EXExtentPropertyType exExtentPropertyType = (EXExtentPropertyType)theEObject;
				T result = caseEXExtentPropertyType(exExtentPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.EX_EXTENT_TYPE: {
				EXExtentType exExtentType = (EXExtentType)theEObject;
				T result = caseEXExtentType(exExtentType);
				if (result == null) result = caseAbstractObjectType(exExtentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.EX_GEOGRAPHIC_EXTENT_PROPERTY_TYPE: {
				EXGeographicExtentPropertyType exGeographicExtentPropertyType = (EXGeographicExtentPropertyType)theEObject;
				T result = caseEXGeographicExtentPropertyType(exGeographicExtentPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.EX_TEMPORAL_EXTENT_PROPERTY_TYPE: {
				EXTemporalExtentPropertyType exTemporalExtentPropertyType = (EXTemporalExtentPropertyType)theEObject;
				T result = caseEXTemporalExtentPropertyType(exTemporalExtentPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.EX_TEMPORAL_EXTENT_TYPE: {
				EXTemporalExtentType exTemporalExtentType = (EXTemporalExtentType)theEObject;
				T result = caseEXTemporalExtentType(exTemporalExtentType);
				if (result == null) result = caseAbstractObjectType(exTemporalExtentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.EX_VERTICAL_EXTENT_PROPERTY_TYPE: {
				EXVerticalExtentPropertyType exVerticalExtentPropertyType = (EXVerticalExtentPropertyType)theEObject;
				T result = caseEXVerticalExtentPropertyType(exVerticalExtentPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.EX_VERTICAL_EXTENT_TYPE: {
				EXVerticalExtentType exVerticalExtentType = (EXVerticalExtentType)theEObject;
				T result = caseEXVerticalExtentType(exVerticalExtentType);
				if (result == null) result = caseAbstractObjectType(exVerticalExtentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_TEMPORAL_VALIDITY_TYPE: {
				DQTemporalValidityType dqTemporalValidityType = (DQTemporalValidityType)theEObject;
				T result = caseDQTemporalValidityType(dqTemporalValidityType);
				if (result == null) result = caseAbstractDQTemporalAccuracyType(dqTemporalValidityType);
				if (result == null) result = caseAbstractDQElementType(dqTemporalValidityType);
				if (result == null) result = caseAbstractObjectType(dqTemporalValidityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_THEMATIC_CLASSIFICATION_CORRECTNESS_TYPE: {
				DQThematicClassificationCorrectnessType dqThematicClassificationCorrectnessType = (DQThematicClassificationCorrectnessType)theEObject;
				T result = caseDQThematicClassificationCorrectnessType(dqThematicClassificationCorrectnessType);
				if (result == null) result = caseAbstractDQThematicAccuracyType(dqThematicClassificationCorrectnessType);
				if (result == null) result = caseAbstractDQElementType(dqThematicClassificationCorrectnessType);
				if (result == null) result = caseAbstractObjectType(dqThematicClassificationCorrectnessType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DQ_TOPOLOGICAL_CONSISTENCY_TYPE: {
				DQTopologicalConsistencyType dqTopologicalConsistencyType = (DQTopologicalConsistencyType)theEObject;
				T result = caseDQTopologicalConsistencyType(dqTopologicalConsistencyType);
				if (result == null) result = caseAbstractDQLogicalConsistencyType(dqTopologicalConsistencyType);
				if (result == null) result = caseAbstractDQElementType(dqTopologicalConsistencyType);
				if (result == null) result = caseAbstractObjectType(dqTopologicalConsistencyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_ASSOCIATION_TYPE: {
				DSAssociationType dsAssociationType = (DSAssociationType)theEObject;
				T result = caseDSAssociationType(dsAssociationType);
				if (result == null) result = caseAbstractObjectType(dsAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_INITIATIVE_PROPERTY_TYPE: {
				DSInitiativePropertyType dsInitiativePropertyType = (DSInitiativePropertyType)theEObject;
				T result = caseDSInitiativePropertyType(dsInitiativePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_INITIATIVE_TYPE: {
				DSInitiativeType dsInitiativeType = (DSInitiativeType)theEObject;
				T result = caseDSInitiativeType(dsInitiativeType);
				if (result == null) result = caseAbstractDSAggregateType(dsInitiativeType);
				if (result == null) result = caseAbstractObjectType(dsInitiativeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_OTHER_AGGREGATE_PROPERTY_TYPE: {
				DSOtherAggregatePropertyType dsOtherAggregatePropertyType = (DSOtherAggregatePropertyType)theEObject;
				T result = caseDSOtherAggregatePropertyType(dsOtherAggregatePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_OTHER_AGGREGATE_TYPE: {
				DSOtherAggregateType dsOtherAggregateType = (DSOtherAggregateType)theEObject;
				T result = caseDSOtherAggregateType(dsOtherAggregateType);
				if (result == null) result = caseAbstractDSAggregateType(dsOtherAggregateType);
				if (result == null) result = caseAbstractObjectType(dsOtherAggregateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_PLATFORM_PROPERTY_TYPE: {
				DSPlatformPropertyType dsPlatformPropertyType = (DSPlatformPropertyType)theEObject;
				T result = caseDSPlatformPropertyType(dsPlatformPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_PLATFORM_TYPE: {
				DSPlatformType dsPlatformType = (DSPlatformType)theEObject;
				T result = caseDSPlatformType(dsPlatformType);
				if (result == null) result = caseDSSeriesType(dsPlatformType);
				if (result == null) result = caseAbstractDSAggregateType(dsPlatformType);
				if (result == null) result = caseAbstractObjectType(dsPlatformType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_PRODUCTION_SERIES_PROPERTY_TYPE: {
				DSProductionSeriesPropertyType dsProductionSeriesPropertyType = (DSProductionSeriesPropertyType)theEObject;
				T result = caseDSProductionSeriesPropertyType(dsProductionSeriesPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_PRODUCTION_SERIES_TYPE: {
				DSProductionSeriesType dsProductionSeriesType = (DSProductionSeriesType)theEObject;
				T result = caseDSProductionSeriesType(dsProductionSeriesType);
				if (result == null) result = caseDSSeriesType(dsProductionSeriesType);
				if (result == null) result = caseAbstractDSAggregateType(dsProductionSeriesType);
				if (result == null) result = caseAbstractObjectType(dsProductionSeriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_SENSOR_PROPERTY_TYPE: {
				DSSensorPropertyType dsSensorPropertyType = (DSSensorPropertyType)theEObject;
				T result = caseDSSensorPropertyType(dsSensorPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_SENSOR_TYPE: {
				DSSensorType dsSensorType = (DSSensorType)theEObject;
				T result = caseDSSensorType(dsSensorType);
				if (result == null) result = caseDSSeriesType(dsSensorType);
				if (result == null) result = caseAbstractDSAggregateType(dsSensorType);
				if (result == null) result = caseAbstractObjectType(dsSensorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_SERIES_PROPERTY_TYPE: {
				DSSeriesPropertyType dsSeriesPropertyType = (DSSeriesPropertyType)theEObject;
				T result = caseDSSeriesPropertyType(dsSeriesPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_SERIES_TYPE: {
				DSSeriesType dsSeriesType = (DSSeriesType)theEObject;
				T result = caseDSSeriesType(dsSeriesType);
				if (result == null) result = caseAbstractDSAggregateType(dsSeriesType);
				if (result == null) result = caseAbstractObjectType(dsSeriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_STEREO_MATE_PROPERTY_TYPE: {
				DSStereoMatePropertyType dsStereoMatePropertyType = (DSStereoMatePropertyType)theEObject;
				T result = caseDSStereoMatePropertyType(dsStereoMatePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.DS_STEREO_MATE_TYPE: {
				DSStereoMateType dsStereoMateType = (DSStereoMateType)theEObject;
				T result = caseDSStereoMateType(dsStereoMateType);
				if (result == null) result = caseDSOtherAggregateType(dsStereoMateType);
				if (result == null) result = caseAbstractDSAggregateType(dsStereoMateType);
				if (result == null) result = caseAbstractObjectType(dsStereoMateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.EX_BOUNDING_POLYGON_PROPERTY_TYPE: {
				EXBoundingPolygonPropertyType exBoundingPolygonPropertyType = (EXBoundingPolygonPropertyType)theEObject;
				T result = caseEXBoundingPolygonPropertyType(exBoundingPolygonPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.EX_BOUNDING_POLYGON_TYPE: {
				EXBoundingPolygonType exBoundingPolygonType = (EXBoundingPolygonType)theEObject;
				T result = caseEXBoundingPolygonType(exBoundingPolygonType);
				if (result == null) result = caseAbstractEXGeographicExtentType(exBoundingPolygonType);
				if (result == null) result = caseAbstractObjectType(exBoundingPolygonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_PROPERTY_TYPE: {
				EXGeographicBoundingBoxPropertyType exGeographicBoundingBoxPropertyType = (EXGeographicBoundingBoxPropertyType)theEObject;
				T result = caseEXGeographicBoundingBoxPropertyType(exGeographicBoundingBoxPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE: {
				EXGeographicBoundingBoxType exGeographicBoundingBoxType = (EXGeographicBoundingBoxType)theEObject;
				T result = caseEXGeographicBoundingBoxType(exGeographicBoundingBoxType);
				if (result == null) result = caseAbstractEXGeographicExtentType(exGeographicBoundingBoxType);
				if (result == null) result = caseAbstractObjectType(exGeographicBoundingBoxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.EX_GEOGRAPHIC_DESCRIPTION_PROPERTY_TYPE: {
				EXGeographicDescriptionPropertyType exGeographicDescriptionPropertyType = (EXGeographicDescriptionPropertyType)theEObject;
				T result = caseEXGeographicDescriptionPropertyType(exGeographicDescriptionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.EX_GEOGRAPHIC_DESCRIPTION_TYPE: {
				EXGeographicDescriptionType exGeographicDescriptionType = (EXGeographicDescriptionType)theEObject;
				T result = caseEXGeographicDescriptionType(exGeographicDescriptionType);
				if (result == null) result = caseAbstractEXGeographicExtentType(exGeographicDescriptionType);
				if (result == null) result = caseAbstractObjectType(exGeographicDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.EX_SPATIAL_TEMPORAL_EXTENT_PROPERTY_TYPE: {
				EXSpatialTemporalExtentPropertyType exSpatialTemporalExtentPropertyType = (EXSpatialTemporalExtentPropertyType)theEObject;
				T result = caseEXSpatialTemporalExtentPropertyType(exSpatialTemporalExtentPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.EX_SPATIAL_TEMPORAL_EXTENT_TYPE: {
				EXSpatialTemporalExtentType exSpatialTemporalExtentType = (EXSpatialTemporalExtentType)theEObject;
				T result = caseEXSpatialTemporalExtentType(exSpatialTemporalExtentType);
				if (result == null) result = caseEXTemporalExtentType(exSpatialTemporalExtentType);
				if (result == null) result = caseAbstractObjectType(exSpatialTemporalExtentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.LANGUAGE_CODE_PROPERTY_TYPE: {
				LanguageCodePropertyType languageCodePropertyType = (LanguageCodePropertyType)theEObject;
				T result = caseLanguageCodePropertyType(languageCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.LI_LINEAGE_PROPERTY_TYPE: {
				LILineagePropertyType liLineagePropertyType = (LILineagePropertyType)theEObject;
				T result = caseLILineagePropertyType(liLineagePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.LI_LINEAGE_TYPE: {
				LILineageType liLineageType = (LILineageType)theEObject;
				T result = caseLILineageType(liLineageType);
				if (result == null) result = caseAbstractObjectType(liLineageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.LI_PROCESS_STEP_PROPERTY_TYPE: {
				LIProcessStepPropertyType liProcessStepPropertyType = (LIProcessStepPropertyType)theEObject;
				T result = caseLIProcessStepPropertyType(liProcessStepPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.LI_PROCESS_STEP_TYPE: {
				LIProcessStepType liProcessStepType = (LIProcessStepType)theEObject;
				T result = caseLIProcessStepType(liProcessStepType);
				if (result == null) result = caseAbstractObjectType(liProcessStepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.LI_SOURCE_PROPERTY_TYPE: {
				LISourcePropertyType liSourcePropertyType = (LISourcePropertyType)theEObject;
				T result = caseLISourcePropertyType(liSourcePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.LI_SOURCE_TYPE: {
				LISourceType liSourceType = (LISourceType)theEObject;
				T result = caseLISourceType(liSourceType);
				if (result == null) result = caseAbstractObjectType(liSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.LOCALISED_CHARACTER_STRING_PROPERTY_TYPE: {
				LocalisedCharacterStringPropertyType localisedCharacterStringPropertyType = (LocalisedCharacterStringPropertyType)theEObject;
				T result = caseLocalisedCharacterStringPropertyType(localisedCharacterStringPropertyType);
				if (result == null) result = caseObjectReferencePropertyType(localisedCharacterStringPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.LOCALISED_CHARACTER_STRING_TYPE: {
				LocalisedCharacterStringType localisedCharacterStringType = (LocalisedCharacterStringType)theEObject;
				T result = caseLocalisedCharacterStringType(localisedCharacterStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_AGGREGATE_INFORMATION_PROPERTY_TYPE: {
				MDAggregateInformationPropertyType mdAggregateInformationPropertyType = (MDAggregateInformationPropertyType)theEObject;
				T result = caseMDAggregateInformationPropertyType(mdAggregateInformationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE: {
				MDAggregateInformationType mdAggregateInformationType = (MDAggregateInformationType)theEObject;
				T result = caseMDAggregateInformationType(mdAggregateInformationType);
				if (result == null) result = caseAbstractObjectType(mdAggregateInformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_PROPERTY_TYPE: {
				MDApplicationSchemaInformationPropertyType mdApplicationSchemaInformationPropertyType = (MDApplicationSchemaInformationPropertyType)theEObject;
				T result = caseMDApplicationSchemaInformationPropertyType(mdApplicationSchemaInformationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE: {
				MDApplicationSchemaInformationType mdApplicationSchemaInformationType = (MDApplicationSchemaInformationType)theEObject;
				T result = caseMDApplicationSchemaInformationType(mdApplicationSchemaInformationType);
				if (result == null) result = caseAbstractObjectType(mdApplicationSchemaInformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_BAND_PROPERTY_TYPE: {
				MDBandPropertyType mdBandPropertyType = (MDBandPropertyType)theEObject;
				T result = caseMDBandPropertyType(mdBandPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_BAND_TYPE: {
				MDBandType mdBandType = (MDBandType)theEObject;
				T result = caseMDBandType(mdBandType);
				if (result == null) result = caseMDRangeDimensionType(mdBandType);
				if (result == null) result = caseAbstractObjectType(mdBandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_BROWSE_GRAPHIC_PROPERTY_TYPE: {
				MDBrowseGraphicPropertyType mdBrowseGraphicPropertyType = (MDBrowseGraphicPropertyType)theEObject;
				T result = caseMDBrowseGraphicPropertyType(mdBrowseGraphicPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_BROWSE_GRAPHIC_TYPE: {
				MDBrowseGraphicType mdBrowseGraphicType = (MDBrowseGraphicType)theEObject;
				T result = caseMDBrowseGraphicType(mdBrowseGraphicType);
				if (result == null) result = caseAbstractObjectType(mdBrowseGraphicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_CELL_GEOMETRY_CODE_PROPERTY_TYPE: {
				MDCellGeometryCodePropertyType mdCellGeometryCodePropertyType = (MDCellGeometryCodePropertyType)theEObject;
				T result = caseMDCellGeometryCodePropertyType(mdCellGeometryCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_CHARACTER_SET_CODE_PROPERTY_TYPE: {
				MDCharacterSetCodePropertyType mdCharacterSetCodePropertyType = (MDCharacterSetCodePropertyType)theEObject;
				T result = caseMDCharacterSetCodePropertyType(mdCharacterSetCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_CLASSIFICATION_CODE_PROPERTY_TYPE: {
				MDClassificationCodePropertyType mdClassificationCodePropertyType = (MDClassificationCodePropertyType)theEObject;
				T result = caseMDClassificationCodePropertyType(mdClassificationCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_CONSTRAINTS_PROPERTY_TYPE: {
				MDConstraintsPropertyType mdConstraintsPropertyType = (MDConstraintsPropertyType)theEObject;
				T result = caseMDConstraintsPropertyType(mdConstraintsPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_CONSTRAINTS_TYPE: {
				MDConstraintsType mdConstraintsType = (MDConstraintsType)theEObject;
				T result = caseMDConstraintsType(mdConstraintsType);
				if (result == null) result = caseAbstractObjectType(mdConstraintsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE: {
				MDContentInformationPropertyType mdContentInformationPropertyType = (MDContentInformationPropertyType)theEObject;
				T result = caseMDContentInformationPropertyType(mdContentInformationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_COVERAGE_CONTENT_TYPE_CODE_PROPERTY_TYPE: {
				MDCoverageContentTypeCodePropertyType mdCoverageContentTypeCodePropertyType = (MDCoverageContentTypeCodePropertyType)theEObject;
				T result = caseMDCoverageContentTypeCodePropertyType(mdCoverageContentTypeCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE: {
				MDCoverageDescriptionPropertyType mdCoverageDescriptionPropertyType = (MDCoverageDescriptionPropertyType)theEObject;
				T result = caseMDCoverageDescriptionPropertyType(mdCoverageDescriptionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE: {
				MDCoverageDescriptionType mdCoverageDescriptionType = (MDCoverageDescriptionType)theEObject;
				T result = caseMDCoverageDescriptionType(mdCoverageDescriptionType);
				if (result == null) result = caseAbstractMDContentInformationType(mdCoverageDescriptionType);
				if (result == null) result = caseAbstractObjectType(mdCoverageDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_DATA_IDENTIFICATION_PROPERTY_TYPE: {
				MDDataIdentificationPropertyType mdDataIdentificationPropertyType = (MDDataIdentificationPropertyType)theEObject;
				T result = caseMDDataIdentificationPropertyType(mdDataIdentificationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE: {
				MDDataIdentificationType mdDataIdentificationType = (MDDataIdentificationType)theEObject;
				T result = caseMDDataIdentificationType(mdDataIdentificationType);
				if (result == null) result = caseAbstractMDIdentificationType(mdDataIdentificationType);
				if (result == null) result = caseAbstractObjectType(mdDataIdentificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_DATATYPE_CODE_PROPERTY_TYPE: {
				MDDatatypeCodePropertyType mdDatatypeCodePropertyType = (MDDatatypeCodePropertyType)theEObject;
				T result = caseMDDatatypeCodePropertyType(mdDatatypeCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_PROPERTY_TYPE: {
				MDDigitalTransferOptionsPropertyType mdDigitalTransferOptionsPropertyType = (MDDigitalTransferOptionsPropertyType)theEObject;
				T result = caseMDDigitalTransferOptionsPropertyType(mdDigitalTransferOptionsPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE: {
				MDDigitalTransferOptionsType mdDigitalTransferOptionsType = (MDDigitalTransferOptionsType)theEObject;
				T result = caseMDDigitalTransferOptionsType(mdDigitalTransferOptionsType);
				if (result == null) result = caseAbstractObjectType(mdDigitalTransferOptionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_DIMENSION_NAME_TYPE_CODE_PROPERTY_TYPE: {
				MDDimensionNameTypeCodePropertyType mdDimensionNameTypeCodePropertyType = (MDDimensionNameTypeCodePropertyType)theEObject;
				T result = caseMDDimensionNameTypeCodePropertyType(mdDimensionNameTypeCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_DIMENSION_PROPERTY_TYPE: {
				MDDimensionPropertyType mdDimensionPropertyType = (MDDimensionPropertyType)theEObject;
				T result = caseMDDimensionPropertyType(mdDimensionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_DIMENSION_TYPE: {
				MDDimensionType mdDimensionType = (MDDimensionType)theEObject;
				T result = caseMDDimensionType(mdDimensionType);
				if (result == null) result = caseAbstractObjectType(mdDimensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_DISTRIBUTION_PROPERTY_TYPE: {
				MDDistributionPropertyType mdDistributionPropertyType = (MDDistributionPropertyType)theEObject;
				T result = caseMDDistributionPropertyType(mdDistributionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_DISTRIBUTION_TYPE: {
				MDDistributionType mdDistributionType = (MDDistributionType)theEObject;
				T result = caseMDDistributionType(mdDistributionType);
				if (result == null) result = caseAbstractObjectType(mdDistributionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_DISTRIBUTION_UNITS_PROPERTY_TYPE: {
				MDDistributionUnitsPropertyType mdDistributionUnitsPropertyType = (MDDistributionUnitsPropertyType)theEObject;
				T result = caseMDDistributionUnitsPropertyType(mdDistributionUnitsPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_DISTRIBUTOR_PROPERTY_TYPE: {
				MDDistributorPropertyType mdDistributorPropertyType = (MDDistributorPropertyType)theEObject;
				T result = caseMDDistributorPropertyType(mdDistributorPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_DISTRIBUTOR_TYPE: {
				MDDistributorType mdDistributorType = (MDDistributorType)theEObject;
				T result = caseMDDistributorType(mdDistributorType);
				if (result == null) result = caseAbstractObjectType(mdDistributorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_PROPERTY_TYPE: {
				MDExtendedElementInformationPropertyType mdExtendedElementInformationPropertyType = (MDExtendedElementInformationPropertyType)theEObject;
				T result = caseMDExtendedElementInformationPropertyType(mdExtendedElementInformationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE: {
				MDExtendedElementInformationType mdExtendedElementInformationType = (MDExtendedElementInformationType)theEObject;
				T result = caseMDExtendedElementInformationType(mdExtendedElementInformationType);
				if (result == null) result = caseAbstractObjectType(mdExtendedElementInformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_PROPERTY_TYPE: {
				MDFeatureCatalogueDescriptionPropertyType mdFeatureCatalogueDescriptionPropertyType = (MDFeatureCatalogueDescriptionPropertyType)theEObject;
				T result = caseMDFeatureCatalogueDescriptionPropertyType(mdFeatureCatalogueDescriptionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE: {
				MDFeatureCatalogueDescriptionType mdFeatureCatalogueDescriptionType = (MDFeatureCatalogueDescriptionType)theEObject;
				T result = caseMDFeatureCatalogueDescriptionType(mdFeatureCatalogueDescriptionType);
				if (result == null) result = caseAbstractMDContentInformationType(mdFeatureCatalogueDescriptionType);
				if (result == null) result = caseAbstractObjectType(mdFeatureCatalogueDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_FORMAT_PROPERTY_TYPE: {
				MDFormatPropertyType mdFormatPropertyType = (MDFormatPropertyType)theEObject;
				T result = caseMDFormatPropertyType(mdFormatPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_FORMAT_TYPE: {
				MDFormatType mdFormatType = (MDFormatType)theEObject;
				T result = caseMDFormatType(mdFormatType);
				if (result == null) result = caseAbstractObjectType(mdFormatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_GEOMETRIC_OBJECTS_PROPERTY_TYPE: {
				MDGeometricObjectsPropertyType mdGeometricObjectsPropertyType = (MDGeometricObjectsPropertyType)theEObject;
				T result = caseMDGeometricObjectsPropertyType(mdGeometricObjectsPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE: {
				MDGeometricObjectsType mdGeometricObjectsType = (MDGeometricObjectsType)theEObject;
				T result = caseMDGeometricObjectsType(mdGeometricObjectsType);
				if (result == null) result = caseAbstractObjectType(mdGeometricObjectsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_GEOMETRIC_OBJECT_TYPE_CODE_PROPERTY_TYPE: {
				MDGeometricObjectTypeCodePropertyType mdGeometricObjectTypeCodePropertyType = (MDGeometricObjectTypeCodePropertyType)theEObject;
				T result = caseMDGeometricObjectTypeCodePropertyType(mdGeometricObjectTypeCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_GEORECTIFIED_PROPERTY_TYPE: {
				MDGeorectifiedPropertyType mdGeorectifiedPropertyType = (MDGeorectifiedPropertyType)theEObject;
				T result = caseMDGeorectifiedPropertyType(mdGeorectifiedPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_GEORECTIFIED_TYPE: {
				MDGeorectifiedType mdGeorectifiedType = (MDGeorectifiedType)theEObject;
				T result = caseMDGeorectifiedType(mdGeorectifiedType);
				if (result == null) result = caseMDGridSpatialRepresentationType(mdGeorectifiedType);
				if (result == null) result = caseAbstractMDSpatialRepresentationType(mdGeorectifiedType);
				if (result == null) result = caseAbstractObjectType(mdGeorectifiedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_GEOREFERENCEABLE_PROPERTY_TYPE: {
				MDGeoreferenceablePropertyType mdGeoreferenceablePropertyType = (MDGeoreferenceablePropertyType)theEObject;
				T result = caseMDGeoreferenceablePropertyType(mdGeoreferenceablePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE: {
				MDGeoreferenceableType mdGeoreferenceableType = (MDGeoreferenceableType)theEObject;
				T result = caseMDGeoreferenceableType(mdGeoreferenceableType);
				if (result == null) result = caseMDGridSpatialRepresentationType(mdGeoreferenceableType);
				if (result == null) result = caseAbstractMDSpatialRepresentationType(mdGeoreferenceableType);
				if (result == null) result = caseAbstractObjectType(mdGeoreferenceableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_PROPERTY_TYPE: {
				MDGridSpatialRepresentationPropertyType mdGridSpatialRepresentationPropertyType = (MDGridSpatialRepresentationPropertyType)theEObject;
				T result = caseMDGridSpatialRepresentationPropertyType(mdGridSpatialRepresentationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE: {
				MDGridSpatialRepresentationType mdGridSpatialRepresentationType = (MDGridSpatialRepresentationType)theEObject;
				T result = caseMDGridSpatialRepresentationType(mdGridSpatialRepresentationType);
				if (result == null) result = caseAbstractMDSpatialRepresentationType(mdGridSpatialRepresentationType);
				if (result == null) result = caseAbstractObjectType(mdGridSpatialRepresentationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_IDENTIFICATION_PROPERTY_TYPE: {
				MDIdentificationPropertyType mdIdentificationPropertyType = (MDIdentificationPropertyType)theEObject;
				T result = caseMDIdentificationPropertyType(mdIdentificationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_IDENTIFIER_PROPERTY_TYPE: {
				MDIdentifierPropertyType mdIdentifierPropertyType = (MDIdentifierPropertyType)theEObject;
				T result = caseMDIdentifierPropertyType(mdIdentifierPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_IDENTIFIER_TYPE: {
				MDIdentifierType mdIdentifierType = (MDIdentifierType)theEObject;
				T result = caseMDIdentifierType(mdIdentifierType);
				if (result == null) result = caseAbstractObjectType(mdIdentifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_IMAGE_DESCRIPTION_PROPERTY_TYPE: {
				MDImageDescriptionPropertyType mdImageDescriptionPropertyType = (MDImageDescriptionPropertyType)theEObject;
				T result = caseMDImageDescriptionPropertyType(mdImageDescriptionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE: {
				MDImageDescriptionType mdImageDescriptionType = (MDImageDescriptionType)theEObject;
				T result = caseMDImageDescriptionType(mdImageDescriptionType);
				if (result == null) result = caseMDCoverageDescriptionType(mdImageDescriptionType);
				if (result == null) result = caseAbstractMDContentInformationType(mdImageDescriptionType);
				if (result == null) result = caseAbstractObjectType(mdImageDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_IMAGING_CONDITION_CODE_PROPERTY_TYPE: {
				MDImagingConditionCodePropertyType mdImagingConditionCodePropertyType = (MDImagingConditionCodePropertyType)theEObject;
				T result = caseMDImagingConditionCodePropertyType(mdImagingConditionCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_KEYWORDS_PROPERTY_TYPE: {
				MDKeywordsPropertyType mdKeywordsPropertyType = (MDKeywordsPropertyType)theEObject;
				T result = caseMDKeywordsPropertyType(mdKeywordsPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_KEYWORDS_TYPE: {
				MDKeywordsType mdKeywordsType = (MDKeywordsType)theEObject;
				T result = caseMDKeywordsType(mdKeywordsType);
				if (result == null) result = caseAbstractObjectType(mdKeywordsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_KEYWORD_TYPE_CODE_PROPERTY_TYPE: {
				MDKeywordTypeCodePropertyType mdKeywordTypeCodePropertyType = (MDKeywordTypeCodePropertyType)theEObject;
				T result = caseMDKeywordTypeCodePropertyType(mdKeywordTypeCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_LEGAL_CONSTRAINTS_PROPERTY_TYPE: {
				MDLegalConstraintsPropertyType mdLegalConstraintsPropertyType = (MDLegalConstraintsPropertyType)theEObject;
				T result = caseMDLegalConstraintsPropertyType(mdLegalConstraintsPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE: {
				MDLegalConstraintsType mdLegalConstraintsType = (MDLegalConstraintsType)theEObject;
				T result = caseMDLegalConstraintsType(mdLegalConstraintsType);
				if (result == null) result = caseMDConstraintsType(mdLegalConstraintsType);
				if (result == null) result = caseAbstractObjectType(mdLegalConstraintsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_MAINTENANCE_FREQUENCY_CODE_PROPERTY_TYPE: {
				MDMaintenanceFrequencyCodePropertyType mdMaintenanceFrequencyCodePropertyType = (MDMaintenanceFrequencyCodePropertyType)theEObject;
				T result = caseMDMaintenanceFrequencyCodePropertyType(mdMaintenanceFrequencyCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_MAINTENANCE_INFORMATION_PROPERTY_TYPE: {
				MDMaintenanceInformationPropertyType mdMaintenanceInformationPropertyType = (MDMaintenanceInformationPropertyType)theEObject;
				T result = caseMDMaintenanceInformationPropertyType(mdMaintenanceInformationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE: {
				MDMaintenanceInformationType mdMaintenanceInformationType = (MDMaintenanceInformationType)theEObject;
				T result = caseMDMaintenanceInformationType(mdMaintenanceInformationType);
				if (result == null) result = caseAbstractObjectType(mdMaintenanceInformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_MEDIUM_FORMAT_CODE_PROPERTY_TYPE: {
				MDMediumFormatCodePropertyType mdMediumFormatCodePropertyType = (MDMediumFormatCodePropertyType)theEObject;
				T result = caseMDMediumFormatCodePropertyType(mdMediumFormatCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_MEDIUM_NAME_CODE_PROPERTY_TYPE: {
				MDMediumNameCodePropertyType mdMediumNameCodePropertyType = (MDMediumNameCodePropertyType)theEObject;
				T result = caseMDMediumNameCodePropertyType(mdMediumNameCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_MEDIUM_PROPERTY_TYPE: {
				MDMediumPropertyType mdMediumPropertyType = (MDMediumPropertyType)theEObject;
				T result = caseMDMediumPropertyType(mdMediumPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_MEDIUM_TYPE: {
				MDMediumType mdMediumType = (MDMediumType)theEObject;
				T result = caseMDMediumType(mdMediumType);
				if (result == null) result = caseAbstractObjectType(mdMediumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_METADATA_EXTENSION_INFORMATION_PROPERTY_TYPE: {
				MDMetadataExtensionInformationPropertyType mdMetadataExtensionInformationPropertyType = (MDMetadataExtensionInformationPropertyType)theEObject;
				T result = caseMDMetadataExtensionInformationPropertyType(mdMetadataExtensionInformationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_METADATA_EXTENSION_INFORMATION_TYPE: {
				MDMetadataExtensionInformationType mdMetadataExtensionInformationType = (MDMetadataExtensionInformationType)theEObject;
				T result = caseMDMetadataExtensionInformationType(mdMetadataExtensionInformationType);
				if (result == null) result = caseAbstractObjectType(mdMetadataExtensionInformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_METADATA_PROPERTY_TYPE: {
				MDMetadataPropertyType mdMetadataPropertyType = (MDMetadataPropertyType)theEObject;
				T result = caseMDMetadataPropertyType(mdMetadataPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_METADATA_TYPE: {
				MDMetadataType mdMetadataType = (MDMetadataType)theEObject;
				T result = caseMDMetadataType(mdMetadataType);
				if (result == null) result = caseAbstractObjectType(mdMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_OBLIGATION_CODE_PROPERTY_TYPE: {
				MDObligationCodePropertyType mdObligationCodePropertyType = (MDObligationCodePropertyType)theEObject;
				T result = caseMDObligationCodePropertyType(mdObligationCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_PIXEL_ORIENTATION_CODE_PROPERTY_TYPE: {
				MDPixelOrientationCodePropertyType mdPixelOrientationCodePropertyType = (MDPixelOrientationCodePropertyType)theEObject;
				T result = caseMDPixelOrientationCodePropertyType(mdPixelOrientationCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_PORTRAYAL_CATALOGUE_REFERENCE_PROPERTY_TYPE: {
				MDPortrayalCatalogueReferencePropertyType mdPortrayalCatalogueReferencePropertyType = (MDPortrayalCatalogueReferencePropertyType)theEObject;
				T result = caseMDPortrayalCatalogueReferencePropertyType(mdPortrayalCatalogueReferencePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_PORTRAYAL_CATALOGUE_REFERENCE_TYPE: {
				MDPortrayalCatalogueReferenceType mdPortrayalCatalogueReferenceType = (MDPortrayalCatalogueReferenceType)theEObject;
				T result = caseMDPortrayalCatalogueReferenceType(mdPortrayalCatalogueReferenceType);
				if (result == null) result = caseAbstractObjectType(mdPortrayalCatalogueReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_PROGRESS_CODE_PROPERTY_TYPE: {
				MDProgressCodePropertyType mdProgressCodePropertyType = (MDProgressCodePropertyType)theEObject;
				T result = caseMDProgressCodePropertyType(mdProgressCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_RANGE_DIMENSION_PROPERTY_TYPE: {
				MDRangeDimensionPropertyType mdRangeDimensionPropertyType = (MDRangeDimensionPropertyType)theEObject;
				T result = caseMDRangeDimensionPropertyType(mdRangeDimensionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_RANGE_DIMENSION_TYPE: {
				MDRangeDimensionType mdRangeDimensionType = (MDRangeDimensionType)theEObject;
				T result = caseMDRangeDimensionType(mdRangeDimensionType);
				if (result == null) result = caseAbstractObjectType(mdRangeDimensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_REFERENCE_SYSTEM_PROPERTY_TYPE: {
				MDReferenceSystemPropertyType mdReferenceSystemPropertyType = (MDReferenceSystemPropertyType)theEObject;
				T result = caseMDReferenceSystemPropertyType(mdReferenceSystemPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_REFERENCE_SYSTEM_TYPE: {
				MDReferenceSystemType mdReferenceSystemType = (MDReferenceSystemType)theEObject;
				T result = caseMDReferenceSystemType(mdReferenceSystemType);
				if (result == null) result = caseAbstractObjectType(mdReferenceSystemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_REPRESENTATIVE_FRACTION_PROPERTY_TYPE: {
				MDRepresentativeFractionPropertyType mdRepresentativeFractionPropertyType = (MDRepresentativeFractionPropertyType)theEObject;
				T result = caseMDRepresentativeFractionPropertyType(mdRepresentativeFractionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_REPRESENTATIVE_FRACTION_TYPE: {
				MDRepresentativeFractionType mdRepresentativeFractionType = (MDRepresentativeFractionType)theEObject;
				T result = caseMDRepresentativeFractionType(mdRepresentativeFractionType);
				if (result == null) result = caseAbstractObjectType(mdRepresentativeFractionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_RESOLUTION_PROPERTY_TYPE: {
				MDResolutionPropertyType mdResolutionPropertyType = (MDResolutionPropertyType)theEObject;
				T result = caseMDResolutionPropertyType(mdResolutionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_RESOLUTION_TYPE: {
				MDResolutionType mdResolutionType = (MDResolutionType)theEObject;
				T result = caseMDResolutionType(mdResolutionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_RESTRICTION_CODE_PROPERTY_TYPE: {
				MDRestrictionCodePropertyType mdRestrictionCodePropertyType = (MDRestrictionCodePropertyType)theEObject;
				T result = caseMDRestrictionCodePropertyType(mdRestrictionCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_SCOPE_CODE_PROPERTY_TYPE: {
				MDScopeCodePropertyType mdScopeCodePropertyType = (MDScopeCodePropertyType)theEObject;
				T result = caseMDScopeCodePropertyType(mdScopeCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_SCOPE_DESCRIPTION_PROPERTY_TYPE: {
				MDScopeDescriptionPropertyType mdScopeDescriptionPropertyType = (MDScopeDescriptionPropertyType)theEObject;
				T result = caseMDScopeDescriptionPropertyType(mdScopeDescriptionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE: {
				MDScopeDescriptionType mdScopeDescriptionType = (MDScopeDescriptionType)theEObject;
				T result = caseMDScopeDescriptionType(mdScopeDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_SECURITY_CONSTRAINTS_PROPERTY_TYPE: {
				MDSecurityConstraintsPropertyType mdSecurityConstraintsPropertyType = (MDSecurityConstraintsPropertyType)theEObject;
				T result = caseMDSecurityConstraintsPropertyType(mdSecurityConstraintsPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE: {
				MDSecurityConstraintsType mdSecurityConstraintsType = (MDSecurityConstraintsType)theEObject;
				T result = caseMDSecurityConstraintsType(mdSecurityConstraintsType);
				if (result == null) result = caseMDConstraintsType(mdSecurityConstraintsType);
				if (result == null) result = caseAbstractObjectType(mdSecurityConstraintsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_SERVICE_IDENTIFICATION_PROPERTY_TYPE: {
				MDServiceIdentificationPropertyType mdServiceIdentificationPropertyType = (MDServiceIdentificationPropertyType)theEObject;
				T result = caseMDServiceIdentificationPropertyType(mdServiceIdentificationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_SERVICE_IDENTIFICATION_TYPE: {
				MDServiceIdentificationType mdServiceIdentificationType = (MDServiceIdentificationType)theEObject;
				T result = caseMDServiceIdentificationType(mdServiceIdentificationType);
				if (result == null) result = caseAbstractMDIdentificationType(mdServiceIdentificationType);
				if (result == null) result = caseAbstractObjectType(mdServiceIdentificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_SPATIAL_REPRESENTATION_PROPERTY_TYPE: {
				MDSpatialRepresentationPropertyType mdSpatialRepresentationPropertyType = (MDSpatialRepresentationPropertyType)theEObject;
				T result = caseMDSpatialRepresentationPropertyType(mdSpatialRepresentationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_SPATIAL_REPRESENTATION_TYPE_CODE_PROPERTY_TYPE: {
				MDSpatialRepresentationTypeCodePropertyType mdSpatialRepresentationTypeCodePropertyType = (MDSpatialRepresentationTypeCodePropertyType)theEObject;
				T result = caseMDSpatialRepresentationTypeCodePropertyType(mdSpatialRepresentationTypeCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_PROPERTY_TYPE: {
				MDStandardOrderProcessPropertyType mdStandardOrderProcessPropertyType = (MDStandardOrderProcessPropertyType)theEObject;
				T result = caseMDStandardOrderProcessPropertyType(mdStandardOrderProcessPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE: {
				MDStandardOrderProcessType mdStandardOrderProcessType = (MDStandardOrderProcessType)theEObject;
				T result = caseMDStandardOrderProcessType(mdStandardOrderProcessType);
				if (result == null) result = caseAbstractObjectType(mdStandardOrderProcessType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_TOPIC_CATEGORY_CODE_PROPERTY_TYPE: {
				MDTopicCategoryCodePropertyType mdTopicCategoryCodePropertyType = (MDTopicCategoryCodePropertyType)theEObject;
				T result = caseMDTopicCategoryCodePropertyType(mdTopicCategoryCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_TOPOLOGY_LEVEL_CODE_PROPERTY_TYPE: {
				MDTopologyLevelCodePropertyType mdTopologyLevelCodePropertyType = (MDTopologyLevelCodePropertyType)theEObject;
				T result = caseMDTopologyLevelCodePropertyType(mdTopologyLevelCodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_USAGE_PROPERTY_TYPE: {
				MDUsagePropertyType mdUsagePropertyType = (MDUsagePropertyType)theEObject;
				T result = caseMDUsagePropertyType(mdUsagePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_USAGE_TYPE: {
				MDUsageType mdUsageType = (MDUsageType)theEObject;
				T result = caseMDUsageType(mdUsageType);
				if (result == null) result = caseAbstractObjectType(mdUsageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_VECTOR_SPATIAL_REPRESENTATION_PROPERTY_TYPE: {
				MDVectorSpatialRepresentationPropertyType mdVectorSpatialRepresentationPropertyType = (MDVectorSpatialRepresentationPropertyType)theEObject;
				T result = caseMDVectorSpatialRepresentationPropertyType(mdVectorSpatialRepresentationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.MD_VECTOR_SPATIAL_REPRESENTATION_TYPE: {
				MDVectorSpatialRepresentationType mdVectorSpatialRepresentationType = (MDVectorSpatialRepresentationType)theEObject;
				T result = caseMDVectorSpatialRepresentationType(mdVectorSpatialRepresentationType);
				if (result == null) result = caseAbstractMDSpatialRepresentationType(mdVectorSpatialRepresentationType);
				if (result == null) result = caseAbstractObjectType(mdVectorSpatialRepresentationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.PT_FREE_TEXT_PROPERTY_TYPE: {
				PTFreeTextPropertyType ptFreeTextPropertyType = (PTFreeTextPropertyType)theEObject;
				T result = casePTFreeTextPropertyType(ptFreeTextPropertyType);
				if (result == null) result = caseCharacterStringPropertyType(ptFreeTextPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.PT_FREE_TEXT_TYPE: {
				PTFreeTextType ptFreeTextType = (PTFreeTextType)theEObject;
				T result = casePTFreeTextType(ptFreeTextType);
				if (result == null) result = caseAbstractObjectType(ptFreeTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.PT_LOCALE_CONTAINER_PROPERTY_TYPE: {
				PTLocaleContainerPropertyType ptLocaleContainerPropertyType = (PTLocaleContainerPropertyType)theEObject;
				T result = casePTLocaleContainerPropertyType(ptLocaleContainerPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE: {
				PTLocaleContainerType ptLocaleContainerType = (PTLocaleContainerType)theEObject;
				T result = casePTLocaleContainerType(ptLocaleContainerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.PT_LOCALE_PROPERTY_TYPE: {
				PTLocalePropertyType ptLocalePropertyType = (PTLocalePropertyType)theEObject;
				T result = casePTLocalePropertyType(ptLocalePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.PT_LOCALE_TYPE: {
				PTLocaleType ptLocaleType = (PTLocaleType)theEObject;
				T result = casePTLocaleType(ptLocaleType);
				if (result == null) result = caseAbstractObjectType(ptLocaleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.RS_IDENTIFIER_PROPERTY_TYPE: {
				RSIdentifierPropertyType rsIdentifierPropertyType = (RSIdentifierPropertyType)theEObject;
				T result = caseRSIdentifierPropertyType(rsIdentifierPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.RS_IDENTIFIER_TYPE: {
				RSIdentifierType rsIdentifierType = (RSIdentifierType)theEObject;
				T result = caseRSIdentifierType(rsIdentifierType);
				if (result == null) result = caseMDIdentifierType(rsIdentifierType);
				if (result == null) result = caseAbstractObjectType(rsIdentifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.RS_REFERENCE_SYSTEM_PROPERTY_TYPE: {
				RSReferenceSystemPropertyType rsReferenceSystemPropertyType = (RSReferenceSystemPropertyType)theEObject;
				T result = caseRSReferenceSystemPropertyType(rsReferenceSystemPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMDPackage.URL_PROPERTY_TYPE: {
				URLPropertyType urlPropertyType = (URLPropertyType)theEObject;
				T result = caseURLPropertyType(urlPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract DQ Completeness Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract DQ Completeness Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDQCompletenessType(AbstractDQCompletenessType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract DQ Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract DQ Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDQElementType(AbstractDQElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract DQ Logical Consistency Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract DQ Logical Consistency Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDQLogicalConsistencyType(AbstractDQLogicalConsistencyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract DQ Positional Accuracy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract DQ Positional Accuracy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDQPositionalAccuracyType(AbstractDQPositionalAccuracyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract DQ Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract DQ Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDQResultType(AbstractDQResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract DQ Temporal Accuracy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract DQ Temporal Accuracy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDQTemporalAccuracyType(AbstractDQTemporalAccuracyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract DQ Thematic Accuracy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract DQ Thematic Accuracy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDQThematicAccuracyType(AbstractDQThematicAccuracyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract DS Aggregate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract DS Aggregate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDSAggregateType(AbstractDSAggregateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract EX Geographic Extent Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract EX Geographic Extent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEXGeographicExtentType(AbstractEXGeographicExtentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract MD Content Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract MD Content Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMDContentInformationType(AbstractMDContentInformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract MD Identification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract MD Identification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMDIdentificationType(AbstractMDIdentificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract MD Spatial Representation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract MD Spatial Representation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMDSpatialRepresentationType(AbstractMDSpatialRepresentationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract RS Reference System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract RS Reference System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRSReferenceSystemType(AbstractRSReferenceSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI Address Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI Address Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIAddressPropertyType(CIAddressPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIAddressType(CIAddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI Citation Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI Citation Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCICitationPropertyType(CICitationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI Citation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI Citation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCICitationType(CICitationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI Contact Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI Contact Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIContactPropertyType(CIContactPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI Contact Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI Contact Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIContactType(CIContactType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI Date Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI Date Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIDatePropertyType(CIDatePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIDateType(CIDateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI Date Type Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI Date Type Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIDateTypeCodePropertyType(CIDateTypeCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI On Line Function Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI On Line Function Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIOnLineFunctionCodePropertyType(CIOnLineFunctionCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI Online Resource Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI Online Resource Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIOnlineResourcePropertyType(CIOnlineResourcePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI Online Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI Online Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIOnlineResourceType(CIOnlineResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI Presentation Form Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI Presentation Form Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIPresentationFormCodePropertyType(CIPresentationFormCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI Responsible Party Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI Responsible Party Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIResponsiblePartyPropertyType(CIResponsiblePartyPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI Responsible Party Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI Responsible Party Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIResponsiblePartyType(CIResponsiblePartyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI Role Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI Role Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIRoleCodePropertyType(CIRoleCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI Series Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI Series Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCISeriesPropertyType(CISeriesPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI Series Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI Series Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCISeriesType(CISeriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI Telephone Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI Telephone Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCITelephonePropertyType(CITelephonePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CI Telephone Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CI Telephone Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCITelephoneType(CITelephoneType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Country Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Country Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountryPropertyType(CountryPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Absolute External Positional Accuracy Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Absolute External Positional Accuracy Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQAbsoluteExternalPositionalAccuracyPropertyType(DQAbsoluteExternalPositionalAccuracyPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Absolute External Positional Accuracy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Absolute External Positional Accuracy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQAbsoluteExternalPositionalAccuracyType(DQAbsoluteExternalPositionalAccuracyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Accuracy Of ATime Measurement Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Accuracy Of ATime Measurement Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQAccuracyOfATimeMeasurementPropertyType(DQAccuracyOfATimeMeasurementPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Accuracy Of ATime Measurement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Accuracy Of ATime Measurement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQAccuracyOfATimeMeasurementType(DQAccuracyOfATimeMeasurementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Completeness Commission Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Completeness Commission Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQCompletenessCommissionPropertyType(DQCompletenessCommissionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Completeness Commission Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Completeness Commission Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQCompletenessCommissionType(DQCompletenessCommissionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Completeness Omission Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Completeness Omission Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQCompletenessOmissionPropertyType(DQCompletenessOmissionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Completeness Omission Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Completeness Omission Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQCompletenessOmissionType(DQCompletenessOmissionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Completeness Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Completeness Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQCompletenessPropertyType(DQCompletenessPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Conceptual Consistency Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Conceptual Consistency Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQConceptualConsistencyPropertyType(DQConceptualConsistencyPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Conceptual Consistency Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Conceptual Consistency Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQConceptualConsistencyType(DQConceptualConsistencyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Conformance Result Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Conformance Result Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQConformanceResultPropertyType(DQConformanceResultPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Conformance Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Conformance Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQConformanceResultType(DQConformanceResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Data Quality Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Data Quality Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQDataQualityPropertyType(DQDataQualityPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Data Quality Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Data Quality Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQDataQualityType(DQDataQualityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Domain Consistency Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Domain Consistency Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQDomainConsistencyPropertyType(DQDomainConsistencyPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Domain Consistency Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Domain Consistency Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQDomainConsistencyType(DQDomainConsistencyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Element Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Element Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQElementPropertyType(DQElementPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Evaluation Method Type Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Evaluation Method Type Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQEvaluationMethodTypeCodePropertyType(DQEvaluationMethodTypeCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Format Consistency Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Format Consistency Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQFormatConsistencyPropertyType(DQFormatConsistencyPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Format Consistency Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Format Consistency Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQFormatConsistencyType(DQFormatConsistencyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Gridded Data Positional Accuracy Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Gridded Data Positional Accuracy Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQGriddedDataPositionalAccuracyPropertyType(DQGriddedDataPositionalAccuracyPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Gridded Data Positional Accuracy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Gridded Data Positional Accuracy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQGriddedDataPositionalAccuracyType(DQGriddedDataPositionalAccuracyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Logical Consistency Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Logical Consistency Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQLogicalConsistencyPropertyType(DQLogicalConsistencyPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Non Quantitative Attribute Accuracy Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Non Quantitative Attribute Accuracy Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQNonQuantitativeAttributeAccuracyPropertyType(DQNonQuantitativeAttributeAccuracyPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Non Quantitative Attribute Accuracy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Non Quantitative Attribute Accuracy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQNonQuantitativeAttributeAccuracyType(DQNonQuantitativeAttributeAccuracyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Positional Accuracy Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Positional Accuracy Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQPositionalAccuracyPropertyType(DQPositionalAccuracyPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Quantitative Attribute Accuracy Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Quantitative Attribute Accuracy Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQQuantitativeAttributeAccuracyPropertyType(DQQuantitativeAttributeAccuracyPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Quantitative Attribute Accuracy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Quantitative Attribute Accuracy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQQuantitativeAttributeAccuracyType(DQQuantitativeAttributeAccuracyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Quantitative Result Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Quantitative Result Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQQuantitativeResultPropertyType(DQQuantitativeResultPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Quantitative Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Quantitative Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQQuantitativeResultType(DQQuantitativeResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Relative Internal Positional Accuracy Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Relative Internal Positional Accuracy Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQRelativeInternalPositionalAccuracyPropertyType(DQRelativeInternalPositionalAccuracyPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Relative Internal Positional Accuracy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Relative Internal Positional Accuracy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQRelativeInternalPositionalAccuracyType(DQRelativeInternalPositionalAccuracyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Result Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Result Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQResultPropertyType(DQResultPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Scope Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Scope Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQScopePropertyType(DQScopePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Scope Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Scope Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQScopeType(DQScopeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Temporal Accuracy Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Temporal Accuracy Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQTemporalAccuracyPropertyType(DQTemporalAccuracyPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Temporal Consistency Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Temporal Consistency Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQTemporalConsistencyPropertyType(DQTemporalConsistencyPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Temporal Consistency Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Temporal Consistency Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQTemporalConsistencyType(DQTemporalConsistencyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Temporal Validity Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Temporal Validity Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQTemporalValidityPropertyType(DQTemporalValidityPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Thematic Accuracy Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Thematic Accuracy Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQThematicAccuracyPropertyType(DQThematicAccuracyPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Thematic Classification Correctness Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Thematic Classification Correctness Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQThematicClassificationCorrectnessPropertyType(DQThematicClassificationCorrectnessPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Topological Consistency Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Topological Consistency Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQTopologicalConsistencyPropertyType(DQTopologicalConsistencyPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Aggregate Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Aggregate Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSAggregatePropertyType(DSAggregatePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Association Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Association Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSAssociationPropertyType(DSAssociationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Association Type Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Association Type Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSAssociationTypeCodePropertyType(DSAssociationTypeCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Data Set Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Data Set Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSDataSetPropertyType(DSDataSetPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Data Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Data Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSDataSetType(DSDataSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Initiative Type Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Initiative Type Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSInitiativeTypeCodePropertyType(DSInitiativeTypeCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EX Extent Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EX Extent Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXExtentPropertyType(EXExtentPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EX Extent Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EX Extent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXExtentType(EXExtentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EX Geographic Extent Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EX Geographic Extent Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXGeographicExtentPropertyType(EXGeographicExtentPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EX Temporal Extent Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EX Temporal Extent Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXTemporalExtentPropertyType(EXTemporalExtentPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EX Temporal Extent Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EX Temporal Extent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXTemporalExtentType(EXTemporalExtentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EX Vertical Extent Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EX Vertical Extent Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXVerticalExtentPropertyType(EXVerticalExtentPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EX Vertical Extent Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EX Vertical Extent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXVerticalExtentType(EXVerticalExtentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Temporal Validity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Temporal Validity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQTemporalValidityType(DQTemporalValidityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Thematic Classification Correctness Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Thematic Classification Correctness Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQThematicClassificationCorrectnessType(DQThematicClassificationCorrectnessType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DQ Topological Consistency Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DQ Topological Consistency Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDQTopologicalConsistencyType(DQTopologicalConsistencyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSAssociationType(DSAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Initiative Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Initiative Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSInitiativePropertyType(DSInitiativePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Initiative Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Initiative Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSInitiativeType(DSInitiativeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Other Aggregate Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Other Aggregate Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSOtherAggregatePropertyType(DSOtherAggregatePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Other Aggregate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Other Aggregate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSOtherAggregateType(DSOtherAggregateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Platform Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Platform Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSPlatformPropertyType(DSPlatformPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Platform Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Platform Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSPlatformType(DSPlatformType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Production Series Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Production Series Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSProductionSeriesPropertyType(DSProductionSeriesPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Production Series Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Production Series Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSProductionSeriesType(DSProductionSeriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Sensor Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Sensor Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSSensorPropertyType(DSSensorPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Sensor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Sensor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSSensorType(DSSensorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Series Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Series Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSSeriesPropertyType(DSSeriesPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Series Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Series Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSSeriesType(DSSeriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Stereo Mate Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Stereo Mate Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSStereoMatePropertyType(DSStereoMatePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS Stereo Mate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS Stereo Mate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSStereoMateType(DSStereoMateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EX Bounding Polygon Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EX Bounding Polygon Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXBoundingPolygonPropertyType(EXBoundingPolygonPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EX Bounding Polygon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EX Bounding Polygon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXBoundingPolygonType(EXBoundingPolygonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EX Geographic Bounding Box Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EX Geographic Bounding Box Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXGeographicBoundingBoxPropertyType(EXGeographicBoundingBoxPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EX Geographic Bounding Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EX Geographic Bounding Box Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXGeographicBoundingBoxType(EXGeographicBoundingBoxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EX Geographic Description Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EX Geographic Description Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXGeographicDescriptionPropertyType(EXGeographicDescriptionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EX Geographic Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EX Geographic Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXGeographicDescriptionType(EXGeographicDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EX Spatial Temporal Extent Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EX Spatial Temporal Extent Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXSpatialTemporalExtentPropertyType(EXSpatialTemporalExtentPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EX Spatial Temporal Extent Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EX Spatial Temporal Extent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEXSpatialTemporalExtentType(EXSpatialTemporalExtentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageCodePropertyType(LanguageCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LI Lineage Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LI Lineage Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLILineagePropertyType(LILineagePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LI Lineage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LI Lineage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLILineageType(LILineageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LI Process Step Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LI Process Step Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLIProcessStepPropertyType(LIProcessStepPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LI Process Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LI Process Step Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLIProcessStepType(LIProcessStepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LI Source Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LI Source Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLISourcePropertyType(LISourcePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LI Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LI Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLISourceType(LISourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Localised Character String Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Localised Character String Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalisedCharacterStringPropertyType(LocalisedCharacterStringPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Localised Character String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Localised Character String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalisedCharacterStringType(LocalisedCharacterStringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Aggregate Information Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Aggregate Information Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAggregateInformationPropertyType(MDAggregateInformationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Aggregate Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Aggregate Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDAggregateInformationType(MDAggregateInformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Application Schema Information Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Application Schema Information Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDApplicationSchemaInformationPropertyType(MDApplicationSchemaInformationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Application Schema Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Application Schema Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDApplicationSchemaInformationType(MDApplicationSchemaInformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Band Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Band Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDBandPropertyType(MDBandPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Band Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Band Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDBandType(MDBandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Browse Graphic Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Browse Graphic Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDBrowseGraphicPropertyType(MDBrowseGraphicPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Browse Graphic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Browse Graphic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDBrowseGraphicType(MDBrowseGraphicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Cell Geometry Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Cell Geometry Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDCellGeometryCodePropertyType(MDCellGeometryCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Character Set Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Character Set Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDCharacterSetCodePropertyType(MDCharacterSetCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Classification Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Classification Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDClassificationCodePropertyType(MDClassificationCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Constraints Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Constraints Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDConstraintsPropertyType(MDConstraintsPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Constraints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDConstraintsType(MDConstraintsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Content Information Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Content Information Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDContentInformationPropertyType(MDContentInformationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Coverage Content Type Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Coverage Content Type Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDCoverageContentTypeCodePropertyType(MDCoverageContentTypeCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Coverage Description Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Coverage Description Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDCoverageDescriptionPropertyType(MDCoverageDescriptionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Coverage Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Coverage Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDCoverageDescriptionType(MDCoverageDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Data Identification Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Data Identification Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDDataIdentificationPropertyType(MDDataIdentificationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Data Identification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Data Identification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDDataIdentificationType(MDDataIdentificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Datatype Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Datatype Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDDatatypeCodePropertyType(MDDatatypeCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Digital Transfer Options Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Digital Transfer Options Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDDigitalTransferOptionsPropertyType(MDDigitalTransferOptionsPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Digital Transfer Options Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Digital Transfer Options Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDDigitalTransferOptionsType(MDDigitalTransferOptionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Dimension Name Type Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Dimension Name Type Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDDimensionNameTypeCodePropertyType(MDDimensionNameTypeCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Dimension Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Dimension Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDDimensionPropertyType(MDDimensionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Dimension Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Dimension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDDimensionType(MDDimensionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Distribution Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Distribution Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDDistributionPropertyType(MDDistributionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Distribution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Distribution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDDistributionType(MDDistributionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Distribution Units Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Distribution Units Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDDistributionUnitsPropertyType(MDDistributionUnitsPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Distributor Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Distributor Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDDistributorPropertyType(MDDistributorPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Distributor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Distributor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDDistributorType(MDDistributorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Extended Element Information Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Extended Element Information Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDExtendedElementInformationPropertyType(MDExtendedElementInformationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Extended Element Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Extended Element Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDExtendedElementInformationType(MDExtendedElementInformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Feature Catalogue Description Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Feature Catalogue Description Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDFeatureCatalogueDescriptionPropertyType(MDFeatureCatalogueDescriptionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Feature Catalogue Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Feature Catalogue Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDFeatureCatalogueDescriptionType(MDFeatureCatalogueDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Format Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Format Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDFormatPropertyType(MDFormatPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Format Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Format Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDFormatType(MDFormatType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Geometric Objects Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Geometric Objects Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDGeometricObjectsPropertyType(MDGeometricObjectsPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Geometric Objects Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Geometric Objects Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDGeometricObjectsType(MDGeometricObjectsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Geometric Object Type Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Geometric Object Type Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDGeometricObjectTypeCodePropertyType(MDGeometricObjectTypeCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Georectified Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Georectified Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDGeorectifiedPropertyType(MDGeorectifiedPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Georectified Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Georectified Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDGeorectifiedType(MDGeorectifiedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Georeferenceable Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Georeferenceable Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDGeoreferenceablePropertyType(MDGeoreferenceablePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Georeferenceable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Georeferenceable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDGeoreferenceableType(MDGeoreferenceableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Grid Spatial Representation Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Grid Spatial Representation Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDGridSpatialRepresentationPropertyType(MDGridSpatialRepresentationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Grid Spatial Representation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Grid Spatial Representation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDGridSpatialRepresentationType(MDGridSpatialRepresentationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Identification Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Identification Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDIdentificationPropertyType(MDIdentificationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Identifier Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Identifier Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDIdentifierPropertyType(MDIdentifierPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDIdentifierType(MDIdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Image Description Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Image Description Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDImageDescriptionPropertyType(MDImageDescriptionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Image Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Image Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDImageDescriptionType(MDImageDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Imaging Condition Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Imaging Condition Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDImagingConditionCodePropertyType(MDImagingConditionCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Keywords Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Keywords Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDKeywordsPropertyType(MDKeywordsPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Keywords Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Keywords Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDKeywordsType(MDKeywordsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Keyword Type Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Keyword Type Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDKeywordTypeCodePropertyType(MDKeywordTypeCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Legal Constraints Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Legal Constraints Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDLegalConstraintsPropertyType(MDLegalConstraintsPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Legal Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Legal Constraints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDLegalConstraintsType(MDLegalConstraintsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Maintenance Frequency Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Maintenance Frequency Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDMaintenanceFrequencyCodePropertyType(MDMaintenanceFrequencyCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Maintenance Information Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Maintenance Information Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDMaintenanceInformationPropertyType(MDMaintenanceInformationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Maintenance Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Maintenance Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDMaintenanceInformationType(MDMaintenanceInformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Medium Format Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Medium Format Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDMediumFormatCodePropertyType(MDMediumFormatCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Medium Name Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Medium Name Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDMediumNameCodePropertyType(MDMediumNameCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Medium Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Medium Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDMediumPropertyType(MDMediumPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Medium Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Medium Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDMediumType(MDMediumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Metadata Extension Information Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Metadata Extension Information Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDMetadataExtensionInformationPropertyType(MDMetadataExtensionInformationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Metadata Extension Information Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Metadata Extension Information Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDMetadataExtensionInformationType(MDMetadataExtensionInformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Metadata Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Metadata Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDMetadataPropertyType(MDMetadataPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDMetadataType(MDMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Obligation Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Obligation Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDObligationCodePropertyType(MDObligationCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Pixel Orientation Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Pixel Orientation Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDPixelOrientationCodePropertyType(MDPixelOrientationCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Portrayal Catalogue Reference Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Portrayal Catalogue Reference Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDPortrayalCatalogueReferencePropertyType(MDPortrayalCatalogueReferencePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Portrayal Catalogue Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Portrayal Catalogue Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDPortrayalCatalogueReferenceType(MDPortrayalCatalogueReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Progress Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Progress Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDProgressCodePropertyType(MDProgressCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Range Dimension Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Range Dimension Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDRangeDimensionPropertyType(MDRangeDimensionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Range Dimension Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Range Dimension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDRangeDimensionType(MDRangeDimensionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Reference System Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Reference System Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDReferenceSystemPropertyType(MDReferenceSystemPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Reference System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Reference System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDReferenceSystemType(MDReferenceSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Representative Fraction Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Representative Fraction Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDRepresentativeFractionPropertyType(MDRepresentativeFractionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Representative Fraction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Representative Fraction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDRepresentativeFractionType(MDRepresentativeFractionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Resolution Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Resolution Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDResolutionPropertyType(MDResolutionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Resolution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Resolution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDResolutionType(MDResolutionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Restriction Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Restriction Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDRestrictionCodePropertyType(MDRestrictionCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Scope Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Scope Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDScopeCodePropertyType(MDScopeCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Scope Description Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Scope Description Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDScopeDescriptionPropertyType(MDScopeDescriptionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Scope Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Scope Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDScopeDescriptionType(MDScopeDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Security Constraints Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Security Constraints Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDSecurityConstraintsPropertyType(MDSecurityConstraintsPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Security Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Security Constraints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDSecurityConstraintsType(MDSecurityConstraintsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Service Identification Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Service Identification Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDServiceIdentificationPropertyType(MDServiceIdentificationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Service Identification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Service Identification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDServiceIdentificationType(MDServiceIdentificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Spatial Representation Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Spatial Representation Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDSpatialRepresentationPropertyType(MDSpatialRepresentationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Spatial Representation Type Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Spatial Representation Type Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDSpatialRepresentationTypeCodePropertyType(MDSpatialRepresentationTypeCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Standard Order Process Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Standard Order Process Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDStandardOrderProcessPropertyType(MDStandardOrderProcessPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Standard Order Process Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Standard Order Process Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDStandardOrderProcessType(MDStandardOrderProcessType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Topic Category Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Topic Category Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDTopicCategoryCodePropertyType(MDTopicCategoryCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Topology Level Code Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Topology Level Code Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDTopologyLevelCodePropertyType(MDTopologyLevelCodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Usage Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Usage Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDUsagePropertyType(MDUsagePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Usage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Usage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDUsageType(MDUsageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Vector Spatial Representation Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Vector Spatial Representation Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDVectorSpatialRepresentationPropertyType(MDVectorSpatialRepresentationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD Vector Spatial Representation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD Vector Spatial Representation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMDVectorSpatialRepresentationType(MDVectorSpatialRepresentationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PT Free Text Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PT Free Text Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTFreeTextPropertyType(PTFreeTextPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PT Free Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PT Free Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTFreeTextType(PTFreeTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PT Locale Container Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PT Locale Container Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTLocaleContainerPropertyType(PTLocaleContainerPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PT Locale Container Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PT Locale Container Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTLocaleContainerType(PTLocaleContainerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PT Locale Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PT Locale Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTLocalePropertyType(PTLocalePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PT Locale Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PT Locale Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTLocaleType(PTLocaleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RS Identifier Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RS Identifier Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRSIdentifierPropertyType(RSIdentifierPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RS Identifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RS Identifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRSIdentifierType(RSIdentifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RS Reference System Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RS Reference System Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRSReferenceSystemPropertyType(RSReferenceSystemPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URL Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURLPropertyType(URLPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractObjectType(AbstractObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Reference Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Reference Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectReferencePropertyType(ObjectReferencePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character String Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character String Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterStringPropertyType(CharacterStringPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GMDSwitch
