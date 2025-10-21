/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digitaler Rueckkanal Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DigitalerRueckkanalTypeImpl#getPostfachUUID <em>Postfach UUID</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DigitalerRueckkanalTypeImpl#isEinverstaendnisDigitalerRueckkanal <em>Einverstaendnis Digitaler Rueckkanal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DigitalerRueckkanalTypeImpl extends MinimalEObjectImpl.Container implements DigitalerRueckkanalType {
	/**
	 * The default value of the '{@link #getPostfachUUID() <em>Postfach UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostfachUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTFACH_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostfachUUID() <em>Postfach UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostfachUUID()
	 * @generated
	 * @ordered
	 */
	protected String postfachUUID = POSTFACH_UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #isEinverstaendnisDigitalerRueckkanal() <em>Einverstaendnis Digitaler Rueckkanal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinverstaendnisDigitalerRueckkanal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EINVERSTAENDNIS_DIGITALER_RUECKKANAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEinverstaendnisDigitalerRueckkanal() <em>Einverstaendnis Digitaler Rueckkanal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinverstaendnisDigitalerRueckkanal()
	 * @generated
	 * @ordered
	 */
	protected boolean einverstaendnisDigitalerRueckkanal = EINVERSTAENDNIS_DIGITALER_RUECKKANAL_EDEFAULT;

	/**
	 * This is true if the Einverstaendnis Digitaler Rueckkanal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean einverstaendnisDigitalerRueckkanalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalerRueckkanalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.DIGITALER_RUECKKANAL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostfachUUID() {
		return postfachUUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostfachUUID(String newPostfachUUID) {
		String oldPostfachUUID = postfachUUID;
		postfachUUID = newPostfachUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.DIGITALER_RUECKKANAL_TYPE__POSTFACH_UUID, oldPostfachUUID, postfachUUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEinverstaendnisDigitalerRueckkanal() {
		return einverstaendnisDigitalerRueckkanal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinverstaendnisDigitalerRueckkanal(boolean newEinverstaendnisDigitalerRueckkanal) {
		boolean oldEinverstaendnisDigitalerRueckkanal = einverstaendnisDigitalerRueckkanal;
		einverstaendnisDigitalerRueckkanal = newEinverstaendnisDigitalerRueckkanal;
		boolean oldEinverstaendnisDigitalerRueckkanalESet = einverstaendnisDigitalerRueckkanalESet;
		einverstaendnisDigitalerRueckkanalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.DIGITALER_RUECKKANAL_TYPE__EINVERSTAENDNIS_DIGITALER_RUECKKANAL, oldEinverstaendnisDigitalerRueckkanal, einverstaendnisDigitalerRueckkanal, !oldEinverstaendnisDigitalerRueckkanalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEinverstaendnisDigitalerRueckkanal() {
		boolean oldEinverstaendnisDigitalerRueckkanal = einverstaendnisDigitalerRueckkanal;
		boolean oldEinverstaendnisDigitalerRueckkanalESet = einverstaendnisDigitalerRueckkanalESet;
		einverstaendnisDigitalerRueckkanal = EINVERSTAENDNIS_DIGITALER_RUECKKANAL_EDEFAULT;
		einverstaendnisDigitalerRueckkanalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.DIGITALER_RUECKKANAL_TYPE__EINVERSTAENDNIS_DIGITALER_RUECKKANAL, oldEinverstaendnisDigitalerRueckkanal, EINVERSTAENDNIS_DIGITALER_RUECKKANAL_EDEFAULT, oldEinverstaendnisDigitalerRueckkanalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEinverstaendnisDigitalerRueckkanal() {
		return einverstaendnisDigitalerRueckkanalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdoptionPackage.DIGITALER_RUECKKANAL_TYPE__POSTFACH_UUID:
				return getPostfachUUID();
			case AdoptionPackage.DIGITALER_RUECKKANAL_TYPE__EINVERSTAENDNIS_DIGITALER_RUECKKANAL:
				return isEinverstaendnisDigitalerRueckkanal();
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
			case AdoptionPackage.DIGITALER_RUECKKANAL_TYPE__POSTFACH_UUID:
				setPostfachUUID((String)newValue);
				return;
			case AdoptionPackage.DIGITALER_RUECKKANAL_TYPE__EINVERSTAENDNIS_DIGITALER_RUECKKANAL:
				setEinverstaendnisDigitalerRueckkanal((Boolean)newValue);
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
			case AdoptionPackage.DIGITALER_RUECKKANAL_TYPE__POSTFACH_UUID:
				setPostfachUUID(POSTFACH_UUID_EDEFAULT);
				return;
			case AdoptionPackage.DIGITALER_RUECKKANAL_TYPE__EINVERSTAENDNIS_DIGITALER_RUECKKANAL:
				unsetEinverstaendnisDigitalerRueckkanal();
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
			case AdoptionPackage.DIGITALER_RUECKKANAL_TYPE__POSTFACH_UUID:
				return POSTFACH_UUID_EDEFAULT == null ? postfachUUID != null : !POSTFACH_UUID_EDEFAULT.equals(postfachUUID);
			case AdoptionPackage.DIGITALER_RUECKKANAL_TYPE__EINVERSTAENDNIS_DIGITALER_RUECKKANAL:
				return isSetEinverstaendnisDigitalerRueckkanal();
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
		result.append(" (postfachUUID: ");
		result.append(postfachUUID);
		result.append(", einverstaendnisDigitalerRueckkanal: ");
		if (einverstaendnisDigitalerRueckkanalESet) result.append(einverstaendnisDigitalerRueckkanal); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DigitalerRueckkanalTypeImpl
