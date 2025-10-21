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

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.BegruendungDesHilfebedarfsType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Begruendung Des Hilfebedarfs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.BegruendungDesHilfebedarfsTypeImpl#getGrundBeantragung <em>Grund Beantragung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.BegruendungDesHilfebedarfsTypeImpl#getHilfeVomJugendamt <em>Hilfe Vom Jugendamt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BegruendungDesHilfebedarfsTypeImpl extends MinimalEObjectImpl.Container implements BegruendungDesHilfebedarfsType {
	/**
	 * The default value of the '{@link #getGrundBeantragung() <em>Grund Beantragung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrundBeantragung()
	 * @generated
	 * @ordered
	 */
	protected static final String GRUND_BEANTRAGUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrundBeantragung() <em>Grund Beantragung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrundBeantragung()
	 * @generated
	 * @ordered
	 */
	protected String grundBeantragung = GRUND_BEANTRAGUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getHilfeVomJugendamt() <em>Hilfe Vom Jugendamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHilfeVomJugendamt()
	 * @generated
	 * @ordered
	 */
	protected static final String HILFE_VOM_JUGENDAMT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHilfeVomJugendamt() <em>Hilfe Vom Jugendamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHilfeVomJugendamt()
	 * @generated
	 * @ordered
	 */
	protected String hilfeVomJugendamt = HILFE_VOM_JUGENDAMT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BegruendungDesHilfebedarfsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErziehungshilfePackage.Literals.BEGRUENDUNG_DES_HILFEBEDARFS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGrundBeantragung() {
		return grundBeantragung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrundBeantragung(String newGrundBeantragung) {
		String oldGrundBeantragung = grundBeantragung;
		grundBeantragung = newGrundBeantragung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.BEGRUENDUNG_DES_HILFEBEDARFS_TYPE__GRUND_BEANTRAGUNG, oldGrundBeantragung, grundBeantragung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHilfeVomJugendamt() {
		return hilfeVomJugendamt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHilfeVomJugendamt(String newHilfeVomJugendamt) {
		String oldHilfeVomJugendamt = hilfeVomJugendamt;
		hilfeVomJugendamt = newHilfeVomJugendamt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.BEGRUENDUNG_DES_HILFEBEDARFS_TYPE__HILFE_VOM_JUGENDAMT, oldHilfeVomJugendamt, hilfeVomJugendamt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErziehungshilfePackage.BEGRUENDUNG_DES_HILFEBEDARFS_TYPE__GRUND_BEANTRAGUNG:
				return getGrundBeantragung();
			case ErziehungshilfePackage.BEGRUENDUNG_DES_HILFEBEDARFS_TYPE__HILFE_VOM_JUGENDAMT:
				return getHilfeVomJugendamt();
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
			case ErziehungshilfePackage.BEGRUENDUNG_DES_HILFEBEDARFS_TYPE__GRUND_BEANTRAGUNG:
				setGrundBeantragung((String)newValue);
				return;
			case ErziehungshilfePackage.BEGRUENDUNG_DES_HILFEBEDARFS_TYPE__HILFE_VOM_JUGENDAMT:
				setHilfeVomJugendamt((String)newValue);
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
			case ErziehungshilfePackage.BEGRUENDUNG_DES_HILFEBEDARFS_TYPE__GRUND_BEANTRAGUNG:
				setGrundBeantragung(GRUND_BEANTRAGUNG_EDEFAULT);
				return;
			case ErziehungshilfePackage.BEGRUENDUNG_DES_HILFEBEDARFS_TYPE__HILFE_VOM_JUGENDAMT:
				setHilfeVomJugendamt(HILFE_VOM_JUGENDAMT_EDEFAULT);
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
			case ErziehungshilfePackage.BEGRUENDUNG_DES_HILFEBEDARFS_TYPE__GRUND_BEANTRAGUNG:
				return GRUND_BEANTRAGUNG_EDEFAULT == null ? grundBeantragung != null : !GRUND_BEANTRAGUNG_EDEFAULT.equals(grundBeantragung);
			case ErziehungshilfePackage.BEGRUENDUNG_DES_HILFEBEDARFS_TYPE__HILFE_VOM_JUGENDAMT:
				return HILFE_VOM_JUGENDAMT_EDEFAULT == null ? hilfeVomJugendamt != null : !HILFE_VOM_JUGENDAMT_EDEFAULT.equals(hilfeVomJugendamt);
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
		result.append(" (grundBeantragung: ");
		result.append(grundBeantragung);
		result.append(", hilfeVomJugendamt: ");
		result.append(hilfeVomJugendamt);
		result.append(')');
		return result.toString();
	}

} //BegruendungDesHilfebedarfsTypeImpl
