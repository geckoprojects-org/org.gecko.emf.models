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
package org.isotc211._2005.gmd.impl;

import java.io.IOException;

import java.net.URL;

import net.opengis.gml.gml.GMLPackage;

import net.opengis.gml.gml.impl.GMLPackageImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.isotc211._2005.gco.GCOPackage;

import org.isotc211._2005.gco.impl.GCOPackageImpl;

import org.isotc211._2005.gmd.GMDFactory;
import org.isotc211._2005.gmd.GMDPackage;

import org.isotc211._2005.gsr.GSRPackage;

import org.isotc211._2005.gsr.impl.GSRPackageImpl;

import org.isotc211._2005.gss.GSSPackage;

import org.isotc211._2005.gss.impl.GSSPackageImpl;

import org.isotc211._2005.gts.GTSPackage;

import org.isotc211._2005.gts.impl.GTSPackageImpl;

import org.w3._1999.xlink.XlinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GMDPackageImpl extends EPackageImpl implements GMDPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "gmd.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDQCompletenessTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDQElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDQLogicalConsistencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDQPositionalAccuracyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDQResultTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDQTemporalAccuracyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDQThematicAccuracyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDSAggregateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEXGeographicExtentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMDContentInformationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMDIdentificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMDSpatialRepresentationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRSReferenceSystemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciAddressPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciAddressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciCitationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciCitationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciContactPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciContactTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciDatePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciDateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciDateTypeCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciOnLineFunctionCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciOnlineResourcePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciOnlineResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciPresentationFormCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciResponsiblePartyPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciResponsiblePartyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciRoleCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciSeriesPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciSeriesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciTelephonePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ciTelephoneTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqAbsoluteExternalPositionalAccuracyPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqAbsoluteExternalPositionalAccuracyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqAccuracyOfATimeMeasurementPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqAccuracyOfATimeMeasurementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqCompletenessCommissionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqCompletenessCommissionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqCompletenessOmissionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqCompletenessOmissionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqCompletenessPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqConceptualConsistencyPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqConceptualConsistencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqConformanceResultPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqConformanceResultTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqDataQualityPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqDataQualityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqDomainConsistencyPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqDomainConsistencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqElementPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqEvaluationMethodTypeCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqFormatConsistencyPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqFormatConsistencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqGriddedDataPositionalAccuracyPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqGriddedDataPositionalAccuracyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqLogicalConsistencyPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqNonQuantitativeAttributeAccuracyPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqNonQuantitativeAttributeAccuracyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqPositionalAccuracyPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqQuantitativeAttributeAccuracyPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqQuantitativeAttributeAccuracyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqQuantitativeResultPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqQuantitativeResultTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqRelativeInternalPositionalAccuracyPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqRelativeInternalPositionalAccuracyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqResultPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqScopePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqScopeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqTemporalAccuracyPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqTemporalConsistencyPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqTemporalConsistencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqTemporalValidityPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqThematicAccuracyPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqThematicClassificationCorrectnessPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqTopologicalConsistencyPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsAggregatePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsAssociationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsAssociationTypeCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsDataSetPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsDataSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsInitiativeTypeCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exExtentPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exExtentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exGeographicExtentPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exTemporalExtentPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exTemporalExtentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exVerticalExtentPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exVerticalExtentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqTemporalValidityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqThematicClassificationCorrectnessTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dqTopologicalConsistencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsAssociationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsInitiativePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsInitiativeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsOtherAggregatePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsOtherAggregateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsPlatformPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsPlatformTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsProductionSeriesPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsProductionSeriesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsSensorPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsSensorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsSeriesPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsSeriesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsStereoMatePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsStereoMateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exBoundingPolygonPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exBoundingPolygonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exGeographicBoundingBoxPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exGeographicBoundingBoxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exGeographicDescriptionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exGeographicDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exSpatialTemporalExtentPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exSpatialTemporalExtentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liLineagePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liLineageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liProcessStepPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liProcessStepTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liSourcePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liSourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localisedCharacterStringPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localisedCharacterStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdAggregateInformationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdAggregateInformationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdApplicationSchemaInformationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdApplicationSchemaInformationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdBandPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdBandTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdBrowseGraphicPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdBrowseGraphicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdCellGeometryCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdCharacterSetCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdClassificationCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdConstraintsPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdConstraintsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdContentInformationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdCoverageContentTypeCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdCoverageDescriptionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdCoverageDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdDataIdentificationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdDataIdentificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdDatatypeCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdDigitalTransferOptionsPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdDigitalTransferOptionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdDimensionNameTypeCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdDimensionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdDimensionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdDistributionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdDistributionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdDistributionUnitsPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdDistributorPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdDistributorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdExtendedElementInformationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdExtendedElementInformationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdFeatureCatalogueDescriptionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdFeatureCatalogueDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdFormatPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdFormatTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdGeometricObjectsPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdGeometricObjectsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdGeometricObjectTypeCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdGeorectifiedPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdGeorectifiedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdGeoreferenceablePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdGeoreferenceableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdGridSpatialRepresentationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdGridSpatialRepresentationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdIdentificationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdIdentifierPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdIdentifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdImageDescriptionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdImageDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdImagingConditionCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdKeywordsPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdKeywordsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdKeywordTypeCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdLegalConstraintsPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdLegalConstraintsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdMaintenanceFrequencyCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdMaintenanceInformationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdMaintenanceInformationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdMediumFormatCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdMediumNameCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdMediumPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdMediumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdMetadataExtensionInformationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdMetadataExtensionInformationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdMetadataPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdMetadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdObligationCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdPixelOrientationCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdPortrayalCatalogueReferencePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdPortrayalCatalogueReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdProgressCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdRangeDimensionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdRangeDimensionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdReferenceSystemPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdReferenceSystemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdRepresentativeFractionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdRepresentativeFractionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdResolutionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdResolutionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdRestrictionCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdScopeCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdScopeDescriptionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdScopeDescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdSecurityConstraintsPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdSecurityConstraintsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdServiceIdentificationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdServiceIdentificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdSpatialRepresentationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdSpatialRepresentationTypeCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdStandardOrderProcessPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdStandardOrderProcessTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdTopicCategoryCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdTopologyLevelCodePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdUsagePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdUsageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdVectorSpatialRepresentationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdVectorSpatialRepresentationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptFreeTextPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptFreeTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptLocaleContainerPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptLocaleContainerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptLocalePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ptLocaleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rsIdentifierPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rsIdentifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rsReferenceSystemPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mdObligationCodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mdPixelOrientationCodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mdTopicCategoryCodeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mdObligationCodeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mdPixelOrientationCodeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mdTopicCategoryCodeTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.isotc211._2005.gmd.GMDPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GMDPackageImpl() {
		super(eNS_URI, GMDFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GMDPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static GMDPackage init() {
		if (isInited) return (GMDPackage)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGMDPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GMDPackageImpl theGMDPackage = registeredGMDPackage instanceof GMDPackageImpl ? (GMDPackageImpl)registeredGMDPackage : new GMDPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XlinkPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GMLPackage.eNS_URI);
		GMLPackageImpl theGMLPackage = (GMLPackageImpl)(registeredPackage instanceof GMLPackageImpl ? registeredPackage : GMLPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GCOPackage.eNS_URI);
		GCOPackageImpl theGCOPackage = (GCOPackageImpl)(registeredPackage instanceof GCOPackageImpl ? registeredPackage : GCOPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GTSPackage.eNS_URI);
		GTSPackageImpl theGTSPackage = (GTSPackageImpl)(registeredPackage instanceof GTSPackageImpl ? registeredPackage : GTSPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GSRPackage.eNS_URI);
		GSRPackageImpl theGSRPackage = (GSRPackageImpl)(registeredPackage instanceof GSRPackageImpl ? registeredPackage : GSRPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GSSPackage.eNS_URI);
		GSSPackageImpl theGSSPackage = (GSSPackageImpl)(registeredPackage instanceof GSSPackageImpl ? registeredPackage : GSSPackage.eINSTANCE);

		// Load packages
		theGMDPackage.loadPackage();
		theGMLPackage.loadPackage();

		// Create package meta-data objects
		theGCOPackage.createPackageContents();
		theGTSPackage.createPackageContents();
		theGSRPackage.createPackageContents();
		theGSSPackage.createPackageContents();

		// Initialize created meta-data
		theGCOPackage.initializePackageContents();
		theGTSPackage.initializePackageContents();
		theGSRPackage.initializePackageContents();
		theGSSPackage.initializePackageContents();

		// Fix loaded packages
		theGMDPackage.fixPackageContents();
		theGMLPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theGMDPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GMDPackage.eNS_URI, theGMDPackage);
		return theGMDPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractDQCompletenessType() {
		if (abstractDQCompletenessTypeEClass == null) {
			abstractDQCompletenessTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(0);
		}
		return abstractDQCompletenessTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractDQElementType() {
		if (abstractDQElementTypeEClass == null) {
			abstractDQElementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(1);
		}
		return abstractDQElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractDQElementType_NameOfMeasure() {
        return (EReference)getAbstractDQElementType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractDQElementType_MeasureIdentification() {
        return (EReference)getAbstractDQElementType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractDQElementType_MeasureDescription() {
        return (EReference)getAbstractDQElementType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractDQElementType_EvaluationMethodType() {
        return (EReference)getAbstractDQElementType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractDQElementType_EvaluationMethodDescription() {
        return (EReference)getAbstractDQElementType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractDQElementType_EvaluationProcedure() {
        return (EReference)getAbstractDQElementType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractDQElementType_DateTime() {
        return (EReference)getAbstractDQElementType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractDQElementType_Result() {
        return (EReference)getAbstractDQElementType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractDQLogicalConsistencyType() {
		if (abstractDQLogicalConsistencyTypeEClass == null) {
			abstractDQLogicalConsistencyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(2);
		}
		return abstractDQLogicalConsistencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractDQPositionalAccuracyType() {
		if (abstractDQPositionalAccuracyTypeEClass == null) {
			abstractDQPositionalAccuracyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(3);
		}
		return abstractDQPositionalAccuracyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractDQResultType() {
		if (abstractDQResultTypeEClass == null) {
			abstractDQResultTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(4);
		}
		return abstractDQResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractDQTemporalAccuracyType() {
		if (abstractDQTemporalAccuracyTypeEClass == null) {
			abstractDQTemporalAccuracyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(5);
		}
		return abstractDQTemporalAccuracyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractDQThematicAccuracyType() {
		if (abstractDQThematicAccuracyTypeEClass == null) {
			abstractDQThematicAccuracyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(6);
		}
		return abstractDQThematicAccuracyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractDSAggregateType() {
		if (abstractDSAggregateTypeEClass == null) {
			abstractDSAggregateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(7);
		}
		return abstractDSAggregateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractDSAggregateType_ComposedOf() {
        return (EReference)getAbstractDSAggregateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractDSAggregateType_SeriesMetadata() {
        return (EReference)getAbstractDSAggregateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractDSAggregateType_Subset() {
        return (EReference)getAbstractDSAggregateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractDSAggregateType_Superset() {
        return (EReference)getAbstractDSAggregateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractEXGeographicExtentType() {
		if (abstractEXGeographicExtentTypeEClass == null) {
			abstractEXGeographicExtentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(8);
		}
		return abstractEXGeographicExtentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractEXGeographicExtentType_ExtentTypeCode() {
        return (EReference)getAbstractEXGeographicExtentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMDContentInformationType() {
		if (abstractMDContentInformationTypeEClass == null) {
			abstractMDContentInformationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(9);
		}
		return abstractMDContentInformationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMDIdentificationType() {
		if (abstractMDIdentificationTypeEClass == null) {
			abstractMDIdentificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(10);
		}
		return abstractMDIdentificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMDIdentificationType_Citation() {
        return (EReference)getAbstractMDIdentificationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMDIdentificationType_Abstract() {
        return (EReference)getAbstractMDIdentificationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMDIdentificationType_Purpose() {
        return (EReference)getAbstractMDIdentificationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMDIdentificationType_Credit() {
        return (EReference)getAbstractMDIdentificationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMDIdentificationType_Status() {
        return (EReference)getAbstractMDIdentificationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMDIdentificationType_PointOfContact() {
        return (EReference)getAbstractMDIdentificationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMDIdentificationType_ResourceMaintenance() {
        return (EReference)getAbstractMDIdentificationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMDIdentificationType_GraphicOverview() {
        return (EReference)getAbstractMDIdentificationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMDIdentificationType_ResourceFormat() {
        return (EReference)getAbstractMDIdentificationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMDIdentificationType_DescriptiveKeywords() {
        return (EReference)getAbstractMDIdentificationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMDIdentificationType_ResourceSpecificUsage() {
        return (EReference)getAbstractMDIdentificationType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMDIdentificationType_ResourceConstraints() {
        return (EReference)getAbstractMDIdentificationType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMDIdentificationType_AggregationInfo() {
        return (EReference)getAbstractMDIdentificationType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMDSpatialRepresentationType() {
		if (abstractMDSpatialRepresentationTypeEClass == null) {
			abstractMDSpatialRepresentationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(11);
		}
		return abstractMDSpatialRepresentationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractRSReferenceSystemType() {
		if (abstractRSReferenceSystemTypeEClass == null) {
			abstractRSReferenceSystemTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(12);
		}
		return abstractRSReferenceSystemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractRSReferenceSystemType_Name() {
        return (EReference)getAbstractRSReferenceSystemType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractRSReferenceSystemType_DomainOfValidity() {
        return (EReference)getAbstractRSReferenceSystemType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCIAddressPropertyType() {
		if (ciAddressPropertyTypeEClass == null) {
			ciAddressPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(13);
		}
		return ciAddressPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIAddressPropertyType_CIAddress() {
        return (EReference)getCIAddressPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIAddressPropertyType_Actuate() {
        return (EAttribute)getCIAddressPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIAddressPropertyType_Arcrole() {
        return (EAttribute)getCIAddressPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIAddressPropertyType_Href() {
        return (EAttribute)getCIAddressPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIAddressPropertyType_NilReason() {
        return (EAttribute)getCIAddressPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIAddressPropertyType_Role() {
        return (EAttribute)getCIAddressPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIAddressPropertyType_Show() {
        return (EAttribute)getCIAddressPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIAddressPropertyType_Title() {
        return (EAttribute)getCIAddressPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIAddressPropertyType_Type() {
        return (EAttribute)getCIAddressPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIAddressPropertyType_Uuidref() {
        return (EAttribute)getCIAddressPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCIAddressType() {
		if (ciAddressTypeEClass == null) {
			ciAddressTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(14);
		}
		return ciAddressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIAddressType_DeliveryPoint() {
        return (EReference)getCIAddressType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIAddressType_City() {
        return (EReference)getCIAddressType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIAddressType_AdministrativeArea() {
        return (EReference)getCIAddressType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIAddressType_PostalCode() {
        return (EReference)getCIAddressType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIAddressType_Country() {
        return (EReference)getCIAddressType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIAddressType_ElectronicMailAddress() {
        return (EReference)getCIAddressType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCICitationPropertyType() {
		if (ciCitationPropertyTypeEClass == null) {
			ciCitationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(15);
		}
		return ciCitationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCICitationPropertyType_CICitation() {
        return (EReference)getCICitationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCICitationPropertyType_Actuate() {
        return (EAttribute)getCICitationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCICitationPropertyType_Arcrole() {
        return (EAttribute)getCICitationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCICitationPropertyType_Href() {
        return (EAttribute)getCICitationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCICitationPropertyType_NilReason() {
        return (EAttribute)getCICitationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCICitationPropertyType_Role() {
        return (EAttribute)getCICitationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCICitationPropertyType_Show() {
        return (EAttribute)getCICitationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCICitationPropertyType_Title() {
        return (EAttribute)getCICitationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCICitationPropertyType_Type() {
        return (EAttribute)getCICitationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCICitationPropertyType_Uuidref() {
        return (EAttribute)getCICitationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCICitationType() {
		if (ciCitationTypeEClass == null) {
			ciCitationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(16);
		}
		return ciCitationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCICitationType_Title() {
        return (EReference)getCICitationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCICitationType_AlternateTitle() {
        return (EReference)getCICitationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCICitationType_Date() {
        return (EReference)getCICitationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCICitationType_Edition() {
        return (EReference)getCICitationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCICitationType_EditionDate() {
        return (EReference)getCICitationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCICitationType_Identifier() {
        return (EReference)getCICitationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCICitationType_CitedResponsibleParty() {
        return (EReference)getCICitationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCICitationType_PresentationForm() {
        return (EReference)getCICitationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCICitationType_Series() {
        return (EReference)getCICitationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCICitationType_OtherCitationDetails() {
        return (EReference)getCICitationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCICitationType_CollectiveTitle() {
        return (EReference)getCICitationType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCICitationType_ISBN() {
        return (EReference)getCICitationType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCICitationType_ISSN() {
        return (EReference)getCICitationType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCIContactPropertyType() {
		if (ciContactPropertyTypeEClass == null) {
			ciContactPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(17);
		}
		return ciContactPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIContactPropertyType_CIContact() {
        return (EReference)getCIContactPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIContactPropertyType_Actuate() {
        return (EAttribute)getCIContactPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIContactPropertyType_Arcrole() {
        return (EAttribute)getCIContactPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIContactPropertyType_Href() {
        return (EAttribute)getCIContactPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIContactPropertyType_NilReason() {
        return (EAttribute)getCIContactPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIContactPropertyType_Role() {
        return (EAttribute)getCIContactPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIContactPropertyType_Show() {
        return (EAttribute)getCIContactPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIContactPropertyType_Title() {
        return (EAttribute)getCIContactPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIContactPropertyType_Type() {
        return (EAttribute)getCIContactPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIContactPropertyType_Uuidref() {
        return (EAttribute)getCIContactPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCIContactType() {
		if (ciContactTypeEClass == null) {
			ciContactTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(18);
		}
		return ciContactTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIContactType_Phone() {
        return (EReference)getCIContactType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIContactType_Address() {
        return (EReference)getCIContactType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIContactType_OnlineResource() {
        return (EReference)getCIContactType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIContactType_HoursOfService() {
        return (EReference)getCIContactType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIContactType_ContactInstructions() {
        return (EReference)getCIContactType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCIDatePropertyType() {
		if (ciDatePropertyTypeEClass == null) {
			ciDatePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(19);
		}
		return ciDatePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIDatePropertyType_CIDate() {
        return (EReference)getCIDatePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIDatePropertyType_Actuate() {
        return (EAttribute)getCIDatePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIDatePropertyType_Arcrole() {
        return (EAttribute)getCIDatePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIDatePropertyType_Href() {
        return (EAttribute)getCIDatePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIDatePropertyType_NilReason() {
        return (EAttribute)getCIDatePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIDatePropertyType_Role() {
        return (EAttribute)getCIDatePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIDatePropertyType_Show() {
        return (EAttribute)getCIDatePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIDatePropertyType_Title() {
        return (EAttribute)getCIDatePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIDatePropertyType_Type() {
        return (EAttribute)getCIDatePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIDatePropertyType_Uuidref() {
        return (EAttribute)getCIDatePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCIDateType() {
		if (ciDateTypeEClass == null) {
			ciDateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(20);
		}
		return ciDateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIDateType_Date() {
        return (EReference)getCIDateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIDateType_DateType() {
        return (EReference)getCIDateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCIDateTypeCodePropertyType() {
		if (ciDateTypeCodePropertyTypeEClass == null) {
			ciDateTypeCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(21);
		}
		return ciDateTypeCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIDateTypeCodePropertyType_CIDateTypeCode() {
        return (EReference)getCIDateTypeCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIDateTypeCodePropertyType_NilReason() {
        return (EAttribute)getCIDateTypeCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCIOnLineFunctionCodePropertyType() {
		if (ciOnLineFunctionCodePropertyTypeEClass == null) {
			ciOnLineFunctionCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(22);
		}
		return ciOnLineFunctionCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIOnLineFunctionCodePropertyType_CIOnLineFunctionCode() {
        return (EReference)getCIOnLineFunctionCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIOnLineFunctionCodePropertyType_NilReason() {
        return (EAttribute)getCIOnLineFunctionCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCIOnlineResourcePropertyType() {
		if (ciOnlineResourcePropertyTypeEClass == null) {
			ciOnlineResourcePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(23);
		}
		return ciOnlineResourcePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIOnlineResourcePropertyType_CIOnlineResource() {
        return (EReference)getCIOnlineResourcePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIOnlineResourcePropertyType_Actuate() {
        return (EAttribute)getCIOnlineResourcePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIOnlineResourcePropertyType_Arcrole() {
        return (EAttribute)getCIOnlineResourcePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIOnlineResourcePropertyType_Href() {
        return (EAttribute)getCIOnlineResourcePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIOnlineResourcePropertyType_NilReason() {
        return (EAttribute)getCIOnlineResourcePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIOnlineResourcePropertyType_Role() {
        return (EAttribute)getCIOnlineResourcePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIOnlineResourcePropertyType_Show() {
        return (EAttribute)getCIOnlineResourcePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIOnlineResourcePropertyType_Title() {
        return (EAttribute)getCIOnlineResourcePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIOnlineResourcePropertyType_Type() {
        return (EAttribute)getCIOnlineResourcePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIOnlineResourcePropertyType_Uuidref() {
        return (EAttribute)getCIOnlineResourcePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCIOnlineResourceType() {
		if (ciOnlineResourceTypeEClass == null) {
			ciOnlineResourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(24);
		}
		return ciOnlineResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIOnlineResourceType_Linkage() {
        return (EReference)getCIOnlineResourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIOnlineResourceType_Protocol() {
        return (EReference)getCIOnlineResourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIOnlineResourceType_ApplicationProfile() {
        return (EReference)getCIOnlineResourceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIOnlineResourceType_Name() {
        return (EReference)getCIOnlineResourceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIOnlineResourceType_Description() {
        return (EReference)getCIOnlineResourceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIOnlineResourceType_Function() {
        return (EReference)getCIOnlineResourceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCIPresentationFormCodePropertyType() {
		if (ciPresentationFormCodePropertyTypeEClass == null) {
			ciPresentationFormCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(25);
		}
		return ciPresentationFormCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIPresentationFormCodePropertyType_CIPresentationFormCode() {
        return (EReference)getCIPresentationFormCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIPresentationFormCodePropertyType_NilReason() {
        return (EAttribute)getCIPresentationFormCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCIResponsiblePartyPropertyType() {
		if (ciResponsiblePartyPropertyTypeEClass == null) {
			ciResponsiblePartyPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(26);
		}
		return ciResponsiblePartyPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIResponsiblePartyPropertyType_CIResponsibleParty() {
        return (EReference)getCIResponsiblePartyPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIResponsiblePartyPropertyType_Actuate() {
        return (EAttribute)getCIResponsiblePartyPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIResponsiblePartyPropertyType_Arcrole() {
        return (EAttribute)getCIResponsiblePartyPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIResponsiblePartyPropertyType_Href() {
        return (EAttribute)getCIResponsiblePartyPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIResponsiblePartyPropertyType_NilReason() {
        return (EAttribute)getCIResponsiblePartyPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIResponsiblePartyPropertyType_Role() {
        return (EAttribute)getCIResponsiblePartyPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIResponsiblePartyPropertyType_Show() {
        return (EAttribute)getCIResponsiblePartyPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIResponsiblePartyPropertyType_Title() {
        return (EAttribute)getCIResponsiblePartyPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIResponsiblePartyPropertyType_Type() {
        return (EAttribute)getCIResponsiblePartyPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIResponsiblePartyPropertyType_Uuidref() {
        return (EAttribute)getCIResponsiblePartyPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCIResponsiblePartyType() {
		if (ciResponsiblePartyTypeEClass == null) {
			ciResponsiblePartyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(27);
		}
		return ciResponsiblePartyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIResponsiblePartyType_IndividualName() {
        return (EReference)getCIResponsiblePartyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIResponsiblePartyType_OrganisationName() {
        return (EReference)getCIResponsiblePartyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIResponsiblePartyType_PositionName() {
        return (EReference)getCIResponsiblePartyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIResponsiblePartyType_ContactInfo() {
        return (EReference)getCIResponsiblePartyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIResponsiblePartyType_Role() {
        return (EReference)getCIResponsiblePartyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCIRoleCodePropertyType() {
		if (ciRoleCodePropertyTypeEClass == null) {
			ciRoleCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(28);
		}
		return ciRoleCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCIRoleCodePropertyType_CIRoleCode() {
        return (EReference)getCIRoleCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCIRoleCodePropertyType_NilReason() {
        return (EAttribute)getCIRoleCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCISeriesPropertyType() {
		if (ciSeriesPropertyTypeEClass == null) {
			ciSeriesPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(29);
		}
		return ciSeriesPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCISeriesPropertyType_CISeries() {
        return (EReference)getCISeriesPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCISeriesPropertyType_Actuate() {
        return (EAttribute)getCISeriesPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCISeriesPropertyType_Arcrole() {
        return (EAttribute)getCISeriesPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCISeriesPropertyType_Href() {
        return (EAttribute)getCISeriesPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCISeriesPropertyType_NilReason() {
        return (EAttribute)getCISeriesPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCISeriesPropertyType_Role() {
        return (EAttribute)getCISeriesPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCISeriesPropertyType_Show() {
        return (EAttribute)getCISeriesPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCISeriesPropertyType_Title() {
        return (EAttribute)getCISeriesPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCISeriesPropertyType_Type() {
        return (EAttribute)getCISeriesPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCISeriesPropertyType_Uuidref() {
        return (EAttribute)getCISeriesPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCISeriesType() {
		if (ciSeriesTypeEClass == null) {
			ciSeriesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(30);
		}
		return ciSeriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCISeriesType_Name() {
        return (EReference)getCISeriesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCISeriesType_IssueIdentification() {
        return (EReference)getCISeriesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCISeriesType_Page() {
        return (EReference)getCISeriesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCITelephonePropertyType() {
		if (ciTelephonePropertyTypeEClass == null) {
			ciTelephonePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(31);
		}
		return ciTelephonePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCITelephonePropertyType_CITelephone() {
        return (EReference)getCITelephonePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCITelephonePropertyType_Actuate() {
        return (EAttribute)getCITelephonePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCITelephonePropertyType_Arcrole() {
        return (EAttribute)getCITelephonePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCITelephonePropertyType_Href() {
        return (EAttribute)getCITelephonePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCITelephonePropertyType_NilReason() {
        return (EAttribute)getCITelephonePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCITelephonePropertyType_Role() {
        return (EAttribute)getCITelephonePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCITelephonePropertyType_Show() {
        return (EAttribute)getCITelephonePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCITelephonePropertyType_Title() {
        return (EAttribute)getCITelephonePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCITelephonePropertyType_Type() {
        return (EAttribute)getCITelephonePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCITelephonePropertyType_Uuidref() {
        return (EAttribute)getCITelephonePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCITelephoneType() {
		if (ciTelephoneTypeEClass == null) {
			ciTelephoneTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(32);
		}
		return ciTelephoneTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCITelephoneType_Voice() {
        return (EReference)getCITelephoneType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCITelephoneType_Facsimile() {
        return (EReference)getCITelephoneType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCountryPropertyType() {
		if (countryPropertyTypeEClass == null) {
			countryPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(33);
		}
		return countryPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountryPropertyType_Country() {
        return (EReference)getCountryPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCountryPropertyType_NilReason() {
        return (EAttribute)getCountryPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQAbsoluteExternalPositionalAccuracyPropertyType() {
		if (dqAbsoluteExternalPositionalAccuracyPropertyTypeEClass == null) {
			dqAbsoluteExternalPositionalAccuracyPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(34);
		}
		return dqAbsoluteExternalPositionalAccuracyPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQAbsoluteExternalPositionalAccuracyPropertyType_DQAbsoluteExternalPositionalAccuracy() {
        return (EReference)getDQAbsoluteExternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQAbsoluteExternalPositionalAccuracyPropertyType_Actuate() {
        return (EAttribute)getDQAbsoluteExternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQAbsoluteExternalPositionalAccuracyPropertyType_Arcrole() {
        return (EAttribute)getDQAbsoluteExternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQAbsoluteExternalPositionalAccuracyPropertyType_Href() {
        return (EAttribute)getDQAbsoluteExternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQAbsoluteExternalPositionalAccuracyPropertyType_NilReason() {
        return (EAttribute)getDQAbsoluteExternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQAbsoluteExternalPositionalAccuracyPropertyType_Role() {
        return (EAttribute)getDQAbsoluteExternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQAbsoluteExternalPositionalAccuracyPropertyType_Show() {
        return (EAttribute)getDQAbsoluteExternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQAbsoluteExternalPositionalAccuracyPropertyType_Title() {
        return (EAttribute)getDQAbsoluteExternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQAbsoluteExternalPositionalAccuracyPropertyType_Type() {
        return (EAttribute)getDQAbsoluteExternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQAbsoluteExternalPositionalAccuracyPropertyType_Uuidref() {
        return (EAttribute)getDQAbsoluteExternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQAbsoluteExternalPositionalAccuracyType() {
		if (dqAbsoluteExternalPositionalAccuracyTypeEClass == null) {
			dqAbsoluteExternalPositionalAccuracyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(35);
		}
		return dqAbsoluteExternalPositionalAccuracyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQAccuracyOfATimeMeasurementPropertyType() {
		if (dqAccuracyOfATimeMeasurementPropertyTypeEClass == null) {
			dqAccuracyOfATimeMeasurementPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(36);
		}
		return dqAccuracyOfATimeMeasurementPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQAccuracyOfATimeMeasurementPropertyType_DQAccuracyOfATimeMeasurement() {
        return (EReference)getDQAccuracyOfATimeMeasurementPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQAccuracyOfATimeMeasurementPropertyType_Actuate() {
        return (EAttribute)getDQAccuracyOfATimeMeasurementPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQAccuracyOfATimeMeasurementPropertyType_Arcrole() {
        return (EAttribute)getDQAccuracyOfATimeMeasurementPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQAccuracyOfATimeMeasurementPropertyType_Href() {
        return (EAttribute)getDQAccuracyOfATimeMeasurementPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQAccuracyOfATimeMeasurementPropertyType_NilReason() {
        return (EAttribute)getDQAccuracyOfATimeMeasurementPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQAccuracyOfATimeMeasurementPropertyType_Role() {
        return (EAttribute)getDQAccuracyOfATimeMeasurementPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQAccuracyOfATimeMeasurementPropertyType_Show() {
        return (EAttribute)getDQAccuracyOfATimeMeasurementPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQAccuracyOfATimeMeasurementPropertyType_Title() {
        return (EAttribute)getDQAccuracyOfATimeMeasurementPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQAccuracyOfATimeMeasurementPropertyType_Type() {
        return (EAttribute)getDQAccuracyOfATimeMeasurementPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQAccuracyOfATimeMeasurementPropertyType_Uuidref() {
        return (EAttribute)getDQAccuracyOfATimeMeasurementPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQAccuracyOfATimeMeasurementType() {
		if (dqAccuracyOfATimeMeasurementTypeEClass == null) {
			dqAccuracyOfATimeMeasurementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(37);
		}
		return dqAccuracyOfATimeMeasurementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQCompletenessCommissionPropertyType() {
		if (dqCompletenessCommissionPropertyTypeEClass == null) {
			dqCompletenessCommissionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(38);
		}
		return dqCompletenessCommissionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQCompletenessCommissionPropertyType_DQCompletenessCommission() {
        return (EReference)getDQCompletenessCommissionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessCommissionPropertyType_Actuate() {
        return (EAttribute)getDQCompletenessCommissionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessCommissionPropertyType_Arcrole() {
        return (EAttribute)getDQCompletenessCommissionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessCommissionPropertyType_Href() {
        return (EAttribute)getDQCompletenessCommissionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessCommissionPropertyType_NilReason() {
        return (EAttribute)getDQCompletenessCommissionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessCommissionPropertyType_Role() {
        return (EAttribute)getDQCompletenessCommissionPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessCommissionPropertyType_Show() {
        return (EAttribute)getDQCompletenessCommissionPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessCommissionPropertyType_Title() {
        return (EAttribute)getDQCompletenessCommissionPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessCommissionPropertyType_Type() {
        return (EAttribute)getDQCompletenessCommissionPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessCommissionPropertyType_Uuidref() {
        return (EAttribute)getDQCompletenessCommissionPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQCompletenessCommissionType() {
		if (dqCompletenessCommissionTypeEClass == null) {
			dqCompletenessCommissionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(39);
		}
		return dqCompletenessCommissionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQCompletenessOmissionPropertyType() {
		if (dqCompletenessOmissionPropertyTypeEClass == null) {
			dqCompletenessOmissionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(40);
		}
		return dqCompletenessOmissionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQCompletenessOmissionPropertyType_DQCompletenessOmission() {
        return (EReference)getDQCompletenessOmissionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessOmissionPropertyType_Actuate() {
        return (EAttribute)getDQCompletenessOmissionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessOmissionPropertyType_Arcrole() {
        return (EAttribute)getDQCompletenessOmissionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessOmissionPropertyType_Href() {
        return (EAttribute)getDQCompletenessOmissionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessOmissionPropertyType_NilReason() {
        return (EAttribute)getDQCompletenessOmissionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessOmissionPropertyType_Role() {
        return (EAttribute)getDQCompletenessOmissionPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessOmissionPropertyType_Show() {
        return (EAttribute)getDQCompletenessOmissionPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessOmissionPropertyType_Title() {
        return (EAttribute)getDQCompletenessOmissionPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessOmissionPropertyType_Type() {
        return (EAttribute)getDQCompletenessOmissionPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessOmissionPropertyType_Uuidref() {
        return (EAttribute)getDQCompletenessOmissionPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQCompletenessOmissionType() {
		if (dqCompletenessOmissionTypeEClass == null) {
			dqCompletenessOmissionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(41);
		}
		return dqCompletenessOmissionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQCompletenessPropertyType() {
		if (dqCompletenessPropertyTypeEClass == null) {
			dqCompletenessPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(42);
		}
		return dqCompletenessPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessPropertyType_AbstractDQCompletenessGroup() {
        return (EAttribute)getDQCompletenessPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQCompletenessPropertyType_AbstractDQCompleteness() {
        return (EReference)getDQCompletenessPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessPropertyType_Actuate() {
        return (EAttribute)getDQCompletenessPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessPropertyType_Arcrole() {
        return (EAttribute)getDQCompletenessPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessPropertyType_Href() {
        return (EAttribute)getDQCompletenessPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessPropertyType_NilReason() {
        return (EAttribute)getDQCompletenessPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessPropertyType_Role() {
        return (EAttribute)getDQCompletenessPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessPropertyType_Show() {
        return (EAttribute)getDQCompletenessPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessPropertyType_Title() {
        return (EAttribute)getDQCompletenessPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessPropertyType_Type() {
        return (EAttribute)getDQCompletenessPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQCompletenessPropertyType_Uuidref() {
        return (EAttribute)getDQCompletenessPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQConceptualConsistencyPropertyType() {
		if (dqConceptualConsistencyPropertyTypeEClass == null) {
			dqConceptualConsistencyPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(43);
		}
		return dqConceptualConsistencyPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQConceptualConsistencyPropertyType_DQConceptualConsistency() {
        return (EReference)getDQConceptualConsistencyPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQConceptualConsistencyPropertyType_Actuate() {
        return (EAttribute)getDQConceptualConsistencyPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQConceptualConsistencyPropertyType_Arcrole() {
        return (EAttribute)getDQConceptualConsistencyPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQConceptualConsistencyPropertyType_Href() {
        return (EAttribute)getDQConceptualConsistencyPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQConceptualConsistencyPropertyType_NilReason() {
        return (EAttribute)getDQConceptualConsistencyPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQConceptualConsistencyPropertyType_Role() {
        return (EAttribute)getDQConceptualConsistencyPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQConceptualConsistencyPropertyType_Show() {
        return (EAttribute)getDQConceptualConsistencyPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQConceptualConsistencyPropertyType_Title() {
        return (EAttribute)getDQConceptualConsistencyPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQConceptualConsistencyPropertyType_Type() {
        return (EAttribute)getDQConceptualConsistencyPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQConceptualConsistencyPropertyType_Uuidref() {
        return (EAttribute)getDQConceptualConsistencyPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQConceptualConsistencyType() {
		if (dqConceptualConsistencyTypeEClass == null) {
			dqConceptualConsistencyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(44);
		}
		return dqConceptualConsistencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQConformanceResultPropertyType() {
		if (dqConformanceResultPropertyTypeEClass == null) {
			dqConformanceResultPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(45);
		}
		return dqConformanceResultPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQConformanceResultPropertyType_DQConformanceResult() {
        return (EReference)getDQConformanceResultPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQConformanceResultPropertyType_Actuate() {
        return (EAttribute)getDQConformanceResultPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQConformanceResultPropertyType_Arcrole() {
        return (EAttribute)getDQConformanceResultPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQConformanceResultPropertyType_Href() {
        return (EAttribute)getDQConformanceResultPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQConformanceResultPropertyType_NilReason() {
        return (EAttribute)getDQConformanceResultPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQConformanceResultPropertyType_Role() {
        return (EAttribute)getDQConformanceResultPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQConformanceResultPropertyType_Show() {
        return (EAttribute)getDQConformanceResultPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQConformanceResultPropertyType_Title() {
        return (EAttribute)getDQConformanceResultPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQConformanceResultPropertyType_Type() {
        return (EAttribute)getDQConformanceResultPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQConformanceResultPropertyType_Uuidref() {
        return (EAttribute)getDQConformanceResultPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQConformanceResultType() {
		if (dqConformanceResultTypeEClass == null) {
			dqConformanceResultTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(46);
		}
		return dqConformanceResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQConformanceResultType_Specification() {
        return (EReference)getDQConformanceResultType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQConformanceResultType_Explanation() {
        return (EReference)getDQConformanceResultType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQConformanceResultType_Pass() {
        return (EReference)getDQConformanceResultType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQDataQualityPropertyType() {
		if (dqDataQualityPropertyTypeEClass == null) {
			dqDataQualityPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(47);
		}
		return dqDataQualityPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQDataQualityPropertyType_DQDataQuality() {
        return (EReference)getDQDataQualityPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQDataQualityPropertyType_Actuate() {
        return (EAttribute)getDQDataQualityPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQDataQualityPropertyType_Arcrole() {
        return (EAttribute)getDQDataQualityPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQDataQualityPropertyType_Href() {
        return (EAttribute)getDQDataQualityPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQDataQualityPropertyType_NilReason() {
        return (EAttribute)getDQDataQualityPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQDataQualityPropertyType_Role() {
        return (EAttribute)getDQDataQualityPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQDataQualityPropertyType_Show() {
        return (EAttribute)getDQDataQualityPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQDataQualityPropertyType_Title() {
        return (EAttribute)getDQDataQualityPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQDataQualityPropertyType_Type() {
        return (EAttribute)getDQDataQualityPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQDataQualityPropertyType_Uuidref() {
        return (EAttribute)getDQDataQualityPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQDataQualityType() {
		if (dqDataQualityTypeEClass == null) {
			dqDataQualityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(48);
		}
		return dqDataQualityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQDataQualityType_Scope() {
        return (EReference)getDQDataQualityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQDataQualityType_Report() {
        return (EReference)getDQDataQualityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQDataQualityType_Lineage() {
        return (EReference)getDQDataQualityType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQDomainConsistencyPropertyType() {
		if (dqDomainConsistencyPropertyTypeEClass == null) {
			dqDomainConsistencyPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(49);
		}
		return dqDomainConsistencyPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQDomainConsistencyPropertyType_DQDomainConsistency() {
        return (EReference)getDQDomainConsistencyPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQDomainConsistencyPropertyType_Actuate() {
        return (EAttribute)getDQDomainConsistencyPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQDomainConsistencyPropertyType_Arcrole() {
        return (EAttribute)getDQDomainConsistencyPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQDomainConsistencyPropertyType_Href() {
        return (EAttribute)getDQDomainConsistencyPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQDomainConsistencyPropertyType_NilReason() {
        return (EAttribute)getDQDomainConsistencyPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQDomainConsistencyPropertyType_Role() {
        return (EAttribute)getDQDomainConsistencyPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQDomainConsistencyPropertyType_Show() {
        return (EAttribute)getDQDomainConsistencyPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQDomainConsistencyPropertyType_Title() {
        return (EAttribute)getDQDomainConsistencyPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQDomainConsistencyPropertyType_Type() {
        return (EAttribute)getDQDomainConsistencyPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQDomainConsistencyPropertyType_Uuidref() {
        return (EAttribute)getDQDomainConsistencyPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQDomainConsistencyType() {
		if (dqDomainConsistencyTypeEClass == null) {
			dqDomainConsistencyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(50);
		}
		return dqDomainConsistencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQElementPropertyType() {
		if (dqElementPropertyTypeEClass == null) {
			dqElementPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(51);
		}
		return dqElementPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQElementPropertyType_AbstractDQElementGroup() {
        return (EAttribute)getDQElementPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQElementPropertyType_AbstractDQElement() {
        return (EReference)getDQElementPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQElementPropertyType_Actuate() {
        return (EAttribute)getDQElementPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQElementPropertyType_Arcrole() {
        return (EAttribute)getDQElementPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQElementPropertyType_Href() {
        return (EAttribute)getDQElementPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQElementPropertyType_NilReason() {
        return (EAttribute)getDQElementPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQElementPropertyType_Role() {
        return (EAttribute)getDQElementPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQElementPropertyType_Show() {
        return (EAttribute)getDQElementPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQElementPropertyType_Title() {
        return (EAttribute)getDQElementPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQElementPropertyType_Type() {
        return (EAttribute)getDQElementPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQElementPropertyType_Uuidref() {
        return (EAttribute)getDQElementPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQEvaluationMethodTypeCodePropertyType() {
		if (dqEvaluationMethodTypeCodePropertyTypeEClass == null) {
			dqEvaluationMethodTypeCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(52);
		}
		return dqEvaluationMethodTypeCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQEvaluationMethodTypeCodePropertyType_DQEvaluationMethodTypeCode() {
        return (EReference)getDQEvaluationMethodTypeCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQEvaluationMethodTypeCodePropertyType_NilReason() {
        return (EAttribute)getDQEvaluationMethodTypeCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQFormatConsistencyPropertyType() {
		if (dqFormatConsistencyPropertyTypeEClass == null) {
			dqFormatConsistencyPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(53);
		}
		return dqFormatConsistencyPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQFormatConsistencyPropertyType_DQFormatConsistency() {
        return (EReference)getDQFormatConsistencyPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQFormatConsistencyPropertyType_Actuate() {
        return (EAttribute)getDQFormatConsistencyPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQFormatConsistencyPropertyType_Arcrole() {
        return (EAttribute)getDQFormatConsistencyPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQFormatConsistencyPropertyType_Href() {
        return (EAttribute)getDQFormatConsistencyPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQFormatConsistencyPropertyType_NilReason() {
        return (EAttribute)getDQFormatConsistencyPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQFormatConsistencyPropertyType_Role() {
        return (EAttribute)getDQFormatConsistencyPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQFormatConsistencyPropertyType_Show() {
        return (EAttribute)getDQFormatConsistencyPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQFormatConsistencyPropertyType_Title() {
        return (EAttribute)getDQFormatConsistencyPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQFormatConsistencyPropertyType_Type() {
        return (EAttribute)getDQFormatConsistencyPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQFormatConsistencyPropertyType_Uuidref() {
        return (EAttribute)getDQFormatConsistencyPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQFormatConsistencyType() {
		if (dqFormatConsistencyTypeEClass == null) {
			dqFormatConsistencyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(54);
		}
		return dqFormatConsistencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQGriddedDataPositionalAccuracyPropertyType() {
		if (dqGriddedDataPositionalAccuracyPropertyTypeEClass == null) {
			dqGriddedDataPositionalAccuracyPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(55);
		}
		return dqGriddedDataPositionalAccuracyPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQGriddedDataPositionalAccuracyPropertyType_DQGriddedDataPositionalAccuracy() {
        return (EReference)getDQGriddedDataPositionalAccuracyPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQGriddedDataPositionalAccuracyPropertyType_Actuate() {
        return (EAttribute)getDQGriddedDataPositionalAccuracyPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQGriddedDataPositionalAccuracyPropertyType_Arcrole() {
        return (EAttribute)getDQGriddedDataPositionalAccuracyPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQGriddedDataPositionalAccuracyPropertyType_Href() {
        return (EAttribute)getDQGriddedDataPositionalAccuracyPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQGriddedDataPositionalAccuracyPropertyType_NilReason() {
        return (EAttribute)getDQGriddedDataPositionalAccuracyPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQGriddedDataPositionalAccuracyPropertyType_Role() {
        return (EAttribute)getDQGriddedDataPositionalAccuracyPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQGriddedDataPositionalAccuracyPropertyType_Show() {
        return (EAttribute)getDQGriddedDataPositionalAccuracyPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQGriddedDataPositionalAccuracyPropertyType_Title() {
        return (EAttribute)getDQGriddedDataPositionalAccuracyPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQGriddedDataPositionalAccuracyPropertyType_Type() {
        return (EAttribute)getDQGriddedDataPositionalAccuracyPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQGriddedDataPositionalAccuracyPropertyType_Uuidref() {
        return (EAttribute)getDQGriddedDataPositionalAccuracyPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQGriddedDataPositionalAccuracyType() {
		if (dqGriddedDataPositionalAccuracyTypeEClass == null) {
			dqGriddedDataPositionalAccuracyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(56);
		}
		return dqGriddedDataPositionalAccuracyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQLogicalConsistencyPropertyType() {
		if (dqLogicalConsistencyPropertyTypeEClass == null) {
			dqLogicalConsistencyPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(57);
		}
		return dqLogicalConsistencyPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQLogicalConsistencyPropertyType_AbstractDQLogicalConsistencyGroup() {
        return (EAttribute)getDQLogicalConsistencyPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQLogicalConsistencyPropertyType_AbstractDQLogicalConsistency() {
        return (EReference)getDQLogicalConsistencyPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQLogicalConsistencyPropertyType_Actuate() {
        return (EAttribute)getDQLogicalConsistencyPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQLogicalConsistencyPropertyType_Arcrole() {
        return (EAttribute)getDQLogicalConsistencyPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQLogicalConsistencyPropertyType_Href() {
        return (EAttribute)getDQLogicalConsistencyPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQLogicalConsistencyPropertyType_NilReason() {
        return (EAttribute)getDQLogicalConsistencyPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQLogicalConsistencyPropertyType_Role() {
        return (EAttribute)getDQLogicalConsistencyPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQLogicalConsistencyPropertyType_Show() {
        return (EAttribute)getDQLogicalConsistencyPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQLogicalConsistencyPropertyType_Title() {
        return (EAttribute)getDQLogicalConsistencyPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQLogicalConsistencyPropertyType_Type() {
        return (EAttribute)getDQLogicalConsistencyPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQLogicalConsistencyPropertyType_Uuidref() {
        return (EAttribute)getDQLogicalConsistencyPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQNonQuantitativeAttributeAccuracyPropertyType() {
		if (dqNonQuantitativeAttributeAccuracyPropertyTypeEClass == null) {
			dqNonQuantitativeAttributeAccuracyPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(58);
		}
		return dqNonQuantitativeAttributeAccuracyPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQNonQuantitativeAttributeAccuracyPropertyType_DQNonQuantitativeAttributeAccuracy() {
        return (EReference)getDQNonQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQNonQuantitativeAttributeAccuracyPropertyType_Actuate() {
        return (EAttribute)getDQNonQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQNonQuantitativeAttributeAccuracyPropertyType_Arcrole() {
        return (EAttribute)getDQNonQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQNonQuantitativeAttributeAccuracyPropertyType_Href() {
        return (EAttribute)getDQNonQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQNonQuantitativeAttributeAccuracyPropertyType_NilReason() {
        return (EAttribute)getDQNonQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQNonQuantitativeAttributeAccuracyPropertyType_Role() {
        return (EAttribute)getDQNonQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQNonQuantitativeAttributeAccuracyPropertyType_Show() {
        return (EAttribute)getDQNonQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQNonQuantitativeAttributeAccuracyPropertyType_Title() {
        return (EAttribute)getDQNonQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQNonQuantitativeAttributeAccuracyPropertyType_Type() {
        return (EAttribute)getDQNonQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQNonQuantitativeAttributeAccuracyPropertyType_Uuidref() {
        return (EAttribute)getDQNonQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQNonQuantitativeAttributeAccuracyType() {
		if (dqNonQuantitativeAttributeAccuracyTypeEClass == null) {
			dqNonQuantitativeAttributeAccuracyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(59);
		}
		return dqNonQuantitativeAttributeAccuracyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQPositionalAccuracyPropertyType() {
		if (dqPositionalAccuracyPropertyTypeEClass == null) {
			dqPositionalAccuracyPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(60);
		}
		return dqPositionalAccuracyPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQPositionalAccuracyPropertyType_AbstractDQPositionalAccuracyGroup() {
        return (EAttribute)getDQPositionalAccuracyPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQPositionalAccuracyPropertyType_AbstractDQPositionalAccuracy() {
        return (EReference)getDQPositionalAccuracyPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQPositionalAccuracyPropertyType_Actuate() {
        return (EAttribute)getDQPositionalAccuracyPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQPositionalAccuracyPropertyType_Arcrole() {
        return (EAttribute)getDQPositionalAccuracyPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQPositionalAccuracyPropertyType_Href() {
        return (EAttribute)getDQPositionalAccuracyPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQPositionalAccuracyPropertyType_NilReason() {
        return (EAttribute)getDQPositionalAccuracyPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQPositionalAccuracyPropertyType_Role() {
        return (EAttribute)getDQPositionalAccuracyPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQPositionalAccuracyPropertyType_Show() {
        return (EAttribute)getDQPositionalAccuracyPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQPositionalAccuracyPropertyType_Title() {
        return (EAttribute)getDQPositionalAccuracyPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQPositionalAccuracyPropertyType_Type() {
        return (EAttribute)getDQPositionalAccuracyPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQPositionalAccuracyPropertyType_Uuidref() {
        return (EAttribute)getDQPositionalAccuracyPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQQuantitativeAttributeAccuracyPropertyType() {
		if (dqQuantitativeAttributeAccuracyPropertyTypeEClass == null) {
			dqQuantitativeAttributeAccuracyPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(61);
		}
		return dqQuantitativeAttributeAccuracyPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQQuantitativeAttributeAccuracyPropertyType_DQQuantitativeAttributeAccuracy() {
        return (EReference)getDQQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQQuantitativeAttributeAccuracyPropertyType_Actuate() {
        return (EAttribute)getDQQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQQuantitativeAttributeAccuracyPropertyType_Arcrole() {
        return (EAttribute)getDQQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQQuantitativeAttributeAccuracyPropertyType_Href() {
        return (EAttribute)getDQQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQQuantitativeAttributeAccuracyPropertyType_NilReason() {
        return (EAttribute)getDQQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQQuantitativeAttributeAccuracyPropertyType_Role() {
        return (EAttribute)getDQQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQQuantitativeAttributeAccuracyPropertyType_Show() {
        return (EAttribute)getDQQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQQuantitativeAttributeAccuracyPropertyType_Title() {
        return (EAttribute)getDQQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQQuantitativeAttributeAccuracyPropertyType_Type() {
        return (EAttribute)getDQQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQQuantitativeAttributeAccuracyPropertyType_Uuidref() {
        return (EAttribute)getDQQuantitativeAttributeAccuracyPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQQuantitativeAttributeAccuracyType() {
		if (dqQuantitativeAttributeAccuracyTypeEClass == null) {
			dqQuantitativeAttributeAccuracyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(62);
		}
		return dqQuantitativeAttributeAccuracyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQQuantitativeResultPropertyType() {
		if (dqQuantitativeResultPropertyTypeEClass == null) {
			dqQuantitativeResultPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(63);
		}
		return dqQuantitativeResultPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQQuantitativeResultPropertyType_DQQuantitativeResult() {
        return (EReference)getDQQuantitativeResultPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQQuantitativeResultPropertyType_Actuate() {
        return (EAttribute)getDQQuantitativeResultPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQQuantitativeResultPropertyType_Arcrole() {
        return (EAttribute)getDQQuantitativeResultPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQQuantitativeResultPropertyType_Href() {
        return (EAttribute)getDQQuantitativeResultPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQQuantitativeResultPropertyType_NilReason() {
        return (EAttribute)getDQQuantitativeResultPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQQuantitativeResultPropertyType_Role() {
        return (EAttribute)getDQQuantitativeResultPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQQuantitativeResultPropertyType_Show() {
        return (EAttribute)getDQQuantitativeResultPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQQuantitativeResultPropertyType_Title() {
        return (EAttribute)getDQQuantitativeResultPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQQuantitativeResultPropertyType_Type() {
        return (EAttribute)getDQQuantitativeResultPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQQuantitativeResultPropertyType_Uuidref() {
        return (EAttribute)getDQQuantitativeResultPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQQuantitativeResultType() {
		if (dqQuantitativeResultTypeEClass == null) {
			dqQuantitativeResultTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(64);
		}
		return dqQuantitativeResultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQQuantitativeResultType_ValueType() {
        return (EReference)getDQQuantitativeResultType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQQuantitativeResultType_ValueUnit() {
        return (EReference)getDQQuantitativeResultType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQQuantitativeResultType_ErrorStatistic() {
        return (EReference)getDQQuantitativeResultType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQQuantitativeResultType_Value() {
        return (EReference)getDQQuantitativeResultType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQRelativeInternalPositionalAccuracyPropertyType() {
		if (dqRelativeInternalPositionalAccuracyPropertyTypeEClass == null) {
			dqRelativeInternalPositionalAccuracyPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(65);
		}
		return dqRelativeInternalPositionalAccuracyPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQRelativeInternalPositionalAccuracyPropertyType_DQRelativeInternalPositionalAccuracy() {
        return (EReference)getDQRelativeInternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQRelativeInternalPositionalAccuracyPropertyType_Actuate() {
        return (EAttribute)getDQRelativeInternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQRelativeInternalPositionalAccuracyPropertyType_Arcrole() {
        return (EAttribute)getDQRelativeInternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQRelativeInternalPositionalAccuracyPropertyType_Href() {
        return (EAttribute)getDQRelativeInternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQRelativeInternalPositionalAccuracyPropertyType_NilReason() {
        return (EAttribute)getDQRelativeInternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQRelativeInternalPositionalAccuracyPropertyType_Role() {
        return (EAttribute)getDQRelativeInternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQRelativeInternalPositionalAccuracyPropertyType_Show() {
        return (EAttribute)getDQRelativeInternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQRelativeInternalPositionalAccuracyPropertyType_Title() {
        return (EAttribute)getDQRelativeInternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQRelativeInternalPositionalAccuracyPropertyType_Type() {
        return (EAttribute)getDQRelativeInternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQRelativeInternalPositionalAccuracyPropertyType_Uuidref() {
        return (EAttribute)getDQRelativeInternalPositionalAccuracyPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQRelativeInternalPositionalAccuracyType() {
		if (dqRelativeInternalPositionalAccuracyTypeEClass == null) {
			dqRelativeInternalPositionalAccuracyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(66);
		}
		return dqRelativeInternalPositionalAccuracyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQResultPropertyType() {
		if (dqResultPropertyTypeEClass == null) {
			dqResultPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(67);
		}
		return dqResultPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQResultPropertyType_AbstractDQResultGroup() {
        return (EAttribute)getDQResultPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQResultPropertyType_AbstractDQResult() {
        return (EReference)getDQResultPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQResultPropertyType_Actuate() {
        return (EAttribute)getDQResultPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQResultPropertyType_Arcrole() {
        return (EAttribute)getDQResultPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQResultPropertyType_Href() {
        return (EAttribute)getDQResultPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQResultPropertyType_NilReason() {
        return (EAttribute)getDQResultPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQResultPropertyType_Role() {
        return (EAttribute)getDQResultPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQResultPropertyType_Show() {
        return (EAttribute)getDQResultPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQResultPropertyType_Title() {
        return (EAttribute)getDQResultPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQResultPropertyType_Type() {
        return (EAttribute)getDQResultPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQResultPropertyType_Uuidref() {
        return (EAttribute)getDQResultPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQScopePropertyType() {
		if (dqScopePropertyTypeEClass == null) {
			dqScopePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(68);
		}
		return dqScopePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQScopePropertyType_DQScope() {
        return (EReference)getDQScopePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQScopePropertyType_Actuate() {
        return (EAttribute)getDQScopePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQScopePropertyType_Arcrole() {
        return (EAttribute)getDQScopePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQScopePropertyType_Href() {
        return (EAttribute)getDQScopePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQScopePropertyType_NilReason() {
        return (EAttribute)getDQScopePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQScopePropertyType_Role() {
        return (EAttribute)getDQScopePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQScopePropertyType_Show() {
        return (EAttribute)getDQScopePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQScopePropertyType_Title() {
        return (EAttribute)getDQScopePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQScopePropertyType_Type() {
        return (EAttribute)getDQScopePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQScopePropertyType_Uuidref() {
        return (EAttribute)getDQScopePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQScopeType() {
		if (dqScopeTypeEClass == null) {
			dqScopeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(69);
		}
		return dqScopeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQScopeType_Level() {
        return (EReference)getDQScopeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQScopeType_Extent() {
        return (EReference)getDQScopeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQScopeType_LevelDescription() {
        return (EReference)getDQScopeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQTemporalAccuracyPropertyType() {
		if (dqTemporalAccuracyPropertyTypeEClass == null) {
			dqTemporalAccuracyPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(70);
		}
		return dqTemporalAccuracyPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalAccuracyPropertyType_AbstractDQTemporalAccuracyGroup() {
        return (EAttribute)getDQTemporalAccuracyPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQTemporalAccuracyPropertyType_AbstractDQTemporalAccuracy() {
        return (EReference)getDQTemporalAccuracyPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalAccuracyPropertyType_Actuate() {
        return (EAttribute)getDQTemporalAccuracyPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalAccuracyPropertyType_Arcrole() {
        return (EAttribute)getDQTemporalAccuracyPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalAccuracyPropertyType_Href() {
        return (EAttribute)getDQTemporalAccuracyPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalAccuracyPropertyType_NilReason() {
        return (EAttribute)getDQTemporalAccuracyPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalAccuracyPropertyType_Role() {
        return (EAttribute)getDQTemporalAccuracyPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalAccuracyPropertyType_Show() {
        return (EAttribute)getDQTemporalAccuracyPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalAccuracyPropertyType_Title() {
        return (EAttribute)getDQTemporalAccuracyPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalAccuracyPropertyType_Type() {
        return (EAttribute)getDQTemporalAccuracyPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalAccuracyPropertyType_Uuidref() {
        return (EAttribute)getDQTemporalAccuracyPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQTemporalConsistencyPropertyType() {
		if (dqTemporalConsistencyPropertyTypeEClass == null) {
			dqTemporalConsistencyPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(71);
		}
		return dqTemporalConsistencyPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQTemporalConsistencyPropertyType_DQTemporalConsistency() {
        return (EReference)getDQTemporalConsistencyPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalConsistencyPropertyType_Actuate() {
        return (EAttribute)getDQTemporalConsistencyPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalConsistencyPropertyType_Arcrole() {
        return (EAttribute)getDQTemporalConsistencyPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalConsistencyPropertyType_Href() {
        return (EAttribute)getDQTemporalConsistencyPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalConsistencyPropertyType_NilReason() {
        return (EAttribute)getDQTemporalConsistencyPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalConsistencyPropertyType_Role() {
        return (EAttribute)getDQTemporalConsistencyPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalConsistencyPropertyType_Show() {
        return (EAttribute)getDQTemporalConsistencyPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalConsistencyPropertyType_Title() {
        return (EAttribute)getDQTemporalConsistencyPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalConsistencyPropertyType_Type() {
        return (EAttribute)getDQTemporalConsistencyPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalConsistencyPropertyType_Uuidref() {
        return (EAttribute)getDQTemporalConsistencyPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQTemporalConsistencyType() {
		if (dqTemporalConsistencyTypeEClass == null) {
			dqTemporalConsistencyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(72);
		}
		return dqTemporalConsistencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQTemporalValidityPropertyType() {
		if (dqTemporalValidityPropertyTypeEClass == null) {
			dqTemporalValidityPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(73);
		}
		return dqTemporalValidityPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQTemporalValidityPropertyType_DQTemporalValidity() {
        return (EReference)getDQTemporalValidityPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalValidityPropertyType_Actuate() {
        return (EAttribute)getDQTemporalValidityPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalValidityPropertyType_Arcrole() {
        return (EAttribute)getDQTemporalValidityPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalValidityPropertyType_Href() {
        return (EAttribute)getDQTemporalValidityPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalValidityPropertyType_NilReason() {
        return (EAttribute)getDQTemporalValidityPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalValidityPropertyType_Role() {
        return (EAttribute)getDQTemporalValidityPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalValidityPropertyType_Show() {
        return (EAttribute)getDQTemporalValidityPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalValidityPropertyType_Title() {
        return (EAttribute)getDQTemporalValidityPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalValidityPropertyType_Type() {
        return (EAttribute)getDQTemporalValidityPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTemporalValidityPropertyType_Uuidref() {
        return (EAttribute)getDQTemporalValidityPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQThematicAccuracyPropertyType() {
		if (dqThematicAccuracyPropertyTypeEClass == null) {
			dqThematicAccuracyPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(74);
		}
		return dqThematicAccuracyPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQThematicAccuracyPropertyType_AbstractDQThematicAccuracyGroup() {
        return (EAttribute)getDQThematicAccuracyPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQThematicAccuracyPropertyType_AbstractDQThematicAccuracy() {
        return (EReference)getDQThematicAccuracyPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQThematicAccuracyPropertyType_Actuate() {
        return (EAttribute)getDQThematicAccuracyPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQThematicAccuracyPropertyType_Arcrole() {
        return (EAttribute)getDQThematicAccuracyPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQThematicAccuracyPropertyType_Href() {
        return (EAttribute)getDQThematicAccuracyPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQThematicAccuracyPropertyType_NilReason() {
        return (EAttribute)getDQThematicAccuracyPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQThematicAccuracyPropertyType_Role() {
        return (EAttribute)getDQThematicAccuracyPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQThematicAccuracyPropertyType_Show() {
        return (EAttribute)getDQThematicAccuracyPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQThematicAccuracyPropertyType_Title() {
        return (EAttribute)getDQThematicAccuracyPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQThematicAccuracyPropertyType_Type() {
        return (EAttribute)getDQThematicAccuracyPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQThematicAccuracyPropertyType_Uuidref() {
        return (EAttribute)getDQThematicAccuracyPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQThematicClassificationCorrectnessPropertyType() {
		if (dqThematicClassificationCorrectnessPropertyTypeEClass == null) {
			dqThematicClassificationCorrectnessPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(75);
		}
		return dqThematicClassificationCorrectnessPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQThematicClassificationCorrectnessPropertyType_DQThematicClassificationCorrectness() {
        return (EReference)getDQThematicClassificationCorrectnessPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQThematicClassificationCorrectnessPropertyType_Actuate() {
        return (EAttribute)getDQThematicClassificationCorrectnessPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQThematicClassificationCorrectnessPropertyType_Arcrole() {
        return (EAttribute)getDQThematicClassificationCorrectnessPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQThematicClassificationCorrectnessPropertyType_Href() {
        return (EAttribute)getDQThematicClassificationCorrectnessPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQThematicClassificationCorrectnessPropertyType_NilReason() {
        return (EAttribute)getDQThematicClassificationCorrectnessPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQThematicClassificationCorrectnessPropertyType_Role() {
        return (EAttribute)getDQThematicClassificationCorrectnessPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQThematicClassificationCorrectnessPropertyType_Show() {
        return (EAttribute)getDQThematicClassificationCorrectnessPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQThematicClassificationCorrectnessPropertyType_Title() {
        return (EAttribute)getDQThematicClassificationCorrectnessPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQThematicClassificationCorrectnessPropertyType_Type() {
        return (EAttribute)getDQThematicClassificationCorrectnessPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQThematicClassificationCorrectnessPropertyType_Uuidref() {
        return (EAttribute)getDQThematicClassificationCorrectnessPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQTopologicalConsistencyPropertyType() {
		if (dqTopologicalConsistencyPropertyTypeEClass == null) {
			dqTopologicalConsistencyPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(76);
		}
		return dqTopologicalConsistencyPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDQTopologicalConsistencyPropertyType_DQTopologicalConsistency() {
        return (EReference)getDQTopologicalConsistencyPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTopologicalConsistencyPropertyType_Actuate() {
        return (EAttribute)getDQTopologicalConsistencyPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTopologicalConsistencyPropertyType_Arcrole() {
        return (EAttribute)getDQTopologicalConsistencyPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTopologicalConsistencyPropertyType_Href() {
        return (EAttribute)getDQTopologicalConsistencyPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTopologicalConsistencyPropertyType_NilReason() {
        return (EAttribute)getDQTopologicalConsistencyPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTopologicalConsistencyPropertyType_Role() {
        return (EAttribute)getDQTopologicalConsistencyPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTopologicalConsistencyPropertyType_Show() {
        return (EAttribute)getDQTopologicalConsistencyPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTopologicalConsistencyPropertyType_Title() {
        return (EAttribute)getDQTopologicalConsistencyPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTopologicalConsistencyPropertyType_Type() {
        return (EAttribute)getDQTopologicalConsistencyPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDQTopologicalConsistencyPropertyType_Uuidref() {
        return (EAttribute)getDQTopologicalConsistencyPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSAggregatePropertyType() {
		if (dsAggregatePropertyTypeEClass == null) {
			dsAggregatePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(77);
		}
		return dsAggregatePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAggregatePropertyType_AbstractDSAggregateGroup() {
        return (EAttribute)getDSAggregatePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDSAggregatePropertyType_AbstractDSAggregate() {
        return (EReference)getDSAggregatePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAggregatePropertyType_Actuate() {
        return (EAttribute)getDSAggregatePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAggregatePropertyType_Arcrole() {
        return (EAttribute)getDSAggregatePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAggregatePropertyType_Href() {
        return (EAttribute)getDSAggregatePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAggregatePropertyType_NilReason() {
        return (EAttribute)getDSAggregatePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAggregatePropertyType_Role() {
        return (EAttribute)getDSAggregatePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAggregatePropertyType_Show() {
        return (EAttribute)getDSAggregatePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAggregatePropertyType_Title() {
        return (EAttribute)getDSAggregatePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAggregatePropertyType_Type() {
        return (EAttribute)getDSAggregatePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAggregatePropertyType_Uuidref() {
        return (EAttribute)getDSAggregatePropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSAssociationPropertyType() {
		if (dsAssociationPropertyTypeEClass == null) {
			dsAssociationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(78);
		}
		return dsAssociationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDSAssociationPropertyType_DSAssociation() {
        return (EReference)getDSAssociationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAssociationPropertyType_Actuate() {
        return (EAttribute)getDSAssociationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAssociationPropertyType_Arcrole() {
        return (EAttribute)getDSAssociationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAssociationPropertyType_Href() {
        return (EAttribute)getDSAssociationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAssociationPropertyType_NilReason() {
        return (EAttribute)getDSAssociationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAssociationPropertyType_Role() {
        return (EAttribute)getDSAssociationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAssociationPropertyType_Show() {
        return (EAttribute)getDSAssociationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAssociationPropertyType_Title() {
        return (EAttribute)getDSAssociationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAssociationPropertyType_Type() {
        return (EAttribute)getDSAssociationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAssociationPropertyType_Uuidref() {
        return (EAttribute)getDSAssociationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSAssociationTypeCodePropertyType() {
		if (dsAssociationTypeCodePropertyTypeEClass == null) {
			dsAssociationTypeCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(79);
		}
		return dsAssociationTypeCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDSAssociationTypeCodePropertyType_DSAssociationTypeCode() {
        return (EReference)getDSAssociationTypeCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSAssociationTypeCodePropertyType_NilReason() {
        return (EAttribute)getDSAssociationTypeCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSDataSetPropertyType() {
		if (dsDataSetPropertyTypeEClass == null) {
			dsDataSetPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(80);
		}
		return dsDataSetPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDSDataSetPropertyType_DSDataSet() {
        return (EReference)getDSDataSetPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSDataSetPropertyType_Actuate() {
        return (EAttribute)getDSDataSetPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSDataSetPropertyType_Arcrole() {
        return (EAttribute)getDSDataSetPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSDataSetPropertyType_Href() {
        return (EAttribute)getDSDataSetPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSDataSetPropertyType_NilReason() {
        return (EAttribute)getDSDataSetPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSDataSetPropertyType_Role() {
        return (EAttribute)getDSDataSetPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSDataSetPropertyType_Show() {
        return (EAttribute)getDSDataSetPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSDataSetPropertyType_Title() {
        return (EAttribute)getDSDataSetPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSDataSetPropertyType_Type() {
        return (EAttribute)getDSDataSetPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSDataSetPropertyType_Uuidref() {
        return (EAttribute)getDSDataSetPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSDataSetType() {
		if (dsDataSetTypeEClass == null) {
			dsDataSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(81);
		}
		return dsDataSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDSDataSetType_Has() {
        return (EReference)getDSDataSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDSDataSetType_PartOf() {
        return (EReference)getDSDataSetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSInitiativeTypeCodePropertyType() {
		if (dsInitiativeTypeCodePropertyTypeEClass == null) {
			dsInitiativeTypeCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(82);
		}
		return dsInitiativeTypeCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDSInitiativeTypeCodePropertyType_DSInitiativeTypeCode() {
        return (EReference)getDSInitiativeTypeCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSInitiativeTypeCodePropertyType_NilReason() {
        return (EAttribute)getDSInitiativeTypeCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEXExtentPropertyType() {
		if (exExtentPropertyTypeEClass == null) {
			exExtentPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(83);
		}
		return exExtentPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXExtentPropertyType_EXExtent() {
        return (EReference)getEXExtentPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXExtentPropertyType_Actuate() {
        return (EAttribute)getEXExtentPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXExtentPropertyType_Arcrole() {
        return (EAttribute)getEXExtentPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXExtentPropertyType_Href() {
        return (EAttribute)getEXExtentPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXExtentPropertyType_NilReason() {
        return (EAttribute)getEXExtentPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXExtentPropertyType_Role() {
        return (EAttribute)getEXExtentPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXExtentPropertyType_Show() {
        return (EAttribute)getEXExtentPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXExtentPropertyType_Title() {
        return (EAttribute)getEXExtentPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXExtentPropertyType_Type() {
        return (EAttribute)getEXExtentPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXExtentPropertyType_Uuidref() {
        return (EAttribute)getEXExtentPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEXExtentType() {
		if (exExtentTypeEClass == null) {
			exExtentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(84);
		}
		return exExtentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXExtentType_Description() {
        return (EReference)getEXExtentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXExtentType_GeographicElement() {
        return (EReference)getEXExtentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXExtentType_TemporalElement() {
        return (EReference)getEXExtentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXExtentType_VerticalElement() {
        return (EReference)getEXExtentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEXGeographicExtentPropertyType() {
		if (exGeographicExtentPropertyTypeEClass == null) {
			exGeographicExtentPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(85);
		}
		return exGeographicExtentPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicExtentPropertyType_AbstractEXGeographicExtentGroup() {
        return (EAttribute)getEXGeographicExtentPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXGeographicExtentPropertyType_AbstractEXGeographicExtent() {
        return (EReference)getEXGeographicExtentPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicExtentPropertyType_Actuate() {
        return (EAttribute)getEXGeographicExtentPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicExtentPropertyType_Arcrole() {
        return (EAttribute)getEXGeographicExtentPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicExtentPropertyType_Href() {
        return (EAttribute)getEXGeographicExtentPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicExtentPropertyType_NilReason() {
        return (EAttribute)getEXGeographicExtentPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicExtentPropertyType_Role() {
        return (EAttribute)getEXGeographicExtentPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicExtentPropertyType_Show() {
        return (EAttribute)getEXGeographicExtentPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicExtentPropertyType_Title() {
        return (EAttribute)getEXGeographicExtentPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicExtentPropertyType_Type() {
        return (EAttribute)getEXGeographicExtentPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicExtentPropertyType_Uuidref() {
        return (EAttribute)getEXGeographicExtentPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEXTemporalExtentPropertyType() {
		if (exTemporalExtentPropertyTypeEClass == null) {
			exTemporalExtentPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(86);
		}
		return exTemporalExtentPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXTemporalExtentPropertyType_EXTemporalExtentGroup() {
        return (EAttribute)getEXTemporalExtentPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXTemporalExtentPropertyType_EXTemporalExtent() {
        return (EReference)getEXTemporalExtentPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXTemporalExtentPropertyType_Actuate() {
        return (EAttribute)getEXTemporalExtentPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXTemporalExtentPropertyType_Arcrole() {
        return (EAttribute)getEXTemporalExtentPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXTemporalExtentPropertyType_Href() {
        return (EAttribute)getEXTemporalExtentPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXTemporalExtentPropertyType_NilReason() {
        return (EAttribute)getEXTemporalExtentPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXTemporalExtentPropertyType_Role() {
        return (EAttribute)getEXTemporalExtentPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXTemporalExtentPropertyType_Show() {
        return (EAttribute)getEXTemporalExtentPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXTemporalExtentPropertyType_Title() {
        return (EAttribute)getEXTemporalExtentPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXTemporalExtentPropertyType_Type() {
        return (EAttribute)getEXTemporalExtentPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXTemporalExtentPropertyType_Uuidref() {
        return (EAttribute)getEXTemporalExtentPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEXTemporalExtentType() {
		if (exTemporalExtentTypeEClass == null) {
			exTemporalExtentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(87);
		}
		return exTemporalExtentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXTemporalExtentType_Extent() {
        return (EReference)getEXTemporalExtentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEXVerticalExtentPropertyType() {
		if (exVerticalExtentPropertyTypeEClass == null) {
			exVerticalExtentPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(88);
		}
		return exVerticalExtentPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXVerticalExtentPropertyType_EXVerticalExtent() {
        return (EReference)getEXVerticalExtentPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXVerticalExtentPropertyType_Actuate() {
        return (EAttribute)getEXVerticalExtentPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXVerticalExtentPropertyType_Arcrole() {
        return (EAttribute)getEXVerticalExtentPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXVerticalExtentPropertyType_Href() {
        return (EAttribute)getEXVerticalExtentPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXVerticalExtentPropertyType_NilReason() {
        return (EAttribute)getEXVerticalExtentPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXVerticalExtentPropertyType_Role() {
        return (EAttribute)getEXVerticalExtentPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXVerticalExtentPropertyType_Show() {
        return (EAttribute)getEXVerticalExtentPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXVerticalExtentPropertyType_Title() {
        return (EAttribute)getEXVerticalExtentPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXVerticalExtentPropertyType_Type() {
        return (EAttribute)getEXVerticalExtentPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXVerticalExtentPropertyType_Uuidref() {
        return (EAttribute)getEXVerticalExtentPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEXVerticalExtentType() {
		if (exVerticalExtentTypeEClass == null) {
			exVerticalExtentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(89);
		}
		return exVerticalExtentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXVerticalExtentType_MinimumValue() {
        return (EReference)getEXVerticalExtentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXVerticalExtentType_MaximumValue() {
        return (EReference)getEXVerticalExtentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXVerticalExtentType_VerticalCRS() {
        return (EReference)getEXVerticalExtentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(90);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AbstractDQCompleteness() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AbstractDQElement() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AbstractDQLogicalConsistency() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AbstractDQPositionalAccuracy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AbstractDQResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AbstractDQTemporalAccuracy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AbstractDQThematicAccuracy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AbstractDSAggregate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AbstractEXGeographicExtent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AbstractMDContentInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AbstractMDIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AbstractMDSpatialRepresentation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AbstractRSReferenceSystem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CIAddress() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CICitation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CIContact() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CIDate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CIDateTypeCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CIOnLineFunctionCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CIOnlineResource() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CIPresentationFormCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CIResponsibleParty() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CIRoleCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CISeries() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CITelephone() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Country() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQAbsoluteExternalPositionalAccuracy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQAccuracyOfATimeMeasurement() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQCompletenessCommission() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQCompletenessOmission() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQConceptualConsistency() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQConformanceResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQDataQuality() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQDomainConsistency() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQEvaluationMethodTypeCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQFormatConsistency() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQGriddedDataPositionalAccuracy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQNonQuantitativeAttributeAccuracy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQQuantitativeAttributeAccuracy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQQuantitativeResult() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQRelativeInternalPositionalAccuracy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQScope() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQTemporalConsistency() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQTemporalValidity() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQThematicClassificationCorrectness() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DQTopologicalConsistency() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DSAssociation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DSAssociationTypeCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DSDataSet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DSInitiative() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DSInitiativeTypeCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DSOtherAggregate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DSPlatform() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DSSeries() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DSProductionSeries() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DSSensor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DSStereoMate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_EXBoundingPolygon() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_EXExtent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_EXGeographicBoundingBox() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_EXGeographicDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_EXSpatialTemporalExtent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_EXTemporalExtent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_EXVerticalExtent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LanguageCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LILineage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LIProcessStep() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LISource() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LocalisedCharacterString() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDAggregateInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDApplicationSchemaInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDBand() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDRangeDimension() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDBrowseGraphic() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDCellGeometryCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDCharacterSetCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDClassificationCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDConstraints() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDCoverageContentTypeCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDCoverageDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDDataIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDDatatypeCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDDigitalTransferOptions() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDDimension() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDDimensionNameTypeCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDDistribution() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDDistributionUnits() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDDistributor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDExtendedElementInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDFeatureCatalogueDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDFormat() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDGeometricObjects() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDGeometricObjectTypeCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDGeorectified() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDGridSpatialRepresentation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDGeoreferenceable() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDIdentifier() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDImageDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDImagingConditionCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDKeywords() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDKeywordTypeCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDLegalConstraints() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDMaintenanceFrequencyCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDMaintenanceInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDMedium() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDMediumFormatCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDMediumNameCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDMetadata() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDMetadataExtensionInformation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_MDObligationCode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_MDPixelOrientationCode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDPortrayalCatalogueReference() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDProgressCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDReferenceSystem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDRepresentativeFraction() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDResolution() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDRestrictionCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDScopeCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDScopeDescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDSecurityConstraints() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDServiceIdentification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDSpatialRepresentationTypeCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDStandardOrderProcess() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_MDTopicCategoryCode() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDTopologyLevelCode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDUsage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MDVectorSpatialRepresentation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PTFreeText() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PTLocale() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PTLocaleContainer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_RSIdentifier() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_URL() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQTemporalValidityType() {
		if (dqTemporalValidityTypeEClass == null) {
			dqTemporalValidityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(91);
		}
		return dqTemporalValidityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQThematicClassificationCorrectnessType() {
		if (dqThematicClassificationCorrectnessTypeEClass == null) {
			dqThematicClassificationCorrectnessTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(92);
		}
		return dqThematicClassificationCorrectnessTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDQTopologicalConsistencyType() {
		if (dqTopologicalConsistencyTypeEClass == null) {
			dqTopologicalConsistencyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(93);
		}
		return dqTopologicalConsistencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSAssociationType() {
		if (dsAssociationTypeEClass == null) {
			dsAssociationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(94);
		}
		return dsAssociationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSInitiativePropertyType() {
		if (dsInitiativePropertyTypeEClass == null) {
			dsInitiativePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(95);
		}
		return dsInitiativePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDSInitiativePropertyType_DSInitiative() {
        return (EReference)getDSInitiativePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSInitiativePropertyType_Actuate() {
        return (EAttribute)getDSInitiativePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSInitiativePropertyType_Arcrole() {
        return (EAttribute)getDSInitiativePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSInitiativePropertyType_Href() {
        return (EAttribute)getDSInitiativePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSInitiativePropertyType_NilReason() {
        return (EAttribute)getDSInitiativePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSInitiativePropertyType_Role() {
        return (EAttribute)getDSInitiativePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSInitiativePropertyType_Show() {
        return (EAttribute)getDSInitiativePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSInitiativePropertyType_Title() {
        return (EAttribute)getDSInitiativePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSInitiativePropertyType_Type() {
        return (EAttribute)getDSInitiativePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSInitiativePropertyType_Uuidref() {
        return (EAttribute)getDSInitiativePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSInitiativeType() {
		if (dsInitiativeTypeEClass == null) {
			dsInitiativeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(96);
		}
		return dsInitiativeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSOtherAggregatePropertyType() {
		if (dsOtherAggregatePropertyTypeEClass == null) {
			dsOtherAggregatePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(97);
		}
		return dsOtherAggregatePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSOtherAggregatePropertyType_DSOtherAggregateGroup() {
        return (EAttribute)getDSOtherAggregatePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDSOtherAggregatePropertyType_DSOtherAggregate() {
        return (EReference)getDSOtherAggregatePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSOtherAggregatePropertyType_Actuate() {
        return (EAttribute)getDSOtherAggregatePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSOtherAggregatePropertyType_Arcrole() {
        return (EAttribute)getDSOtherAggregatePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSOtherAggregatePropertyType_Href() {
        return (EAttribute)getDSOtherAggregatePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSOtherAggregatePropertyType_NilReason() {
        return (EAttribute)getDSOtherAggregatePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSOtherAggregatePropertyType_Role() {
        return (EAttribute)getDSOtherAggregatePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSOtherAggregatePropertyType_Show() {
        return (EAttribute)getDSOtherAggregatePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSOtherAggregatePropertyType_Title() {
        return (EAttribute)getDSOtherAggregatePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSOtherAggregatePropertyType_Type() {
        return (EAttribute)getDSOtherAggregatePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSOtherAggregatePropertyType_Uuidref() {
        return (EAttribute)getDSOtherAggregatePropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSOtherAggregateType() {
		if (dsOtherAggregateTypeEClass == null) {
			dsOtherAggregateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(98);
		}
		return dsOtherAggregateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSPlatformPropertyType() {
		if (dsPlatformPropertyTypeEClass == null) {
			dsPlatformPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(99);
		}
		return dsPlatformPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDSPlatformPropertyType_DSPlatform() {
        return (EReference)getDSPlatformPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSPlatformPropertyType_Actuate() {
        return (EAttribute)getDSPlatformPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSPlatformPropertyType_Arcrole() {
        return (EAttribute)getDSPlatformPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSPlatformPropertyType_Href() {
        return (EAttribute)getDSPlatformPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSPlatformPropertyType_NilReason() {
        return (EAttribute)getDSPlatformPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSPlatformPropertyType_Role() {
        return (EAttribute)getDSPlatformPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSPlatformPropertyType_Show() {
        return (EAttribute)getDSPlatformPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSPlatformPropertyType_Title() {
        return (EAttribute)getDSPlatformPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSPlatformPropertyType_Type() {
        return (EAttribute)getDSPlatformPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSPlatformPropertyType_Uuidref() {
        return (EAttribute)getDSPlatformPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSPlatformType() {
		if (dsPlatformTypeEClass == null) {
			dsPlatformTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(100);
		}
		return dsPlatformTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSProductionSeriesPropertyType() {
		if (dsProductionSeriesPropertyTypeEClass == null) {
			dsProductionSeriesPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(101);
		}
		return dsProductionSeriesPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDSProductionSeriesPropertyType_DSProductionSeries() {
        return (EReference)getDSProductionSeriesPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSProductionSeriesPropertyType_Actuate() {
        return (EAttribute)getDSProductionSeriesPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSProductionSeriesPropertyType_Arcrole() {
        return (EAttribute)getDSProductionSeriesPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSProductionSeriesPropertyType_Href() {
        return (EAttribute)getDSProductionSeriesPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSProductionSeriesPropertyType_NilReason() {
        return (EAttribute)getDSProductionSeriesPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSProductionSeriesPropertyType_Role() {
        return (EAttribute)getDSProductionSeriesPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSProductionSeriesPropertyType_Show() {
        return (EAttribute)getDSProductionSeriesPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSProductionSeriesPropertyType_Title() {
        return (EAttribute)getDSProductionSeriesPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSProductionSeriesPropertyType_Type() {
        return (EAttribute)getDSProductionSeriesPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSProductionSeriesPropertyType_Uuidref() {
        return (EAttribute)getDSProductionSeriesPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSProductionSeriesType() {
		if (dsProductionSeriesTypeEClass == null) {
			dsProductionSeriesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(102);
		}
		return dsProductionSeriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSSensorPropertyType() {
		if (dsSensorPropertyTypeEClass == null) {
			dsSensorPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(103);
		}
		return dsSensorPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDSSensorPropertyType_DSSensor() {
        return (EReference)getDSSensorPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSSensorPropertyType_Actuate() {
        return (EAttribute)getDSSensorPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSSensorPropertyType_Arcrole() {
        return (EAttribute)getDSSensorPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSSensorPropertyType_Href() {
        return (EAttribute)getDSSensorPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSSensorPropertyType_NilReason() {
        return (EAttribute)getDSSensorPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSSensorPropertyType_Role() {
        return (EAttribute)getDSSensorPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSSensorPropertyType_Show() {
        return (EAttribute)getDSSensorPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSSensorPropertyType_Title() {
        return (EAttribute)getDSSensorPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSSensorPropertyType_Type() {
        return (EAttribute)getDSSensorPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSSensorPropertyType_Uuidref() {
        return (EAttribute)getDSSensorPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSSensorType() {
		if (dsSensorTypeEClass == null) {
			dsSensorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(104);
		}
		return dsSensorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSSeriesPropertyType() {
		if (dsSeriesPropertyTypeEClass == null) {
			dsSeriesPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(105);
		}
		return dsSeriesPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSSeriesPropertyType_DSSeriesGroup() {
        return (EAttribute)getDSSeriesPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDSSeriesPropertyType_DSSeries() {
        return (EReference)getDSSeriesPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSSeriesPropertyType_Actuate() {
        return (EAttribute)getDSSeriesPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSSeriesPropertyType_Arcrole() {
        return (EAttribute)getDSSeriesPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSSeriesPropertyType_Href() {
        return (EAttribute)getDSSeriesPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSSeriesPropertyType_NilReason() {
        return (EAttribute)getDSSeriesPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSSeriesPropertyType_Role() {
        return (EAttribute)getDSSeriesPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSSeriesPropertyType_Show() {
        return (EAttribute)getDSSeriesPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSSeriesPropertyType_Title() {
        return (EAttribute)getDSSeriesPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSSeriesPropertyType_Type() {
        return (EAttribute)getDSSeriesPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSSeriesPropertyType_Uuidref() {
        return (EAttribute)getDSSeriesPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSSeriesType() {
		if (dsSeriesTypeEClass == null) {
			dsSeriesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(106);
		}
		return dsSeriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSStereoMatePropertyType() {
		if (dsStereoMatePropertyTypeEClass == null) {
			dsStereoMatePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(107);
		}
		return dsStereoMatePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDSStereoMatePropertyType_DSStereoMate() {
        return (EReference)getDSStereoMatePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSStereoMatePropertyType_Actuate() {
        return (EAttribute)getDSStereoMatePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSStereoMatePropertyType_Arcrole() {
        return (EAttribute)getDSStereoMatePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSStereoMatePropertyType_Href() {
        return (EAttribute)getDSStereoMatePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSStereoMatePropertyType_NilReason() {
        return (EAttribute)getDSStereoMatePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSStereoMatePropertyType_Role() {
        return (EAttribute)getDSStereoMatePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSStereoMatePropertyType_Show() {
        return (EAttribute)getDSStereoMatePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSStereoMatePropertyType_Title() {
        return (EAttribute)getDSStereoMatePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSStereoMatePropertyType_Type() {
        return (EAttribute)getDSStereoMatePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDSStereoMatePropertyType_Uuidref() {
        return (EAttribute)getDSStereoMatePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSStereoMateType() {
		if (dsStereoMateTypeEClass == null) {
			dsStereoMateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(108);
		}
		return dsStereoMateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEXBoundingPolygonPropertyType() {
		if (exBoundingPolygonPropertyTypeEClass == null) {
			exBoundingPolygonPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(109);
		}
		return exBoundingPolygonPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXBoundingPolygonPropertyType_EXBoundingPolygon() {
        return (EReference)getEXBoundingPolygonPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXBoundingPolygonPropertyType_Actuate() {
        return (EAttribute)getEXBoundingPolygonPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXBoundingPolygonPropertyType_Arcrole() {
        return (EAttribute)getEXBoundingPolygonPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXBoundingPolygonPropertyType_Href() {
        return (EAttribute)getEXBoundingPolygonPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXBoundingPolygonPropertyType_NilReason() {
        return (EAttribute)getEXBoundingPolygonPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXBoundingPolygonPropertyType_Role() {
        return (EAttribute)getEXBoundingPolygonPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXBoundingPolygonPropertyType_Show() {
        return (EAttribute)getEXBoundingPolygonPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXBoundingPolygonPropertyType_Title() {
        return (EAttribute)getEXBoundingPolygonPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXBoundingPolygonPropertyType_Type() {
        return (EAttribute)getEXBoundingPolygonPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXBoundingPolygonPropertyType_Uuidref() {
        return (EAttribute)getEXBoundingPolygonPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEXBoundingPolygonType() {
		if (exBoundingPolygonTypeEClass == null) {
			exBoundingPolygonTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(110);
		}
		return exBoundingPolygonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXBoundingPolygonType_Polygon() {
        return (EReference)getEXBoundingPolygonType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEXGeographicBoundingBoxPropertyType() {
		if (exGeographicBoundingBoxPropertyTypeEClass == null) {
			exGeographicBoundingBoxPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(111);
		}
		return exGeographicBoundingBoxPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXGeographicBoundingBoxPropertyType_EXGeographicBoundingBox() {
        return (EReference)getEXGeographicBoundingBoxPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicBoundingBoxPropertyType_Actuate() {
        return (EAttribute)getEXGeographicBoundingBoxPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicBoundingBoxPropertyType_Arcrole() {
        return (EAttribute)getEXGeographicBoundingBoxPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicBoundingBoxPropertyType_Href() {
        return (EAttribute)getEXGeographicBoundingBoxPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicBoundingBoxPropertyType_NilReason() {
        return (EAttribute)getEXGeographicBoundingBoxPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicBoundingBoxPropertyType_Role() {
        return (EAttribute)getEXGeographicBoundingBoxPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicBoundingBoxPropertyType_Show() {
        return (EAttribute)getEXGeographicBoundingBoxPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicBoundingBoxPropertyType_Title() {
        return (EAttribute)getEXGeographicBoundingBoxPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicBoundingBoxPropertyType_Type() {
        return (EAttribute)getEXGeographicBoundingBoxPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicBoundingBoxPropertyType_Uuidref() {
        return (EAttribute)getEXGeographicBoundingBoxPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEXGeographicBoundingBoxType() {
		if (exGeographicBoundingBoxTypeEClass == null) {
			exGeographicBoundingBoxTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(112);
		}
		return exGeographicBoundingBoxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXGeographicBoundingBoxType_WestBoundLongitude() {
        return (EReference)getEXGeographicBoundingBoxType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXGeographicBoundingBoxType_EastBoundLongitude() {
        return (EReference)getEXGeographicBoundingBoxType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXGeographicBoundingBoxType_SouthBoundLatitude() {
        return (EReference)getEXGeographicBoundingBoxType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXGeographicBoundingBoxType_NorthBoundLatitude() {
        return (EReference)getEXGeographicBoundingBoxType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEXGeographicDescriptionPropertyType() {
		if (exGeographicDescriptionPropertyTypeEClass == null) {
			exGeographicDescriptionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(113);
		}
		return exGeographicDescriptionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXGeographicDescriptionPropertyType_EXGeographicDescription() {
        return (EReference)getEXGeographicDescriptionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicDescriptionPropertyType_Actuate() {
        return (EAttribute)getEXGeographicDescriptionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicDescriptionPropertyType_Arcrole() {
        return (EAttribute)getEXGeographicDescriptionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicDescriptionPropertyType_Href() {
        return (EAttribute)getEXGeographicDescriptionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicDescriptionPropertyType_NilReason() {
        return (EAttribute)getEXGeographicDescriptionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicDescriptionPropertyType_Role() {
        return (EAttribute)getEXGeographicDescriptionPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicDescriptionPropertyType_Show() {
        return (EAttribute)getEXGeographicDescriptionPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicDescriptionPropertyType_Title() {
        return (EAttribute)getEXGeographicDescriptionPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicDescriptionPropertyType_Type() {
        return (EAttribute)getEXGeographicDescriptionPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXGeographicDescriptionPropertyType_Uuidref() {
        return (EAttribute)getEXGeographicDescriptionPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEXGeographicDescriptionType() {
		if (exGeographicDescriptionTypeEClass == null) {
			exGeographicDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(114);
		}
		return exGeographicDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXGeographicDescriptionType_GeographicIdentifier() {
        return (EReference)getEXGeographicDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEXSpatialTemporalExtentPropertyType() {
		if (exSpatialTemporalExtentPropertyTypeEClass == null) {
			exSpatialTemporalExtentPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(115);
		}
		return exSpatialTemporalExtentPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXSpatialTemporalExtentPropertyType_EXSpatialTemporalExtent() {
        return (EReference)getEXSpatialTemporalExtentPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXSpatialTemporalExtentPropertyType_Actuate() {
        return (EAttribute)getEXSpatialTemporalExtentPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXSpatialTemporalExtentPropertyType_Arcrole() {
        return (EAttribute)getEXSpatialTemporalExtentPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXSpatialTemporalExtentPropertyType_Href() {
        return (EAttribute)getEXSpatialTemporalExtentPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXSpatialTemporalExtentPropertyType_NilReason() {
        return (EAttribute)getEXSpatialTemporalExtentPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXSpatialTemporalExtentPropertyType_Role() {
        return (EAttribute)getEXSpatialTemporalExtentPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXSpatialTemporalExtentPropertyType_Show() {
        return (EAttribute)getEXSpatialTemporalExtentPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXSpatialTemporalExtentPropertyType_Title() {
        return (EAttribute)getEXSpatialTemporalExtentPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXSpatialTemporalExtentPropertyType_Type() {
        return (EAttribute)getEXSpatialTemporalExtentPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEXSpatialTemporalExtentPropertyType_Uuidref() {
        return (EAttribute)getEXSpatialTemporalExtentPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEXSpatialTemporalExtentType() {
		if (exSpatialTemporalExtentTypeEClass == null) {
			exSpatialTemporalExtentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(116);
		}
		return exSpatialTemporalExtentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEXSpatialTemporalExtentType_SpatialExtent() {
        return (EReference)getEXSpatialTemporalExtentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLanguageCodePropertyType() {
		if (languageCodePropertyTypeEClass == null) {
			languageCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(117);
		}
		return languageCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLanguageCodePropertyType_LanguageCode() {
        return (EReference)getLanguageCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLanguageCodePropertyType_NilReason() {
        return (EAttribute)getLanguageCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLILineagePropertyType() {
		if (liLineagePropertyTypeEClass == null) {
			liLineagePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(118);
		}
		return liLineagePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLILineagePropertyType_LILineage() {
        return (EReference)getLILineagePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLILineagePropertyType_Actuate() {
        return (EAttribute)getLILineagePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLILineagePropertyType_Arcrole() {
        return (EAttribute)getLILineagePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLILineagePropertyType_Href() {
        return (EAttribute)getLILineagePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLILineagePropertyType_NilReason() {
        return (EAttribute)getLILineagePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLILineagePropertyType_Role() {
        return (EAttribute)getLILineagePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLILineagePropertyType_Show() {
        return (EAttribute)getLILineagePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLILineagePropertyType_Title() {
        return (EAttribute)getLILineagePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLILineagePropertyType_Type() {
        return (EAttribute)getLILineagePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLILineagePropertyType_Uuidref() {
        return (EAttribute)getLILineagePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLILineageType() {
		if (liLineageTypeEClass == null) {
			liLineageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(119);
		}
		return liLineageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLILineageType_Statement() {
        return (EReference)getLILineageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLILineageType_ProcessStep() {
        return (EReference)getLILineageType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLILineageType_Source() {
        return (EReference)getLILineageType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLIProcessStepPropertyType() {
		if (liProcessStepPropertyTypeEClass == null) {
			liProcessStepPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(120);
		}
		return liProcessStepPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLIProcessStepPropertyType_LIProcessStep() {
        return (EReference)getLIProcessStepPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLIProcessStepPropertyType_Actuate() {
        return (EAttribute)getLIProcessStepPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLIProcessStepPropertyType_Arcrole() {
        return (EAttribute)getLIProcessStepPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLIProcessStepPropertyType_Href() {
        return (EAttribute)getLIProcessStepPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLIProcessStepPropertyType_NilReason() {
        return (EAttribute)getLIProcessStepPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLIProcessStepPropertyType_Role() {
        return (EAttribute)getLIProcessStepPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLIProcessStepPropertyType_Show() {
        return (EAttribute)getLIProcessStepPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLIProcessStepPropertyType_Title() {
        return (EAttribute)getLIProcessStepPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLIProcessStepPropertyType_Type() {
        return (EAttribute)getLIProcessStepPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLIProcessStepPropertyType_Uuidref() {
        return (EAttribute)getLIProcessStepPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLIProcessStepType() {
		if (liProcessStepTypeEClass == null) {
			liProcessStepTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(121);
		}
		return liProcessStepTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLIProcessStepType_Description() {
        return (EReference)getLIProcessStepType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLIProcessStepType_Rationale() {
        return (EReference)getLIProcessStepType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLIProcessStepType_DateTime() {
        return (EReference)getLIProcessStepType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLIProcessStepType_Processor() {
        return (EReference)getLIProcessStepType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLIProcessStepType_Source() {
        return (EReference)getLIProcessStepType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLISourcePropertyType() {
		if (liSourcePropertyTypeEClass == null) {
			liSourcePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(122);
		}
		return liSourcePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLISourcePropertyType_LISource() {
        return (EReference)getLISourcePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLISourcePropertyType_Actuate() {
        return (EAttribute)getLISourcePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLISourcePropertyType_Arcrole() {
        return (EAttribute)getLISourcePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLISourcePropertyType_Href() {
        return (EAttribute)getLISourcePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLISourcePropertyType_NilReason() {
        return (EAttribute)getLISourcePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLISourcePropertyType_Role() {
        return (EAttribute)getLISourcePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLISourcePropertyType_Show() {
        return (EAttribute)getLISourcePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLISourcePropertyType_Title() {
        return (EAttribute)getLISourcePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLISourcePropertyType_Type() {
        return (EAttribute)getLISourcePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLISourcePropertyType_Uuidref() {
        return (EAttribute)getLISourcePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLISourceType() {
		if (liSourceTypeEClass == null) {
			liSourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(123);
		}
		return liSourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLISourceType_Description() {
        return (EReference)getLISourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLISourceType_ScaleDenominator() {
        return (EReference)getLISourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLISourceType_SourceReferenceSystem() {
        return (EReference)getLISourceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLISourceType_SourceCitation() {
        return (EReference)getLISourceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLISourceType_SourceExtent() {
        return (EReference)getLISourceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLISourceType_SourceStep() {
        return (EReference)getLISourceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalisedCharacterStringPropertyType() {
		if (localisedCharacterStringPropertyTypeEClass == null) {
			localisedCharacterStringPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(124);
		}
		return localisedCharacterStringPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalisedCharacterStringPropertyType_LocalisedCharacterString() {
        return (EReference)getLocalisedCharacterStringPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalisedCharacterStringType() {
		if (localisedCharacterStringTypeEClass == null) {
			localisedCharacterStringTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(125);
		}
		return localisedCharacterStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalisedCharacterStringType_Value() {
        return (EAttribute)getLocalisedCharacterStringType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalisedCharacterStringType_Id() {
        return (EAttribute)getLocalisedCharacterStringType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalisedCharacterStringType_Locale() {
        return (EAttribute)getLocalisedCharacterStringType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDAggregateInformationPropertyType() {
		if (mdAggregateInformationPropertyTypeEClass == null) {
			mdAggregateInformationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(126);
		}
		return mdAggregateInformationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDAggregateInformationPropertyType_MDAggregateInformation() {
        return (EReference)getMDAggregateInformationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDAggregateInformationPropertyType_Actuate() {
        return (EAttribute)getMDAggregateInformationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDAggregateInformationPropertyType_Arcrole() {
        return (EAttribute)getMDAggregateInformationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDAggregateInformationPropertyType_Href() {
        return (EAttribute)getMDAggregateInformationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDAggregateInformationPropertyType_NilReason() {
        return (EAttribute)getMDAggregateInformationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDAggregateInformationPropertyType_Role() {
        return (EAttribute)getMDAggregateInformationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDAggregateInformationPropertyType_Show() {
        return (EAttribute)getMDAggregateInformationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDAggregateInformationPropertyType_Title() {
        return (EAttribute)getMDAggregateInformationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDAggregateInformationPropertyType_Type() {
        return (EAttribute)getMDAggregateInformationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDAggregateInformationPropertyType_Uuidref() {
        return (EAttribute)getMDAggregateInformationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDAggregateInformationType() {
		if (mdAggregateInformationTypeEClass == null) {
			mdAggregateInformationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(127);
		}
		return mdAggregateInformationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDAggregateInformationType_AggregateDataSetName() {
        return (EReference)getMDAggregateInformationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDAggregateInformationType_AggregateDataSetIdentifier() {
        return (EReference)getMDAggregateInformationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDAggregateInformationType_AssociationType() {
        return (EReference)getMDAggregateInformationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDAggregateInformationType_InitiativeType() {
        return (EReference)getMDAggregateInformationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDApplicationSchemaInformationPropertyType() {
		if (mdApplicationSchemaInformationPropertyTypeEClass == null) {
			mdApplicationSchemaInformationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(128);
		}
		return mdApplicationSchemaInformationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDApplicationSchemaInformationPropertyType_MDApplicationSchemaInformation() {
        return (EReference)getMDApplicationSchemaInformationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDApplicationSchemaInformationPropertyType_Actuate() {
        return (EAttribute)getMDApplicationSchemaInformationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDApplicationSchemaInformationPropertyType_Arcrole() {
        return (EAttribute)getMDApplicationSchemaInformationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDApplicationSchemaInformationPropertyType_Href() {
        return (EAttribute)getMDApplicationSchemaInformationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDApplicationSchemaInformationPropertyType_NilReason() {
        return (EAttribute)getMDApplicationSchemaInformationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDApplicationSchemaInformationPropertyType_Role() {
        return (EAttribute)getMDApplicationSchemaInformationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDApplicationSchemaInformationPropertyType_Show() {
        return (EAttribute)getMDApplicationSchemaInformationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDApplicationSchemaInformationPropertyType_Title() {
        return (EAttribute)getMDApplicationSchemaInformationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDApplicationSchemaInformationPropertyType_Type() {
        return (EAttribute)getMDApplicationSchemaInformationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDApplicationSchemaInformationPropertyType_Uuidref() {
        return (EAttribute)getMDApplicationSchemaInformationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDApplicationSchemaInformationType() {
		if (mdApplicationSchemaInformationTypeEClass == null) {
			mdApplicationSchemaInformationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(129);
		}
		return mdApplicationSchemaInformationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDApplicationSchemaInformationType_Name() {
        return (EReference)getMDApplicationSchemaInformationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDApplicationSchemaInformationType_SchemaLanguage() {
        return (EReference)getMDApplicationSchemaInformationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDApplicationSchemaInformationType_ConstraintLanguage() {
        return (EReference)getMDApplicationSchemaInformationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDApplicationSchemaInformationType_SchemaAscii() {
        return (EReference)getMDApplicationSchemaInformationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDApplicationSchemaInformationType_GraphicsFile() {
        return (EReference)getMDApplicationSchemaInformationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDApplicationSchemaInformationType_SoftwareDevelopmentFile() {
        return (EReference)getMDApplicationSchemaInformationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDApplicationSchemaInformationType_SoftwareDevelopmentFileFormat() {
        return (EReference)getMDApplicationSchemaInformationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDBandPropertyType() {
		if (mdBandPropertyTypeEClass == null) {
			mdBandPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(130);
		}
		return mdBandPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDBandPropertyType_MDBand() {
        return (EReference)getMDBandPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDBandPropertyType_Actuate() {
        return (EAttribute)getMDBandPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDBandPropertyType_Arcrole() {
        return (EAttribute)getMDBandPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDBandPropertyType_Href() {
        return (EAttribute)getMDBandPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDBandPropertyType_NilReason() {
        return (EAttribute)getMDBandPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDBandPropertyType_Role() {
        return (EAttribute)getMDBandPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDBandPropertyType_Show() {
        return (EAttribute)getMDBandPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDBandPropertyType_Title() {
        return (EAttribute)getMDBandPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDBandPropertyType_Type() {
        return (EAttribute)getMDBandPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDBandPropertyType_Uuidref() {
        return (EAttribute)getMDBandPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDBandType() {
		if (mdBandTypeEClass == null) {
			mdBandTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(131);
		}
		return mdBandTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDBandType_MaxValue() {
        return (EReference)getMDBandType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDBandType_MinValue() {
        return (EReference)getMDBandType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDBandType_Units() {
        return (EReference)getMDBandType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDBandType_PeakResponse() {
        return (EReference)getMDBandType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDBandType_BitsPerValue() {
        return (EReference)getMDBandType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDBandType_ToneGradation() {
        return (EReference)getMDBandType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDBandType_ScaleFactor() {
        return (EReference)getMDBandType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDBandType_Offset() {
        return (EReference)getMDBandType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDBrowseGraphicPropertyType() {
		if (mdBrowseGraphicPropertyTypeEClass == null) {
			mdBrowseGraphicPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(132);
		}
		return mdBrowseGraphicPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDBrowseGraphicPropertyType_MDBrowseGraphic() {
        return (EReference)getMDBrowseGraphicPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDBrowseGraphicPropertyType_Actuate() {
        return (EAttribute)getMDBrowseGraphicPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDBrowseGraphicPropertyType_Arcrole() {
        return (EAttribute)getMDBrowseGraphicPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDBrowseGraphicPropertyType_Href() {
        return (EAttribute)getMDBrowseGraphicPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDBrowseGraphicPropertyType_NilReason() {
        return (EAttribute)getMDBrowseGraphicPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDBrowseGraphicPropertyType_Role() {
        return (EAttribute)getMDBrowseGraphicPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDBrowseGraphicPropertyType_Show() {
        return (EAttribute)getMDBrowseGraphicPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDBrowseGraphicPropertyType_Title() {
        return (EAttribute)getMDBrowseGraphicPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDBrowseGraphicPropertyType_Type() {
        return (EAttribute)getMDBrowseGraphicPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDBrowseGraphicPropertyType_Uuidref() {
        return (EAttribute)getMDBrowseGraphicPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDBrowseGraphicType() {
		if (mdBrowseGraphicTypeEClass == null) {
			mdBrowseGraphicTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(133);
		}
		return mdBrowseGraphicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDBrowseGraphicType_FileName() {
        return (EReference)getMDBrowseGraphicType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDBrowseGraphicType_FileDescription() {
        return (EReference)getMDBrowseGraphicType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDBrowseGraphicType_FileType() {
        return (EReference)getMDBrowseGraphicType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDCellGeometryCodePropertyType() {
		if (mdCellGeometryCodePropertyTypeEClass == null) {
			mdCellGeometryCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(134);
		}
		return mdCellGeometryCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDCellGeometryCodePropertyType_MDCellGeometryCode() {
        return (EReference)getMDCellGeometryCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDCellGeometryCodePropertyType_NilReason() {
        return (EAttribute)getMDCellGeometryCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDCharacterSetCodePropertyType() {
		if (mdCharacterSetCodePropertyTypeEClass == null) {
			mdCharacterSetCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(135);
		}
		return mdCharacterSetCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDCharacterSetCodePropertyType_MDCharacterSetCode() {
        return (EReference)getMDCharacterSetCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDCharacterSetCodePropertyType_NilReason() {
        return (EAttribute)getMDCharacterSetCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDClassificationCodePropertyType() {
		if (mdClassificationCodePropertyTypeEClass == null) {
			mdClassificationCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(136);
		}
		return mdClassificationCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDClassificationCodePropertyType_MDClassificationCode() {
        return (EReference)getMDClassificationCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDClassificationCodePropertyType_NilReason() {
        return (EAttribute)getMDClassificationCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDConstraintsPropertyType() {
		if (mdConstraintsPropertyTypeEClass == null) {
			mdConstraintsPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(137);
		}
		return mdConstraintsPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDConstraintsPropertyType_MDConstraintsGroup() {
        return (EAttribute)getMDConstraintsPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDConstraintsPropertyType_MDConstraints() {
        return (EReference)getMDConstraintsPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDConstraintsPropertyType_Actuate() {
        return (EAttribute)getMDConstraintsPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDConstraintsPropertyType_Arcrole() {
        return (EAttribute)getMDConstraintsPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDConstraintsPropertyType_Href() {
        return (EAttribute)getMDConstraintsPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDConstraintsPropertyType_NilReason() {
        return (EAttribute)getMDConstraintsPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDConstraintsPropertyType_Role() {
        return (EAttribute)getMDConstraintsPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDConstraintsPropertyType_Show() {
        return (EAttribute)getMDConstraintsPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDConstraintsPropertyType_Title() {
        return (EAttribute)getMDConstraintsPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDConstraintsPropertyType_Type() {
        return (EAttribute)getMDConstraintsPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDConstraintsPropertyType_Uuidref() {
        return (EAttribute)getMDConstraintsPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDConstraintsType() {
		if (mdConstraintsTypeEClass == null) {
			mdConstraintsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(138);
		}
		return mdConstraintsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDConstraintsType_UseLimitation() {
        return (EReference)getMDConstraintsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDContentInformationPropertyType() {
		if (mdContentInformationPropertyTypeEClass == null) {
			mdContentInformationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(139);
		}
		return mdContentInformationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDContentInformationPropertyType_AbstractMDContentInformationGroup() {
        return (EAttribute)getMDContentInformationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDContentInformationPropertyType_AbstractMDContentInformation() {
        return (EReference)getMDContentInformationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDContentInformationPropertyType_Actuate() {
        return (EAttribute)getMDContentInformationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDContentInformationPropertyType_Arcrole() {
        return (EAttribute)getMDContentInformationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDContentInformationPropertyType_Href() {
        return (EAttribute)getMDContentInformationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDContentInformationPropertyType_NilReason() {
        return (EAttribute)getMDContentInformationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDContentInformationPropertyType_Role() {
        return (EAttribute)getMDContentInformationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDContentInformationPropertyType_Show() {
        return (EAttribute)getMDContentInformationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDContentInformationPropertyType_Title() {
        return (EAttribute)getMDContentInformationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDContentInformationPropertyType_Type() {
        return (EAttribute)getMDContentInformationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDContentInformationPropertyType_Uuidref() {
        return (EAttribute)getMDContentInformationPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDCoverageContentTypeCodePropertyType() {
		if (mdCoverageContentTypeCodePropertyTypeEClass == null) {
			mdCoverageContentTypeCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(140);
		}
		return mdCoverageContentTypeCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDCoverageContentTypeCodePropertyType_MDCoverageContentTypeCode() {
        return (EReference)getMDCoverageContentTypeCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDCoverageContentTypeCodePropertyType_NilReason() {
        return (EAttribute)getMDCoverageContentTypeCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDCoverageDescriptionPropertyType() {
		if (mdCoverageDescriptionPropertyTypeEClass == null) {
			mdCoverageDescriptionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(141);
		}
		return mdCoverageDescriptionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDCoverageDescriptionPropertyType_MDCoverageDescriptionGroup() {
        return (EAttribute)getMDCoverageDescriptionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDCoverageDescriptionPropertyType_MDCoverageDescription() {
        return (EReference)getMDCoverageDescriptionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDCoverageDescriptionPropertyType_Actuate() {
        return (EAttribute)getMDCoverageDescriptionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDCoverageDescriptionPropertyType_Arcrole() {
        return (EAttribute)getMDCoverageDescriptionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDCoverageDescriptionPropertyType_Href() {
        return (EAttribute)getMDCoverageDescriptionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDCoverageDescriptionPropertyType_NilReason() {
        return (EAttribute)getMDCoverageDescriptionPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDCoverageDescriptionPropertyType_Role() {
        return (EAttribute)getMDCoverageDescriptionPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDCoverageDescriptionPropertyType_Show() {
        return (EAttribute)getMDCoverageDescriptionPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDCoverageDescriptionPropertyType_Title() {
        return (EAttribute)getMDCoverageDescriptionPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDCoverageDescriptionPropertyType_Type() {
        return (EAttribute)getMDCoverageDescriptionPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDCoverageDescriptionPropertyType_Uuidref() {
        return (EAttribute)getMDCoverageDescriptionPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDCoverageDescriptionType() {
		if (mdCoverageDescriptionTypeEClass == null) {
			mdCoverageDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(142);
		}
		return mdCoverageDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDCoverageDescriptionType_AttributeDescription() {
        return (EReference)getMDCoverageDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDCoverageDescriptionType_ContentType() {
        return (EReference)getMDCoverageDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDCoverageDescriptionType_Dimension() {
        return (EReference)getMDCoverageDescriptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDDataIdentificationPropertyType() {
		if (mdDataIdentificationPropertyTypeEClass == null) {
			mdDataIdentificationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(143);
		}
		return mdDataIdentificationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDataIdentificationPropertyType_MDDataIdentification() {
        return (EReference)getMDDataIdentificationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDataIdentificationPropertyType_Actuate() {
        return (EAttribute)getMDDataIdentificationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDataIdentificationPropertyType_Arcrole() {
        return (EAttribute)getMDDataIdentificationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDataIdentificationPropertyType_Href() {
        return (EAttribute)getMDDataIdentificationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDataIdentificationPropertyType_NilReason() {
        return (EAttribute)getMDDataIdentificationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDataIdentificationPropertyType_Role() {
        return (EAttribute)getMDDataIdentificationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDataIdentificationPropertyType_Show() {
        return (EAttribute)getMDDataIdentificationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDataIdentificationPropertyType_Title() {
        return (EAttribute)getMDDataIdentificationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDataIdentificationPropertyType_Type() {
        return (EAttribute)getMDDataIdentificationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDataIdentificationPropertyType_Uuidref() {
        return (EAttribute)getMDDataIdentificationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDDataIdentificationType() {
		if (mdDataIdentificationTypeEClass == null) {
			mdDataIdentificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(144);
		}
		return mdDataIdentificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDataIdentificationType_SpatialRepresentationType() {
        return (EReference)getMDDataIdentificationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDataIdentificationType_SpatialResolution() {
        return (EReference)getMDDataIdentificationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDataIdentificationType_Language() {
        return (EReference)getMDDataIdentificationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDataIdentificationType_CharacterSet() {
        return (EReference)getMDDataIdentificationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDataIdentificationType_TopicCategory() {
        return (EReference)getMDDataIdentificationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDataIdentificationType_EnvironmentDescription() {
        return (EReference)getMDDataIdentificationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDataIdentificationType_Extent() {
        return (EReference)getMDDataIdentificationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDataIdentificationType_SupplementalInformation() {
        return (EReference)getMDDataIdentificationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDDatatypeCodePropertyType() {
		if (mdDatatypeCodePropertyTypeEClass == null) {
			mdDatatypeCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(145);
		}
		return mdDatatypeCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDatatypeCodePropertyType_MDDatatypeCode() {
        return (EReference)getMDDatatypeCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDatatypeCodePropertyType_NilReason() {
        return (EAttribute)getMDDatatypeCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDDigitalTransferOptionsPropertyType() {
		if (mdDigitalTransferOptionsPropertyTypeEClass == null) {
			mdDigitalTransferOptionsPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(146);
		}
		return mdDigitalTransferOptionsPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDigitalTransferOptionsPropertyType_MDDigitalTransferOptions() {
        return (EReference)getMDDigitalTransferOptionsPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDigitalTransferOptionsPropertyType_Actuate() {
        return (EAttribute)getMDDigitalTransferOptionsPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDigitalTransferOptionsPropertyType_Arcrole() {
        return (EAttribute)getMDDigitalTransferOptionsPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDigitalTransferOptionsPropertyType_Href() {
        return (EAttribute)getMDDigitalTransferOptionsPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDigitalTransferOptionsPropertyType_NilReason() {
        return (EAttribute)getMDDigitalTransferOptionsPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDigitalTransferOptionsPropertyType_Role() {
        return (EAttribute)getMDDigitalTransferOptionsPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDigitalTransferOptionsPropertyType_Show() {
        return (EAttribute)getMDDigitalTransferOptionsPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDigitalTransferOptionsPropertyType_Title() {
        return (EAttribute)getMDDigitalTransferOptionsPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDigitalTransferOptionsPropertyType_Type() {
        return (EAttribute)getMDDigitalTransferOptionsPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDigitalTransferOptionsPropertyType_Uuidref() {
        return (EAttribute)getMDDigitalTransferOptionsPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDDigitalTransferOptionsType() {
		if (mdDigitalTransferOptionsTypeEClass == null) {
			mdDigitalTransferOptionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(147);
		}
		return mdDigitalTransferOptionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDigitalTransferOptionsType_UnitsOfDistribution() {
        return (EReference)getMDDigitalTransferOptionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDigitalTransferOptionsType_TransferSize() {
        return (EReference)getMDDigitalTransferOptionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDigitalTransferOptionsType_OnLine() {
        return (EReference)getMDDigitalTransferOptionsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDigitalTransferOptionsType_OffLine() {
        return (EReference)getMDDigitalTransferOptionsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDDimensionNameTypeCodePropertyType() {
		if (mdDimensionNameTypeCodePropertyTypeEClass == null) {
			mdDimensionNameTypeCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(148);
		}
		return mdDimensionNameTypeCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDimensionNameTypeCodePropertyType_MDDimensionNameTypeCode() {
        return (EReference)getMDDimensionNameTypeCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDimensionNameTypeCodePropertyType_NilReason() {
        return (EAttribute)getMDDimensionNameTypeCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDDimensionPropertyType() {
		if (mdDimensionPropertyTypeEClass == null) {
			mdDimensionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(149);
		}
		return mdDimensionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDimensionPropertyType_MDDimension() {
        return (EReference)getMDDimensionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDimensionPropertyType_Actuate() {
        return (EAttribute)getMDDimensionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDimensionPropertyType_Arcrole() {
        return (EAttribute)getMDDimensionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDimensionPropertyType_Href() {
        return (EAttribute)getMDDimensionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDimensionPropertyType_NilReason() {
        return (EAttribute)getMDDimensionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDimensionPropertyType_Role() {
        return (EAttribute)getMDDimensionPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDimensionPropertyType_Show() {
        return (EAttribute)getMDDimensionPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDimensionPropertyType_Title() {
        return (EAttribute)getMDDimensionPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDimensionPropertyType_Type() {
        return (EAttribute)getMDDimensionPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDimensionPropertyType_Uuidref() {
        return (EAttribute)getMDDimensionPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDDimensionType() {
		if (mdDimensionTypeEClass == null) {
			mdDimensionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(150);
		}
		return mdDimensionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDimensionType_DimensionName() {
        return (EReference)getMDDimensionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDimensionType_DimensionSize() {
        return (EReference)getMDDimensionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDimensionType_Resolution() {
        return (EReference)getMDDimensionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDDistributionPropertyType() {
		if (mdDistributionPropertyTypeEClass == null) {
			mdDistributionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(151);
		}
		return mdDistributionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDistributionPropertyType_MDDistribution() {
        return (EReference)getMDDistributionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDistributionPropertyType_Actuate() {
        return (EAttribute)getMDDistributionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDistributionPropertyType_Arcrole() {
        return (EAttribute)getMDDistributionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDistributionPropertyType_Href() {
        return (EAttribute)getMDDistributionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDistributionPropertyType_NilReason() {
        return (EAttribute)getMDDistributionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDistributionPropertyType_Role() {
        return (EAttribute)getMDDistributionPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDistributionPropertyType_Show() {
        return (EAttribute)getMDDistributionPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDistributionPropertyType_Title() {
        return (EAttribute)getMDDistributionPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDistributionPropertyType_Type() {
        return (EAttribute)getMDDistributionPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDistributionPropertyType_Uuidref() {
        return (EAttribute)getMDDistributionPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDDistributionType() {
		if (mdDistributionTypeEClass == null) {
			mdDistributionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(152);
		}
		return mdDistributionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDistributionType_DistributionFormat() {
        return (EReference)getMDDistributionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDistributionType_Distributor() {
        return (EReference)getMDDistributionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDistributionType_TransferOptions() {
        return (EReference)getMDDistributionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDDistributionUnitsPropertyType() {
		if (mdDistributionUnitsPropertyTypeEClass == null) {
			mdDistributionUnitsPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(153);
		}
		return mdDistributionUnitsPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDistributionUnitsPropertyType_MDDistributionUnits() {
        return (EReference)getMDDistributionUnitsPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDistributionUnitsPropertyType_NilReason() {
        return (EAttribute)getMDDistributionUnitsPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDDistributorPropertyType() {
		if (mdDistributorPropertyTypeEClass == null) {
			mdDistributorPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(154);
		}
		return mdDistributorPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDistributorPropertyType_MDDistributor() {
        return (EReference)getMDDistributorPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDistributorPropertyType_Actuate() {
        return (EAttribute)getMDDistributorPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDistributorPropertyType_Arcrole() {
        return (EAttribute)getMDDistributorPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDistributorPropertyType_Href() {
        return (EAttribute)getMDDistributorPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDistributorPropertyType_NilReason() {
        return (EAttribute)getMDDistributorPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDistributorPropertyType_Role() {
        return (EAttribute)getMDDistributorPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDistributorPropertyType_Show() {
        return (EAttribute)getMDDistributorPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDistributorPropertyType_Title() {
        return (EAttribute)getMDDistributorPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDistributorPropertyType_Type() {
        return (EAttribute)getMDDistributorPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDDistributorPropertyType_Uuidref() {
        return (EAttribute)getMDDistributorPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDDistributorType() {
		if (mdDistributorTypeEClass == null) {
			mdDistributorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(155);
		}
		return mdDistributorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDistributorType_DistributorContact() {
        return (EReference)getMDDistributorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDistributorType_DistributionOrderProcess() {
        return (EReference)getMDDistributorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDistributorType_DistributorFormat() {
        return (EReference)getMDDistributorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDDistributorType_DistributorTransferOptions() {
        return (EReference)getMDDistributorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDExtendedElementInformationPropertyType() {
		if (mdExtendedElementInformationPropertyTypeEClass == null) {
			mdExtendedElementInformationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(156);
		}
		return mdExtendedElementInformationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDExtendedElementInformationPropertyType_MDExtendedElementInformation() {
        return (EReference)getMDExtendedElementInformationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDExtendedElementInformationPropertyType_Actuate() {
        return (EAttribute)getMDExtendedElementInformationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDExtendedElementInformationPropertyType_Arcrole() {
        return (EAttribute)getMDExtendedElementInformationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDExtendedElementInformationPropertyType_Href() {
        return (EAttribute)getMDExtendedElementInformationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDExtendedElementInformationPropertyType_NilReason() {
        return (EAttribute)getMDExtendedElementInformationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDExtendedElementInformationPropertyType_Role() {
        return (EAttribute)getMDExtendedElementInformationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDExtendedElementInformationPropertyType_Show() {
        return (EAttribute)getMDExtendedElementInformationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDExtendedElementInformationPropertyType_Title() {
        return (EAttribute)getMDExtendedElementInformationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDExtendedElementInformationPropertyType_Type() {
        return (EAttribute)getMDExtendedElementInformationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDExtendedElementInformationPropertyType_Uuidref() {
        return (EAttribute)getMDExtendedElementInformationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDExtendedElementInformationType() {
		if (mdExtendedElementInformationTypeEClass == null) {
			mdExtendedElementInformationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(157);
		}
		return mdExtendedElementInformationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDExtendedElementInformationType_Name() {
        return (EReference)getMDExtendedElementInformationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDExtendedElementInformationType_ShortName() {
        return (EReference)getMDExtendedElementInformationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDExtendedElementInformationType_DomainCode() {
        return (EReference)getMDExtendedElementInformationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDExtendedElementInformationType_Definition() {
        return (EReference)getMDExtendedElementInformationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDExtendedElementInformationType_Obligation() {
        return (EReference)getMDExtendedElementInformationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDExtendedElementInformationType_Condition() {
        return (EReference)getMDExtendedElementInformationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDExtendedElementInformationType_DataType() {
        return (EReference)getMDExtendedElementInformationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDExtendedElementInformationType_MaximumOccurrence() {
        return (EReference)getMDExtendedElementInformationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDExtendedElementInformationType_DomainValue() {
        return (EReference)getMDExtendedElementInformationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDExtendedElementInformationType_ParentEntity() {
        return (EReference)getMDExtendedElementInformationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDExtendedElementInformationType_Rule() {
        return (EReference)getMDExtendedElementInformationType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDExtendedElementInformationType_Rationale() {
        return (EReference)getMDExtendedElementInformationType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDExtendedElementInformationType_Source() {
        return (EReference)getMDExtendedElementInformationType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDFeatureCatalogueDescriptionPropertyType() {
		if (mdFeatureCatalogueDescriptionPropertyTypeEClass == null) {
			mdFeatureCatalogueDescriptionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(158);
		}
		return mdFeatureCatalogueDescriptionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDFeatureCatalogueDescriptionPropertyType_MDFeatureCatalogueDescription() {
        return (EReference)getMDFeatureCatalogueDescriptionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDFeatureCatalogueDescriptionPropertyType_Actuate() {
        return (EAttribute)getMDFeatureCatalogueDescriptionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDFeatureCatalogueDescriptionPropertyType_Arcrole() {
        return (EAttribute)getMDFeatureCatalogueDescriptionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDFeatureCatalogueDescriptionPropertyType_Href() {
        return (EAttribute)getMDFeatureCatalogueDescriptionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDFeatureCatalogueDescriptionPropertyType_NilReason() {
        return (EAttribute)getMDFeatureCatalogueDescriptionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDFeatureCatalogueDescriptionPropertyType_Role() {
        return (EAttribute)getMDFeatureCatalogueDescriptionPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDFeatureCatalogueDescriptionPropertyType_Show() {
        return (EAttribute)getMDFeatureCatalogueDescriptionPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDFeatureCatalogueDescriptionPropertyType_Title() {
        return (EAttribute)getMDFeatureCatalogueDescriptionPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDFeatureCatalogueDescriptionPropertyType_Type() {
        return (EAttribute)getMDFeatureCatalogueDescriptionPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDFeatureCatalogueDescriptionPropertyType_Uuidref() {
        return (EAttribute)getMDFeatureCatalogueDescriptionPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDFeatureCatalogueDescriptionType() {
		if (mdFeatureCatalogueDescriptionTypeEClass == null) {
			mdFeatureCatalogueDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(159);
		}
		return mdFeatureCatalogueDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDFeatureCatalogueDescriptionType_ComplianceCode() {
        return (EReference)getMDFeatureCatalogueDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDFeatureCatalogueDescriptionType_Language() {
        return (EReference)getMDFeatureCatalogueDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDFeatureCatalogueDescriptionType_IncludedWithDataset() {
        return (EReference)getMDFeatureCatalogueDescriptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDFeatureCatalogueDescriptionType_FeatureTypes() {
        return (EReference)getMDFeatureCatalogueDescriptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDFeatureCatalogueDescriptionType_FeatureCatalogueCitation() {
        return (EReference)getMDFeatureCatalogueDescriptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDFormatPropertyType() {
		if (mdFormatPropertyTypeEClass == null) {
			mdFormatPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(160);
		}
		return mdFormatPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDFormatPropertyType_MDFormat() {
        return (EReference)getMDFormatPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDFormatPropertyType_Actuate() {
        return (EAttribute)getMDFormatPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDFormatPropertyType_Arcrole() {
        return (EAttribute)getMDFormatPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDFormatPropertyType_Href() {
        return (EAttribute)getMDFormatPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDFormatPropertyType_NilReason() {
        return (EAttribute)getMDFormatPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDFormatPropertyType_Role() {
        return (EAttribute)getMDFormatPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDFormatPropertyType_Show() {
        return (EAttribute)getMDFormatPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDFormatPropertyType_Title() {
        return (EAttribute)getMDFormatPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDFormatPropertyType_Type() {
        return (EAttribute)getMDFormatPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDFormatPropertyType_Uuidref() {
        return (EAttribute)getMDFormatPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDFormatType() {
		if (mdFormatTypeEClass == null) {
			mdFormatTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(161);
		}
		return mdFormatTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDFormatType_Name() {
        return (EReference)getMDFormatType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDFormatType_Version() {
        return (EReference)getMDFormatType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDFormatType_AmendmentNumber() {
        return (EReference)getMDFormatType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDFormatType_Specification() {
        return (EReference)getMDFormatType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDFormatType_FileDecompressionTechnique() {
        return (EReference)getMDFormatType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDFormatType_FormatDistributor() {
        return (EReference)getMDFormatType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDGeometricObjectsPropertyType() {
		if (mdGeometricObjectsPropertyTypeEClass == null) {
			mdGeometricObjectsPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(162);
		}
		return mdGeometricObjectsPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGeometricObjectsPropertyType_MDGeometricObjects() {
        return (EReference)getMDGeometricObjectsPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeometricObjectsPropertyType_Actuate() {
        return (EAttribute)getMDGeometricObjectsPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeometricObjectsPropertyType_Arcrole() {
        return (EAttribute)getMDGeometricObjectsPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeometricObjectsPropertyType_Href() {
        return (EAttribute)getMDGeometricObjectsPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeometricObjectsPropertyType_NilReason() {
        return (EAttribute)getMDGeometricObjectsPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeometricObjectsPropertyType_Role() {
        return (EAttribute)getMDGeometricObjectsPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeometricObjectsPropertyType_Show() {
        return (EAttribute)getMDGeometricObjectsPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeometricObjectsPropertyType_Title() {
        return (EAttribute)getMDGeometricObjectsPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeometricObjectsPropertyType_Type() {
        return (EAttribute)getMDGeometricObjectsPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeometricObjectsPropertyType_Uuidref() {
        return (EAttribute)getMDGeometricObjectsPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDGeometricObjectsType() {
		if (mdGeometricObjectsTypeEClass == null) {
			mdGeometricObjectsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(163);
		}
		return mdGeometricObjectsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGeometricObjectsType_GeometricObjectType() {
        return (EReference)getMDGeometricObjectsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGeometricObjectsType_GeometricObjectCount() {
        return (EReference)getMDGeometricObjectsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDGeometricObjectTypeCodePropertyType() {
		if (mdGeometricObjectTypeCodePropertyTypeEClass == null) {
			mdGeometricObjectTypeCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(164);
		}
		return mdGeometricObjectTypeCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGeometricObjectTypeCodePropertyType_MDGeometricObjectTypeCode() {
        return (EReference)getMDGeometricObjectTypeCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeometricObjectTypeCodePropertyType_NilReason() {
        return (EAttribute)getMDGeometricObjectTypeCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDGeorectifiedPropertyType() {
		if (mdGeorectifiedPropertyTypeEClass == null) {
			mdGeorectifiedPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(165);
		}
		return mdGeorectifiedPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGeorectifiedPropertyType_MDGeorectified() {
        return (EReference)getMDGeorectifiedPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeorectifiedPropertyType_Actuate() {
        return (EAttribute)getMDGeorectifiedPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeorectifiedPropertyType_Arcrole() {
        return (EAttribute)getMDGeorectifiedPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeorectifiedPropertyType_Href() {
        return (EAttribute)getMDGeorectifiedPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeorectifiedPropertyType_NilReason() {
        return (EAttribute)getMDGeorectifiedPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeorectifiedPropertyType_Role() {
        return (EAttribute)getMDGeorectifiedPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeorectifiedPropertyType_Show() {
        return (EAttribute)getMDGeorectifiedPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeorectifiedPropertyType_Title() {
        return (EAttribute)getMDGeorectifiedPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeorectifiedPropertyType_Type() {
        return (EAttribute)getMDGeorectifiedPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeorectifiedPropertyType_Uuidref() {
        return (EAttribute)getMDGeorectifiedPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDGeorectifiedType() {
		if (mdGeorectifiedTypeEClass == null) {
			mdGeorectifiedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(166);
		}
		return mdGeorectifiedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGeorectifiedType_CheckPointAvailability() {
        return (EReference)getMDGeorectifiedType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGeorectifiedType_CheckPointDescription() {
        return (EReference)getMDGeorectifiedType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGeorectifiedType_CornerPoints() {
        return (EReference)getMDGeorectifiedType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGeorectifiedType_CenterPoint() {
        return (EReference)getMDGeorectifiedType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGeorectifiedType_PointInPixel() {
        return (EReference)getMDGeorectifiedType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGeorectifiedType_TransformationDimensionDescription() {
        return (EReference)getMDGeorectifiedType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGeorectifiedType_TransformationDimensionMapping() {
        return (EReference)getMDGeorectifiedType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDGeoreferenceablePropertyType() {
		if (mdGeoreferenceablePropertyTypeEClass == null) {
			mdGeoreferenceablePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(167);
		}
		return mdGeoreferenceablePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGeoreferenceablePropertyType_MDGeoreferenceable() {
        return (EReference)getMDGeoreferenceablePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeoreferenceablePropertyType_Actuate() {
        return (EAttribute)getMDGeoreferenceablePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeoreferenceablePropertyType_Arcrole() {
        return (EAttribute)getMDGeoreferenceablePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeoreferenceablePropertyType_Href() {
        return (EAttribute)getMDGeoreferenceablePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeoreferenceablePropertyType_NilReason() {
        return (EAttribute)getMDGeoreferenceablePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeoreferenceablePropertyType_Role() {
        return (EAttribute)getMDGeoreferenceablePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeoreferenceablePropertyType_Show() {
        return (EAttribute)getMDGeoreferenceablePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeoreferenceablePropertyType_Title() {
        return (EAttribute)getMDGeoreferenceablePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeoreferenceablePropertyType_Type() {
        return (EAttribute)getMDGeoreferenceablePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGeoreferenceablePropertyType_Uuidref() {
        return (EAttribute)getMDGeoreferenceablePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDGeoreferenceableType() {
		if (mdGeoreferenceableTypeEClass == null) {
			mdGeoreferenceableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(168);
		}
		return mdGeoreferenceableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGeoreferenceableType_ControlPointAvailability() {
        return (EReference)getMDGeoreferenceableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGeoreferenceableType_OrientationParameterAvailability() {
        return (EReference)getMDGeoreferenceableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGeoreferenceableType_OrientationParameterDescription() {
        return (EReference)getMDGeoreferenceableType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGeoreferenceableType_GeoreferencedParameters() {
        return (EReference)getMDGeoreferenceableType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGeoreferenceableType_ParameterCitation() {
        return (EReference)getMDGeoreferenceableType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDGridSpatialRepresentationPropertyType() {
		if (mdGridSpatialRepresentationPropertyTypeEClass == null) {
			mdGridSpatialRepresentationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(169);
		}
		return mdGridSpatialRepresentationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGridSpatialRepresentationPropertyType_MDGridSpatialRepresentationGroup() {
        return (EAttribute)getMDGridSpatialRepresentationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGridSpatialRepresentationPropertyType_MDGridSpatialRepresentation() {
        return (EReference)getMDGridSpatialRepresentationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGridSpatialRepresentationPropertyType_Actuate() {
        return (EAttribute)getMDGridSpatialRepresentationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGridSpatialRepresentationPropertyType_Arcrole() {
        return (EAttribute)getMDGridSpatialRepresentationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGridSpatialRepresentationPropertyType_Href() {
        return (EAttribute)getMDGridSpatialRepresentationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGridSpatialRepresentationPropertyType_NilReason() {
        return (EAttribute)getMDGridSpatialRepresentationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGridSpatialRepresentationPropertyType_Role() {
        return (EAttribute)getMDGridSpatialRepresentationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGridSpatialRepresentationPropertyType_Show() {
        return (EAttribute)getMDGridSpatialRepresentationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGridSpatialRepresentationPropertyType_Title() {
        return (EAttribute)getMDGridSpatialRepresentationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGridSpatialRepresentationPropertyType_Type() {
        return (EAttribute)getMDGridSpatialRepresentationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDGridSpatialRepresentationPropertyType_Uuidref() {
        return (EAttribute)getMDGridSpatialRepresentationPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDGridSpatialRepresentationType() {
		if (mdGridSpatialRepresentationTypeEClass == null) {
			mdGridSpatialRepresentationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(170);
		}
		return mdGridSpatialRepresentationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGridSpatialRepresentationType_NumberOfDimensions() {
        return (EReference)getMDGridSpatialRepresentationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGridSpatialRepresentationType_AxisDimensionProperties() {
        return (EReference)getMDGridSpatialRepresentationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGridSpatialRepresentationType_CellGeometry() {
        return (EReference)getMDGridSpatialRepresentationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDGridSpatialRepresentationType_TransformationParameterAvailability() {
        return (EReference)getMDGridSpatialRepresentationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDIdentificationPropertyType() {
		if (mdIdentificationPropertyTypeEClass == null) {
			mdIdentificationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(171);
		}
		return mdIdentificationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentificationPropertyType_AbstractMDIdentificationGroup() {
        return (EAttribute)getMDIdentificationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDIdentificationPropertyType_AbstractMDIdentification() {
        return (EReference)getMDIdentificationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentificationPropertyType_Actuate() {
        return (EAttribute)getMDIdentificationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentificationPropertyType_Arcrole() {
        return (EAttribute)getMDIdentificationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentificationPropertyType_Href() {
        return (EAttribute)getMDIdentificationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentificationPropertyType_NilReason() {
        return (EAttribute)getMDIdentificationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentificationPropertyType_Role() {
        return (EAttribute)getMDIdentificationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentificationPropertyType_Show() {
        return (EAttribute)getMDIdentificationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentificationPropertyType_Title() {
        return (EAttribute)getMDIdentificationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentificationPropertyType_Type() {
        return (EAttribute)getMDIdentificationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentificationPropertyType_Uuidref() {
        return (EAttribute)getMDIdentificationPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDIdentifierPropertyType() {
		if (mdIdentifierPropertyTypeEClass == null) {
			mdIdentifierPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(172);
		}
		return mdIdentifierPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentifierPropertyType_MDIdentifierGroup() {
        return (EAttribute)getMDIdentifierPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDIdentifierPropertyType_MDIdentifier() {
        return (EReference)getMDIdentifierPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentifierPropertyType_Actuate() {
        return (EAttribute)getMDIdentifierPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentifierPropertyType_Arcrole() {
        return (EAttribute)getMDIdentifierPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentifierPropertyType_Href() {
        return (EAttribute)getMDIdentifierPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentifierPropertyType_NilReason() {
        return (EAttribute)getMDIdentifierPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentifierPropertyType_Role() {
        return (EAttribute)getMDIdentifierPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentifierPropertyType_Show() {
        return (EAttribute)getMDIdentifierPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentifierPropertyType_Title() {
        return (EAttribute)getMDIdentifierPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentifierPropertyType_Type() {
        return (EAttribute)getMDIdentifierPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDIdentifierPropertyType_Uuidref() {
        return (EAttribute)getMDIdentifierPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDIdentifierType() {
		if (mdIdentifierTypeEClass == null) {
			mdIdentifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(173);
		}
		return mdIdentifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDIdentifierType_Authority() {
        return (EReference)getMDIdentifierType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDIdentifierType_Code() {
        return (EReference)getMDIdentifierType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDImageDescriptionPropertyType() {
		if (mdImageDescriptionPropertyTypeEClass == null) {
			mdImageDescriptionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(174);
		}
		return mdImageDescriptionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDImageDescriptionPropertyType_MDImageDescription() {
        return (EReference)getMDImageDescriptionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDImageDescriptionPropertyType_Actuate() {
        return (EAttribute)getMDImageDescriptionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDImageDescriptionPropertyType_Arcrole() {
        return (EAttribute)getMDImageDescriptionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDImageDescriptionPropertyType_Href() {
        return (EAttribute)getMDImageDescriptionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDImageDescriptionPropertyType_NilReason() {
        return (EAttribute)getMDImageDescriptionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDImageDescriptionPropertyType_Role() {
        return (EAttribute)getMDImageDescriptionPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDImageDescriptionPropertyType_Show() {
        return (EAttribute)getMDImageDescriptionPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDImageDescriptionPropertyType_Title() {
        return (EAttribute)getMDImageDescriptionPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDImageDescriptionPropertyType_Type() {
        return (EAttribute)getMDImageDescriptionPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDImageDescriptionPropertyType_Uuidref() {
        return (EAttribute)getMDImageDescriptionPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDImageDescriptionType() {
		if (mdImageDescriptionTypeEClass == null) {
			mdImageDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(175);
		}
		return mdImageDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDImageDescriptionType_IlluminationElevationAngle() {
        return (EReference)getMDImageDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDImageDescriptionType_IlluminationAzimuthAngle() {
        return (EReference)getMDImageDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDImageDescriptionType_ImagingCondition() {
        return (EReference)getMDImageDescriptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDImageDescriptionType_ImageQualityCode() {
        return (EReference)getMDImageDescriptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDImageDescriptionType_CloudCoverPercentage() {
        return (EReference)getMDImageDescriptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDImageDescriptionType_ProcessingLevelCode() {
        return (EReference)getMDImageDescriptionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDImageDescriptionType_CompressionGenerationQuantity() {
        return (EReference)getMDImageDescriptionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDImageDescriptionType_TriangulationIndicator() {
        return (EReference)getMDImageDescriptionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDImageDescriptionType_RadiometricCalibrationDataAvailability() {
        return (EReference)getMDImageDescriptionType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDImageDescriptionType_CameraCalibrationInformationAvailability() {
        return (EReference)getMDImageDescriptionType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDImageDescriptionType_FilmDistortionInformationAvailability() {
        return (EReference)getMDImageDescriptionType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDImageDescriptionType_LensDistortionInformationAvailability() {
        return (EReference)getMDImageDescriptionType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDImagingConditionCodePropertyType() {
		if (mdImagingConditionCodePropertyTypeEClass == null) {
			mdImagingConditionCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(176);
		}
		return mdImagingConditionCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDImagingConditionCodePropertyType_MDImagingConditionCode() {
        return (EReference)getMDImagingConditionCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDImagingConditionCodePropertyType_NilReason() {
        return (EAttribute)getMDImagingConditionCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDKeywordsPropertyType() {
		if (mdKeywordsPropertyTypeEClass == null) {
			mdKeywordsPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(177);
		}
		return mdKeywordsPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDKeywordsPropertyType_MDKeywords() {
        return (EReference)getMDKeywordsPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDKeywordsPropertyType_Actuate() {
        return (EAttribute)getMDKeywordsPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDKeywordsPropertyType_Arcrole() {
        return (EAttribute)getMDKeywordsPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDKeywordsPropertyType_Href() {
        return (EAttribute)getMDKeywordsPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDKeywordsPropertyType_NilReason() {
        return (EAttribute)getMDKeywordsPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDKeywordsPropertyType_Role() {
        return (EAttribute)getMDKeywordsPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDKeywordsPropertyType_Show() {
        return (EAttribute)getMDKeywordsPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDKeywordsPropertyType_Title() {
        return (EAttribute)getMDKeywordsPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDKeywordsPropertyType_Type() {
        return (EAttribute)getMDKeywordsPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDKeywordsPropertyType_Uuidref() {
        return (EAttribute)getMDKeywordsPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDKeywordsType() {
		if (mdKeywordsTypeEClass == null) {
			mdKeywordsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(178);
		}
		return mdKeywordsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDKeywordsType_Keyword() {
        return (EReference)getMDKeywordsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDKeywordsType_Type() {
        return (EReference)getMDKeywordsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDKeywordsType_ThesaurusName() {
        return (EReference)getMDKeywordsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDKeywordTypeCodePropertyType() {
		if (mdKeywordTypeCodePropertyTypeEClass == null) {
			mdKeywordTypeCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(179);
		}
		return mdKeywordTypeCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDKeywordTypeCodePropertyType_MDKeywordTypeCode() {
        return (EReference)getMDKeywordTypeCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDKeywordTypeCodePropertyType_NilReason() {
        return (EAttribute)getMDKeywordTypeCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDLegalConstraintsPropertyType() {
		if (mdLegalConstraintsPropertyTypeEClass == null) {
			mdLegalConstraintsPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(180);
		}
		return mdLegalConstraintsPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDLegalConstraintsPropertyType_MDLegalConstraints() {
        return (EReference)getMDLegalConstraintsPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDLegalConstraintsPropertyType_Actuate() {
        return (EAttribute)getMDLegalConstraintsPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDLegalConstraintsPropertyType_Arcrole() {
        return (EAttribute)getMDLegalConstraintsPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDLegalConstraintsPropertyType_Href() {
        return (EAttribute)getMDLegalConstraintsPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDLegalConstraintsPropertyType_NilReason() {
        return (EAttribute)getMDLegalConstraintsPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDLegalConstraintsPropertyType_Role() {
        return (EAttribute)getMDLegalConstraintsPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDLegalConstraintsPropertyType_Show() {
        return (EAttribute)getMDLegalConstraintsPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDLegalConstraintsPropertyType_Title() {
        return (EAttribute)getMDLegalConstraintsPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDLegalConstraintsPropertyType_Type() {
        return (EAttribute)getMDLegalConstraintsPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDLegalConstraintsPropertyType_Uuidref() {
        return (EAttribute)getMDLegalConstraintsPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDLegalConstraintsType() {
		if (mdLegalConstraintsTypeEClass == null) {
			mdLegalConstraintsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(181);
		}
		return mdLegalConstraintsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDLegalConstraintsType_AccessConstraints() {
        return (EReference)getMDLegalConstraintsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDLegalConstraintsType_UseConstraints() {
        return (EReference)getMDLegalConstraintsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDLegalConstraintsType_OtherConstraints() {
        return (EReference)getMDLegalConstraintsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDMaintenanceFrequencyCodePropertyType() {
		if (mdMaintenanceFrequencyCodePropertyTypeEClass == null) {
			mdMaintenanceFrequencyCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(182);
		}
		return mdMaintenanceFrequencyCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMaintenanceFrequencyCodePropertyType_MDMaintenanceFrequencyCode() {
        return (EReference)getMDMaintenanceFrequencyCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMaintenanceFrequencyCodePropertyType_NilReason() {
        return (EAttribute)getMDMaintenanceFrequencyCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDMaintenanceInformationPropertyType() {
		if (mdMaintenanceInformationPropertyTypeEClass == null) {
			mdMaintenanceInformationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(183);
		}
		return mdMaintenanceInformationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMaintenanceInformationPropertyType_MDMaintenanceInformation() {
        return (EReference)getMDMaintenanceInformationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMaintenanceInformationPropertyType_Actuate() {
        return (EAttribute)getMDMaintenanceInformationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMaintenanceInformationPropertyType_Arcrole() {
        return (EAttribute)getMDMaintenanceInformationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMaintenanceInformationPropertyType_Href() {
        return (EAttribute)getMDMaintenanceInformationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMaintenanceInformationPropertyType_NilReason() {
        return (EAttribute)getMDMaintenanceInformationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMaintenanceInformationPropertyType_Role() {
        return (EAttribute)getMDMaintenanceInformationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMaintenanceInformationPropertyType_Show() {
        return (EAttribute)getMDMaintenanceInformationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMaintenanceInformationPropertyType_Title() {
        return (EAttribute)getMDMaintenanceInformationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMaintenanceInformationPropertyType_Type() {
        return (EAttribute)getMDMaintenanceInformationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMaintenanceInformationPropertyType_Uuidref() {
        return (EAttribute)getMDMaintenanceInformationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDMaintenanceInformationType() {
		if (mdMaintenanceInformationTypeEClass == null) {
			mdMaintenanceInformationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(184);
		}
		return mdMaintenanceInformationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMaintenanceInformationType_MaintenanceAndUpdateFrequency() {
        return (EReference)getMDMaintenanceInformationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMaintenanceInformationType_DateOfNextUpdate() {
        return (EReference)getMDMaintenanceInformationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMaintenanceInformationType_UserDefinedMaintenanceFrequency() {
        return (EReference)getMDMaintenanceInformationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMaintenanceInformationType_UpdateScope() {
        return (EReference)getMDMaintenanceInformationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMaintenanceInformationType_UpdateScopeDescription() {
        return (EReference)getMDMaintenanceInformationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMaintenanceInformationType_MaintenanceNote() {
        return (EReference)getMDMaintenanceInformationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMaintenanceInformationType_Contact() {
        return (EReference)getMDMaintenanceInformationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDMediumFormatCodePropertyType() {
		if (mdMediumFormatCodePropertyTypeEClass == null) {
			mdMediumFormatCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(185);
		}
		return mdMediumFormatCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMediumFormatCodePropertyType_MDMediumFormatCode() {
        return (EReference)getMDMediumFormatCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMediumFormatCodePropertyType_NilReason() {
        return (EAttribute)getMDMediumFormatCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDMediumNameCodePropertyType() {
		if (mdMediumNameCodePropertyTypeEClass == null) {
			mdMediumNameCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(186);
		}
		return mdMediumNameCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMediumNameCodePropertyType_MDMediumNameCode() {
        return (EReference)getMDMediumNameCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMediumNameCodePropertyType_NilReason() {
        return (EAttribute)getMDMediumNameCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDMediumPropertyType() {
		if (mdMediumPropertyTypeEClass == null) {
			mdMediumPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(187);
		}
		return mdMediumPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMediumPropertyType_MDMedium() {
        return (EReference)getMDMediumPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMediumPropertyType_Actuate() {
        return (EAttribute)getMDMediumPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMediumPropertyType_Arcrole() {
        return (EAttribute)getMDMediumPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMediumPropertyType_Href() {
        return (EAttribute)getMDMediumPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMediumPropertyType_NilReason() {
        return (EAttribute)getMDMediumPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMediumPropertyType_Role() {
        return (EAttribute)getMDMediumPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMediumPropertyType_Show() {
        return (EAttribute)getMDMediumPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMediumPropertyType_Title() {
        return (EAttribute)getMDMediumPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMediumPropertyType_Type() {
        return (EAttribute)getMDMediumPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMediumPropertyType_Uuidref() {
        return (EAttribute)getMDMediumPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDMediumType() {
		if (mdMediumTypeEClass == null) {
			mdMediumTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(188);
		}
		return mdMediumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMediumType_Name() {
        return (EReference)getMDMediumType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMediumType_Density() {
        return (EReference)getMDMediumType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMediumType_DensityUnits() {
        return (EReference)getMDMediumType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMediumType_Volumes() {
        return (EReference)getMDMediumType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMediumType_MediumFormat() {
        return (EReference)getMDMediumType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMediumType_MediumNote() {
        return (EReference)getMDMediumType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDMetadataExtensionInformationPropertyType() {
		if (mdMetadataExtensionInformationPropertyTypeEClass == null) {
			mdMetadataExtensionInformationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(189);
		}
		return mdMetadataExtensionInformationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataExtensionInformationPropertyType_MDMetadataExtensionInformation() {
        return (EReference)getMDMetadataExtensionInformationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMetadataExtensionInformationPropertyType_Actuate() {
        return (EAttribute)getMDMetadataExtensionInformationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMetadataExtensionInformationPropertyType_Arcrole() {
        return (EAttribute)getMDMetadataExtensionInformationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMetadataExtensionInformationPropertyType_Href() {
        return (EAttribute)getMDMetadataExtensionInformationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMetadataExtensionInformationPropertyType_NilReason() {
        return (EAttribute)getMDMetadataExtensionInformationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMetadataExtensionInformationPropertyType_Role() {
        return (EAttribute)getMDMetadataExtensionInformationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMetadataExtensionInformationPropertyType_Show() {
        return (EAttribute)getMDMetadataExtensionInformationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMetadataExtensionInformationPropertyType_Title() {
        return (EAttribute)getMDMetadataExtensionInformationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMetadataExtensionInformationPropertyType_Type() {
        return (EAttribute)getMDMetadataExtensionInformationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMetadataExtensionInformationPropertyType_Uuidref() {
        return (EAttribute)getMDMetadataExtensionInformationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDMetadataExtensionInformationType() {
		if (mdMetadataExtensionInformationTypeEClass == null) {
			mdMetadataExtensionInformationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(190);
		}
		return mdMetadataExtensionInformationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataExtensionInformationType_ExtensionOnLineResource() {
        return (EReference)getMDMetadataExtensionInformationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataExtensionInformationType_ExtendedElementInformation() {
        return (EReference)getMDMetadataExtensionInformationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDMetadataPropertyType() {
		if (mdMetadataPropertyTypeEClass == null) {
			mdMetadataPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(191);
		}
		return mdMetadataPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataPropertyType_MDMetadata() {
        return (EReference)getMDMetadataPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMetadataPropertyType_Actuate() {
        return (EAttribute)getMDMetadataPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMetadataPropertyType_Arcrole() {
        return (EAttribute)getMDMetadataPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMetadataPropertyType_Href() {
        return (EAttribute)getMDMetadataPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMetadataPropertyType_NilReason() {
        return (EAttribute)getMDMetadataPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMetadataPropertyType_Role() {
        return (EAttribute)getMDMetadataPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMetadataPropertyType_Show() {
        return (EAttribute)getMDMetadataPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMetadataPropertyType_Title() {
        return (EAttribute)getMDMetadataPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMetadataPropertyType_Type() {
        return (EAttribute)getMDMetadataPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDMetadataPropertyType_Uuidref() {
        return (EAttribute)getMDMetadataPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDMetadataType() {
		if (mdMetadataTypeEClass == null) {
			mdMetadataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(192);
		}
		return mdMetadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_FileIdentifier() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_Language() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_CharacterSet() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_ParentIdentifier() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_HierarchyLevel() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_HierarchyLevelName() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_Contact() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_DateStamp() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_MetadataStandardName() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_MetadataStandardVersion() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_DataSetURI() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_Locale() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_SpatialRepresentationInfo() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_ReferenceSystemInfo() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_MetadataExtensionInfo() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_IdentificationInfo() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_ContentInfo() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_DistributionInfo() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_DataQualityInfo() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_PortrayalCatalogueInfo() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_MetadataConstraints() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_ApplicationSchemaInfo() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_MetadataMaintenance() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_Series() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_Describes() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_PropertyType() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_FeatureType() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDMetadataType_FeatureAttribute() {
        return (EReference)getMDMetadataType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDObligationCodePropertyType() {
		if (mdObligationCodePropertyTypeEClass == null) {
			mdObligationCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(193);
		}
		return mdObligationCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDObligationCodePropertyType_MDObligationCode() {
        return (EAttribute)getMDObligationCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDObligationCodePropertyType_NilReason() {
        return (EAttribute)getMDObligationCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDPixelOrientationCodePropertyType() {
		if (mdPixelOrientationCodePropertyTypeEClass == null) {
			mdPixelOrientationCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(196);
		}
		return mdPixelOrientationCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDPixelOrientationCodePropertyType_MDPixelOrientationCode() {
        return (EAttribute)getMDPixelOrientationCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDPixelOrientationCodePropertyType_NilReason() {
        return (EAttribute)getMDPixelOrientationCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDPortrayalCatalogueReferencePropertyType() {
		if (mdPortrayalCatalogueReferencePropertyTypeEClass == null) {
			mdPortrayalCatalogueReferencePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(199);
		}
		return mdPortrayalCatalogueReferencePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDPortrayalCatalogueReferencePropertyType_MDPortrayalCatalogueReference() {
        return (EReference)getMDPortrayalCatalogueReferencePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDPortrayalCatalogueReferencePropertyType_Actuate() {
        return (EAttribute)getMDPortrayalCatalogueReferencePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDPortrayalCatalogueReferencePropertyType_Arcrole() {
        return (EAttribute)getMDPortrayalCatalogueReferencePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDPortrayalCatalogueReferencePropertyType_Href() {
        return (EAttribute)getMDPortrayalCatalogueReferencePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDPortrayalCatalogueReferencePropertyType_NilReason() {
        return (EAttribute)getMDPortrayalCatalogueReferencePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDPortrayalCatalogueReferencePropertyType_Role() {
        return (EAttribute)getMDPortrayalCatalogueReferencePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDPortrayalCatalogueReferencePropertyType_Show() {
        return (EAttribute)getMDPortrayalCatalogueReferencePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDPortrayalCatalogueReferencePropertyType_Title() {
        return (EAttribute)getMDPortrayalCatalogueReferencePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDPortrayalCatalogueReferencePropertyType_Type() {
        return (EAttribute)getMDPortrayalCatalogueReferencePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDPortrayalCatalogueReferencePropertyType_Uuidref() {
        return (EAttribute)getMDPortrayalCatalogueReferencePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDPortrayalCatalogueReferenceType() {
		if (mdPortrayalCatalogueReferenceTypeEClass == null) {
			mdPortrayalCatalogueReferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(200);
		}
		return mdPortrayalCatalogueReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDPortrayalCatalogueReferenceType_PortrayalCatalogueCitation() {
        return (EReference)getMDPortrayalCatalogueReferenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDProgressCodePropertyType() {
		if (mdProgressCodePropertyTypeEClass == null) {
			mdProgressCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(201);
		}
		return mdProgressCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDProgressCodePropertyType_MDProgressCode() {
        return (EReference)getMDProgressCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDProgressCodePropertyType_NilReason() {
        return (EAttribute)getMDProgressCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDRangeDimensionPropertyType() {
		if (mdRangeDimensionPropertyTypeEClass == null) {
			mdRangeDimensionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(202);
		}
		return mdRangeDimensionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRangeDimensionPropertyType_MDRangeDimensionGroup() {
        return (EAttribute)getMDRangeDimensionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDRangeDimensionPropertyType_MDRangeDimension() {
        return (EReference)getMDRangeDimensionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRangeDimensionPropertyType_Actuate() {
        return (EAttribute)getMDRangeDimensionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRangeDimensionPropertyType_Arcrole() {
        return (EAttribute)getMDRangeDimensionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRangeDimensionPropertyType_Href() {
        return (EAttribute)getMDRangeDimensionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRangeDimensionPropertyType_NilReason() {
        return (EAttribute)getMDRangeDimensionPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRangeDimensionPropertyType_Role() {
        return (EAttribute)getMDRangeDimensionPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRangeDimensionPropertyType_Show() {
        return (EAttribute)getMDRangeDimensionPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRangeDimensionPropertyType_Title() {
        return (EAttribute)getMDRangeDimensionPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRangeDimensionPropertyType_Type() {
        return (EAttribute)getMDRangeDimensionPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRangeDimensionPropertyType_Uuidref() {
        return (EAttribute)getMDRangeDimensionPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDRangeDimensionType() {
		if (mdRangeDimensionTypeEClass == null) {
			mdRangeDimensionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(203);
		}
		return mdRangeDimensionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDRangeDimensionType_SequenceIdentifier() {
        return (EReference)getMDRangeDimensionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDRangeDimensionType_Descriptor() {
        return (EReference)getMDRangeDimensionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDReferenceSystemPropertyType() {
		if (mdReferenceSystemPropertyTypeEClass == null) {
			mdReferenceSystemPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(204);
		}
		return mdReferenceSystemPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDReferenceSystemPropertyType_MDReferenceSystem() {
        return (EReference)getMDReferenceSystemPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDReferenceSystemPropertyType_Actuate() {
        return (EAttribute)getMDReferenceSystemPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDReferenceSystemPropertyType_Arcrole() {
        return (EAttribute)getMDReferenceSystemPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDReferenceSystemPropertyType_Href() {
        return (EAttribute)getMDReferenceSystemPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDReferenceSystemPropertyType_NilReason() {
        return (EAttribute)getMDReferenceSystemPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDReferenceSystemPropertyType_Role() {
        return (EAttribute)getMDReferenceSystemPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDReferenceSystemPropertyType_Show() {
        return (EAttribute)getMDReferenceSystemPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDReferenceSystemPropertyType_Title() {
        return (EAttribute)getMDReferenceSystemPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDReferenceSystemPropertyType_Type() {
        return (EAttribute)getMDReferenceSystemPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDReferenceSystemPropertyType_Uuidref() {
        return (EAttribute)getMDReferenceSystemPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDReferenceSystemType() {
		if (mdReferenceSystemTypeEClass == null) {
			mdReferenceSystemTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(205);
		}
		return mdReferenceSystemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDReferenceSystemType_ReferenceSystemIdentifier() {
        return (EReference)getMDReferenceSystemType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDRepresentativeFractionPropertyType() {
		if (mdRepresentativeFractionPropertyTypeEClass == null) {
			mdRepresentativeFractionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(206);
		}
		return mdRepresentativeFractionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDRepresentativeFractionPropertyType_MDRepresentativeFraction() {
        return (EReference)getMDRepresentativeFractionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRepresentativeFractionPropertyType_Actuate() {
        return (EAttribute)getMDRepresentativeFractionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRepresentativeFractionPropertyType_Arcrole() {
        return (EAttribute)getMDRepresentativeFractionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRepresentativeFractionPropertyType_Href() {
        return (EAttribute)getMDRepresentativeFractionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRepresentativeFractionPropertyType_NilReason() {
        return (EAttribute)getMDRepresentativeFractionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRepresentativeFractionPropertyType_Role() {
        return (EAttribute)getMDRepresentativeFractionPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRepresentativeFractionPropertyType_Show() {
        return (EAttribute)getMDRepresentativeFractionPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRepresentativeFractionPropertyType_Title() {
        return (EAttribute)getMDRepresentativeFractionPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRepresentativeFractionPropertyType_Type() {
        return (EAttribute)getMDRepresentativeFractionPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRepresentativeFractionPropertyType_Uuidref() {
        return (EAttribute)getMDRepresentativeFractionPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDRepresentativeFractionType() {
		if (mdRepresentativeFractionTypeEClass == null) {
			mdRepresentativeFractionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(207);
		}
		return mdRepresentativeFractionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDRepresentativeFractionType_Denominator() {
        return (EReference)getMDRepresentativeFractionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDResolutionPropertyType() {
		if (mdResolutionPropertyTypeEClass == null) {
			mdResolutionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(208);
		}
		return mdResolutionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDResolutionPropertyType_MDResolution() {
        return (EReference)getMDResolutionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDResolutionPropertyType_NilReason() {
        return (EAttribute)getMDResolutionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDResolutionType() {
		if (mdResolutionTypeEClass == null) {
			mdResolutionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(209);
		}
		return mdResolutionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDResolutionType_EquivalentScale() {
        return (EReference)getMDResolutionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDResolutionType_Distance() {
        return (EReference)getMDResolutionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDRestrictionCodePropertyType() {
		if (mdRestrictionCodePropertyTypeEClass == null) {
			mdRestrictionCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(210);
		}
		return mdRestrictionCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDRestrictionCodePropertyType_MDRestrictionCode() {
        return (EReference)getMDRestrictionCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDRestrictionCodePropertyType_NilReason() {
        return (EAttribute)getMDRestrictionCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDScopeCodePropertyType() {
		if (mdScopeCodePropertyTypeEClass == null) {
			mdScopeCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(211);
		}
		return mdScopeCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDScopeCodePropertyType_MDScopeCode() {
        return (EReference)getMDScopeCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDScopeCodePropertyType_NilReason() {
        return (EAttribute)getMDScopeCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDScopeDescriptionPropertyType() {
		if (mdScopeDescriptionPropertyTypeEClass == null) {
			mdScopeDescriptionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(212);
		}
		return mdScopeDescriptionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDScopeDescriptionPropertyType_MDScopeDescription() {
        return (EReference)getMDScopeDescriptionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDScopeDescriptionPropertyType_NilReason() {
        return (EAttribute)getMDScopeDescriptionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDScopeDescriptionType() {
		if (mdScopeDescriptionTypeEClass == null) {
			mdScopeDescriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(213);
		}
		return mdScopeDescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDScopeDescriptionType_Attributes() {
        return (EReference)getMDScopeDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDScopeDescriptionType_Features() {
        return (EReference)getMDScopeDescriptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDScopeDescriptionType_FeatureInstances() {
        return (EReference)getMDScopeDescriptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDScopeDescriptionType_AttributeInstances() {
        return (EReference)getMDScopeDescriptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDScopeDescriptionType_Dataset() {
        return (EReference)getMDScopeDescriptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDScopeDescriptionType_Other() {
        return (EReference)getMDScopeDescriptionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDSecurityConstraintsPropertyType() {
		if (mdSecurityConstraintsPropertyTypeEClass == null) {
			mdSecurityConstraintsPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(214);
		}
		return mdSecurityConstraintsPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDSecurityConstraintsPropertyType_MDSecurityConstraints() {
        return (EReference)getMDSecurityConstraintsPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSecurityConstraintsPropertyType_Actuate() {
        return (EAttribute)getMDSecurityConstraintsPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSecurityConstraintsPropertyType_Arcrole() {
        return (EAttribute)getMDSecurityConstraintsPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSecurityConstraintsPropertyType_Href() {
        return (EAttribute)getMDSecurityConstraintsPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSecurityConstraintsPropertyType_NilReason() {
        return (EAttribute)getMDSecurityConstraintsPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSecurityConstraintsPropertyType_Role() {
        return (EAttribute)getMDSecurityConstraintsPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSecurityConstraintsPropertyType_Show() {
        return (EAttribute)getMDSecurityConstraintsPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSecurityConstraintsPropertyType_Title() {
        return (EAttribute)getMDSecurityConstraintsPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSecurityConstraintsPropertyType_Type() {
        return (EAttribute)getMDSecurityConstraintsPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSecurityConstraintsPropertyType_Uuidref() {
        return (EAttribute)getMDSecurityConstraintsPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDSecurityConstraintsType() {
		if (mdSecurityConstraintsTypeEClass == null) {
			mdSecurityConstraintsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(215);
		}
		return mdSecurityConstraintsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDSecurityConstraintsType_Classification() {
        return (EReference)getMDSecurityConstraintsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDSecurityConstraintsType_UserNote() {
        return (EReference)getMDSecurityConstraintsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDSecurityConstraintsType_ClassificationSystem() {
        return (EReference)getMDSecurityConstraintsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDSecurityConstraintsType_HandlingDescription() {
        return (EReference)getMDSecurityConstraintsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDServiceIdentificationPropertyType() {
		if (mdServiceIdentificationPropertyTypeEClass == null) {
			mdServiceIdentificationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(216);
		}
		return mdServiceIdentificationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDServiceIdentificationPropertyType_MDServiceIdentification() {
        return (EReference)getMDServiceIdentificationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDServiceIdentificationPropertyType_Actuate() {
        return (EAttribute)getMDServiceIdentificationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDServiceIdentificationPropertyType_Arcrole() {
        return (EAttribute)getMDServiceIdentificationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDServiceIdentificationPropertyType_Href() {
        return (EAttribute)getMDServiceIdentificationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDServiceIdentificationPropertyType_NilReason() {
        return (EAttribute)getMDServiceIdentificationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDServiceIdentificationPropertyType_Role() {
        return (EAttribute)getMDServiceIdentificationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDServiceIdentificationPropertyType_Show() {
        return (EAttribute)getMDServiceIdentificationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDServiceIdentificationPropertyType_Title() {
        return (EAttribute)getMDServiceIdentificationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDServiceIdentificationPropertyType_Type() {
        return (EAttribute)getMDServiceIdentificationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDServiceIdentificationPropertyType_Uuidref() {
        return (EAttribute)getMDServiceIdentificationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDServiceIdentificationType() {
		if (mdServiceIdentificationTypeEClass == null) {
			mdServiceIdentificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(217);
		}
		return mdServiceIdentificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDSpatialRepresentationPropertyType() {
		if (mdSpatialRepresentationPropertyTypeEClass == null) {
			mdSpatialRepresentationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(218);
		}
		return mdSpatialRepresentationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSpatialRepresentationPropertyType_AbstractMDSpatialRepresentationGroup() {
        return (EAttribute)getMDSpatialRepresentationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDSpatialRepresentationPropertyType_AbstractMDSpatialRepresentation() {
        return (EReference)getMDSpatialRepresentationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSpatialRepresentationPropertyType_Actuate() {
        return (EAttribute)getMDSpatialRepresentationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSpatialRepresentationPropertyType_Arcrole() {
        return (EAttribute)getMDSpatialRepresentationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSpatialRepresentationPropertyType_Href() {
        return (EAttribute)getMDSpatialRepresentationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSpatialRepresentationPropertyType_NilReason() {
        return (EAttribute)getMDSpatialRepresentationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSpatialRepresentationPropertyType_Role() {
        return (EAttribute)getMDSpatialRepresentationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSpatialRepresentationPropertyType_Show() {
        return (EAttribute)getMDSpatialRepresentationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSpatialRepresentationPropertyType_Title() {
        return (EAttribute)getMDSpatialRepresentationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSpatialRepresentationPropertyType_Type() {
        return (EAttribute)getMDSpatialRepresentationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSpatialRepresentationPropertyType_Uuidref() {
        return (EAttribute)getMDSpatialRepresentationPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDSpatialRepresentationTypeCodePropertyType() {
		if (mdSpatialRepresentationTypeCodePropertyTypeEClass == null) {
			mdSpatialRepresentationTypeCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(219);
		}
		return mdSpatialRepresentationTypeCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDSpatialRepresentationTypeCodePropertyType_MDSpatialRepresentationTypeCode() {
        return (EReference)getMDSpatialRepresentationTypeCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDSpatialRepresentationTypeCodePropertyType_NilReason() {
        return (EAttribute)getMDSpatialRepresentationTypeCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDStandardOrderProcessPropertyType() {
		if (mdStandardOrderProcessPropertyTypeEClass == null) {
			mdStandardOrderProcessPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(220);
		}
		return mdStandardOrderProcessPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDStandardOrderProcessPropertyType_MDStandardOrderProcess() {
        return (EReference)getMDStandardOrderProcessPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDStandardOrderProcessPropertyType_Actuate() {
        return (EAttribute)getMDStandardOrderProcessPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDStandardOrderProcessPropertyType_Arcrole() {
        return (EAttribute)getMDStandardOrderProcessPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDStandardOrderProcessPropertyType_Href() {
        return (EAttribute)getMDStandardOrderProcessPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDStandardOrderProcessPropertyType_NilReason() {
        return (EAttribute)getMDStandardOrderProcessPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDStandardOrderProcessPropertyType_Role() {
        return (EAttribute)getMDStandardOrderProcessPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDStandardOrderProcessPropertyType_Show() {
        return (EAttribute)getMDStandardOrderProcessPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDStandardOrderProcessPropertyType_Title() {
        return (EAttribute)getMDStandardOrderProcessPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDStandardOrderProcessPropertyType_Type() {
        return (EAttribute)getMDStandardOrderProcessPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDStandardOrderProcessPropertyType_Uuidref() {
        return (EAttribute)getMDStandardOrderProcessPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDStandardOrderProcessType() {
		if (mdStandardOrderProcessTypeEClass == null) {
			mdStandardOrderProcessTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(221);
		}
		return mdStandardOrderProcessTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDStandardOrderProcessType_Fees() {
        return (EReference)getMDStandardOrderProcessType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDStandardOrderProcessType_PlannedAvailableDateTime() {
        return (EReference)getMDStandardOrderProcessType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDStandardOrderProcessType_OrderingInstructions() {
        return (EReference)getMDStandardOrderProcessType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDStandardOrderProcessType_Turnaround() {
        return (EReference)getMDStandardOrderProcessType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDTopicCategoryCodePropertyType() {
		if (mdTopicCategoryCodePropertyTypeEClass == null) {
			mdTopicCategoryCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(222);
		}
		return mdTopicCategoryCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDTopicCategoryCodePropertyType_MDTopicCategoryCode() {
        return (EAttribute)getMDTopicCategoryCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDTopicCategoryCodePropertyType_NilReason() {
        return (EAttribute)getMDTopicCategoryCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDTopologyLevelCodePropertyType() {
		if (mdTopologyLevelCodePropertyTypeEClass == null) {
			mdTopologyLevelCodePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(225);
		}
		return mdTopologyLevelCodePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDTopologyLevelCodePropertyType_MDTopologyLevelCode() {
        return (EReference)getMDTopologyLevelCodePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDTopologyLevelCodePropertyType_NilReason() {
        return (EAttribute)getMDTopologyLevelCodePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDUsagePropertyType() {
		if (mdUsagePropertyTypeEClass == null) {
			mdUsagePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(226);
		}
		return mdUsagePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDUsagePropertyType_MDUsage() {
        return (EReference)getMDUsagePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDUsagePropertyType_Actuate() {
        return (EAttribute)getMDUsagePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDUsagePropertyType_Arcrole() {
        return (EAttribute)getMDUsagePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDUsagePropertyType_Href() {
        return (EAttribute)getMDUsagePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDUsagePropertyType_NilReason() {
        return (EAttribute)getMDUsagePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDUsagePropertyType_Role() {
        return (EAttribute)getMDUsagePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDUsagePropertyType_Show() {
        return (EAttribute)getMDUsagePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDUsagePropertyType_Title() {
        return (EAttribute)getMDUsagePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDUsagePropertyType_Type() {
        return (EAttribute)getMDUsagePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDUsagePropertyType_Uuidref() {
        return (EAttribute)getMDUsagePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDUsageType() {
		if (mdUsageTypeEClass == null) {
			mdUsageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(227);
		}
		return mdUsageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDUsageType_SpecificUsage() {
        return (EReference)getMDUsageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDUsageType_UsageDateTime() {
        return (EReference)getMDUsageType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDUsageType_UserDeterminedLimitations() {
        return (EReference)getMDUsageType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDUsageType_UserContactInfo() {
        return (EReference)getMDUsageType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDVectorSpatialRepresentationPropertyType() {
		if (mdVectorSpatialRepresentationPropertyTypeEClass == null) {
			mdVectorSpatialRepresentationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(228);
		}
		return mdVectorSpatialRepresentationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDVectorSpatialRepresentationPropertyType_MDVectorSpatialRepresentation() {
        return (EReference)getMDVectorSpatialRepresentationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDVectorSpatialRepresentationPropertyType_Actuate() {
        return (EAttribute)getMDVectorSpatialRepresentationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDVectorSpatialRepresentationPropertyType_Arcrole() {
        return (EAttribute)getMDVectorSpatialRepresentationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDVectorSpatialRepresentationPropertyType_Href() {
        return (EAttribute)getMDVectorSpatialRepresentationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDVectorSpatialRepresentationPropertyType_NilReason() {
        return (EAttribute)getMDVectorSpatialRepresentationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDVectorSpatialRepresentationPropertyType_Role() {
        return (EAttribute)getMDVectorSpatialRepresentationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDVectorSpatialRepresentationPropertyType_Show() {
        return (EAttribute)getMDVectorSpatialRepresentationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDVectorSpatialRepresentationPropertyType_Title() {
        return (EAttribute)getMDVectorSpatialRepresentationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDVectorSpatialRepresentationPropertyType_Type() {
        return (EAttribute)getMDVectorSpatialRepresentationPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMDVectorSpatialRepresentationPropertyType_Uuidref() {
        return (EAttribute)getMDVectorSpatialRepresentationPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMDVectorSpatialRepresentationType() {
		if (mdVectorSpatialRepresentationTypeEClass == null) {
			mdVectorSpatialRepresentationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(229);
		}
		return mdVectorSpatialRepresentationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDVectorSpatialRepresentationType_TopologyLevel() {
        return (EReference)getMDVectorSpatialRepresentationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMDVectorSpatialRepresentationType_GeometricObjects() {
        return (EReference)getMDVectorSpatialRepresentationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPTFreeTextPropertyType() {
		if (ptFreeTextPropertyTypeEClass == null) {
			ptFreeTextPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(230);
		}
		return ptFreeTextPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPTFreeTextPropertyType_PTFreeText() {
        return (EReference)getPTFreeTextPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPTFreeTextType() {
		if (ptFreeTextTypeEClass == null) {
			ptFreeTextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(231);
		}
		return ptFreeTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPTFreeTextType_TextGroup() {
        return (EReference)getPTFreeTextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPTLocaleContainerPropertyType() {
		if (ptLocaleContainerPropertyTypeEClass == null) {
			ptLocaleContainerPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(232);
		}
		return ptLocaleContainerPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPTLocaleContainerPropertyType_PTLocaleContainer() {
        return (EReference)getPTLocaleContainerPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTLocaleContainerPropertyType_Actuate() {
        return (EAttribute)getPTLocaleContainerPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTLocaleContainerPropertyType_Arcrole() {
        return (EAttribute)getPTLocaleContainerPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTLocaleContainerPropertyType_Href() {
        return (EAttribute)getPTLocaleContainerPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTLocaleContainerPropertyType_NilReason() {
        return (EAttribute)getPTLocaleContainerPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTLocaleContainerPropertyType_Role() {
        return (EAttribute)getPTLocaleContainerPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTLocaleContainerPropertyType_Show() {
        return (EAttribute)getPTLocaleContainerPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTLocaleContainerPropertyType_Title() {
        return (EAttribute)getPTLocaleContainerPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTLocaleContainerPropertyType_Type() {
        return (EAttribute)getPTLocaleContainerPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTLocaleContainerPropertyType_Uuidref() {
        return (EAttribute)getPTLocaleContainerPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPTLocaleContainerType() {
		if (ptLocaleContainerTypeEClass == null) {
			ptLocaleContainerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(233);
		}
		return ptLocaleContainerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPTLocaleContainerType_Description() {
        return (EReference)getPTLocaleContainerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPTLocaleContainerType_Locale() {
        return (EReference)getPTLocaleContainerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPTLocaleContainerType_Date() {
        return (EReference)getPTLocaleContainerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPTLocaleContainerType_ResponsibleParty() {
        return (EReference)getPTLocaleContainerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPTLocaleContainerType_LocalisedString() {
        return (EReference)getPTLocaleContainerType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPTLocalePropertyType() {
		if (ptLocalePropertyTypeEClass == null) {
			ptLocalePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(234);
		}
		return ptLocalePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPTLocalePropertyType_PTLocale() {
        return (EReference)getPTLocalePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTLocalePropertyType_Actuate() {
        return (EAttribute)getPTLocalePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTLocalePropertyType_Arcrole() {
        return (EAttribute)getPTLocalePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTLocalePropertyType_Href() {
        return (EAttribute)getPTLocalePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTLocalePropertyType_NilReason() {
        return (EAttribute)getPTLocalePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTLocalePropertyType_Role() {
        return (EAttribute)getPTLocalePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTLocalePropertyType_Show() {
        return (EAttribute)getPTLocalePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTLocalePropertyType_Title() {
        return (EAttribute)getPTLocalePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTLocalePropertyType_Type() {
        return (EAttribute)getPTLocalePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPTLocalePropertyType_Uuidref() {
        return (EAttribute)getPTLocalePropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPTLocaleType() {
		if (ptLocaleTypeEClass == null) {
			ptLocaleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(235);
		}
		return ptLocaleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPTLocaleType_LanguageCode() {
        return (EReference)getPTLocaleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPTLocaleType_Country() {
        return (EReference)getPTLocaleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPTLocaleType_CharacterEncoding() {
        return (EReference)getPTLocaleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRSIdentifierPropertyType() {
		if (rsIdentifierPropertyTypeEClass == null) {
			rsIdentifierPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(236);
		}
		return rsIdentifierPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRSIdentifierPropertyType_RSIdentifier() {
        return (EReference)getRSIdentifierPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRSIdentifierPropertyType_Actuate() {
        return (EAttribute)getRSIdentifierPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRSIdentifierPropertyType_Arcrole() {
        return (EAttribute)getRSIdentifierPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRSIdentifierPropertyType_Href() {
        return (EAttribute)getRSIdentifierPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRSIdentifierPropertyType_NilReason() {
        return (EAttribute)getRSIdentifierPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRSIdentifierPropertyType_Role() {
        return (EAttribute)getRSIdentifierPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRSIdentifierPropertyType_Show() {
        return (EAttribute)getRSIdentifierPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRSIdentifierPropertyType_Title() {
        return (EAttribute)getRSIdentifierPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRSIdentifierPropertyType_Type() {
        return (EAttribute)getRSIdentifierPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRSIdentifierPropertyType_Uuidref() {
        return (EAttribute)getRSIdentifierPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRSIdentifierType() {
		if (rsIdentifierTypeEClass == null) {
			rsIdentifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(237);
		}
		return rsIdentifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRSIdentifierType_CodeSpace() {
        return (EReference)getRSIdentifierType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRSIdentifierType_Version() {
        return (EReference)getRSIdentifierType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRSReferenceSystemPropertyType() {
		if (rsReferenceSystemPropertyTypeEClass == null) {
			rsReferenceSystemPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(238);
		}
		return rsReferenceSystemPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRSReferenceSystemPropertyType_AbstractRSReferenceSystemGroup() {
        return (EAttribute)getRSReferenceSystemPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRSReferenceSystemPropertyType_AbstractRSReferenceSystem() {
        return (EReference)getRSReferenceSystemPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRSReferenceSystemPropertyType_Actuate() {
        return (EAttribute)getRSReferenceSystemPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRSReferenceSystemPropertyType_Arcrole() {
        return (EAttribute)getRSReferenceSystemPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRSReferenceSystemPropertyType_Href() {
        return (EAttribute)getRSReferenceSystemPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRSReferenceSystemPropertyType_NilReason() {
        return (EAttribute)getRSReferenceSystemPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRSReferenceSystemPropertyType_Role() {
        return (EAttribute)getRSReferenceSystemPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRSReferenceSystemPropertyType_Show() {
        return (EAttribute)getRSReferenceSystemPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRSReferenceSystemPropertyType_Title() {
        return (EAttribute)getRSReferenceSystemPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRSReferenceSystemPropertyType_Type() {
        return (EAttribute)getRSReferenceSystemPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRSReferenceSystemPropertyType_Uuidref() {
        return (EAttribute)getRSReferenceSystemPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getURLPropertyType() {
		if (urlPropertyTypeEClass == null) {
			urlPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(239);
		}
		return urlPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getURLPropertyType_URL() {
        return (EAttribute)getURLPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getURLPropertyType_NilReason() {
        return (EAttribute)getURLPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMDObligationCodeType() {
		if (mdObligationCodeTypeEEnum == null) {
			mdObligationCodeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(194);
		}
		return mdObligationCodeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMDPixelOrientationCodeType() {
		if (mdPixelOrientationCodeTypeEEnum == null) {
			mdPixelOrientationCodeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(197);
		}
		return mdPixelOrientationCodeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMDTopicCategoryCodeType() {
		if (mdTopicCategoryCodeTypeEEnum == null) {
			mdTopicCategoryCodeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(223);
		}
		return mdTopicCategoryCodeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMDObligationCodeTypeObject() {
		if (mdObligationCodeTypeObjectEDataType == null) {
			mdObligationCodeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(195);
		}
		return mdObligationCodeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMDPixelOrientationCodeTypeObject() {
		if (mdPixelOrientationCodeTypeObjectEDataType == null) {
			mdPixelOrientationCodeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(198);
		}
		return mdPixelOrientationCodeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMDTopicCategoryCodeTypeObject() {
		if (mdTopicCategoryCodeTypeObjectEDataType == null) {
			mdTopicCategoryCodeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(GMDPackage.eNS_URI).getEClassifiers().get(224);
		}
		return mdTopicCategoryCodeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GMDFactory getGMDFactory() {
		return (GMDFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Loads the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.isotc211._2005.gmd." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //GMDPackageImpl
