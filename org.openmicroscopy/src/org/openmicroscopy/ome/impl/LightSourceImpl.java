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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.openmicroscopy.ome.AnnotationRefType;
import org.openmicroscopy.ome.LightSource;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.UnitsPower;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Light Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.LightSourceImpl#getAnnotationRef <em>Annotation Ref</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LightSourceImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LightSourceImpl#getPower <em>Power</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.LightSourceImpl#getPowerUnit <em>Power Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LightSourceImpl extends ManufacturerSpecImpl implements LightSource {
	/**
	 * The cached value of the '{@link #getAnnotationRef() <em>Annotation Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationRef()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotationRefType> annotationRef;

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
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final float POWER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected float power = POWER_EDEFAULT;

	/**
	 * This is true if the Power attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean powerESet;

	/**
	 * The default value of the '{@link #getPowerUnit() <em>Power Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerUnit()
	 * @generated
	 * @ordered
	 */
	protected static final UnitsPower POWER_UNIT_EDEFAULT = UnitsPower.MW1;

	/**
	 * The cached value of the '{@link #getPowerUnit() <em>Power Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitsPower powerUnit = POWER_UNIT_EDEFAULT;

	/**
	 * This is true if the Power Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean powerUnitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LightSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getLightSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationRefType> getAnnotationRef() {
		if (annotationRef == null) {
			annotationRef = new EObjectContainmentEList<AnnotationRefType>(AnnotationRefType.class, this, OMEPackage.LIGHT_SOURCE__ANNOTATION_REF);
		}
		return annotationRef;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LIGHT_SOURCE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPower(float newPower) {
		float oldPower = power;
		power = newPower;
		boolean oldPowerESet = powerESet;
		powerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LIGHT_SOURCE__POWER, oldPower, power, !oldPowerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPower() {
		float oldPower = power;
		boolean oldPowerESet = powerESet;
		power = POWER_EDEFAULT;
		powerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LIGHT_SOURCE__POWER, oldPower, POWER_EDEFAULT, oldPowerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPower() {
		return powerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitsPower getPowerUnit() {
		return powerUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerUnit(UnitsPower newPowerUnit) {
		UnitsPower oldPowerUnit = powerUnit;
		powerUnit = newPowerUnit == null ? POWER_UNIT_EDEFAULT : newPowerUnit;
		boolean oldPowerUnitESet = powerUnitESet;
		powerUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.LIGHT_SOURCE__POWER_UNIT, oldPowerUnit, powerUnit, !oldPowerUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPowerUnit() {
		UnitsPower oldPowerUnit = powerUnit;
		boolean oldPowerUnitESet = powerUnitESet;
		powerUnit = POWER_UNIT_EDEFAULT;
		powerUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.LIGHT_SOURCE__POWER_UNIT, oldPowerUnit, POWER_UNIT_EDEFAULT, oldPowerUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPowerUnit() {
		return powerUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OMEPackage.LIGHT_SOURCE__ANNOTATION_REF:
				return ((InternalEList<?>)getAnnotationRef()).basicRemove(otherEnd, msgs);
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
			case OMEPackage.LIGHT_SOURCE__ANNOTATION_REF:
				return getAnnotationRef();
			case OMEPackage.LIGHT_SOURCE__ID:
				return getID();
			case OMEPackage.LIGHT_SOURCE__POWER:
				return getPower();
			case OMEPackage.LIGHT_SOURCE__POWER_UNIT:
				return getPowerUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OMEPackage.LIGHT_SOURCE__ANNOTATION_REF:
				getAnnotationRef().clear();
				getAnnotationRef().addAll((Collection<? extends AnnotationRefType>)newValue);
				return;
			case OMEPackage.LIGHT_SOURCE__ID:
				setID((String)newValue);
				return;
			case OMEPackage.LIGHT_SOURCE__POWER:
				setPower((Float)newValue);
				return;
			case OMEPackage.LIGHT_SOURCE__POWER_UNIT:
				setPowerUnit((UnitsPower)newValue);
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
			case OMEPackage.LIGHT_SOURCE__ANNOTATION_REF:
				getAnnotationRef().clear();
				return;
			case OMEPackage.LIGHT_SOURCE__ID:
				setID(ID_EDEFAULT);
				return;
			case OMEPackage.LIGHT_SOURCE__POWER:
				unsetPower();
				return;
			case OMEPackage.LIGHT_SOURCE__POWER_UNIT:
				unsetPowerUnit();
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
			case OMEPackage.LIGHT_SOURCE__ANNOTATION_REF:
				return annotationRef != null && !annotationRef.isEmpty();
			case OMEPackage.LIGHT_SOURCE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OMEPackage.LIGHT_SOURCE__POWER:
				return isSetPower();
			case OMEPackage.LIGHT_SOURCE__POWER_UNIT:
				return isSetPowerUnit();
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
		result.append(" (iD: ");
		result.append(iD);
		result.append(", power: ");
		if (powerESet) result.append(power); else result.append("<unset>");
		result.append(", powerUnit: ");
		if (powerUnitESet) result.append(powerUnit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LightSourceImpl
