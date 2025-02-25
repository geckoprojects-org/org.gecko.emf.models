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
 * A representation of the model object '<em><b>Light Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         The lightsource for the instrument.  An instrument may have several light sources.
 *         The type of lightsource is specified by one of the child-elements which are 'Laser', 'Filament', 'Arc' or 'LightEmittingDiode'.
 *         Each of the light source types has its own Type attribute to further differentiate the light source
 *         (eg, Nd-YAG for Laser or Hg for Arc).
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.LightSource#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LightSource#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LightSource#getPower <em>Power</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LightSource#getPowerUnit <em>Power Unit</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getLightSource()
 * @model extendedMetaData="name='LightSource' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LightSource extends ManufacturerSpec {
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
	 * @see org.openmicroscopy.ome.OMEPackage#getLightSource_AnnotationRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnnotationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnnotationRefType> getAnnotationRef();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               A LightSource ID must be specified for each light source, and the individual
	 *               light sources can be referred to by their LightSource IDs (eg from Channel).
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getLightSource_ID()
	 * @model dataType="org.openmicroscopy.ome.LightSourceID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LightSource#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *               The light-source power. Units are set by PowerUnit.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #isSetPower()
	 * @see #unsetPower()
	 * @see #setPower(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getLightSource_Power()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='Power'"
	 * @generated
	 */
	float getPower();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LightSource#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #isSetPower()
	 * @see #unsetPower()
	 * @see #getPower()
	 * @generated
	 */
	void setPower(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LightSource#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPower()
	 * @see #getPower()
	 * @see #setPower(float)
	 * @generated
	 */
	void unsetPower();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LightSource#getPower <em>Power</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Power</em>' attribute is set.
	 * @see #unsetPower()
	 * @see #getPower()
	 * @see #setPower(float)
	 * @generated
	 */
	boolean isSetPower();

	/**
	 * Returns the value of the '<em><b>Power Unit</b></em>' attribute.
	 * The default value is <code>"mW"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsPower}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the Power - default:milliwatts[mW].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsPower
	 * @see #isSetPowerUnit()
	 * @see #unsetPowerUnit()
	 * @see #setPowerUnit(UnitsPower)
	 * @see org.openmicroscopy.ome.OMEPackage#getLightSource_PowerUnit()
	 * @model default="mW" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='PowerUnit'"
	 * @generated
	 */
	UnitsPower getPowerUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LightSource#getPowerUnit <em>Power Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsPower
	 * @see #isSetPowerUnit()
	 * @see #unsetPowerUnit()
	 * @see #getPowerUnit()
	 * @generated
	 */
	void setPowerUnit(UnitsPower value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LightSource#getPowerUnit <em>Power Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPowerUnit()
	 * @see #getPowerUnit()
	 * @see #setPowerUnit(UnitsPower)
	 * @generated
	 */
	void unsetPowerUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LightSource#getPowerUnit <em>Power Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Power Unit</em>' attribute is set.
	 * @see #unsetPowerUnit()
	 * @see #getPowerUnit()
	 * @see #setPowerUnit(UnitsPower)
	 * @generated
	 */
	boolean isSetPowerUnit();

} // LightSource
