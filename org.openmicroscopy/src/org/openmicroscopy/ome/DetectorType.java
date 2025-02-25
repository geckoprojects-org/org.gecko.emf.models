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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.DetectorType#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DetectorType#getAmplificationGain <em>Amplification Gain</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DetectorType#getGain <em>Gain</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DetectorType#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DetectorType#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DetectorType#getType <em>Type</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DetectorType#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DetectorType#getVoltageUnit <em>Voltage Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.DetectorType#getZoom <em>Zoom</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getDetectorType()
 * @model extendedMetaData="name='Detector_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DetectorType extends ManufacturerSpec {
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
	 * @see org.openmicroscopy.ome.OMEPackage#getDetectorType_AnnotationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnnotationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationRefType> getAnnotationRef();

	/**
	 * Returns the value of the '<em><b>Amplification Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Gain applied to the detector signal.
	 *                 This is the electronic gain (as apposed to the inherent gain) that is set for the detector. [units:none] {used:EMCCD#EMGain}
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amplification Gain</em>' attribute.
	 * @see #isSetAmplificationGain()
	 * @see #unsetAmplificationGain()
	 * @see #setAmplificationGain(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getDetectorType_AmplificationGain()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='AmplificationGain'"
	 * @generated
	 */
	float getAmplificationGain();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DetectorType#getAmplificationGain <em>Amplification Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amplification Gain</em>' attribute.
	 * @see #isSetAmplificationGain()
	 * @see #unsetAmplificationGain()
	 * @see #getAmplificationGain()
	 * @generated
	 */
	void setAmplificationGain(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.DetectorType#getAmplificationGain <em>Amplification Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAmplificationGain()
	 * @see #getAmplificationGain()
	 * @see #setAmplificationGain(float)
	 * @generated
	 */
	void unsetAmplificationGain();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.DetectorType#getAmplificationGain <em>Amplification Gain</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Amplification Gain</em>' attribute is set.
	 * @see #unsetAmplificationGain()
	 * @see #getAmplificationGain()
	 * @see #setAmplificationGain(float)
	 * @generated
	 */
	boolean isSetAmplificationGain();

	/**
	 * Returns the value of the '<em><b>Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The Detector Gain for this detector, as a float. [units:none] {used:CCD,EMCCD,PMT}
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gain</em>' attribute.
	 * @see #isSetGain()
	 * @see #unsetGain()
	 * @see #setGain(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getDetectorType_Gain()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='Gain'"
	 * @generated
	 */
	float getGain();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DetectorType#getGain <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gain</em>' attribute.
	 * @see #isSetGain()
	 * @see #unsetGain()
	 * @see #getGain()
	 * @generated
	 */
	void setGain(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.DetectorType#getGain <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGain()
	 * @see #getGain()
	 * @see #setGain(float)
	 * @generated
	 */
	void unsetGain();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.DetectorType#getGain <em>Gain</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gain</em>' attribute is set.
	 * @see #unsetGain()
	 * @see #getGain()
	 * @see #setGain(float)
	 * @generated
	 */
	boolean isSetGain();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getDetectorType_ID()
	 * @model dataType="org.openmicroscopy.ome.DetectorID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DetectorType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The Detector Offset. [units:none] {used:CCD,EMCCD}
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #setOffset(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getDetectorType_Offset()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='Offset'"
	 * @generated
	 */
	float getOffset();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DetectorType#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #isSetOffset()
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.DetectorType#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOffset()
	 * @see #getOffset()
	 * @see #setOffset(float)
	 * @generated
	 */
	void unsetOffset();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.DetectorType#getOffset <em>Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Offset</em>' attribute is set.
	 * @see #unsetOffset()
	 * @see #getOffset()
	 * @see #setOffset(float)
	 * @generated
	 */
	boolean isSetOffset();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.TypeType2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The Type of detector. E.g. CCD, PMT, EMCCD etc.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.openmicroscopy.ome.TypeType2
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType2)
	 * @see org.openmicroscopy.ome.OMEPackage#getDetectorType_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	TypeType2 getType();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DetectorType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.openmicroscopy.ome.TypeType2
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType2 value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.DetectorType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType2)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.DetectorType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType2)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The Voltage of the detector (e.g. PMT voltage) as a float. {used:PMT}
	 *                 Units are set by VoltageUnit.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Voltage</em>' attribute.
	 * @see #isSetVoltage()
	 * @see #unsetVoltage()
	 * @see #setVoltage(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getDetectorType_Voltage()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='Voltage'"
	 * @generated
	 */
	float getVoltage();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DetectorType#getVoltage <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage</em>' attribute.
	 * @see #isSetVoltage()
	 * @see #unsetVoltage()
	 * @see #getVoltage()
	 * @generated
	 */
	void setVoltage(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.DetectorType#getVoltage <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVoltage()
	 * @see #getVoltage()
	 * @see #setVoltage(float)
	 * @generated
	 */
	void unsetVoltage();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.DetectorType#getVoltage <em>Voltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Voltage</em>' attribute is set.
	 * @see #unsetVoltage()
	 * @see #getVoltage()
	 * @see #setVoltage(float)
	 * @generated
	 */
	boolean isSetVoltage();

	/**
	 * Returns the value of the '<em><b>Voltage Unit</b></em>' attribute.
	 * The default value is <code>"V"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsElectricPotential}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the Voltage - default:volts[V].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Voltage Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsElectricPotential
	 * @see #isSetVoltageUnit()
	 * @see #unsetVoltageUnit()
	 * @see #setVoltageUnit(UnitsElectricPotential)
	 * @see org.openmicroscopy.ome.OMEPackage#getDetectorType_VoltageUnit()
	 * @model default="V" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='VoltageUnit'"
	 * @generated
	 */
	UnitsElectricPotential getVoltageUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DetectorType#getVoltageUnit <em>Voltage Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsElectricPotential
	 * @see #isSetVoltageUnit()
	 * @see #unsetVoltageUnit()
	 * @see #getVoltageUnit()
	 * @generated
	 */
	void setVoltageUnit(UnitsElectricPotential value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.DetectorType#getVoltageUnit <em>Voltage Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVoltageUnit()
	 * @see #getVoltageUnit()
	 * @see #setVoltageUnit(UnitsElectricPotential)
	 * @generated
	 */
	void unsetVoltageUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.DetectorType#getVoltageUnit <em>Voltage Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Voltage Unit</em>' attribute is set.
	 * @see #unsetVoltageUnit()
	 * @see #getVoltageUnit()
	 * @see #setVoltageUnit(UnitsElectricPotential)
	 * @generated
	 */
	boolean isSetVoltageUnit();

	/**
	 * Returns the value of the '<em><b>Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The fixed Zoom for a detector. [units:none] {used:PMT}
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zoom</em>' attribute.
	 * @see #isSetZoom()
	 * @see #unsetZoom()
	 * @see #setZoom(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getDetectorType_Zoom()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='Zoom'"
	 * @generated
	 */
	float getZoom();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.DetectorType#getZoom <em>Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zoom</em>' attribute.
	 * @see #isSetZoom()
	 * @see #unsetZoom()
	 * @see #getZoom()
	 * @generated
	 */
	void setZoom(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.DetectorType#getZoom <em>Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZoom()
	 * @see #getZoom()
	 * @see #setZoom(float)
	 * @generated
	 */
	void unsetZoom();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.DetectorType#getZoom <em>Zoom</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Zoom</em>' attribute is set.
	 * @see #unsetZoom()
	 * @see #getZoom()
	 * @see #setZoom(float)
	 * @generated
	 */
	boolean isSetZoom();

} // DetectorType
