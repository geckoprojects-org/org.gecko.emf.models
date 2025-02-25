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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.openmicroscopy.ome.*;

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
 * @see org.openmicroscopy.ome.OMEPackage
 * @generated
 */
public class OMESwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OMEPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMESwitch() {
		if (modelPackage == null) {
			modelPackage = OMEPackage.eINSTANCE;
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
			case OMEPackage.AFFINE_TRANSFORM: {
				AffineTransform affineTransform = (AffineTransform)theEObject;
				T result = caseAffineTransform(affineTransform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.ANNOTATION_REF_TYPE: {
				AnnotationRefType annotationRefType = (AnnotationRefType)theEObject;
				T result = caseAnnotationRefType(annotationRefType);
				if (result == null) result = caseReference(annotationRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.ARC_TYPE: {
				ArcType arcType = (ArcType)theEObject;
				T result = caseArcType(arcType);
				if (result == null) result = caseLightSource(arcType);
				if (result == null) result = caseManufacturerSpec(arcType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.BASIC_ANNOTATION: {
				BasicAnnotation basicAnnotation = (BasicAnnotation)theEObject;
				T result = caseBasicAnnotation(basicAnnotation);
				if (result == null) result = caseAnnotation(basicAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.BINARY_FILE_TYPE: {
				BinaryFileType binaryFileType = (BinaryFileType)theEObject;
				T result = caseBinaryFileType(binaryFileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.BINARY_ONLY_TYPE: {
				BinaryOnlyType binaryOnlyType = (BinaryOnlyType)theEObject;
				T result = caseBinaryOnlyType(binaryOnlyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.BIN_DATA_TYPE: {
				BinDataType binDataType = (BinDataType)theEObject;
				T result = caseBinDataType(binDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.BOOLEAN_ANNOTATION_TYPE: {
				BooleanAnnotationType booleanAnnotationType = (BooleanAnnotationType)theEObject;
				T result = caseBooleanAnnotationType(booleanAnnotationType);
				if (result == null) result = caseBasicAnnotation(booleanAnnotationType);
				if (result == null) result = caseAnnotation(booleanAnnotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.CHANNEL_REF_TYPE: {
				ChannelRefType channelRefType = (ChannelRefType)theEObject;
				T result = caseChannelRefType(channelRefType);
				if (result == null) result = caseReference(channelRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.CHANNEL_TYPE: {
				ChannelType channelType = (ChannelType)theEObject;
				T result = caseChannelType(channelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.COMMENT_ANNOTATION_TYPE: {
				CommentAnnotationType commentAnnotationType = (CommentAnnotationType)theEObject;
				T result = caseCommentAnnotationType(commentAnnotationType);
				if (result == null) result = caseTextAnnotation(commentAnnotationType);
				if (result == null) result = caseAnnotation(commentAnnotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.DATASET_REF_TYPE: {
				DatasetRefType datasetRefType = (DatasetRefType)theEObject;
				T result = caseDatasetRefType(datasetRefType);
				if (result == null) result = caseReference(datasetRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.DATASET_TYPE: {
				DatasetType datasetType = (DatasetType)theEObject;
				T result = caseDatasetType(datasetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.DETECTOR_SETTINGS_TYPE: {
				DetectorSettingsType detectorSettingsType = (DetectorSettingsType)theEObject;
				T result = caseDetectorSettingsType(detectorSettingsType);
				if (result == null) result = caseSettings(detectorSettingsType);
				if (result == null) result = caseReference(detectorSettingsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.DETECTOR_TYPE: {
				DetectorType detectorType = (DetectorType)theEObject;
				T result = caseDetectorType(detectorType);
				if (result == null) result = caseManufacturerSpec(detectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.DICHROIC_REF_TYPE: {
				DichroicRefType dichroicRefType = (DichroicRefType)theEObject;
				T result = caseDichroicRefType(dichroicRefType);
				if (result == null) result = caseReference(dichroicRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.DICHROIC_TYPE: {
				DichroicType dichroicType = (DichroicType)theEObject;
				T result = caseDichroicType(dichroicType);
				if (result == null) result = caseManufacturerSpec(dichroicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.DOUBLE_ANNOTATION_TYPE: {
				DoubleAnnotationType doubleAnnotationType = (DoubleAnnotationType)theEObject;
				T result = caseDoubleAnnotationType(doubleAnnotationType);
				if (result == null) result = caseNumericAnnotation(doubleAnnotationType);
				if (result == null) result = caseBasicAnnotation(doubleAnnotationType);
				if (result == null) result = caseAnnotation(doubleAnnotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.ELLIPSE_TYPE: {
				EllipseType ellipseType = (EllipseType)theEObject;
				T result = caseEllipseType(ellipseType);
				if (result == null) result = caseShape(ellipseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.EXPERIMENTER_GROUP_REF_TYPE: {
				ExperimenterGroupRefType experimenterGroupRefType = (ExperimenterGroupRefType)theEObject;
				T result = caseExperimenterGroupRefType(experimenterGroupRefType);
				if (result == null) result = caseReference(experimenterGroupRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.EXPERIMENTER_GROUP_TYPE: {
				ExperimenterGroupType experimenterGroupType = (ExperimenterGroupType)theEObject;
				T result = caseExperimenterGroupType(experimenterGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.EXPERIMENTER_REF_TYPE: {
				ExperimenterRefType experimenterRefType = (ExperimenterRefType)theEObject;
				T result = caseExperimenterRefType(experimenterRefType);
				if (result == null) result = caseReference(experimenterRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.EXPERIMENTER_TYPE: {
				ExperimenterType experimenterType = (ExperimenterType)theEObject;
				T result = caseExperimenterType(experimenterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.EXPERIMENT_REF_TYPE: {
				ExperimentRefType experimentRefType = (ExperimentRefType)theEObject;
				T result = caseExperimentRefType(experimentRefType);
				if (result == null) result = caseReference(experimentRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.EXPERIMENT_TYPE: {
				ExperimentType experimentType = (ExperimentType)theEObject;
				T result = caseExperimentType(experimentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.EXTERNAL_TYPE: {
				ExternalType externalType = (ExternalType)theEObject;
				T result = caseExternalType(externalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.FILAMENT_TYPE: {
				FilamentType filamentType = (FilamentType)theEObject;
				T result = caseFilamentType(filamentType);
				if (result == null) result = caseLightSource(filamentType);
				if (result == null) result = caseManufacturerSpec(filamentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.FILE_ANNOTATION_TYPE: {
				FileAnnotationType fileAnnotationType = (FileAnnotationType)theEObject;
				T result = caseFileAnnotationType(fileAnnotationType);
				if (result == null) result = caseTypeAnnotation(fileAnnotationType);
				if (result == null) result = caseAnnotation(fileAnnotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.FILTER_REF: {
				FilterRef filterRef = (FilterRef)theEObject;
				T result = caseFilterRef(filterRef);
				if (result == null) result = caseReference(filterRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.FILTER_SET_REF_TYPE: {
				FilterSetRefType filterSetRefType = (FilterSetRefType)theEObject;
				T result = caseFilterSetRefType(filterSetRefType);
				if (result == null) result = caseReference(filterSetRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.FILTER_SET_TYPE: {
				FilterSetType filterSetType = (FilterSetType)theEObject;
				T result = caseFilterSetType(filterSetType);
				if (result == null) result = caseManufacturerSpec(filterSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.FILTER_TYPE: {
				FilterType filterType = (FilterType)theEObject;
				T result = caseFilterType(filterType);
				if (result == null) result = caseManufacturerSpec(filterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.FOLDER_REF_TYPE: {
				FolderRefType folderRefType = (FolderRefType)theEObject;
				T result = caseFolderRefType(folderRefType);
				if (result == null) result = caseReference(folderRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.FOLDER_TYPE: {
				FolderType folderType = (FolderType)theEObject;
				T result = caseFolderType(folderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.GENERIC_EXCITATION_SOURCE_TYPE: {
				GenericExcitationSourceType genericExcitationSourceType = (GenericExcitationSourceType)theEObject;
				T result = caseGenericExcitationSourceType(genericExcitationSourceType);
				if (result == null) result = caseLightSource(genericExcitationSourceType);
				if (result == null) result = caseManufacturerSpec(genericExcitationSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.IMAGE_REF_TYPE: {
				ImageRefType imageRefType = (ImageRefType)theEObject;
				T result = caseImageRefType(imageRefType);
				if (result == null) result = caseReference(imageRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.IMAGE_TYPE: {
				ImageType imageType = (ImageType)theEObject;
				T result = caseImageType(imageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.IMAGING_ENVIRONMENT_TYPE: {
				ImagingEnvironmentType imagingEnvironmentType = (ImagingEnvironmentType)theEObject;
				T result = caseImagingEnvironmentType(imagingEnvironmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.INSTRUMENT_REF_TYPE: {
				InstrumentRefType instrumentRefType = (InstrumentRefType)theEObject;
				T result = caseInstrumentRefType(instrumentRefType);
				if (result == null) result = caseReference(instrumentRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.INSTRUMENT_TYPE: {
				InstrumentType instrumentType = (InstrumentType)theEObject;
				T result = caseInstrumentType(instrumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.LABEL_TYPE: {
				LabelType labelType = (LabelType)theEObject;
				T result = caseLabelType(labelType);
				if (result == null) result = caseShape(labelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.LASER_TYPE: {
				LaserType laserType = (LaserType)theEObject;
				T result = caseLaserType(laserType);
				if (result == null) result = caseLightSource(laserType);
				if (result == null) result = caseManufacturerSpec(laserType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.LEADER_TYPE: {
				LeaderType leaderType = (LeaderType)theEObject;
				T result = caseLeaderType(leaderType);
				if (result == null) result = caseReference(leaderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.LIGHT_EMITTING_DIODE_TYPE: {
				LightEmittingDiodeType lightEmittingDiodeType = (LightEmittingDiodeType)theEObject;
				T result = caseLightEmittingDiodeType(lightEmittingDiodeType);
				if (result == null) result = caseLightSource(lightEmittingDiodeType);
				if (result == null) result = caseManufacturerSpec(lightEmittingDiodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.LIGHT_PATH_TYPE: {
				LightPathType lightPathType = (LightPathType)theEObject;
				T result = caseLightPathType(lightPathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.LIGHT_SOURCE: {
				LightSource lightSource = (LightSource)theEObject;
				T result = caseLightSource(lightSource);
				if (result == null) result = caseManufacturerSpec(lightSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE: {
				LightSourceSettingsType lightSourceSettingsType = (LightSourceSettingsType)theEObject;
				T result = caseLightSourceSettingsType(lightSourceSettingsType);
				if (result == null) result = caseSettings(lightSourceSettingsType);
				if (result == null) result = caseReference(lightSourceSettingsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.LINE_TYPE: {
				LineType lineType = (LineType)theEObject;
				T result = caseLineType(lineType);
				if (result == null) result = caseShape(lineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.LIST_ANNOTATION_TYPE: {
				ListAnnotationType listAnnotationType = (ListAnnotationType)theEObject;
				T result = caseListAnnotationType(listAnnotationType);
				if (result == null) result = caseAnnotation(listAnnotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.LONG_ANNOTATION_TYPE: {
				LongAnnotationType longAnnotationType = (LongAnnotationType)theEObject;
				T result = caseLongAnnotationType(longAnnotationType);
				if (result == null) result = caseNumericAnnotation(longAnnotationType);
				if (result == null) result = caseBasicAnnotation(longAnnotationType);
				if (result == null) result = caseAnnotation(longAnnotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.MANUFACTURER_SPEC: {
				ManufacturerSpec manufacturerSpec = (ManufacturerSpec)theEObject;
				T result = caseManufacturerSpec(manufacturerSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.MAP: {
				Map map = (Map)theEObject;
				T result = caseMap(map);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.MAP_ANNOTATION_TYPE: {
				MapAnnotationType mapAnnotationType = (MapAnnotationType)theEObject;
				T result = caseMapAnnotationType(mapAnnotationType);
				if (result == null) result = caseAnnotation(mapAnnotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.MASK_TYPE: {
				MaskType maskType = (MaskType)theEObject;
				T result = caseMaskType(maskType);
				if (result == null) result = caseShape(maskType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.MICROBEAM_MANIPULATION_REF_TYPE: {
				MicrobeamManipulationRefType microbeamManipulationRefType = (MicrobeamManipulationRefType)theEObject;
				T result = caseMicrobeamManipulationRefType(microbeamManipulationRefType);
				if (result == null) result = caseReference(microbeamManipulationRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.MICROBEAM_MANIPULATION_TYPE: {
				MicrobeamManipulationType microbeamManipulationType = (MicrobeamManipulationType)theEObject;
				T result = caseMicrobeamManipulationType(microbeamManipulationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.MICROSCOPE_TYPE: {
				MicroscopeType microscopeType = (MicroscopeType)theEObject;
				T result = caseMicroscopeType(microscopeType);
				if (result == null) result = caseManufacturerSpec(microscopeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.MTYPE: {
				MType mType = (MType)theEObject;
				T result = caseMType(mType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.NUMERIC_ANNOTATION: {
				NumericAnnotation numericAnnotation = (NumericAnnotation)theEObject;
				T result = caseNumericAnnotation(numericAnnotation);
				if (result == null) result = caseBasicAnnotation(numericAnnotation);
				if (result == null) result = caseAnnotation(numericAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.OBJECTIVE_SETTINGS_TYPE: {
				ObjectiveSettingsType objectiveSettingsType = (ObjectiveSettingsType)theEObject;
				T result = caseObjectiveSettingsType(objectiveSettingsType);
				if (result == null) result = caseSettings(objectiveSettingsType);
				if (result == null) result = caseReference(objectiveSettingsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.OBJECTIVE_TYPE: {
				ObjectiveType objectiveType = (ObjectiveType)theEObject;
				T result = caseObjectiveType(objectiveType);
				if (result == null) result = caseManufacturerSpec(objectiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.OME_TYPE: {
				OMEType omeType = (OMEType)theEObject;
				T result = caseOMEType(omeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.PIXELS_TYPE: {
				PixelsType pixelsType = (PixelsType)theEObject;
				T result = casePixelsType(pixelsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.PLANE_TYPE: {
				PlaneType planeType = (PlaneType)theEObject;
				T result = casePlaneType(planeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.PLATE_ACQUISITION_TYPE: {
				PlateAcquisitionType plateAcquisitionType = (PlateAcquisitionType)theEObject;
				T result = casePlateAcquisitionType(plateAcquisitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.PLATE_REF_TYPE: {
				PlateRefType plateRefType = (PlateRefType)theEObject;
				T result = casePlateRefType(plateRefType);
				if (result == null) result = caseReference(plateRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.PLATE_TYPE: {
				PlateType plateType = (PlateType)theEObject;
				T result = casePlateType(plateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.POINT_TYPE: {
				PointType pointType = (PointType)theEObject;
				T result = casePointType(pointType);
				if (result == null) result = caseShape(pointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.POLYGON_TYPE: {
				PolygonType polygonType = (PolygonType)theEObject;
				T result = casePolygonType(polygonType);
				if (result == null) result = caseShape(polygonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.POLYLINE_TYPE: {
				PolylineType polylineType = (PolylineType)theEObject;
				T result = casePolylineType(polylineType);
				if (result == null) result = caseShape(polylineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.PROJECT_REF_TYPE: {
				ProjectRefType projectRefType = (ProjectRefType)theEObject;
				T result = caseProjectRefType(projectRefType);
				if (result == null) result = caseReference(projectRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.PROJECT_TYPE: {
				ProjectType projectType = (ProjectType)theEObject;
				T result = caseProjectType(projectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.PUMP_TYPE: {
				PumpType pumpType = (PumpType)theEObject;
				T result = casePumpType(pumpType);
				if (result == null) result = caseReference(pumpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.REAGENT_REF_TYPE: {
				ReagentRefType reagentRefType = (ReagentRefType)theEObject;
				T result = caseReagentRefType(reagentRefType);
				if (result == null) result = caseReference(reagentRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.REAGENT_TYPE: {
				ReagentType reagentType = (ReagentType)theEObject;
				T result = caseReagentType(reagentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.RECTANGLE_TYPE: {
				RectangleType rectangleType = (RectangleType)theEObject;
				T result = caseRectangleType(rectangleType);
				if (result == null) result = caseShape(rectangleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.RIGHTS_TYPE: {
				RightsType rightsType = (RightsType)theEObject;
				T result = caseRightsType(rightsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.ROI_REF_TYPE: {
				ROIRefType roiRefType = (ROIRefType)theEObject;
				T result = caseROIRefType(roiRefType);
				if (result == null) result = caseReference(roiRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.ROI_TYPE: {
				ROIType roiType = (ROIType)theEObject;
				T result = caseROIType(roiType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.SCREEN_TYPE: {
				ScreenType screenType = (ScreenType)theEObject;
				T result = caseScreenType(screenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.SETTINGS: {
				Settings settings = (Settings)theEObject;
				T result = caseSettings(settings);
				if (result == null) result = caseReference(settings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.SHAPE: {
				Shape shape = (Shape)theEObject;
				T result = caseShape(shape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.STAGE_LABEL_TYPE: {
				StageLabelType stageLabelType = (StageLabelType)theEObject;
				T result = caseStageLabelType(stageLabelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.STRUCTURED_ANNOTATIONS_TYPE: {
				StructuredAnnotationsType structuredAnnotationsType = (StructuredAnnotationsType)theEObject;
				T result = caseStructuredAnnotationsType(structuredAnnotationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.TAG_ANNOTATION_TYPE: {
				TagAnnotationType tagAnnotationType = (TagAnnotationType)theEObject;
				T result = caseTagAnnotationType(tagAnnotationType);
				if (result == null) result = caseTextAnnotation(tagAnnotationType);
				if (result == null) result = caseAnnotation(tagAnnotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.TERM_ANNOTATION_TYPE: {
				TermAnnotationType termAnnotationType = (TermAnnotationType)theEObject;
				T result = caseTermAnnotationType(termAnnotationType);
				if (result == null) result = caseBasicAnnotation(termAnnotationType);
				if (result == null) result = caseAnnotation(termAnnotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.TEXT_ANNOTATION: {
				TextAnnotation textAnnotation = (TextAnnotation)theEObject;
				T result = caseTextAnnotation(textAnnotation);
				if (result == null) result = caseAnnotation(textAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.TIFF_DATA_TYPE: {
				TiffDataType tiffDataType = (TiffDataType)theEObject;
				T result = caseTiffDataType(tiffDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.TIMESTAMP_ANNOTATION_TYPE: {
				TimestampAnnotationType timestampAnnotationType = (TimestampAnnotationType)theEObject;
				T result = caseTimestampAnnotationType(timestampAnnotationType);
				if (result == null) result = caseBasicAnnotation(timestampAnnotationType);
				if (result == null) result = caseAnnotation(timestampAnnotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.TRANSMITTANCE_RANGE_TYPE: {
				TransmittanceRangeType transmittanceRangeType = (TransmittanceRangeType)theEObject;
				T result = caseTransmittanceRangeType(transmittanceRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.TYPE_ANNOTATION: {
				TypeAnnotation typeAnnotation = (TypeAnnotation)theEObject;
				T result = caseTypeAnnotation(typeAnnotation);
				if (result == null) result = caseAnnotation(typeAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.UNION_TYPE: {
				UnionType unionType = (UnionType)theEObject;
				T result = caseUnionType(unionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.UUID_TYPE: {
				UUIDType uuidType = (UUIDType)theEObject;
				T result = caseUUIDType(uuidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.WELL_SAMPLE_REF_TYPE: {
				WellSampleRefType wellSampleRefType = (WellSampleRefType)theEObject;
				T result = caseWellSampleRefType(wellSampleRefType);
				if (result == null) result = caseReference(wellSampleRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.WELL_SAMPLE_TYPE: {
				WellSampleType wellSampleType = (WellSampleType)theEObject;
				T result = caseWellSampleType(wellSampleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.WELL_TYPE: {
				WellType wellType = (WellType)theEObject;
				T result = caseWellType(wellType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OMEPackage.XML_ANNOTATION_TYPE: {
				XMLAnnotationType xmlAnnotationType = (XMLAnnotationType)theEObject;
				T result = caseXMLAnnotationType(xmlAnnotationType);
				if (result == null) result = caseTextAnnotation(xmlAnnotationType);
				if (result == null) result = caseAnnotation(xmlAnnotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affine Transform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affine Transform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffineTransform(AffineTransform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationRefType(AnnotationRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcType(ArcType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicAnnotation(BasicAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryFileType(BinaryFileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Only Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Only Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOnlyType(BinaryOnlyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bin Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bin Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinDataType(BinDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanAnnotationType(BooleanAnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelRefType(ChannelRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelType(ChannelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentAnnotationType(CommentAnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatasetRefType(DatasetRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatasetType(DatasetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detector Settings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detector Settings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetectorSettingsType(DetectorSettingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetectorType(DetectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dichroic Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dichroic Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDichroicRefType(DichroicRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dichroic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dichroic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDichroicType(DichroicType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Double Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleAnnotationType(DoubleAnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ellipse Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ellipse Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEllipseType(EllipseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experimenter Group Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experimenter Group Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimenterGroupRefType(ExperimenterGroupRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experimenter Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experimenter Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimenterGroupType(ExperimenterGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experimenter Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experimenter Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimenterRefType(ExperimenterRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experimenter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experimenter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimenterType(ExperimenterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentRefType(ExperimentRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experiment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experiment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentType(ExperimentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalType(ExternalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filament Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filament Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilamentType(FilamentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileAnnotationType(FileAnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterRef(FilterRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Set Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Set Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterSetRefType(FilterSetRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterSetType(FilterSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterType(FilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolderRefType(FolderRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolderType(FolderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Excitation Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Excitation Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericExcitationSourceType(GenericExcitationSourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageRefType(ImageRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageType(ImageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imaging Environment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imaging Environment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagingEnvironmentType(ImagingEnvironmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instrument Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instrument Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstrumentRefType(InstrumentRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instrument Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instrument Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstrumentType(InstrumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelType(LabelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Laser Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Laser Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLaserType(LaserType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leader Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leader Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeaderType(LeaderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light Emitting Diode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light Emitting Diode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLightEmittingDiodeType(LightEmittingDiodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLightPathType(LightPathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLightSource(LightSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light Source Settings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light Source Settings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLightSourceSettingsType(LightSourceSettingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineType(LineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListAnnotationType(ListAnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Long Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Long Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLongAnnotationType(LongAnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manufacturer Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manufacturer Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManufacturerSpec(ManufacturerSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMap(Map object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapAnnotationType(MapAnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mask Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mask Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaskType(MaskType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microbeam Manipulation Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microbeam Manipulation Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicrobeamManipulationRefType(MicrobeamManipulationRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microbeam Manipulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microbeam Manipulation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicrobeamManipulationType(MicrobeamManipulationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microscope Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microscope Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroscopeType(MicroscopeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMType(MType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericAnnotation(NumericAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective Settings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective Settings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectiveSettingsType(ObjectiveSettingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectiveType(ObjectiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOMEType(OMEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pixels Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pixels Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePixelsType(PixelsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plane Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plane Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaneType(PlaneType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plate Acquisition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plate Acquisition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlateAcquisitionType(PlateAcquisitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plate Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plate Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlateRefType(PlateRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlateType(PlateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointType(PointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonType(PolygonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polyline Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polyline Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolylineType(PolylineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectRefType(ProjectRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectType(ProjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pump Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pump Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePumpType(PumpType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reagent Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reagent Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReagentRefType(ReagentRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reagent Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reagent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReagentType(ReagentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangleType(RectangleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rights Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rights Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRightsType(RightsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROI Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROI Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROIRefType(ROIRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ROI Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ROI Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseROIType(ROIType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreenType(ScreenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSettings(Settings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShape(Shape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Label Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Label Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStageLabelType(StageLabelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Annotations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Annotations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredAnnotationsType(StructuredAnnotationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagAnnotationType(TagAnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermAnnotationType(TermAnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextAnnotation(TextAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tiff Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tiff Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTiffDataType(TiffDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timestamp Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timestamp Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimestampAnnotationType(TimestampAnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmittance Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmittance Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmittanceRangeType(TransmittanceRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAnnotation(TypeAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionType(UnionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UUID Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UUID Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUUIDType(UUIDType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Well Sample Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Well Sample Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWellSampleRefType(WellSampleRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Well Sample Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Well Sample Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWellSampleType(WellSampleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Well Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Well Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWellType(WellType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLAnnotationType(XMLAnnotationType object) {
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

} //OMESwitch
