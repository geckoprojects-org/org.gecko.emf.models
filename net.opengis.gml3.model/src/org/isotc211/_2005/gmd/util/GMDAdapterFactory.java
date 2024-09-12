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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.ObjectReferencePropertyType;

import org.isotc211._2005.gmd.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.isotc211._2005.gmd.GMDPackage
 * @generated
 */
public class GMDAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GMDPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMDAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GMDPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GMDSwitch<Adapter> modelSwitch =
		new GMDSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractDQCompletenessType(AbstractDQCompletenessType object) {
				return createAbstractDQCompletenessTypeAdapter();
			}
			@Override
			public Adapter caseAbstractDQElementType(AbstractDQElementType object) {
				return createAbstractDQElementTypeAdapter();
			}
			@Override
			public Adapter caseAbstractDQLogicalConsistencyType(AbstractDQLogicalConsistencyType object) {
				return createAbstractDQLogicalConsistencyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractDQPositionalAccuracyType(AbstractDQPositionalAccuracyType object) {
				return createAbstractDQPositionalAccuracyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractDQResultType(AbstractDQResultType object) {
				return createAbstractDQResultTypeAdapter();
			}
			@Override
			public Adapter caseAbstractDQTemporalAccuracyType(AbstractDQTemporalAccuracyType object) {
				return createAbstractDQTemporalAccuracyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractDQThematicAccuracyType(AbstractDQThematicAccuracyType object) {
				return createAbstractDQThematicAccuracyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractDSAggregateType(AbstractDSAggregateType object) {
				return createAbstractDSAggregateTypeAdapter();
			}
			@Override
			public Adapter caseAbstractEXGeographicExtentType(AbstractEXGeographicExtentType object) {
				return createAbstractEXGeographicExtentTypeAdapter();
			}
			@Override
			public Adapter caseAbstractMDContentInformationType(AbstractMDContentInformationType object) {
				return createAbstractMDContentInformationTypeAdapter();
			}
			@Override
			public Adapter caseAbstractMDIdentificationType(AbstractMDIdentificationType object) {
				return createAbstractMDIdentificationTypeAdapter();
			}
			@Override
			public Adapter caseAbstractMDSpatialRepresentationType(AbstractMDSpatialRepresentationType object) {
				return createAbstractMDSpatialRepresentationTypeAdapter();
			}
			@Override
			public Adapter caseAbstractRSReferenceSystemType(AbstractRSReferenceSystemType object) {
				return createAbstractRSReferenceSystemTypeAdapter();
			}
			@Override
			public Adapter caseCIAddressPropertyType(CIAddressPropertyType object) {
				return createCIAddressPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCIAddressType(CIAddressType object) {
				return createCIAddressTypeAdapter();
			}
			@Override
			public Adapter caseCICitationPropertyType(CICitationPropertyType object) {
				return createCICitationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCICitationType(CICitationType object) {
				return createCICitationTypeAdapter();
			}
			@Override
			public Adapter caseCIContactPropertyType(CIContactPropertyType object) {
				return createCIContactPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCIContactType(CIContactType object) {
				return createCIContactTypeAdapter();
			}
			@Override
			public Adapter caseCIDatePropertyType(CIDatePropertyType object) {
				return createCIDatePropertyTypeAdapter();
			}
			@Override
			public Adapter caseCIDateType(CIDateType object) {
				return createCIDateTypeAdapter();
			}
			@Override
			public Adapter caseCIDateTypeCodePropertyType(CIDateTypeCodePropertyType object) {
				return createCIDateTypeCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseCIOnLineFunctionCodePropertyType(CIOnLineFunctionCodePropertyType object) {
				return createCIOnLineFunctionCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseCIOnlineResourcePropertyType(CIOnlineResourcePropertyType object) {
				return createCIOnlineResourcePropertyTypeAdapter();
			}
			@Override
			public Adapter caseCIOnlineResourceType(CIOnlineResourceType object) {
				return createCIOnlineResourceTypeAdapter();
			}
			@Override
			public Adapter caseCIPresentationFormCodePropertyType(CIPresentationFormCodePropertyType object) {
				return createCIPresentationFormCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseCIResponsiblePartyPropertyType(CIResponsiblePartyPropertyType object) {
				return createCIResponsiblePartyPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCIResponsiblePartyType(CIResponsiblePartyType object) {
				return createCIResponsiblePartyTypeAdapter();
			}
			@Override
			public Adapter caseCIRoleCodePropertyType(CIRoleCodePropertyType object) {
				return createCIRoleCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseCISeriesPropertyType(CISeriesPropertyType object) {
				return createCISeriesPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCISeriesType(CISeriesType object) {
				return createCISeriesTypeAdapter();
			}
			@Override
			public Adapter caseCITelephonePropertyType(CITelephonePropertyType object) {
				return createCITelephonePropertyTypeAdapter();
			}
			@Override
			public Adapter caseCITelephoneType(CITelephoneType object) {
				return createCITelephoneTypeAdapter();
			}
			@Override
			public Adapter caseCountryPropertyType(CountryPropertyType object) {
				return createCountryPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQAbsoluteExternalPositionalAccuracyPropertyType(DQAbsoluteExternalPositionalAccuracyPropertyType object) {
				return createDQAbsoluteExternalPositionalAccuracyPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQAbsoluteExternalPositionalAccuracyType(DQAbsoluteExternalPositionalAccuracyType object) {
				return createDQAbsoluteExternalPositionalAccuracyTypeAdapter();
			}
			@Override
			public Adapter caseDQAccuracyOfATimeMeasurementPropertyType(DQAccuracyOfATimeMeasurementPropertyType object) {
				return createDQAccuracyOfATimeMeasurementPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQAccuracyOfATimeMeasurementType(DQAccuracyOfATimeMeasurementType object) {
				return createDQAccuracyOfATimeMeasurementTypeAdapter();
			}
			@Override
			public Adapter caseDQCompletenessCommissionPropertyType(DQCompletenessCommissionPropertyType object) {
				return createDQCompletenessCommissionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQCompletenessCommissionType(DQCompletenessCommissionType object) {
				return createDQCompletenessCommissionTypeAdapter();
			}
			@Override
			public Adapter caseDQCompletenessOmissionPropertyType(DQCompletenessOmissionPropertyType object) {
				return createDQCompletenessOmissionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQCompletenessOmissionType(DQCompletenessOmissionType object) {
				return createDQCompletenessOmissionTypeAdapter();
			}
			@Override
			public Adapter caseDQCompletenessPropertyType(DQCompletenessPropertyType object) {
				return createDQCompletenessPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQConceptualConsistencyPropertyType(DQConceptualConsistencyPropertyType object) {
				return createDQConceptualConsistencyPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQConceptualConsistencyType(DQConceptualConsistencyType object) {
				return createDQConceptualConsistencyTypeAdapter();
			}
			@Override
			public Adapter caseDQConformanceResultPropertyType(DQConformanceResultPropertyType object) {
				return createDQConformanceResultPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQConformanceResultType(DQConformanceResultType object) {
				return createDQConformanceResultTypeAdapter();
			}
			@Override
			public Adapter caseDQDataQualityPropertyType(DQDataQualityPropertyType object) {
				return createDQDataQualityPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQDataQualityType(DQDataQualityType object) {
				return createDQDataQualityTypeAdapter();
			}
			@Override
			public Adapter caseDQDomainConsistencyPropertyType(DQDomainConsistencyPropertyType object) {
				return createDQDomainConsistencyPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQDomainConsistencyType(DQDomainConsistencyType object) {
				return createDQDomainConsistencyTypeAdapter();
			}
			@Override
			public Adapter caseDQElementPropertyType(DQElementPropertyType object) {
				return createDQElementPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQEvaluationMethodTypeCodePropertyType(DQEvaluationMethodTypeCodePropertyType object) {
				return createDQEvaluationMethodTypeCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQFormatConsistencyPropertyType(DQFormatConsistencyPropertyType object) {
				return createDQFormatConsistencyPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQFormatConsistencyType(DQFormatConsistencyType object) {
				return createDQFormatConsistencyTypeAdapter();
			}
			@Override
			public Adapter caseDQGriddedDataPositionalAccuracyPropertyType(DQGriddedDataPositionalAccuracyPropertyType object) {
				return createDQGriddedDataPositionalAccuracyPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQGriddedDataPositionalAccuracyType(DQGriddedDataPositionalAccuracyType object) {
				return createDQGriddedDataPositionalAccuracyTypeAdapter();
			}
			@Override
			public Adapter caseDQLogicalConsistencyPropertyType(DQLogicalConsistencyPropertyType object) {
				return createDQLogicalConsistencyPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQNonQuantitativeAttributeAccuracyPropertyType(DQNonQuantitativeAttributeAccuracyPropertyType object) {
				return createDQNonQuantitativeAttributeAccuracyPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQNonQuantitativeAttributeAccuracyType(DQNonQuantitativeAttributeAccuracyType object) {
				return createDQNonQuantitativeAttributeAccuracyTypeAdapter();
			}
			@Override
			public Adapter caseDQPositionalAccuracyPropertyType(DQPositionalAccuracyPropertyType object) {
				return createDQPositionalAccuracyPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQQuantitativeAttributeAccuracyPropertyType(DQQuantitativeAttributeAccuracyPropertyType object) {
				return createDQQuantitativeAttributeAccuracyPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQQuantitativeAttributeAccuracyType(DQQuantitativeAttributeAccuracyType object) {
				return createDQQuantitativeAttributeAccuracyTypeAdapter();
			}
			@Override
			public Adapter caseDQQuantitativeResultPropertyType(DQQuantitativeResultPropertyType object) {
				return createDQQuantitativeResultPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQQuantitativeResultType(DQQuantitativeResultType object) {
				return createDQQuantitativeResultTypeAdapter();
			}
			@Override
			public Adapter caseDQRelativeInternalPositionalAccuracyPropertyType(DQRelativeInternalPositionalAccuracyPropertyType object) {
				return createDQRelativeInternalPositionalAccuracyPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQRelativeInternalPositionalAccuracyType(DQRelativeInternalPositionalAccuracyType object) {
				return createDQRelativeInternalPositionalAccuracyTypeAdapter();
			}
			@Override
			public Adapter caseDQResultPropertyType(DQResultPropertyType object) {
				return createDQResultPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQScopePropertyType(DQScopePropertyType object) {
				return createDQScopePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQScopeType(DQScopeType object) {
				return createDQScopeTypeAdapter();
			}
			@Override
			public Adapter caseDQTemporalAccuracyPropertyType(DQTemporalAccuracyPropertyType object) {
				return createDQTemporalAccuracyPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQTemporalConsistencyPropertyType(DQTemporalConsistencyPropertyType object) {
				return createDQTemporalConsistencyPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQTemporalConsistencyType(DQTemporalConsistencyType object) {
				return createDQTemporalConsistencyTypeAdapter();
			}
			@Override
			public Adapter caseDQTemporalValidityPropertyType(DQTemporalValidityPropertyType object) {
				return createDQTemporalValidityPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQThematicAccuracyPropertyType(DQThematicAccuracyPropertyType object) {
				return createDQThematicAccuracyPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQThematicClassificationCorrectnessPropertyType(DQThematicClassificationCorrectnessPropertyType object) {
				return createDQThematicClassificationCorrectnessPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDQTopologicalConsistencyPropertyType(DQTopologicalConsistencyPropertyType object) {
				return createDQTopologicalConsistencyPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDSAggregatePropertyType(DSAggregatePropertyType object) {
				return createDSAggregatePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDSAssociationPropertyType(DSAssociationPropertyType object) {
				return createDSAssociationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDSAssociationTypeCodePropertyType(DSAssociationTypeCodePropertyType object) {
				return createDSAssociationTypeCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDSDataSetPropertyType(DSDataSetPropertyType object) {
				return createDSDataSetPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDSDataSetType(DSDataSetType object) {
				return createDSDataSetTypeAdapter();
			}
			@Override
			public Adapter caseDSInitiativeTypeCodePropertyType(DSInitiativeTypeCodePropertyType object) {
				return createDSInitiativeTypeCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseEXExtentPropertyType(EXExtentPropertyType object) {
				return createEXExtentPropertyTypeAdapter();
			}
			@Override
			public Adapter caseEXExtentType(EXExtentType object) {
				return createEXExtentTypeAdapter();
			}
			@Override
			public Adapter caseEXGeographicExtentPropertyType(EXGeographicExtentPropertyType object) {
				return createEXGeographicExtentPropertyTypeAdapter();
			}
			@Override
			public Adapter caseEXTemporalExtentPropertyType(EXTemporalExtentPropertyType object) {
				return createEXTemporalExtentPropertyTypeAdapter();
			}
			@Override
			public Adapter caseEXTemporalExtentType(EXTemporalExtentType object) {
				return createEXTemporalExtentTypeAdapter();
			}
			@Override
			public Adapter caseEXVerticalExtentPropertyType(EXVerticalExtentPropertyType object) {
				return createEXVerticalExtentPropertyTypeAdapter();
			}
			@Override
			public Adapter caseEXVerticalExtentType(EXVerticalExtentType object) {
				return createEXVerticalExtentTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDQTemporalValidityType(DQTemporalValidityType object) {
				return createDQTemporalValidityTypeAdapter();
			}
			@Override
			public Adapter caseDQThematicClassificationCorrectnessType(DQThematicClassificationCorrectnessType object) {
				return createDQThematicClassificationCorrectnessTypeAdapter();
			}
			@Override
			public Adapter caseDQTopologicalConsistencyType(DQTopologicalConsistencyType object) {
				return createDQTopologicalConsistencyTypeAdapter();
			}
			@Override
			public Adapter caseDSAssociationType(DSAssociationType object) {
				return createDSAssociationTypeAdapter();
			}
			@Override
			public Adapter caseDSInitiativePropertyType(DSInitiativePropertyType object) {
				return createDSInitiativePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDSInitiativeType(DSInitiativeType object) {
				return createDSInitiativeTypeAdapter();
			}
			@Override
			public Adapter caseDSOtherAggregatePropertyType(DSOtherAggregatePropertyType object) {
				return createDSOtherAggregatePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDSOtherAggregateType(DSOtherAggregateType object) {
				return createDSOtherAggregateTypeAdapter();
			}
			@Override
			public Adapter caseDSPlatformPropertyType(DSPlatformPropertyType object) {
				return createDSPlatformPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDSPlatformType(DSPlatformType object) {
				return createDSPlatformTypeAdapter();
			}
			@Override
			public Adapter caseDSProductionSeriesPropertyType(DSProductionSeriesPropertyType object) {
				return createDSProductionSeriesPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDSProductionSeriesType(DSProductionSeriesType object) {
				return createDSProductionSeriesTypeAdapter();
			}
			@Override
			public Adapter caseDSSensorPropertyType(DSSensorPropertyType object) {
				return createDSSensorPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDSSensorType(DSSensorType object) {
				return createDSSensorTypeAdapter();
			}
			@Override
			public Adapter caseDSSeriesPropertyType(DSSeriesPropertyType object) {
				return createDSSeriesPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDSSeriesType(DSSeriesType object) {
				return createDSSeriesTypeAdapter();
			}
			@Override
			public Adapter caseDSStereoMatePropertyType(DSStereoMatePropertyType object) {
				return createDSStereoMatePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDSStereoMateType(DSStereoMateType object) {
				return createDSStereoMateTypeAdapter();
			}
			@Override
			public Adapter caseEXBoundingPolygonPropertyType(EXBoundingPolygonPropertyType object) {
				return createEXBoundingPolygonPropertyTypeAdapter();
			}
			@Override
			public Adapter caseEXBoundingPolygonType(EXBoundingPolygonType object) {
				return createEXBoundingPolygonTypeAdapter();
			}
			@Override
			public Adapter caseEXGeographicBoundingBoxPropertyType(EXGeographicBoundingBoxPropertyType object) {
				return createEXGeographicBoundingBoxPropertyTypeAdapter();
			}
			@Override
			public Adapter caseEXGeographicBoundingBoxType(EXGeographicBoundingBoxType object) {
				return createEXGeographicBoundingBoxTypeAdapter();
			}
			@Override
			public Adapter caseEXGeographicDescriptionPropertyType(EXGeographicDescriptionPropertyType object) {
				return createEXGeographicDescriptionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseEXGeographicDescriptionType(EXGeographicDescriptionType object) {
				return createEXGeographicDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseEXSpatialTemporalExtentPropertyType(EXSpatialTemporalExtentPropertyType object) {
				return createEXSpatialTemporalExtentPropertyTypeAdapter();
			}
			@Override
			public Adapter caseEXSpatialTemporalExtentType(EXSpatialTemporalExtentType object) {
				return createEXSpatialTemporalExtentTypeAdapter();
			}
			@Override
			public Adapter caseLanguageCodePropertyType(LanguageCodePropertyType object) {
				return createLanguageCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseLILineagePropertyType(LILineagePropertyType object) {
				return createLILineagePropertyTypeAdapter();
			}
			@Override
			public Adapter caseLILineageType(LILineageType object) {
				return createLILineageTypeAdapter();
			}
			@Override
			public Adapter caseLIProcessStepPropertyType(LIProcessStepPropertyType object) {
				return createLIProcessStepPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLIProcessStepType(LIProcessStepType object) {
				return createLIProcessStepTypeAdapter();
			}
			@Override
			public Adapter caseLISourcePropertyType(LISourcePropertyType object) {
				return createLISourcePropertyTypeAdapter();
			}
			@Override
			public Adapter caseLISourceType(LISourceType object) {
				return createLISourceTypeAdapter();
			}
			@Override
			public Adapter caseLocalisedCharacterStringPropertyType(LocalisedCharacterStringPropertyType object) {
				return createLocalisedCharacterStringPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLocalisedCharacterStringType(LocalisedCharacterStringType object) {
				return createLocalisedCharacterStringTypeAdapter();
			}
			@Override
			public Adapter caseMDAggregateInformationPropertyType(MDAggregateInformationPropertyType object) {
				return createMDAggregateInformationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDAggregateInformationType(MDAggregateInformationType object) {
				return createMDAggregateInformationTypeAdapter();
			}
			@Override
			public Adapter caseMDApplicationSchemaInformationPropertyType(MDApplicationSchemaInformationPropertyType object) {
				return createMDApplicationSchemaInformationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDApplicationSchemaInformationType(MDApplicationSchemaInformationType object) {
				return createMDApplicationSchemaInformationTypeAdapter();
			}
			@Override
			public Adapter caseMDBandPropertyType(MDBandPropertyType object) {
				return createMDBandPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDBandType(MDBandType object) {
				return createMDBandTypeAdapter();
			}
			@Override
			public Adapter caseMDBrowseGraphicPropertyType(MDBrowseGraphicPropertyType object) {
				return createMDBrowseGraphicPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDBrowseGraphicType(MDBrowseGraphicType object) {
				return createMDBrowseGraphicTypeAdapter();
			}
			@Override
			public Adapter caseMDCellGeometryCodePropertyType(MDCellGeometryCodePropertyType object) {
				return createMDCellGeometryCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDCharacterSetCodePropertyType(MDCharacterSetCodePropertyType object) {
				return createMDCharacterSetCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDClassificationCodePropertyType(MDClassificationCodePropertyType object) {
				return createMDClassificationCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDConstraintsPropertyType(MDConstraintsPropertyType object) {
				return createMDConstraintsPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDConstraintsType(MDConstraintsType object) {
				return createMDConstraintsTypeAdapter();
			}
			@Override
			public Adapter caseMDContentInformationPropertyType(MDContentInformationPropertyType object) {
				return createMDContentInformationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDCoverageContentTypeCodePropertyType(MDCoverageContentTypeCodePropertyType object) {
				return createMDCoverageContentTypeCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDCoverageDescriptionPropertyType(MDCoverageDescriptionPropertyType object) {
				return createMDCoverageDescriptionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDCoverageDescriptionType(MDCoverageDescriptionType object) {
				return createMDCoverageDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseMDDataIdentificationPropertyType(MDDataIdentificationPropertyType object) {
				return createMDDataIdentificationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDDataIdentificationType(MDDataIdentificationType object) {
				return createMDDataIdentificationTypeAdapter();
			}
			@Override
			public Adapter caseMDDatatypeCodePropertyType(MDDatatypeCodePropertyType object) {
				return createMDDatatypeCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDDigitalTransferOptionsPropertyType(MDDigitalTransferOptionsPropertyType object) {
				return createMDDigitalTransferOptionsPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDDigitalTransferOptionsType(MDDigitalTransferOptionsType object) {
				return createMDDigitalTransferOptionsTypeAdapter();
			}
			@Override
			public Adapter caseMDDimensionNameTypeCodePropertyType(MDDimensionNameTypeCodePropertyType object) {
				return createMDDimensionNameTypeCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDDimensionPropertyType(MDDimensionPropertyType object) {
				return createMDDimensionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDDimensionType(MDDimensionType object) {
				return createMDDimensionTypeAdapter();
			}
			@Override
			public Adapter caseMDDistributionPropertyType(MDDistributionPropertyType object) {
				return createMDDistributionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDDistributionType(MDDistributionType object) {
				return createMDDistributionTypeAdapter();
			}
			@Override
			public Adapter caseMDDistributionUnitsPropertyType(MDDistributionUnitsPropertyType object) {
				return createMDDistributionUnitsPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDDistributorPropertyType(MDDistributorPropertyType object) {
				return createMDDistributorPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDDistributorType(MDDistributorType object) {
				return createMDDistributorTypeAdapter();
			}
			@Override
			public Adapter caseMDExtendedElementInformationPropertyType(MDExtendedElementInformationPropertyType object) {
				return createMDExtendedElementInformationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDExtendedElementInformationType(MDExtendedElementInformationType object) {
				return createMDExtendedElementInformationTypeAdapter();
			}
			@Override
			public Adapter caseMDFeatureCatalogueDescriptionPropertyType(MDFeatureCatalogueDescriptionPropertyType object) {
				return createMDFeatureCatalogueDescriptionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDFeatureCatalogueDescriptionType(MDFeatureCatalogueDescriptionType object) {
				return createMDFeatureCatalogueDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseMDFormatPropertyType(MDFormatPropertyType object) {
				return createMDFormatPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDFormatType(MDFormatType object) {
				return createMDFormatTypeAdapter();
			}
			@Override
			public Adapter caseMDGeometricObjectsPropertyType(MDGeometricObjectsPropertyType object) {
				return createMDGeometricObjectsPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDGeometricObjectsType(MDGeometricObjectsType object) {
				return createMDGeometricObjectsTypeAdapter();
			}
			@Override
			public Adapter caseMDGeometricObjectTypeCodePropertyType(MDGeometricObjectTypeCodePropertyType object) {
				return createMDGeometricObjectTypeCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDGeorectifiedPropertyType(MDGeorectifiedPropertyType object) {
				return createMDGeorectifiedPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDGeorectifiedType(MDGeorectifiedType object) {
				return createMDGeorectifiedTypeAdapter();
			}
			@Override
			public Adapter caseMDGeoreferenceablePropertyType(MDGeoreferenceablePropertyType object) {
				return createMDGeoreferenceablePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDGeoreferenceableType(MDGeoreferenceableType object) {
				return createMDGeoreferenceableTypeAdapter();
			}
			@Override
			public Adapter caseMDGridSpatialRepresentationPropertyType(MDGridSpatialRepresentationPropertyType object) {
				return createMDGridSpatialRepresentationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDGridSpatialRepresentationType(MDGridSpatialRepresentationType object) {
				return createMDGridSpatialRepresentationTypeAdapter();
			}
			@Override
			public Adapter caseMDIdentificationPropertyType(MDIdentificationPropertyType object) {
				return createMDIdentificationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDIdentifierPropertyType(MDIdentifierPropertyType object) {
				return createMDIdentifierPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDIdentifierType(MDIdentifierType object) {
				return createMDIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseMDImageDescriptionPropertyType(MDImageDescriptionPropertyType object) {
				return createMDImageDescriptionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDImageDescriptionType(MDImageDescriptionType object) {
				return createMDImageDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseMDImagingConditionCodePropertyType(MDImagingConditionCodePropertyType object) {
				return createMDImagingConditionCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDKeywordsPropertyType(MDKeywordsPropertyType object) {
				return createMDKeywordsPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDKeywordsType(MDKeywordsType object) {
				return createMDKeywordsTypeAdapter();
			}
			@Override
			public Adapter caseMDKeywordTypeCodePropertyType(MDKeywordTypeCodePropertyType object) {
				return createMDKeywordTypeCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDLegalConstraintsPropertyType(MDLegalConstraintsPropertyType object) {
				return createMDLegalConstraintsPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDLegalConstraintsType(MDLegalConstraintsType object) {
				return createMDLegalConstraintsTypeAdapter();
			}
			@Override
			public Adapter caseMDMaintenanceFrequencyCodePropertyType(MDMaintenanceFrequencyCodePropertyType object) {
				return createMDMaintenanceFrequencyCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDMaintenanceInformationPropertyType(MDMaintenanceInformationPropertyType object) {
				return createMDMaintenanceInformationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDMaintenanceInformationType(MDMaintenanceInformationType object) {
				return createMDMaintenanceInformationTypeAdapter();
			}
			@Override
			public Adapter caseMDMediumFormatCodePropertyType(MDMediumFormatCodePropertyType object) {
				return createMDMediumFormatCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDMediumNameCodePropertyType(MDMediumNameCodePropertyType object) {
				return createMDMediumNameCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDMediumPropertyType(MDMediumPropertyType object) {
				return createMDMediumPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDMediumType(MDMediumType object) {
				return createMDMediumTypeAdapter();
			}
			@Override
			public Adapter caseMDMetadataExtensionInformationPropertyType(MDMetadataExtensionInformationPropertyType object) {
				return createMDMetadataExtensionInformationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDMetadataExtensionInformationType(MDMetadataExtensionInformationType object) {
				return createMDMetadataExtensionInformationTypeAdapter();
			}
			@Override
			public Adapter caseMDMetadataPropertyType(MDMetadataPropertyType object) {
				return createMDMetadataPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDMetadataType(MDMetadataType object) {
				return createMDMetadataTypeAdapter();
			}
			@Override
			public Adapter caseMDObligationCodePropertyType(MDObligationCodePropertyType object) {
				return createMDObligationCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDPixelOrientationCodePropertyType(MDPixelOrientationCodePropertyType object) {
				return createMDPixelOrientationCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDPortrayalCatalogueReferencePropertyType(MDPortrayalCatalogueReferencePropertyType object) {
				return createMDPortrayalCatalogueReferencePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDPortrayalCatalogueReferenceType(MDPortrayalCatalogueReferenceType object) {
				return createMDPortrayalCatalogueReferenceTypeAdapter();
			}
			@Override
			public Adapter caseMDProgressCodePropertyType(MDProgressCodePropertyType object) {
				return createMDProgressCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDRangeDimensionPropertyType(MDRangeDimensionPropertyType object) {
				return createMDRangeDimensionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDRangeDimensionType(MDRangeDimensionType object) {
				return createMDRangeDimensionTypeAdapter();
			}
			@Override
			public Adapter caseMDReferenceSystemPropertyType(MDReferenceSystemPropertyType object) {
				return createMDReferenceSystemPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDReferenceSystemType(MDReferenceSystemType object) {
				return createMDReferenceSystemTypeAdapter();
			}
			@Override
			public Adapter caseMDRepresentativeFractionPropertyType(MDRepresentativeFractionPropertyType object) {
				return createMDRepresentativeFractionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDRepresentativeFractionType(MDRepresentativeFractionType object) {
				return createMDRepresentativeFractionTypeAdapter();
			}
			@Override
			public Adapter caseMDResolutionPropertyType(MDResolutionPropertyType object) {
				return createMDResolutionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDResolutionType(MDResolutionType object) {
				return createMDResolutionTypeAdapter();
			}
			@Override
			public Adapter caseMDRestrictionCodePropertyType(MDRestrictionCodePropertyType object) {
				return createMDRestrictionCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDScopeCodePropertyType(MDScopeCodePropertyType object) {
				return createMDScopeCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDScopeDescriptionPropertyType(MDScopeDescriptionPropertyType object) {
				return createMDScopeDescriptionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDScopeDescriptionType(MDScopeDescriptionType object) {
				return createMDScopeDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseMDSecurityConstraintsPropertyType(MDSecurityConstraintsPropertyType object) {
				return createMDSecurityConstraintsPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDSecurityConstraintsType(MDSecurityConstraintsType object) {
				return createMDSecurityConstraintsTypeAdapter();
			}
			@Override
			public Adapter caseMDServiceIdentificationPropertyType(MDServiceIdentificationPropertyType object) {
				return createMDServiceIdentificationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDServiceIdentificationType(MDServiceIdentificationType object) {
				return createMDServiceIdentificationTypeAdapter();
			}
			@Override
			public Adapter caseMDSpatialRepresentationPropertyType(MDSpatialRepresentationPropertyType object) {
				return createMDSpatialRepresentationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDSpatialRepresentationTypeCodePropertyType(MDSpatialRepresentationTypeCodePropertyType object) {
				return createMDSpatialRepresentationTypeCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDStandardOrderProcessPropertyType(MDStandardOrderProcessPropertyType object) {
				return createMDStandardOrderProcessPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDStandardOrderProcessType(MDStandardOrderProcessType object) {
				return createMDStandardOrderProcessTypeAdapter();
			}
			@Override
			public Adapter caseMDTopicCategoryCodePropertyType(MDTopicCategoryCodePropertyType object) {
				return createMDTopicCategoryCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDTopologyLevelCodePropertyType(MDTopologyLevelCodePropertyType object) {
				return createMDTopologyLevelCodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDUsagePropertyType(MDUsagePropertyType object) {
				return createMDUsagePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDUsageType(MDUsageType object) {
				return createMDUsageTypeAdapter();
			}
			@Override
			public Adapter caseMDVectorSpatialRepresentationPropertyType(MDVectorSpatialRepresentationPropertyType object) {
				return createMDVectorSpatialRepresentationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMDVectorSpatialRepresentationType(MDVectorSpatialRepresentationType object) {
				return createMDVectorSpatialRepresentationTypeAdapter();
			}
			@Override
			public Adapter casePTFreeTextPropertyType(PTFreeTextPropertyType object) {
				return createPTFreeTextPropertyTypeAdapter();
			}
			@Override
			public Adapter casePTFreeTextType(PTFreeTextType object) {
				return createPTFreeTextTypeAdapter();
			}
			@Override
			public Adapter casePTLocaleContainerPropertyType(PTLocaleContainerPropertyType object) {
				return createPTLocaleContainerPropertyTypeAdapter();
			}
			@Override
			public Adapter casePTLocaleContainerType(PTLocaleContainerType object) {
				return createPTLocaleContainerTypeAdapter();
			}
			@Override
			public Adapter casePTLocalePropertyType(PTLocalePropertyType object) {
				return createPTLocalePropertyTypeAdapter();
			}
			@Override
			public Adapter casePTLocaleType(PTLocaleType object) {
				return createPTLocaleTypeAdapter();
			}
			@Override
			public Adapter caseRSIdentifierPropertyType(RSIdentifierPropertyType object) {
				return createRSIdentifierPropertyTypeAdapter();
			}
			@Override
			public Adapter caseRSIdentifierType(RSIdentifierType object) {
				return createRSIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseRSReferenceSystemPropertyType(RSReferenceSystemPropertyType object) {
				return createRSReferenceSystemPropertyTypeAdapter();
			}
			@Override
			public Adapter caseURLPropertyType(URLPropertyType object) {
				return createURLPropertyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractObjectType(AbstractObjectType object) {
				return createAbstractObjectTypeAdapter();
			}
			@Override
			public Adapter caseObjectReferencePropertyType(ObjectReferencePropertyType object) {
				return createObjectReferencePropertyTypeAdapter();
			}
			@Override
			public Adapter caseCharacterStringPropertyType(CharacterStringPropertyType object) {
				return createCharacterStringPropertyTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.AbstractDQCompletenessType <em>Abstract DQ Completeness Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.AbstractDQCompletenessType
	 * @generated
	 */
	public Adapter createAbstractDQCompletenessTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.AbstractDQElementType <em>Abstract DQ Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.AbstractDQElementType
	 * @generated
	 */
	public Adapter createAbstractDQElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.AbstractDQLogicalConsistencyType <em>Abstract DQ Logical Consistency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.AbstractDQLogicalConsistencyType
	 * @generated
	 */
	public Adapter createAbstractDQLogicalConsistencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.AbstractDQPositionalAccuracyType <em>Abstract DQ Positional Accuracy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.AbstractDQPositionalAccuracyType
	 * @generated
	 */
	public Adapter createAbstractDQPositionalAccuracyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.AbstractDQResultType <em>Abstract DQ Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.AbstractDQResultType
	 * @generated
	 */
	public Adapter createAbstractDQResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.AbstractDQTemporalAccuracyType <em>Abstract DQ Temporal Accuracy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.AbstractDQTemporalAccuracyType
	 * @generated
	 */
	public Adapter createAbstractDQTemporalAccuracyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.AbstractDQThematicAccuracyType <em>Abstract DQ Thematic Accuracy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.AbstractDQThematicAccuracyType
	 * @generated
	 */
	public Adapter createAbstractDQThematicAccuracyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.AbstractDSAggregateType <em>Abstract DS Aggregate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.AbstractDSAggregateType
	 * @generated
	 */
	public Adapter createAbstractDSAggregateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.AbstractEXGeographicExtentType <em>Abstract EX Geographic Extent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.AbstractEXGeographicExtentType
	 * @generated
	 */
	public Adapter createAbstractEXGeographicExtentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.AbstractMDContentInformationType <em>Abstract MD Content Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.AbstractMDContentInformationType
	 * @generated
	 */
	public Adapter createAbstractMDContentInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.AbstractMDIdentificationType <em>Abstract MD Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.AbstractMDIdentificationType
	 * @generated
	 */
	public Adapter createAbstractMDIdentificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.AbstractMDSpatialRepresentationType <em>Abstract MD Spatial Representation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.AbstractMDSpatialRepresentationType
	 * @generated
	 */
	public Adapter createAbstractMDSpatialRepresentationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.AbstractRSReferenceSystemType <em>Abstract RS Reference System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.AbstractRSReferenceSystemType
	 * @generated
	 */
	public Adapter createAbstractRSReferenceSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CIAddressPropertyType <em>CI Address Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CIAddressPropertyType
	 * @generated
	 */
	public Adapter createCIAddressPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CIAddressType <em>CI Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CIAddressType
	 * @generated
	 */
	public Adapter createCIAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CICitationPropertyType <em>CI Citation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CICitationPropertyType
	 * @generated
	 */
	public Adapter createCICitationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CICitationType <em>CI Citation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CICitationType
	 * @generated
	 */
	public Adapter createCICitationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CIContactPropertyType <em>CI Contact Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CIContactPropertyType
	 * @generated
	 */
	public Adapter createCIContactPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CIContactType <em>CI Contact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CIContactType
	 * @generated
	 */
	public Adapter createCIContactTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CIDatePropertyType <em>CI Date Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CIDatePropertyType
	 * @generated
	 */
	public Adapter createCIDatePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CIDateType <em>CI Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CIDateType
	 * @generated
	 */
	public Adapter createCIDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CIDateTypeCodePropertyType <em>CI Date Type Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CIDateTypeCodePropertyType
	 * @generated
	 */
	public Adapter createCIDateTypeCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CIOnLineFunctionCodePropertyType <em>CI On Line Function Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CIOnLineFunctionCodePropertyType
	 * @generated
	 */
	public Adapter createCIOnLineFunctionCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CIOnlineResourcePropertyType <em>CI Online Resource Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CIOnlineResourcePropertyType
	 * @generated
	 */
	public Adapter createCIOnlineResourcePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CIOnlineResourceType <em>CI Online Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CIOnlineResourceType
	 * @generated
	 */
	public Adapter createCIOnlineResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CIPresentationFormCodePropertyType <em>CI Presentation Form Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CIPresentationFormCodePropertyType
	 * @generated
	 */
	public Adapter createCIPresentationFormCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CIResponsiblePartyPropertyType <em>CI Responsible Party Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CIResponsiblePartyPropertyType
	 * @generated
	 */
	public Adapter createCIResponsiblePartyPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CIResponsiblePartyType <em>CI Responsible Party Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CIResponsiblePartyType
	 * @generated
	 */
	public Adapter createCIResponsiblePartyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CIRoleCodePropertyType <em>CI Role Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CIRoleCodePropertyType
	 * @generated
	 */
	public Adapter createCIRoleCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CISeriesPropertyType <em>CI Series Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CISeriesPropertyType
	 * @generated
	 */
	public Adapter createCISeriesPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CISeriesType <em>CI Series Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CISeriesType
	 * @generated
	 */
	public Adapter createCISeriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CITelephonePropertyType <em>CI Telephone Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CITelephonePropertyType
	 * @generated
	 */
	public Adapter createCITelephonePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CITelephoneType <em>CI Telephone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CITelephoneType
	 * @generated
	 */
	public Adapter createCITelephoneTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.CountryPropertyType <em>Country Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.CountryPropertyType
	 * @generated
	 */
	public Adapter createCountryPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQAbsoluteExternalPositionalAccuracyPropertyType <em>DQ Absolute External Positional Accuracy Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQAbsoluteExternalPositionalAccuracyPropertyType
	 * @generated
	 */
	public Adapter createDQAbsoluteExternalPositionalAccuracyPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQAbsoluteExternalPositionalAccuracyType <em>DQ Absolute External Positional Accuracy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQAbsoluteExternalPositionalAccuracyType
	 * @generated
	 */
	public Adapter createDQAbsoluteExternalPositionalAccuracyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQAccuracyOfATimeMeasurementPropertyType <em>DQ Accuracy Of ATime Measurement Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQAccuracyOfATimeMeasurementPropertyType
	 * @generated
	 */
	public Adapter createDQAccuracyOfATimeMeasurementPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQAccuracyOfATimeMeasurementType <em>DQ Accuracy Of ATime Measurement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQAccuracyOfATimeMeasurementType
	 * @generated
	 */
	public Adapter createDQAccuracyOfATimeMeasurementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQCompletenessCommissionPropertyType <em>DQ Completeness Commission Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQCompletenessCommissionPropertyType
	 * @generated
	 */
	public Adapter createDQCompletenessCommissionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQCompletenessCommissionType <em>DQ Completeness Commission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQCompletenessCommissionType
	 * @generated
	 */
	public Adapter createDQCompletenessCommissionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQCompletenessOmissionPropertyType <em>DQ Completeness Omission Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQCompletenessOmissionPropertyType
	 * @generated
	 */
	public Adapter createDQCompletenessOmissionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQCompletenessOmissionType <em>DQ Completeness Omission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQCompletenessOmissionType
	 * @generated
	 */
	public Adapter createDQCompletenessOmissionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQCompletenessPropertyType <em>DQ Completeness Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQCompletenessPropertyType
	 * @generated
	 */
	public Adapter createDQCompletenessPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQConceptualConsistencyPropertyType <em>DQ Conceptual Consistency Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQConceptualConsistencyPropertyType
	 * @generated
	 */
	public Adapter createDQConceptualConsistencyPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQConceptualConsistencyType <em>DQ Conceptual Consistency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQConceptualConsistencyType
	 * @generated
	 */
	public Adapter createDQConceptualConsistencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQConformanceResultPropertyType <em>DQ Conformance Result Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQConformanceResultPropertyType
	 * @generated
	 */
	public Adapter createDQConformanceResultPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQConformanceResultType <em>DQ Conformance Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQConformanceResultType
	 * @generated
	 */
	public Adapter createDQConformanceResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQDataQualityPropertyType <em>DQ Data Quality Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQDataQualityPropertyType
	 * @generated
	 */
	public Adapter createDQDataQualityPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQDataQualityType <em>DQ Data Quality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQDataQualityType
	 * @generated
	 */
	public Adapter createDQDataQualityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQDomainConsistencyPropertyType <em>DQ Domain Consistency Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQDomainConsistencyPropertyType
	 * @generated
	 */
	public Adapter createDQDomainConsistencyPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQDomainConsistencyType <em>DQ Domain Consistency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQDomainConsistencyType
	 * @generated
	 */
	public Adapter createDQDomainConsistencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQElementPropertyType <em>DQ Element Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQElementPropertyType
	 * @generated
	 */
	public Adapter createDQElementPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQEvaluationMethodTypeCodePropertyType <em>DQ Evaluation Method Type Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQEvaluationMethodTypeCodePropertyType
	 * @generated
	 */
	public Adapter createDQEvaluationMethodTypeCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQFormatConsistencyPropertyType <em>DQ Format Consistency Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQFormatConsistencyPropertyType
	 * @generated
	 */
	public Adapter createDQFormatConsistencyPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQFormatConsistencyType <em>DQ Format Consistency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQFormatConsistencyType
	 * @generated
	 */
	public Adapter createDQFormatConsistencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQGriddedDataPositionalAccuracyPropertyType <em>DQ Gridded Data Positional Accuracy Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQGriddedDataPositionalAccuracyPropertyType
	 * @generated
	 */
	public Adapter createDQGriddedDataPositionalAccuracyPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQGriddedDataPositionalAccuracyType <em>DQ Gridded Data Positional Accuracy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQGriddedDataPositionalAccuracyType
	 * @generated
	 */
	public Adapter createDQGriddedDataPositionalAccuracyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQLogicalConsistencyPropertyType <em>DQ Logical Consistency Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQLogicalConsistencyPropertyType
	 * @generated
	 */
	public Adapter createDQLogicalConsistencyPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQNonQuantitativeAttributeAccuracyPropertyType <em>DQ Non Quantitative Attribute Accuracy Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQNonQuantitativeAttributeAccuracyPropertyType
	 * @generated
	 */
	public Adapter createDQNonQuantitativeAttributeAccuracyPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQNonQuantitativeAttributeAccuracyType <em>DQ Non Quantitative Attribute Accuracy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQNonQuantitativeAttributeAccuracyType
	 * @generated
	 */
	public Adapter createDQNonQuantitativeAttributeAccuracyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQPositionalAccuracyPropertyType <em>DQ Positional Accuracy Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQPositionalAccuracyPropertyType
	 * @generated
	 */
	public Adapter createDQPositionalAccuracyPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQQuantitativeAttributeAccuracyPropertyType <em>DQ Quantitative Attribute Accuracy Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQQuantitativeAttributeAccuracyPropertyType
	 * @generated
	 */
	public Adapter createDQQuantitativeAttributeAccuracyPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQQuantitativeAttributeAccuracyType <em>DQ Quantitative Attribute Accuracy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQQuantitativeAttributeAccuracyType
	 * @generated
	 */
	public Adapter createDQQuantitativeAttributeAccuracyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQQuantitativeResultPropertyType <em>DQ Quantitative Result Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQQuantitativeResultPropertyType
	 * @generated
	 */
	public Adapter createDQQuantitativeResultPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQQuantitativeResultType <em>DQ Quantitative Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQQuantitativeResultType
	 * @generated
	 */
	public Adapter createDQQuantitativeResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQRelativeInternalPositionalAccuracyPropertyType <em>DQ Relative Internal Positional Accuracy Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQRelativeInternalPositionalAccuracyPropertyType
	 * @generated
	 */
	public Adapter createDQRelativeInternalPositionalAccuracyPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQRelativeInternalPositionalAccuracyType <em>DQ Relative Internal Positional Accuracy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQRelativeInternalPositionalAccuracyType
	 * @generated
	 */
	public Adapter createDQRelativeInternalPositionalAccuracyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQResultPropertyType <em>DQ Result Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQResultPropertyType
	 * @generated
	 */
	public Adapter createDQResultPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQScopePropertyType <em>DQ Scope Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQScopePropertyType
	 * @generated
	 */
	public Adapter createDQScopePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQScopeType <em>DQ Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQScopeType
	 * @generated
	 */
	public Adapter createDQScopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQTemporalAccuracyPropertyType <em>DQ Temporal Accuracy Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQTemporalAccuracyPropertyType
	 * @generated
	 */
	public Adapter createDQTemporalAccuracyPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQTemporalConsistencyPropertyType <em>DQ Temporal Consistency Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQTemporalConsistencyPropertyType
	 * @generated
	 */
	public Adapter createDQTemporalConsistencyPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQTemporalConsistencyType <em>DQ Temporal Consistency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQTemporalConsistencyType
	 * @generated
	 */
	public Adapter createDQTemporalConsistencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQTemporalValidityPropertyType <em>DQ Temporal Validity Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQTemporalValidityPropertyType
	 * @generated
	 */
	public Adapter createDQTemporalValidityPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQThematicAccuracyPropertyType <em>DQ Thematic Accuracy Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQThematicAccuracyPropertyType
	 * @generated
	 */
	public Adapter createDQThematicAccuracyPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQThematicClassificationCorrectnessPropertyType <em>DQ Thematic Classification Correctness Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQThematicClassificationCorrectnessPropertyType
	 * @generated
	 */
	public Adapter createDQThematicClassificationCorrectnessPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQTopologicalConsistencyPropertyType <em>DQ Topological Consistency Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQTopologicalConsistencyPropertyType
	 * @generated
	 */
	public Adapter createDQTopologicalConsistencyPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSAggregatePropertyType <em>DS Aggregate Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSAggregatePropertyType
	 * @generated
	 */
	public Adapter createDSAggregatePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSAssociationPropertyType <em>DS Association Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSAssociationPropertyType
	 * @generated
	 */
	public Adapter createDSAssociationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSAssociationTypeCodePropertyType <em>DS Association Type Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSAssociationTypeCodePropertyType
	 * @generated
	 */
	public Adapter createDSAssociationTypeCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSDataSetPropertyType <em>DS Data Set Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSDataSetPropertyType
	 * @generated
	 */
	public Adapter createDSDataSetPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSDataSetType <em>DS Data Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSDataSetType
	 * @generated
	 */
	public Adapter createDSDataSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSInitiativeTypeCodePropertyType <em>DS Initiative Type Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSInitiativeTypeCodePropertyType
	 * @generated
	 */
	public Adapter createDSInitiativeTypeCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.EXExtentPropertyType <em>EX Extent Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.EXExtentPropertyType
	 * @generated
	 */
	public Adapter createEXExtentPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.EXExtentType <em>EX Extent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.EXExtentType
	 * @generated
	 */
	public Adapter createEXExtentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.EXGeographicExtentPropertyType <em>EX Geographic Extent Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.EXGeographicExtentPropertyType
	 * @generated
	 */
	public Adapter createEXGeographicExtentPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.EXTemporalExtentPropertyType <em>EX Temporal Extent Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.EXTemporalExtentPropertyType
	 * @generated
	 */
	public Adapter createEXTemporalExtentPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.EXTemporalExtentType <em>EX Temporal Extent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.EXTemporalExtentType
	 * @generated
	 */
	public Adapter createEXTemporalExtentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.EXVerticalExtentPropertyType <em>EX Vertical Extent Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.EXVerticalExtentPropertyType
	 * @generated
	 */
	public Adapter createEXVerticalExtentPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.EXVerticalExtentType <em>EX Vertical Extent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.EXVerticalExtentType
	 * @generated
	 */
	public Adapter createEXVerticalExtentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQTemporalValidityType <em>DQ Temporal Validity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQTemporalValidityType
	 * @generated
	 */
	public Adapter createDQTemporalValidityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQThematicClassificationCorrectnessType <em>DQ Thematic Classification Correctness Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQThematicClassificationCorrectnessType
	 * @generated
	 */
	public Adapter createDQThematicClassificationCorrectnessTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DQTopologicalConsistencyType <em>DQ Topological Consistency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DQTopologicalConsistencyType
	 * @generated
	 */
	public Adapter createDQTopologicalConsistencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSAssociationType <em>DS Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSAssociationType
	 * @generated
	 */
	public Adapter createDSAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSInitiativePropertyType <em>DS Initiative Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSInitiativePropertyType
	 * @generated
	 */
	public Adapter createDSInitiativePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSInitiativeType <em>DS Initiative Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSInitiativeType
	 * @generated
	 */
	public Adapter createDSInitiativeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSOtherAggregatePropertyType <em>DS Other Aggregate Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSOtherAggregatePropertyType
	 * @generated
	 */
	public Adapter createDSOtherAggregatePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSOtherAggregateType <em>DS Other Aggregate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSOtherAggregateType
	 * @generated
	 */
	public Adapter createDSOtherAggregateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSPlatformPropertyType <em>DS Platform Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSPlatformPropertyType
	 * @generated
	 */
	public Adapter createDSPlatformPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSPlatformType <em>DS Platform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSPlatformType
	 * @generated
	 */
	public Adapter createDSPlatformTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSProductionSeriesPropertyType <em>DS Production Series Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSProductionSeriesPropertyType
	 * @generated
	 */
	public Adapter createDSProductionSeriesPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSProductionSeriesType <em>DS Production Series Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSProductionSeriesType
	 * @generated
	 */
	public Adapter createDSProductionSeriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSSensorPropertyType <em>DS Sensor Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSSensorPropertyType
	 * @generated
	 */
	public Adapter createDSSensorPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSSensorType <em>DS Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSSensorType
	 * @generated
	 */
	public Adapter createDSSensorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSSeriesPropertyType <em>DS Series Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSSeriesPropertyType
	 * @generated
	 */
	public Adapter createDSSeriesPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSSeriesType <em>DS Series Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSSeriesType
	 * @generated
	 */
	public Adapter createDSSeriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSStereoMatePropertyType <em>DS Stereo Mate Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSStereoMatePropertyType
	 * @generated
	 */
	public Adapter createDSStereoMatePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.DSStereoMateType <em>DS Stereo Mate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.DSStereoMateType
	 * @generated
	 */
	public Adapter createDSStereoMateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.EXBoundingPolygonPropertyType <em>EX Bounding Polygon Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.EXBoundingPolygonPropertyType
	 * @generated
	 */
	public Adapter createEXBoundingPolygonPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.EXBoundingPolygonType <em>EX Bounding Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.EXBoundingPolygonType
	 * @generated
	 */
	public Adapter createEXBoundingPolygonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.EXGeographicBoundingBoxPropertyType <em>EX Geographic Bounding Box Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.EXGeographicBoundingBoxPropertyType
	 * @generated
	 */
	public Adapter createEXGeographicBoundingBoxPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.EXGeographicBoundingBoxType <em>EX Geographic Bounding Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.EXGeographicBoundingBoxType
	 * @generated
	 */
	public Adapter createEXGeographicBoundingBoxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.EXGeographicDescriptionPropertyType <em>EX Geographic Description Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.EXGeographicDescriptionPropertyType
	 * @generated
	 */
	public Adapter createEXGeographicDescriptionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.EXGeographicDescriptionType <em>EX Geographic Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.EXGeographicDescriptionType
	 * @generated
	 */
	public Adapter createEXGeographicDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.EXSpatialTemporalExtentPropertyType <em>EX Spatial Temporal Extent Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.EXSpatialTemporalExtentPropertyType
	 * @generated
	 */
	public Adapter createEXSpatialTemporalExtentPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.EXSpatialTemporalExtentType <em>EX Spatial Temporal Extent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.EXSpatialTemporalExtentType
	 * @generated
	 */
	public Adapter createEXSpatialTemporalExtentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.LanguageCodePropertyType <em>Language Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.LanguageCodePropertyType
	 * @generated
	 */
	public Adapter createLanguageCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.LILineagePropertyType <em>LI Lineage Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.LILineagePropertyType
	 * @generated
	 */
	public Adapter createLILineagePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.LILineageType <em>LI Lineage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.LILineageType
	 * @generated
	 */
	public Adapter createLILineageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.LIProcessStepPropertyType <em>LI Process Step Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.LIProcessStepPropertyType
	 * @generated
	 */
	public Adapter createLIProcessStepPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.LIProcessStepType <em>LI Process Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.LIProcessStepType
	 * @generated
	 */
	public Adapter createLIProcessStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.LISourcePropertyType <em>LI Source Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.LISourcePropertyType
	 * @generated
	 */
	public Adapter createLISourcePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.LISourceType <em>LI Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.LISourceType
	 * @generated
	 */
	public Adapter createLISourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.LocalisedCharacterStringPropertyType <em>Localised Character String Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.LocalisedCharacterStringPropertyType
	 * @generated
	 */
	public Adapter createLocalisedCharacterStringPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.LocalisedCharacterStringType <em>Localised Character String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.LocalisedCharacterStringType
	 * @generated
	 */
	public Adapter createLocalisedCharacterStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDAggregateInformationPropertyType <em>MD Aggregate Information Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDAggregateInformationPropertyType
	 * @generated
	 */
	public Adapter createMDAggregateInformationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDAggregateInformationType <em>MD Aggregate Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDAggregateInformationType
	 * @generated
	 */
	public Adapter createMDAggregateInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDApplicationSchemaInformationPropertyType <em>MD Application Schema Information Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDApplicationSchemaInformationPropertyType
	 * @generated
	 */
	public Adapter createMDApplicationSchemaInformationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDApplicationSchemaInformationType <em>MD Application Schema Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDApplicationSchemaInformationType
	 * @generated
	 */
	public Adapter createMDApplicationSchemaInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDBandPropertyType <em>MD Band Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDBandPropertyType
	 * @generated
	 */
	public Adapter createMDBandPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDBandType <em>MD Band Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDBandType
	 * @generated
	 */
	public Adapter createMDBandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDBrowseGraphicPropertyType <em>MD Browse Graphic Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDBrowseGraphicPropertyType
	 * @generated
	 */
	public Adapter createMDBrowseGraphicPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDBrowseGraphicType <em>MD Browse Graphic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDBrowseGraphicType
	 * @generated
	 */
	public Adapter createMDBrowseGraphicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDCellGeometryCodePropertyType <em>MD Cell Geometry Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDCellGeometryCodePropertyType
	 * @generated
	 */
	public Adapter createMDCellGeometryCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDCharacterSetCodePropertyType <em>MD Character Set Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDCharacterSetCodePropertyType
	 * @generated
	 */
	public Adapter createMDCharacterSetCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDClassificationCodePropertyType <em>MD Classification Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDClassificationCodePropertyType
	 * @generated
	 */
	public Adapter createMDClassificationCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDConstraintsPropertyType <em>MD Constraints Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDConstraintsPropertyType
	 * @generated
	 */
	public Adapter createMDConstraintsPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDConstraintsType <em>MD Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDConstraintsType
	 * @generated
	 */
	public Adapter createMDConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDContentInformationPropertyType <em>MD Content Information Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDContentInformationPropertyType
	 * @generated
	 */
	public Adapter createMDContentInformationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDCoverageContentTypeCodePropertyType <em>MD Coverage Content Type Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDCoverageContentTypeCodePropertyType
	 * @generated
	 */
	public Adapter createMDCoverageContentTypeCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDCoverageDescriptionPropertyType <em>MD Coverage Description Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDCoverageDescriptionPropertyType
	 * @generated
	 */
	public Adapter createMDCoverageDescriptionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDCoverageDescriptionType <em>MD Coverage Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDCoverageDescriptionType
	 * @generated
	 */
	public Adapter createMDCoverageDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDDataIdentificationPropertyType <em>MD Data Identification Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDDataIdentificationPropertyType
	 * @generated
	 */
	public Adapter createMDDataIdentificationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDDataIdentificationType <em>MD Data Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDDataIdentificationType
	 * @generated
	 */
	public Adapter createMDDataIdentificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDDatatypeCodePropertyType <em>MD Datatype Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDDatatypeCodePropertyType
	 * @generated
	 */
	public Adapter createMDDatatypeCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDDigitalTransferOptionsPropertyType <em>MD Digital Transfer Options Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDDigitalTransferOptionsPropertyType
	 * @generated
	 */
	public Adapter createMDDigitalTransferOptionsPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDDigitalTransferOptionsType <em>MD Digital Transfer Options Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDDigitalTransferOptionsType
	 * @generated
	 */
	public Adapter createMDDigitalTransferOptionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDDimensionNameTypeCodePropertyType <em>MD Dimension Name Type Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDDimensionNameTypeCodePropertyType
	 * @generated
	 */
	public Adapter createMDDimensionNameTypeCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDDimensionPropertyType <em>MD Dimension Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDDimensionPropertyType
	 * @generated
	 */
	public Adapter createMDDimensionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDDimensionType <em>MD Dimension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDDimensionType
	 * @generated
	 */
	public Adapter createMDDimensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDDistributionPropertyType <em>MD Distribution Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDDistributionPropertyType
	 * @generated
	 */
	public Adapter createMDDistributionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDDistributionType <em>MD Distribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDDistributionType
	 * @generated
	 */
	public Adapter createMDDistributionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDDistributionUnitsPropertyType <em>MD Distribution Units Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDDistributionUnitsPropertyType
	 * @generated
	 */
	public Adapter createMDDistributionUnitsPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDDistributorPropertyType <em>MD Distributor Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDDistributorPropertyType
	 * @generated
	 */
	public Adapter createMDDistributorPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDDistributorType <em>MD Distributor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDDistributorType
	 * @generated
	 */
	public Adapter createMDDistributorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDExtendedElementInformationPropertyType <em>MD Extended Element Information Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDExtendedElementInformationPropertyType
	 * @generated
	 */
	public Adapter createMDExtendedElementInformationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDExtendedElementInformationType <em>MD Extended Element Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDExtendedElementInformationType
	 * @generated
	 */
	public Adapter createMDExtendedElementInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDFeatureCatalogueDescriptionPropertyType <em>MD Feature Catalogue Description Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDFeatureCatalogueDescriptionPropertyType
	 * @generated
	 */
	public Adapter createMDFeatureCatalogueDescriptionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDFeatureCatalogueDescriptionType <em>MD Feature Catalogue Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDFeatureCatalogueDescriptionType
	 * @generated
	 */
	public Adapter createMDFeatureCatalogueDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDFormatPropertyType <em>MD Format Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDFormatPropertyType
	 * @generated
	 */
	public Adapter createMDFormatPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDFormatType <em>MD Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDFormatType
	 * @generated
	 */
	public Adapter createMDFormatTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDGeometricObjectsPropertyType <em>MD Geometric Objects Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDGeometricObjectsPropertyType
	 * @generated
	 */
	public Adapter createMDGeometricObjectsPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDGeometricObjectsType <em>MD Geometric Objects Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDGeometricObjectsType
	 * @generated
	 */
	public Adapter createMDGeometricObjectsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDGeometricObjectTypeCodePropertyType <em>MD Geometric Object Type Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDGeometricObjectTypeCodePropertyType
	 * @generated
	 */
	public Adapter createMDGeometricObjectTypeCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDGeorectifiedPropertyType <em>MD Georectified Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDGeorectifiedPropertyType
	 * @generated
	 */
	public Adapter createMDGeorectifiedPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDGeorectifiedType <em>MD Georectified Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDGeorectifiedType
	 * @generated
	 */
	public Adapter createMDGeorectifiedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDGeoreferenceablePropertyType <em>MD Georeferenceable Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDGeoreferenceablePropertyType
	 * @generated
	 */
	public Adapter createMDGeoreferenceablePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDGeoreferenceableType <em>MD Georeferenceable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDGeoreferenceableType
	 * @generated
	 */
	public Adapter createMDGeoreferenceableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDGridSpatialRepresentationPropertyType <em>MD Grid Spatial Representation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDGridSpatialRepresentationPropertyType
	 * @generated
	 */
	public Adapter createMDGridSpatialRepresentationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDGridSpatialRepresentationType <em>MD Grid Spatial Representation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDGridSpatialRepresentationType
	 * @generated
	 */
	public Adapter createMDGridSpatialRepresentationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDIdentificationPropertyType <em>MD Identification Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDIdentificationPropertyType
	 * @generated
	 */
	public Adapter createMDIdentificationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDIdentifierPropertyType <em>MD Identifier Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDIdentifierPropertyType
	 * @generated
	 */
	public Adapter createMDIdentifierPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDIdentifierType <em>MD Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDIdentifierType
	 * @generated
	 */
	public Adapter createMDIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDImageDescriptionPropertyType <em>MD Image Description Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDImageDescriptionPropertyType
	 * @generated
	 */
	public Adapter createMDImageDescriptionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDImageDescriptionType <em>MD Image Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDImageDescriptionType
	 * @generated
	 */
	public Adapter createMDImageDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDImagingConditionCodePropertyType <em>MD Imaging Condition Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDImagingConditionCodePropertyType
	 * @generated
	 */
	public Adapter createMDImagingConditionCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDKeywordsPropertyType <em>MD Keywords Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDKeywordsPropertyType
	 * @generated
	 */
	public Adapter createMDKeywordsPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDKeywordsType <em>MD Keywords Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDKeywordsType
	 * @generated
	 */
	public Adapter createMDKeywordsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDKeywordTypeCodePropertyType <em>MD Keyword Type Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDKeywordTypeCodePropertyType
	 * @generated
	 */
	public Adapter createMDKeywordTypeCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDLegalConstraintsPropertyType <em>MD Legal Constraints Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDLegalConstraintsPropertyType
	 * @generated
	 */
	public Adapter createMDLegalConstraintsPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDLegalConstraintsType <em>MD Legal Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDLegalConstraintsType
	 * @generated
	 */
	public Adapter createMDLegalConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDMaintenanceFrequencyCodePropertyType <em>MD Maintenance Frequency Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDMaintenanceFrequencyCodePropertyType
	 * @generated
	 */
	public Adapter createMDMaintenanceFrequencyCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDMaintenanceInformationPropertyType <em>MD Maintenance Information Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDMaintenanceInformationPropertyType
	 * @generated
	 */
	public Adapter createMDMaintenanceInformationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDMaintenanceInformationType <em>MD Maintenance Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDMaintenanceInformationType
	 * @generated
	 */
	public Adapter createMDMaintenanceInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDMediumFormatCodePropertyType <em>MD Medium Format Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDMediumFormatCodePropertyType
	 * @generated
	 */
	public Adapter createMDMediumFormatCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDMediumNameCodePropertyType <em>MD Medium Name Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDMediumNameCodePropertyType
	 * @generated
	 */
	public Adapter createMDMediumNameCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDMediumPropertyType <em>MD Medium Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDMediumPropertyType
	 * @generated
	 */
	public Adapter createMDMediumPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDMediumType <em>MD Medium Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDMediumType
	 * @generated
	 */
	public Adapter createMDMediumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDMetadataExtensionInformationPropertyType <em>MD Metadata Extension Information Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDMetadataExtensionInformationPropertyType
	 * @generated
	 */
	public Adapter createMDMetadataExtensionInformationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDMetadataExtensionInformationType <em>MD Metadata Extension Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDMetadataExtensionInformationType
	 * @generated
	 */
	public Adapter createMDMetadataExtensionInformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDMetadataPropertyType <em>MD Metadata Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDMetadataPropertyType
	 * @generated
	 */
	public Adapter createMDMetadataPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDMetadataType <em>MD Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDMetadataType
	 * @generated
	 */
	public Adapter createMDMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDObligationCodePropertyType <em>MD Obligation Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDObligationCodePropertyType
	 * @generated
	 */
	public Adapter createMDObligationCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDPixelOrientationCodePropertyType <em>MD Pixel Orientation Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDPixelOrientationCodePropertyType
	 * @generated
	 */
	public Adapter createMDPixelOrientationCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDPortrayalCatalogueReferencePropertyType <em>MD Portrayal Catalogue Reference Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDPortrayalCatalogueReferencePropertyType
	 * @generated
	 */
	public Adapter createMDPortrayalCatalogueReferencePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDPortrayalCatalogueReferenceType <em>MD Portrayal Catalogue Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDPortrayalCatalogueReferenceType
	 * @generated
	 */
	public Adapter createMDPortrayalCatalogueReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDProgressCodePropertyType <em>MD Progress Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDProgressCodePropertyType
	 * @generated
	 */
	public Adapter createMDProgressCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDRangeDimensionPropertyType <em>MD Range Dimension Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDRangeDimensionPropertyType
	 * @generated
	 */
	public Adapter createMDRangeDimensionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDRangeDimensionType <em>MD Range Dimension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDRangeDimensionType
	 * @generated
	 */
	public Adapter createMDRangeDimensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDReferenceSystemPropertyType <em>MD Reference System Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDReferenceSystemPropertyType
	 * @generated
	 */
	public Adapter createMDReferenceSystemPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDReferenceSystemType <em>MD Reference System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDReferenceSystemType
	 * @generated
	 */
	public Adapter createMDReferenceSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDRepresentativeFractionPropertyType <em>MD Representative Fraction Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDRepresentativeFractionPropertyType
	 * @generated
	 */
	public Adapter createMDRepresentativeFractionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDRepresentativeFractionType <em>MD Representative Fraction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDRepresentativeFractionType
	 * @generated
	 */
	public Adapter createMDRepresentativeFractionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDResolutionPropertyType <em>MD Resolution Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDResolutionPropertyType
	 * @generated
	 */
	public Adapter createMDResolutionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDResolutionType <em>MD Resolution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDResolutionType
	 * @generated
	 */
	public Adapter createMDResolutionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDRestrictionCodePropertyType <em>MD Restriction Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDRestrictionCodePropertyType
	 * @generated
	 */
	public Adapter createMDRestrictionCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDScopeCodePropertyType <em>MD Scope Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDScopeCodePropertyType
	 * @generated
	 */
	public Adapter createMDScopeCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDScopeDescriptionPropertyType <em>MD Scope Description Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDScopeDescriptionPropertyType
	 * @generated
	 */
	public Adapter createMDScopeDescriptionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDScopeDescriptionType <em>MD Scope Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDScopeDescriptionType
	 * @generated
	 */
	public Adapter createMDScopeDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDSecurityConstraintsPropertyType <em>MD Security Constraints Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDSecurityConstraintsPropertyType
	 * @generated
	 */
	public Adapter createMDSecurityConstraintsPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDSecurityConstraintsType <em>MD Security Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDSecurityConstraintsType
	 * @generated
	 */
	public Adapter createMDSecurityConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDServiceIdentificationPropertyType <em>MD Service Identification Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDServiceIdentificationPropertyType
	 * @generated
	 */
	public Adapter createMDServiceIdentificationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDServiceIdentificationType <em>MD Service Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDServiceIdentificationType
	 * @generated
	 */
	public Adapter createMDServiceIdentificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDSpatialRepresentationPropertyType <em>MD Spatial Representation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDSpatialRepresentationPropertyType
	 * @generated
	 */
	public Adapter createMDSpatialRepresentationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDSpatialRepresentationTypeCodePropertyType <em>MD Spatial Representation Type Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDSpatialRepresentationTypeCodePropertyType
	 * @generated
	 */
	public Adapter createMDSpatialRepresentationTypeCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDStandardOrderProcessPropertyType <em>MD Standard Order Process Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDStandardOrderProcessPropertyType
	 * @generated
	 */
	public Adapter createMDStandardOrderProcessPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDStandardOrderProcessType <em>MD Standard Order Process Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDStandardOrderProcessType
	 * @generated
	 */
	public Adapter createMDStandardOrderProcessTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDTopicCategoryCodePropertyType <em>MD Topic Category Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDTopicCategoryCodePropertyType
	 * @generated
	 */
	public Adapter createMDTopicCategoryCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDTopologyLevelCodePropertyType <em>MD Topology Level Code Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDTopologyLevelCodePropertyType
	 * @generated
	 */
	public Adapter createMDTopologyLevelCodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDUsagePropertyType <em>MD Usage Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDUsagePropertyType
	 * @generated
	 */
	public Adapter createMDUsagePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDUsageType <em>MD Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDUsageType
	 * @generated
	 */
	public Adapter createMDUsageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDVectorSpatialRepresentationPropertyType <em>MD Vector Spatial Representation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDVectorSpatialRepresentationPropertyType
	 * @generated
	 */
	public Adapter createMDVectorSpatialRepresentationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.MDVectorSpatialRepresentationType <em>MD Vector Spatial Representation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.MDVectorSpatialRepresentationType
	 * @generated
	 */
	public Adapter createMDVectorSpatialRepresentationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.PTFreeTextPropertyType <em>PT Free Text Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.PTFreeTextPropertyType
	 * @generated
	 */
	public Adapter createPTFreeTextPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.PTFreeTextType <em>PT Free Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.PTFreeTextType
	 * @generated
	 */
	public Adapter createPTFreeTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.PTLocaleContainerPropertyType <em>PT Locale Container Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.PTLocaleContainerPropertyType
	 * @generated
	 */
	public Adapter createPTLocaleContainerPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.PTLocaleContainerType <em>PT Locale Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.PTLocaleContainerType
	 * @generated
	 */
	public Adapter createPTLocaleContainerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.PTLocalePropertyType <em>PT Locale Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.PTLocalePropertyType
	 * @generated
	 */
	public Adapter createPTLocalePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.PTLocaleType <em>PT Locale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.PTLocaleType
	 * @generated
	 */
	public Adapter createPTLocaleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.RSIdentifierPropertyType <em>RS Identifier Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.RSIdentifierPropertyType
	 * @generated
	 */
	public Adapter createRSIdentifierPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.RSIdentifierType <em>RS Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.RSIdentifierType
	 * @generated
	 */
	public Adapter createRSIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.RSReferenceSystemPropertyType <em>RS Reference System Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.RSReferenceSystemPropertyType
	 * @generated
	 */
	public Adapter createRSReferenceSystemPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gmd.URLPropertyType <em>URL Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gmd.URLPropertyType
	 * @generated
	 */
	public Adapter createURLPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.AbstractObjectType <em>Abstract Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.AbstractObjectType
	 * @generated
	 */
	public Adapter createAbstractObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.ObjectReferencePropertyType <em>Object Reference Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.ObjectReferencePropertyType
	 * @generated
	 */
	public Adapter createObjectReferencePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.isotc211._2005.gco.CharacterStringPropertyType <em>Character String Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.isotc211._2005.gco.CharacterStringPropertyType
	 * @generated
	 */
	public Adapter createCharacterStringPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GMDAdapterFactory
