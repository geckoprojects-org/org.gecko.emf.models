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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getArc <em>Arc</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getLightSourceGroup <em>Light Source Group</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getBinaryFile <em>Binary File</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getBinData <em>Bin Data</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getBooleanAnnotation <em>Boolean Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getChannelRef <em>Channel Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getCommentAnnotation <em>Comment Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getDatasetRef <em>Dataset Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getDetector <em>Detector</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getDetectorSettings <em>Detector Settings</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getDichroic <em>Dichroic</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getDichroicRef <em>Dichroic Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getDoubleAnnotation <em>Double Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getEllipse <em>Ellipse</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getShapeGroup <em>Shape Group</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getExperiment <em>Experiment</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getExperimenter <em>Experimenter</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getExperimenterGroup <em>Experimenter Group</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getExperimenterGroupRef <em>Experimenter Group Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getExperimenterRef <em>Experimenter Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getExperimentRef <em>Experiment Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getExternal <em>External</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getFilament <em>Filament</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getFileAnnotation <em>File Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getFilterSet <em>Filter Set</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getFilterSetRef <em>Filter Set Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getFolder <em>Folder</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getFolderRef <em>Folder Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getGenericExcitationSource <em>Generic Excitation Source</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getImage <em>Image</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getImageRef <em>Image Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getImagingEnvironment <em>Imaging Environment</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getInstrument <em>Instrument</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getInstrumentRef <em>Instrument Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getLabel <em>Label</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getLaser <em>Laser</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getLeader <em>Leader</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getLightEmittingDiode <em>Light Emitting Diode</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getLightPath <em>Light Path</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getLightSourceSettings <em>Light Source Settings</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getLine <em>Line</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getListAnnotation <em>List Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getLongAnnotation <em>Long Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getMapAnnotation <em>Map Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getMask <em>Mask</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getMetadataOnly <em>Metadata Only</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getMicrobeamManipulation <em>Microbeam Manipulation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getMicrobeamManipulationRef <em>Microbeam Manipulation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getMicroscope <em>Microscope</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getObjectiveSettings <em>Objective Settings</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getOME <em>OME</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getPixels <em>Pixels</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getPlate <em>Plate</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getPlateAcquisition <em>Plate Acquisition</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getPoint <em>Point</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getPolyline <em>Polyline</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getProject <em>Project</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getProjectRef <em>Project Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getPump <em>Pump</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getReagent <em>Reagent</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getReagentRef <em>Reagent Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getRights <em>Rights</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getROI <em>ROI</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getROIRef <em>ROI Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getScreen <em>Screen</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getStageLabel <em>Stage Label</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getStructuredAnnotations <em>Structured Annotations</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getTagAnnotation <em>Tag Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getTermAnnotation <em>Term Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getTiffData <em>Tiff Data</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getTimestampAnnotation <em>Timestamp Annotation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getTransmittanceRange <em>Transmittance Range</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getWell <em>Well</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getWellSample <em>Well Sample</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getWellSampleRef <em>Well Sample Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DocumentRoot#getXMLAnnotation <em>XML Annotation</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Annotation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The AnnotationRef element is a reference to an element derived
	 *         from the CommonAnnotation element.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation Ref</em>' containment reference.
	 * @see #setAnnotationRef(AnnotationRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_AnnotationRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AnnotationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	AnnotationRefType getAnnotationRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getAnnotationRef <em>Annotation Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Ref</em>' containment reference.
	 * @see #getAnnotationRef()
	 * @generated
	 */
	void setAnnotationRef(AnnotationRefType value);

	/**
	 * Returns the value of the '<em><b>Arc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Arc element is used to describe various kinds of Arc lamps - Hg, Xe, HgXe.
	 *         The Power of the Arc is now stored in the LightSource.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arc</em>' containment reference.
	 * @see #setArc(ArcType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Arc()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Arc' namespace='##targetNamespace' affiliation='LightSourceGroup'"
	 * @generated
	 */
	ArcType getArc();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getArc <em>Arc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arc</em>' containment reference.
	 * @see #getArc()
	 * @generated
	 */
	void setArc(ArcType value);

	/**
	 * Returns the value of the '<em><b>Light Source Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Source Group</em>' containment reference.
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_LightSourceGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LightSourceGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	LightSource getLightSourceGroup();

	/**
	 * Returns the value of the '<em><b>Binary File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes a binary file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary File</em>' containment reference.
	 * @see #setBinaryFile(BinaryFileType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_BinaryFile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BinaryFile' namespace='##targetNamespace'"
	 * @generated
	 */
	BinaryFileType getBinaryFile();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getBinaryFile <em>Binary File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary File</em>' containment reference.
	 * @see #getBinaryFile()
	 * @generated
	 */
	void setBinaryFile(BinaryFileType value);

	/**
	 * Returns the value of the '<em><b>Bin Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contents of this element are base64-encoded.  These are not CDATA sections, just a base64 stream.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bin Data</em>' containment reference.
	 * @see #setBinData(BinDataType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_BinData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BinData' namespace='##targetNamespace'"
	 * @generated
	 */
	BinDataType getBinData();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getBinData <em>Bin Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bin Data</em>' containment reference.
	 * @see #getBinData()
	 * @generated
	 */
	void setBinData(BinDataType value);

	/**
	 * Returns the value of the '<em><b>Boolean Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A simple boolean annotation of type xsd:boolean
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boolean Annotation</em>' containment reference.
	 * @see #setBooleanAnnotation(BooleanAnnotationType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_BooleanAnnotation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BooleanAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanAnnotationType getBooleanAnnotation();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getBooleanAnnotation <em>Boolean Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Annotation</em>' containment reference.
	 * @see #getBooleanAnnotation()
	 * @generated
	 */
	void setBooleanAnnotation(BooleanAnnotationType value);

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         There must be one per channel in the Image, even for a single-plane image.
	 *         And information about how each of them was acquired is stored in the various optional *Ref elements.  Each Logical Channel is composed of one or more
	 *         ChannelComponents.  For example, an entire spectrum in an FTIR experiment may be stored in a single Logical Channel with each discrete wavenumber of the spectrum
	 *         constituting a ChannelComponent of the FTIR Logical Channel.  An RGB image where the Red, Green and Blue components do not reflect discrete probes but are
	 *         instead the output of a color camera would be treated similarly - one Logical channel with three ChannelComponents in this case.
	 *         The total number of ChannelComponents for a set of pixels must equal SizeC.
	 *         The IlluminationType attribute is a string enumeration which may be set to 'Transmitted', 'Epifluorescence', 'Oblique', or 'NonLinear'.
	 *         The user interface logic for labeling a given channel for the user should use the first existing attribute in the following sequence:
	 *         Name -> Fluor -> EmissionWavelength -> ChannelComponent/Index.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channel</em>' containment reference.
	 * @see #setChannel(ChannelType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Channel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Channel' namespace='##targetNamespace'"
	 * @generated
	 */
	ChannelType getChannel();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getChannel <em>Channel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' containment reference.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(ChannelType value);

	/**
	 * Returns the value of the '<em><b>Channel Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Ref</em>' containment reference.
	 * @see #setChannelRef(ChannelRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_ChannelRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ChannelRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ChannelRefType getChannelRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getChannelRef <em>Channel Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Ref</em>' containment reference.
	 * @see #getChannelRef()
	 * @generated
	 */
	void setChannelRef(ChannelRefType value);

	/**
	 * Returns the value of the '<em><b>Comment Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A simple comment annotation
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment Annotation</em>' containment reference.
	 * @see #setCommentAnnotation(CommentAnnotationType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_CommentAnnotation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CommentAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	CommentAnnotationType getCommentAnnotation();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getCommentAnnotation <em>Comment Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment Annotation</em>' containment reference.
	 * @see #getCommentAnnotation()
	 * @generated
	 */
	void setCommentAnnotation(CommentAnnotationType value);

	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         An element specifying a collection of images that are always processed together.
	 *         Images can belong to more than one Dataset, and a Dataset may contain more than one Image.
	 *         Images contain one or more DatasetRef elements to specify what datasets they belong to.
	 *         Once a Dataset has been processed in any way, its collection of images cannot be altered.
	 *         The ExperimenterRef and ExperimenterGroupRef elements specify the person and group this Dataset belongs to.
	 *         Projects may contain one or more Datasets, and Datasets may belong to one or more Projects.
	 *         This relationship is specified by listing DatasetRef elements within the Project element.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dataset</em>' containment reference.
	 * @see #setDataset(DatasetType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Dataset()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Dataset' namespace='##targetNamespace'"
	 * @generated
	 */
	DatasetType getDataset();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getDataset <em>Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset</em>' containment reference.
	 * @see #getDataset()
	 * @generated
	 */
	void setDataset(DatasetType value);

	/**
	 * Returns the value of the '<em><b>Dataset Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The DatasetRef element refers to a Dataset by specifying the Dataset ID attribute.
	 *         One or more DatasetRef elements may be listed within the Image element to specify what Datasets
	 *         the Image belongs to.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dataset Ref</em>' containment reference.
	 * @see #setDatasetRef(DatasetRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_DatasetRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DatasetRef' namespace='##targetNamespace'"
	 * @generated
	 */
	DatasetRefType getDatasetRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getDatasetRef <em>Dataset Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset Ref</em>' containment reference.
	 * @see #getDatasetRef()
	 * @generated
	 */
	void setDatasetRef(DatasetRefType value);

	/**
	 * Returns the value of the '<em><b>Detector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The type of detector used to capture the image.
	 *         The Detector ID can be used as a reference within the Channel element in the Image element.
	 *         The values stored in Detector represent the fixed values,
	 *         variable values modified during the acquisition go in DetectorSettings
	 * 
	 *         Each attribute now has an indication of what type of detector
	 *         it applies to. This is preparatory work for cleaning up and
	 *         possibly splitting this object into sub-types.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detector</em>' containment reference.
	 * @see #setDetector(DetectorType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Detector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Detector' namespace='##targetNamespace'"
	 * @generated
	 */
	DetectorType getDetector();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getDetector <em>Detector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detector</em>' containment reference.
	 * @see #getDetector()
	 * @generated
	 */
	void setDetector(DetectorType value);

	/**
	 * Returns the value of the '<em><b>Detector Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This holds the setting applied to a detector as well as a
	 *         reference to the detector.
	 *         The ID is the detector used in this case.
	 *         The values stored in DetectorSettings represent the variable values,
	 *         fixed values not modified during the acquisition go in Detector.
	 * 
	 *         Each attribute now has an indication of what type of detector
	 *         it applies to. This is preparatory work for cleaning up and
	 *         possibly splitting this object into sub-types.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detector Settings</em>' containment reference.
	 * @see #setDetectorSettings(DetectorSettingsType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_DetectorSettings()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DetectorSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	DetectorSettingsType getDetectorSettings();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getDetectorSettings <em>Detector Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detector Settings</em>' containment reference.
	 * @see #getDetectorSettings()
	 * @generated
	 */
	void setDetectorSettings(DetectorSettingsType value);

	/**
	 * Returns the value of the '<em><b>Dichroic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The dichromatic beamsplitter or dichroic mirror used for this filter combination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dichroic</em>' containment reference.
	 * @see #setDichroic(DichroicType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Dichroic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Dichroic' namespace='##targetNamespace'"
	 * @generated
	 */
	DichroicType getDichroic();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getDichroic <em>Dichroic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dichroic</em>' containment reference.
	 * @see #getDichroic()
	 * @generated
	 */
	void setDichroic(DichroicType value);

	/**
	 * Returns the value of the '<em><b>Dichroic Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dichroic Ref</em>' containment reference.
	 * @see #setDichroicRef(DichroicRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_DichroicRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DichroicRef' namespace='##targetNamespace'"
	 * @generated
	 */
	DichroicRefType getDichroicRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getDichroicRef <em>Dichroic Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dichroic Ref</em>' containment reference.
	 * @see #getDichroicRef()
	 * @generated
	 */
	void setDichroicRef(DichroicRefType value);

	/**
	 * Returns the value of the '<em><b>Double Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A simple numerical annotation of type xsd:double
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Double Annotation</em>' containment reference.
	 * @see #setDoubleAnnotation(DoubleAnnotationType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_DoubleAnnotation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DoubleAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleAnnotationType getDoubleAnnotation();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getDoubleAnnotation <em>Double Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double Annotation</em>' containment reference.
	 * @see #getDoubleAnnotation()
	 * @generated
	 */
	void setDoubleAnnotation(DoubleAnnotationType value);

	/**
	 * Returns the value of the '<em><b>Ellipse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A simple ellipse object. If rotation is required apply a
	 *         transformation at the Shape level.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ellipse</em>' containment reference.
	 * @see #setEllipse(EllipseType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Ellipse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Ellipse' namespace='##targetNamespace' affiliation='ShapeGroup'"
	 * @generated
	 */
	EllipseType getEllipse();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getEllipse <em>Ellipse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipse</em>' containment reference.
	 * @see #getEllipse()
	 * @generated
	 */
	void setEllipse(EllipseType value);

	/**
	 * Returns the value of the '<em><b>Shape Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Group</em>' containment reference.
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_ShapeGroup()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ShapeGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	Shape getShapeGroup();

	/**
	 * Returns the value of the '<em><b>Experiment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This element describes the type of experiment.  The required Type attribute must contain one or more entries from the following list:
	 *         FP FRET Time-lapse 4-D+ Screen Immunocytochemistry FISH Electrophysiology  Ion-Imaging Colocalization PGI/Documentation
	 *         FRAP Photoablation Optical-Trapping Photoactivation Fluorescence-Lifetime Spectral-Imaging Other
	 *         FP refers to fluorescent proteins, PGI/Documentation is not a 'data' image.
	 *         The optional Description element may contain free text to further describe the experiment.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experiment</em>' containment reference.
	 * @see #setExperiment(ExperimentType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Experiment()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Experiment' namespace='##targetNamespace'"
	 * @generated
	 */
	ExperimentType getExperiment();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getExperiment <em>Experiment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experiment</em>' containment reference.
	 * @see #getExperiment()
	 * @generated
	 */
	void setExperiment(ExperimentType value);

	/**
	 * Returns the value of the '<em><b>Experimenter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This element describes a person who performed an imaging experiment.
	 *         This person may also be a user of the OME system, in which case the UserName element contains their login name.
	 *         Experimenters may belong to one or more groups which are specified using one or more ExperimenterGroupRef elements.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimenter</em>' containment reference.
	 * @see #setExperimenter(ExperimenterType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Experimenter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Experimenter' namespace='##targetNamespace'"
	 * @generated
	 */
	ExperimenterType getExperimenter();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getExperimenter <em>Experimenter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimenter</em>' containment reference.
	 * @see #getExperimenter()
	 * @generated
	 */
	void setExperimenter(ExperimenterType value);

	/**
	 * Returns the value of the '<em><b>Experimenter Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The ExperimenterGroupID is required.
	 *         Information should ideally be specified for at least one Leader as a contact for the group.
	 *         The Leaders are themselves Experimenters.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimenter Group</em>' containment reference.
	 * @see #setExperimenterGroup(ExperimenterGroupType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_ExperimenterGroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExperimenterGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	ExperimenterGroupType getExperimenterGroup();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getExperimenterGroup <em>Experimenter Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimenter Group</em>' containment reference.
	 * @see #getExperimenterGroup()
	 * @generated
	 */
	void setExperimenterGroup(ExperimenterGroupType value);

	/**
	 * Returns the value of the '<em><b>Experimenter Group Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This empty element has a reference (the ExperimenterGroup ID attribute) to a ExperimenterGroup defined within OME.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimenter Group Ref</em>' containment reference.
	 * @see #setExperimenterGroupRef(ExperimenterGroupRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_ExperimenterGroupRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExperimenterGroupRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ExperimenterGroupRefType getExperimenterGroupRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getExperimenterGroupRef <em>Experimenter Group Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimenter Group Ref</em>' containment reference.
	 * @see #getExperimenterGroupRef()
	 * @generated
	 */
	void setExperimenterGroupRef(ExperimenterGroupRefType value);

	/**
	 * Returns the value of the '<em><b>Experimenter Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This empty element has a required Experimenter ID and an optional DocumentID attribute which refers to one of the Experimenters defined within OME.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimenter Ref</em>' containment reference.
	 * @see #setExperimenterRef(ExperimenterRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_ExperimenterRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExperimenterRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ExperimenterRefType getExperimenterRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getExperimenterRef <em>Experimenter Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimenter Ref</em>' containment reference.
	 * @see #getExperimenterRef()
	 * @generated
	 */
	void setExperimenterRef(ExperimenterRefType value);

	/**
	 * Returns the value of the '<em><b>Experiment Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiment Ref</em>' containment reference.
	 * @see #setExperimentRef(ExperimentRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_ExperimentRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExperimentRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ExperimentRefType getExperimentRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getExperimentRef <em>Experiment Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experiment Ref</em>' containment reference.
	 * @see #getExperimentRef()
	 * @generated
	 */
	void setExperimentRef(ExperimentRefType value);

	/**
	 * Returns the value of the '<em><b>External</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes a file location.  Can optionally specify a portion of a file using Offset and a ReadLength.
	 *       If Offset and ReadLength are specified in conjuction with Compression, then they point into the uncompressed file.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External</em>' containment reference.
	 * @see #setExternal(ExternalType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_External()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='External' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalType getExternal();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getExternal <em>External</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External</em>' containment reference.
	 * @see #getExternal()
	 * @generated
	 */
	void setExternal(ExternalType value);

	/**
	 * Returns the value of the '<em><b>Filament</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Filament element is used to describe various kinds of filament bulbs such as Incadescent or Halogen.
	 *         The Power of the Filament is now stored in the LightSource.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filament</em>' containment reference.
	 * @see #setFilament(FilamentType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Filament()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Filament' namespace='##targetNamespace' affiliation='LightSourceGroup'"
	 * @generated
	 */
	FilamentType getFilament();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getFilament <em>Filament</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filament</em>' containment reference.
	 * @see #getFilament()
	 * @generated
	 */
	void setFilament(FilamentType value);

	/**
	 * Returns the value of the '<em><b>File Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A file object annotation
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Annotation</em>' containment reference.
	 * @see #setFileAnnotation(FileAnnotationType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_FileAnnotation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FileAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	FileAnnotationType getFileAnnotation();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getFileAnnotation <em>File Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Annotation</em>' containment reference.
	 * @see #getFileAnnotation()
	 * @generated
	 */
	void setFileAnnotation(FileAnnotationType value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A filter is either an excitation or emission filters.
	 *         There should be one filter element specified per wavelength in the image.
	 *         The channel number associated with a filter set is specified in Channel.
	 *         It is based on the FilterSpec type, so has the required attributes Manufacturer, Model, and LotNumber.
	 *         It may also contain a Type attribute which may be set to
	 *         'LongPass', 'ShortPass', 'BandPass', 'MultiPass',
	 *         'Dichroic', 'NeutralDensity', 'Tuneable' or 'Other'.
	 *         It can be associated with an optional FilterWheel - Note: this is not the same as a FilterSet
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(FilterType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Filter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Filter' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterType getFilter();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterType value);

	/**
	 * Returns the value of the '<em><b>Filter Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Filter set manufacturer specification
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Set</em>' containment reference.
	 * @see #setFilterSet(FilterSetType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_FilterSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FilterSet' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterSetType getFilterSet();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getFilterSet <em>Filter Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Set</em>' containment reference.
	 * @see #getFilterSet()
	 * @generated
	 */
	void setFilterSet(FilterSetType value);

	/**
	 * Returns the value of the '<em><b>Filter Set Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Set Ref</em>' containment reference.
	 * @see #setFilterSetRef(FilterSetRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_FilterSetRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FilterSetRef' namespace='##targetNamespace'"
	 * @generated
	 */
	FilterSetRefType getFilterSetRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getFilterSetRef <em>Filter Set Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Set Ref</em>' containment reference.
	 * @see #getFilterSetRef()
	 * @generated
	 */
	void setFilterSetRef(FilterSetRefType value);

	/**
	 * Returns the value of the '<em><b>Folder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         An element specifying a possibly heterogeneous collection of data.
	 *         Folders may contain Folders so that data may be organized within a tree of Folders.
	 *         Data may be in multiple Folders but a Folder may not be in more than one other Folder.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Folder</em>' containment reference.
	 * @see #setFolder(FolderType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Folder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Folder' namespace='##targetNamespace'"
	 * @generated
	 */
	FolderType getFolder();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getFolder <em>Folder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' containment reference.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(FolderType value);

	/**
	 * Returns the value of the '<em><b>Folder Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The FolderRef element refers to a Folder by specifying the Folder ID attribute.
	 *         One or more FolderRef elements may be listed within the Folder element to specify what Folders
	 *         the Folder contains. This tree hierarchy must be acyclic.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Folder Ref</em>' containment reference.
	 * @see #setFolderRef(FolderRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_FolderRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FolderRef' namespace='##targetNamespace'"
	 * @generated
	 */
	FolderRefType getFolderRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getFolderRef <em>Folder Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder Ref</em>' containment reference.
	 * @see #getFolderRef()
	 * @generated
	 */
	void setFolderRef(FolderRefType value);

	/**
	 * Returns the value of the '<em><b>Generic Excitation Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The GenericExcitationSource element is used to represent
	 *         a source as a collection of key/value pairs, stored
	 *         in a Map. The other lightsource objects should
	 *         always be used in preference to this if possible.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generic Excitation Source</em>' containment reference.
	 * @see #setGenericExcitationSource(GenericExcitationSourceType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_GenericExcitationSource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GenericExcitationSource' namespace='##targetNamespace' affiliation='LightSourceGroup'"
	 * @generated
	 */
	GenericExcitationSourceType getGenericExcitationSource();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getGenericExcitationSource <em>Generic Excitation Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Excitation Source</em>' containment reference.
	 * @see #getGenericExcitationSource()
	 * @generated
	 */
	void setGenericExcitationSource(GenericExcitationSourceType value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This element describes the actual image and its meta-data.
	 *         The elements that are references (ending in Ref or Settings) refer to
	 *         elements defined outside of the Image element. Ref elements are simple
	 *         links, while Settings elements are links with additional values.
	 * 
	 *         If any of the required Image attributes or elements are missing, its
	 *         guaranteed to be an invalid document. The required attributes and
	 *         elements are ID and Pixels.
	 * 
	 *         ExperimenterRef is required for all Images with well formed LSIDs.
	 *         ImageType is a vendor-specific designation of the type of image this is.
	 *         Examples of ImageType include 'STK', 'SoftWorx', etc.
	 *         The Name attributes are in all cases the name of the element
	 *         instance. In this case, the name of the image, not necessarily the filename.
	 *         Physical size of pixels are microns[µm].
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(ImageType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Image()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Image' namespace='##targetNamespace'"
	 * @generated
	 */
	ImageType getImage();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(ImageType value);

	/**
	 * Returns the value of the '<em><b>Image Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The ImageRef element is a reference to an Image element.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Ref</em>' containment reference.
	 * @see #setImageRef(ImageRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_ImageRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImageRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ImageRefType getImageRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getImageRef <em>Image Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Ref</em>' containment reference.
	 * @see #getImageRef()
	 * @generated
	 */
	void setImageRef(ImageRefType value);

	/**
	 * Returns the value of the '<em><b>Imaging Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This describes the environment that the biological sample was in
	 *         during the experiment.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imaging Environment</em>' containment reference.
	 * @see #setImagingEnvironment(ImagingEnvironmentType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_ImagingEnvironment()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImagingEnvironment' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagingEnvironmentType getImagingEnvironment();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getImagingEnvironment <em>Imaging Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imaging Environment</em>' containment reference.
	 * @see #getImagingEnvironment()
	 * @generated
	 */
	void setImagingEnvironment(ImagingEnvironmentType value);

	/**
	 * Returns the value of the '<em><b>Instrument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This element describes the instrument used to capture the Image.
	 *         It is primarily a container for manufacturer's model and catalog
	 *         numbers for the Microscope, LightSource, Detector, Objective and
	 *         Filters components.
	 *         The Objective element contains the additional elements LensNA and Magnification.
	 *         The Filters element can be composed either of separate excitation,
	 *         emission filters and a dichroic mirror or a single filter set.
	 *         Within the Image itself, a reference is made to this one Filter element.
	 *         There may be multiple light sources, detectors, objectives and filters on a microscope.
	 *         Each of these has their own ID attribute, which can be referred to from Channel.
	 *         It is understood that the light path configuration can be different
	 *         for each channel, but cannot be different for each timepoint or
	 *         each plane of an XYZ stack.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instrument</em>' containment reference.
	 * @see #setInstrument(InstrumentType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Instrument()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Instrument' namespace='##targetNamespace'"
	 * @generated
	 */
	InstrumentType getInstrument();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getInstrument <em>Instrument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instrument</em>' containment reference.
	 * @see #getInstrument()
	 * @generated
	 */
	void setInstrument(InstrumentType value);

	/**
	 * Returns the value of the '<em><b>Instrument Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This empty element can be used (via the required Instrument ID attribute) to refer to an Instrument defined within OME.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instrument Ref</em>' containment reference.
	 * @see #setInstrumentRef(InstrumentRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_InstrumentRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InstrumentRef' namespace='##targetNamespace'"
	 * @generated
	 */
	InstrumentRefType getInstrumentRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getInstrumentRef <em>Instrument Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instrument Ref</em>' containment reference.
	 * @see #getInstrumentRef()
	 * @generated
	 */
	void setInstrumentRef(InstrumentRefType value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The text label. Any transformation should be applied at the
	 *         shape level.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(LabelType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Label()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Label' namespace='##targetNamespace' affiliation='ShapeGroup'"
	 * @generated
	 */
	LabelType getLabel();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(LabelType value);

	/**
	 * Returns the value of the '<em><b>Laser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Laser types are specified using two attributes - the Type and the LaserMedium.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Laser</em>' containment reference.
	 * @see #setLaser(LaserType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Laser()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Laser' namespace='##targetNamespace' affiliation='LightSourceGroup'"
	 * @generated
	 */
	LaserType getLaser();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getLaser <em>Laser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laser</em>' containment reference.
	 * @see #getLaser()
	 * @generated
	 */
	void setLaser(LaserType value);

	/**
	 * Returns the value of the '<em><b>Leader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Contact information for a ExperimenterGroup leader specified using a reference
	 *         to an Experimenter element defined elsewhere in the document.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leader</em>' containment reference.
	 * @see #setLeader(LeaderType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Leader()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Leader' namespace='##targetNamespace'"
	 * @generated
	 */
	LeaderType getLeader();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getLeader <em>Leader</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader</em>' containment reference.
	 * @see #getLeader()
	 * @generated
	 */
	void setLeader(LeaderType value);

	/**
	 * Returns the value of the '<em><b>Light Emitting Diode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The LightEmittingDiode element is used to describe
	 *         various kinds of LED lamps.
	 * 
	 *         As the LightEmittingDiode is inside a LightSource it already has
	 *         available the values from ManufacturerSpec
	 *         (Manufacturer, Model, SerialNumber, LotNumber)
	 *         And the values from LightSource which includes Power in milliwatts
	 * 
	 *         We have looked at extending this element but have had a problem
	 *         producing a generic solution.
	 * 
	 *         Possible attributes talked about adding include:
	 *         Power in lumens - but this is complicated by multi-channel
	 *         devices like CoolLED where each channel's power is different
	 *         Wavelength Range - not a simple value so would require
	 *         multiple attributes or a child element
	 *         Angle of Projection - this would be further affected by the
	 *         optics used for filtering the naked LED or that combine
	 *         power from multiple devices
	 * 
	 *         These values are further affected if you over-drive the LED
	 *         resulting in a more complex system
	 * 
	 *         Another issue is that LED's may not be used directly for
	 *         illumination but as drivers for secondary emissions from doped
	 *         fiber optics. This would require the fiber optics to be modeled.
	 * 
	 *         Thanks to Paul Goodwin of Applied Precision of information about
	 *         this topic.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Light Emitting Diode</em>' containment reference.
	 * @see #setLightEmittingDiode(LightEmittingDiodeType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_LightEmittingDiode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LightEmittingDiode' namespace='##targetNamespace' affiliation='LightSourceGroup'"
	 * @generated
	 */
	LightEmittingDiodeType getLightEmittingDiode();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getLightEmittingDiode <em>Light Emitting Diode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Emitting Diode</em>' containment reference.
	 * @see #getLightEmittingDiode()
	 * @generated
	 */
	void setLightEmittingDiode(LightEmittingDiodeType value);

	/**
	 * Returns the value of the '<em><b>Light Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the light path
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Light Path</em>' containment reference.
	 * @see #setLightPath(LightPathType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_LightPath()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LightPath' namespace='##targetNamespace'"
	 * @generated
	 */
	LightPathType getLightPath();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getLightPath <em>Light Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Path</em>' containment reference.
	 * @see #getLightPath()
	 * @generated
	 */
	void setLightPath(LightPathType value);

	/**
	 * Returns the value of the '<em><b>Light Source Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Source Settings</em>' containment reference.
	 * @see #setLightSourceSettings(LightSourceSettingsType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_LightSourceSettings()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LightSourceSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	LightSourceSettingsType getLightSourceSettings();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getLightSourceSettings <em>Light Source Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Source Settings</em>' containment reference.
	 * @see #getLightSourceSettings()
	 * @generated
	 */
	void setLightSourceSettings(LightSourceSettingsType value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A straight line defined by it's end points.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line</em>' containment reference.
	 * @see #setLine(LineType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Line()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Line' namespace='##targetNamespace' affiliation='ShapeGroup'"
	 * @generated
	 */
	LineType getLine();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getLine <em>Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' containment reference.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(LineType value);

	/**
	 * Returns the value of the '<em><b>List Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This annotation is a grouping object. It uses the sequence of
	 *         annotation refs from the base Annotation to form the list.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List Annotation</em>' containment reference.
	 * @see #setListAnnotation(ListAnnotationType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_ListAnnotation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	ListAnnotationType getListAnnotation();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getListAnnotation <em>List Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Annotation</em>' containment reference.
	 * @see #getListAnnotation()
	 * @generated
	 */
	void setListAnnotation(ListAnnotationType value);

	/**
	 * Returns the value of the '<em><b>Long Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A simple numerical annotation of type xsd:long
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Long Annotation</em>' containment reference.
	 * @see #setLongAnnotation(LongAnnotationType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_LongAnnotation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LongAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	LongAnnotationType getLongAnnotation();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getLongAnnotation <em>Long Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Annotation</em>' containment reference.
	 * @see #getLongAnnotation()
	 * @generated
	 */
	void setLongAnnotation(LongAnnotationType value);

	/**
	 * Returns the value of the '<em><b>Map Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         An map annotation. The contents of this is a list of key/value pairs.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Annotation</em>' containment reference.
	 * @see #setMapAnnotation(MapAnnotationType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_MapAnnotation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MapAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	MapAnnotationType getMapAnnotation();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getMapAnnotation <em>Map Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Annotation</em>' containment reference.
	 * @see #getMapAnnotation()
	 * @generated
	 */
	void setMapAnnotation(MapAnnotationType value);

	/**
	 * Returns the value of the '<em><b>Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Mask ROI shape is a link to a BinData object that is
	 *         a BIT mask drawn on top of the image as an ROI. It is applied
	 *         at the same scale, pixel to pixel, as the Image the ROI is
	 *         applied to, unless a transform is applied at the shape level.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mask</em>' containment reference.
	 * @see #setMask(MaskType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Mask()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Mask' namespace='##targetNamespace' affiliation='ShapeGroup'"
	 * @generated
	 */
	MaskType getMask();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getMask <em>Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' containment reference.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(MaskType value);

	/**
	 * Returns the value of the '<em><b>Metadata Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This place holder means there is on pixel data in this file.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata Only</em>' containment reference.
	 * @see #setMetadataOnly(EObject)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_MetadataOnly()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MetadataOnly' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getMetadataOnly();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getMetadataOnly <em>Metadata Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Only</em>' containment reference.
	 * @see #getMetadataOnly()
	 * @generated
	 */
	void setMetadataOnly(EObject value);

	/**
	 * Returns the value of the '<em><b>Microbeam Manipulation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Defines a microbeam operation type and the region of the image it was applied to.
	 *         The LightSourceRef element is a reference to a LightSource specified in the Instrument element which was used for a technique other than illumination for
	 *         the purpose of imaging. For example, a laser used for photobleaching.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Microbeam Manipulation</em>' containment reference.
	 * @see #setMicrobeamManipulation(MicrobeamManipulationType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_MicrobeamManipulation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MicrobeamManipulation' namespace='##targetNamespace'"
	 * @generated
	 */
	MicrobeamManipulationType getMicrobeamManipulation();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getMicrobeamManipulation <em>Microbeam Manipulation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microbeam Manipulation</em>' containment reference.
	 * @see #getMicrobeamManipulation()
	 * @generated
	 */
	void setMicrobeamManipulation(MicrobeamManipulationType value);

	/**
	 * Returns the value of the '<em><b>Microbeam Manipulation Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microbeam Manipulation Ref</em>' containment reference.
	 * @see #setMicrobeamManipulationRef(MicrobeamManipulationRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_MicrobeamManipulationRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MicrobeamManipulationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	MicrobeamManipulationRefType getMicrobeamManipulationRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getMicrobeamManipulationRef <em>Microbeam Manipulation Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microbeam Manipulation Ref</em>' containment reference.
	 * @see #getMicrobeamManipulationRef()
	 * @generated
	 */
	void setMicrobeamManipulationRef(MicrobeamManipulationRefType value);

	/**
	 * Returns the value of the '<em><b>Microscope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The microscope's manufacturer specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Microscope</em>' containment reference.
	 * @see #setMicroscope(MicroscopeType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Microscope()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Microscope' namespace='##targetNamespace'"
	 * @generated
	 */
	MicroscopeType getMicroscope();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getMicroscope <em>Microscope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microscope</em>' containment reference.
	 * @see #getMicroscope()
	 * @generated
	 */
	void setMicroscope(MicroscopeType value);

	/**
	 * Returns the value of the '<em><b>Objective</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A description of the microscope's objective lens.
	 *         Required elements include the lens numerical aperture,
	 *         and the magnification, both of which a floating
	 *         point (real) numbers.
	 *         The values are those that are fixed for a particular
	 *         objective: either because it has been manufactured to
	 *         this specification or the value has been measured on
	 *         this particular objective.
	 *         Correction: This is the type of correction coating applied to this lens.
	 *         Immersion: This is the types of immersion medium the lens is designed to
	 *         work with. It is not the same as 'Medium' in ObjectiveRef (a
	 *         single type) as here Immersion can have compound values like 'Multi'.
	 *         LensNA: The numerical aperture of the lens (as a float)
	 *         NominalMagnification: The specified magnification e.g. x10
	 *         CalibratedMagnification: The measured magnification e.g. x10.3
	 *         WorkingDistance: WorkingDistance of the lens.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Objective</em>' containment reference.
	 * @see #setObjective(ObjectiveType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Objective()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Objective' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectiveType getObjective();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getObjective <em>Objective</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective</em>' containment reference.
	 * @see #getObjective()
	 * @generated
	 */
	void setObjective(ObjectiveType value);

	/**
	 * Returns the value of the '<em><b>Objective Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This holds the setting applied to an objective as well as a
	 *         reference to the objective.
	 *         The ID is the objective used in this case.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Objective Settings</em>' containment reference.
	 * @see #setObjectiveSettings(ObjectiveSettingsType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_ObjectiveSettings()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectiveSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectiveSettingsType getObjectiveSettings();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getObjectiveSettings <em>Objective Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective Settings</em>' containment reference.
	 * @see #getObjectiveSettings()
	 * @generated
	 */
	void setObjectiveSettings(ObjectiveSettingsType value);

	/**
	 * Returns the value of the '<em><b>OME</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The OME element is a container for all information objects accessible by OME.
	 *         These information objects include descriptions of the imaging experiments
	 *         and the people who perform them, descriptions of the microscope, the resulting
	 *         images and how they were acquired, the analyses performed on those images,
	 *         and the analysis results themselves.
	 *         An OME file may contain any or all of this information.
	 * 
	 *         With the creation of the Metadata Only Companion OME-XML and Binary Only OME-TIFF files
	 *         the top level OME node has changed slightly.
	 *         It can EITHER:
	 *         Contain all the previously expected elements
	 *         OR:
	 *         Contain a single BinaryOnly element that points at
	 *         its Metadata Only Companion OME-XML file.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OME</em>' containment reference.
	 * @see #setOME(OMEType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_OME()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OME' namespace='##targetNamespace'"
	 * @generated
	 */
	OMEType getOME();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getOME <em>OME</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OME</em>' containment reference.
	 * @see #getOME()
	 * @generated
	 */
	void setOME(OMEType value);

	/**
	 * Returns the value of the '<em><b>Pixels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Pixels is going to be removed in the future, but it is still required.
	 * 
	 *         This is just notice that the contents of Pixels will be
	 *         moved up to Image in a future release. This is because there
	 *         has only been 1 Pixels object in each Image for some time.
	 *         The concept of multiple Pixels sets for one Image failed to
	 *         take off. It is therefore redundant.
	 * 
	 *         The Image will be unreadable if any of the required Pixel attributes are missing.
	 * 
	 *         The Pixels themselves can be stored within the OME-XML compressed by plane, and encoded
	 *         in Base64.
	 *         Or the Pixels may be stored in TIFF format.
	 * 
	 *         The Pixels element should contain a list of BinData or TiffData, each containing a
	 *         single plane of pixels. These Pixels elements, when read in document order,
	 *         must produce a 5-D pixel array of the size specified in this element, and in the
	 *         dimension order specified by 'DimensionOrder'.
	 * 
	 *         All of the values in the Pixels object when present should match the same value
	 *         stored in any associated TIFF format (e.g. SizeX should be the same). Where there
	 *         is a mismatch our readers will take the value from the TIFF structure as overriding
	 *         the value in the OME-XML. This is simply a pragmatic decision as it increases the
	 *         likelihood of reading data from a slightly incorrect file.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pixels</em>' containment reference.
	 * @see #setPixels(PixelsType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Pixels()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Pixels' namespace='##targetNamespace'"
	 * @generated
	 */
	PixelsType getPixels();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getPixels <em>Pixels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pixels</em>' containment reference.
	 * @see #getPixels()
	 * @generated
	 */
	void setPixels(PixelsType value);

	/**
	 * Returns the value of the '<em><b>Plane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Plane object holds microscope stage and image timing data
	 *         for a given channel/z-section/timepoint.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plane</em>' containment reference.
	 * @see #setPlane(PlaneType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Plane()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Plane' namespace='##targetNamespace'"
	 * @generated
	 */
	PlaneType getPlane();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getPlane <em>Plane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plane</em>' containment reference.
	 * @see #getPlane()
	 * @generated
	 */
	void setPlane(PlaneType value);

	/**
	 * Returns the value of the '<em><b>Plate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This element identifies microtiter plates within a screen.
	 *         A plate can belong to more than one screen.
	 *         The Screen(s) that a plate belongs to are specified by the ScreenRef element.
	 *         The Plate ID and Name attributes are required.
	 *         The Wells in a plate are numbers from the top-left corner in a grid starting at zero.
	 *         i.e. The top-left well of a plate is index (0,0)
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plate</em>' containment reference.
	 * @see #setPlate(PlateType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Plate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Plate' namespace='##targetNamespace'"
	 * @generated
	 */
	PlateType getPlate();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getPlate <em>Plate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plate</em>' containment reference.
	 * @see #getPlate()
	 * @generated
	 */
	void setPlate(PlateType value);

	/**
	 * Returns the value of the '<em><b>Plate Acquisition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         PlateAcquisition is used to describe a single acquisition run for a plate.
	 *         This object is used to record the set of images acquired in a single
	 *         acquisition run. The Images for this run are linked to PlateAcquisition
	 *         through WellSample.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plate Acquisition</em>' containment reference.
	 * @see #setPlateAcquisition(PlateAcquisitionType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_PlateAcquisition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PlateAcquisition' namespace='##targetNamespace'"
	 * @generated
	 */
	PlateAcquisitionType getPlateAcquisition();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getPlateAcquisition <em>Plate Acquisition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plate Acquisition</em>' containment reference.
	 * @see #getPlateAcquisition()
	 * @generated
	 */
	void setPlateAcquisition(PlateAcquisitionType value);

	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' containment reference.
	 * @see #setPoint(PointType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Point()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Point' namespace='##targetNamespace' affiliation='ShapeGroup'"
	 * @generated
	 */
	PointType getPoint();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getPoint <em>Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point</em>' containment reference.
	 * @see #getPoint()
	 * @generated
	 */
	void setPoint(PointType value);

	/**
	 * Returns the value of the '<em><b>Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Polygon defines closed shapes formed of straight
	 *         lines. Note: Polygon uses counterclockwise winding (this is the
	 *         default OpenGL behavior)
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polygon</em>' containment reference.
	 * @see #setPolygon(PolygonType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Polygon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Polygon' namespace='##targetNamespace' affiliation='ShapeGroup'"
	 * @generated
	 */
	PolygonType getPolygon();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getPolygon <em>Polygon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygon</em>' containment reference.
	 * @see #getPolygon()
	 * @generated
	 */
	void setPolygon(PolygonType value);

	/**
	 * Returns the value of the '<em><b>Polyline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Polyline defines open shapes formed of straight
	 *         lines. Note: Polyline uses counterclockwise winding (this is the
	 *         default OpenGL behavior)
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polyline</em>' containment reference.
	 * @see #setPolyline(PolylineType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Polyline()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Polyline' namespace='##targetNamespace' affiliation='ShapeGroup'"
	 * @generated
	 */
	PolylineType getPolyline();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getPolyline <em>Polyline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polyline</em>' containment reference.
	 * @see #getPolyline()
	 * @generated
	 */
	void setPolyline(PolylineType value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Project ID is required.
	 *         Datasets can be grouped into projects using a many-to-many relationship.
	 *         A Dataset may belong to one or more Projects by including one or more ProjectRef elements which refer to Project IDs.
	 *         Projects do not directly contain images - only by virtue of containing datasets, which themselves contain images.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project</em>' containment reference.
	 * @see #setProject(ProjectType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Project()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Project' namespace='##targetNamespace'"
	 * @generated
	 */
	ProjectType getProject();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getProject <em>Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' containment reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(ProjectType value);

	/**
	 * Returns the value of the '<em><b>Project Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         There may be one or more of these in a Dataset.
	 *         This empty element has a required Project ID attribute that refers to Projects defined within the OME element.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project Ref</em>' containment reference.
	 * @see #setProjectRef(ProjectRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_ProjectRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProjectRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ProjectRefType getProjectRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getProjectRef <em>Project Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Ref</em>' containment reference.
	 * @see #getProjectRef()
	 * @generated
	 */
	void setProjectRef(ProjectRefType value);

	/**
	 * Returns the value of the '<em><b>Pump</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Pump element is a reference to a LightSource.  It is used within the Laser element to specify the light source for the laser's pump (if any).
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pump</em>' containment reference.
	 * @see #setPump(PumpType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Pump()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Pump' namespace='##targetNamespace'"
	 * @generated
	 */
	PumpType getPump();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getPump <em>Pump</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pump</em>' containment reference.
	 * @see #getPump()
	 * @generated
	 */
	void setPump(PumpType value);

	/**
	 * Returns the value of the '<em><b>Reagent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Reagent is used to describe a chemical or some other physical experimental parameter.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reagent</em>' containment reference.
	 * @see #setReagent(ReagentType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Reagent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Reagent' namespace='##targetNamespace'"
	 * @generated
	 */
	ReagentType getReagent();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getReagent <em>Reagent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reagent</em>' containment reference.
	 * @see #getReagent()
	 * @generated
	 */
	void setReagent(ReagentType value);

	/**
	 * Returns the value of the '<em><b>Reagent Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reagent Ref</em>' containment reference.
	 * @see #setReagentRef(ReagentRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_ReagentRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReagentRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ReagentRefType getReagentRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getReagentRef <em>Reagent Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reagent Ref</em>' containment reference.
	 * @see #getReagentRef()
	 * @generated
	 */
	void setReagentRef(ReagentRefType value);

	/**
	 * Returns the value of the '<em><b>Rectangle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A simple rectangle object. If rotation is required apply a
	 *         transformation at the Shape level.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rectangle</em>' containment reference.
	 * @see #setRectangle(RectangleType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Rectangle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Rectangle' namespace='##targetNamespace' affiliation='ShapeGroup'"
	 * @generated
	 */
	RectangleType getRectangle();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getRectangle <em>Rectangle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rectangle</em>' containment reference.
	 * @see #getRectangle()
	 * @generated
	 */
	void setRectangle(RectangleType value);

	/**
	 * Returns the value of the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The rights holder of this data and the rights held.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rights</em>' containment reference.
	 * @see #setRights(RightsType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Rights()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Rights' namespace='##targetNamespace'"
	 * @generated
	 */
	RightsType getRights();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getRights <em>Rights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rights</em>' containment reference.
	 * @see #getRights()
	 * @generated
	 */
	void setRights(RightsType value);

	/**
	 * Returns the value of the '<em><b>ROI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A four dimensional 'Region of Interest'.
	 *         If they are not used, and the Image has more than one plane,
	 *         the entire set of planes is assumed to be included in the ROI.
	 *         Multiple ROIs may be specified.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ROI</em>' containment reference.
	 * @see #setROI(ROIType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_ROI()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ROI' namespace='##targetNamespace'"
	 * @generated
	 */
	ROIType getROI();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getROI <em>ROI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ROI</em>' containment reference.
	 * @see #getROI()
	 * @generated
	 */
	void setROI(ROIType value);

	/**
	 * Returns the value of the '<em><b>ROI Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ROI Ref</em>' containment reference.
	 * @see #setROIRef(ROIRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_ROIRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ROIRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ROIRefType getROIRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getROIRef <em>ROI Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ROI Ref</em>' containment reference.
	 * @see #getROIRef()
	 * @generated
	 */
	void setROIRef(ROIRefType value);

	/**
	 * Returns the value of the '<em><b>Screen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Screen element is a grouping for Plates.
	 *         The required attribute is the Screen's Name and ID - both must be unique within the document.
	 *         The Screen element may contain an ExternalRef attribute that refers to an external database.
	 *         A description of the screen may be specified in the Description element.
	 *         Screens may contain overlapping sets of Plates i.e.      Screens and Plates have a many-to-many relationship.
	 *         Plates contain one or more ScreenRef elements to specify what screens they belong to.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Screen</em>' containment reference.
	 * @see #setScreen(ScreenType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Screen()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Screen' namespace='##targetNamespace'"
	 * @generated
	 */
	ScreenType getScreen();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getScreen <em>Screen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen</em>' containment reference.
	 * @see #getScreen()
	 * @generated
	 */
	void setScreen(ScreenType value);

	/**
	 * Returns the value of the '<em><b>Stage Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The StageLabel is used to specify a name and position for a stage position in the microscope's reference frame.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stage Label</em>' containment reference.
	 * @see #setStageLabel(StageLabelType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_StageLabel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StageLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	StageLabelType getStageLabel();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getStageLabel <em>Stage Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage Label</em>' containment reference.
	 * @see #getStageLabel()
	 * @generated
	 */
	void setStageLabel(StageLabelType value);

	/**
	 * Returns the value of the '<em><b>Structured Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         An unordered collection of annotation attached to objects in the OME data model.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structured Annotations</em>' containment reference.
	 * @see #setStructuredAnnotations(StructuredAnnotationsType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_StructuredAnnotations()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StructuredAnnotations' namespace='##targetNamespace'"
	 * @generated
	 */
	StructuredAnnotationsType getStructuredAnnotations();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getStructuredAnnotations <em>Structured Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Annotations</em>' containment reference.
	 * @see #getStructuredAnnotations()
	 * @generated
	 */
	void setStructuredAnnotations(StructuredAnnotationsType value);

	/**
	 * Returns the value of the '<em><b>Tag Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A tag annotation (represents a tag or a tagset)
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tag Annotation</em>' containment reference.
	 * @see #setTagAnnotation(TagAnnotationType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_TagAnnotation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TagAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	TagAnnotationType getTagAnnotation();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getTagAnnotation <em>Tag Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag Annotation</em>' containment reference.
	 * @see #getTagAnnotation()
	 * @generated
	 */
	void setTagAnnotation(TagAnnotationType value);

	/**
	 * Returns the value of the '<em><b>Term Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A ontology term annotation
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term Annotation</em>' containment reference.
	 * @see #setTermAnnotation(TermAnnotationType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_TermAnnotation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TermAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	TermAnnotationType getTermAnnotation();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getTermAnnotation <em>Term Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Annotation</em>' containment reference.
	 * @see #getTermAnnotation()
	 * @generated
	 */
	void setTermAnnotation(TermAnnotationType value);

	/**
	 * Returns the value of the '<em><b>Tiff Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This described the location of the pixel data in a tiff file.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tiff Data</em>' containment reference.
	 * @see #setTiffData(TiffDataType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_TiffData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TiffData' namespace='##targetNamespace'"
	 * @generated
	 */
	TiffDataType getTiffData();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getTiffData <em>Tiff Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiff Data</em>' containment reference.
	 * @see #getTiffData()
	 * @generated
	 */
	void setTiffData(TiffDataType value);

	/**
	 * Returns the value of the '<em><b>Timestamp Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A date/time annotation of type xsd:dateTime
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp Annotation</em>' containment reference.
	 * @see #setTimestampAnnotation(TimestampAnnotationType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_TimestampAnnotation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimestampAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	TimestampAnnotationType getTimestampAnnotation();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getTimestampAnnotation <em>Timestamp Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp Annotation</em>' containment reference.
	 * @see #getTimestampAnnotation()
	 * @generated
	 */
	void setTimestampAnnotation(TimestampAnnotationType value);

	/**
	 * Returns the value of the '<em><b>Transmittance Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This records the range of wavelengths that are transmitted by the filter. It also records the maximum amount of light transmitted.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmittance Range</em>' containment reference.
	 * @see #setTransmittanceRange(TransmittanceRangeType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_TransmittanceRange()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TransmittanceRange' namespace='##targetNamespace'"
	 * @generated
	 */
	TransmittanceRangeType getTransmittanceRange();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getTransmittanceRange <em>Transmittance Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmittance Range</em>' containment reference.
	 * @see #getTransmittanceRange()
	 * @generated
	 */
	void setTransmittanceRange(TransmittanceRangeType value);

	/**
	 * Returns the value of the '<em><b>Well</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A Well is a component of the Well/Plate/Screen construct to describe screening applications.
	 *         A Well has a number of WellSample elements that link to the Images collected in this well.
	 *         The ReagentRef links any Reagents that were used in this Well. A well is part of only one Plate.
	 *         The origin for the row and column identifiers is the top left corner of the plate starting at zero.
	 *         i.e The top left well of a plate is index (0,0)
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Well</em>' containment reference.
	 * @see #setWell(WellType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_Well()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Well' namespace='##targetNamespace'"
	 * @generated
	 */
	WellType getWell();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getWell <em>Well</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Well</em>' containment reference.
	 * @see #getWell()
	 * @generated
	 */
	void setWell(WellType value);

	/**
	 * Returns the value of the '<em><b>Well Sample</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         WellSample is an individual image that has been captured within a Well.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Well Sample</em>' containment reference.
	 * @see #setWellSample(WellSampleType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_WellSample()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WellSample' namespace='##targetNamespace'"
	 * @generated
	 */
	WellSampleType getWellSample();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getWellSample <em>Well Sample</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Well Sample</em>' containment reference.
	 * @see #getWellSample()
	 * @generated
	 */
	void setWellSample(WellSampleType value);

	/**
	 * Returns the value of the '<em><b>Well Sample Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The WellSampleRef element is a reference to a WellSample element.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Well Sample Ref</em>' containment reference.
	 * @see #setWellSampleRef(WellSampleRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_WellSampleRef()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WellSampleRef' namespace='##targetNamespace'"
	 * @generated
	 */
	WellSampleRefType getWellSampleRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getWellSampleRef <em>Well Sample Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Well Sample Ref</em>' containment reference.
	 * @see #getWellSampleRef()
	 * @generated
	 */
	void setWellSampleRef(WellSampleRefType value);

	/**
	 * Returns the value of the '<em><b>XML Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         An general xml annotation. The contents of this is not processed as OME XML but should still be well-formed XML.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XML Annotation</em>' containment reference.
	 * @see #setXMLAnnotation(XMLAnnotationType)
	 * @see org.openmicroscopy.ome.OMEPackage#getDocumentRoot_XMLAnnotation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='XMLAnnotation' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLAnnotationType getXMLAnnotation();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DocumentRoot#getXMLAnnotation <em>XML Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XML Annotation</em>' containment reference.
	 * @see #getXMLAnnotation()
	 * @generated
	 */
	void setXMLAnnotation(XMLAnnotationType value);

} // DocumentRoot
