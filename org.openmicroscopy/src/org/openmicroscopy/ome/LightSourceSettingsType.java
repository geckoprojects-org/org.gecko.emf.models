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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Light Source Settings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.LightSourceSettingsType#getAttenuation <em>Attenuation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LightSourceSettingsType#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LightSourceSettingsType#getWavelength <em>Wavelength</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.LightSourceSettingsType#getWavelengthUnit <em>Wavelength Unit</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getLightSourceSettingsType()
 * @model extendedMetaData="name='LightSourceSettings_._type' kind='empty'"
 * @generated
 */
@ProviderType
public interface LightSourceSettingsType extends Settings {
	/**
	 * Returns the value of the '<em><b>Attenuation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The Attenuation of the light source [units:none]
	 *                 A fraction, as a value from 0.0 to 1.0.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attenuation</em>' attribute.
	 * @see #isSetAttenuation()
	 * @see #unsetAttenuation()
	 * @see #setAttenuation(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getLightSourceSettingsType_Attenuation()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PercentFraction"
	 *        extendedMetaData="kind='attribute' name='Attenuation'"
	 * @generated
	 */
	float getAttenuation();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LightSourceSettingsType#getAttenuation <em>Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attenuation</em>' attribute.
	 * @see #isSetAttenuation()
	 * @see #unsetAttenuation()
	 * @see #getAttenuation()
	 * @generated
	 */
	void setAttenuation(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LightSourceSettingsType#getAttenuation <em>Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttenuation()
	 * @see #getAttenuation()
	 * @see #setAttenuation(float)
	 * @generated
	 */
	void unsetAttenuation();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LightSourceSettingsType#getAttenuation <em>Attenuation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attenuation</em>' attribute is set.
	 * @see #unsetAttenuation()
	 * @see #getAttenuation()
	 * @see #setAttenuation(float)
	 * @generated
	 */
	boolean isSetAttenuation();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.openmicroscopy.ome.OMEPackage#getLightSourceSettingsType_ID()
	 * @model dataType="org.openmicroscopy.ome.LightSourceID" required="true"
	 *        extendedMetaData="kind='attribute' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LightSourceSettingsType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Wavelength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The Wavelength of the light source. Units are set by WavelengthUnit.
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wavelength</em>' attribute.
	 * @see #isSetWavelength()
	 * @see #unsetWavelength()
	 * @see #setWavelength(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getLightSourceSettingsType_Wavelength()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveFloat"
	 *        extendedMetaData="kind='attribute' name='Wavelength'"
	 * @generated
	 */
	float getWavelength();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LightSourceSettingsType#getWavelength <em>Wavelength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wavelength</em>' attribute.
	 * @see #isSetWavelength()
	 * @see #unsetWavelength()
	 * @see #getWavelength()
	 * @generated
	 */
	void setWavelength(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LightSourceSettingsType#getWavelength <em>Wavelength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWavelength()
	 * @see #getWavelength()
	 * @see #setWavelength(float)
	 * @generated
	 */
	void unsetWavelength();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LightSourceSettingsType#getWavelength <em>Wavelength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wavelength</em>' attribute is set.
	 * @see #unsetWavelength()
	 * @see #getWavelength()
	 * @see #setWavelength(float)
	 * @generated
	 */
	boolean isSetWavelength();

	/**
	 * Returns the value of the '<em><b>Wavelength Unit</b></em>' attribute.
	 * The default value is <code>"nm"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The units of the Wavelength of the light source - default:nanometres[nm]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wavelength Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetWavelengthUnit()
	 * @see #unsetWavelengthUnit()
	 * @see #setWavelengthUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getLightSourceSettingsType_WavelengthUnit()
	 * @model default="nm" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='WavelengthUnit'"
	 * @generated
	 */
	UnitsLength getWavelengthUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.LightSourceSettingsType#getWavelengthUnit <em>Wavelength Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wavelength Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetWavelengthUnit()
	 * @see #unsetWavelengthUnit()
	 * @see #getWavelengthUnit()
	 * @generated
	 */
	void setWavelengthUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.LightSourceSettingsType#getWavelengthUnit <em>Wavelength Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWavelengthUnit()
	 * @see #getWavelengthUnit()
	 * @see #setWavelengthUnit(UnitsLength)
	 * @generated
	 */
	void unsetWavelengthUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.LightSourceSettingsType#getWavelengthUnit <em>Wavelength Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wavelength Unit</em>' attribute is set.
	 * @see #unsetWavelengthUnit()
	 * @see #getWavelengthUnit()
	 * @see #setWavelengthUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetWavelengthUnit();

} // LightSourceSettingsType
