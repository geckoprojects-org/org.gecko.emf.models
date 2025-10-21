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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.ErreichbarkeitTypeImpl;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErreichbarkeitHZEType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erreichbarkeit HZE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.ErreichbarkeitHZETypeImpl#getZeitErreichbarkeitHZE <em>Zeit Erreichbarkeit HZE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErreichbarkeitHZETypeImpl extends ErreichbarkeitTypeImpl implements ErreichbarkeitHZEType {
	/**
	 * The default value of the '{@link #getZeitErreichbarkeitHZE() <em>Zeit Erreichbarkeit HZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitErreichbarkeitHZE()
	 * @generated
	 * @ordered
	 */
	protected static final String ZEIT_ERREICHBARKEIT_HZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZeitErreichbarkeitHZE() <em>Zeit Erreichbarkeit HZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitErreichbarkeitHZE()
	 * @generated
	 * @ordered
	 */
	protected String zeitErreichbarkeitHZE = ZEIT_ERREICHBARKEIT_HZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErreichbarkeitHZETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErziehungshilfePackage.Literals.ERREICHBARKEIT_HZE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZeitErreichbarkeitHZE() {
		return zeitErreichbarkeitHZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZeitErreichbarkeitHZE(String newZeitErreichbarkeitHZE) {
		String oldZeitErreichbarkeitHZE = zeitErreichbarkeitHZE;
		zeitErreichbarkeitHZE = newZeitErreichbarkeitHZE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ERREICHBARKEIT_HZE_TYPE__ZEIT_ERREICHBARKEIT_HZE, oldZeitErreichbarkeitHZE, zeitErreichbarkeitHZE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErziehungshilfePackage.ERREICHBARKEIT_HZE_TYPE__ZEIT_ERREICHBARKEIT_HZE:
				return getZeitErreichbarkeitHZE();
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
			case ErziehungshilfePackage.ERREICHBARKEIT_HZE_TYPE__ZEIT_ERREICHBARKEIT_HZE:
				setZeitErreichbarkeitHZE((String)newValue);
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
			case ErziehungshilfePackage.ERREICHBARKEIT_HZE_TYPE__ZEIT_ERREICHBARKEIT_HZE:
				setZeitErreichbarkeitHZE(ZEIT_ERREICHBARKEIT_HZE_EDEFAULT);
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
			case ErziehungshilfePackage.ERREICHBARKEIT_HZE_TYPE__ZEIT_ERREICHBARKEIT_HZE:
				return ZEIT_ERREICHBARKEIT_HZE_EDEFAULT == null ? zeitErreichbarkeitHZE != null : !ZEIT_ERREICHBARKEIT_HZE_EDEFAULT.equals(zeitErreichbarkeitHZE);
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
		result.append(" (zeitErreichbarkeitHZE: ");
		result.append(zeitErreichbarkeitHZE);
		result.append(')');
		return result.toString();
	}

} //ErreichbarkeitHZETypeImpl
