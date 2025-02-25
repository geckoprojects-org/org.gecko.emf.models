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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.openmicroscopy.ome.LightSourceSettingsType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.UnitsLength;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Light Source Settings Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.LightSourceSettingsTypeImpl#getAttenuation <em>Attenuation</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LightSourceSettingsTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LightSourceSettingsTypeImpl#getWavelength <em>Wavelength</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LightSourceSettingsTypeImpl#getWavelengthUnit <em>Wavelength Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LightSourceSettingsTypeImpl extends SettingsImpl implements LightSourceSettingsType {
	/**
	 * The default value of the '{@link #getAttenuation() <em>Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttenuation()
	 * @generated
	 * @ordered
	 */
	protected static final float ATTENUATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAttenuation() <em>Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttenuation()
	 * @generated
	 * @ordered
	 */
	protected float attenuation = ATTENUATION_EDEFAULT;

	/**
	 * This is true if the Attenuation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attenuationESet;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWavelength() <em>Wavelength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWavelength()
	 * @generated
	 * @ordered
	 */
	protected static final float WAVELENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWavelength() <em>Wavelength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWavelength()
	 * @generated
	 * @ordered
	 */
	protected float wavelength = WAVELENGTH_EDEFAULT;

	/**
	 * This is true if the Wavelength attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wavelengthESet;

	/**
	 * The default value of the '{@link #getWavelengthUnit() <em>Wavelength Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWavelengthUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsLength WAVELENGTH_UNIT_EDEFAULT = UnitsLength.NM;

	/**
	 * The cached value of the '{@link #getWavelengthUnit() <em>Wavelength Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWavelengthUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsLength wavelengthUnit = WAVELENGTH_UNIT_EDEFAULT;

	/**
	 * This is true if the Wavelength Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wavelengthUnitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LightSourceSettingsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getLightSourceSettingsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAttenuation() {
		return attenuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttenuation(float newAttenuation) {
		float oldAttenuation = attenuation;
		attenuation = newAttenuation;
		boolean oldAttenuationESet = attenuationESet;
		attenuationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__ATTENUATION, oldAttenuation, attenuation, !oldAttenuationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAttenuation() {
		float oldAttenuation = attenuation;
		boolean oldAttenuationESet = attenuationESet;
		attenuation = ATTENUATION_EDEFAULT;
		attenuationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__ATTENUATION, oldAttenuation, ATTENUATION_EDEFAULT, oldAttenuationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAttenuation() {
		return attenuationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getWavelength() {
		return wavelength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWavelength(float newWavelength) {
		float oldWavelength = wavelength;
		wavelength = newWavelength;
		boolean oldWavelengthESet = wavelengthESet;
		wavelengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__WAVELENGTH, oldWavelength, wavelength, !oldWavelengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWavelength() {
		float oldWavelength = wavelength;
		boolean oldWavelengthESet = wavelengthESet;
		wavelength = WAVELENGTH_EDEFAULT;
		wavelengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__WAVELENGTH, oldWavelength, WAVELENGTH_EDEFAULT, oldWavelengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWavelength() {
		return wavelengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsLength getWavelengthUnit() {
		return wavelengthUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWavelengthUnit(UnitsLength newWavelengthUnit) {
		UnitsLength oldWavelengthUnit = wavelengthUnit;
		wavelengthUnit = newWavelengthUnit == null ? WAVELENGTH_UNIT_EDEFAULT : newWavelengthUnit;
		boolean oldWavelengthUnitESet = wavelengthUnitESet;
		wavelengthUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__WAVELENGTH_UNIT, oldWavelengthUnit, wavelengthUnit, !oldWavelengthUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWavelengthUnit() {
		UnitsLength oldWavelengthUnit = wavelengthUnit;
		boolean oldWavelengthUnitESet = wavelengthUnitESet;
		wavelengthUnit = WAVELENGTH_UNIT_EDEFAULT;
		wavelengthUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__WAVELENGTH_UNIT, oldWavelengthUnit, WAVELENGTH_UNIT_EDEFAULT, oldWavelengthUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWavelengthUnit() {
		return wavelengthUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__ATTENUATION:
				return getAttenuation();
			case OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__ID:
				return getID();
			case OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__WAVELENGTH:
				return getWavelength();
			case OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__WAVELENGTH_UNIT:
				return getWavelengthUnit();
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
			case OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__ATTENUATION:
				setAttenuation((Float)newValue);
				return;
			case OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__ID:
				setID((String)newValue);
				return;
			case OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__WAVELENGTH:
				setWavelength((Float)newValue);
				return;
			case OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__WAVELENGTH_UNIT:
				setWavelengthUnit((UnitsLength)newValue);
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
			case OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__ATTENUATION:
				unsetAttenuation();
				return;
			case OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__WAVELENGTH:
				unsetWavelength();
				return;
			case OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__WAVELENGTH_UNIT:
				unsetWavelengthUnit();
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
			case OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__ATTENUATION:
				return isSetAttenuation();
			case OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__WAVELENGTH:
				return isSetWavelength();
			case OMEPackage.LIGHT_SOURCE_SETTINGS_TYPE__WAVELENGTH_UNIT:
				return isSetWavelengthUnit();
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
		result.append(" (attenuation: ");
		if (attenuationESet) result.append(attenuation); else result.append("<unset>");
		result.append(", iD: ");
		result.append(iD);
		result.append(", wavelength: ");
		if (wavelengthESet) result.append(wavelength); else result.append("<unset>");
		result.append(", wavelengthUnit: ");
		if (wavelengthUnitESet) result.append(wavelengthUnit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LightSourceSettingsTypeImpl
