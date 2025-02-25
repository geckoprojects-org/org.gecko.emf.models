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
package org.openmicroscopy.ome.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.openmicroscopy.ome.OMEFactory;
import org.openmicroscopy.ome.OMEPackage;

import org.openmicroscopy.ome.util.OMEValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OMEPackageImpl extends EPackageImpl implements OMEPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "ome.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affineTransformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryFileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOnlyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanAnnotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentAnnotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detectorSettingsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dichroicRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dichroicTypeEClass = null;

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
	private EClass doubleAnnotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ellipseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimenterGroupRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimenterGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimenterRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimenterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filamentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileAnnotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterSetRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericExcitationSourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingEnvironmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instrumentRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instrumentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laserTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leaderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightEmittingDiodeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightPathTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSourceSettingsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listAnnotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longAnnotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manufacturerSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapAnnotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maskTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microbeamManipulationRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microbeamManipulationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microscopeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveSettingsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass omeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pixelsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plateAcquisitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plateRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polylineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pumpTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reagentRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reagentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roiRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roiTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageLabelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredAnnotationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagAnnotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termAnnotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tiffDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timestampAnnotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transmittanceRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uuidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wellSampleRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wellSampleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wellTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlAnnotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum acquisitionModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binningEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compressionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compressionType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contrastMethodTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum correctionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dimensionOrderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fillRuleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontFamilyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontFamilyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontStyleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum illuminationTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum immersionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum laserMediumTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum markerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mediumTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum namingConventionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pixelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pulseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType3EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType4EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType5EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType6EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType7EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeTypeItemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeTypeItem1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitsAngleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitsElectricPotentialEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitsFrequencyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitsLengthEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitsPowerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitsPressureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitsTemperatureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitsTimeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType acquisitionModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType annotationIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType base64BinaryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType binningObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType channelIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType compressionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType compressionTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contrastMethodTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType correctionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datasetIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType descriptionTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType descriptionType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType descriptionType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType descriptionType3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType descriptionType4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType descriptionType5EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType descriptionType6EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType descriptionType7EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType descriptionType8EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType descriptionType9EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType descriptionType10EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType descriptionType11EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType descriptionType12EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType detectorIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dichroicIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dimensionOrderTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType experimenterGroupIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType experimenterIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType experimentIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fillRuleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType filterIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType filterSetIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType folderIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontFamilyObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontFamilyTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontStyleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hex40EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType illuminationTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType imageIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType immersionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType instrumentIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType laserMediumTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lengthTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lengthTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lightSourceIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lsidEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType markerObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mediumTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType microbeamManipulationIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType moduleIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType namingConventionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeFloatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeFloatObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeIntEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeIntObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeLongEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeLongObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectiveIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType percentFractionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType percentFractionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pixelsIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pixelTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType plateAcquisitionIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType plateIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveFloatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveFloatObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveIntEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveIntObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType projectIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pulseTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reagentIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rightsHeldTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rightsHolderTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType roiidEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType screenIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shapeIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeItemObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeItemObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject5EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitsAngleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitsElectricPotentialObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitsFrequencyObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitsLengthObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitsPowerObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitsPressureObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitsTemperatureObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitsTimeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType universallyUniqueIdentifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType wellIDEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType wellSampleIDEDataType = null;

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
	 * @see org.openmicroscopy.ome.OMEPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OMEPackageImpl() {
		super(eNS_URI, OMEFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OMEPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static OMEPackage init() {
		if (isInited) return (OMEPackage)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOMEPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OMEPackageImpl theOMEPackage = registeredOMEPackage instanceof OMEPackageImpl ? (OMEPackageImpl)registeredOMEPackage : new OMEPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Load packages
		theOMEPackage.loadPackage();

		// Fix loaded packages
		theOMEPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOMEPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return OMEValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOMEPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OMEPackage.eNS_URI, theOMEPackage);
		return theOMEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAffineTransform() {
		if (affineTransformEClass == null) {
			affineTransformEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(2);
		}
		return affineTransformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffineTransform_A00() {
        return (EAttribute)getAffineTransform().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffineTransform_A01() {
        return (EAttribute)getAffineTransform().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffineTransform_A02() {
        return (EAttribute)getAffineTransform().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffineTransform_A10() {
        return (EAttribute)getAffineTransform().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffineTransform_A11() {
        return (EAttribute)getAffineTransform().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffineTransform_A12() {
        return (EAttribute)getAffineTransform().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotation() {
		if (annotationEClass == null) {
			annotationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(3);
		}
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotation_Description() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotation_AnnotationRef() {
        return (EReference)getAnnotation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotation_Annotator() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotation_ID() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotation_Namespace() {
        return (EAttribute)getAnnotation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationRefType() {
		if (annotationRefTypeEClass == null) {
			annotationRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(5);
		}
		return annotationRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationRefType_ID() {
        return (EAttribute)getAnnotationRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArcType() {
		if (arcTypeEClass == null) {
			arcTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(6);
		}
		return arcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArcType_Type() {
        return (EAttribute)getArcType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicAnnotation() {
		if (basicAnnotationEClass == null) {
			basicAnnotationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(8);
		}
		return basicAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryFileType() {
		if (binaryFileTypeEClass == null) {
			binaryFileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(9);
		}
		return binaryFileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryFileType_External() {
        return (EReference)getBinaryFileType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryFileType_BinData() {
        return (EReference)getBinaryFileType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryFileType_FileName() {
        return (EAttribute)getBinaryFileType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryFileType_MIMEType() {
        return (EAttribute)getBinaryFileType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryFileType_Size() {
        return (EAttribute)getBinaryFileType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryOnlyType() {
		if (binaryOnlyTypeEClass == null) {
			binaryOnlyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(10);
		}
		return binaryOnlyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryOnlyType_MetadataFile() {
        return (EAttribute)getBinaryOnlyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryOnlyType_UUID() {
        return (EAttribute)getBinaryOnlyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinDataType() {
		if (binDataTypeEClass == null) {
			binDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(11);
		}
		return binDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinDataType_Value() {
        return (EAttribute)getBinDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinDataType_BigEndian() {
        return (EAttribute)getBinDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinDataType_Compression() {
        return (EAttribute)getBinDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinDataType_Length() {
        return (EAttribute)getBinDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanAnnotationType() {
		if (booleanAnnotationTypeEClass == null) {
			booleanAnnotationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(14);
		}
		return booleanAnnotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanAnnotationType_Value() {
        return (EAttribute)getBooleanAnnotationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChannelRefType() {
		if (channelRefTypeEClass == null) {
			channelRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(16);
		}
		return channelRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelRefType_ID() {
        return (EAttribute)getChannelRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChannelType() {
		if (channelTypeEClass == null) {
			channelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(17);
		}
		return channelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannelType_LightSourceSettings() {
        return (EReference)getChannelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannelType_DetectorSettings() {
        return (EReference)getChannelType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannelType_FilterSetRef() {
        return (EReference)getChannelType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannelType_AnnotationRef() {
        return (EReference)getChannelType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChannelType_LightPath() {
        return (EReference)getChannelType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelType_AcquisitionMode() {
        return (EAttribute)getChannelType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelType_Color() {
        return (EAttribute)getChannelType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelType_ContrastMethod() {
        return (EAttribute)getChannelType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelType_EmissionWavelength() {
        return (EAttribute)getChannelType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelType_EmissionWavelengthUnit() {
        return (EAttribute)getChannelType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelType_ExcitationWavelength() {
        return (EAttribute)getChannelType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelType_ExcitationWavelengthUnit() {
        return (EAttribute)getChannelType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelType_Fluor() {
        return (EAttribute)getChannelType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelType_ID() {
        return (EAttribute)getChannelType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelType_IlluminationType() {
        return (EAttribute)getChannelType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelType_Name() {
        return (EAttribute)getChannelType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelType_NDFilter() {
        return (EAttribute)getChannelType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelType_PinholeSize() {
        return (EAttribute)getChannelType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelType_PinholeSizeUnit() {
        return (EAttribute)getChannelType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelType_PockelCellSetting() {
        return (EAttribute)getChannelType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChannelType_SamplesPerPixel() {
        return (EAttribute)getChannelType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommentAnnotationType() {
		if (commentAnnotationTypeEClass == null) {
			commentAnnotationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(20);
		}
		return commentAnnotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommentAnnotationType_Value() {
        return (EAttribute)getCommentAnnotationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatasetRefType() {
		if (datasetRefTypeEClass == null) {
			datasetRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(30);
		}
		return datasetRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasetRefType_ID() {
        return (EAttribute)getDatasetRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatasetType() {
		if (datasetTypeEClass == null) {
			datasetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(31);
		}
		return datasetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasetType_Description() {
        return (EAttribute)getDatasetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_ExperimenterRef() {
        return (EReference)getDatasetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_ExperimenterGroupRef() {
        return (EReference)getDatasetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_ImageRef() {
        return (EReference)getDatasetType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetType_AnnotationRef() {
        return (EReference)getDatasetType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasetType_ID() {
        return (EAttribute)getDatasetType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasetType_Name() {
        return (EAttribute)getDatasetType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDetectorSettingsType() {
		if (detectorSettingsTypeEClass == null) {
			detectorSettingsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(46);
		}
		return detectorSettingsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetectorSettingsType_Binning() {
        return (EAttribute)getDetectorSettingsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetectorSettingsType_Gain() {
        return (EAttribute)getDetectorSettingsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetectorSettingsType_ID() {
        return (EAttribute)getDetectorSettingsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetectorSettingsType_Integration() {
        return (EAttribute)getDetectorSettingsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetectorSettingsType_Offset() {
        return (EAttribute)getDetectorSettingsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetectorSettingsType_ReadOutRate() {
        return (EAttribute)getDetectorSettingsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetectorSettingsType_ReadOutRateUnit() {
        return (EAttribute)getDetectorSettingsType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetectorSettingsType_Voltage() {
        return (EAttribute)getDetectorSettingsType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetectorSettingsType_VoltageUnit() {
        return (EAttribute)getDetectorSettingsType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetectorSettingsType_Zoom() {
        return (EAttribute)getDetectorSettingsType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDetectorType() {
		if (detectorTypeEClass == null) {
			detectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(47);
		}
		return detectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDetectorType_AnnotationRef() {
        return (EReference)getDetectorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetectorType_AmplificationGain() {
        return (EAttribute)getDetectorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetectorType_Gain() {
        return (EAttribute)getDetectorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetectorType_ID() {
        return (EAttribute)getDetectorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetectorType_Offset() {
        return (EAttribute)getDetectorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetectorType_Type() {
        return (EAttribute)getDetectorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetectorType_Voltage() {
        return (EAttribute)getDetectorType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetectorType_VoltageUnit() {
        return (EAttribute)getDetectorType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDetectorType_Zoom() {
        return (EAttribute)getDetectorType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDichroicRefType() {
		if (dichroicRefTypeEClass == null) {
			dichroicRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(49);
		}
		return dichroicRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDichroicRefType_ID() {
        return (EAttribute)getDichroicRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDichroicType() {
		if (dichroicTypeEClass == null) {
			dichroicTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(50);
		}
		return dichroicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDichroicType_AnnotationRef() {
        return (EReference)getDichroicType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDichroicType_ID() {
        return (EAttribute)getDichroicType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(53);
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
	public EReference getDocumentRoot_AnnotationRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Arc() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LightSourceGroup() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_BinaryFile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_BinData() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_BooleanAnnotation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Channel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ChannelRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CommentAnnotation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Dataset() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DatasetRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Detector() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DetectorSettings() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Dichroic() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DichroicRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DoubleAnnotation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Ellipse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ShapeGroup() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Experiment() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Experimenter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ExperimenterGroup() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ExperimenterGroupRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ExperimenterRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ExperimentRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_External() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Filament() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_FileAnnotation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Filter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_FilterSet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_FilterSetRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Folder() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_FolderRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GenericExcitationSource() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Image() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ImageRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ImagingEnvironment() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Instrument() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_InstrumentRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Label() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Laser() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Leader() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LightEmittingDiode() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LightPath() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LightSourceSettings() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Line() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ListAnnotation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LongAnnotation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MapAnnotation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Mask() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MetadataOnly() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MicrobeamManipulation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MicrobeamManipulationRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Microscope() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Objective() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ObjectiveSettings() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_OME() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Pixels() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Plane() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Plate() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PlateAcquisition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Point() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Polygon() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Polyline() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Project() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ProjectRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Pump() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Reagent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ReagentRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Rectangle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Rights() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ROI() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ROIRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Screen() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_StageLabel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_StructuredAnnotations() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_TagAnnotation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_TermAnnotation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_TiffData() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_TimestampAnnotation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_TransmittanceRange() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Well() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_WellSample() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_WellSampleRef() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLAnnotation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoubleAnnotationType() {
		if (doubleAnnotationTypeEClass == null) {
			doubleAnnotationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(54);
		}
		return doubleAnnotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoubleAnnotationType_Value() {
        return (EAttribute)getDoubleAnnotationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEllipseType() {
		if (ellipseTypeEClass == null) {
			ellipseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(55);
		}
		return ellipseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEllipseType_RadiusX() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEllipseType_RadiusY() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEllipseType_X() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEllipseType_Y() {
        return (EAttribute)getEllipseType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExperimenterGroupRefType() {
		if (experimenterGroupRefTypeEClass == null) {
			experimenterGroupRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(57);
		}
		return experimenterGroupRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimenterGroupRefType_ID() {
        return (EAttribute)getExperimenterGroupRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExperimenterGroupType() {
		if (experimenterGroupTypeEClass == null) {
			experimenterGroupTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(58);
		}
		return experimenterGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimenterGroupType_Description() {
        return (EAttribute)getExperimenterGroupType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExperimenterGroupType_ExperimenterRef() {
        return (EReference)getExperimenterGroupType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExperimenterGroupType_Leader() {
        return (EReference)getExperimenterGroupType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExperimenterGroupType_AnnotationRef() {
        return (EReference)getExperimenterGroupType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimenterGroupType_ID() {
        return (EAttribute)getExperimenterGroupType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimenterGroupType_Name() {
        return (EAttribute)getExperimenterGroupType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExperimenterRefType() {
		if (experimenterRefTypeEClass == null) {
			experimenterRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(60);
		}
		return experimenterRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimenterRefType_ID() {
        return (EAttribute)getExperimenterRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExperimenterType() {
		if (experimenterTypeEClass == null) {
			experimenterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(61);
		}
		return experimenterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExperimenterType_AnnotationRef() {
        return (EReference)getExperimenterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimenterType_Email() {
        return (EAttribute)getExperimenterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimenterType_FirstName() {
        return (EAttribute)getExperimenterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimenterType_ID() {
        return (EAttribute)getExperimenterType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimenterType_Institution() {
        return (EAttribute)getExperimenterType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimenterType_LastName() {
        return (EAttribute)getExperimenterType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimenterType_MiddleName() {
        return (EAttribute)getExperimenterType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimenterType_UserName() {
        return (EAttribute)getExperimenterType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExperimentRefType() {
		if (experimentRefTypeEClass == null) {
			experimentRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(63);
		}
		return experimentRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimentRefType_ID() {
        return (EAttribute)getExperimentRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExperimentType() {
		if (experimentTypeEClass == null) {
			experimentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(64);
		}
		return experimentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimentType_Description() {
        return (EAttribute)getExperimentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExperimentType_ExperimenterRef() {
        return (EReference)getExperimentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExperimentType_MicrobeamManipulation() {
        return (EReference)getExperimentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimentType_ID() {
        return (EAttribute)getExperimentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExperimentType_Type() {
        return (EAttribute)getExperimentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalType() {
		if (externalTypeEClass == null) {
			externalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(65);
		}
		return externalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalType_Compression() {
        return (EAttribute)getExternalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalType_Href() {
        return (EAttribute)getExternalType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalType_SHA1() {
        return (EAttribute)getExternalType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilamentType() {
		if (filamentTypeEClass == null) {
			filamentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(66);
		}
		return filamentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilamentType_Type() {
        return (EAttribute)getFilamentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileAnnotationType() {
		if (fileAnnotationTypeEClass == null) {
			fileAnnotationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(67);
		}
		return fileAnnotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFileAnnotationType_BinaryFile() {
        return (EReference)getFileAnnotationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilterRef() {
		if (filterRefEClass == null) {
			filterRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(71);
		}
		return filterRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterRef_ID() {
        return (EAttribute)getFilterRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilterSetRefType() {
		if (filterSetRefTypeEClass == null) {
			filterSetRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(73);
		}
		return filterSetRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterSetRefType_ID() {
        return (EAttribute)getFilterSetRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilterSetType() {
		if (filterSetTypeEClass == null) {
			filterSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(74);
		}
		return filterSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterSetType_ExcitationFilterRef() {
        return (EReference)getFilterSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterSetType_DichroicRef() {
        return (EReference)getFilterSetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterSetType_EmissionFilterRef() {
        return (EReference)getFilterSetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterSetType_ID() {
        return (EAttribute)getFilterSetType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilterType() {
		if (filterTypeEClass == null) {
			filterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(75);
		}
		return filterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterType_TransmittanceRange() {
        return (EReference)getFilterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterType_AnnotationRef() {
        return (EReference)getFilterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterType_FilterWheel() {
        return (EAttribute)getFilterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterType_ID() {
        return (EAttribute)getFilterType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterType_Type() {
        return (EAttribute)getFilterType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFolderRefType() {
		if (folderRefTypeEClass == null) {
			folderRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(77);
		}
		return folderRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFolderRefType_ID() {
        return (EAttribute)getFolderRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFolderType() {
		if (folderTypeEClass == null) {
			folderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(78);
		}
		return folderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFolderType_Description() {
        return (EAttribute)getFolderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFolderType_FolderRef() {
        return (EReference)getFolderType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFolderType_ImageRef() {
        return (EReference)getFolderType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFolderType_ROIRef() {
        return (EReference)getFolderType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFolderType_AnnotationRef() {
        return (EReference)getFolderType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFolderType_ID() {
        return (EAttribute)getFolderType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFolderType_Name() {
        return (EAttribute)getFolderType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenericExcitationSourceType() {
		if (genericExcitationSourceTypeEClass == null) {
			genericExcitationSourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(85);
		}
		return genericExcitationSourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGenericExcitationSourceType_Map() {
        return (EReference)getGenericExcitationSourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImageRefType() {
		if (imageRefTypeEClass == null) {
			imageRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(90);
		}
		return imageRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageRefType_ID() {
        return (EAttribute)getImageRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImageType() {
		if (imageTypeEClass == null) {
			imageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(91);
		}
		return imageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageType_AcquisitionDate() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageType_ExperimenterRef() {
        return (EReference)getImageType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageType_Description() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageType_ExperimentRef() {
        return (EReference)getImageType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageType_ExperimenterGroupRef() {
        return (EReference)getImageType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageType_InstrumentRef() {
        return (EReference)getImageType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageType_ObjectiveSettings() {
        return (EReference)getImageType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageType_ImagingEnvironment() {
        return (EReference)getImageType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageType_StageLabel() {
        return (EReference)getImageType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageType_Pixels() {
        return (EReference)getImageType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageType_ROIRef() {
        return (EReference)getImageType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageType_MicrobeamManipulationRef() {
        return (EReference)getImageType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImageType_AnnotationRef() {
        return (EReference)getImageType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageType_ID() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageType_Name() {
        return (EAttribute)getImageType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImagingEnvironmentType() {
		if (imagingEnvironmentTypeEClass == null) {
			imagingEnvironmentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(92);
		}
		return imagingEnvironmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImagingEnvironmentType_Map() {
        return (EReference)getImagingEnvironmentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImagingEnvironmentType_AirPressure() {
        return (EAttribute)getImagingEnvironmentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImagingEnvironmentType_AirPressureUnit() {
        return (EAttribute)getImagingEnvironmentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImagingEnvironmentType_CO2Percent() {
        return (EAttribute)getImagingEnvironmentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImagingEnvironmentType_Humidity() {
        return (EAttribute)getImagingEnvironmentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImagingEnvironmentType_Temperature() {
        return (EAttribute)getImagingEnvironmentType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImagingEnvironmentType_TemperatureUnit() {
        return (EAttribute)getImagingEnvironmentType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstrumentRefType() {
		if (instrumentRefTypeEClass == null) {
			instrumentRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(96);
		}
		return instrumentRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstrumentRefType_ID() {
        return (EAttribute)getInstrumentRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstrumentType() {
		if (instrumentTypeEClass == null) {
			instrumentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(97);
		}
		return instrumentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstrumentType_Microscope() {
        return (EReference)getInstrumentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstrumentType_LightSourceGroupGroup() {
        return (EAttribute)getInstrumentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstrumentType_LightSourceGroup() {
        return (EReference)getInstrumentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstrumentType_Detector() {
        return (EReference)getInstrumentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstrumentType_Objective() {
        return (EReference)getInstrumentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstrumentType_FilterSet() {
        return (EReference)getInstrumentType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstrumentType_Filter() {
        return (EReference)getInstrumentType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstrumentType_Dichroic() {
        return (EReference)getInstrumentType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstrumentType_AnnotationRef() {
        return (EReference)getInstrumentType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstrumentType_ID() {
        return (EAttribute)getInstrumentType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelType() {
		if (labelTypeEClass == null) {
			labelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(98);
		}
		return labelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelType_X() {
        return (EAttribute)getLabelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelType_Y() {
        return (EAttribute)getLabelType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLaserType() {
		if (laserTypeEClass == null) {
			laserTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(101);
		}
		return laserTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLaserType_Pump() {
        return (EReference)getLaserType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLaserType_FrequencyMultiplication() {
        return (EAttribute)getLaserType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLaserType_LaserMedium() {
        return (EAttribute)getLaserType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLaserType_PockelCell() {
        return (EAttribute)getLaserType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLaserType_Pulse() {
        return (EAttribute)getLaserType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLaserType_RepetitionRate() {
        return (EAttribute)getLaserType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLaserType_RepetitionRateUnit() {
        return (EAttribute)getLaserType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLaserType_Tuneable() {
        return (EAttribute)getLaserType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLaserType_Type() {
        return (EAttribute)getLaserType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLaserType_Wavelength() {
        return (EAttribute)getLaserType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLaserType_WavelengthUnit() {
        return (EAttribute)getLaserType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLeaderType() {
		if (leaderTypeEClass == null) {
			leaderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(102);
		}
		return leaderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLeaderType_ID() {
        return (EAttribute)getLeaderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLightEmittingDiodeType() {
		if (lightEmittingDiodeTypeEClass == null) {
			lightEmittingDiodeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(105);
		}
		return lightEmittingDiodeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLightPathType() {
		if (lightPathTypeEClass == null) {
			lightPathTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(106);
		}
		return lightPathTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLightPathType_ExcitationFilterRef() {
        return (EReference)getLightPathType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLightPathType_DichroicRef() {
        return (EReference)getLightPathType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLightPathType_EmissionFilterRef() {
        return (EReference)getLightPathType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLightPathType_AnnotationRef() {
        return (EReference)getLightPathType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLightSource() {
		if (lightSourceEClass == null) {
			lightSourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(107);
		}
		return lightSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLightSource_AnnotationRef() {
        return (EReference)getLightSource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLightSource_ID() {
        return (EAttribute)getLightSource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLightSource_Power() {
        return (EAttribute)getLightSource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLightSource_PowerUnit() {
        return (EAttribute)getLightSource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLightSourceSettingsType() {
		if (lightSourceSettingsTypeEClass == null) {
			lightSourceSettingsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(109);
		}
		return lightSourceSettingsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLightSourceSettingsType_Attenuation() {
        return (EAttribute)getLightSourceSettingsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLightSourceSettingsType_ID() {
        return (EAttribute)getLightSourceSettingsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLightSourceSettingsType_Wavelength() {
        return (EAttribute)getLightSourceSettingsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLightSourceSettingsType_WavelengthUnit() {
        return (EAttribute)getLightSourceSettingsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineType() {
		if (lineTypeEClass == null) {
			lineTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(110);
		}
		return lineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineType_MarkerEnd() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineType_MarkerStart() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineType_X1() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineType_X2() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineType_Y1() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineType_Y2() {
        return (EAttribute)getLineType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListAnnotationType() {
		if (listAnnotationTypeEClass == null) {
			listAnnotationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(111);
		}
		return listAnnotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLongAnnotationType() {
		if (longAnnotationTypeEClass == null) {
			longAnnotationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(112);
		}
		return longAnnotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLongAnnotationType_Value() {
        return (EAttribute)getLongAnnotationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManufacturerSpec() {
		if (manufacturerSpecEClass == null) {
			manufacturerSpecEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(114);
		}
		return manufacturerSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManufacturerSpec_LotNumber() {
        return (EAttribute)getManufacturerSpec().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManufacturerSpec_Manufacturer() {
        return (EAttribute)getManufacturerSpec().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManufacturerSpec_Model() {
        return (EAttribute)getManufacturerSpec().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManufacturerSpec_SerialNumber() {
        return (EAttribute)getManufacturerSpec().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMap() {
		if (mapEClass == null) {
			mapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(115);
		}
		return mapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMap_M() {
        return (EReference)getMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMapAnnotationType() {
		if (mapAnnotationTypeEClass == null) {
			mapAnnotationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(116);
		}
		return mapAnnotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapAnnotationType_Value() {
        return (EReference)getMapAnnotationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaskType() {
		if (maskTypeEClass == null) {
			maskTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(119);
		}
		return maskTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMaskType_BinData() {
        return (EReference)getMaskType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaskType_Height() {
        return (EAttribute)getMaskType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaskType_Width() {
        return (EAttribute)getMaskType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaskType_X() {
        return (EAttribute)getMaskType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaskType_Y() {
        return (EAttribute)getMaskType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMicrobeamManipulationRefType() {
		if (microbeamManipulationRefTypeEClass == null) {
			microbeamManipulationRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(123);
		}
		return microbeamManipulationRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMicrobeamManipulationRefType_ID() {
        return (EAttribute)getMicrobeamManipulationRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMicrobeamManipulationType() {
		if (microbeamManipulationTypeEClass == null) {
			microbeamManipulationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(124);
		}
		return microbeamManipulationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMicrobeamManipulationType_Description() {
        return (EAttribute)getMicrobeamManipulationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMicrobeamManipulationType_ROIRef() {
        return (EReference)getMicrobeamManipulationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMicrobeamManipulationType_ExperimenterRef() {
        return (EReference)getMicrobeamManipulationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMicrobeamManipulationType_LightSourceSettings() {
        return (EReference)getMicrobeamManipulationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMicrobeamManipulationType_ID() {
        return (EAttribute)getMicrobeamManipulationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMicrobeamManipulationType_Type() {
        return (EAttribute)getMicrobeamManipulationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMicroscopeType() {
		if (microscopeTypeEClass == null) {
			microscopeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(125);
		}
		return microscopeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMicroscopeType_Type() {
        return (EAttribute)getMicroscopeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMType() {
		if (mTypeEClass == null) {
			mTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(127);
		}
		return mTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMType_Value() {
        return (EAttribute)getMType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMType_K() {
        return (EAttribute)getMType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericAnnotation() {
		if (numericAnnotationEClass == null) {
			numericAnnotationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(136);
		}
		return numericAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectiveSettingsType() {
		if (objectiveSettingsTypeEClass == null) {
			objectiveSettingsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(138);
		}
		return objectiveSettingsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectiveSettingsType_CorrectionCollar() {
        return (EAttribute)getObjectiveSettingsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectiveSettingsType_ID() {
        return (EAttribute)getObjectiveSettingsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectiveSettingsType_Medium() {
        return (EAttribute)getObjectiveSettingsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectiveSettingsType_RefractiveIndex() {
        return (EAttribute)getObjectiveSettingsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectiveType() {
		if (objectiveTypeEClass == null) {
			objectiveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(139);
		}
		return objectiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectiveType_AnnotationRef() {
        return (EReference)getObjectiveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectiveType_CalibratedMagnification() {
        return (EAttribute)getObjectiveType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectiveType_Correction() {
        return (EAttribute)getObjectiveType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectiveType_ID() {
        return (EAttribute)getObjectiveType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectiveType_Immersion() {
        return (EAttribute)getObjectiveType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectiveType_Iris() {
        return (EAttribute)getObjectiveType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectiveType_LensNA() {
        return (EAttribute)getObjectiveType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectiveType_NominalMagnification() {
        return (EAttribute)getObjectiveType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectiveType_WorkingDistance() {
        return (EAttribute)getObjectiveType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectiveType_WorkingDistanceUnit() {
        return (EAttribute)getObjectiveType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOMEType() {
		if (omeTypeEClass == null) {
			omeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(140);
		}
		return omeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOMEType_Rights() {
        return (EReference)getOMEType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOMEType_Project() {
        return (EReference)getOMEType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOMEType_Dataset() {
        return (EReference)getOMEType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOMEType_Folder() {
        return (EReference)getOMEType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOMEType_Experiment() {
        return (EReference)getOMEType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOMEType_Plate() {
        return (EReference)getOMEType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOMEType_Screen() {
        return (EReference)getOMEType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOMEType_Experimenter() {
        return (EReference)getOMEType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOMEType_ExperimenterGroup() {
        return (EReference)getOMEType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOMEType_Instrument() {
        return (EReference)getOMEType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOMEType_Image() {
        return (EReference)getOMEType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOMEType_StructuredAnnotations() {
        return (EReference)getOMEType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOMEType_ROI() {
        return (EReference)getOMEType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOMEType_BinaryOnly() {
        return (EReference)getOMEType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOMEType_Creator() {
        return (EAttribute)getOMEType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOMEType_UUID() {
        return (EAttribute)getOMEType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPixelsType() {
		if (pixelsTypeEClass == null) {
			pixelsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(144);
		}
		return pixelsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPixelsType_Channel() {
        return (EReference)getPixelsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPixelsType_BinData() {
        return (EReference)getPixelsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPixelsType_TiffData() {
        return (EReference)getPixelsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPixelsType_MetadataOnly() {
        return (EReference)getPixelsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPixelsType_Plane() {
        return (EReference)getPixelsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixelsType_BigEndian() {
        return (EAttribute)getPixelsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixelsType_DimensionOrder() {
        return (EAttribute)getPixelsType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixelsType_ID() {
        return (EAttribute)getPixelsType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixelsType_Interleaved() {
        return (EAttribute)getPixelsType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixelsType_PhysicalSizeX() {
        return (EAttribute)getPixelsType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixelsType_PhysicalSizeXUnit() {
        return (EAttribute)getPixelsType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixelsType_PhysicalSizeY() {
        return (EAttribute)getPixelsType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixelsType_PhysicalSizeYUnit() {
        return (EAttribute)getPixelsType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixelsType_PhysicalSizeZ() {
        return (EAttribute)getPixelsType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixelsType_PhysicalSizeZUnit() {
        return (EAttribute)getPixelsType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixelsType_SignificantBits() {
        return (EAttribute)getPixelsType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixelsType_SizeC() {
        return (EAttribute)getPixelsType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixelsType_SizeT() {
        return (EAttribute)getPixelsType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixelsType_SizeX() {
        return (EAttribute)getPixelsType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixelsType_SizeY() {
        return (EAttribute)getPixelsType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixelsType_SizeZ() {
        return (EAttribute)getPixelsType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixelsType_TimeIncrement() {
        return (EAttribute)getPixelsType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixelsType_TimeIncrementUnit() {
        return (EAttribute)getPixelsType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPixelsType_Type() {
        return (EAttribute)getPixelsType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlaneType() {
		if (planeTypeEClass == null) {
			planeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(147);
		}
		return planeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaneType_HashSHA1() {
        return (EAttribute)getPlaneType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlaneType_AnnotationRef() {
        return (EReference)getPlaneType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaneType_DeltaT() {
        return (EAttribute)getPlaneType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaneType_DeltaTUnit() {
        return (EAttribute)getPlaneType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaneType_ExposureTime() {
        return (EAttribute)getPlaneType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaneType_ExposureTimeUnit() {
        return (EAttribute)getPlaneType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaneType_PositionX() {
        return (EAttribute)getPlaneType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaneType_PositionXUnit() {
        return (EAttribute)getPlaneType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaneType_PositionY() {
        return (EAttribute)getPlaneType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaneType_PositionYUnit() {
        return (EAttribute)getPlaneType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaneType_PositionZ() {
        return (EAttribute)getPlaneType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaneType_PositionZUnit() {
        return (EAttribute)getPlaneType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaneType_TheC() {
        return (EAttribute)getPlaneType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaneType_TheT() {
        return (EAttribute)getPlaneType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaneType_TheZ() {
        return (EAttribute)getPlaneType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlateAcquisitionType() {
		if (plateAcquisitionTypeEClass == null) {
			plateAcquisitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(149);
		}
		return plateAcquisitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateAcquisitionType_Description() {
        return (EAttribute)getPlateAcquisitionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlateAcquisitionType_WellSampleRef() {
        return (EReference)getPlateAcquisitionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlateAcquisitionType_AnnotationRef() {
        return (EReference)getPlateAcquisitionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateAcquisitionType_EndTime() {
        return (EAttribute)getPlateAcquisitionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateAcquisitionType_ID() {
        return (EAttribute)getPlateAcquisitionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateAcquisitionType_MaximumFieldCount() {
        return (EAttribute)getPlateAcquisitionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateAcquisitionType_Name() {
        return (EAttribute)getPlateAcquisitionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateAcquisitionType_StartTime() {
        return (EAttribute)getPlateAcquisitionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlateRefType() {
		if (plateRefTypeEClass == null) {
			plateRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(151);
		}
		return plateRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateRefType_ID() {
        return (EAttribute)getPlateRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlateType() {
		if (plateTypeEClass == null) {
			plateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(152);
		}
		return plateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateType_Description() {
        return (EAttribute)getPlateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlateType_Well() {
        return (EReference)getPlateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlateType_AnnotationRef() {
        return (EReference)getPlateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlateType_PlateAcquisition() {
        return (EReference)getPlateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateType_ColumnNamingConvention() {
        return (EAttribute)getPlateType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateType_Columns() {
        return (EAttribute)getPlateType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateType_ExternalIdentifier() {
        return (EAttribute)getPlateType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateType_FieldIndex() {
        return (EAttribute)getPlateType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateType_ID() {
        return (EAttribute)getPlateType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateType_Name() {
        return (EAttribute)getPlateType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateType_RowNamingConvention() {
        return (EAttribute)getPlateType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateType_Rows() {
        return (EAttribute)getPlateType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateType_Status() {
        return (EAttribute)getPlateType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateType_WellOriginX() {
        return (EAttribute)getPlateType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateType_WellOriginXUnit() {
        return (EAttribute)getPlateType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateType_WellOriginY() {
        return (EAttribute)getPlateType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlateType_WellOriginYUnit() {
        return (EAttribute)getPlateType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointType() {
		if (pointTypeEClass == null) {
			pointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(153);
		}
		return pointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointType_X() {
        return (EAttribute)getPointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointType_Y() {
        return (EAttribute)getPointType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolygonType() {
		if (polygonTypeEClass == null) {
			polygonTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(154);
		}
		return polygonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolygonType_Points() {
        return (EAttribute)getPolygonType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolylineType() {
		if (polylineTypeEClass == null) {
			polylineTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(155);
		}
		return polylineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolylineType_MarkerEnd() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolylineType_MarkerStart() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolylineType_Points() {
        return (EAttribute)getPolylineType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectRefType() {
		if (projectRefTypeEClass == null) {
			projectRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(161);
		}
		return projectRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectRefType_ID() {
        return (EAttribute)getProjectRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectType() {
		if (projectTypeEClass == null) {
			projectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(162);
		}
		return projectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectType_Description() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProjectType_ExperimenterRef() {
        return (EReference)getProjectType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProjectType_ExperimenterGroupRef() {
        return (EReference)getProjectType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProjectType_DatasetRef() {
        return (EReference)getProjectType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProjectType_AnnotationRef() {
        return (EReference)getProjectType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectType_ID() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectType_Name() {
        return (EAttribute)getProjectType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPumpType() {
		if (pumpTypeEClass == null) {
			pumpTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(165);
		}
		return pumpTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPumpType_ID() {
        return (EAttribute)getPumpType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReagentRefType() {
		if (reagentRefTypeEClass == null) {
			reagentRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(167);
		}
		return reagentRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReagentRefType_ID() {
        return (EAttribute)getReagentRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReagentType() {
		if (reagentTypeEClass == null) {
			reagentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(168);
		}
		return reagentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReagentType_Description() {
        return (EAttribute)getReagentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReagentType_AnnotationRef() {
        return (EReference)getReagentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReagentType_ID() {
        return (EAttribute)getReagentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReagentType_Name() {
        return (EAttribute)getReagentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReagentType_ReagentIdentifier() {
        return (EAttribute)getReagentType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRectangleType() {
		if (rectangleTypeEClass == null) {
			rectangleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(169);
		}
		return rectangleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRectangleType_Height() {
        return (EAttribute)getRectangleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRectangleType_Width() {
        return (EAttribute)getRectangleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRectangleType_X() {
        return (EAttribute)getRectangleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRectangleType_Y() {
        return (EAttribute)getRectangleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReference() {
		if (referenceEClass == null) {
			referenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(170);
		}
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRightsType() {
		if (rightsTypeEClass == null) {
			rightsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(173);
		}
		return rightsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRightsType_RightsHolder() {
        return (EAttribute)getRightsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRightsType_RightsHeld() {
        return (EAttribute)getRightsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getROIRefType() {
		if (roiRefTypeEClass == null) {
			roiRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(175);
		}
		return roiRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getROIRefType_ID() {
        return (EAttribute)getROIRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getROIType() {
		if (roiTypeEClass == null) {
			roiTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(176);
		}
		return roiTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getROIType_Union() {
        return (EReference)getROIType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getROIType_AnnotationRef() {
        return (EReference)getROIType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getROIType_Description() {
        return (EAttribute)getROIType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getROIType_ID() {
        return (EAttribute)getROIType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getROIType_Name() {
        return (EAttribute)getROIType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScreenType() {
		if (screenTypeEClass == null) {
			screenTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(178);
		}
		return screenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScreenType_Description() {
        return (EAttribute)getScreenType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScreenType_Reagent() {
        return (EReference)getScreenType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScreenType_PlateRef() {
        return (EReference)getScreenType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScreenType_AnnotationRef() {
        return (EReference)getScreenType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScreenType_ID() {
        return (EAttribute)getScreenType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScreenType_Name() {
        return (EAttribute)getScreenType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScreenType_ProtocolDescription() {
        return (EAttribute)getScreenType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScreenType_ProtocolIdentifier() {
        return (EAttribute)getScreenType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScreenType_ReagentSetDescription() {
        return (EAttribute)getScreenType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScreenType_ReagentSetIdentifier() {
        return (EAttribute)getScreenType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScreenType_Type() {
        return (EAttribute)getScreenType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSettings() {
		if (settingsEClass == null) {
			settingsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(179);
		}
		return settingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShape() {
		if (shapeEClass == null) {
			shapeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(180);
		}
		return shapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShape_Transform() {
        return (EReference)getShape().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShape_AnnotationRef() {
        return (EReference)getShape().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_FillColor() {
        return (EAttribute)getShape().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_FillRule() {
        return (EAttribute)getShape().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_FontFamily() {
        return (EAttribute)getShape().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_FontSize() {
        return (EAttribute)getShape().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_FontSizeUnit() {
        return (EAttribute)getShape().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_FontStyle() {
        return (EAttribute)getShape().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_ID() {
        return (EAttribute)getShape().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_Locked() {
        return (EAttribute)getShape().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_StrokeColor() {
        return (EAttribute)getShape().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_StrokeDashArray() {
        return (EAttribute)getShape().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_StrokeWidth() {
        return (EAttribute)getShape().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_StrokeWidthUnit() {
        return (EAttribute)getShape().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_Text() {
        return (EAttribute)getShape().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_TheC() {
        return (EAttribute)getShape().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_TheT() {
        return (EAttribute)getShape().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShape_TheZ() {
        return (EAttribute)getShape().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStageLabelType() {
		if (stageLabelTypeEClass == null) {
			stageLabelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(182);
		}
		return stageLabelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageLabelType_Name() {
        return (EAttribute)getStageLabelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageLabelType_X() {
        return (EAttribute)getStageLabelType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageLabelType_XUnit() {
        return (EAttribute)getStageLabelType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageLabelType_Y() {
        return (EAttribute)getStageLabelType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageLabelType_YUnit() {
        return (EAttribute)getStageLabelType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageLabelType_Z() {
        return (EAttribute)getStageLabelType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStageLabelType_ZUnit() {
        return (EAttribute)getStageLabelType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStructuredAnnotationsType() {
		if (structuredAnnotationsTypeEClass == null) {
			structuredAnnotationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(183);
		}
		return structuredAnnotationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStructuredAnnotationsType_Group() {
        return (EAttribute)getStructuredAnnotationsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructuredAnnotationsType_XMLAnnotation() {
        return (EReference)getStructuredAnnotationsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructuredAnnotationsType_FileAnnotation() {
        return (EReference)getStructuredAnnotationsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructuredAnnotationsType_ListAnnotation() {
        return (EReference)getStructuredAnnotationsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructuredAnnotationsType_LongAnnotation() {
        return (EReference)getStructuredAnnotationsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructuredAnnotationsType_DoubleAnnotation() {
        return (EReference)getStructuredAnnotationsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructuredAnnotationsType_CommentAnnotation() {
        return (EReference)getStructuredAnnotationsType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructuredAnnotationsType_BooleanAnnotation() {
        return (EReference)getStructuredAnnotationsType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructuredAnnotationsType_TimestampAnnotation() {
        return (EReference)getStructuredAnnotationsType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructuredAnnotationsType_TagAnnotation() {
        return (EReference)getStructuredAnnotationsType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructuredAnnotationsType_TermAnnotation() {
        return (EReference)getStructuredAnnotationsType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructuredAnnotationsType_MapAnnotation() {
        return (EReference)getStructuredAnnotationsType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagAnnotationType() {
		if (tagAnnotationTypeEClass == null) {
			tagAnnotationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(184);
		}
		return tagAnnotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagAnnotationType_Value() {
        return (EAttribute)getTagAnnotationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTermAnnotationType() {
		if (termAnnotationTypeEClass == null) {
			termAnnotationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(185);
		}
		return termAnnotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTermAnnotationType_Value() {
        return (EAttribute)getTermAnnotationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextAnnotation() {
		if (textAnnotationEClass == null) {
			textAnnotationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(186);
		}
		return textAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTiffDataType() {
		if (tiffDataTypeEClass == null) {
			tiffDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(187);
		}
		return tiffDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTiffDataType_UUID() {
        return (EReference)getTiffDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTiffDataType_FirstC() {
        return (EAttribute)getTiffDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTiffDataType_FirstT() {
        return (EAttribute)getTiffDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTiffDataType_FirstZ() {
        return (EAttribute)getTiffDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTiffDataType_IFD() {
        return (EAttribute)getTiffDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTiffDataType_PlaneCount() {
        return (EAttribute)getTiffDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimestampAnnotationType() {
		if (timestampAnnotationTypeEClass == null) {
			timestampAnnotationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(188);
		}
		return timestampAnnotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimestampAnnotationType_Value() {
        return (EAttribute)getTimestampAnnotationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransmittanceRangeType() {
		if (transmittanceRangeTypeEClass == null) {
			transmittanceRangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(189);
		}
		return transmittanceRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransmittanceRangeType_CutIn() {
        return (EAttribute)getTransmittanceRangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransmittanceRangeType_CutInTolerance() {
        return (EAttribute)getTransmittanceRangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransmittanceRangeType_CutInToleranceUnit() {
        return (EAttribute)getTransmittanceRangeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransmittanceRangeType_CutInUnit() {
        return (EAttribute)getTransmittanceRangeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransmittanceRangeType_CutOut() {
        return (EAttribute)getTransmittanceRangeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransmittanceRangeType_CutOutTolerance() {
        return (EAttribute)getTransmittanceRangeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransmittanceRangeType_CutOutToleranceUnit() {
        return (EAttribute)getTransmittanceRangeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransmittanceRangeType_CutOutUnit() {
        return (EAttribute)getTransmittanceRangeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransmittanceRangeType_Transmittance() {
        return (EAttribute)getTransmittanceRangeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeAnnotation() {
		if (typeAnnotationEClass == null) {
			typeAnnotationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(190);
		}
		return typeAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnionType() {
		if (unionTypeEClass == null) {
			unionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(209);
		}
		return unionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnionType_ShapeGroupGroup() {
        return (EAttribute)getUnionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnionType_ShapeGroup() {
        return (EReference)getUnionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUUIDType() {
		if (uuidTypeEClass == null) {
			uuidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(227);
		}
		return uuidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUUIDType_Value() {
        return (EAttribute)getUUIDType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUUIDType_FileName() {
        return (EAttribute)getUUIDType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueType() {
		if (valueTypeEClass == null) {
			valueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(228);
		}
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueType_Any() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWellSampleRefType() {
		if (wellSampleRefTypeEClass == null) {
			wellSampleRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(231);
		}
		return wellSampleRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWellSampleRefType_ID() {
        return (EAttribute)getWellSampleRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWellSampleType() {
		if (wellSampleTypeEClass == null) {
			wellSampleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(232);
		}
		return wellSampleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWellSampleType_ImageRef() {
        return (EReference)getWellSampleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWellSampleType_ID() {
        return (EAttribute)getWellSampleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWellSampleType_Index() {
        return (EAttribute)getWellSampleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWellSampleType_PositionX() {
        return (EAttribute)getWellSampleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWellSampleType_PositionXUnit() {
        return (EAttribute)getWellSampleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWellSampleType_PositionY() {
        return (EAttribute)getWellSampleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWellSampleType_PositionYUnit() {
        return (EAttribute)getWellSampleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWellSampleType_Timepoint() {
        return (EAttribute)getWellSampleType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWellType() {
		if (wellTypeEClass == null) {
			wellTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(233);
		}
		return wellTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWellType_WellSample() {
        return (EReference)getWellType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWellType_ReagentRef() {
        return (EReference)getWellType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWellType_AnnotationRef() {
        return (EReference)getWellType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWellType_Color() {
        return (EAttribute)getWellType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWellType_Column() {
        return (EAttribute)getWellType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWellType_ExternalDescription() {
        return (EAttribute)getWellType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWellType_ExternalIdentifier() {
        return (EAttribute)getWellType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWellType_ID() {
        return (EAttribute)getWellType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWellType_Row() {
        return (EAttribute)getWellType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWellType_Type() {
        return (EAttribute)getWellType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXMLAnnotationType() {
		if (xmlAnnotationTypeEClass == null) {
			xmlAnnotationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(234);
		}
		return xmlAnnotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXMLAnnotationType_Value() {
        return (EReference)getXMLAnnotationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAcquisitionModeType() {
		if (acquisitionModeTypeEEnum == null) {
			acquisitionModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(0);
		}
		return acquisitionModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBinning() {
		if (binningEEnum == null) {
			binningEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(12);
		}
		return binningEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCompressionType() {
		if (compressionTypeEEnum == null) {
			compressionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(21);
		}
		return compressionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCompressionType1() {
		if (compressionType1EEnum == null) {
			compressionType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(22);
		}
		return compressionType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContrastMethodType() {
		if (contrastMethodTypeEEnum == null) {
			contrastMethodTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(25);
		}
		return contrastMethodTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCorrectionType() {
		if (correctionTypeEEnum == null) {
			correctionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(27);
		}
		return correctionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDimensionOrderType() {
		if (dimensionOrderTypeEEnum == null) {
			dimensionOrderTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(51);
		}
		return dimensionOrderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFillRuleType() {
		if (fillRuleTypeEEnum == null) {
			fillRuleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(68);
		}
		return fillRuleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFontFamily() {
		if (fontFamilyEEnum == null) {
			fontFamilyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(79);
		}
		return fontFamilyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFontFamilyType() {
		if (fontFamilyTypeEEnum == null) {
			fontFamilyTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(81);
		}
		return fontFamilyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFontStyleType() {
		if (fontStyleTypeEEnum == null) {
			fontStyleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(83);
		}
		return fontStyleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIlluminationTypeType() {
		if (illuminationTypeTypeEEnum == null) {
			illuminationTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(87);
		}
		return illuminationTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImmersionType() {
		if (immersionTypeEEnum == null) {
			immersionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(93);
		}
		return immersionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLaserMediumType() {
		if (laserMediumTypeEEnum == null) {
			laserMediumTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(99);
		}
		return laserMediumTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMarker() {
		if (markerEEnum == null) {
			markerEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(117);
		}
		return markerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMediumType() {
		if (mediumTypeEEnum == null) {
			mediumTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(120);
		}
		return mediumTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNamingConvention() {
		if (namingConventionEEnum == null) {
			namingConventionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(128);
		}
		return namingConventionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPixelType() {
		if (pixelTypeEEnum == null) {
			pixelTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(145);
		}
		return pixelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPulseType() {
		if (pulseTypeEEnum == null) {
			pulseTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(163);
		}
		return pulseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeType2() {
		if (typeType2EEnum == null) {
			typeType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(193);
		}
		return typeType2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeType3() {
		if (typeType3EEnum == null) {
			typeType3EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(194);
		}
		return typeType3EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeType4() {
		if (typeType4EEnum == null) {
			typeType4EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(195);
		}
		return typeType4EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeType5() {
		if (typeType5EEnum == null) {
			typeType5EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(196);
		}
		return typeType5EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeType6() {
		if (typeType6EEnum == null) {
			typeType6EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(197);
		}
		return typeType6EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeType7() {
		if (typeType7EEnum == null) {
			typeType7EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(198);
		}
		return typeType7EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeTypeItem() {
		if (typeTypeItemEEnum == null) {
			typeTypeItemEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(199);
		}
		return typeTypeItemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeTypeItem1() {
		if (typeTypeItem1EEnum == null) {
			typeTypeItem1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(200);
		}
		return typeTypeItem1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnitsAngle() {
		if (unitsAngleEEnum == null) {
			unitsAngleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(210);
		}
		return unitsAngleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnitsElectricPotential() {
		if (unitsElectricPotentialEEnum == null) {
			unitsElectricPotentialEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(212);
		}
		return unitsElectricPotentialEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnitsFrequency() {
		if (unitsFrequencyEEnum == null) {
			unitsFrequencyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(214);
		}
		return unitsFrequencyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnitsLength() {
		if (unitsLengthEEnum == null) {
			unitsLengthEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(216);
		}
		return unitsLengthEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnitsPower() {
		if (unitsPowerEEnum == null) {
			unitsPowerEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(218);
		}
		return unitsPowerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnitsPressure() {
		if (unitsPressureEEnum == null) {
			unitsPressureEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(220);
		}
		return unitsPressureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnitsTemperature() {
		if (unitsTemperatureEEnum == null) {
			unitsTemperatureEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(222);
		}
		return unitsTemperatureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnitsTime() {
		if (unitsTimeEEnum == null) {
			unitsTimeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(224);
		}
		return unitsTimeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAcquisitionModeTypeObject() {
		if (acquisitionModeTypeObjectEDataType == null) {
			acquisitionModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(1);
		}
		return acquisitionModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAnnotationID() {
		if (annotationIDEDataType == null) {
			annotationIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(4);
		}
		return annotationIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBase64Binary() {
		if (base64BinaryEDataType == null) {
			base64BinaryEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(7);
		}
		return base64BinaryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBinningObject() {
		if (binningObjectEDataType == null) {
			binningObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(13);
		}
		return binningObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getChannelID() {
		if (channelIDEDataType == null) {
			channelIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(15);
		}
		return channelIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getColor() {
		if (colorEDataType == null) {
			colorEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(18);
		}
		return colorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getColorObject() {
		if (colorObjectEDataType == null) {
			colorObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(19);
		}
		return colorObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCompressionTypeObject() {
		if (compressionTypeObjectEDataType == null) {
			compressionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(23);
		}
		return compressionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCompressionTypeObject1() {
		if (compressionTypeObject1EDataType == null) {
			compressionTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(24);
		}
		return compressionTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getContrastMethodTypeObject() {
		if (contrastMethodTypeObjectEDataType == null) {
			contrastMethodTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(26);
		}
		return contrastMethodTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCorrectionTypeObject() {
		if (correctionTypeObjectEDataType == null) {
			correctionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(28);
		}
		return correctionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDatasetID() {
		if (datasetIDEDataType == null) {
			datasetIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(29);
		}
		return datasetIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDescriptionType() {
		if (descriptionTypeEDataType == null) {
			descriptionTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(32);
		}
		return descriptionTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDescriptionType1() {
		if (descriptionType1EDataType == null) {
			descriptionType1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(33);
		}
		return descriptionType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDescriptionType2() {
		if (descriptionType2EDataType == null) {
			descriptionType2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(34);
		}
		return descriptionType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDescriptionType3() {
		if (descriptionType3EDataType == null) {
			descriptionType3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(35);
		}
		return descriptionType3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDescriptionType4() {
		if (descriptionType4EDataType == null) {
			descriptionType4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(36);
		}
		return descriptionType4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDescriptionType5() {
		if (descriptionType5EDataType == null) {
			descriptionType5EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(37);
		}
		return descriptionType5EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDescriptionType6() {
		if (descriptionType6EDataType == null) {
			descriptionType6EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(38);
		}
		return descriptionType6EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDescriptionType7() {
		if (descriptionType7EDataType == null) {
			descriptionType7EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(39);
		}
		return descriptionType7EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDescriptionType8() {
		if (descriptionType8EDataType == null) {
			descriptionType8EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(40);
		}
		return descriptionType8EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDescriptionType9() {
		if (descriptionType9EDataType == null) {
			descriptionType9EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(41);
		}
		return descriptionType9EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDescriptionType10() {
		if (descriptionType10EDataType == null) {
			descriptionType10EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(42);
		}
		return descriptionType10EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDescriptionType11() {
		if (descriptionType11EDataType == null) {
			descriptionType11EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(43);
		}
		return descriptionType11EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDescriptionType12() {
		if (descriptionType12EDataType == null) {
			descriptionType12EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(44);
		}
		return descriptionType12EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDetectorID() {
		if (detectorIDEDataType == null) {
			detectorIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(45);
		}
		return detectorIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDichroicID() {
		if (dichroicIDEDataType == null) {
			dichroicIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(48);
		}
		return dichroicIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDimensionOrderTypeObject() {
		if (dimensionOrderTypeObjectEDataType == null) {
			dimensionOrderTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(52);
		}
		return dimensionOrderTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getExperimenterGroupID() {
		if (experimenterGroupIDEDataType == null) {
			experimenterGroupIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(56);
		}
		return experimenterGroupIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getExperimenterID() {
		if (experimenterIDEDataType == null) {
			experimenterIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(59);
		}
		return experimenterIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getExperimentID() {
		if (experimentIDEDataType == null) {
			experimentIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(62);
		}
		return experimentIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFillRuleTypeObject() {
		if (fillRuleTypeObjectEDataType == null) {
			fillRuleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(69);
		}
		return fillRuleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFilterID() {
		if (filterIDEDataType == null) {
			filterIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(70);
		}
		return filterIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFilterSetID() {
		if (filterSetIDEDataType == null) {
			filterSetIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(72);
		}
		return filterSetIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFolderID() {
		if (folderIDEDataType == null) {
			folderIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(76);
		}
		return folderIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFontFamilyObject() {
		if (fontFamilyObjectEDataType == null) {
			fontFamilyObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(80);
		}
		return fontFamilyObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFontFamilyTypeObject() {
		if (fontFamilyTypeObjectEDataType == null) {
			fontFamilyTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(82);
		}
		return fontFamilyTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFontStyleTypeObject() {
		if (fontStyleTypeObjectEDataType == null) {
			fontStyleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(84);
		}
		return fontStyleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHex40() {
		if (hex40EDataType == null) {
			hex40EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(86);
		}
		return hex40EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIlluminationTypeTypeObject() {
		if (illuminationTypeTypeObjectEDataType == null) {
			illuminationTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(88);
		}
		return illuminationTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getImageID() {
		if (imageIDEDataType == null) {
			imageIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(89);
		}
		return imageIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getImmersionTypeObject() {
		if (immersionTypeObjectEDataType == null) {
			immersionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(94);
		}
		return immersionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInstrumentID() {
		if (instrumentIDEDataType == null) {
			instrumentIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(95);
		}
		return instrumentIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLaserMediumTypeObject() {
		if (laserMediumTypeObjectEDataType == null) {
			laserMediumTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(100);
		}
		return laserMediumTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLengthType() {
		if (lengthTypeEDataType == null) {
			lengthTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(103);
		}
		return lengthTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLengthTypeObject() {
		if (lengthTypeObjectEDataType == null) {
			lengthTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(104);
		}
		return lengthTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLightSourceID() {
		if (lightSourceIDEDataType == null) {
			lightSourceIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(108);
		}
		return lightSourceIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLSID() {
		if (lsidEDataType == null) {
			lsidEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(113);
		}
		return lsidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMarkerObject() {
		if (markerObjectEDataType == null) {
			markerObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(118);
		}
		return markerObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMediumTypeObject() {
		if (mediumTypeObjectEDataType == null) {
			mediumTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(121);
		}
		return mediumTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMicrobeamManipulationID() {
		if (microbeamManipulationIDEDataType == null) {
			microbeamManipulationIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(122);
		}
		return microbeamManipulationIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getModuleID() {
		if (moduleIDEDataType == null) {
			moduleIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(126);
		}
		return moduleIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNamingConventionObject() {
		if (namingConventionObjectEDataType == null) {
			namingConventionObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(129);
		}
		return namingConventionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNonNegativeFloat() {
		if (nonNegativeFloatEDataType == null) {
			nonNegativeFloatEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(130);
		}
		return nonNegativeFloatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNonNegativeFloatObject() {
		if (nonNegativeFloatObjectEDataType == null) {
			nonNegativeFloatObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(131);
		}
		return nonNegativeFloatObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNonNegativeInt() {
		if (nonNegativeIntEDataType == null) {
			nonNegativeIntEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(132);
		}
		return nonNegativeIntEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNonNegativeIntObject() {
		if (nonNegativeIntObjectEDataType == null) {
			nonNegativeIntObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(133);
		}
		return nonNegativeIntObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNonNegativeLong() {
		if (nonNegativeLongEDataType == null) {
			nonNegativeLongEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(134);
		}
		return nonNegativeLongEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNonNegativeLongObject() {
		if (nonNegativeLongObjectEDataType == null) {
			nonNegativeLongObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(135);
		}
		return nonNegativeLongObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getObjectiveID() {
		if (objectiveIDEDataType == null) {
			objectiveIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(137);
		}
		return objectiveIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPercentFraction() {
		if (percentFractionEDataType == null) {
			percentFractionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(141);
		}
		return percentFractionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPercentFractionObject() {
		if (percentFractionObjectEDataType == null) {
			percentFractionObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(142);
		}
		return percentFractionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPixelsID() {
		if (pixelsIDEDataType == null) {
			pixelsIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(143);
		}
		return pixelsIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPixelTypeObject() {
		if (pixelTypeObjectEDataType == null) {
			pixelTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(146);
		}
		return pixelTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPlateAcquisitionID() {
		if (plateAcquisitionIDEDataType == null) {
			plateAcquisitionIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(148);
		}
		return plateAcquisitionIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPlateID() {
		if (plateIDEDataType == null) {
			plateIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(150);
		}
		return plateIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPositiveFloat() {
		if (positiveFloatEDataType == null) {
			positiveFloatEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(156);
		}
		return positiveFloatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPositiveFloatObject() {
		if (positiveFloatObjectEDataType == null) {
			positiveFloatObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(157);
		}
		return positiveFloatObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPositiveInt() {
		if (positiveIntEDataType == null) {
			positiveIntEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(158);
		}
		return positiveIntEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPositiveIntObject() {
		if (positiveIntObjectEDataType == null) {
			positiveIntObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(159);
		}
		return positiveIntObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getProjectID() {
		if (projectIDEDataType == null) {
			projectIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(160);
		}
		return projectIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPulseTypeObject() {
		if (pulseTypeObjectEDataType == null) {
			pulseTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(164);
		}
		return pulseTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getReagentID() {
		if (reagentIDEDataType == null) {
			reagentIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(166);
		}
		return reagentIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRightsHeldType() {
		if (rightsHeldTypeEDataType == null) {
			rightsHeldTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(171);
		}
		return rightsHeldTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRightsHolderType() {
		if (rightsHolderTypeEDataType == null) {
			rightsHolderTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(172);
		}
		return rightsHolderTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getROIID() {
		if (roiidEDataType == null) {
			roiidEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(174);
		}
		return roiidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getScreenID() {
		if (screenIDEDataType == null) {
			screenIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(177);
		}
		return screenIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getShapeID() {
		if (shapeIDEDataType == null) {
			shapeIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(181);
		}
		return shapeIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeType() {
		if (typeTypeEDataType == null) {
			typeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(191);
		}
		return typeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeType1() {
		if (typeType1EDataType == null) {
			typeType1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(192);
		}
		return typeType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeTypeItemObject() {
		if (typeTypeItemObjectEDataType == null) {
			typeTypeItemObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(201);
		}
		return typeTypeItemObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeTypeItemObject1() {
		if (typeTypeItemObject1EDataType == null) {
			typeTypeItemObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(202);
		}
		return typeTypeItemObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeTypeObject() {
		if (typeTypeObjectEDataType == null) {
			typeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(203);
		}
		return typeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeTypeObject1() {
		if (typeTypeObject1EDataType == null) {
			typeTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(204);
		}
		return typeTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeTypeObject2() {
		if (typeTypeObject2EDataType == null) {
			typeTypeObject2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(205);
		}
		return typeTypeObject2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeTypeObject3() {
		if (typeTypeObject3EDataType == null) {
			typeTypeObject3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(206);
		}
		return typeTypeObject3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeTypeObject4() {
		if (typeTypeObject4EDataType == null) {
			typeTypeObject4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(207);
		}
		return typeTypeObject4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeTypeObject5() {
		if (typeTypeObject5EDataType == null) {
			typeTypeObject5EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(208);
		}
		return typeTypeObject5EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnitsAngleObject() {
		if (unitsAngleObjectEDataType == null) {
			unitsAngleObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(211);
		}
		return unitsAngleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnitsElectricPotentialObject() {
		if (unitsElectricPotentialObjectEDataType == null) {
			unitsElectricPotentialObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(213);
		}
		return unitsElectricPotentialObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnitsFrequencyObject() {
		if (unitsFrequencyObjectEDataType == null) {
			unitsFrequencyObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(215);
		}
		return unitsFrequencyObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnitsLengthObject() {
		if (unitsLengthObjectEDataType == null) {
			unitsLengthObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(217);
		}
		return unitsLengthObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnitsPowerObject() {
		if (unitsPowerObjectEDataType == null) {
			unitsPowerObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(219);
		}
		return unitsPowerObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnitsPressureObject() {
		if (unitsPressureObjectEDataType == null) {
			unitsPressureObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(221);
		}
		return unitsPressureObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnitsTemperatureObject() {
		if (unitsTemperatureObjectEDataType == null) {
			unitsTemperatureObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(223);
		}
		return unitsTemperatureObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnitsTimeObject() {
		if (unitsTimeObjectEDataType == null) {
			unitsTimeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(225);
		}
		return unitsTimeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUniversallyUniqueIdentifier() {
		if (universallyUniqueIdentifierEDataType == null) {
			universallyUniqueIdentifierEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(226);
		}
		return universallyUniqueIdentifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getWellID() {
		if (wellIDEDataType == null) {
			wellIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(229);
		}
		return wellIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getWellSampleID() {
		if (wellSampleIDEDataType == null) {
			wellSampleIDEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(OMEPackage.eNS_URI).getEClassifiers().get(230);
		}
		return wellSampleIDEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OMEFactory getOMEFactory() {
		return (OMEFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("org.openmicroscopy.ome." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //OMEPackageImpl
