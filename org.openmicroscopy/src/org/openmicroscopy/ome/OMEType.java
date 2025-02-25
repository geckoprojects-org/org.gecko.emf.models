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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.OMEType#getRights <em>Rights</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.OMEType#getProject <em>Project</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.OMEType#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.OMEType#getFolder <em>Folder</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.OMEType#getExperiment <em>Experiment</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.OMEType#getPlate <em>Plate</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.OMEType#getScreen <em>Screen</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.OMEType#getExperimenter <em>Experimenter</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.OMEType#getExperimenterGroup <em>Experimenter Group</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.OMEType#getInstrument <em>Instrument</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.OMEType#getImage <em>Image</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.OMEType#getStructuredAnnotations <em>Structured Annotations</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.OMEType#getROI <em>ROI</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.OMEType#getBinaryOnly <em>Binary Only</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.OMEType#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.OMEType#getUUID <em>UUID</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getOMEType()
 * @model extendedMetaData="name='OME_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OMEType extends EObject {
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
	 * @see org.openmicroscopy.ome.OMEPackage#getOMEType_Rights()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Rights' namespace='##targetNamespace'"
	 * @generated
	 */
	RightsType getRights();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.OMEType#getRights <em>Rights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rights</em>' containment reference.
	 * @see #getRights()
	 * @generated
	 */
	void setRights(RightsType value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.ProjectType}.
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
	 * @return the value of the '<em>Project</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getOMEType_Project()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Project' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProjectType> getProject();

	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.DatasetType}.
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
	 * @return the value of the '<em>Dataset</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getOMEType_Dataset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Dataset' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatasetType> getDataset();

	/**
	 * Returns the value of the '<em><b>Folder</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.FolderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         An element specifying a possibly heterogeneous collection of data.
	 *         Folders may contain Folders so that data may be organized within a tree of Folders.
	 *         Data may be in multiple Folders but a Folder may not be in more than one other Folder.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Folder</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getOMEType_Folder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Folder' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FolderType> getFolder();

	/**
	 * Returns the value of the '<em><b>Experiment</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.ExperimentType}.
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
	 * @return the value of the '<em>Experiment</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getOMEType_Experiment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Experiment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExperimentType> getExperiment();

	/**
	 * Returns the value of the '<em><b>Plate</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.PlateType}.
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
	 * @return the value of the '<em>Plate</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getOMEType_Plate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Plate' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlateType> getPlate();

	/**
	 * Returns the value of the '<em><b>Screen</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.ScreenType}.
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
	 * @return the value of the '<em>Screen</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getOMEType_Screen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Screen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ScreenType> getScreen();

	/**
	 * Returns the value of the '<em><b>Experimenter</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.ExperimenterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         This element describes a person who performed an imaging experiment.
	 *         This person may also be a user of the OME system, in which case the UserName element contains their login name.
	 *         Experimenters may belong to one or more groups which are specified using one or more ExperimenterGroupRef elements.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimenter</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getOMEType_Experimenter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Experimenter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExperimenterType> getExperimenter();

	/**
	 * Returns the value of the '<em><b>Experimenter Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.ExperimenterGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The ExperimenterGroupID is required.
	 *         Information should ideally be specified for at least one Leader as a contact for the group.
	 *         The Leaders are themselves Experimenters.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Experimenter Group</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getOMEType_ExperimenterGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExperimenterGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExperimenterGroupType> getExperimenterGroup();

	/**
	 * Returns the value of the '<em><b>Instrument</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.InstrumentType}.
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
	 * @return the value of the '<em>Instrument</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getOMEType_Instrument()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Instrument' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InstrumentType> getInstrument();

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.ImageType}.
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
	 * @return the value of the '<em>Image</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getOMEType_Image()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Image' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ImageType> getImage();

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
	 * @see org.openmicroscopy.ome.OMEPackage#getOMEType_StructuredAnnotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StructuredAnnotations' namespace='##targetNamespace'"
	 * @generated
	 */
	StructuredAnnotationsType getStructuredAnnotations();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.OMEType#getStructuredAnnotations <em>Structured Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structured Annotations</em>' containment reference.
	 * @see #getStructuredAnnotations()
	 * @generated
	 */
	void setStructuredAnnotations(StructuredAnnotationsType value);

	/**
	 * Returns the value of the '<em><b>ROI</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.ROIType}.
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
	 * @return the value of the '<em>ROI</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getOMEType_ROI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ROI' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ROIType> getROI();

	/**
	 * Returns the value of the '<em><b>Binary Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Pointer to an external metadata file. If this
	 *               element is present, then no other metadata may be present in this
	 *               file, i.e. this file is a place-holder. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary Only</em>' containment reference.
	 * @see #setBinaryOnly(BinaryOnlyType)
	 * @see org.openmicroscopy.ome.OMEPackage#getOMEType_BinaryOnly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BinaryOnly' namespace='##targetNamespace'"
	 * @generated
	 */
	BinaryOnlyType getBinaryOnly();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.OMEType#getBinaryOnly <em>Binary Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Only</em>' containment reference.
	 * @see #getBinaryOnly()
	 * @generated
	 */
	void setBinaryOnly(BinaryOnlyType value);

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             This is the name of the creating application of the OME-XML
	 *             and preferably its full version.
	 *             e.g "CompanyName, SoftwareName, V2.6.3456"
	 *             This is optional but we hope it will be set by applications
	 *             writing out OME-XML from scratch.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creator</em>' attribute.
	 * @see #setCreator(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getOMEType_Creator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Creator'"
	 * @generated
	 */
	String getCreator();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.OMEType#getCreator <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' attribute.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(String value);

	/**
	 * Returns the value of the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             This unique identifier is used to keep track of multi part files.
	 *             It allows the links between files to survive renaming.
	 * 
	 *             While OPTIONAL in the general case this is REQUIRED in a
	 *             MetadataOnly Companion to a collection of BinaryOnly files.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UUID</em>' attribute.
	 * @see #setUUID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getOMEType_UUID()
	 * @model dataType="org.openmicroscopy.ome.UniversallyUniqueIdentifier"
	 *        extendedMetaData="kind='attribute' name='UUID'"
	 * @generated
	 */
	String getUUID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.OMEType#getUUID <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UUID</em>' attribute.
	 * @see #getUUID()
	 * @generated
	 */
	void setUUID(String value);

} // OMEType
