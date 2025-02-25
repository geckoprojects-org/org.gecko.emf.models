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
package org.openmicroscopy.ome.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.openmicroscopy.ome.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openmicroscopy.ome.OMEPackage
 * @generated
 */
public class OMEValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OMEValidator INSTANCE = new OMEValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openmicroscopy.ome";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMEValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OMEPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case OMEPackage.AFFINE_TRANSFORM:
				return validateAffineTransform((AffineTransform)value, diagnostics, context);
			case OMEPackage.ANNOTATION:
				return validateAnnotation((Annotation)value, diagnostics, context);
			case OMEPackage.ANNOTATION_REF_TYPE:
				return validateAnnotationRefType((AnnotationRefType)value, diagnostics, context);
			case OMEPackage.ARC_TYPE:
				return validateArcType((ArcType)value, diagnostics, context);
			case OMEPackage.BASIC_ANNOTATION:
				return validateBasicAnnotation((BasicAnnotation)value, diagnostics, context);
			case OMEPackage.BINARY_FILE_TYPE:
				return validateBinaryFileType((BinaryFileType)value, diagnostics, context);
			case OMEPackage.BINARY_ONLY_TYPE:
				return validateBinaryOnlyType((BinaryOnlyType)value, diagnostics, context);
			case OMEPackage.BIN_DATA_TYPE:
				return validateBinDataType((BinDataType)value, diagnostics, context);
			case OMEPackage.BOOLEAN_ANNOTATION_TYPE:
				return validateBooleanAnnotationType((BooleanAnnotationType)value, diagnostics, context);
			case OMEPackage.CHANNEL_REF_TYPE:
				return validateChannelRefType((ChannelRefType)value, diagnostics, context);
			case OMEPackage.CHANNEL_TYPE:
				return validateChannelType((ChannelType)value, diagnostics, context);
			case OMEPackage.COMMENT_ANNOTATION_TYPE:
				return validateCommentAnnotationType((CommentAnnotationType)value, diagnostics, context);
			case OMEPackage.DATASET_REF_TYPE:
				return validateDatasetRefType((DatasetRefType)value, diagnostics, context);
			case OMEPackage.DATASET_TYPE:
				return validateDatasetType((DatasetType)value, diagnostics, context);
			case OMEPackage.DETECTOR_SETTINGS_TYPE:
				return validateDetectorSettingsType((DetectorSettingsType)value, diagnostics, context);
			case OMEPackage.DETECTOR_TYPE:
				return validateDetectorType((DetectorType)value, diagnostics, context);
			case OMEPackage.DICHROIC_REF_TYPE:
				return validateDichroicRefType((DichroicRefType)value, diagnostics, context);
			case OMEPackage.DICHROIC_TYPE:
				return validateDichroicType((DichroicType)value, diagnostics, context);
			case OMEPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case OMEPackage.DOUBLE_ANNOTATION_TYPE:
				return validateDoubleAnnotationType((DoubleAnnotationType)value, diagnostics, context);
			case OMEPackage.ELLIPSE_TYPE:
				return validateEllipseType((EllipseType)value, diagnostics, context);
			case OMEPackage.EXPERIMENTER_GROUP_REF_TYPE:
				return validateExperimenterGroupRefType((ExperimenterGroupRefType)value, diagnostics, context);
			case OMEPackage.EXPERIMENTER_GROUP_TYPE:
				return validateExperimenterGroupType((ExperimenterGroupType)value, diagnostics, context);
			case OMEPackage.EXPERIMENTER_REF_TYPE:
				return validateExperimenterRefType((ExperimenterRefType)value, diagnostics, context);
			case OMEPackage.EXPERIMENTER_TYPE:
				return validateExperimenterType((ExperimenterType)value, diagnostics, context);
			case OMEPackage.EXPERIMENT_REF_TYPE:
				return validateExperimentRefType((ExperimentRefType)value, diagnostics, context);
			case OMEPackage.EXPERIMENT_TYPE:
				return validateExperimentType((ExperimentType)value, diagnostics, context);
			case OMEPackage.EXTERNAL_TYPE:
				return validateExternalType((ExternalType)value, diagnostics, context);
			case OMEPackage.FILAMENT_TYPE:
				return validateFilamentType((FilamentType)value, diagnostics, context);
			case OMEPackage.FILE_ANNOTATION_TYPE:
				return validateFileAnnotationType((FileAnnotationType)value, diagnostics, context);
			case OMEPackage.FILTER_REF:
				return validateFilterRef((FilterRef)value, diagnostics, context);
			case OMEPackage.FILTER_SET_REF_TYPE:
				return validateFilterSetRefType((FilterSetRefType)value, diagnostics, context);
			case OMEPackage.FILTER_SET_TYPE:
				return validateFilterSetType((FilterSetType)value, diagnostics, context);
			case OMEPackage.FILTER_TYPE:
				return validateFilterType((FilterType)value, diagnostics, context);
			case OMEPackage.FOLDER_REF_TYPE:
				return validateFolderRefType((FolderRefType)value, diagnostics, context);
			case OMEPackage.FOLDER_TYPE:
				return validateFolderType((FolderType)value, diagnostics, context);
			case OMEPackage.GENERIC_EXCITATION_SOURCE_TYPE:
				return validateGenericExcitationSourceType((GenericExcitationSourceType)value, diagnostics, context);
			case OMEPackage.IMAGE_REF_TYPE:
				return validateImageRefType((ImageRefType)value, diagnostics, context);
			case OMEPackage.IMAGE_TYPE:
				return validateImageType((ImageType)value, diagnostics, context);
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE:
				return validateImagingEnvironmentType((ImagingEnvironmentType)value, diagnostics, context);
			case OMEPackage.INSTRUMENT_REF_TYPE:
				return validateInstrumentRefType((InstrumentRefType)value, diagnostics, context);
			case OMEPackage.INSTRUMENT_TYPE:
				return validateInstrumentType((InstrumentType)value, diagnostics, context);
			case OMEPackage.LABEL_TYPE:
				return validateLabelType((LabelType)value, diagnostics, context);
			case OMEPackage.LASER_TYPE:
				return validateLaserType((LaserType)value, diagnostics, context);
			case OMEPackage.LEADER_TYPE:
				return validateLeaderType((LeaderType)value, diagnostics, context);
			case OMEPackage.LIGHT_EMITTING_DIODE_TYPE:
				return validateLightEmittingDiodeType((LightEmittingDiodeType)value, diagnostics, context);
			case OMEPackage.LIGHT_PATH_TYPE:
				return validateLightPathType((LightPathType)value, diagnostics, context);
			case OMEPackage.LIGHT_SOURCE:
				return validateLightSource((LightSource)value, diagnostics, context);
			case OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE:
				return validateLightSourceSettingsType((LightSourceSettingsType)value, diagnostics, context);
			case OMEPackage.LINE_TYPE:
				return validateLineType((LineType)value, diagnostics, context);
			case OMEPackage.LIST_ANNOTATION_TYPE:
				return validateListAnnotationType((ListAnnotationType)value, diagnostics, context);
			case OMEPackage.LONG_ANNOTATION_TYPE:
				return validateLongAnnotationType((LongAnnotationType)value, diagnostics, context);
			case OMEPackage.MANUFACTURER_SPEC:
				return validateManufacturerSpec((ManufacturerSpec)value, diagnostics, context);
			case OMEPackage.MAP:
				return validateMap((org.openmicroscopy.ome.Map)value, diagnostics, context);
			case OMEPackage.MAP_ANNOTATION_TYPE:
				return validateMapAnnotationType((MapAnnotationType)value, diagnostics, context);
			case OMEPackage.MASK_TYPE:
				return validateMaskType((MaskType)value, diagnostics, context);
			case OMEPackage.MICROBEAM_MANIPULATION_REF_TYPE:
				return validateMicrobeamManipulationRefType((MicrobeamManipulationRefType)value, diagnostics, context);
			case OMEPackage.MICROBEAM_MANIPULATION_TYPE:
				return validateMicrobeamManipulationType((MicrobeamManipulationType)value, diagnostics, context);
			case OMEPackage.MICROSCOPE_TYPE:
				return validateMicroscopeType((MicroscopeType)value, diagnostics, context);
			case OMEPackage.MTYPE:
				return validateMType((MType)value, diagnostics, context);
			case OMEPackage.NUMERIC_ANNOTATION:
				return validateNumericAnnotation((NumericAnnotation)value, diagnostics, context);
			case OMEPackage.OBJECTIVE_SETTINGS_TYPE:
				return validateObjectiveSettingsType((ObjectiveSettingsType)value, diagnostics, context);
			case OMEPackage.OBJECTIVE_TYPE:
				return validateObjectiveType((ObjectiveType)value, diagnostics, context);
			case OMEPackage.OME_TYPE:
				return validateOMEType((OMEType)value, diagnostics, context);
			case OMEPackage.PIXELS_TYPE:
				return validatePixelsType((PixelsType)value, diagnostics, context);
			case OMEPackage.PLANE_TYPE:
				return validatePlaneType((PlaneType)value, diagnostics, context);
			case OMEPackage.PLATE_ACQUISITION_TYPE:
				return validatePlateAcquisitionType((PlateAcquisitionType)value, diagnostics, context);
			case OMEPackage.PLATE_REF_TYPE:
				return validatePlateRefType((PlateRefType)value, diagnostics, context);
			case OMEPackage.PLATE_TYPE:
				return validatePlateType((PlateType)value, diagnostics, context);
			case OMEPackage.POINT_TYPE:
				return validatePointType((PointType)value, diagnostics, context);
			case OMEPackage.POLYGON_TYPE:
				return validatePolygonType((PolygonType)value, diagnostics, context);
			case OMEPackage.POLYLINE_TYPE:
				return validatePolylineType((PolylineType)value, diagnostics, context);
			case OMEPackage.PROJECT_REF_TYPE:
				return validateProjectRefType((ProjectRefType)value, diagnostics, context);
			case OMEPackage.PROJECT_TYPE:
				return validateProjectType((ProjectType)value, diagnostics, context);
			case OMEPackage.PUMP_TYPE:
				return validatePumpType((PumpType)value, diagnostics, context);
			case OMEPackage.REAGENT_REF_TYPE:
				return validateReagentRefType((ReagentRefType)value, diagnostics, context);
			case OMEPackage.REAGENT_TYPE:
				return validateReagentType((ReagentType)value, diagnostics, context);
			case OMEPackage.RECTANGLE_TYPE:
				return validateRectangleType((RectangleType)value, diagnostics, context);
			case OMEPackage.REFERENCE:
				return validateReference((Reference)value, diagnostics, context);
			case OMEPackage.RIGHTS_TYPE:
				return validateRightsType((RightsType)value, diagnostics, context);
			case OMEPackage.ROI_REF_TYPE:
				return validateROIRefType((ROIRefType)value, diagnostics, context);
			case OMEPackage.ROI_TYPE:
				return validateROIType((ROIType)value, diagnostics, context);
			case OMEPackage.SCREEN_TYPE:
				return validateScreenType((ScreenType)value, diagnostics, context);
			case OMEPackage.SETTINGS:
				return validateSettings((Settings)value, diagnostics, context);
			case OMEPackage.SHAPE:
				return validateShape((Shape)value, diagnostics, context);
			case OMEPackage.STAGE_LABEL_TYPE:
				return validateStageLabelType((StageLabelType)value, diagnostics, context);
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE:
				return validateStructuredAnnotationsType((StructuredAnnotationsType)value, diagnostics, context);
			case OMEPackage.TAG_ANNOTATION_TYPE:
				return validateTagAnnotationType((TagAnnotationType)value, diagnostics, context);
			case OMEPackage.TERM_ANNOTATION_TYPE:
				return validateTermAnnotationType((TermAnnotationType)value, diagnostics, context);
			case OMEPackage.TEXT_ANNOTATION:
				return validateTextAnnotation((TextAnnotation)value, diagnostics, context);
			case OMEPackage.TIFF_DATA_TYPE:
				return validateTiffDataType((TiffDataType)value, diagnostics, context);
			case OMEPackage.TIMESTAMP_ANNOTATION_TYPE:
				return validateTimestampAnnotationType((TimestampAnnotationType)value, diagnostics, context);
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE:
				return validateTransmittanceRangeType((TransmittanceRangeType)value, diagnostics, context);
			case OMEPackage.TYPE_ANNOTATION:
				return validateTypeAnnotation((TypeAnnotation)value, diagnostics, context);
			case OMEPackage.UNION_TYPE:
				return validateUnionType((UnionType)value, diagnostics, context);
			case OMEPackage.UUID_TYPE:
				return validateUUIDType((UUIDType)value, diagnostics, context);
			case OMEPackage.VALUE_TYPE:
				return validateValueType((ValueType)value, diagnostics, context);
			case OMEPackage.WELL_SAMPLE_REF_TYPE:
				return validateWellSampleRefType((WellSampleRefType)value, diagnostics, context);
			case OMEPackage.WELL_SAMPLE_TYPE:
				return validateWellSampleType((WellSampleType)value, diagnostics, context);
			case OMEPackage.WELL_TYPE:
				return validateWellType((WellType)value, diagnostics, context);
			case OMEPackage.XML_ANNOTATION_TYPE:
				return validateXMLAnnotationType((XMLAnnotationType)value, diagnostics, context);
			case OMEPackage.ACQUISITION_MODE_TYPE:
				return validateAcquisitionModeType((AcquisitionModeType)value, diagnostics, context);
			case OMEPackage.BINNING:
				return validateBinning((Binning)value, diagnostics, context);
			case OMEPackage.COMPRESSION_TYPE:
				return validateCompressionType((CompressionType)value, diagnostics, context);
			case OMEPackage.COMPRESSION_TYPE1:
				return validateCompressionType1((CompressionType1)value, diagnostics, context);
			case OMEPackage.CONTRAST_METHOD_TYPE:
				return validateContrastMethodType((ContrastMethodType)value, diagnostics, context);
			case OMEPackage.CORRECTION_TYPE:
				return validateCorrectionType((CorrectionType)value, diagnostics, context);
			case OMEPackage.DIMENSION_ORDER_TYPE:
				return validateDimensionOrderType((DimensionOrderType)value, diagnostics, context);
			case OMEPackage.FILL_RULE_TYPE:
				return validateFillRuleType((FillRuleType)value, diagnostics, context);
			case OMEPackage.FONT_FAMILY:
				return validateFontFamily((FontFamily)value, diagnostics, context);
			case OMEPackage.FONT_FAMILY_TYPE:
				return validateFontFamilyType((FontFamilyType)value, diagnostics, context);
			case OMEPackage.FONT_STYLE_TYPE:
				return validateFontStyleType((FontStyleType)value, diagnostics, context);
			case OMEPackage.ILLUMINATION_TYPE_TYPE:
				return validateIlluminationTypeType((IlluminationTypeType)value, diagnostics, context);
			case OMEPackage.IMMERSION_TYPE:
				return validateImmersionType((ImmersionType)value, diagnostics, context);
			case OMEPackage.LASER_MEDIUM_TYPE:
				return validateLaserMediumType((LaserMediumType)value, diagnostics, context);
			case OMEPackage.MARKER:
				return validateMarker((Marker)value, diagnostics, context);
			case OMEPackage.MEDIUM_TYPE:
				return validateMediumType((MediumType)value, diagnostics, context);
			case OMEPackage.NAMING_CONVENTION:
				return validateNamingConvention((NamingConvention)value, diagnostics, context);
			case OMEPackage.PIXEL_TYPE:
				return validatePixelType((PixelType)value, diagnostics, context);
			case OMEPackage.PULSE_TYPE:
				return validatePulseType((PulseType)value, diagnostics, context);
			case OMEPackage.TYPE_TYPE2:
				return validateTypeType2((TypeType2)value, diagnostics, context);
			case OMEPackage.TYPE_TYPE3:
				return validateTypeType3((TypeType3)value, diagnostics, context);
			case OMEPackage.TYPE_TYPE4:
				return validateTypeType4((TypeType4)value, diagnostics, context);
			case OMEPackage.TYPE_TYPE5:
				return validateTypeType5((TypeType5)value, diagnostics, context);
			case OMEPackage.TYPE_TYPE6:
				return validateTypeType6((TypeType6)value, diagnostics, context);
			case OMEPackage.TYPE_TYPE7:
				return validateTypeType7((TypeType7)value, diagnostics, context);
			case OMEPackage.TYPE_TYPE_ITEM:
				return validateTypeTypeItem((TypeTypeItem)value, diagnostics, context);
			case OMEPackage.TYPE_TYPE_ITEM1:
				return validateTypeTypeItem1((TypeTypeItem1)value, diagnostics, context);
			case OMEPackage.UNITS_ANGLE:
				return validateUnitsAngle((UnitsAngle)value, diagnostics, context);
			case OMEPackage.UNITS_ELECTRIC_POTENTIAL:
				return validateUnitsElectricPotential((UnitsElectricPotential)value, diagnostics, context);
			case OMEPackage.UNITS_FREQUENCY:
				return validateUnitsFrequency((UnitsFrequency)value, diagnostics, context);
			case OMEPackage.UNITS_LENGTH:
				return validateUnitsLength((UnitsLength)value, diagnostics, context);
			case OMEPackage.UNITS_POWER:
				return validateUnitsPower((UnitsPower)value, diagnostics, context);
			case OMEPackage.UNITS_PRESSURE:
				return validateUnitsPressure((UnitsPressure)value, diagnostics, context);
			case OMEPackage.UNITS_TEMPERATURE:
				return validateUnitsTemperature((UnitsTemperature)value, diagnostics, context);
			case OMEPackage.UNITS_TIME:
				return validateUnitsTime((UnitsTime)value, diagnostics, context);
			case OMEPackage.ACQUISITION_MODE_TYPE_OBJECT:
				return validateAcquisitionModeTypeObject((AcquisitionModeType)value, diagnostics, context);
			case OMEPackage.ANNOTATION_ID:
				return validateAnnotationID((String)value, diagnostics, context);
			case OMEPackage.BASE64_BINARY:
				return validateBase64Binary((byte[])value, diagnostics, context);
			case OMEPackage.BINNING_OBJECT:
				return validateBinningObject((Binning)value, diagnostics, context);
			case OMEPackage.CHANNEL_ID:
				return validateChannelID((String)value, diagnostics, context);
			case OMEPackage.COLOR:
				return validateColor((Integer)value, diagnostics, context);
			case OMEPackage.COLOR_OBJECT:
				return validateColorObject((Integer)value, diagnostics, context);
			case OMEPackage.COMPRESSION_TYPE_OBJECT:
				return validateCompressionTypeObject((CompressionType)value, diagnostics, context);
			case OMEPackage.COMPRESSION_TYPE_OBJECT1:
				return validateCompressionTypeObject1((CompressionType1)value, diagnostics, context);
			case OMEPackage.CONTRAST_METHOD_TYPE_OBJECT:
				return validateContrastMethodTypeObject((ContrastMethodType)value, diagnostics, context);
			case OMEPackage.CORRECTION_TYPE_OBJECT:
				return validateCorrectionTypeObject((CorrectionType)value, diagnostics, context);
			case OMEPackage.DATASET_ID:
				return validateDatasetID((String)value, diagnostics, context);
			case OMEPackage.DESCRIPTION_TYPE:
				return validateDescriptionType((String)value, diagnostics, context);
			case OMEPackage.DESCRIPTION_TYPE1:
				return validateDescriptionType1((String)value, diagnostics, context);
			case OMEPackage.DESCRIPTION_TYPE2:
				return validateDescriptionType2((String)value, diagnostics, context);
			case OMEPackage.DESCRIPTION_TYPE3:
				return validateDescriptionType3((String)value, diagnostics, context);
			case OMEPackage.DESCRIPTION_TYPE4:
				return validateDescriptionType4((String)value, diagnostics, context);
			case OMEPackage.DESCRIPTION_TYPE5:
				return validateDescriptionType5((String)value, diagnostics, context);
			case OMEPackage.DESCRIPTION_TYPE6:
				return validateDescriptionType6((String)value, diagnostics, context);
			case OMEPackage.DESCRIPTION_TYPE7:
				return validateDescriptionType7((String)value, diagnostics, context);
			case OMEPackage.DESCRIPTION_TYPE8:
				return validateDescriptionType8((String)value, diagnostics, context);
			case OMEPackage.DESCRIPTION_TYPE9:
				return validateDescriptionType9((String)value, diagnostics, context);
			case OMEPackage.DESCRIPTION_TYPE10:
				return validateDescriptionType10((String)value, diagnostics, context);
			case OMEPackage.DESCRIPTION_TYPE11:
				return validateDescriptionType11((String)value, diagnostics, context);
			case OMEPackage.DESCRIPTION_TYPE12:
				return validateDescriptionType12((String)value, diagnostics, context);
			case OMEPackage.DETECTOR_ID:
				return validateDetectorID((String)value, diagnostics, context);
			case OMEPackage.DICHROIC_ID:
				return validateDichroicID((String)value, diagnostics, context);
			case OMEPackage.DIMENSION_ORDER_TYPE_OBJECT:
				return validateDimensionOrderTypeObject((DimensionOrderType)value, diagnostics, context);
			case OMEPackage.EXPERIMENTER_GROUP_ID:
				return validateExperimenterGroupID((String)value, diagnostics, context);
			case OMEPackage.EXPERIMENTER_ID:
				return validateExperimenterID((String)value, diagnostics, context);
			case OMEPackage.EXPERIMENT_ID:
				return validateExperimentID((String)value, diagnostics, context);
			case OMEPackage.FILL_RULE_TYPE_OBJECT:
				return validateFillRuleTypeObject((FillRuleType)value, diagnostics, context);
			case OMEPackage.FILTER_ID:
				return validateFilterID((String)value, diagnostics, context);
			case OMEPackage.FILTER_SET_ID:
				return validateFilterSetID((String)value, diagnostics, context);
			case OMEPackage.FOLDER_ID:
				return validateFolderID((String)value, diagnostics, context);
			case OMEPackage.FONT_FAMILY_OBJECT:
				return validateFontFamilyObject((FontFamily)value, diagnostics, context);
			case OMEPackage.FONT_FAMILY_TYPE_OBJECT:
				return validateFontFamilyTypeObject((FontFamilyType)value, diagnostics, context);
			case OMEPackage.FONT_STYLE_TYPE_OBJECT:
				return validateFontStyleTypeObject((FontStyleType)value, diagnostics, context);
			case OMEPackage.HEX40:
				return validateHex40((byte[])value, diagnostics, context);
			case OMEPackage.ILLUMINATION_TYPE_TYPE_OBJECT:
				return validateIlluminationTypeTypeObject((IlluminationTypeType)value, diagnostics, context);
			case OMEPackage.IMAGE_ID:
				return validateImageID((String)value, diagnostics, context);
			case OMEPackage.IMMERSION_TYPE_OBJECT:
				return validateImmersionTypeObject((ImmersionType)value, diagnostics, context);
			case OMEPackage.INSTRUMENT_ID:
				return validateInstrumentID((String)value, diagnostics, context);
			case OMEPackage.LASER_MEDIUM_TYPE_OBJECT:
				return validateLaserMediumTypeObject((LaserMediumType)value, diagnostics, context);
			case OMEPackage.LENGTH_TYPE:
				return validateLengthType((Long)value, diagnostics, context);
			case OMEPackage.LENGTH_TYPE_OBJECT:
				return validateLengthTypeObject((Long)value, diagnostics, context);
			case OMEPackage.LIGHT_SOURCE_ID:
				return validateLightSourceID((String)value, diagnostics, context);
			case OMEPackage.LSID:
				return validateLSID((String)value, diagnostics, context);
			case OMEPackage.MARKER_OBJECT:
				return validateMarkerObject((Marker)value, diagnostics, context);
			case OMEPackage.MEDIUM_TYPE_OBJECT:
				return validateMediumTypeObject((MediumType)value, diagnostics, context);
			case OMEPackage.MICROBEAM_MANIPULATION_ID:
				return validateMicrobeamManipulationID((String)value, diagnostics, context);
			case OMEPackage.MODULE_ID:
				return validateModuleID((String)value, diagnostics, context);
			case OMEPackage.NAMING_CONVENTION_OBJECT:
				return validateNamingConventionObject((NamingConvention)value, diagnostics, context);
			case OMEPackage.NON_NEGATIVE_FLOAT:
				return validateNonNegativeFloat((Float)value, diagnostics, context);
			case OMEPackage.NON_NEGATIVE_FLOAT_OBJECT:
				return validateNonNegativeFloatObject((Float)value, diagnostics, context);
			case OMEPackage.NON_NEGATIVE_INT:
				return validateNonNegativeInt((Integer)value, diagnostics, context);
			case OMEPackage.NON_NEGATIVE_INT_OBJECT:
				return validateNonNegativeIntObject((Integer)value, diagnostics, context);
			case OMEPackage.NON_NEGATIVE_LONG:
				return validateNonNegativeLong((Long)value, diagnostics, context);
			case OMEPackage.NON_NEGATIVE_LONG_OBJECT:
				return validateNonNegativeLongObject((Long)value, diagnostics, context);
			case OMEPackage.OBJECTIVE_ID:
				return validateObjectiveID((String)value, diagnostics, context);
			case OMEPackage.PERCENT_FRACTION:
				return validatePercentFraction((Float)value, diagnostics, context);
			case OMEPackage.PERCENT_FRACTION_OBJECT:
				return validatePercentFractionObject((Float)value, diagnostics, context);
			case OMEPackage.PIXELS_ID:
				return validatePixelsID((String)value, diagnostics, context);
			case OMEPackage.PIXEL_TYPE_OBJECT:
				return validatePixelTypeObject((PixelType)value, diagnostics, context);
			case OMEPackage.PLATE_ACQUISITION_ID:
				return validatePlateAcquisitionID((String)value, diagnostics, context);
			case OMEPackage.PLATE_ID:
				return validatePlateID((String)value, diagnostics, context);
			case OMEPackage.POSITIVE_FLOAT:
				return validatePositiveFloat((Float)value, diagnostics, context);
			case OMEPackage.POSITIVE_FLOAT_OBJECT:
				return validatePositiveFloatObject((Float)value, diagnostics, context);
			case OMEPackage.POSITIVE_INT:
				return validatePositiveInt((Integer)value, diagnostics, context);
			case OMEPackage.POSITIVE_INT_OBJECT:
				return validatePositiveIntObject((Integer)value, diagnostics, context);
			case OMEPackage.PROJECT_ID:
				return validateProjectID((String)value, diagnostics, context);
			case OMEPackage.PULSE_TYPE_OBJECT:
				return validatePulseTypeObject((PulseType)value, diagnostics, context);
			case OMEPackage.REAGENT_ID:
				return validateReagentID((String)value, diagnostics, context);
			case OMEPackage.RIGHTS_HELD_TYPE:
				return validateRightsHeldType((String)value, diagnostics, context);
			case OMEPackage.RIGHTS_HOLDER_TYPE:
				return validateRightsHolderType((String)value, diagnostics, context);
			case OMEPackage.ROIID:
				return validateROIID((String)value, diagnostics, context);
			case OMEPackage.SCREEN_ID:
				return validateScreenID((String)value, diagnostics, context);
			case OMEPackage.SHAPE_ID:
				return validateShapeID((String)value, diagnostics, context);
			case OMEPackage.TYPE_TYPE:
				return validateTypeType((List<?>)value, diagnostics, context);
			case OMEPackage.TYPE_TYPE1:
				return validateTypeType1((List<?>)value, diagnostics, context);
			case OMEPackage.TYPE_TYPE_ITEM_OBJECT:
				return validateTypeTypeItemObject((TypeTypeItem)value, diagnostics, context);
			case OMEPackage.TYPE_TYPE_ITEM_OBJECT1:
				return validateTypeTypeItemObject1((TypeTypeItem1)value, diagnostics, context);
			case OMEPackage.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType4)value, diagnostics, context);
			case OMEPackage.TYPE_TYPE_OBJECT1:
				return validateTypeTypeObject1((TypeType5)value, diagnostics, context);
			case OMEPackage.TYPE_TYPE_OBJECT2:
				return validateTypeTypeObject2((TypeType6)value, diagnostics, context);
			case OMEPackage.TYPE_TYPE_OBJECT3:
				return validateTypeTypeObject3((TypeType3)value, diagnostics, context);
			case OMEPackage.TYPE_TYPE_OBJECT4:
				return validateTypeTypeObject4((TypeType2)value, diagnostics, context);
			case OMEPackage.TYPE_TYPE_OBJECT5:
				return validateTypeTypeObject5((TypeType7)value, diagnostics, context);
			case OMEPackage.UNITS_ANGLE_OBJECT:
				return validateUnitsAngleObject((UnitsAngle)value, diagnostics, context);
			case OMEPackage.UNITS_ELECTRIC_POTENTIAL_OBJECT:
				return validateUnitsElectricPotentialObject((UnitsElectricPotential)value, diagnostics, context);
			case OMEPackage.UNITS_FREQUENCY_OBJECT:
				return validateUnitsFrequencyObject((UnitsFrequency)value, diagnostics, context);
			case OMEPackage.UNITS_LENGTH_OBJECT:
				return validateUnitsLengthObject((UnitsLength)value, diagnostics, context);
			case OMEPackage.UNITS_POWER_OBJECT:
				return validateUnitsPowerObject((UnitsPower)value, diagnostics, context);
			case OMEPackage.UNITS_PRESSURE_OBJECT:
				return validateUnitsPressureObject((UnitsPressure)value, diagnostics, context);
			case OMEPackage.UNITS_TEMPERATURE_OBJECT:
				return validateUnitsTemperatureObject((UnitsTemperature)value, diagnostics, context);
			case OMEPackage.UNITS_TIME_OBJECT:
				return validateUnitsTimeObject((UnitsTime)value, diagnostics, context);
			case OMEPackage.UNIVERSALLY_UNIQUE_IDENTIFIER:
				return validateUniversallyUniqueIdentifier((String)value, diagnostics, context);
			case OMEPackage.WELL_ID:
				return validateWellID((String)value, diagnostics, context);
			case OMEPackage.WELL_SAMPLE_ID:
				return validateWellSampleID((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffineTransform(AffineTransform affineTransform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(affineTransform, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotation(Annotation annotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationRefType(AnnotationRefType annotationRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArcType(ArcType arcType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arcType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicAnnotation(BasicAnnotation basicAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basicAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryFileType(BinaryFileType binaryFileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryFileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryOnlyType(BinaryOnlyType binaryOnlyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryOnlyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinDataType(BinDataType binDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanAnnotationType(BooleanAnnotationType booleanAnnotationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanAnnotationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelRefType(ChannelRefType channelRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(channelRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelType(ChannelType channelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(channelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommentAnnotationType(CommentAnnotationType commentAnnotationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commentAnnotationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatasetRefType(DatasetRefType datasetRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datasetRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatasetType(DatasetType datasetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datasetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectorSettingsType(DetectorSettingsType detectorSettingsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(detectorSettingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectorType(DetectorType detectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(detectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDichroicRefType(DichroicRefType dichroicRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dichroicRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDichroicType(DichroicType dichroicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dichroicType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDoubleAnnotationType(DoubleAnnotationType doubleAnnotationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(doubleAnnotationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEllipseType(EllipseType ellipseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ellipseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExperimenterGroupRefType(ExperimenterGroupRefType experimenterGroupRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(experimenterGroupRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExperimenterGroupType(ExperimenterGroupType experimenterGroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(experimenterGroupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExperimenterRefType(ExperimenterRefType experimenterRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(experimenterRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExperimenterType(ExperimenterType experimenterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(experimenterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExperimentRefType(ExperimentRefType experimentRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(experimentRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExperimentType(ExperimentType experimentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(experimentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalType(ExternalType externalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilamentType(FilamentType filamentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filamentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileAnnotationType(FileAnnotationType fileAnnotationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileAnnotationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterRef(FilterRef filterRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterSetRefType(FilterSetRefType filterSetRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterSetRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterSetType(FilterSetType filterSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterType(FilterType filterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFolderRefType(FolderRefType folderRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(folderRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFolderType(FolderType folderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(folderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericExcitationSourceType(GenericExcitationSourceType genericExcitationSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericExcitationSourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageRefType(ImageRefType imageRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageType(ImageType imageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImagingEnvironmentType(ImagingEnvironmentType imagingEnvironmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imagingEnvironmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstrumentRefType(InstrumentRefType instrumentRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instrumentRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstrumentType(InstrumentType instrumentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instrumentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelType(LabelType labelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaserType(LaserType laserType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(laserType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeaderType(LeaderType leaderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(leaderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLightEmittingDiodeType(LightEmittingDiodeType lightEmittingDiodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lightEmittingDiodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLightPathType(LightPathType lightPathType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lightPathType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLightSource(LightSource lightSource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lightSource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLightSourceSettingsType(LightSourceSettingsType lightSourceSettingsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lightSourceSettingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineType(LineType lineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListAnnotationType(ListAnnotationType listAnnotationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listAnnotationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLongAnnotationType(LongAnnotationType longAnnotationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(longAnnotationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManufacturerSpec(ManufacturerSpec manufacturerSpec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(manufacturerSpec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMap(org.openmicroscopy.ome.Map map, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(map, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapAnnotationType(MapAnnotationType mapAnnotationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mapAnnotationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaskType(MaskType maskType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(maskType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicrobeamManipulationRefType(MicrobeamManipulationRefType microbeamManipulationRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(microbeamManipulationRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicrobeamManipulationType(MicrobeamManipulationType microbeamManipulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(microbeamManipulationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicroscopeType(MicroscopeType microscopeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(microscopeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMType(MType mType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericAnnotation(NumericAnnotation numericAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numericAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectiveSettingsType(ObjectiveSettingsType objectiveSettingsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectiveSettingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectiveType(ObjectiveType objectiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectiveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOMEType(OMEType omeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(omeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePixelsType(PixelsType pixelsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pixelsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlaneType(PlaneType planeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlateAcquisitionType(PlateAcquisitionType plateAcquisitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(plateAcquisitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlateRefType(PlateRefType plateRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(plateRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlateType(PlateType plateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(plateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointType(PointType pointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygonType(PolygonType polygonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolylineType(PolylineType polylineType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polylineType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectRefType(ProjectRefType projectRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(projectRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectType(ProjectType projectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(projectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePumpType(PumpType pumpType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pumpType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReagentRefType(ReagentRefType reagentRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reagentRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReagentType(ReagentType reagentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reagentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRectangleType(RectangleType rectangleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rectangleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReference(Reference reference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRightsType(RightsType rightsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rightsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateROIRefType(ROIRefType roiRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roiRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateROIType(ROIType roiType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roiType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScreenType(ScreenType screenType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(screenType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettings(Settings settings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(settings, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShape(Shape shape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shape, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStageLabelType(StageLabelType stageLabelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stageLabelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructuredAnnotationsType(StructuredAnnotationsType structuredAnnotationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structuredAnnotationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagAnnotationType(TagAnnotationType tagAnnotationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tagAnnotationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTermAnnotationType(TermAnnotationType termAnnotationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(termAnnotationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextAnnotation(TextAnnotation textAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTiffDataType(TiffDataType tiffDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tiffDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimestampAnnotationType(TimestampAnnotationType timestampAnnotationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timestampAnnotationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransmittanceRangeType(TransmittanceRangeType transmittanceRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transmittanceRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeAnnotation(TypeAnnotation typeAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnionType(UnionType unionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUUIDType(UUIDType uuidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uuidType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType(ValueType valueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWellSampleRefType(WellSampleRefType wellSampleRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wellSampleRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWellSampleType(WellSampleType wellSampleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wellSampleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWellType(WellType wellType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wellType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXMLAnnotationType(XMLAnnotationType xmlAnnotationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlAnnotationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcquisitionModeType(AcquisitionModeType acquisitionModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinning(Binning binning, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompressionType(CompressionType compressionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompressionType1(CompressionType1 compressionType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContrastMethodType(ContrastMethodType contrastMethodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCorrectionType(CorrectionType correctionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionOrderType(DimensionOrderType dimensionOrderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillRuleType(FillRuleType fillRuleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontFamily(FontFamily fontFamily, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontFamilyType(FontFamilyType fontFamilyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontStyleType(FontStyleType fontStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIlluminationTypeType(IlluminationTypeType illuminationTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmersionType(ImmersionType immersionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaserMediumType(LaserMediumType laserMediumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarker(Marker marker, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediumType(MediumType mediumType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingConvention(NamingConvention namingConvention, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePixelType(PixelType pixelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePulseType(PulseType pulseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType2(TypeType2 typeType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType3(TypeType3 typeType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType4(TypeType4 typeType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType5(TypeType5 typeType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType6(TypeType6 typeType6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType7(TypeType7 typeType7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeItem(TypeTypeItem typeTypeItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeItem1(TypeTypeItem1 typeTypeItem1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsAngle(UnitsAngle unitsAngle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsElectricPotential(UnitsElectricPotential unitsElectricPotential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsFrequency(UnitsFrequency unitsFrequency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsLength(UnitsLength unitsLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsPower(UnitsPower unitsPower, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsPressure(UnitsPressure unitsPressure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsTemperature(UnitsTemperature unitsTemperature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsTime(UnitsTime unitsTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcquisitionModeTypeObject(AcquisitionModeType acquisitionModeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationID(String annotationID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAnnotationID_Pattern(annotationID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAnnotationID_Pattern
	 */
	public static final  PatternMatcher [][] ANNOTATION_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Annotation:\\S+)|(Annotation:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Annotation ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationID_Pattern(String annotationID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getAnnotationID(), annotationID, ANNOTATION_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBase64Binary(byte[] base64Binary, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinningObject(Binning binningObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelID(String channelID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateChannelID_Pattern(channelID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateChannelID_Pattern
	 */
	public static final  PatternMatcher [][] CHANNEL_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Channel:\\S+)|(Channel:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Channel ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannelID_Pattern(String channelID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getChannelID(), channelID, CHANNEL_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor(int color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorObject(Integer colorObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompressionTypeObject(CompressionType compressionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompressionTypeObject1(CompressionType1 compressionTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContrastMethodTypeObject(ContrastMethodType contrastMethodTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCorrectionTypeObject(CorrectionType correctionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatasetID(String datasetID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDatasetID_Pattern(datasetID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDatasetID_Pattern
	 */
	public static final  PatternMatcher [][] DATASET_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Dataset:\\S+)|(Dataset:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Dataset ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatasetID_Pattern(String datasetID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getDatasetID(), datasetID, DATASET_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType(String descriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType1(String descriptionType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType2(String descriptionType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType3(String descriptionType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType4(String descriptionType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType5(String descriptionType5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType6(String descriptionType6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType7(String descriptionType7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType8(String descriptionType8, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType9(String descriptionType9, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType10(String descriptionType10, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType11(String descriptionType11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType12(String descriptionType12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectorID(String detectorID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDetectorID_Pattern(detectorID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDetectorID_Pattern
	 */
	public static final  PatternMatcher [][] DETECTOR_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Detector:\\S+)|(Detector:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Detector ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDetectorID_Pattern(String detectorID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getDetectorID(), detectorID, DETECTOR_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDichroicID(String dichroicID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDichroicID_Pattern(dichroicID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDichroicID_Pattern
	 */
	public static final  PatternMatcher [][] DICHROIC_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Dichroic:\\S+)|(Dichroic:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Dichroic ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDichroicID_Pattern(String dichroicID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getDichroicID(), dichroicID, DICHROIC_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDimensionOrderTypeObject(DimensionOrderType dimensionOrderTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExperimenterGroupID(String experimenterGroupID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExperimenterGroupID_Pattern(experimenterGroupID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateExperimenterGroupID_Pattern
	 */
	public static final  PatternMatcher [][] EXPERIMENTER_GROUP_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:ExperimenterGroup:\\S+)|(ExperimenterGroup:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Experimenter Group ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExperimenterGroupID_Pattern(String experimenterGroupID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getExperimenterGroupID(), experimenterGroupID, EXPERIMENTER_GROUP_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExperimenterID(String experimenterID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExperimenterID_Pattern(experimenterID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateExperimenterID_Pattern
	 */
	public static final  PatternMatcher [][] EXPERIMENTER_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Experimenter:\\S+)|(Experimenter:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Experimenter ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExperimenterID_Pattern(String experimenterID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getExperimenterID(), experimenterID, EXPERIMENTER_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExperimentID(String experimentID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExperimentID_Pattern(experimentID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateExperimentID_Pattern
	 */
	public static final  PatternMatcher [][] EXPERIMENT_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Experiment:\\S+)|(Experiment:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Experiment ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExperimentID_Pattern(String experimentID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getExperimentID(), experimentID, EXPERIMENT_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFillRuleTypeObject(FillRuleType fillRuleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterID(String filterID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFilterID_Pattern(filterID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFilterID_Pattern
	 */
	public static final  PatternMatcher [][] FILTER_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Filter:\\S+)|(Filter:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Filter ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterID_Pattern(String filterID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getFilterID(), filterID, FILTER_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterSetID(String filterSetID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFilterSetID_Pattern(filterSetID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFilterSetID_Pattern
	 */
	public static final  PatternMatcher [][] FILTER_SET_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:FilterSet:\\S+)|(FilterSet:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Filter Set ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilterSetID_Pattern(String filterSetID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getFilterSetID(), filterSetID, FILTER_SET_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFolderID(String folderID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFolderID_Pattern(folderID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFolderID_Pattern
	 */
	public static final  PatternMatcher [][] FOLDER_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Folder:\\S+)|(Folder:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Folder ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFolderID_Pattern(String folderID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getFolderID(), folderID, FOLDER_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontFamilyObject(FontFamily fontFamilyObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontFamilyTypeObject(FontFamilyType fontFamilyTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFontStyleTypeObject(FontStyleType fontStyleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHex40(byte[] hex40, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHex40_MinLength(hex40, diagnostics, context);
		if (result || diagnostics != null) result &= validateHex40_MaxLength(hex40, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Hex40</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHex40_MinLength(byte[] hex40, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = hex40.length;
		boolean result = length >= 20;
		if (!result && diagnostics != null)
			reportMinLengthViolation(OMEPackage.eINSTANCE.getHex40(), hex40, length, 20, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Hex40</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHex40_MaxLength(byte[] hex40, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = hex40.length;
		boolean result = length <= 20;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(OMEPackage.eINSTANCE.getHex40(), hex40, length, 20, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIlluminationTypeTypeObject(IlluminationTypeType illuminationTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageID(String imageID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateImageID_Pattern(imageID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateImageID_Pattern
	 */
	public static final  PatternMatcher [][] IMAGE_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Image:\\S+)|(Image:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Image ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageID_Pattern(String imageID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getImageID(), imageID, IMAGE_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmersionTypeObject(ImmersionType immersionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstrumentID(String instrumentID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateInstrumentID_Pattern(instrumentID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateInstrumentID_Pattern
	 */
	public static final  PatternMatcher [][] INSTRUMENT_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Instrument:\\S+)|(Instrument:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Instrument ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstrumentID_Pattern(String instrumentID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getInstrumentID(), instrumentID, INSTRUMENT_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaserMediumTypeObject(LaserMediumType laserMediumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthType(long lengthType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativeLong_Min(lengthType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthTypeObject(Long lengthTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativeLong_Min(lengthTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLightSourceID(String lightSourceID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLightSourceID_Pattern(lightSourceID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLightSourceID_Pattern
	 */
	public static final  PatternMatcher [][] LIGHT_SOURCE_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:LightSource:\\S+)|(LightSource:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Light Source ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLightSourceID_Pattern(String lightSourceID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getLightSourceID(), lightSourceID, LIGHT_SOURCE_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLSID(String lsid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLSID_Pattern(lsid, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLSID_Pattern
	 */
	public static final  PatternMatcher [][] LSID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>LSID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLSID_Pattern(String lsid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getLSID(), lsid, LSID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMarkerObject(Marker markerObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediumTypeObject(MediumType mediumTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicrobeamManipulationID(String microbeamManipulationID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMicrobeamManipulationID_Pattern(microbeamManipulationID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMicrobeamManipulationID_Pattern
	 */
	public static final  PatternMatcher [][] MICROBEAM_MANIPULATION_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:MicrobeamManipulation:\\S+)|(MicrobeamManipulation:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Microbeam Manipulation ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMicrobeamManipulationID_Pattern(String microbeamManipulationID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getMicrobeamManipulationID(), microbeamManipulationID, MICROBEAM_MANIPULATION_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleID(String moduleID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateModuleID_Pattern(moduleID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateModuleID_Pattern
	 */
	public static final  PatternMatcher [][] MODULE_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Module:\\S+)|(Module:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Module ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModuleID_Pattern(String moduleID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getModuleID(), moduleID, MODULE_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamingConventionObject(NamingConvention namingConventionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeFloat(float nonNegativeFloat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativeFloat_Min(nonNegativeFloat, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNonNegativeFloat_Min
	 */
	public static final float NON_NEGATIVE_FLOAT__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Non Negative Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeFloat_Min(float nonNegativeFloat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = nonNegativeFloat >= NON_NEGATIVE_FLOAT__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(OMEPackage.eINSTANCE.getNonNegativeFloat(), nonNegativeFloat, NON_NEGATIVE_FLOAT__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeFloatObject(Float nonNegativeFloatObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativeFloat_Min(nonNegativeFloatObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeInt(int nonNegativeInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativeInt_Min(nonNegativeInt, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNonNegativeInt_Min
	 */
	public static final int NON_NEGATIVE_INT__MIN__VALUE = 0;

	/**
	 * Validates the Min constraint of '<em>Non Negative Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeInt_Min(int nonNegativeInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = nonNegativeInt >= NON_NEGATIVE_INT__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(OMEPackage.eINSTANCE.getNonNegativeInt(), nonNegativeInt, NON_NEGATIVE_INT__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeIntObject(Integer nonNegativeIntObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativeInt_Min(nonNegativeIntObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeLong(long nonNegativeLong, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativeLong_Min(nonNegativeLong, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNonNegativeLong_Min
	 */
	public static final long NON_NEGATIVE_LONG__MIN__VALUE = 0L;

	/**
	 * Validates the Min constraint of '<em>Non Negative Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeLong_Min(long nonNegativeLong, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = nonNegativeLong >= NON_NEGATIVE_LONG__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(OMEPackage.eINSTANCE.getNonNegativeLong(), nonNegativeLong, NON_NEGATIVE_LONG__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeLongObject(Long nonNegativeLongObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativeLong_Min(nonNegativeLongObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectiveID(String objectiveID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateObjectiveID_Pattern(objectiveID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateObjectiveID_Pattern
	 */
	public static final  PatternMatcher [][] OBJECTIVE_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Objective:\\S+)|(Objective:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Objective ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectiveID_Pattern(String objectiveID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getObjectiveID(), objectiveID, OBJECTIVE_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentFraction(float percentFraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePercentFraction_Min(percentFraction, diagnostics, context);
		if (result || diagnostics != null) result &= validatePercentFraction_Max(percentFraction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePercentFraction_Min
	 */
	public static final float PERCENT_FRACTION__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Percent Fraction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentFraction_Min(float percentFraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = percentFraction >= PERCENT_FRACTION__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(OMEPackage.eINSTANCE.getPercentFraction(), percentFraction, PERCENT_FRACTION__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePercentFraction_Max
	 */
	public static final float PERCENT_FRACTION__MAX__VALUE = 1.0F;

	/**
	 * Validates the Max constraint of '<em>Percent Fraction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentFraction_Max(float percentFraction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = percentFraction <= PERCENT_FRACTION__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(OMEPackage.eINSTANCE.getPercentFraction(), percentFraction, PERCENT_FRACTION__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentFractionObject(Float percentFractionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePercentFraction_Min(percentFractionObject, diagnostics, context);
		if (result || diagnostics != null) result &= validatePercentFraction_Max(percentFractionObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePixelsID(String pixelsID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePixelsID_Pattern(pixelsID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePixelsID_Pattern
	 */
	public static final  PatternMatcher [][] PIXELS_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Pixels:\\S+)|(Pixels:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Pixels ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePixelsID_Pattern(String pixelsID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getPixelsID(), pixelsID, PIXELS_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePixelTypeObject(PixelType pixelTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlateAcquisitionID(String plateAcquisitionID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePlateAcquisitionID_Pattern(plateAcquisitionID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePlateAcquisitionID_Pattern
	 */
	public static final  PatternMatcher [][] PLATE_ACQUISITION_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:PlateAcquisition:\\S+)|(PlateAcquisition:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Plate Acquisition ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlateAcquisitionID_Pattern(String plateAcquisitionID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getPlateAcquisitionID(), plateAcquisitionID, PLATE_ACQUISITION_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlateID(String plateID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePlateID_Pattern(plateID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePlateID_Pattern
	 */
	public static final  PatternMatcher [][] PLATE_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Plate:\\S+)|(Plate:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Plate ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlateID_Pattern(String plateID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getPlateID(), plateID, PLATE_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveFloat(float positiveFloat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositiveFloat_Min(positiveFloat, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveFloat_Min
	 */
	public static final float POSITIVE_FLOAT__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Positive Float</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveFloat_Min(float positiveFloat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = positiveFloat > POSITIVE_FLOAT__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(OMEPackage.eINSTANCE.getPositiveFloat(), positiveFloat, POSITIVE_FLOAT__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveFloatObject(Float positiveFloatObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositiveFloat_Min(positiveFloatObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveInt(int positiveInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositiveInt_Min(positiveInt, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePositiveInt_Min
	 */
	public static final int POSITIVE_INT__MIN__VALUE = 1;

	/**
	 * Validates the Min constraint of '<em>Positive Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveInt_Min(int positiveInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = positiveInt >= POSITIVE_INT__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(OMEPackage.eINSTANCE.getPositiveInt(), positiveInt, POSITIVE_INT__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntObject(Integer positiveIntObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePositiveInt_Min(positiveIntObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectID(String projectID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateProjectID_Pattern(projectID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateProjectID_Pattern
	 */
	public static final  PatternMatcher [][] PROJECT_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Project:\\S+)|(Project:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Project ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectID_Pattern(String projectID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getProjectID(), projectID, PROJECT_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePulseTypeObject(PulseType pulseTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReagentID(String reagentID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateReagentID_Pattern(reagentID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateReagentID_Pattern
	 */
	public static final  PatternMatcher [][] REAGENT_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Reagent:\\S+)|(Reagent:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Reagent ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReagentID_Pattern(String reagentID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getReagentID(), reagentID, REAGENT_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRightsHeldType(String rightsHeldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRightsHolderType(String rightsHolderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateROIID(String roiid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateROIID_Pattern(roiid, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateROIID_Pattern
	 */
	public static final  PatternMatcher [][] ROIID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+)|(\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>ROIID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateROIID_Pattern(String roiid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getROIID(), roiid, ROIID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScreenID(String screenID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateScreenID_Pattern(screenID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateScreenID_Pattern
	 */
	public static final  PatternMatcher [][] SCREEN_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Screen:\\S+)|(Screen:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Screen ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScreenID_Pattern(String screenID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getScreenID(), screenID, SCREEN_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShapeID(String shapeID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateShapeID_Pattern(shapeID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateShapeID_Pattern
	 */
	public static final  PatternMatcher [][] SHAPE_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Shape:\\S+)|(Shape:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Shape ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShapeID_Pattern(String shapeID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getShapeID(), shapeID, SHAPE_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(List<?> typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeType_ItemType(typeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType_ItemType(List<?> typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = typeType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (OMEPackage.eINSTANCE.getTypeTypeItem1().isInstance(item)) {
				result &= validateTypeTypeItem1((TypeTypeItem1)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(OMEPackage.eINSTANCE.getTypeTypeItem1(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType1(List<?> typeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTypeType1_ItemType(typeType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Type Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType1_ItemType(List<?> typeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = typeType1.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (OMEPackage.eINSTANCE.getTypeTypeItem().isInstance(item)) {
				result &= validateTypeTypeItem((TypeTypeItem)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(OMEPackage.eINSTANCE.getTypeTypeItem(), item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeItemObject(TypeTypeItem typeTypeItemObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeItemObject1(TypeTypeItem1 typeTypeItemObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject(TypeType4 typeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject1(TypeType5 typeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject2(TypeType6 typeTypeObject2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject3(TypeType3 typeTypeObject3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject4(TypeType2 typeTypeObject4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject5(TypeType7 typeTypeObject5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsAngleObject(UnitsAngle unitsAngleObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsElectricPotentialObject(UnitsElectricPotential unitsElectricPotentialObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsFrequencyObject(UnitsFrequency unitsFrequencyObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsLengthObject(UnitsLength unitsLengthObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsPowerObject(UnitsPower unitsPowerObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsPressureObject(UnitsPressure unitsPressureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsTemperatureObject(UnitsTemperature unitsTemperatureObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsTimeObject(UnitsTime unitsTimeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversallyUniqueIdentifier(String universallyUniqueIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUniversallyUniqueIdentifier_Pattern(universallyUniqueIdentifier, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUniversallyUniqueIdentifier_Pattern
	 */
	public static final  PatternMatcher [][] UNIVERSALLY_UNIQUE_IDENTIFIER__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:uuid:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Universally Unique Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversallyUniqueIdentifier_Pattern(String universallyUniqueIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getUniversallyUniqueIdentifier(), universallyUniqueIdentifier, UNIVERSALLY_UNIQUE_IDENTIFIER__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWellID(String wellID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateWellID_Pattern(wellID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateWellID_Pattern
	 */
	public static final  PatternMatcher [][] WELL_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:Well:\\S+)|(Well:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Well ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWellID_Pattern(String wellID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getWellID(), wellID, WELL_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWellSampleID(String wellSampleID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateWellSampleID_Pattern(wellSampleID, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateWellSampleID_Pattern
	 */
	public static final  PatternMatcher [][] WELL_SAMPLE_ID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:WellSample:\\S+)|(WellSample:\\S+)")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(urn:lsid:([\\w\\-\\.]+\\.[\\w\\-\\.]+)+:\\S+:\\S+)|(\\S+:\\S+)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Well Sample ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWellSampleID_Pattern(String wellSampleID, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(OMEPackage.eINSTANCE.getWellSampleID(), wellSampleID, WELL_SAMPLE_ID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //OMEValidator
