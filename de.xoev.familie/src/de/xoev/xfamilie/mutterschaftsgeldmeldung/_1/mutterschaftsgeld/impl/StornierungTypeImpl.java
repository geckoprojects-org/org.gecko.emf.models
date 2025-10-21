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
package de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl;

import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.StornierungType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stornierung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.StornierungTypeImpl#isStornokennzeichen <em>Stornokennzeichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.StornierungTypeImpl#getDatensatzIDUrsprungsmeldung <em>Datensatz ID Ursprungsmeldung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StornierungTypeImpl extends MinimalEObjectImpl.Container implements StornierungType {
	/**
	 * The default value of the '{@link #isStornokennzeichen() <em>Stornokennzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStornokennzeichen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STORNOKENNZEICHEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStornokennzeichen() <em>Stornokennzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStornokennzeichen()
	 * @generated
	 * @ordered
	 */
	protected boolean stornokennzeichen = STORNOKENNZEICHEN_EDEFAULT;

	/**
	 * This is true if the Stornokennzeichen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stornokennzeichenESet;

	/**
	 * The default value of the '{@link #getDatensatzIDUrsprungsmeldung() <em>Datensatz ID Ursprungsmeldung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatensatzIDUrsprungsmeldung()
	 * @generated
	 * @ordered
	 */
	protected static final String DATENSATZ_ID_URSPRUNGSMELDUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatensatzIDUrsprungsmeldung() <em>Datensatz ID Ursprungsmeldung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatensatzIDUrsprungsmeldung()
	 * @generated
	 * @ordered
	 */
	protected String datensatzIDUrsprungsmeldung = DATENSATZ_ID_URSPRUNGSMELDUNG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StornierungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutterschaftsgeldPackage.Literals.STORNIERUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStornokennzeichen() {
		return stornokennzeichen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStornokennzeichen(boolean newStornokennzeichen) {
		boolean oldStornokennzeichen = stornokennzeichen;
		stornokennzeichen = newStornokennzeichen;
		boolean oldStornokennzeichenESet = stornokennzeichenESet;
		stornokennzeichenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.STORNIERUNG_TYPE__STORNOKENNZEICHEN, oldStornokennzeichen, stornokennzeichen, !oldStornokennzeichenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStornokennzeichen() {
		boolean oldStornokennzeichen = stornokennzeichen;
		boolean oldStornokennzeichenESet = stornokennzeichenESet;
		stornokennzeichen = STORNOKENNZEICHEN_EDEFAULT;
		stornokennzeichenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MutterschaftsgeldPackage.STORNIERUNG_TYPE__STORNOKENNZEICHEN, oldStornokennzeichen, STORNOKENNZEICHEN_EDEFAULT, oldStornokennzeichenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStornokennzeichen() {
		return stornokennzeichenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatensatzIDUrsprungsmeldung() {
		return datensatzIDUrsprungsmeldung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatensatzIDUrsprungsmeldung(String newDatensatzIDUrsprungsmeldung) {
		String oldDatensatzIDUrsprungsmeldung = datensatzIDUrsprungsmeldung;
		datensatzIDUrsprungsmeldung = newDatensatzIDUrsprungsmeldung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MutterschaftsgeldPackage.STORNIERUNG_TYPE__DATENSATZ_ID_URSPRUNGSMELDUNG, oldDatensatzIDUrsprungsmeldung, datensatzIDUrsprungsmeldung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MutterschaftsgeldPackage.STORNIERUNG_TYPE__STORNOKENNZEICHEN:
				return isStornokennzeichen();
			case MutterschaftsgeldPackage.STORNIERUNG_TYPE__DATENSATZ_ID_URSPRUNGSMELDUNG:
				return getDatensatzIDUrsprungsmeldung();
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
			case MutterschaftsgeldPackage.STORNIERUNG_TYPE__STORNOKENNZEICHEN:
				setStornokennzeichen((Boolean)newValue);
				return;
			case MutterschaftsgeldPackage.STORNIERUNG_TYPE__DATENSATZ_ID_URSPRUNGSMELDUNG:
				setDatensatzIDUrsprungsmeldung((String)newValue);
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
			case MutterschaftsgeldPackage.STORNIERUNG_TYPE__STORNOKENNZEICHEN:
				unsetStornokennzeichen();
				return;
			case MutterschaftsgeldPackage.STORNIERUNG_TYPE__DATENSATZ_ID_URSPRUNGSMELDUNG:
				setDatensatzIDUrsprungsmeldung(DATENSATZ_ID_URSPRUNGSMELDUNG_EDEFAULT);
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
			case MutterschaftsgeldPackage.STORNIERUNG_TYPE__STORNOKENNZEICHEN:
				return isSetStornokennzeichen();
			case MutterschaftsgeldPackage.STORNIERUNG_TYPE__DATENSATZ_ID_URSPRUNGSMELDUNG:
				return DATENSATZ_ID_URSPRUNGSMELDUNG_EDEFAULT == null ? datensatzIDUrsprungsmeldung != null : !DATENSATZ_ID_URSPRUNGSMELDUNG_EDEFAULT.equals(datensatzIDUrsprungsmeldung);
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
		result.append(" (stornokennzeichen: ");
		if (stornokennzeichenESet) result.append(stornokennzeichen); else result.append("<unset>");
		result.append(", datensatzIDUrsprungsmeldung: ");
		result.append(datensatzIDUrsprungsmeldung);
		result.append(')');
		return result.toString();
	}

} //StornierungTypeImpl
