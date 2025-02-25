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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.ImageType#getAcquisitionDate <em>Acquisition Date</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImageType#getExperimenterRef <em>Experimenter Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImageType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImageType#getExperimentRef <em>Experiment Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImageType#getExperimenterGroupRef <em>Experimenter Group Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImageType#getInstrumentRef <em>Instrument Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImageType#getObjectiveSettings <em>Objective Settings</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImageType#getImagingEnvironment <em>Imaging Environment</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImageType#getStageLabel <em>Stage Label</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImageType#getPixels <em>Pixels</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImageType#getROIRef <em>ROI Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImageType#getMicrobeamManipulationRef <em>Microbeam Manipulation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImageType#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImageType#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.ImageType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getImageType()
 * @model extendedMetaData="name='Image_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ImageType extends EObject {
	/**
	 * Returns the value of the '<em><b>Acquisition Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The acquisition date of the Image.
	 *               The element contains an xsd:dateTime string based on the ISO 8601 format (i.e. 1988-04-07T18:39:09.359)
	 * 
	 *               YYYY-MM-DDTHH:mm:SS.sssZ
	 *               Y - Year
	 *               M - Month
	 *               D - Day
	 *               H - Hour
	 *               m - minutes
	 *               S - Seconds
	 *               s - sub-seconds (optional)
	 *               Z - Zone (optional) +HH:mm or -HH:mm or Z for UTC
	 * 
	 *               Note: xsd:dataTime supports a very wide date range with unlimited precision. The full date range
	 *               and precision are not typically supported by platform- and language-specific libraries.
	 *               Where the supported time precision is less than the precision used by the xsd:dateTime
	 *               timestamp there will be loss of precision; this will typically occur via direct truncation
	 *               or (less commonly) rounding.
	 * 
	 *               The year value can be large and/or negative. Any value covering the current or last century
	 *               should be correctly processed, but some systems cannot process earlier dates.
	 * 
	 *               The sub-second value is defined as an unlimited number of digits after the decimal point.
	 *               In Java a minimum of millisecond precision is guaranteed.
	 *               In C++ microsecond precision is guaranteed, with nanosecond precision being available on
	 *               some platforms.
	 * 
	 *               Time zones are supported, eg '2013-10-24T11:52:33+01:00' for Paris, but in most cases it will
	 *               be converted to UTC when the timestamp is written.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acquisition Date</em>' attribute.
	 * @see #setAcquisitionDate(XMLGregorianCalendar)
	 * @see org.openmicroscopy.ome.OMEPackage#getImageType_AcquisitionDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='AcquisitionDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getAcquisitionDate();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ImageType#getAcquisitionDate <em>Acquisition Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acquisition Date</em>' attribute.
	 * @see #getAcquisitionDate()
	 * @generated
	 */
	void setAcquisitionDate(XMLGregorianCalendar value);

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
	 * @see org.openmicroscopy.ome.OMEPackage#getImageType_ExperimenterRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExperimenterRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ExperimenterRefType getExperimenterRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ImageType#getExperimenterRef <em>Experimenter Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimenter Ref</em>' containment reference.
	 * @see #getExperimenterRef()
	 * @generated
	 */
	void setExperimenterRef(ExperimenterRefType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               A description for the image. [plain-text multi-line string]
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getImageType_Description()
	 * @model dataType="org.openmicroscopy.ome.DescriptionType9"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ImageType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Experiment Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiment Ref</em>' containment reference.
	 * @see #setExperimentRef(ExperimentRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getImageType_ExperimentRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExperimentRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ExperimentRefType getExperimentRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ImageType#getExperimentRef <em>Experiment Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experiment Ref</em>' containment reference.
	 * @see #getExperimentRef()
	 * @generated
	 */
	void setExperimentRef(ExperimentRefType value);

	/**
	 * Returns the value of the '<em><b>Experimenter Group Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This empty element has a reference (the ExperimenterGroup ID attribute) to a ExperimenterGroup defined within OME.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimenter Group Ref</em>' containment reference.
	 * @see #setExperimenterGroupRef(ExperimenterGroupRefType)
	 * @see org.openmicroscopy.ome.OMEPackage#getImageType_ExperimenterGroupRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExperimenterGroupRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ExperimenterGroupRefType getExperimenterGroupRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ImageType#getExperimenterGroupRef <em>Experimenter Group Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimenter Group Ref</em>' containment reference.
	 * @see #getExperimenterGroupRef()
	 * @generated
	 */
	void setExperimenterGroupRef(ExperimenterGroupRefType value);

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
	 * @see org.openmicroscopy.ome.OMEPackage#getImageType_InstrumentRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InstrumentRef' namespace='##targetNamespace'"
	 * @generated
	 */
	InstrumentRefType getInstrumentRef();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ImageType#getInstrumentRef <em>Instrument Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instrument Ref</em>' containment reference.
	 * @see #getInstrumentRef()
	 * @generated
	 */
	void setInstrumentRef(InstrumentRefType value);

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
	 * @see org.openmicroscopy.ome.OMEPackage#getImageType_ObjectiveSettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObjectiveSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectiveSettingsType getObjectiveSettings();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ImageType#getObjectiveSettings <em>Objective Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective Settings</em>' containment reference.
	 * @see #getObjectiveSettings()
	 * @generated
	 */
	void setObjectiveSettings(ObjectiveSettingsType value);

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
	 * @see org.openmicroscopy.ome.OMEPackage#getImageType_ImagingEnvironment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImagingEnvironment' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagingEnvironmentType getImagingEnvironment();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ImageType#getImagingEnvironment <em>Imaging Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imaging Environment</em>' containment reference.
	 * @see #getImagingEnvironment()
	 * @generated
	 */
	void setImagingEnvironment(ImagingEnvironmentType value);

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
	 * @see org.openmicroscopy.ome.OMEPackage#getImageType_StageLabel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StageLabel' namespace='##targetNamespace'"
	 * @generated
	 */
	StageLabelType getStageLabel();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ImageType#getStageLabel <em>Stage Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage Label</em>' containment reference.
	 * @see #getStageLabel()
	 * @generated
	 */
	void setStageLabel(StageLabelType value);

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
	 * @see org.openmicroscopy.ome.OMEPackage#getImageType_Pixels()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Pixels' namespace='##targetNamespace'"
	 * @generated
	 */
	PixelsType getPixels();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ImageType#getPixels <em>Pixels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pixels</em>' containment reference.
	 * @see #getPixels()
	 * @generated
	 */
	void setPixels(PixelsType value);

	/**
	 * Returns the value of the '<em><b>ROI Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.ROIRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ROI Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getImageType_ROIRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ROIRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ROIRefType> getROIRef();

	/**
	 * Returns the value of the '<em><b>Microbeam Manipulation Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.MicrobeamManipulationRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microbeam Manipulation Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getImageType_MicrobeamManipulationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MicrobeamManipulationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MicrobeamManipulationRefType> getMicrobeamManipulationRef();

	/**
	 * Returns the value of the '<em><b>Annotation Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.AnnotationRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The AnnotationRef element is a reference to an element derived
	 *         from the CommonAnnotation element.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotation Ref</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getImageType_AnnotationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnnotationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationRefType> getAnnotationRef();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getImageType_ID()
	 * @model dataType="org.openmicroscopy.ome.ImageID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ImageType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getImageType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.ImageType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ImageType
