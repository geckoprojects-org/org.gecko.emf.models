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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instrument Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.InstrumentType#getMicroscope <em>Microscope</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.InstrumentType#getLightSourceGroupGroup <em>Light Source Group Group</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.InstrumentType#getLightSourceGroup <em>Light Source Group</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.InstrumentType#getDetector <em>Detector</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.InstrumentType#getObjective <em>Objective</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.InstrumentType#getFilterSet <em>Filter Set</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.InstrumentType#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.InstrumentType#getDichroic <em>Dichroic</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.InstrumentType#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.InstrumentType#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getInstrumentType()
 * @model extendedMetaData="name='Instrument_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InstrumentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Microscope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The microscope's manufacturer specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Microscope</em>' containment reference.
	 * @see #setMicroscope(MicroscopeType)
	 * @see org.openmicroscopy.ome.OMEPackage#getInstrumentType_Microscope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Microscope' namespace='##targetNamespace'"
	 * @generated
	 */
	MicroscopeType getMicroscope();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.InstrumentType#getMicroscope <em>Microscope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microscope</em>' containment reference.
	 * @see #getMicroscope()
	 * @generated
	 */
	void setMicroscope(MicroscopeType value);

	/**
	 * Returns the value of the '<em><b>Light Source Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Source Group Group</em>' attribute list.
	 * @see org.openmicroscopy.ome.OMEPackage#getInstrumentType_LightSourceGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LightSourceGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLightSourceGroupGroup();

	/**
	 * Returns the value of the '<em><b>Light Source Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.LightSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Source Group</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getInstrumentType_LightSourceGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LightSourceGroup' namespace='##targetNamespace' group='LightSourceGroup:group'"
	 * @generated
	 */
	EList<LightSource> getLightSourceGroup();

	/**
	 * Returns the value of the '<em><b>Detector</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.DetectorType}.
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
	 * @return the value of the '<em>Detector</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getInstrumentType_Detector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Detector' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DetectorType> getDetector();

	/**
	 * Returns the value of the '<em><b>Objective</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.ObjectiveType}.
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
	 * @return the value of the '<em>Objective</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getInstrumentType_Objective()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Objective' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObjectiveType> getObjective();

	/**
	 * Returns the value of the '<em><b>Filter Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.FilterSetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Filter set manufacturer specification
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter Set</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getInstrumentType_FilterSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FilterSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FilterSetType> getFilterSet();

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.FilterType}.
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
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getInstrumentType_Filter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Filter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FilterType> getFilter();

	/**
	 * Returns the value of the '<em><b>Dichroic</b></em>' containment reference list.
	 * The list contents are of type {@link org.openmicroscopy.ome.DichroicType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The dichromatic beamsplitter or dichroic mirror used for this filter combination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dichroic</em>' containment reference list.
	 * @see org.openmicroscopy.ome.OMEPackage#getInstrumentType_Dichroic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Dichroic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DichroicType> getDichroic();

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
	 * @see org.openmicroscopy.ome.OMEPackage#getInstrumentType_AnnotationRef()
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
	 * @see org.openmicroscopy.ome.OMEPackage#getInstrumentType_ID()
	 * @model dataType="org.openmicroscopy.ome.InstrumentID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.InstrumentType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // InstrumentType
