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
package org.openmicroscopy.ome.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openmicroscopy.ome.AnnotationRefType;
import org.openmicroscopy.ome.ArcType;
import org.openmicroscopy.ome.BinDataType;
import org.openmicroscopy.ome.BinaryFileType;
import org.openmicroscopy.ome.BooleanAnnotationType;
import org.openmicroscopy.ome.ChannelRefType;
import org.openmicroscopy.ome.ChannelType;
import org.openmicroscopy.ome.CommentAnnotationType;
import org.openmicroscopy.ome.DatasetRefType;
import org.openmicroscopy.ome.DatasetType;
import org.openmicroscopy.ome.DetectorSettingsType;
import org.openmicroscopy.ome.DetectorType;
import org.openmicroscopy.ome.DichroicRefType;
import org.openmicroscopy.ome.DichroicType;
import org.openmicroscopy.ome.DocumentRoot;
import org.openmicroscopy.ome.DoubleAnnotationType;
import org.openmicroscopy.ome.EllipseType;
import org.openmicroscopy.ome.ExperimentRefType;
import org.openmicroscopy.ome.ExperimentType;
import org.openmicroscopy.ome.ExperimenterGroupRefType;
import org.openmicroscopy.ome.ExperimenterGroupType;
import org.openmicroscopy.ome.ExperimenterRefType;
import org.openmicroscopy.ome.ExperimenterType;
import org.openmicroscopy.ome.ExternalType;
import org.openmicroscopy.ome.FilamentType;
import org.openmicroscopy.ome.FileAnnotationType;
import org.openmicroscopy.ome.FilterSetRefType;
import org.openmicroscopy.ome.FilterSetType;
import org.openmicroscopy.ome.FilterType;
import org.openmicroscopy.ome.FolderRefType;
import org.openmicroscopy.ome.FolderType;
import org.openmicroscopy.ome.GenericExcitationSourceType;
import org.openmicroscopy.ome.ImageRefType;
import org.openmicroscopy.ome.ImageType;
import org.openmicroscopy.ome.ImagingEnvironmentType;
import org.openmicroscopy.ome.InstrumentRefType;
import org.openmicroscopy.ome.InstrumentType;
import org.openmicroscopy.ome.LabelType;
import org.openmicroscopy.ome.LaserType;
import org.openmicroscopy.ome.LeaderType;
import org.openmicroscopy.ome.LightEmittingDiodeType;
import org.openmicroscopy.ome.LightPathType;
import org.openmicroscopy.ome.LightSource;
import org.openmicroscopy.ome.LightSourceSettingsType;
import org.openmicroscopy.ome.LineType;
import org.openmicroscopy.ome.ListAnnotationType;
import org.openmicroscopy.ome.LongAnnotationType;
import org.openmicroscopy.ome.MapAnnotationType;
import org.openmicroscopy.ome.MaskType;
import org.openmicroscopy.ome.MicrobeamManipulationRefType;
import org.openmicroscopy.ome.MicrobeamManipulationType;
import org.openmicroscopy.ome.MicroscopeType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.OMEType;
import org.openmicroscopy.ome.ObjectiveSettingsType;
import org.openmicroscopy.ome.ObjectiveType;
import org.openmicroscopy.ome.PixelsType;
import org.openmicroscopy.ome.PlaneType;
import org.openmicroscopy.ome.PlateAcquisitionType;
import org.openmicroscopy.ome.PlateType;
import org.openmicroscopy.ome.PointType;
import org.openmicroscopy.ome.PolygonType;
import org.openmicroscopy.ome.PolylineType;
import org.openmicroscopy.ome.ProjectRefType;
import org.openmicroscopy.ome.ProjectType;
import org.openmicroscopy.ome.PumpType;
import org.openmicroscopy.ome.ROIRefType;
import org.openmicroscopy.ome.ROIType;
import org.openmicroscopy.ome.ReagentRefType;
import org.openmicroscopy.ome.ReagentType;
import org.openmicroscopy.ome.RectangleType;
import org.openmicroscopy.ome.RightsType;
import org.openmicroscopy.ome.ScreenType;
import org.openmicroscopy.ome.Shape;
import org.openmicroscopy.ome.StageLabelType;
import org.openmicroscopy.ome.StructuredAnnotationsType;
import org.openmicroscopy.ome.TagAnnotationType;
import org.openmicroscopy.ome.TermAnnotationType;
import org.openmicroscopy.ome.TiffDataType;
import org.openmicroscopy.ome.TimestampAnnotationType;
import org.openmicroscopy.ome.TransmittanceRangeType;
import org.openmicroscopy.ome.WellSampleRefType;
import org.openmicroscopy.ome.WellSampleType;
import org.openmicroscopy.ome.WellType;
import org.openmicroscopy.ome.XMLAnnotationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getArc <em>Arc</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getLightSourceGroup <em>Light Source Group</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getBinaryFile <em>Binary File</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getBinData <em>Bin Data</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getBooleanAnnotation <em>Boolean Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getChannelRef <em>Channel Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getCommentAnnotation <em>Comment Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getDatasetRef <em>Dataset Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getDetector <em>Detector</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getDetectorSettings <em>Detector Settings</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getDichroic <em>Dichroic</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getDichroicRef <em>Dichroic Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getDoubleAnnotation <em>Double Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getShapeGroup <em>Shape Group</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getExperiment <em>Experiment</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getExperimenter <em>Experimenter</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getExperimenterGroup <em>Experimenter Group</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getExperimenterGroupRef <em>Experimenter Group Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getExperimenterRef <em>Experimenter Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getExperimentRef <em>Experiment Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getExternal <em>External</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getFilament <em>Filament</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getFileAnnotation <em>File Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getFilterSet <em>Filter Set</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getFilterSetRef <em>Filter Set Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getFolder <em>Folder</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getFolderRef <em>Folder Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getGenericExcitationSource <em>Generic Excitation Source</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getImageRef <em>Image Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getImagingEnvironment <em>Imaging Environment</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getInstrument <em>Instrument</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getInstrumentRef <em>Instrument Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getLaser <em>Laser</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getLeader <em>Leader</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getLightEmittingDiode <em>Light Emitting Diode</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getLightPath <em>Light Path</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getLightSourceSettings <em>Light Source Settings</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getListAnnotation <em>List Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getLongAnnotation <em>Long Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getMapAnnotation <em>Map Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getMask <em>Mask</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getMetadataOnly <em>Metadata Only</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getMicrobeamManipulation <em>Microbeam Manipulation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getMicrobeamManipulationRef <em>Microbeam Manipulation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getMicroscope <em>Microscope</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getObjectiveSettings <em>Objective Settings</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getOME <em>OME</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getPixels <em>Pixels</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getPlate <em>Plate</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getPlateAcquisition <em>Plate Acquisition</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getProject <em>Project</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getProjectRef <em>Project Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getPump <em>Pump</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getReagent <em>Reagent</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getReagentRef <em>Reagent Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getRights <em>Rights</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getROI <em>ROI</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getROIRef <em>ROI Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getScreen <em>Screen</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getStageLabel <em>Stage Label</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getStructuredAnnotations <em>Structured Annotations</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getTagAnnotation <em>Tag Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getTermAnnotation <em>Term Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getTiffData <em>Tiff Data</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getTimestampAnnotation <em>Timestamp Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getTransmittanceRange <em>Transmittance Range</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getWell <em>Well</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getWellSample <em>Well Sample</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getWellSampleRef <em>Well Sample Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.DocumentRootImpl#getXMLAnnotation <em>XML Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, OMEPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, OMEPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, OMEPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationRefType getAnnotationRef() {
		return (AnnotationRefType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_AnnotationRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotationRef(AnnotationRefType newAnnotationRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_AnnotationRef(), newAnnotationRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotationRef(AnnotationRefType newAnnotationRef) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_AnnotationRef(), newAnnotationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcType getArc() {
		return (ArcType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Arc(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArc(ArcType newArc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Arc(), newArc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArc(ArcType newArc) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Arc(), newArc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightSource getLightSourceGroup() {
		return (LightSource)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_LightSourceGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLightSourceGroup(LightSource newLightSourceGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_LightSourceGroup(), newLightSourceGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryFileType getBinaryFile() {
		return (BinaryFileType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_BinaryFile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryFile(BinaryFileType newBinaryFile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_BinaryFile(), newBinaryFile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinaryFile(BinaryFileType newBinaryFile) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_BinaryFile(), newBinaryFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinDataType getBinData() {
		return (BinDataType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_BinData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinData(BinDataType newBinData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_BinData(), newBinData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinData(BinDataType newBinData) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_BinData(), newBinData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanAnnotationType getBooleanAnnotation() {
		return (BooleanAnnotationType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_BooleanAnnotation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBooleanAnnotation(BooleanAnnotationType newBooleanAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_BooleanAnnotation(), newBooleanAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBooleanAnnotation(BooleanAnnotationType newBooleanAnnotation) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_BooleanAnnotation(), newBooleanAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChannelType getChannel() {
		return (ChannelType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Channel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannel(ChannelType newChannel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Channel(), newChannel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChannel(ChannelType newChannel) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Channel(), newChannel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChannelRefType getChannelRef() {
		return (ChannelRefType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_ChannelRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannelRef(ChannelRefType newChannelRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_ChannelRef(), newChannelRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChannelRef(ChannelRefType newChannelRef) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_ChannelRef(), newChannelRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommentAnnotationType getCommentAnnotation() {
		return (CommentAnnotationType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_CommentAnnotation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommentAnnotation(CommentAnnotationType newCommentAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_CommentAnnotation(), newCommentAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommentAnnotation(CommentAnnotationType newCommentAnnotation) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_CommentAnnotation(), newCommentAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasetType getDataset() {
		return (DatasetType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Dataset(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataset(DatasetType newDataset, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Dataset(), newDataset, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataset(DatasetType newDataset) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Dataset(), newDataset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasetRefType getDatasetRef() {
		return (DatasetRefType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_DatasetRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatasetRef(DatasetRefType newDatasetRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_DatasetRef(), newDatasetRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatasetRef(DatasetRefType newDatasetRef) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_DatasetRef(), newDatasetRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetectorType getDetector() {
		return (DetectorType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Detector(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetector(DetectorType newDetector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Detector(), newDetector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetector(DetectorType newDetector) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Detector(), newDetector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetectorSettingsType getDetectorSettings() {
		return (DetectorSettingsType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_DetectorSettings(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetectorSettings(DetectorSettingsType newDetectorSettings, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_DetectorSettings(), newDetectorSettings, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetectorSettings(DetectorSettingsType newDetectorSettings) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_DetectorSettings(), newDetectorSettings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DichroicType getDichroic() {
		return (DichroicType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Dichroic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDichroic(DichroicType newDichroic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Dichroic(), newDichroic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDichroic(DichroicType newDichroic) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Dichroic(), newDichroic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DichroicRefType getDichroicRef() {
		return (DichroicRefType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_DichroicRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDichroicRef(DichroicRefType newDichroicRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_DichroicRef(), newDichroicRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDichroicRef(DichroicRefType newDichroicRef) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_DichroicRef(), newDichroicRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleAnnotationType getDoubleAnnotation() {
		return (DoubleAnnotationType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_DoubleAnnotation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoubleAnnotation(DoubleAnnotationType newDoubleAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_DoubleAnnotation(), newDoubleAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoubleAnnotation(DoubleAnnotationType newDoubleAnnotation) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_DoubleAnnotation(), newDoubleAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipseType getEllipse() {
		return (EllipseType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Ellipse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEllipse(EllipseType newEllipse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Ellipse(), newEllipse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEllipse(EllipseType newEllipse) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Ellipse(), newEllipse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shape getShapeGroup() {
		return (Shape)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_ShapeGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShapeGroup(Shape newShapeGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_ShapeGroup(), newShapeGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentType getExperiment() {
		return (ExperimentType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Experiment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperiment(ExperimentType newExperiment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Experiment(), newExperiment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperiment(ExperimentType newExperiment) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Experiment(), newExperiment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimenterType getExperimenter() {
		return (ExperimenterType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Experimenter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimenter(ExperimenterType newExperimenter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Experimenter(), newExperimenter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperimenter(ExperimenterType newExperimenter) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Experimenter(), newExperimenter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimenterGroupType getExperimenterGroup() {
		return (ExperimenterGroupType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_ExperimenterGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimenterGroup(ExperimenterGroupType newExperimenterGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_ExperimenterGroup(), newExperimenterGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperimenterGroup(ExperimenterGroupType newExperimenterGroup) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_ExperimenterGroup(), newExperimenterGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimenterGroupRefType getExperimenterGroupRef() {
		return (ExperimenterGroupRefType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_ExperimenterGroupRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimenterGroupRef(ExperimenterGroupRefType newExperimenterGroupRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_ExperimenterGroupRef(), newExperimenterGroupRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperimenterGroupRef(ExperimenterGroupRefType newExperimenterGroupRef) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_ExperimenterGroupRef(), newExperimenterGroupRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimenterRefType getExperimenterRef() {
		return (ExperimenterRefType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_ExperimenterRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimenterRef(ExperimenterRefType newExperimenterRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_ExperimenterRef(), newExperimenterRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperimenterRef(ExperimenterRefType newExperimenterRef) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_ExperimenterRef(), newExperimenterRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentRefType getExperimentRef() {
		return (ExperimentRefType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_ExperimentRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperimentRef(ExperimentRefType newExperimentRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_ExperimentRef(), newExperimentRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExperimentRef(ExperimentRefType newExperimentRef) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_ExperimentRef(), newExperimentRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalType getExternal() {
		return (ExternalType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_External(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternal(ExternalType newExternal, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_External(), newExternal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternal(ExternalType newExternal) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_External(), newExternal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilamentType getFilament() {
		return (FilamentType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Filament(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilament(FilamentType newFilament, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Filament(), newFilament, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilament(FilamentType newFilament) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Filament(), newFilament);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileAnnotationType getFileAnnotation() {
		return (FileAnnotationType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_FileAnnotation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileAnnotation(FileAnnotationType newFileAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_FileAnnotation(), newFileAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileAnnotation(FileAnnotationType newFileAnnotation) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_FileAnnotation(), newFileAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterType getFilter() {
		return (FilterType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Filter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(FilterType newFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Filter(), newFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilter(FilterType newFilter) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Filter(), newFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterSetType getFilterSet() {
		return (FilterSetType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_FilterSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterSet(FilterSetType newFilterSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_FilterSet(), newFilterSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilterSet(FilterSetType newFilterSet) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_FilterSet(), newFilterSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilterSetRefType getFilterSetRef() {
		return (FilterSetRefType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_FilterSetRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilterSetRef(FilterSetRefType newFilterSetRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_FilterSetRef(), newFilterSetRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilterSetRef(FilterSetRefType newFilterSetRef) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_FilterSetRef(), newFilterSetRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FolderType getFolder() {
		return (FolderType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Folder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFolder(FolderType newFolder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Folder(), newFolder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFolder(FolderType newFolder) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Folder(), newFolder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FolderRefType getFolderRef() {
		return (FolderRefType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_FolderRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFolderRef(FolderRefType newFolderRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_FolderRef(), newFolderRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFolderRef(FolderRefType newFolderRef) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_FolderRef(), newFolderRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericExcitationSourceType getGenericExcitationSource() {
		return (GenericExcitationSourceType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_GenericExcitationSource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericExcitationSource(GenericExcitationSourceType newGenericExcitationSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_GenericExcitationSource(), newGenericExcitationSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenericExcitationSource(GenericExcitationSourceType newGenericExcitationSource) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_GenericExcitationSource(), newGenericExcitationSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageType getImage() {
		return (ImageType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Image(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(ImageType newImage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Image(), newImage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(ImageType newImage) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Image(), newImage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageRefType getImageRef() {
		return (ImageRefType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_ImageRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageRef(ImageRefType newImageRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_ImageRef(), newImageRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageRef(ImageRefType newImageRef) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_ImageRef(), newImageRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImagingEnvironmentType getImagingEnvironment() {
		return (ImagingEnvironmentType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_ImagingEnvironment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagingEnvironment(ImagingEnvironmentType newImagingEnvironment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_ImagingEnvironment(), newImagingEnvironment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImagingEnvironment(ImagingEnvironmentType newImagingEnvironment) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_ImagingEnvironment(), newImagingEnvironment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstrumentType getInstrument() {
		return (InstrumentType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Instrument(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstrument(InstrumentType newInstrument, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Instrument(), newInstrument, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstrument(InstrumentType newInstrument) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Instrument(), newInstrument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstrumentRefType getInstrumentRef() {
		return (InstrumentRefType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_InstrumentRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstrumentRef(InstrumentRefType newInstrumentRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_InstrumentRef(), newInstrumentRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstrumentRef(InstrumentRefType newInstrumentRef) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_InstrumentRef(), newInstrumentRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType getLabel() {
		return (LabelType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Label(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(LabelType newLabel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Label(), newLabel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(LabelType newLabel) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Label(), newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LaserType getLaser() {
		return (LaserType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Laser(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaser(LaserType newLaser, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Laser(), newLaser, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLaser(LaserType newLaser) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Laser(), newLaser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeaderType getLeader() {
		return (LeaderType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Leader(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeader(LeaderType newLeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Leader(), newLeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeader(LeaderType newLeader) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Leader(), newLeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightEmittingDiodeType getLightEmittingDiode() {
		return (LightEmittingDiodeType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_LightEmittingDiode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLightEmittingDiode(LightEmittingDiodeType newLightEmittingDiode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_LightEmittingDiode(), newLightEmittingDiode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLightEmittingDiode(LightEmittingDiodeType newLightEmittingDiode) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_LightEmittingDiode(), newLightEmittingDiode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightPathType getLightPath() {
		return (LightPathType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_LightPath(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLightPath(LightPathType newLightPath, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_LightPath(), newLightPath, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLightPath(LightPathType newLightPath) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_LightPath(), newLightPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LightSourceSettingsType getLightSourceSettings() {
		return (LightSourceSettingsType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_LightSourceSettings(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLightSourceSettings(LightSourceSettingsType newLightSourceSettings, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_LightSourceSettings(), newLightSourceSettings, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLightSourceSettings(LightSourceSettingsType newLightSourceSettings) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_LightSourceSettings(), newLightSourceSettings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineType getLine() {
		return (LineType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Line(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLine(LineType newLine, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Line(), newLine, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine(LineType newLine) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Line(), newLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListAnnotationType getListAnnotation() {
		return (ListAnnotationType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_ListAnnotation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListAnnotation(ListAnnotationType newListAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_ListAnnotation(), newListAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListAnnotation(ListAnnotationType newListAnnotation) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_ListAnnotation(), newListAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LongAnnotationType getLongAnnotation() {
		return (LongAnnotationType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_LongAnnotation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongAnnotation(LongAnnotationType newLongAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_LongAnnotation(), newLongAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongAnnotation(LongAnnotationType newLongAnnotation) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_LongAnnotation(), newLongAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MapAnnotationType getMapAnnotation() {
		return (MapAnnotationType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_MapAnnotation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapAnnotation(MapAnnotationType newMapAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_MapAnnotation(), newMapAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMapAnnotation(MapAnnotationType newMapAnnotation) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_MapAnnotation(), newMapAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaskType getMask() {
		return (MaskType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Mask(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMask(MaskType newMask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Mask(), newMask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMask(MaskType newMask) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Mask(), newMask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getMetadataOnly() {
		return (EObject)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_MetadataOnly(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadataOnly(EObject newMetadataOnly, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_MetadataOnly(), newMetadataOnly, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadataOnly(EObject newMetadataOnly) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_MetadataOnly(), newMetadataOnly);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicrobeamManipulationType getMicrobeamManipulation() {
		return (MicrobeamManipulationType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_MicrobeamManipulation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMicrobeamManipulation(MicrobeamManipulationType newMicrobeamManipulation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_MicrobeamManipulation(), newMicrobeamManipulation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMicrobeamManipulation(MicrobeamManipulationType newMicrobeamManipulation) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_MicrobeamManipulation(), newMicrobeamManipulation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicrobeamManipulationRefType getMicrobeamManipulationRef() {
		return (MicrobeamManipulationRefType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_MicrobeamManipulationRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMicrobeamManipulationRef(MicrobeamManipulationRefType newMicrobeamManipulationRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_MicrobeamManipulationRef(), newMicrobeamManipulationRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMicrobeamManipulationRef(MicrobeamManipulationRefType newMicrobeamManipulationRef) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_MicrobeamManipulationRef(), newMicrobeamManipulationRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicroscopeType getMicroscope() {
		return (MicroscopeType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Microscope(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMicroscope(MicroscopeType newMicroscope, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Microscope(), newMicroscope, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMicroscope(MicroscopeType newMicroscope) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Microscope(), newMicroscope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectiveType getObjective() {
		return (ObjectiveType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Objective(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjective(ObjectiveType newObjective, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Objective(), newObjective, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjective(ObjectiveType newObjective) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Objective(), newObjective);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectiveSettingsType getObjectiveSettings() {
		return (ObjectiveSettingsType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_ObjectiveSettings(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectiveSettings(ObjectiveSettingsType newObjectiveSettings, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_ObjectiveSettings(), newObjectiveSettings, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjectiveSettings(ObjectiveSettingsType newObjectiveSettings) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_ObjectiveSettings(), newObjectiveSettings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OMEType getOME() {
		return (OMEType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_OME(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOME(OMEType newOME, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_OME(), newOME, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOME(OMEType newOME) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_OME(), newOME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PixelsType getPixels() {
		return (PixelsType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Pixels(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPixels(PixelsType newPixels, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Pixels(), newPixels, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPixels(PixelsType newPixels) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Pixels(), newPixels);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlaneType getPlane() {
		return (PlaneType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Plane(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlane(PlaneType newPlane, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Plane(), newPlane, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlane(PlaneType newPlane) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Plane(), newPlane);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlateType getPlate() {
		return (PlateType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Plate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlate(PlateType newPlate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Plate(), newPlate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlate(PlateType newPlate) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Plate(), newPlate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlateAcquisitionType getPlateAcquisition() {
		return (PlateAcquisitionType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_PlateAcquisition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlateAcquisition(PlateAcquisitionType newPlateAcquisition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_PlateAcquisition(), newPlateAcquisition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlateAcquisition(PlateAcquisitionType newPlateAcquisition) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_PlateAcquisition(), newPlateAcquisition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType getPoint() {
		return (PointType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Point(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoint(PointType newPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Point(), newPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoint(PointType newPoint) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Point(), newPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolygonType getPolygon() {
		return (PolygonType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Polygon(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygon(PolygonType newPolygon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Polygon(), newPolygon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolygon(PolygonType newPolygon) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Polygon(), newPolygon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolylineType getPolyline() {
		return (PolylineType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Polyline(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolyline(PolylineType newPolyline, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Polyline(), newPolyline, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolyline(PolylineType newPolyline) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Polyline(), newPolyline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectType getProject() {
		return (ProjectType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Project(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(ProjectType newProject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Project(), newProject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProject(ProjectType newProject) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Project(), newProject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectRefType getProjectRef() {
		return (ProjectRefType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_ProjectRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjectRef(ProjectRefType newProjectRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_ProjectRef(), newProjectRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectRef(ProjectRefType newProjectRef) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_ProjectRef(), newProjectRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PumpType getPump() {
		return (PumpType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Pump(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPump(PumpType newPump, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Pump(), newPump, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPump(PumpType newPump) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Pump(), newPump);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReagentType getReagent() {
		return (ReagentType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Reagent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReagent(ReagentType newReagent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Reagent(), newReagent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReagent(ReagentType newReagent) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Reagent(), newReagent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReagentRefType getReagentRef() {
		return (ReagentRefType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_ReagentRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReagentRef(ReagentRefType newReagentRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_ReagentRef(), newReagentRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReagentRef(ReagentRefType newReagentRef) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_ReagentRef(), newReagentRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RectangleType getRectangle() {
		return (RectangleType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Rectangle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRectangle(RectangleType newRectangle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Rectangle(), newRectangle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRectangle(RectangleType newRectangle) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Rectangle(), newRectangle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RightsType getRights() {
		return (RightsType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Rights(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRights(RightsType newRights, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Rights(), newRights, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRights(RightsType newRights) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Rights(), newRights);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ROIType getROI() {
		return (ROIType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_ROI(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetROI(ROIType newROI, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_ROI(), newROI, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setROI(ROIType newROI) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_ROI(), newROI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ROIRefType getROIRef() {
		return (ROIRefType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_ROIRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetROIRef(ROIRefType newROIRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_ROIRef(), newROIRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setROIRef(ROIRefType newROIRef) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_ROIRef(), newROIRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScreenType getScreen() {
		return (ScreenType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Screen(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScreen(ScreenType newScreen, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Screen(), newScreen, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScreen(ScreenType newScreen) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Screen(), newScreen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StageLabelType getStageLabel() {
		return (StageLabelType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_StageLabel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStageLabel(StageLabelType newStageLabel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_StageLabel(), newStageLabel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStageLabel(StageLabelType newStageLabel) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_StageLabel(), newStageLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructuredAnnotationsType getStructuredAnnotations() {
		return (StructuredAnnotationsType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_StructuredAnnotations(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuredAnnotations(StructuredAnnotationsType newStructuredAnnotations, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_StructuredAnnotations(), newStructuredAnnotations, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStructuredAnnotations(StructuredAnnotationsType newStructuredAnnotations) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_StructuredAnnotations(), newStructuredAnnotations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagAnnotationType getTagAnnotation() {
		return (TagAnnotationType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_TagAnnotation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTagAnnotation(TagAnnotationType newTagAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_TagAnnotation(), newTagAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTagAnnotation(TagAnnotationType newTagAnnotation) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_TagAnnotation(), newTagAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermAnnotationType getTermAnnotation() {
		return (TermAnnotationType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_TermAnnotation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTermAnnotation(TermAnnotationType newTermAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_TermAnnotation(), newTermAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTermAnnotation(TermAnnotationType newTermAnnotation) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_TermAnnotation(), newTermAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TiffDataType getTiffData() {
		return (TiffDataType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_TiffData(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTiffData(TiffDataType newTiffData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_TiffData(), newTiffData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTiffData(TiffDataType newTiffData) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_TiffData(), newTiffData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimestampAnnotationType getTimestampAnnotation() {
		return (TimestampAnnotationType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_TimestampAnnotation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimestampAnnotation(TimestampAnnotationType newTimestampAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_TimestampAnnotation(), newTimestampAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestampAnnotation(TimestampAnnotationType newTimestampAnnotation) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_TimestampAnnotation(), newTimestampAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransmittanceRangeType getTransmittanceRange() {
		return (TransmittanceRangeType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_TransmittanceRange(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransmittanceRange(TransmittanceRangeType newTransmittanceRange, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_TransmittanceRange(), newTransmittanceRange, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransmittanceRange(TransmittanceRangeType newTransmittanceRange) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_TransmittanceRange(), newTransmittanceRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WellType getWell() {
		return (WellType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_Well(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWell(WellType newWell, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_Well(), newWell, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWell(WellType newWell) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_Well(), newWell);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WellSampleType getWellSample() {
		return (WellSampleType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_WellSample(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWellSample(WellSampleType newWellSample, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_WellSample(), newWellSample, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWellSample(WellSampleType newWellSample) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_WellSample(), newWellSample);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WellSampleRefType getWellSampleRef() {
		return (WellSampleRefType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_WellSampleRef(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWellSampleRef(WellSampleRefType newWellSampleRef, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_WellSampleRef(), newWellSampleRef, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWellSampleRef(WellSampleRefType newWellSampleRef) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_WellSampleRef(), newWellSampleRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLAnnotationType getXMLAnnotation() {
		return (XMLAnnotationType)getMixed().get(OMEPackage.eINSTANCE.getDocumentRoot_XMLAnnotation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXMLAnnotation(XMLAnnotationType newXMLAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OMEPackage.eINSTANCE.getDocumentRoot_XMLAnnotation(), newXMLAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXMLAnnotation(XMLAnnotationType newXMLAnnotation) {
		((FeatureMap.Internal)getMixed()).set(OMEPackage.eINSTANCE.getDocumentRoot_XMLAnnotation(), newXMLAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case OMEPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case OMEPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case OMEPackage.DOCUMENT_ROOT__ANNOTATION_REF:
				return basicSetAnnotationRef(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__ARC:
				return basicSetArc(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__LIGHT_SOURCE_GROUP:
				return basicSetLightSourceGroup(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__BINARY_FILE:
				return basicSetBinaryFile(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__BIN_DATA:
				return basicSetBinData(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__BOOLEAN_ANNOTATION:
				return basicSetBooleanAnnotation(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__CHANNEL:
				return basicSetChannel(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__CHANNEL_REF:
				return basicSetChannelRef(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__COMMENT_ANNOTATION:
				return basicSetCommentAnnotation(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__DATASET:
				return basicSetDataset(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__DATASET_REF:
				return basicSetDatasetRef(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__DETECTOR:
				return basicSetDetector(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__DETECTOR_SETTINGS:
				return basicSetDetectorSettings(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__DICHROIC:
				return basicSetDichroic(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__DICHROIC_REF:
				return basicSetDichroicRef(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__DOUBLE_ANNOTATION:
				return basicSetDoubleAnnotation(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__ELLIPSE:
				return basicSetEllipse(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__SHAPE_GROUP:
				return basicSetShapeGroup(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENT:
				return basicSetExperiment(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER:
				return basicSetExperimenter(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER_GROUP:
				return basicSetExperimenterGroup(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER_GROUP_REF:
				return basicSetExperimenterGroupRef(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER_REF:
				return basicSetExperimenterRef(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENT_REF:
				return basicSetExperimentRef(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__EXTERNAL:
				return basicSetExternal(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__FILAMENT:
				return basicSetFilament(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__FILE_ANNOTATION:
				return basicSetFileAnnotation(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__FILTER:
				return basicSetFilter(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__FILTER_SET:
				return basicSetFilterSet(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__FILTER_SET_REF:
				return basicSetFilterSetRef(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__FOLDER:
				return basicSetFolder(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__FOLDER_REF:
				return basicSetFolderRef(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__GENERIC_EXCITATION_SOURCE:
				return basicSetGenericExcitationSource(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__IMAGE:
				return basicSetImage(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__IMAGE_REF:
				return basicSetImageRef(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__IMAGING_ENVIRONMENT:
				return basicSetImagingEnvironment(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__INSTRUMENT:
				return basicSetInstrument(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__INSTRUMENT_REF:
				return basicSetInstrumentRef(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__LABEL:
				return basicSetLabel(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__LASER:
				return basicSetLaser(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__LEADER:
				return basicSetLeader(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__LIGHT_EMITTING_DIODE:
				return basicSetLightEmittingDiode(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__LIGHT_PATH:
				return basicSetLightPath(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__LIGHT_SOURCE_SETTINGS:
				return basicSetLightSourceSettings(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__LINE:
				return basicSetLine(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__LIST_ANNOTATION:
				return basicSetListAnnotation(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__LONG_ANNOTATION:
				return basicSetLongAnnotation(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__MAP_ANNOTATION:
				return basicSetMapAnnotation(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__MASK:
				return basicSetMask(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__METADATA_ONLY:
				return basicSetMetadataOnly(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__MICROBEAM_MANIPULATION:
				return basicSetMicrobeamManipulation(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__MICROBEAM_MANIPULATION_REF:
				return basicSetMicrobeamManipulationRef(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__MICROSCOPE:
				return basicSetMicroscope(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__OBJECTIVE:
				return basicSetObjective(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__OBJECTIVE_SETTINGS:
				return basicSetObjectiveSettings(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__OME:
				return basicSetOME(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__PIXELS:
				return basicSetPixels(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__PLANE:
				return basicSetPlane(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__PLATE:
				return basicSetPlate(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__PLATE_ACQUISITION:
				return basicSetPlateAcquisition(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__POINT:
				return basicSetPoint(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__POLYGON:
				return basicSetPolygon(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__POLYLINE:
				return basicSetPolyline(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__PROJECT:
				return basicSetProject(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__PROJECT_REF:
				return basicSetProjectRef(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__PUMP:
				return basicSetPump(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__REAGENT:
				return basicSetReagent(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__REAGENT_REF:
				return basicSetReagentRef(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__RECTANGLE:
				return basicSetRectangle(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__RIGHTS:
				return basicSetRights(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__ROI:
				return basicSetROI(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__ROI_REF:
				return basicSetROIRef(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__SCREEN:
				return basicSetScreen(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__STAGE_LABEL:
				return basicSetStageLabel(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__STRUCTURED_ANNOTATIONS:
				return basicSetStructuredAnnotations(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__TAG_ANNOTATION:
				return basicSetTagAnnotation(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__TERM_ANNOTATION:
				return basicSetTermAnnotation(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__TIFF_DATA:
				return basicSetTiffData(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__TIMESTAMP_ANNOTATION:
				return basicSetTimestampAnnotation(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__TRANSMITTANCE_RANGE:
				return basicSetTransmittanceRange(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__WELL:
				return basicSetWell(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__WELL_SAMPLE:
				return basicSetWellSample(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__WELL_SAMPLE_REF:
				return basicSetWellSampleRef(null, msgs);
			case OMEPackage.DOCUMENT_ROOT__XML_ANNOTATION:
				return basicSetXMLAnnotation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMEPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case OMEPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case OMEPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case OMEPackage.DOCUMENT_ROOT__ANNOTATION_REF:
				return getAnnotationRef();
			case OMEPackage.DOCUMENT_ROOT__ARC:
				return getArc();
			case OMEPackage.DOCUMENT_ROOT__LIGHT_SOURCE_GROUP:
				return getLightSourceGroup();
			case OMEPackage.DOCUMENT_ROOT__BINARY_FILE:
				return getBinaryFile();
			case OMEPackage.DOCUMENT_ROOT__BIN_DATA:
				return getBinData();
			case OMEPackage.DOCUMENT_ROOT__BOOLEAN_ANNOTATION:
				return getBooleanAnnotation();
			case OMEPackage.DOCUMENT_ROOT__CHANNEL:
				return getChannel();
			case OMEPackage.DOCUMENT_ROOT__CHANNEL_REF:
				return getChannelRef();
			case OMEPackage.DOCUMENT_ROOT__COMMENT_ANNOTATION:
				return getCommentAnnotation();
			case OMEPackage.DOCUMENT_ROOT__DATASET:
				return getDataset();
			case OMEPackage.DOCUMENT_ROOT__DATASET_REF:
				return getDatasetRef();
			case OMEPackage.DOCUMENT_ROOT__DETECTOR:
				return getDetector();
			case OMEPackage.DOCUMENT_ROOT__DETECTOR_SETTINGS:
				return getDetectorSettings();
			case OMEPackage.DOCUMENT_ROOT__DICHROIC:
				return getDichroic();
			case OMEPackage.DOCUMENT_ROOT__DICHROIC_REF:
				return getDichroicRef();
			case OMEPackage.DOCUMENT_ROOT__DOUBLE_ANNOTATION:
				return getDoubleAnnotation();
			case OMEPackage.DOCUMENT_ROOT__ELLIPSE:
				return getEllipse();
			case OMEPackage.DOCUMENT_ROOT__SHAPE_GROUP:
				return getShapeGroup();
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENT:
				return getExperiment();
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER:
				return getExperimenter();
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER_GROUP:
				return getExperimenterGroup();
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER_GROUP_REF:
				return getExperimenterGroupRef();
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER_REF:
				return getExperimenterRef();
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENT_REF:
				return getExperimentRef();
			case OMEPackage.DOCUMENT_ROOT__EXTERNAL:
				return getExternal();
			case OMEPackage.DOCUMENT_ROOT__FILAMENT:
				return getFilament();
			case OMEPackage.DOCUMENT_ROOT__FILE_ANNOTATION:
				return getFileAnnotation();
			case OMEPackage.DOCUMENT_ROOT__FILTER:
				return getFilter();
			case OMEPackage.DOCUMENT_ROOT__FILTER_SET:
				return getFilterSet();
			case OMEPackage.DOCUMENT_ROOT__FILTER_SET_REF:
				return getFilterSetRef();
			case OMEPackage.DOCUMENT_ROOT__FOLDER:
				return getFolder();
			case OMEPackage.DOCUMENT_ROOT__FOLDER_REF:
				return getFolderRef();
			case OMEPackage.DOCUMENT_ROOT__GENERIC_EXCITATION_SOURCE:
				return getGenericExcitationSource();
			case OMEPackage.DOCUMENT_ROOT__IMAGE:
				return getImage();
			case OMEPackage.DOCUMENT_ROOT__IMAGE_REF:
				return getImageRef();
			case OMEPackage.DOCUMENT_ROOT__IMAGING_ENVIRONMENT:
				return getImagingEnvironment();
			case OMEPackage.DOCUMENT_ROOT__INSTRUMENT:
				return getInstrument();
			case OMEPackage.DOCUMENT_ROOT__INSTRUMENT_REF:
				return getInstrumentRef();
			case OMEPackage.DOCUMENT_ROOT__LABEL:
				return getLabel();
			case OMEPackage.DOCUMENT_ROOT__LASER:
				return getLaser();
			case OMEPackage.DOCUMENT_ROOT__LEADER:
				return getLeader();
			case OMEPackage.DOCUMENT_ROOT__LIGHT_EMITTING_DIODE:
				return getLightEmittingDiode();
			case OMEPackage.DOCUMENT_ROOT__LIGHT_PATH:
				return getLightPath();
			case OMEPackage.DOCUMENT_ROOT__LIGHT_SOURCE_SETTINGS:
				return getLightSourceSettings();
			case OMEPackage.DOCUMENT_ROOT__LINE:
				return getLine();
			case OMEPackage.DOCUMENT_ROOT__LIST_ANNOTATION:
				return getListAnnotation();
			case OMEPackage.DOCUMENT_ROOT__LONG_ANNOTATION:
				return getLongAnnotation();
			case OMEPackage.DOCUMENT_ROOT__MAP_ANNOTATION:
				return getMapAnnotation();
			case OMEPackage.DOCUMENT_ROOT__MASK:
				return getMask();
			case OMEPackage.DOCUMENT_ROOT__METADATA_ONLY:
				return getMetadataOnly();
			case OMEPackage.DOCUMENT_ROOT__MICROBEAM_MANIPULATION:
				return getMicrobeamManipulation();
			case OMEPackage.DOCUMENT_ROOT__MICROBEAM_MANIPULATION_REF:
				return getMicrobeamManipulationRef();
			case OMEPackage.DOCUMENT_ROOT__MICROSCOPE:
				return getMicroscope();
			case OMEPackage.DOCUMENT_ROOT__OBJECTIVE:
				return getObjective();
			case OMEPackage.DOCUMENT_ROOT__OBJECTIVE_SETTINGS:
				return getObjectiveSettings();
			case OMEPackage.DOCUMENT_ROOT__OME:
				return getOME();
			case OMEPackage.DOCUMENT_ROOT__PIXELS:
				return getPixels();
			case OMEPackage.DOCUMENT_ROOT__PLANE:
				return getPlane();
			case OMEPackage.DOCUMENT_ROOT__PLATE:
				return getPlate();
			case OMEPackage.DOCUMENT_ROOT__PLATE_ACQUISITION:
				return getPlateAcquisition();
			case OMEPackage.DOCUMENT_ROOT__POINT:
				return getPoint();
			case OMEPackage.DOCUMENT_ROOT__POLYGON:
				return getPolygon();
			case OMEPackage.DOCUMENT_ROOT__POLYLINE:
				return getPolyline();
			case OMEPackage.DOCUMENT_ROOT__PROJECT:
				return getProject();
			case OMEPackage.DOCUMENT_ROOT__PROJECT_REF:
				return getProjectRef();
			case OMEPackage.DOCUMENT_ROOT__PUMP:
				return getPump();
			case OMEPackage.DOCUMENT_ROOT__REAGENT:
				return getReagent();
			case OMEPackage.DOCUMENT_ROOT__REAGENT_REF:
				return getReagentRef();
			case OMEPackage.DOCUMENT_ROOT__RECTANGLE:
				return getRectangle();
			case OMEPackage.DOCUMENT_ROOT__RIGHTS:
				return getRights();
			case OMEPackage.DOCUMENT_ROOT__ROI:
				return getROI();
			case OMEPackage.DOCUMENT_ROOT__ROI_REF:
				return getROIRef();
			case OMEPackage.DOCUMENT_ROOT__SCREEN:
				return getScreen();
			case OMEPackage.DOCUMENT_ROOT__STAGE_LABEL:
				return getStageLabel();
			case OMEPackage.DOCUMENT_ROOT__STRUCTURED_ANNOTATIONS:
				return getStructuredAnnotations();
			case OMEPackage.DOCUMENT_ROOT__TAG_ANNOTATION:
				return getTagAnnotation();
			case OMEPackage.DOCUMENT_ROOT__TERM_ANNOTATION:
				return getTermAnnotation();
			case OMEPackage.DOCUMENT_ROOT__TIFF_DATA:
				return getTiffData();
			case OMEPackage.DOCUMENT_ROOT__TIMESTAMP_ANNOTATION:
				return getTimestampAnnotation();
			case OMEPackage.DOCUMENT_ROOT__TRANSMITTANCE_RANGE:
				return getTransmittanceRange();
			case OMEPackage.DOCUMENT_ROOT__WELL:
				return getWell();
			case OMEPackage.DOCUMENT_ROOT__WELL_SAMPLE:
				return getWellSample();
			case OMEPackage.DOCUMENT_ROOT__WELL_SAMPLE_REF:
				return getWellSampleRef();
			case OMEPackage.DOCUMENT_ROOT__XML_ANNOTATION:
				return getXMLAnnotation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OMEPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__ANNOTATION_REF:
				setAnnotationRef((AnnotationRefType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__ARC:
				setArc((ArcType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__BINARY_FILE:
				setBinaryFile((BinaryFileType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__BIN_DATA:
				setBinData((BinDataType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__BOOLEAN_ANNOTATION:
				setBooleanAnnotation((BooleanAnnotationType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__CHANNEL:
				setChannel((ChannelType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__CHANNEL_REF:
				setChannelRef((ChannelRefType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__COMMENT_ANNOTATION:
				setCommentAnnotation((CommentAnnotationType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__DATASET:
				setDataset((DatasetType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__DATASET_REF:
				setDatasetRef((DatasetRefType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__DETECTOR:
				setDetector((DetectorType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__DETECTOR_SETTINGS:
				setDetectorSettings((DetectorSettingsType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__DICHROIC:
				setDichroic((DichroicType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__DICHROIC_REF:
				setDichroicRef((DichroicRefType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__DOUBLE_ANNOTATION:
				setDoubleAnnotation((DoubleAnnotationType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__ELLIPSE:
				setEllipse((EllipseType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENT:
				setExperiment((ExperimentType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER:
				setExperimenter((ExperimenterType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER_GROUP:
				setExperimenterGroup((ExperimenterGroupType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER_GROUP_REF:
				setExperimenterGroupRef((ExperimenterGroupRefType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER_REF:
				setExperimenterRef((ExperimenterRefType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENT_REF:
				setExperimentRef((ExperimentRefType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__EXTERNAL:
				setExternal((ExternalType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__FILAMENT:
				setFilament((FilamentType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__FILE_ANNOTATION:
				setFileAnnotation((FileAnnotationType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__FILTER:
				setFilter((FilterType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__FILTER_SET:
				setFilterSet((FilterSetType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__FILTER_SET_REF:
				setFilterSetRef((FilterSetRefType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__FOLDER:
				setFolder((FolderType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__FOLDER_REF:
				setFolderRef((FolderRefType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__GENERIC_EXCITATION_SOURCE:
				setGenericExcitationSource((GenericExcitationSourceType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__IMAGE:
				setImage((ImageType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__IMAGE_REF:
				setImageRef((ImageRefType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__IMAGING_ENVIRONMENT:
				setImagingEnvironment((ImagingEnvironmentType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__INSTRUMENT:
				setInstrument((InstrumentType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__INSTRUMENT_REF:
				setInstrumentRef((InstrumentRefType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__LABEL:
				setLabel((LabelType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__LASER:
				setLaser((LaserType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__LEADER:
				setLeader((LeaderType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__LIGHT_EMITTING_DIODE:
				setLightEmittingDiode((LightEmittingDiodeType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__LIGHT_PATH:
				setLightPath((LightPathType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__LIGHT_SOURCE_SETTINGS:
				setLightSourceSettings((LightSourceSettingsType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__LINE:
				setLine((LineType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__LIST_ANNOTATION:
				setListAnnotation((ListAnnotationType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__LONG_ANNOTATION:
				setLongAnnotation((LongAnnotationType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__MAP_ANNOTATION:
				setMapAnnotation((MapAnnotationType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__MASK:
				setMask((MaskType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__METADATA_ONLY:
				setMetadataOnly((EObject)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__MICROBEAM_MANIPULATION:
				setMicrobeamManipulation((MicrobeamManipulationType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__MICROBEAM_MANIPULATION_REF:
				setMicrobeamManipulationRef((MicrobeamManipulationRefType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__MICROSCOPE:
				setMicroscope((MicroscopeType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__OBJECTIVE:
				setObjective((ObjectiveType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__OBJECTIVE_SETTINGS:
				setObjectiveSettings((ObjectiveSettingsType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__OME:
				setOME((OMEType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__PIXELS:
				setPixels((PixelsType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__PLANE:
				setPlane((PlaneType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__PLATE:
				setPlate((PlateType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__PLATE_ACQUISITION:
				setPlateAcquisition((PlateAcquisitionType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__POINT:
				setPoint((PointType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__POLYGON:
				setPolygon((PolygonType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__POLYLINE:
				setPolyline((PolylineType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__PROJECT:
				setProject((ProjectType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__PROJECT_REF:
				setProjectRef((ProjectRefType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__PUMP:
				setPump((PumpType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__REAGENT:
				setReagent((ReagentType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__REAGENT_REF:
				setReagentRef((ReagentRefType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__RECTANGLE:
				setRectangle((RectangleType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__RIGHTS:
				setRights((RightsType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__ROI:
				setROI((ROIType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__ROI_REF:
				setROIRef((ROIRefType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__SCREEN:
				setScreen((ScreenType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__STAGE_LABEL:
				setStageLabel((StageLabelType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__STRUCTURED_ANNOTATIONS:
				setStructuredAnnotations((StructuredAnnotationsType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__TAG_ANNOTATION:
				setTagAnnotation((TagAnnotationType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__TERM_ANNOTATION:
				setTermAnnotation((TermAnnotationType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__TIFF_DATA:
				setTiffData((TiffDataType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__TIMESTAMP_ANNOTATION:
				setTimestampAnnotation((TimestampAnnotationType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__TRANSMITTANCE_RANGE:
				setTransmittanceRange((TransmittanceRangeType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__WELL:
				setWell((WellType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__WELL_SAMPLE:
				setWellSample((WellSampleType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__WELL_SAMPLE_REF:
				setWellSampleRef((WellSampleRefType)newValue);
				return;
			case OMEPackage.DOCUMENT_ROOT__XML_ANNOTATION:
				setXMLAnnotation((XMLAnnotationType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OMEPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case OMEPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case OMEPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case OMEPackage.DOCUMENT_ROOT__ANNOTATION_REF:
				setAnnotationRef((AnnotationRefType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__ARC:
				setArc((ArcType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__BINARY_FILE:
				setBinaryFile((BinaryFileType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__BIN_DATA:
				setBinData((BinDataType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__BOOLEAN_ANNOTATION:
				setBooleanAnnotation((BooleanAnnotationType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__CHANNEL:
				setChannel((ChannelType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__CHANNEL_REF:
				setChannelRef((ChannelRefType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__COMMENT_ANNOTATION:
				setCommentAnnotation((CommentAnnotationType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__DATASET:
				setDataset((DatasetType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__DATASET_REF:
				setDatasetRef((DatasetRefType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__DETECTOR:
				setDetector((DetectorType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__DETECTOR_SETTINGS:
				setDetectorSettings((DetectorSettingsType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__DICHROIC:
				setDichroic((DichroicType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__DICHROIC_REF:
				setDichroicRef((DichroicRefType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__DOUBLE_ANNOTATION:
				setDoubleAnnotation((DoubleAnnotationType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__ELLIPSE:
				setEllipse((EllipseType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENT:
				setExperiment((ExperimentType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER:
				setExperimenter((ExperimenterType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER_GROUP:
				setExperimenterGroup((ExperimenterGroupType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER_GROUP_REF:
				setExperimenterGroupRef((ExperimenterGroupRefType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER_REF:
				setExperimenterRef((ExperimenterRefType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENT_REF:
				setExperimentRef((ExperimentRefType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__EXTERNAL:
				setExternal((ExternalType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__FILAMENT:
				setFilament((FilamentType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__FILE_ANNOTATION:
				setFileAnnotation((FileAnnotationType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__FILTER:
				setFilter((FilterType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__FILTER_SET:
				setFilterSet((FilterSetType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__FILTER_SET_REF:
				setFilterSetRef((FilterSetRefType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__FOLDER:
				setFolder((FolderType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__FOLDER_REF:
				setFolderRef((FolderRefType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__GENERIC_EXCITATION_SOURCE:
				setGenericExcitationSource((GenericExcitationSourceType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__IMAGE:
				setImage((ImageType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__IMAGE_REF:
				setImageRef((ImageRefType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__IMAGING_ENVIRONMENT:
				setImagingEnvironment((ImagingEnvironmentType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__INSTRUMENT:
				setInstrument((InstrumentType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__INSTRUMENT_REF:
				setInstrumentRef((InstrumentRefType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__LABEL:
				setLabel((LabelType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__LASER:
				setLaser((LaserType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__LEADER:
				setLeader((LeaderType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__LIGHT_EMITTING_DIODE:
				setLightEmittingDiode((LightEmittingDiodeType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__LIGHT_PATH:
				setLightPath((LightPathType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__LIGHT_SOURCE_SETTINGS:
				setLightSourceSettings((LightSourceSettingsType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__LINE:
				setLine((LineType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__LIST_ANNOTATION:
				setListAnnotation((ListAnnotationType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__LONG_ANNOTATION:
				setLongAnnotation((LongAnnotationType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__MAP_ANNOTATION:
				setMapAnnotation((MapAnnotationType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__MASK:
				setMask((MaskType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__METADATA_ONLY:
				setMetadataOnly((EObject)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__MICROBEAM_MANIPULATION:
				setMicrobeamManipulation((MicrobeamManipulationType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__MICROBEAM_MANIPULATION_REF:
				setMicrobeamManipulationRef((MicrobeamManipulationRefType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__MICROSCOPE:
				setMicroscope((MicroscopeType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__OBJECTIVE:
				setObjective((ObjectiveType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__OBJECTIVE_SETTINGS:
				setObjectiveSettings((ObjectiveSettingsType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__OME:
				setOME((OMEType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__PIXELS:
				setPixels((PixelsType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__PLANE:
				setPlane((PlaneType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__PLATE:
				setPlate((PlateType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__PLATE_ACQUISITION:
				setPlateAcquisition((PlateAcquisitionType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__POINT:
				setPoint((PointType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__POLYGON:
				setPolygon((PolygonType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__POLYLINE:
				setPolyline((PolylineType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__PROJECT:
				setProject((ProjectType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__PROJECT_REF:
				setProjectRef((ProjectRefType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__PUMP:
				setPump((PumpType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__REAGENT:
				setReagent((ReagentType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__REAGENT_REF:
				setReagentRef((ReagentRefType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__RECTANGLE:
				setRectangle((RectangleType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__RIGHTS:
				setRights((RightsType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__ROI:
				setROI((ROIType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__ROI_REF:
				setROIRef((ROIRefType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__SCREEN:
				setScreen((ScreenType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__STAGE_LABEL:
				setStageLabel((StageLabelType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__STRUCTURED_ANNOTATIONS:
				setStructuredAnnotations((StructuredAnnotationsType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__TAG_ANNOTATION:
				setTagAnnotation((TagAnnotationType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__TERM_ANNOTATION:
				setTermAnnotation((TermAnnotationType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__TIFF_DATA:
				setTiffData((TiffDataType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__TIMESTAMP_ANNOTATION:
				setTimestampAnnotation((TimestampAnnotationType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__TRANSMITTANCE_RANGE:
				setTransmittanceRange((TransmittanceRangeType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__WELL:
				setWell((WellType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__WELL_SAMPLE:
				setWellSample((WellSampleType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__WELL_SAMPLE_REF:
				setWellSampleRef((WellSampleRefType)null);
				return;
			case OMEPackage.DOCUMENT_ROOT__XML_ANNOTATION:
				setXMLAnnotation((XMLAnnotationType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OMEPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case OMEPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case OMEPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case OMEPackage.DOCUMENT_ROOT__ANNOTATION_REF:
				return getAnnotationRef() != null;
			case OMEPackage.DOCUMENT_ROOT__ARC:
				return getArc() != null;
			case OMEPackage.DOCUMENT_ROOT__LIGHT_SOURCE_GROUP:
				return getLightSourceGroup() != null;
			case OMEPackage.DOCUMENT_ROOT__BINARY_FILE:
				return getBinaryFile() != null;
			case OMEPackage.DOCUMENT_ROOT__BIN_DATA:
				return getBinData() != null;
			case OMEPackage.DOCUMENT_ROOT__BOOLEAN_ANNOTATION:
				return getBooleanAnnotation() != null;
			case OMEPackage.DOCUMENT_ROOT__CHANNEL:
				return getChannel() != null;
			case OMEPackage.DOCUMENT_ROOT__CHANNEL_REF:
				return getChannelRef() != null;
			case OMEPackage.DOCUMENT_ROOT__COMMENT_ANNOTATION:
				return getCommentAnnotation() != null;
			case OMEPackage.DOCUMENT_ROOT__DATASET:
				return getDataset() != null;
			case OMEPackage.DOCUMENT_ROOT__DATASET_REF:
				return getDatasetRef() != null;
			case OMEPackage.DOCUMENT_ROOT__DETECTOR:
				return getDetector() != null;
			case OMEPackage.DOCUMENT_ROOT__DETECTOR_SETTINGS:
				return getDetectorSettings() != null;
			case OMEPackage.DOCUMENT_ROOT__DICHROIC:
				return getDichroic() != null;
			case OMEPackage.DOCUMENT_ROOT__DICHROIC_REF:
				return getDichroicRef() != null;
			case OMEPackage.DOCUMENT_ROOT__DOUBLE_ANNOTATION:
				return getDoubleAnnotation() != null;
			case OMEPackage.DOCUMENT_ROOT__ELLIPSE:
				return getEllipse() != null;
			case OMEPackage.DOCUMENT_ROOT__SHAPE_GROUP:
				return getShapeGroup() != null;
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENT:
				return getExperiment() != null;
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER:
				return getExperimenter() != null;
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER_GROUP:
				return getExperimenterGroup() != null;
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER_GROUP_REF:
				return getExperimenterGroupRef() != null;
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENTER_REF:
				return getExperimenterRef() != null;
			case OMEPackage.DOCUMENT_ROOT__EXPERIMENT_REF:
				return getExperimentRef() != null;
			case OMEPackage.DOCUMENT_ROOT__EXTERNAL:
				return getExternal() != null;
			case OMEPackage.DOCUMENT_ROOT__FILAMENT:
				return getFilament() != null;
			case OMEPackage.DOCUMENT_ROOT__FILE_ANNOTATION:
				return getFileAnnotation() != null;
			case OMEPackage.DOCUMENT_ROOT__FILTER:
				return getFilter() != null;
			case OMEPackage.DOCUMENT_ROOT__FILTER_SET:
				return getFilterSet() != null;
			case OMEPackage.DOCUMENT_ROOT__FILTER_SET_REF:
				return getFilterSetRef() != null;
			case OMEPackage.DOCUMENT_ROOT__FOLDER:
				return getFolder() != null;
			case OMEPackage.DOCUMENT_ROOT__FOLDER_REF:
				return getFolderRef() != null;
			case OMEPackage.DOCUMENT_ROOT__GENERIC_EXCITATION_SOURCE:
				return getGenericExcitationSource() != null;
			case OMEPackage.DOCUMENT_ROOT__IMAGE:
				return getImage() != null;
			case OMEPackage.DOCUMENT_ROOT__IMAGE_REF:
				return getImageRef() != null;
			case OMEPackage.DOCUMENT_ROOT__IMAGING_ENVIRONMENT:
				return getImagingEnvironment() != null;
			case OMEPackage.DOCUMENT_ROOT__INSTRUMENT:
				return getInstrument() != null;
			case OMEPackage.DOCUMENT_ROOT__INSTRUMENT_REF:
				return getInstrumentRef() != null;
			case OMEPackage.DOCUMENT_ROOT__LABEL:
				return getLabel() != null;
			case OMEPackage.DOCUMENT_ROOT__LASER:
				return getLaser() != null;
			case OMEPackage.DOCUMENT_ROOT__LEADER:
				return getLeader() != null;
			case OMEPackage.DOCUMENT_ROOT__LIGHT_EMITTING_DIODE:
				return getLightEmittingDiode() != null;
			case OMEPackage.DOCUMENT_ROOT__LIGHT_PATH:
				return getLightPath() != null;
			case OMEPackage.DOCUMENT_ROOT__LIGHT_SOURCE_SETTINGS:
				return getLightSourceSettings() != null;
			case OMEPackage.DOCUMENT_ROOT__LINE:
				return getLine() != null;
			case OMEPackage.DOCUMENT_ROOT__LIST_ANNOTATION:
				return getListAnnotation() != null;
			case OMEPackage.DOCUMENT_ROOT__LONG_ANNOTATION:
				return getLongAnnotation() != null;
			case OMEPackage.DOCUMENT_ROOT__MAP_ANNOTATION:
				return getMapAnnotation() != null;
			case OMEPackage.DOCUMENT_ROOT__MASK:
				return getMask() != null;
			case OMEPackage.DOCUMENT_ROOT__METADATA_ONLY:
				return getMetadataOnly() != null;
			case OMEPackage.DOCUMENT_ROOT__MICROBEAM_MANIPULATION:
				return getMicrobeamManipulation() != null;
			case OMEPackage.DOCUMENT_ROOT__MICROBEAM_MANIPULATION_REF:
				return getMicrobeamManipulationRef() != null;
			case OMEPackage.DOCUMENT_ROOT__MICROSCOPE:
				return getMicroscope() != null;
			case OMEPackage.DOCUMENT_ROOT__OBJECTIVE:
				return getObjective() != null;
			case OMEPackage.DOCUMENT_ROOT__OBJECTIVE_SETTINGS:
				return getObjectiveSettings() != null;
			case OMEPackage.DOCUMENT_ROOT__OME:
				return getOME() != null;
			case OMEPackage.DOCUMENT_ROOT__PIXELS:
				return getPixels() != null;
			case OMEPackage.DOCUMENT_ROOT__PLANE:
				return getPlane() != null;
			case OMEPackage.DOCUMENT_ROOT__PLATE:
				return getPlate() != null;
			case OMEPackage.DOCUMENT_ROOT__PLATE_ACQUISITION:
				return getPlateAcquisition() != null;
			case OMEPackage.DOCUMENT_ROOT__POINT:
				return getPoint() != null;
			case OMEPackage.DOCUMENT_ROOT__POLYGON:
				return getPolygon() != null;
			case OMEPackage.DOCUMENT_ROOT__POLYLINE:
				return getPolyline() != null;
			case OMEPackage.DOCUMENT_ROOT__PROJECT:
				return getProject() != null;
			case OMEPackage.DOCUMENT_ROOT__PROJECT_REF:
				return getProjectRef() != null;
			case OMEPackage.DOCUMENT_ROOT__PUMP:
				return getPump() != null;
			case OMEPackage.DOCUMENT_ROOT__REAGENT:
				return getReagent() != null;
			case OMEPackage.DOCUMENT_ROOT__REAGENT_REF:
				return getReagentRef() != null;
			case OMEPackage.DOCUMENT_ROOT__RECTANGLE:
				return getRectangle() != null;
			case OMEPackage.DOCUMENT_ROOT__RIGHTS:
				return getRights() != null;
			case OMEPackage.DOCUMENT_ROOT__ROI:
				return getROI() != null;
			case OMEPackage.DOCUMENT_ROOT__ROI_REF:
				return getROIRef() != null;
			case OMEPackage.DOCUMENT_ROOT__SCREEN:
				return getScreen() != null;
			case OMEPackage.DOCUMENT_ROOT__STAGE_LABEL:
				return getStageLabel() != null;
			case OMEPackage.DOCUMENT_ROOT__STRUCTURED_ANNOTATIONS:
				return getStructuredAnnotations() != null;
			case OMEPackage.DOCUMENT_ROOT__TAG_ANNOTATION:
				return getTagAnnotation() != null;
			case OMEPackage.DOCUMENT_ROOT__TERM_ANNOTATION:
				return getTermAnnotation() != null;
			case OMEPackage.DOCUMENT_ROOT__TIFF_DATA:
				return getTiffData() != null;
			case OMEPackage.DOCUMENT_ROOT__TIMESTAMP_ANNOTATION:
				return getTimestampAnnotation() != null;
			case OMEPackage.DOCUMENT_ROOT__TRANSMITTANCE_RANGE:
				return getTransmittanceRange() != null;
			case OMEPackage.DOCUMENT_ROOT__WELL:
				return getWell() != null;
			case OMEPackage.DOCUMENT_ROOT__WELL_SAMPLE:
				return getWellSample() != null;
			case OMEPackage.DOCUMENT_ROOT__WELL_SAMPLE_REF:
				return getWellSampleRef() != null;
			case OMEPackage.DOCUMENT_ROOT__XML_ANNOTATION:
				return getXMLAnnotation() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
