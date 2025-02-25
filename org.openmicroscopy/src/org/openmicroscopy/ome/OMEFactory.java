/*
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
package org.openmicroscopy.ome;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openmicroscopy.ome.OMEPackage
 * @generated
 */
@ProviderType
public interface OMEFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OMEFactory eINSTANCE = org.openmicroscopy.ome.impl.OMEFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Affine Transform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Affine Transform</em>'.
	 * @generated
	 */
	AffineTransform createAffineTransform();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Annotation Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Ref Type</em>'.
	 * @generated
	 */
	AnnotationRefType createAnnotationRefType();

	/**
	 * Returns a new object of class '<em>Arc Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arc Type</em>'.
	 * @generated
	 */
	ArcType createArcType();

	/**
	 * Returns a new object of class '<em>Basic Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Annotation</em>'.
	 * @generated
	 */
	BasicAnnotation createBasicAnnotation();

	/**
	 * Returns a new object of class '<em>Binary File Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary File Type</em>'.
	 * @generated
	 */
	BinaryFileType createBinaryFileType();

	/**
	 * Returns a new object of class '<em>Binary Only Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Only Type</em>'.
	 * @generated
	 */
	BinaryOnlyType createBinaryOnlyType();

	/**
	 * Returns a new object of class '<em>Bin Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bin Data Type</em>'.
	 * @generated
	 */
	BinDataType createBinDataType();

	/**
	 * Returns a new object of class '<em>Boolean Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Annotation Type</em>'.
	 * @generated
	 */
	BooleanAnnotationType createBooleanAnnotationType();

	/**
	 * Returns a new object of class '<em>Channel Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel Ref Type</em>'.
	 * @generated
	 */
	ChannelRefType createChannelRefType();

	/**
	 * Returns a new object of class '<em>Channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel Type</em>'.
	 * @generated
	 */
	ChannelType createChannelType();

	/**
	 * Returns a new object of class '<em>Comment Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment Annotation Type</em>'.
	 * @generated
	 */
	CommentAnnotationType createCommentAnnotationType();

	/**
	 * Returns a new object of class '<em>Dataset Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset Ref Type</em>'.
	 * @generated
	 */
	DatasetRefType createDatasetRefType();

	/**
	 * Returns a new object of class '<em>Dataset Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataset Type</em>'.
	 * @generated
	 */
	DatasetType createDatasetType();

	/**
	 * Returns a new object of class '<em>Detector Settings Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detector Settings Type</em>'.
	 * @generated
	 */
	DetectorSettingsType createDetectorSettingsType();

	/**
	 * Returns a new object of class '<em>Detector Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detector Type</em>'.
	 * @generated
	 */
	DetectorType createDetectorType();

	/**
	 * Returns a new object of class '<em>Dichroic Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dichroic Ref Type</em>'.
	 * @generated
	 */
	DichroicRefType createDichroicRefType();

	/**
	 * Returns a new object of class '<em>Dichroic Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dichroic Type</em>'.
	 * @generated
	 */
	DichroicType createDichroicType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Double Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Annotation Type</em>'.
	 * @generated
	 */
	DoubleAnnotationType createDoubleAnnotationType();

	/**
	 * Returns a new object of class '<em>Ellipse Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ellipse Type</em>'.
	 * @generated
	 */
	EllipseType createEllipseType();

	/**
	 * Returns a new object of class '<em>Experimenter Group Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experimenter Group Ref Type</em>'.
	 * @generated
	 */
	ExperimenterGroupRefType createExperimenterGroupRefType();

	/**
	 * Returns a new object of class '<em>Experimenter Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experimenter Group Type</em>'.
	 * @generated
	 */
	ExperimenterGroupType createExperimenterGroupType();

	/**
	 * Returns a new object of class '<em>Experimenter Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experimenter Ref Type</em>'.
	 * @generated
	 */
	ExperimenterRefType createExperimenterRefType();

	/**
	 * Returns a new object of class '<em>Experimenter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experimenter Type</em>'.
	 * @generated
	 */
	ExperimenterType createExperimenterType();

	/**
	 * Returns a new object of class '<em>Experiment Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experiment Ref Type</em>'.
	 * @generated
	 */
	ExperimentRefType createExperimentRefType();

	/**
	 * Returns a new object of class '<em>Experiment Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experiment Type</em>'.
	 * @generated
	 */
	ExperimentType createExperimentType();

	/**
	 * Returns a new object of class '<em>External Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Type</em>'.
	 * @generated
	 */
	ExternalType createExternalType();

	/**
	 * Returns a new object of class '<em>Filament Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filament Type</em>'.
	 * @generated
	 */
	FilamentType createFilamentType();

	/**
	 * Returns a new object of class '<em>File Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Annotation Type</em>'.
	 * @generated
	 */
	FileAnnotationType createFileAnnotationType();

	/**
	 * Returns a new object of class '<em>Filter Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Ref</em>'.
	 * @generated
	 */
	FilterRef createFilterRef();

	/**
	 * Returns a new object of class '<em>Filter Set Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Set Ref Type</em>'.
	 * @generated
	 */
	FilterSetRefType createFilterSetRefType();

	/**
	 * Returns a new object of class '<em>Filter Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Set Type</em>'.
	 * @generated
	 */
	FilterSetType createFilterSetType();

	/**
	 * Returns a new object of class '<em>Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Type</em>'.
	 * @generated
	 */
	FilterType createFilterType();

	/**
	 * Returns a new object of class '<em>Folder Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder Ref Type</em>'.
	 * @generated
	 */
	FolderRefType createFolderRefType();

	/**
	 * Returns a new object of class '<em>Folder Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder Type</em>'.
	 * @generated
	 */
	FolderType createFolderType();

	/**
	 * Returns a new object of class '<em>Generic Excitation Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Excitation Source Type</em>'.
	 * @generated
	 */
	GenericExcitationSourceType createGenericExcitationSourceType();

	/**
	 * Returns a new object of class '<em>Image Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Ref Type</em>'.
	 * @generated
	 */
	ImageRefType createImageRefType();

	/**
	 * Returns a new object of class '<em>Image Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Type</em>'.
	 * @generated
	 */
	ImageType createImageType();

	/**
	 * Returns a new object of class '<em>Imaging Environment Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imaging Environment Type</em>'.
	 * @generated
	 */
	ImagingEnvironmentType createImagingEnvironmentType();

	/**
	 * Returns a new object of class '<em>Instrument Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instrument Ref Type</em>'.
	 * @generated
	 */
	InstrumentRefType createInstrumentRefType();

	/**
	 * Returns a new object of class '<em>Instrument Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instrument Type</em>'.
	 * @generated
	 */
	InstrumentType createInstrumentType();

	/**
	 * Returns a new object of class '<em>Label Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Type</em>'.
	 * @generated
	 */
	LabelType createLabelType();

	/**
	 * Returns a new object of class '<em>Laser Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Laser Type</em>'.
	 * @generated
	 */
	LaserType createLaserType();

	/**
	 * Returns a new object of class '<em>Leader Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leader Type</em>'.
	 * @generated
	 */
	LeaderType createLeaderType();

	/**
	 * Returns a new object of class '<em>Light Emitting Diode Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Light Emitting Diode Type</em>'.
	 * @generated
	 */
	LightEmittingDiodeType createLightEmittingDiodeType();

	/**
	 * Returns a new object of class '<em>Light Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Light Path Type</em>'.
	 * @generated
	 */
	LightPathType createLightPathType();

	/**
	 * Returns a new object of class '<em>Light Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Light Source</em>'.
	 * @generated
	 */
	LightSource createLightSource();

	/**
	 * Returns a new object of class '<em>Light Source Settings Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Light Source Settings Type</em>'.
	 * @generated
	 */
	LightSourceSettingsType createLightSourceSettingsType();

	/**
	 * Returns a new object of class '<em>Line Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Type</em>'.
	 * @generated
	 */
	LineType createLineType();

	/**
	 * Returns a new object of class '<em>List Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Annotation Type</em>'.
	 * @generated
	 */
	ListAnnotationType createListAnnotationType();

	/**
	 * Returns a new object of class '<em>Long Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Annotation Type</em>'.
	 * @generated
	 */
	LongAnnotationType createLongAnnotationType();

	/**
	 * Returns a new object of class '<em>Manufacturer Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manufacturer Spec</em>'.
	 * @generated
	 */
	ManufacturerSpec createManufacturerSpec();

	/**
	 * Returns a new object of class '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map</em>'.
	 * @generated
	 */
	Map createMap();

	/**
	 * Returns a new object of class '<em>Map Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Annotation Type</em>'.
	 * @generated
	 */
	MapAnnotationType createMapAnnotationType();

	/**
	 * Returns a new object of class '<em>Mask Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mask Type</em>'.
	 * @generated
	 */
	MaskType createMaskType();

	/**
	 * Returns a new object of class '<em>Microbeam Manipulation Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microbeam Manipulation Ref Type</em>'.
	 * @generated
	 */
	MicrobeamManipulationRefType createMicrobeamManipulationRefType();

	/**
	 * Returns a new object of class '<em>Microbeam Manipulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microbeam Manipulation Type</em>'.
	 * @generated
	 */
	MicrobeamManipulationType createMicrobeamManipulationType();

	/**
	 * Returns a new object of class '<em>Microscope Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microscope Type</em>'.
	 * @generated
	 */
	MicroscopeType createMicroscopeType();

	/**
	 * Returns a new object of class '<em>MType</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MType</em>'.
	 * @generated
	 */
	MType createMType();

	/**
	 * Returns a new object of class '<em>Numeric Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Annotation</em>'.
	 * @generated
	 */
	NumericAnnotation createNumericAnnotation();

	/**
	 * Returns a new object of class '<em>Objective Settings Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective Settings Type</em>'.
	 * @generated
	 */
	ObjectiveSettingsType createObjectiveSettingsType();

	/**
	 * Returns a new object of class '<em>Objective Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Objective Type</em>'.
	 * @generated
	 */
	ObjectiveType createObjectiveType();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	OMEType createOMEType();

	/**
	 * Returns a new object of class '<em>Pixels Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pixels Type</em>'.
	 * @generated
	 */
	PixelsType createPixelsType();

	/**
	 * Returns a new object of class '<em>Plane Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plane Type</em>'.
	 * @generated
	 */
	PlaneType createPlaneType();

	/**
	 * Returns a new object of class '<em>Plate Acquisition Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plate Acquisition Type</em>'.
	 * @generated
	 */
	PlateAcquisitionType createPlateAcquisitionType();

	/**
	 * Returns a new object of class '<em>Plate Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plate Ref Type</em>'.
	 * @generated
	 */
	PlateRefType createPlateRefType();

	/**
	 * Returns a new object of class '<em>Plate Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plate Type</em>'.
	 * @generated
	 */
	PlateType createPlateType();

	/**
	 * Returns a new object of class '<em>Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Type</em>'.
	 * @generated
	 */
	PointType createPointType();

	/**
	 * Returns a new object of class '<em>Polygon Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polygon Type</em>'.
	 * @generated
	 */
	PolygonType createPolygonType();

	/**
	 * Returns a new object of class '<em>Polyline Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polyline Type</em>'.
	 * @generated
	 */
	PolylineType createPolylineType();

	/**
	 * Returns a new object of class '<em>Project Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Ref Type</em>'.
	 * @generated
	 */
	ProjectRefType createProjectRefType();

	/**
	 * Returns a new object of class '<em>Project Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Type</em>'.
	 * @generated
	 */
	ProjectType createProjectType();

	/**
	 * Returns a new object of class '<em>Pump Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pump Type</em>'.
	 * @generated
	 */
	PumpType createPumpType();

	/**
	 * Returns a new object of class '<em>Reagent Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reagent Ref Type</em>'.
	 * @generated
	 */
	ReagentRefType createReagentRefType();

	/**
	 * Returns a new object of class '<em>Reagent Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reagent Type</em>'.
	 * @generated
	 */
	ReagentType createReagentType();

	/**
	 * Returns a new object of class '<em>Rectangle Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangle Type</em>'.
	 * @generated
	 */
	RectangleType createRectangleType();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns a new object of class '<em>Rights Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rights Type</em>'.
	 * @generated
	 */
	RightsType createRightsType();

	/**
	 * Returns a new object of class '<em>ROI Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROI Ref Type</em>'.
	 * @generated
	 */
	ROIRefType createROIRefType();

	/**
	 * Returns a new object of class '<em>ROI Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROI Type</em>'.
	 * @generated
	 */
	ROIType createROIType();

	/**
	 * Returns a new object of class '<em>Screen Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Screen Type</em>'.
	 * @generated
	 */
	ScreenType createScreenType();

	/**
	 * Returns a new object of class '<em>Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Settings</em>'.
	 * @generated
	 */
	Settings createSettings();

	/**
	 * Returns a new object of class '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shape</em>'.
	 * @generated
	 */
	Shape createShape();

	/**
	 * Returns a new object of class '<em>Stage Label Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stage Label Type</em>'.
	 * @generated
	 */
	StageLabelType createStageLabelType();

	/**
	 * Returns a new object of class '<em>Structured Annotations Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Annotations Type</em>'.
	 * @generated
	 */
	StructuredAnnotationsType createStructuredAnnotationsType();

	/**
	 * Returns a new object of class '<em>Tag Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag Annotation Type</em>'.
	 * @generated
	 */
	TagAnnotationType createTagAnnotationType();

	/**
	 * Returns a new object of class '<em>Term Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Annotation Type</em>'.
	 * @generated
	 */
	TermAnnotationType createTermAnnotationType();

	/**
	 * Returns a new object of class '<em>Text Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Annotation</em>'.
	 * @generated
	 */
	TextAnnotation createTextAnnotation();

	/**
	 * Returns a new object of class '<em>Tiff Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tiff Data Type</em>'.
	 * @generated
	 */
	TiffDataType createTiffDataType();

	/**
	 * Returns a new object of class '<em>Timestamp Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timestamp Annotation Type</em>'.
	 * @generated
	 */
	TimestampAnnotationType createTimestampAnnotationType();

	/**
	 * Returns a new object of class '<em>Transmittance Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transmittance Range Type</em>'.
	 * @generated
	 */
	TransmittanceRangeType createTransmittanceRangeType();

	/**
	 * Returns a new object of class '<em>Type Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Annotation</em>'.
	 * @generated
	 */
	TypeAnnotation createTypeAnnotation();

	/**
	 * Returns a new object of class '<em>Union Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union Type</em>'.
	 * @generated
	 */
	UnionType createUnionType();

	/**
	 * Returns a new object of class '<em>UUID Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UUID Type</em>'.
	 * @generated
	 */
	UUIDType createUUIDType();

	/**
	 * Returns a new object of class '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Type</em>'.
	 * @generated
	 */
	ValueType createValueType();

	/**
	 * Returns a new object of class '<em>Well Sample Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Well Sample Ref Type</em>'.
	 * @generated
	 */
	WellSampleRefType createWellSampleRefType();

	/**
	 * Returns a new object of class '<em>Well Sample Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Well Sample Type</em>'.
	 * @generated
	 */
	WellSampleType createWellSampleType();

	/**
	 * Returns a new object of class '<em>Well Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Well Type</em>'.
	 * @generated
	 */
	WellType createWellType();

	/**
	 * Returns a new object of class '<em>XML Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Annotation Type</em>'.
	 * @generated
	 */
	XMLAnnotationType createXMLAnnotationType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OMEPackage getOMEPackage();

} //OMEFactory
