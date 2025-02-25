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

import org.openmicroscopy.ome.MediumType;
import org.openmicroscopy.ome.OMEPackage;
import org.openmicroscopy.ome.ObjectiveSettingsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective Settings Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.impl.ObjectiveSettingsTypeImpl#getCorrectionCollar <em>Correction Collar</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ObjectiveSettingsTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ObjectiveSettingsTypeImpl#getMedium <em>Medium</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.impl.ObjectiveSettingsTypeImpl#getRefractiveIndex <em>Refractive Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectiveSettingsTypeImpl extends SettingsImpl implements ObjectiveSettingsType {
	/**
	 * The default value of the '{@link #getCorrectionCollar() <em>Correction Collar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectionCollar()
	 * @generated
	 * @ordered
	 */
	protected static final float CORRECTION_COLLAR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCorrectionCollar() <em>Correction Collar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrectionCollar()
	 * @generated
	 * @ordered
	 */
	protected float correctionCollar = CORRECTION_COLLAR_EDEFAULT;

	/**
	 * This is true if the Correction Collar attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean correctionCollarESet;

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
	 * The default value of the '{@link #getMedium() <em>Medium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedium()
	 * @generated
	 * @ordered
	 */
	protected static final MediumType MEDIUM_EDEFAULT = MediumType.AIR;

	/**
	 * The cached value of the '{@link #getMedium() <em>Medium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedium()
	 * @generated
	 * @ordered
	 */
	protected MediumType medium = MEDIUM_EDEFAULT;

	/**
	 * This is true if the Medium attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mediumESet;

	/**
	 * The default value of the '{@link #getRefractiveIndex() <em>Refractive Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefractiveIndex()
	 * @generated
	 * @ordered
	 */
	protected static final float REFRACTIVE_INDEX_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRefractiveIndex() <em>Refractive Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefractiveIndex()
	 * @generated
	 * @ordered
	 */
	protected float refractiveIndex = REFRACTIVE_INDEX_EDEFAULT;

	/**
	 * This is true if the Refractive Index attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean refractiveIndexESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveSettingsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMEPackage.eINSTANCE.getObjectiveSettingsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCorrectionCollar() {
		return correctionCollar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrectionCollar(float newCorrectionCollar) {
		float oldCorrectionCollar = correctionCollar;
		correctionCollar = newCorrectionCollar;
		boolean oldCorrectionCollarESet = correctionCollarESet;
		correctionCollarESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.OBJECTIVE_SETTINGS_TYPE__CORRECTION_COLLAR, oldCorrectionCollar, correctionCollar, !oldCorrectionCollarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCorrectionCollar() {
		float oldCorrectionCollar = correctionCollar;
		boolean oldCorrectionCollarESet = correctionCollarESet;
		correctionCollar = CORRECTION_COLLAR_EDEFAULT;
		correctionCollarESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.OBJECTIVE_SETTINGS_TYPE__CORRECTION_COLLAR, oldCorrectionCollar, CORRECTION_COLLAR_EDEFAULT, oldCorrectionCollarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCorrectionCollar() {
		return correctionCollarESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.OBJECTIVE_SETTINGS_TYPE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MediumType getMedium() {
		return medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMedium(MediumType newMedium) {
		MediumType oldMedium = medium;
		medium = newMedium == null ? MEDIUM_EDEFAULT : newMedium;
		boolean oldMediumESet = mediumESet;
		mediumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.OBJECTIVE_SETTINGS_TYPE__MEDIUM, oldMedium, medium, !oldMediumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMedium() {
		MediumType oldMedium = medium;
		boolean oldMediumESet = mediumESet;
		medium = MEDIUM_EDEFAULT;
		mediumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.OBJECTIVE_SETTINGS_TYPE__MEDIUM, oldMedium, MEDIUM_EDEFAULT, oldMediumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMedium() {
		return mediumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getRefractiveIndex() {
		return refractiveIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefractiveIndex(float newRefractiveIndex) {
		float oldRefractiveIndex = refractiveIndex;
		refractiveIndex = newRefractiveIndex;
		boolean oldRefractiveIndexESet = refractiveIndexESet;
		refractiveIndexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OMEPackage.OBJECTIVE_SETTINGS_TYPE__REFRACTIVE_INDEX, oldRefractiveIndex, refractiveIndex, !oldRefractiveIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRefractiveIndex() {
		float oldRefractiveIndex = refractiveIndex;
		boolean oldRefractiveIndexESet = refractiveIndexESet;
		refractiveIndex = REFRACTIVE_INDEX_EDEFAULT;
		refractiveIndexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OMEPackage.OBJECTIVE_SETTINGS_TYPE__REFRACTIVE_INDEX, oldRefractiveIndex, REFRACTIVE_INDEX_EDEFAULT, oldRefractiveIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRefractiveIndex() {
		return refractiveIndexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OMEPackage.OBJECTIVE_SETTINGS_TYPE__CORRECTION_COLLAR:
				return getCorrectionCollar();
			case OMEPackage.OBJECTIVE_SETTINGS_TYPE__ID:
				return getID();
			case OMEPackage.OBJECTIVE_SETTINGS_TYPE__MEDIUM:
				return getMedium();
			case OMEPackage.OBJECTIVE_SETTINGS_TYPE__REFRACTIVE_INDEX:
				return getRefractiveIndex();
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
			case OMEPackage.OBJECTIVE_SETTINGS_TYPE__CORRECTION_COLLAR:
				setCorrectionCollar((Float)newValue);
				return;
			case OMEPackage.OBJECTIVE_SETTINGS_TYPE__ID:
				setID((String)newValue);
				return;
			case OMEPackage.OBJECTIVE_SETTINGS_TYPE__MEDIUM:
				setMedium((MediumType)newValue);
				return;
			case OMEPackage.OBJECTIVE_SETTINGS_TYPE__REFRACTIVE_INDEX:
				setRefractiveIndex((Float)newValue);
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
			case OMEPackage.OBJECTIVE_SETTINGS_TYPE__CORRECTION_COLLAR:
				unsetCorrectionCollar();
				return;
			case OMEPackage.OBJECTIVE_SETTINGS_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case OMEPackage.OBJECTIVE_SETTINGS_TYPE__MEDIUM:
				unsetMedium();
				return;
			case OMEPackage.OBJECTIVE_SETTINGS_TYPE__REFRACTIVE_INDEX:
				unsetRefractiveIndex();
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
			case OMEPackage.OBJECTIVE_SETTINGS_TYPE__CORRECTION_COLLAR:
				return isSetCorrectionCollar();
			case OMEPackage.OBJECTIVE_SETTINGS_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case OMEPackage.OBJECTIVE_SETTINGS_TYPE__MEDIUM:
				return isSetMedium();
			case OMEPackage.OBJECTIVE_SETTINGS_TYPE__REFRACTIVE_INDEX:
				return isSetRefractiveIndex();
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
		result.append(" (correctionCollar: ");
		if (correctionCollarESet) result.append(correctionCollar); else result.append("<unset>");
		result.append(", iD: ");
		result.append(iD);
		result.append(", medium: ");
		if (mediumESet) result.append(medium); else result.append("<unset>");
		result.append(", refractiveIndex: ");
		if (refractiveIndexESet) result.append(refractiveIndex); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ObjectiveSettingsTypeImpl
