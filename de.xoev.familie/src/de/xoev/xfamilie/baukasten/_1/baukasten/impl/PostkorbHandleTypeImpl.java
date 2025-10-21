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
package de.xoev.xfamilie.baukasten._1.baukasten.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
import de.xoev.xfamilie.baukasten._1.baukasten.PostkorbHandleType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postkorb Handle Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostkorbHandleTypeImpl#getPostkorbHandle <em>Postkorb Handle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostkorbHandleTypeImpl#isZustimmungElektronischerBescheid <em>Zustimmung Elektronischer Bescheid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostkorbHandleTypeImpl extends MinimalEObjectImpl.Container implements PostkorbHandleType {
	/**
	 * The default value of the '{@link #getPostkorbHandle() <em>Postkorb Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostkorbHandle()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTKORB_HANDLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostkorbHandle() <em>Postkorb Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostkorbHandle()
	 * @generated
	 * @ordered
	 */
	protected String postkorbHandle = POSTKORB_HANDLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isZustimmungElektronischerBescheid() <em>Zustimmung Elektronischer Bescheid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungElektronischerBescheid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUSTIMMUNG_ELEKTRONISCHER_BESCHEID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZustimmungElektronischerBescheid() <em>Zustimmung Elektronischer Bescheid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungElektronischerBescheid()
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungElektronischerBescheid = ZUSTIMMUNG_ELEKTRONISCHER_BESCHEID_EDEFAULT;

	/**
	 * This is true if the Zustimmung Elektronischer Bescheid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungElektronischerBescheidESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostkorbHandleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.POSTKORB_HANDLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostkorbHandle() {
		return postkorbHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostkorbHandle(String newPostkorbHandle) {
		String oldPostkorbHandle = postkorbHandle;
		postkorbHandle = newPostkorbHandle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTKORB_HANDLE_TYPE__POSTKORB_HANDLE, oldPostkorbHandle, postkorbHandle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZustimmungElektronischerBescheid() {
		return zustimmungElektronischerBescheid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZustimmungElektronischerBescheid(boolean newZustimmungElektronischerBescheid) {
		boolean oldZustimmungElektronischerBescheid = zustimmungElektronischerBescheid;
		zustimmungElektronischerBescheid = newZustimmungElektronischerBescheid;
		boolean oldZustimmungElektronischerBescheidESet = zustimmungElektronischerBescheidESet;
		zustimmungElektronischerBescheidESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.POSTKORB_HANDLE_TYPE__ZUSTIMMUNG_ELEKTRONISCHER_BESCHEID, oldZustimmungElektronischerBescheid, zustimmungElektronischerBescheid, !oldZustimmungElektronischerBescheidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZustimmungElektronischerBescheid() {
		boolean oldZustimmungElektronischerBescheid = zustimmungElektronischerBescheid;
		boolean oldZustimmungElektronischerBescheidESet = zustimmungElektronischerBescheidESet;
		zustimmungElektronischerBescheid = ZUSTIMMUNG_ELEKTRONISCHER_BESCHEID_EDEFAULT;
		zustimmungElektronischerBescheidESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BaukastenPackage.POSTKORB_HANDLE_TYPE__ZUSTIMMUNG_ELEKTRONISCHER_BESCHEID, oldZustimmungElektronischerBescheid, ZUSTIMMUNG_ELEKTRONISCHER_BESCHEID_EDEFAULT, oldZustimmungElektronischerBescheidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZustimmungElektronischerBescheid() {
		return zustimmungElektronischerBescheidESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BaukastenPackage.POSTKORB_HANDLE_TYPE__POSTKORB_HANDLE:
				return getPostkorbHandle();
			case BaukastenPackage.POSTKORB_HANDLE_TYPE__ZUSTIMMUNG_ELEKTRONISCHER_BESCHEID:
				return isZustimmungElektronischerBescheid();
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
			case BaukastenPackage.POSTKORB_HANDLE_TYPE__POSTKORB_HANDLE:
				setPostkorbHandle((String)newValue);
				return;
			case BaukastenPackage.POSTKORB_HANDLE_TYPE__ZUSTIMMUNG_ELEKTRONISCHER_BESCHEID:
				setZustimmungElektronischerBescheid((Boolean)newValue);
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
			case BaukastenPackage.POSTKORB_HANDLE_TYPE__POSTKORB_HANDLE:
				setPostkorbHandle(POSTKORB_HANDLE_EDEFAULT);
				return;
			case BaukastenPackage.POSTKORB_HANDLE_TYPE__ZUSTIMMUNG_ELEKTRONISCHER_BESCHEID:
				unsetZustimmungElektronischerBescheid();
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
			case BaukastenPackage.POSTKORB_HANDLE_TYPE__POSTKORB_HANDLE:
				return POSTKORB_HANDLE_EDEFAULT == null ? postkorbHandle != null : !POSTKORB_HANDLE_EDEFAULT.equals(postkorbHandle);
			case BaukastenPackage.POSTKORB_HANDLE_TYPE__ZUSTIMMUNG_ELEKTRONISCHER_BESCHEID:
				return isSetZustimmungElektronischerBescheid();
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
		result.append(" (postkorbHandle: ");
		result.append(postkorbHandle);
		result.append(", zustimmungElektronischerBescheid: ");
		if (zustimmungElektronischerBescheidESet) result.append(zustimmungElektronischerBescheid); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PostkorbHandleTypeImpl
