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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.openmicroscopy.ome.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OMEFactoryImpl extends EFactoryImpl implements OMEFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OMEFactory init() {
		try {
			OMEFactory theOMEFactory = (OMEFactory)EPackage.Registry.INSTANCE.getEFactory(OMEPackage.eNS_URI);
			if (theOMEFactory != null) {
				return theOMEFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OMEFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMEFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OMEPackage.AFFINE_TRANSFORM: return createAffineTransform();
			case OMEPackage.ANNOTATION: return createAnnotation();
			case OMEPackage.ANNOTATION_REF_TYPE: return createAnnotationRefType();
			case OMEPackage.ARC_TYPE: return createArcType();
			case OMEPackage.BASIC_ANNOTATION: return createBasicAnnotation();
			case OMEPackage.BINARY_FILE_TYPE: return createBinaryFileType();
			case OMEPackage.BINARY_ONLY_TYPE: return createBinaryOnlyType();
			case OMEPackage.BIN_DATA_TYPE: return createBinDataType();
			case OMEPackage.BOOLEAN_ANNOTATION_TYPE: return createBooleanAnnotationType();
			case OMEPackage.CHANNEL_REF_TYPE: return createChannelRefType();
			case OMEPackage.CHANNEL_TYPE: return createChannelType();
			case OMEPackage.COMMENT_ANNOTATION_TYPE: return createCommentAnnotationType();
			case OMEPackage.DATASET_REF_TYPE: return createDatasetRefType();
			case OMEPackage.DATASET_TYPE: return createDatasetType();
			case OMEPackage.DETECTOR_SETTINGS_TYPE: return createDetectorSettingsType();
			case OMEPackage.DETECTOR_TYPE: return createDetectorType();
			case OMEPackage.DICHROIC_REF_TYPE: return createDichroicRefType();
			case OMEPackage.DICHROIC_TYPE: return createDichroicType();
			case OMEPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case OMEPackage.DOUBLE_ANNOTATION_TYPE: return createDoubleAnnotationType();
			case OMEPackage.ELLIPSE_TYPE: return createEllipseType();
			case OMEPackage.EXPERIMENTER_GROUP_REF_TYPE: return createExperimenterGroupRefType();
			case OMEPackage.EXPERIMENTER_GROUP_TYPE: return createExperimenterGroupType();
			case OMEPackage.EXPERIMENTER_REF_TYPE: return createExperimenterRefType();
			case OMEPackage.EXPERIMENTER_TYPE: return createExperimenterType();
			case OMEPackage.EXPERIMENT_REF_TYPE: return createExperimentRefType();
			case OMEPackage.EXPERIMENT_TYPE: return createExperimentType();
			case OMEPackage.EXTERNAL_TYPE: return createExternalType();
			case OMEPackage.FILAMENT_TYPE: return createFilamentType();
			case OMEPackage.FILE_ANNOTATION_TYPE: return createFileAnnotationType();
			case OMEPackage.FILTER_REF: return createFilterRef();
			case OMEPackage.FILTER_SET_REF_TYPE: return createFilterSetRefType();
			case OMEPackage.FILTER_SET_TYPE: return createFilterSetType();
			case OMEPackage.FILTER_TYPE: return createFilterType();
			case OMEPackage.FOLDER_REF_TYPE: return createFolderRefType();
			case OMEPackage.FOLDER_TYPE: return createFolderType();
			case OMEPackage.GENERIC_EXCITATION_SOURCE_TYPE: return createGenericExcitationSourceType();
			case OMEPackage.IMAGE_REF_TYPE: return createImageRefType();
			case OMEPackage.IMAGE_TYPE: return createImageType();
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE: return createImagingEnvironmentType();
			case OMEPackage.INSTRUMENT_REF_TYPE: return createInstrumentRefType();
			case OMEPackage.INSTRUMENT_TYPE: return createInstrumentType();
			case OMEPackage.LABEL_TYPE: return createLabelType();
			case OMEPackage.LASER_TYPE: return createLaserType();
			case OMEPackage.LEADER_TYPE: return createLeaderType();
			case OMEPackage.LIGHT_EMITTING_DIODE_TYPE: return createLightEmittingDiodeType();
			case OMEPackage.LIGHT_PATH_TYPE: return createLightPathType();
			case OMEPackage.LIGHT_SOURCE: return createLightSource();
			case OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE: return createLightSourceSettingsType();
			case OMEPackage.LINE_TYPE: return createLineType();
			case OMEPackage.LIST_ANNOTATION_TYPE: return createListAnnotationType();
			case OMEPackage.LONG_ANNOTATION_TYPE: return createLongAnnotationType();
			case OMEPackage.MANUFACTURER_SPEC: return createManufacturerSpec();
			case OMEPackage.MAP: return createMap();
			case OMEPackage.MAP_ANNOTATION_TYPE: return createMapAnnotationType();
			case OMEPackage.MASK_TYPE: return createMaskType();
			case OMEPackage.MICROBEAM_MANIPULATION_REF_TYPE: return createMicrobeamManipulationRefType();
			case OMEPackage.MICROBEAM_MANIPULATION_TYPE: return createMicrobeamManipulationType();
			case OMEPackage.MICROSCOPE_TYPE: return createMicroscopeType();
			case OMEPackage.MTYPE: return createMType();
			case OMEPackage.NUMERIC_ANNOTATION: return createNumericAnnotation();
			case OMEPackage.OBJECTIVE_SETTINGS_TYPE: return createObjectiveSettingsType();
			case OMEPackage.OBJECTIVE_TYPE: return createObjectiveType();
			case OMEPackage.OME_TYPE: return createOMEType();
			case OMEPackage.PIXELS_TYPE: return createPixelsType();
			case OMEPackage.PLANE_TYPE: return createPlaneType();
			case OMEPackage.PLATE_ACQUISITION_TYPE: return createPlateAcquisitionType();
			case OMEPackage.PLATE_REF_TYPE: return createPlateRefType();
			case OMEPackage.PLATE_TYPE: return createPlateType();
			case OMEPackage.POINT_TYPE: return createPointType();
			case OMEPackage.POLYGON_TYPE: return createPolygonType();
			case OMEPackage.POLYLINE_TYPE: return createPolylineType();
			case OMEPackage.PROJECT_REF_TYPE: return createProjectRefType();
			case OMEPackage.PROJECT_TYPE: return createProjectType();
			case OMEPackage.PUMP_TYPE: return createPumpType();
			case OMEPackage.REAGENT_REF_TYPE: return createReagentRefType();
			case OMEPackage.REAGENT_TYPE: return createReagentType();
			case OMEPackage.RECTANGLE_TYPE: return createRectangleType();
			case OMEPackage.REFERENCE: return createReference();
			case OMEPackage.RIGHTS_TYPE: return createRightsType();
			case OMEPackage.ROI_REF_TYPE: return createROIRefType();
			case OMEPackage.ROI_TYPE: return createROIType();
			case OMEPackage.SCREEN_TYPE: return createScreenType();
			case OMEPackage.SETTINGS: return createSettings();
			case OMEPackage.SHAPE: return createShape();
			case OMEPackage.STAGE_LABEL_TYPE: return createStageLabelType();
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE: return createStructuredAnnotationsType();
			case OMEPackage.TAG_ANNOTATION_TYPE: return createTagAnnotationType();
			case OMEPackage.TERM_ANNOTATION_TYPE: return createTermAnnotationType();
			case OMEPackage.TEXT_ANNOTATION: return createTextAnnotation();
			case OMEPackage.TIFF_DATA_TYPE: return createTiffDataType();
			case OMEPackage.TIMESTAMP_ANNOTATION_TYPE: return createTimestampAnnotationType();
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE: return createTransmittanceRangeType();
			case OMEPackage.TYPE_ANNOTATION: return createTypeAnnotation();
			case OMEPackage.UNION_TYPE: return createUnionType();
			case OMEPackage.UUID_TYPE: return createUUIDType();
			case OMEPackage.VALUE_TYPE: return createValueType();
			case OMEPackage.WELL_SAMPLE_REF_TYPE: return createWellSampleRefType();
			case OMEPackage.WELL_SAMPLE_TYPE: return createWellSampleType();
			case OMEPackage.WELL_TYPE: return createWellType();
			case OMEPackage.XML_ANNOTATION_TYPE: return createXMLAnnotationType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OMEPackage.ACQUISITION_MODE_TYPE:
				return createAcquisitionModeTypeFromString(eDataType, initialValue);
			case OMEPackage.BINNING:
				return createBinningFromString(eDataType, initialValue);
			case OMEPackage.COMPRESSION_TYPE:
				return createCompressionTypeFromString(eDataType, initialValue);
			case OMEPackage.COMPRESSION_TYPE1:
				return createCompressionType1FromString(eDataType, initialValue);
			case OMEPackage.CONTRAST_METHOD_TYPE:
				return createContrastMethodTypeFromString(eDataType, initialValue);
			case OMEPackage.CORRECTION_TYPE:
				return createCorrectionTypeFromString(eDataType, initialValue);
			case OMEPackage.DIMENSION_ORDER_TYPE:
				return createDimensionOrderTypeFromString(eDataType, initialValue);
			case OMEPackage.FILL_RULE_TYPE:
				return createFillRuleTypeFromString(eDataType, initialValue);
			case OMEPackage.FONT_FAMILY:
				return createFontFamilyFromString(eDataType, initialValue);
			case OMEPackage.FONT_FAMILY_TYPE:
				return createFontFamilyTypeFromString(eDataType, initialValue);
			case OMEPackage.FONT_STYLE_TYPE:
				return createFontStyleTypeFromString(eDataType, initialValue);
			case OMEPackage.ILLUMINATION_TYPE_TYPE:
				return createIlluminationTypeTypeFromString(eDataType, initialValue);
			case OMEPackage.IMMERSION_TYPE:
				return createImmersionTypeFromString(eDataType, initialValue);
			case OMEPackage.LASER_MEDIUM_TYPE:
				return createLaserMediumTypeFromString(eDataType, initialValue);
			case OMEPackage.MARKER:
				return createMarkerFromString(eDataType, initialValue);
			case OMEPackage.MEDIUM_TYPE:
				return createMediumTypeFromString(eDataType, initialValue);
			case OMEPackage.NAMING_CONVENTION:
				return createNamingConventionFromString(eDataType, initialValue);
			case OMEPackage.PIXEL_TYPE:
				return createPixelTypeFromString(eDataType, initialValue);
			case OMEPackage.PULSE_TYPE:
				return createPulseTypeFromString(eDataType, initialValue);
			case OMEPackage.TYPE_TYPE2:
				return createTypeType2FromString(eDataType, initialValue);
			case OMEPackage.TYPE_TYPE3:
				return createTypeType3FromString(eDataType, initialValue);
			case OMEPackage.TYPE_TYPE4:
				return createTypeType4FromString(eDataType, initialValue);
			case OMEPackage.TYPE_TYPE5:
				return createTypeType5FromString(eDataType, initialValue);
			case OMEPackage.TYPE_TYPE6:
				return createTypeType6FromString(eDataType, initialValue);
			case OMEPackage.TYPE_TYPE7:
				return createTypeType7FromString(eDataType, initialValue);
			case OMEPackage.TYPE_TYPE_ITEM:
				return createTypeTypeItemFromString(eDataType, initialValue);
			case OMEPackage.TYPE_TYPE_ITEM1:
				return createTypeTypeItem1FromString(eDataType, initialValue);
			case OMEPackage.UNITS_ANGLE:
				return createUnitsAngleFromString(eDataType, initialValue);
			case OMEPackage.UNITS_ELECTRIC_POTENTIAL:
				return createUnitsElectricPotentialFromString(eDataType, initialValue);
			case OMEPackage.UNITS_FREQUENCY:
				return createUnitsFrequencyFromString(eDataType, initialValue);
			case OMEPackage.UNITS_LENGTH:
				return createUnitsLengthFromString(eDataType, initialValue);
			case OMEPackage.UNITS_POWER:
				return createUnitsPowerFromString(eDataType, initialValue);
			case OMEPackage.UNITS_PRESSURE:
				return createUnitsPressureFromString(eDataType, initialValue);
			case OMEPackage.UNITS_TEMPERATURE:
				return createUnitsTemperatureFromString(eDataType, initialValue);
			case OMEPackage.UNITS_TIME:
				return createUnitsTimeFromString(eDataType, initialValue);
			case OMEPackage.ACQUISITION_MODE_TYPE_OBJECT:
				return createAcquisitionModeTypeObjectFromString(eDataType, initialValue);
			case OMEPackage.ANNOTATION_ID:
				return createAnnotationIDFromString(eDataType, initialValue);
			case OMEPackage.BASE64_BINARY:
				return createBase64BinaryFromString(eDataType, initialValue);
			case OMEPackage.BINNING_OBJECT:
				return createBinningObjectFromString(eDataType, initialValue);
			case OMEPackage.CHANNEL_ID:
				return createChannelIDFromString(eDataType, initialValue);
			case OMEPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case OMEPackage.COLOR_OBJECT:
				return createColorObjectFromString(eDataType, initialValue);
			case OMEPackage.COMPRESSION_TYPE_OBJECT:
				return createCompressionTypeObjectFromString(eDataType, initialValue);
			case OMEPackage.COMPRESSION_TYPE_OBJECT1:
				return createCompressionTypeObject1FromString(eDataType, initialValue);
			case OMEPackage.CONTRAST_METHOD_TYPE_OBJECT:
				return createContrastMethodTypeObjectFromString(eDataType, initialValue);
			case OMEPackage.CORRECTION_TYPE_OBJECT:
				return createCorrectionTypeObjectFromString(eDataType, initialValue);
			case OMEPackage.DATASET_ID:
				return createDatasetIDFromString(eDataType, initialValue);
			case OMEPackage.DESCRIPTION_TYPE:
				return createDescriptionTypeFromString(eDataType, initialValue);
			case OMEPackage.DESCRIPTION_TYPE1:
				return createDescriptionType1FromString(eDataType, initialValue);
			case OMEPackage.DESCRIPTION_TYPE2:
				return createDescriptionType2FromString(eDataType, initialValue);
			case OMEPackage.DESCRIPTION_TYPE3:
				return createDescriptionType3FromString(eDataType, initialValue);
			case OMEPackage.DESCRIPTION_TYPE4:
				return createDescriptionType4FromString(eDataType, initialValue);
			case OMEPackage.DESCRIPTION_TYPE5:
				return createDescriptionType5FromString(eDataType, initialValue);
			case OMEPackage.DESCRIPTION_TYPE6:
				return createDescriptionType6FromString(eDataType, initialValue);
			case OMEPackage.DESCRIPTION_TYPE7:
				return createDescriptionType7FromString(eDataType, initialValue);
			case OMEPackage.DESCRIPTION_TYPE8:
				return createDescriptionType8FromString(eDataType, initialValue);
			case OMEPackage.DESCRIPTION_TYPE9:
				return createDescriptionType9FromString(eDataType, initialValue);
			case OMEPackage.DESCRIPTION_TYPE10:
				return createDescriptionType10FromString(eDataType, initialValue);
			case OMEPackage.DESCRIPTION_TYPE11:
				return createDescriptionType11FromString(eDataType, initialValue);
			case OMEPackage.DESCRIPTION_TYPE12:
				return createDescriptionType12FromString(eDataType, initialValue);
			case OMEPackage.DETECTOR_ID:
				return createDetectorIDFromString(eDataType, initialValue);
			case OMEPackage.DICHROIC_ID:
				return createDichroicIDFromString(eDataType, initialValue);
			case OMEPackage.DIMENSION_ORDER_TYPE_OBJECT:
				return createDimensionOrderTypeObjectFromString(eDataType, initialValue);
			case OMEPackage.EXPERIMENTER_GROUP_ID:
				return createExperimenterGroupIDFromString(eDataType, initialValue);
			case OMEPackage.EXPERIMENTER_ID:
				return createExperimenterIDFromString(eDataType, initialValue);
			case OMEPackage.EXPERIMENT_ID:
				return createExperimentIDFromString(eDataType, initialValue);
			case OMEPackage.FILL_RULE_TYPE_OBJECT:
				return createFillRuleTypeObjectFromString(eDataType, initialValue);
			case OMEPackage.FILTER_ID:
				return createFilterIDFromString(eDataType, initialValue);
			case OMEPackage.FILTER_SET_ID:
				return createFilterSetIDFromString(eDataType, initialValue);
			case OMEPackage.FOLDER_ID:
				return createFolderIDFromString(eDataType, initialValue);
			case OMEPackage.FONT_FAMILY_OBJECT:
				return createFontFamilyObjectFromString(eDataType, initialValue);
			case OMEPackage.FONT_FAMILY_TYPE_OBJECT:
				return createFontFamilyTypeObjectFromString(eDataType, initialValue);
			case OMEPackage.FONT_STYLE_TYPE_OBJECT:
				return createFontStyleTypeObjectFromString(eDataType, initialValue);
			case OMEPackage.HEX40:
				return createHex40FromString(eDataType, initialValue);
			case OMEPackage.ILLUMINATION_TYPE_TYPE_OBJECT:
				return createIlluminationTypeTypeObjectFromString(eDataType, initialValue);
			case OMEPackage.IMAGE_ID:
				return createImageIDFromString(eDataType, initialValue);
			case OMEPackage.IMMERSION_TYPE_OBJECT:
				return createImmersionTypeObjectFromString(eDataType, initialValue);
			case OMEPackage.INSTRUMENT_ID:
				return createInstrumentIDFromString(eDataType, initialValue);
			case OMEPackage.LASER_MEDIUM_TYPE_OBJECT:
				return createLaserMediumTypeObjectFromString(eDataType, initialValue);
			case OMEPackage.LENGTH_TYPE:
				return createLengthTypeFromString(eDataType, initialValue);
			case OMEPackage.LENGTH_TYPE_OBJECT:
				return createLengthTypeObjectFromString(eDataType, initialValue);
			case OMEPackage.LIGHT_SOURCE_ID:
				return createLightSourceIDFromString(eDataType, initialValue);
			case OMEPackage.LSID:
				return createLSIDFromString(eDataType, initialValue);
			case OMEPackage.MARKER_OBJECT:
				return createMarkerObjectFromString(eDataType, initialValue);
			case OMEPackage.MEDIUM_TYPE_OBJECT:
				return createMediumTypeObjectFromString(eDataType, initialValue);
			case OMEPackage.MICROBEAM_MANIPULATION_ID:
				return createMicrobeamManipulationIDFromString(eDataType, initialValue);
			case OMEPackage.MODULE_ID:
				return createModuleIDFromString(eDataType, initialValue);
			case OMEPackage.NAMING_CONVENTION_OBJECT:
				return createNamingConventionObjectFromString(eDataType, initialValue);
			case OMEPackage.NON_NEGATIVE_FLOAT:
				return createNonNegativeFloatFromString(eDataType, initialValue);
			case OMEPackage.NON_NEGATIVE_FLOAT_OBJECT:
				return createNonNegativeFloatObjectFromString(eDataType, initialValue);
			case OMEPackage.NON_NEGATIVE_INT:
				return createNonNegativeIntFromString(eDataType, initialValue);
			case OMEPackage.NON_NEGATIVE_INT_OBJECT:
				return createNonNegativeIntObjectFromString(eDataType, initialValue);
			case OMEPackage.NON_NEGATIVE_LONG:
				return createNonNegativeLongFromString(eDataType, initialValue);
			case OMEPackage.NON_NEGATIVE_LONG_OBJECT:
				return createNonNegativeLongObjectFromString(eDataType, initialValue);
			case OMEPackage.OBJECTIVE_ID:
				return createObjectiveIDFromString(eDataType, initialValue);
			case OMEPackage.PERCENT_FRACTION:
				return createPercentFractionFromString(eDataType, initialValue);
			case OMEPackage.PERCENT_FRACTION_OBJECT:
				return createPercentFractionObjectFromString(eDataType, initialValue);
			case OMEPackage.PIXELS_ID:
				return createPixelsIDFromString(eDataType, initialValue);
			case OMEPackage.PIXEL_TYPE_OBJECT:
				return createPixelTypeObjectFromString(eDataType, initialValue);
			case OMEPackage.PLATE_ACQUISITION_ID:
				return createPlateAcquisitionIDFromString(eDataType, initialValue);
			case OMEPackage.PLATE_ID:
				return createPlateIDFromString(eDataType, initialValue);
			case OMEPackage.POSITIVE_FLOAT:
				return createPositiveFloatFromString(eDataType, initialValue);
			case OMEPackage.POSITIVE_FLOAT_OBJECT:
				return createPositiveFloatObjectFromString(eDataType, initialValue);
			case OMEPackage.POSITIVE_INT:
				return createPositiveIntFromString(eDataType, initialValue);
			case OMEPackage.POSITIVE_INT_OBJECT:
				return createPositiveIntObjectFromString(eDataType, initialValue);
			case OMEPackage.PROJECT_ID:
				return createProjectIDFromString(eDataType, initialValue);
			case OMEPackage.PULSE_TYPE_OBJECT:
				return createPulseTypeObjectFromString(eDataType, initialValue);
			case OMEPackage.REAGENT_ID:
				return createReagentIDFromString(eDataType, initialValue);
			case OMEPackage.RIGHTS_HELD_TYPE:
				return createRightsHeldTypeFromString(eDataType, initialValue);
			case OMEPackage.RIGHTS_HOLDER_TYPE:
				return createRightsHolderTypeFromString(eDataType, initialValue);
			case OMEPackage.ROIID:
				return createROIIDFromString(eDataType, initialValue);
			case OMEPackage.SCREEN_ID:
				return createScreenIDFromString(eDataType, initialValue);
			case OMEPackage.SHAPE_ID:
				return createShapeIDFromString(eDataType, initialValue);
			case OMEPackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case OMEPackage.TYPE_TYPE1:
				return createTypeType1FromString(eDataType, initialValue);
			case OMEPackage.TYPE_TYPE_ITEM_OBJECT:
				return createTypeTypeItemObjectFromString(eDataType, initialValue);
			case OMEPackage.TYPE_TYPE_ITEM_OBJECT1:
				return createTypeTypeItemObject1FromString(eDataType, initialValue);
			case OMEPackage.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
			case OMEPackage.TYPE_TYPE_OBJECT1:
				return createTypeTypeObject1FromString(eDataType, initialValue);
			case OMEPackage.TYPE_TYPE_OBJECT2:
				return createTypeTypeObject2FromString(eDataType, initialValue);
			case OMEPackage.TYPE_TYPE_OBJECT3:
				return createTypeTypeObject3FromString(eDataType, initialValue);
			case OMEPackage.TYPE_TYPE_OBJECT4:
				return createTypeTypeObject4FromString(eDataType, initialValue);
			case OMEPackage.TYPE_TYPE_OBJECT5:
				return createTypeTypeObject5FromString(eDataType, initialValue);
			case OMEPackage.UNITS_ANGLE_OBJECT:
				return createUnitsAngleObjectFromString(eDataType, initialValue);
			case OMEPackage.UNITS_ELECTRIC_POTENTIAL_OBJECT:
				return createUnitsElectricPotentialObjectFromString(eDataType, initialValue);
			case OMEPackage.UNITS_FREQUENCY_OBJECT:
				return createUnitsFrequencyObjectFromString(eDataType, initialValue);
			case OMEPackage.UNITS_LENGTH_OBJECT:
				return createUnitsLengthObjectFromString(eDataType, initialValue);
			case OMEPackage.UNITS_POWER_OBJECT:
				return createUnitsPowerObjectFromString(eDataType, initialValue);
			case OMEPackage.UNITS_PRESSURE_OBJECT:
				return createUnitsPressureObjectFromString(eDataType, initialValue);
			case OMEPackage.UNITS_TEMPERATURE_OBJECT:
				return createUnitsTemperatureObjectFromString(eDataType, initialValue);
			case OMEPackage.UNITS_TIME_OBJECT:
				return createUnitsTimeObjectFromString(eDataType, initialValue);
			case OMEPackage.UNIVERSALLY_UNIQUE_IDENTIFIER:
				return createUniversallyUniqueIdentifierFromString(eDataType, initialValue);
			case OMEPackage.WELL_ID:
				return createWellIDFromString(eDataType, initialValue);
			case OMEPackage.WELL_SAMPLE_ID:
				return createWellSampleIDFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OMEPackage.ACQUISITION_MODE_TYPE:
				return convertAcquisitionModeTypeToString(eDataType, instanceValue);
			case OMEPackage.BINNING:
				return convertBinningToString(eDataType, instanceValue);
			case OMEPackage.COMPRESSION_TYPE:
				return convertCompressionTypeToString(eDataType, instanceValue);
			case OMEPackage.COMPRESSION_TYPE1:
				return convertCompressionType1ToString(eDataType, instanceValue);
			case OMEPackage.CONTRAST_METHOD_TYPE:
				return convertContrastMethodTypeToString(eDataType, instanceValue);
			case OMEPackage.CORRECTION_TYPE:
				return convertCorrectionTypeToString(eDataType, instanceValue);
			case OMEPackage.DIMENSION_ORDER_TYPE:
				return convertDimensionOrderTypeToString(eDataType, instanceValue);
			case OMEPackage.FILL_RULE_TYPE:
				return convertFillRuleTypeToString(eDataType, instanceValue);
			case OMEPackage.FONT_FAMILY:
				return convertFontFamilyToString(eDataType, instanceValue);
			case OMEPackage.FONT_FAMILY_TYPE:
				return convertFontFamilyTypeToString(eDataType, instanceValue);
			case OMEPackage.FONT_STYLE_TYPE:
				return convertFontStyleTypeToString(eDataType, instanceValue);
			case OMEPackage.ILLUMINATION_TYPE_TYPE:
				return convertIlluminationTypeTypeToString(eDataType, instanceValue);
			case OMEPackage.IMMERSION_TYPE:
				return convertImmersionTypeToString(eDataType, instanceValue);
			case OMEPackage.LASER_MEDIUM_TYPE:
				return convertLaserMediumTypeToString(eDataType, instanceValue);
			case OMEPackage.MARKER:
				return convertMarkerToString(eDataType, instanceValue);
			case OMEPackage.MEDIUM_TYPE:
				return convertMediumTypeToString(eDataType, instanceValue);
			case OMEPackage.NAMING_CONVENTION:
				return convertNamingConventionToString(eDataType, instanceValue);
			case OMEPackage.PIXEL_TYPE:
				return convertPixelTypeToString(eDataType, instanceValue);
			case OMEPackage.PULSE_TYPE:
				return convertPulseTypeToString(eDataType, instanceValue);
			case OMEPackage.TYPE_TYPE2:
				return convertTypeType2ToString(eDataType, instanceValue);
			case OMEPackage.TYPE_TYPE3:
				return convertTypeType3ToString(eDataType, instanceValue);
			case OMEPackage.TYPE_TYPE4:
				return convertTypeType4ToString(eDataType, instanceValue);
			case OMEPackage.TYPE_TYPE5:
				return convertTypeType5ToString(eDataType, instanceValue);
			case OMEPackage.TYPE_TYPE6:
				return convertTypeType6ToString(eDataType, instanceValue);
			case OMEPackage.TYPE_TYPE7:
				return convertTypeType7ToString(eDataType, instanceValue);
			case OMEPackage.TYPE_TYPE_ITEM:
				return convertTypeTypeItemToString(eDataType, instanceValue);
			case OMEPackage.TYPE_TYPE_ITEM1:
				return convertTypeTypeItem1ToString(eDataType, instanceValue);
			case OMEPackage.UNITS_ANGLE:
				return convertUnitsAngleToString(eDataType, instanceValue);
			case OMEPackage.UNITS_ELECTRIC_POTENTIAL:
				return convertUnitsElectricPotentialToString(eDataType, instanceValue);
			case OMEPackage.UNITS_FREQUENCY:
				return convertUnitsFrequencyToString(eDataType, instanceValue);
			case OMEPackage.UNITS_LENGTH:
				return convertUnitsLengthToString(eDataType, instanceValue);
			case OMEPackage.UNITS_POWER:
				return convertUnitsPowerToString(eDataType, instanceValue);
			case OMEPackage.UNITS_PRESSURE:
				return convertUnitsPressureToString(eDataType, instanceValue);
			case OMEPackage.UNITS_TEMPERATURE:
				return convertUnitsTemperatureToString(eDataType, instanceValue);
			case OMEPackage.UNITS_TIME:
				return convertUnitsTimeToString(eDataType, instanceValue);
			case OMEPackage.ACQUISITION_MODE_TYPE_OBJECT:
				return convertAcquisitionModeTypeObjectToString(eDataType, instanceValue);
			case OMEPackage.ANNOTATION_ID:
				return convertAnnotationIDToString(eDataType, instanceValue);
			case OMEPackage.BASE64_BINARY:
				return convertBase64BinaryToString(eDataType, instanceValue);
			case OMEPackage.BINNING_OBJECT:
				return convertBinningObjectToString(eDataType, instanceValue);
			case OMEPackage.CHANNEL_ID:
				return convertChannelIDToString(eDataType, instanceValue);
			case OMEPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case OMEPackage.COLOR_OBJECT:
				return convertColorObjectToString(eDataType, instanceValue);
			case OMEPackage.COMPRESSION_TYPE_OBJECT:
				return convertCompressionTypeObjectToString(eDataType, instanceValue);
			case OMEPackage.COMPRESSION_TYPE_OBJECT1:
				return convertCompressionTypeObject1ToString(eDataType, instanceValue);
			case OMEPackage.CONTRAST_METHOD_TYPE_OBJECT:
				return convertContrastMethodTypeObjectToString(eDataType, instanceValue);
			case OMEPackage.CORRECTION_TYPE_OBJECT:
				return convertCorrectionTypeObjectToString(eDataType, instanceValue);
			case OMEPackage.DATASET_ID:
				return convertDatasetIDToString(eDataType, instanceValue);
			case OMEPackage.DESCRIPTION_TYPE:
				return convertDescriptionTypeToString(eDataType, instanceValue);
			case OMEPackage.DESCRIPTION_TYPE1:
				return convertDescriptionType1ToString(eDataType, instanceValue);
			case OMEPackage.DESCRIPTION_TYPE2:
				return convertDescriptionType2ToString(eDataType, instanceValue);
			case OMEPackage.DESCRIPTION_TYPE3:
				return convertDescriptionType3ToString(eDataType, instanceValue);
			case OMEPackage.DESCRIPTION_TYPE4:
				return convertDescriptionType4ToString(eDataType, instanceValue);
			case OMEPackage.DESCRIPTION_TYPE5:
				return convertDescriptionType5ToString(eDataType, instanceValue);
			case OMEPackage.DESCRIPTION_TYPE6:
				return convertDescriptionType6ToString(eDataType, instanceValue);
			case OMEPackage.DESCRIPTION_TYPE7:
				return convertDescriptionType7ToString(eDataType, instanceValue);
			case OMEPackage.DESCRIPTION_TYPE8:
				return convertDescriptionType8ToString(eDataType, instanceValue);
			case OMEPackage.DESCRIPTION_TYPE9:
				return convertDescriptionType9ToString(eDataType, instanceValue);
			case OMEPackage.DESCRIPTION_TYPE10:
				return convertDescriptionType10ToString(eDataType, instanceValue);
			case OMEPackage.DESCRIPTION_TYPE11:
				return convertDescriptionType11ToString(eDataType, instanceValue);
			case OMEPackage.DESCRIPTION_TYPE12:
				return convertDescriptionType12ToString(eDataType, instanceValue);
			case OMEPackage.DETECTOR_ID:
				return convertDetectorIDToString(eDataType, instanceValue);
			case OMEPackage.DICHROIC_ID:
				return convertDichroicIDToString(eDataType, instanceValue);
			case OMEPackage.DIMENSION_ORDER_TYPE_OBJECT:
				return convertDimensionOrderTypeObjectToString(eDataType, instanceValue);
			case OMEPackage.EXPERIMENTER_GROUP_ID:
				return convertExperimenterGroupIDToString(eDataType, instanceValue);
			case OMEPackage.EXPERIMENTER_ID:
				return convertExperimenterIDToString(eDataType, instanceValue);
			case OMEPackage.EXPERIMENT_ID:
				return convertExperimentIDToString(eDataType, instanceValue);
			case OMEPackage.FILL_RULE_TYPE_OBJECT:
				return convertFillRuleTypeObjectToString(eDataType, instanceValue);
			case OMEPackage.FILTER_ID:
				return convertFilterIDToString(eDataType, instanceValue);
			case OMEPackage.FILTER_SET_ID:
				return convertFilterSetIDToString(eDataType, instanceValue);
			case OMEPackage.FOLDER_ID:
				return convertFolderIDToString(eDataType, instanceValue);
			case OMEPackage.FONT_FAMILY_OBJECT:
				return convertFontFamilyObjectToString(eDataType, instanceValue);
			case OMEPackage.FONT_FAMILY_TYPE_OBJECT:
				return convertFontFamilyTypeObjectToString(eDataType, instanceValue);
			case OMEPackage.FONT_STYLE_TYPE_OBJECT:
				return convertFontStyleTypeObjectToString(eDataType, instanceValue);
			case OMEPackage.HEX40:
				return convertHex40ToString(eDataType, instanceValue);
			case OMEPackage.ILLUMINATION_TYPE_TYPE_OBJECT:
				return convertIlluminationTypeTypeObjectToString(eDataType, instanceValue);
			case OMEPackage.IMAGE_ID:
				return convertImageIDToString(eDataType, instanceValue);
			case OMEPackage.IMMERSION_TYPE_OBJECT:
				return convertImmersionTypeObjectToString(eDataType, instanceValue);
			case OMEPackage.INSTRUMENT_ID:
				return convertInstrumentIDToString(eDataType, instanceValue);
			case OMEPackage.LASER_MEDIUM_TYPE_OBJECT:
				return convertLaserMediumTypeObjectToString(eDataType, instanceValue);
			case OMEPackage.LENGTH_TYPE:
				return convertLengthTypeToString(eDataType, instanceValue);
			case OMEPackage.LENGTH_TYPE_OBJECT:
				return convertLengthTypeObjectToString(eDataType, instanceValue);
			case OMEPackage.LIGHT_SOURCE_ID:
				return convertLightSourceIDToString(eDataType, instanceValue);
			case OMEPackage.LSID:
				return convertLSIDToString(eDataType, instanceValue);
			case OMEPackage.MARKER_OBJECT:
				return convertMarkerObjectToString(eDataType, instanceValue);
			case OMEPackage.MEDIUM_TYPE_OBJECT:
				return convertMediumTypeObjectToString(eDataType, instanceValue);
			case OMEPackage.MICROBEAM_MANIPULATION_ID:
				return convertMicrobeamManipulationIDToString(eDataType, instanceValue);
			case OMEPackage.MODULE_ID:
				return convertModuleIDToString(eDataType, instanceValue);
			case OMEPackage.NAMING_CONVENTION_OBJECT:
				return convertNamingConventionObjectToString(eDataType, instanceValue);
			case OMEPackage.NON_NEGATIVE_FLOAT:
				return convertNonNegativeFloatToString(eDataType, instanceValue);
			case OMEPackage.NON_NEGATIVE_FLOAT_OBJECT:
				return convertNonNegativeFloatObjectToString(eDataType, instanceValue);
			case OMEPackage.NON_NEGATIVE_INT:
				return convertNonNegativeIntToString(eDataType, instanceValue);
			case OMEPackage.NON_NEGATIVE_INT_OBJECT:
				return convertNonNegativeIntObjectToString(eDataType, instanceValue);
			case OMEPackage.NON_NEGATIVE_LONG:
				return convertNonNegativeLongToString(eDataType, instanceValue);
			case OMEPackage.NON_NEGATIVE_LONG_OBJECT:
				return convertNonNegativeLongObjectToString(eDataType, instanceValue);
			case OMEPackage.OBJECTIVE_ID:
				return convertObjectiveIDToString(eDataType, instanceValue);
			case OMEPackage.PERCENT_FRACTION:
				return convertPercentFractionToString(eDataType, instanceValue);
			case OMEPackage.PERCENT_FRACTION_OBJECT:
				return convertPercentFractionObjectToString(eDataType, instanceValue);
			case OMEPackage.PIXELS_ID:
				return convertPixelsIDToString(eDataType, instanceValue);
			case OMEPackage.PIXEL_TYPE_OBJECT:
				return convertPixelTypeObjectToString(eDataType, instanceValue);
			case OMEPackage.PLATE_ACQUISITION_ID:
				return convertPlateAcquisitionIDToString(eDataType, instanceValue);
			case OMEPackage.PLATE_ID:
				return convertPlateIDToString(eDataType, instanceValue);
			case OMEPackage.POSITIVE_FLOAT:
				return convertPositiveFloatToString(eDataType, instanceValue);
			case OMEPackage.POSITIVE_FLOAT_OBJECT:
				return convertPositiveFloatObjectToString(eDataType, instanceValue);
			case OMEPackage.POSITIVE_INT:
				return convertPositiveIntToString(eDataType, instanceValue);
			case OMEPackage.POSITIVE_INT_OBJECT:
				return convertPositiveIntObjectToString(eDataType, instanceValue);
			case OMEPackage.PROJECT_ID:
				return convertProjectIDToString(eDataType, instanceValue);
			case OMEPackage.PULSE_TYPE_OBJECT:
				return convertPulseTypeObjectToString(eDataType, instanceValue);
			case OMEPackage.REAGENT_ID:
				return convertReagentIDToString(eDataType, instanceValue);
			case OMEPackage.RIGHTS_HELD_TYPE:
				return convertRightsHeldTypeToString(eDataType, instanceValue);
			case OMEPackage.RIGHTS_HOLDER_TYPE:
				return convertRightsHolderTypeToString(eDataType, instanceValue);
			case OMEPackage.ROIID:
				return convertROIIDToString(eDataType, instanceValue);
			case OMEPackage.SCREEN_ID:
				return convertScreenIDToString(eDataType, instanceValue);
			case OMEPackage.SHAPE_ID:
				return convertShapeIDToString(eDataType, instanceValue);
			case OMEPackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case OMEPackage.TYPE_TYPE1:
				return convertTypeType1ToString(eDataType, instanceValue);
			case OMEPackage.TYPE_TYPE_ITEM_OBJECT:
				return convertTypeTypeItemObjectToString(eDataType, instanceValue);
			case OMEPackage.TYPE_TYPE_ITEM_OBJECT1:
				return convertTypeTypeItemObject1ToString(eDataType, instanceValue);
			case OMEPackage.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			case OMEPackage.TYPE_TYPE_OBJECT1:
				return convertTypeTypeObject1ToString(eDataType, instanceValue);
			case OMEPackage.TYPE_TYPE_OBJECT2:
				return convertTypeTypeObject2ToString(eDataType, instanceValue);
			case OMEPackage.TYPE_TYPE_OBJECT3:
				return convertTypeTypeObject3ToString(eDataType, instanceValue);
			case OMEPackage.TYPE_TYPE_OBJECT4:
				return convertTypeTypeObject4ToString(eDataType, instanceValue);
			case OMEPackage.TYPE_TYPE_OBJECT5:
				return convertTypeTypeObject5ToString(eDataType, instanceValue);
			case OMEPackage.UNITS_ANGLE_OBJECT:
				return convertUnitsAngleObjectToString(eDataType, instanceValue);
			case OMEPackage.UNITS_ELECTRIC_POTENTIAL_OBJECT:
				return convertUnitsElectricPotentialObjectToString(eDataType, instanceValue);
			case OMEPackage.UNITS_FREQUENCY_OBJECT:
				return convertUnitsFrequencyObjectToString(eDataType, instanceValue);
			case OMEPackage.UNITS_LENGTH_OBJECT:
				return convertUnitsLengthObjectToString(eDataType, instanceValue);
			case OMEPackage.UNITS_POWER_OBJECT:
				return convertUnitsPowerObjectToString(eDataType, instanceValue);
			case OMEPackage.UNITS_PRESSURE_OBJECT:
				return convertUnitsPressureObjectToString(eDataType, instanceValue);
			case OMEPackage.UNITS_TEMPERATURE_OBJECT:
				return convertUnitsTemperatureObjectToString(eDataType, instanceValue);
			case OMEPackage.UNITS_TIME_OBJECT:
				return convertUnitsTimeObjectToString(eDataType, instanceValue);
			case OMEPackage.UNIVERSALLY_UNIQUE_IDENTIFIER:
				return convertUniversallyUniqueIdentifierToString(eDataType, instanceValue);
			case OMEPackage.WELL_ID:
				return convertWellIDToString(eDataType, instanceValue);
			case OMEPackage.WELL_SAMPLE_ID:
				return convertWellSampleIDToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffineTransform createAffineTransform() {
		AffineTransformImpl affineTransform = new AffineTransformImpl();
		return affineTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationRefType createAnnotationRefType() {
		AnnotationRefTypeImpl annotationRefType = new AnnotationRefTypeImpl();
		return annotationRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcType createArcType() {
		ArcTypeImpl arcType = new ArcTypeImpl();
		return arcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicAnnotation createBasicAnnotation() {
		BasicAnnotationImpl basicAnnotation = new BasicAnnotationImpl();
		return basicAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryFileType createBinaryFileType() {
		BinaryFileTypeImpl binaryFileType = new BinaryFileTypeImpl();
		return binaryFileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryOnlyType createBinaryOnlyType() {
		BinaryOnlyTypeImpl binaryOnlyType = new BinaryOnlyTypeImpl();
		return binaryOnlyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinDataType createBinDataType() {
		BinDataTypeImpl binDataType = new BinDataTypeImpl();
		return binDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanAnnotationType createBooleanAnnotationType() {
		BooleanAnnotationTypeImpl booleanAnnotationType = new BooleanAnnotationTypeImpl();
		return booleanAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChannelRefType createChannelRefType() {
		ChannelRefTypeImpl channelRefType = new ChannelRefTypeImpl();
		return channelRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChannelType createChannelType() {
		ChannelTypeImpl channelType = new ChannelTypeImpl();
		return channelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommentAnnotationType createCommentAnnotationType() {
		CommentAnnotationTypeImpl commentAnnotationType = new CommentAnnotationTypeImpl();
		return commentAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasetRefType createDatasetRefType() {
		DatasetRefTypeImpl datasetRefType = new DatasetRefTypeImpl();
		return datasetRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasetType createDatasetType() {
		DatasetTypeImpl datasetType = new DatasetTypeImpl();
		return datasetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetectorSettingsType createDetectorSettingsType() {
		DetectorSettingsTypeImpl detectorSettingsType = new DetectorSettingsTypeImpl();
		return detectorSettingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetectorType createDetectorType() {
		DetectorTypeImpl detectorType = new DetectorTypeImpl();
		return detectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DichroicRefType createDichroicRefType() {
		DichroicRefTypeImpl dichroicRefType = new DichroicRefTypeImpl();
		return dichroicRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DichroicType createDichroicType() {
		DichroicTypeImpl dichroicType = new DichroicTypeImpl();
		return dichroicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleAnnotationType createDoubleAnnotationType() {
		DoubleAnnotationTypeImpl doubleAnnotationType = new DoubleAnnotationTypeImpl();
		return doubleAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipseType createEllipseType() {
		EllipseTypeImpl ellipseType = new EllipseTypeImpl();
		return ellipseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimenterGroupRefType createExperimenterGroupRefType() {
		ExperimenterGroupRefTypeImpl experimenterGroupRefType = new ExperimenterGroupRefTypeImpl();
		return experimenterGroupRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimenterGroupType createExperimenterGroupType() {
		ExperimenterGroupTypeImpl experimenterGroupType = new ExperimenterGroupTypeImpl();
		return experimenterGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimenterRefType createExperimenterRefType() {
		ExperimenterRefTypeImpl experimenterRefType = new ExperimenterRefTypeImpl();
		return experimenterRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimenterType createExperimenterType() {
		ExperimenterTypeImpl experimenterType = new ExperimenterTypeImpl();
		return experimenterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentRefType createExperimentRefType() {
		ExperimentRefTypeImpl experimentRefType = new ExperimentRefTypeImpl();
		return experimentRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentType createExperimentType() {
		ExperimentTypeImpl experimentType = new ExperimentTypeImpl();
		return experimentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalType createExternalType() {
		ExternalTypeImpl externalType = new ExternalTypeImpl();
		return externalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilamentType createFilamentType() {
		FilamentTypeImpl filamentType = new FilamentTypeImpl();
		return filamentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileAnnotationType createFileAnnotationType() {
		FileAnnotationTypeImpl fileAnnotationType = new FileAnnotationTypeImpl();
		return fileAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterRef createFilterRef() {
		FilterRefImpl filterRef = new FilterRefImpl();
		return filterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterSetRefType createFilterSetRefType() {
		FilterSetRefTypeImpl filterSetRefType = new FilterSetRefTypeImpl();
		return filterSetRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterSetType createFilterSetType() {
		FilterSetTypeImpl filterSetType = new FilterSetTypeImpl();
		return filterSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterType createFilterType() {
		FilterTypeImpl filterType = new FilterTypeImpl();
		return filterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FolderRefType createFolderRefType() {
		FolderRefTypeImpl folderRefType = new FolderRefTypeImpl();
		return folderRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FolderType createFolderType() {
		FolderTypeImpl folderType = new FolderTypeImpl();
		return folderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericExcitationSourceType createGenericExcitationSourceType() {
		GenericExcitationSourceTypeImpl genericExcitationSourceType = new GenericExcitationSourceTypeImpl();
		return genericExcitationSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageRefType createImageRefType() {
		ImageRefTypeImpl imageRefType = new ImageRefTypeImpl();
		return imageRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageType createImageType() {
		ImageTypeImpl imageType = new ImageTypeImpl();
		return imageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagingEnvironmentType createImagingEnvironmentType() {
		ImagingEnvironmentTypeImpl imagingEnvironmentType = new ImagingEnvironmentTypeImpl();
		return imagingEnvironmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstrumentRefType createInstrumentRefType() {
		InstrumentRefTypeImpl instrumentRefType = new InstrumentRefTypeImpl();
		return instrumentRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstrumentType createInstrumentType() {
		InstrumentTypeImpl instrumentType = new InstrumentTypeImpl();
		return instrumentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType createLabelType() {
		LabelTypeImpl labelType = new LabelTypeImpl();
		return labelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LaserType createLaserType() {
		LaserTypeImpl laserType = new LaserTypeImpl();
		return laserType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeaderType createLeaderType() {
		LeaderTypeImpl leaderType = new LeaderTypeImpl();
		return leaderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightEmittingDiodeType createLightEmittingDiodeType() {
		LightEmittingDiodeTypeImpl lightEmittingDiodeType = new LightEmittingDiodeTypeImpl();
		return lightEmittingDiodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightPathType createLightPathType() {
		LightPathTypeImpl lightPathType = new LightPathTypeImpl();
		return lightPathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightSource createLightSource() {
		LightSourceImpl lightSource = new LightSourceImpl();
		return lightSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightSourceSettingsType createLightSourceSettingsType() {
		LightSourceSettingsTypeImpl lightSourceSettingsType = new LightSourceSettingsTypeImpl();
		return lightSourceSettingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineType createLineType() {
		LineTypeImpl lineType = new LineTypeImpl();
		return lineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListAnnotationType createListAnnotationType() {
		ListAnnotationTypeImpl listAnnotationType = new ListAnnotationTypeImpl();
		return listAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LongAnnotationType createLongAnnotationType() {
		LongAnnotationTypeImpl longAnnotationType = new LongAnnotationTypeImpl();
		return longAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManufacturerSpec createManufacturerSpec() {
		ManufacturerSpecImpl manufacturerSpec = new ManufacturerSpecImpl();
		return manufacturerSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Map createMap() {
		MapImpl map = new MapImpl();
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MapAnnotationType createMapAnnotationType() {
		MapAnnotationTypeImpl mapAnnotationType = new MapAnnotationTypeImpl();
		return mapAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaskType createMaskType() {
		MaskTypeImpl maskType = new MaskTypeImpl();
		return maskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicrobeamManipulationRefType createMicrobeamManipulationRefType() {
		MicrobeamManipulationRefTypeImpl microbeamManipulationRefType = new MicrobeamManipulationRefTypeImpl();
		return microbeamManipulationRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicrobeamManipulationType createMicrobeamManipulationType() {
		MicrobeamManipulationTypeImpl microbeamManipulationType = new MicrobeamManipulationTypeImpl();
		return microbeamManipulationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicroscopeType createMicroscopeType() {
		MicroscopeTypeImpl microscopeType = new MicroscopeTypeImpl();
		return microscopeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MType createMType() {
		MTypeImpl mType = new MTypeImpl();
		return mType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericAnnotation createNumericAnnotation() {
		NumericAnnotationImpl numericAnnotation = new NumericAnnotationImpl();
		return numericAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectiveSettingsType createObjectiveSettingsType() {
		ObjectiveSettingsTypeImpl objectiveSettingsType = new ObjectiveSettingsTypeImpl();
		return objectiveSettingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectiveType createObjectiveType() {
		ObjectiveTypeImpl objectiveType = new ObjectiveTypeImpl();
		return objectiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OMEType createOMEType() {
		OMETypeImpl omeType = new OMETypeImpl();
		return omeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PixelsType createPixelsType() {
		PixelsTypeImpl pixelsType = new PixelsTypeImpl();
		return pixelsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlaneType createPlaneType() {
		PlaneTypeImpl planeType = new PlaneTypeImpl();
		return planeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlateAcquisitionType createPlateAcquisitionType() {
		PlateAcquisitionTypeImpl plateAcquisitionType = new PlateAcquisitionTypeImpl();
		return plateAcquisitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlateRefType createPlateRefType() {
		PlateRefTypeImpl plateRefType = new PlateRefTypeImpl();
		return plateRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlateType createPlateType() {
		PlateTypeImpl plateType = new PlateTypeImpl();
		return plateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType createPointType() {
		PointTypeImpl pointType = new PointTypeImpl();
		return pointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolygonType createPolygonType() {
		PolygonTypeImpl polygonType = new PolygonTypeImpl();
		return polygonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolylineType createPolylineType() {
		PolylineTypeImpl polylineType = new PolylineTypeImpl();
		return polylineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectRefType createProjectRefType() {
		ProjectRefTypeImpl projectRefType = new ProjectRefTypeImpl();
		return projectRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectType createProjectType() {
		ProjectTypeImpl projectType = new ProjectTypeImpl();
		return projectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PumpType createPumpType() {
		PumpTypeImpl pumpType = new PumpTypeImpl();
		return pumpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReagentRefType createReagentRefType() {
		ReagentRefTypeImpl reagentRefType = new ReagentRefTypeImpl();
		return reagentRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReagentType createReagentType() {
		ReagentTypeImpl reagentType = new ReagentTypeImpl();
		return reagentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RectangleType createRectangleType() {
		RectangleTypeImpl rectangleType = new RectangleTypeImpl();
		return rectangleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RightsType createRightsType() {
		RightsTypeImpl rightsType = new RightsTypeImpl();
		return rightsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ROIRefType createROIRefType() {
		ROIRefTypeImpl roiRefType = new ROIRefTypeImpl();
		return roiRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ROIType createROIType() {
		ROITypeImpl roiType = new ROITypeImpl();
		return roiType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScreenType createScreenType() {
		ScreenTypeImpl screenType = new ScreenTypeImpl();
		return screenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Settings createSettings() {
		SettingsImpl settings = new SettingsImpl();
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shape createShape() {
		ShapeImpl shape = new ShapeImpl();
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StageLabelType createStageLabelType() {
		StageLabelTypeImpl stageLabelType = new StageLabelTypeImpl();
		return stageLabelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuredAnnotationsType createStructuredAnnotationsType() {
		StructuredAnnotationsTypeImpl structuredAnnotationsType = new StructuredAnnotationsTypeImpl();
		return structuredAnnotationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagAnnotationType createTagAnnotationType() {
		TagAnnotationTypeImpl tagAnnotationType = new TagAnnotationTypeImpl();
		return tagAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermAnnotationType createTermAnnotationType() {
		TermAnnotationTypeImpl termAnnotationType = new TermAnnotationTypeImpl();
		return termAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextAnnotation createTextAnnotation() {
		TextAnnotationImpl textAnnotation = new TextAnnotationImpl();
		return textAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TiffDataType createTiffDataType() {
		TiffDataTypeImpl tiffDataType = new TiffDataTypeImpl();
		return tiffDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimestampAnnotationType createTimestampAnnotationType() {
		TimestampAnnotationTypeImpl timestampAnnotationType = new TimestampAnnotationTypeImpl();
		return timestampAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmittanceRangeType createTransmittanceRangeType() {
		TransmittanceRangeTypeImpl transmittanceRangeType = new TransmittanceRangeTypeImpl();
		return transmittanceRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAnnotation createTypeAnnotation() {
		TypeAnnotationImpl typeAnnotation = new TypeAnnotationImpl();
		return typeAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnionType createUnionType() {
		UnionTypeImpl unionType = new UnionTypeImpl();
		return unionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UUIDType createUUIDType() {
		UUIDTypeImpl uuidType = new UUIDTypeImpl();
		return uuidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WellSampleRefType createWellSampleRefType() {
		WellSampleRefTypeImpl wellSampleRefType = new WellSampleRefTypeImpl();
		return wellSampleRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WellSampleType createWellSampleType() {
		WellSampleTypeImpl wellSampleType = new WellSampleTypeImpl();
		return wellSampleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WellType createWellType() {
		WellTypeImpl wellType = new WellTypeImpl();
		return wellType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLAnnotationType createXMLAnnotationType() {
		XMLAnnotationTypeImpl xmlAnnotationType = new XMLAnnotationTypeImpl();
		return xmlAnnotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcquisitionModeType createAcquisitionModeTypeFromString(EDataType eDataType, String initialValue) {
		AcquisitionModeType result = AcquisitionModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAcquisitionModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binning createBinningFromString(EDataType eDataType, String initialValue) {
		Binning result = Binning.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinningToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompressionType createCompressionTypeFromString(EDataType eDataType, String initialValue) {
		CompressionType result = CompressionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompressionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompressionType1 createCompressionType1FromString(EDataType eDataType, String initialValue) {
		CompressionType1 result = CompressionType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompressionType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrastMethodType createContrastMethodTypeFromString(EDataType eDataType, String initialValue) {
		ContrastMethodType result = ContrastMethodType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContrastMethodTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrectionType createCorrectionTypeFromString(EDataType eDataType, String initialValue) {
		CorrectionType result = CorrectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCorrectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionOrderType createDimensionOrderTypeFromString(EDataType eDataType, String initialValue) {
		DimensionOrderType result = DimensionOrderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDimensionOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillRuleType createFillRuleTypeFromString(EDataType eDataType, String initialValue) {
		FillRuleType result = FillRuleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillRuleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFamily createFontFamilyFromString(EDataType eDataType, String initialValue) {
		FontFamily result = FontFamily.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontFamilyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFamilyType createFontFamilyTypeFromString(EDataType eDataType, String initialValue) {
		FontFamilyType result = FontFamilyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontFamilyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyleType createFontStyleTypeFromString(EDataType eDataType, String initialValue) {
		FontStyleType result = FontStyleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontStyleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlluminationTypeType createIlluminationTypeTypeFromString(EDataType eDataType, String initialValue) {
		IlluminationTypeType result = IlluminationTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIlluminationTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmersionType createImmersionTypeFromString(EDataType eDataType, String initialValue) {
		ImmersionType result = ImmersionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmersionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaserMediumType createLaserMediumTypeFromString(EDataType eDataType, String initialValue) {
		LaserMediumType result = LaserMediumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLaserMediumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marker createMarkerFromString(EDataType eDataType, String initialValue) {
		Marker result = Marker.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarkerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediumType createMediumTypeFromString(EDataType eDataType, String initialValue) {
		MediumType result = MediumType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediumTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingConvention createNamingConventionFromString(EDataType eDataType, String initialValue) {
		NamingConvention result = NamingConvention.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingConventionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PixelType createPixelTypeFromString(EDataType eDataType, String initialValue) {
		PixelType result = PixelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPixelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PulseType createPulseTypeFromString(EDataType eDataType, String initialValue) {
		PulseType result = PulseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPulseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType2 createTypeType2FromString(EDataType eDataType, String initialValue) {
		TypeType2 result = TypeType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType3 createTypeType3FromString(EDataType eDataType, String initialValue) {
		TypeType3 result = TypeType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType4 createTypeType4FromString(EDataType eDataType, String initialValue) {
		TypeType4 result = TypeType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType5 createTypeType5FromString(EDataType eDataType, String initialValue) {
		TypeType5 result = TypeType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType6 createTypeType6FromString(EDataType eDataType, String initialValue) {
		TypeType6 result = TypeType6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType7 createTypeType7FromString(EDataType eDataType, String initialValue) {
		TypeType7 result = TypeType7.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType7ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeTypeItem createTypeTypeItemFromString(EDataType eDataType, String initialValue) {
		TypeTypeItem result = TypeTypeItem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeItemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeTypeItem1 createTypeTypeItem1FromString(EDataType eDataType, String initialValue) {
		TypeTypeItem1 result = TypeTypeItem1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeItem1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsAngle createUnitsAngleFromString(EDataType eDataType, String initialValue) {
		UnitsAngle result = UnitsAngle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsAngleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsElectricPotential createUnitsElectricPotentialFromString(EDataType eDataType, String initialValue) {
		UnitsElectricPotential result = UnitsElectricPotential.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsElectricPotentialToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsFrequency createUnitsFrequencyFromString(EDataType eDataType, String initialValue) {
		UnitsFrequency result = UnitsFrequency.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsFrequencyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsLength createUnitsLengthFromString(EDataType eDataType, String initialValue) {
		UnitsLength result = UnitsLength.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsLengthToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsPower createUnitsPowerFromString(EDataType eDataType, String initialValue) {
		UnitsPower result = UnitsPower.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsPowerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsPressure createUnitsPressureFromString(EDataType eDataType, String initialValue) {
		UnitsPressure result = UnitsPressure.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsPressureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsTemperature createUnitsTemperatureFromString(EDataType eDataType, String initialValue) {
		UnitsTemperature result = UnitsTemperature.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsTemperatureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsTime createUnitsTimeFromString(EDataType eDataType, String initialValue) {
		UnitsTime result = UnitsTime.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsTimeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcquisitionModeType createAcquisitionModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAcquisitionModeTypeFromString(OMEPackage.eINSTANCE.getAcquisitionModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAcquisitionModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAcquisitionModeTypeToString(OMEPackage.eINSTANCE.getAcquisitionModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAnnotationIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnnotationIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createBase64BinaryFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BASE64_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBase64BinaryToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BASE64_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binning createBinningObjectFromString(EDataType eDataType, String initialValue) {
		return createBinningFromString(OMEPackage.eINSTANCE.getBinning(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinningObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBinningToString(OMEPackage.eINSTANCE.getBinning(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createChannelIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChannelIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createColorFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createColorObjectFromString(EDataType eDataType, String initialValue) {
		return createColorFromString(OMEPackage.eINSTANCE.getColor(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorObjectToString(EDataType eDataType, Object instanceValue) {
		return convertColorToString(OMEPackage.eINSTANCE.getColor(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompressionType createCompressionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCompressionTypeFromString(OMEPackage.eINSTANCE.getCompressionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompressionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompressionTypeToString(OMEPackage.eINSTANCE.getCompressionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompressionType1 createCompressionTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createCompressionType1FromString(OMEPackage.eINSTANCE.getCompressionType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompressionTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertCompressionType1ToString(OMEPackage.eINSTANCE.getCompressionType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrastMethodType createContrastMethodTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createContrastMethodTypeFromString(OMEPackage.eINSTANCE.getContrastMethodType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContrastMethodTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContrastMethodTypeToString(OMEPackage.eINSTANCE.getContrastMethodType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrectionType createCorrectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCorrectionTypeFromString(OMEPackage.eINSTANCE.getCorrectionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCorrectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCorrectionTypeToString(OMEPackage.eINSTANCE.getCorrectionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDatasetIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatasetIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDescriptionTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDescriptionTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDescriptionType1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDescriptionType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDescriptionType2FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDescriptionType2ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDescriptionType3FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDescriptionType3ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDescriptionType4FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDescriptionType4ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDescriptionType5FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDescriptionType5ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDescriptionType6FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDescriptionType6ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDescriptionType7FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDescriptionType7ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDescriptionType8FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDescriptionType8ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDescriptionType9FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDescriptionType9ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDescriptionType10FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDescriptionType10ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDescriptionType11FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDescriptionType11ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDescriptionType12FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDescriptionType12ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDetectorIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDetectorIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDichroicIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDichroicIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionOrderType createDimensionOrderTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDimensionOrderTypeFromString(OMEPackage.eINSTANCE.getDimensionOrderType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDimensionOrderTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDimensionOrderTypeToString(OMEPackage.eINSTANCE.getDimensionOrderType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createExperimenterGroupIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExperimenterGroupIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createExperimenterIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExperimenterIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createExperimentIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExperimentIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillRuleType createFillRuleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFillRuleTypeFromString(OMEPackage.eINSTANCE.getFillRuleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillRuleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFillRuleTypeToString(OMEPackage.eINSTANCE.getFillRuleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFilterIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFilterSetIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterSetIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createFolderIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFolderIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFamily createFontFamilyObjectFromString(EDataType eDataType, String initialValue) {
		return createFontFamilyFromString(OMEPackage.eINSTANCE.getFontFamily(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontFamilyObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFontFamilyToString(OMEPackage.eINSTANCE.getFontFamily(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFamilyType createFontFamilyTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFontFamilyTypeFromString(OMEPackage.eINSTANCE.getFontFamilyType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontFamilyTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFontFamilyTypeToString(OMEPackage.eINSTANCE.getFontFamilyType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyleType createFontStyleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFontStyleTypeFromString(OMEPackage.eINSTANCE.getFontStyleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontStyleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFontStyleTypeToString(OMEPackage.eINSTANCE.getFontStyleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createHex40FromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.HEX_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHex40ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.HEX_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IlluminationTypeType createIlluminationTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIlluminationTypeTypeFromString(OMEPackage.eINSTANCE.getIlluminationTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIlluminationTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIlluminationTypeTypeToString(OMEPackage.eINSTANCE.getIlluminationTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createImageIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmersionType createImmersionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createImmersionTypeFromString(OMEPackage.eINSTANCE.getImmersionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImmersionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImmersionTypeToString(OMEPackage.eINSTANCE.getImmersionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createInstrumentIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstrumentIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaserMediumType createLaserMediumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLaserMediumTypeFromString(OMEPackage.eINSTANCE.getLaserMediumType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLaserMediumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLaserMediumTypeToString(OMEPackage.eINSTANCE.getLaserMediumType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createLengthTypeFromString(EDataType eDataType, String initialValue) {
		return createNonNegativeLongFromString(OMEPackage.eINSTANCE.getNonNegativeLong(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLengthTypeToString(EDataType eDataType, Object instanceValue) {
		return convertNonNegativeLongToString(OMEPackage.eINSTANCE.getNonNegativeLong(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createLengthTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLengthTypeFromString(OMEPackage.eINSTANCE.getLengthType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLengthTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLengthTypeToString(OMEPackage.eINSTANCE.getLengthType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLightSourceIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLightSourceIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLSIDFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLSIDToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Marker createMarkerObjectFromString(EDataType eDataType, String initialValue) {
		return createMarkerFromString(OMEPackage.eINSTANCE.getMarker(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMarkerObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMarkerToString(OMEPackage.eINSTANCE.getMarker(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediumType createMediumTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMediumTypeFromString(OMEPackage.eINSTANCE.getMediumType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediumTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMediumTypeToString(OMEPackage.eINSTANCE.getMediumType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMicrobeamManipulationIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMicrobeamManipulationIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createModuleIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModuleIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingConvention createNamingConventionObjectFromString(EDataType eDataType, String initialValue) {
		return createNamingConventionFromString(OMEPackage.eINSTANCE.getNamingConvention(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamingConventionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNamingConventionToString(OMEPackage.eINSTANCE.getNamingConvention(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createNonNegativeFloatFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeFloatToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createNonNegativeFloatObjectFromString(EDataType eDataType, String initialValue) {
		return createNonNegativeFloatFromString(OMEPackage.eINSTANCE.getNonNegativeFloat(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeFloatObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNonNegativeFloatToString(OMEPackage.eINSTANCE.getNonNegativeFloat(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createNonNegativeIntFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeIntToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createNonNegativeIntObjectFromString(EDataType eDataType, String initialValue) {
		return createNonNegativeIntFromString(OMEPackage.eINSTANCE.getNonNegativeInt(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeIntObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNonNegativeIntToString(OMEPackage.eINSTANCE.getNonNegativeInt(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createNonNegativeLongFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeLongToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createNonNegativeLongObjectFromString(EDataType eDataType, String initialValue) {
		return createNonNegativeLongFromString(OMEPackage.eINSTANCE.getNonNegativeLong(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeLongObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNonNegativeLongToString(OMEPackage.eINSTANCE.getNonNegativeLong(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createObjectiveIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectiveIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createPercentFractionFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPercentFractionToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createPercentFractionObjectFromString(EDataType eDataType, String initialValue) {
		return createPercentFractionFromString(OMEPackage.eINSTANCE.getPercentFraction(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPercentFractionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPercentFractionToString(OMEPackage.eINSTANCE.getPercentFraction(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPixelsIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPixelsIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PixelType createPixelTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPixelTypeFromString(OMEPackage.eINSTANCE.getPixelType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPixelTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPixelTypeToString(OMEPackage.eINSTANCE.getPixelType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPlateAcquisitionIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlateAcquisitionIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPlateIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlateIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createPositiveFloatFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveFloatToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createPositiveFloatObjectFromString(EDataType eDataType, String initialValue) {
		return createPositiveFloatFromString(OMEPackage.eINSTANCE.getPositiveFloat(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveFloatObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPositiveFloatToString(OMEPackage.eINSTANCE.getPositiveFloat(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createPositiveIntFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createPositiveIntObjectFromString(EDataType eDataType, String initialValue) {
		return createPositiveIntFromString(OMEPackage.eINSTANCE.getPositiveInt(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPositiveIntToString(OMEPackage.eINSTANCE.getPositiveInt(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createProjectIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProjectIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PulseType createPulseTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPulseTypeFromString(OMEPackage.eINSTANCE.getPulseType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPulseTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPulseTypeToString(OMEPackage.eINSTANCE.getPulseType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createReagentIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReagentIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRightsHeldTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRightsHeldTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRightsHolderTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRightsHolderTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createROIIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertROIIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScreenIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScreenIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createShapeIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShapeIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TypeTypeItem1> createTypeTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<TypeTypeItem1> result = new ArrayList<TypeTypeItem1>();
		for (String item : split(initialValue)) {
			result.add(createTypeTypeItem1FromString(OMEPackage.eINSTANCE.getTypeTypeItem1(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertTypeTypeItem1ToString(OMEPackage.eINSTANCE.getTypeTypeItem1(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<TypeTypeItem> createTypeType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<TypeTypeItem> result = new ArrayList<TypeTypeItem>();
		for (String item : split(initialValue)) {
			result.add(createTypeTypeItemFromString(OMEPackage.eINSTANCE.getTypeTypeItem(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertTypeTypeItemToString(OMEPackage.eINSTANCE.getTypeTypeItem(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeTypeItem createTypeTypeItemObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeItemFromString(OMEPackage.eINSTANCE.getTypeTypeItem(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeItemObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeItemToString(OMEPackage.eINSTANCE.getTypeTypeItem(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeTypeItem1 createTypeTypeItemObject1FromString(EDataType eDataType, String initialValue) {
		return createTypeTypeItem1FromString(OMEPackage.eINSTANCE.getTypeTypeItem1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeItemObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeItem1ToString(OMEPackage.eINSTANCE.getTypeTypeItem1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType4 createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeType4FromString(OMEPackage.eINSTANCE.getTypeType4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType4ToString(OMEPackage.eINSTANCE.getTypeType4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType5 createTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createTypeType5FromString(OMEPackage.eINSTANCE.getTypeType5(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType5ToString(OMEPackage.eINSTANCE.getTypeType5(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType6 createTypeTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createTypeType6FromString(OMEPackage.eINSTANCE.getTypeType6(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType6ToString(OMEPackage.eINSTANCE.getTypeType6(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType3 createTypeTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createTypeType3FromString(OMEPackage.eINSTANCE.getTypeType3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType3ToString(OMEPackage.eINSTANCE.getTypeType3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType2 createTypeTypeObject4FromString(EDataType eDataType, String initialValue) {
		return createTypeType2FromString(OMEPackage.eINSTANCE.getTypeType2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject4ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType2ToString(OMEPackage.eINSTANCE.getTypeType2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType7 createTypeTypeObject5FromString(EDataType eDataType, String initialValue) {
		return createTypeType7FromString(OMEPackage.eINSTANCE.getTypeType7(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject5ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType7ToString(OMEPackage.eINSTANCE.getTypeType7(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsAngle createUnitsAngleObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitsAngleFromString(OMEPackage.eINSTANCE.getUnitsAngle(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsAngleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitsAngleToString(OMEPackage.eINSTANCE.getUnitsAngle(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsElectricPotential createUnitsElectricPotentialObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitsElectricPotentialFromString(OMEPackage.eINSTANCE.getUnitsElectricPotential(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsElectricPotentialObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitsElectricPotentialToString(OMEPackage.eINSTANCE.getUnitsElectricPotential(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsFrequency createUnitsFrequencyObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitsFrequencyFromString(OMEPackage.eINSTANCE.getUnitsFrequency(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsFrequencyObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitsFrequencyToString(OMEPackage.eINSTANCE.getUnitsFrequency(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsLength createUnitsLengthObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitsLengthFromString(OMEPackage.eINSTANCE.getUnitsLength(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsLengthObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitsLengthToString(OMEPackage.eINSTANCE.getUnitsLength(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsPower createUnitsPowerObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitsPowerFromString(OMEPackage.eINSTANCE.getUnitsPower(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsPowerObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitsPowerToString(OMEPackage.eINSTANCE.getUnitsPower(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsPressure createUnitsPressureObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitsPressureFromString(OMEPackage.eINSTANCE.getUnitsPressure(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsPressureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitsPressureToString(OMEPackage.eINSTANCE.getUnitsPressure(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsTemperature createUnitsTemperatureObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitsTemperatureFromString(OMEPackage.eINSTANCE.getUnitsTemperature(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsTemperatureObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitsTemperatureToString(OMEPackage.eINSTANCE.getUnitsTemperature(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsTime createUnitsTimeObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitsTimeFromString(OMEPackage.eINSTANCE.getUnitsTime(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsTimeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitsTimeToString(OMEPackage.eINSTANCE.getUnitsTime(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUniversallyUniqueIdentifierFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUniversallyUniqueIdentifierToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createWellIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWellIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createWellSampleIDFromString(EDataType eDataType, String initialValue) {
		return createLSIDFromString(OMEPackage.eINSTANCE.getLSID(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWellSampleIDToString(EDataType eDataType, Object instanceValue) {
		return convertLSIDToString(OMEPackage.eINSTANCE.getLSID(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OMEPackage getOMEPackage() {
		return (OMEPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OMEPackage getPackage() {
		return OMEPackage.eINSTANCE;
	}

} //OMEFactoryImpl
