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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datenschutz Und Einwilligung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DatenschutzUndEinwilligungTypeImpl#getAllgemeineDatenschutzerklaerung <em>Allgemeine Datenschutzerklaerung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DatenschutzUndEinwilligungTypeImpl#isKenntnissnahmeDatenschutzerklaerung <em>Kenntnissnahme Datenschutzerklaerung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatenschutzUndEinwilligungTypeImpl extends MinimalEObjectImpl.Container implements DatenschutzUndEinwilligungType {
	/**
	 * The default value of the '{@link #getAllgemeineDatenschutzerklaerung() <em>Allgemeine Datenschutzerklaerung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllgemeineDatenschutzerklaerung()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLGEMEINE_DATENSCHUTZERKLAERUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllgemeineDatenschutzerklaerung() <em>Allgemeine Datenschutzerklaerung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllgemeineDatenschutzerklaerung()
	 * @generated
	 * @ordered
	 */
	protected String allgemeineDatenschutzerklaerung = ALLGEMEINE_DATENSCHUTZERKLAERUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #isKenntnissnahmeDatenschutzerklaerung() <em>Kenntnissnahme Datenschutzerklaerung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKenntnissnahmeDatenschutzerklaerung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KENNTNISSNAHME_DATENSCHUTZERKLAERUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKenntnissnahmeDatenschutzerklaerung() <em>Kenntnissnahme Datenschutzerklaerung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKenntnissnahmeDatenschutzerklaerung()
	 * @generated
	 * @ordered
	 */
	protected boolean kenntnissnahmeDatenschutzerklaerung = KENNTNISSNAHME_DATENSCHUTZERKLAERUNG_EDEFAULT;

	/**
	 * This is true if the Kenntnissnahme Datenschutzerklaerung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kenntnissnahmeDatenschutzerklaerungESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatenschutzUndEinwilligungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.DATENSCHUTZ_UND_EINWILLIGUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllgemeineDatenschutzerklaerung() {
		return allgemeineDatenschutzerklaerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllgemeineDatenschutzerklaerung(String newAllgemeineDatenschutzerklaerung) {
		String oldAllgemeineDatenschutzerklaerung = allgemeineDatenschutzerklaerung;
		allgemeineDatenschutzerklaerung = newAllgemeineDatenschutzerklaerung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.DATENSCHUTZ_UND_EINWILLIGUNG_TYPE__ALLGEMEINE_DATENSCHUTZERKLAERUNG, oldAllgemeineDatenschutzerklaerung, allgemeineDatenschutzerklaerung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isKenntnissnahmeDatenschutzerklaerung() {
		return kenntnissnahmeDatenschutzerklaerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKenntnissnahmeDatenschutzerklaerung(boolean newKenntnissnahmeDatenschutzerklaerung) {
		boolean oldKenntnissnahmeDatenschutzerklaerung = kenntnissnahmeDatenschutzerklaerung;
		kenntnissnahmeDatenschutzerklaerung = newKenntnissnahmeDatenschutzerklaerung;
		boolean oldKenntnissnahmeDatenschutzerklaerungESet = kenntnissnahmeDatenschutzerklaerungESet;
		kenntnissnahmeDatenschutzerklaerungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.DATENSCHUTZ_UND_EINWILLIGUNG_TYPE__KENNTNISSNAHME_DATENSCHUTZERKLAERUNG, oldKenntnissnahmeDatenschutzerklaerung, kenntnissnahmeDatenschutzerklaerung, !oldKenntnissnahmeDatenschutzerklaerungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetKenntnissnahmeDatenschutzerklaerung() {
		boolean oldKenntnissnahmeDatenschutzerklaerung = kenntnissnahmeDatenschutzerklaerung;
		boolean oldKenntnissnahmeDatenschutzerklaerungESet = kenntnissnahmeDatenschutzerklaerungESet;
		kenntnissnahmeDatenschutzerklaerung = KENNTNISSNAHME_DATENSCHUTZERKLAERUNG_EDEFAULT;
		kenntnissnahmeDatenschutzerklaerungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.DATENSCHUTZ_UND_EINWILLIGUNG_TYPE__KENNTNISSNAHME_DATENSCHUTZERKLAERUNG, oldKenntnissnahmeDatenschutzerklaerung, KENNTNISSNAHME_DATENSCHUTZERKLAERUNG_EDEFAULT, oldKenntnissnahmeDatenschutzerklaerungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetKenntnissnahmeDatenschutzerklaerung() {
		return kenntnissnahmeDatenschutzerklaerungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdoptionPackage.DATENSCHUTZ_UND_EINWILLIGUNG_TYPE__ALLGEMEINE_DATENSCHUTZERKLAERUNG:
				return getAllgemeineDatenschutzerklaerung();
			case AdoptionPackage.DATENSCHUTZ_UND_EINWILLIGUNG_TYPE__KENNTNISSNAHME_DATENSCHUTZERKLAERUNG:
				return isKenntnissnahmeDatenschutzerklaerung();
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
			case AdoptionPackage.DATENSCHUTZ_UND_EINWILLIGUNG_TYPE__ALLGEMEINE_DATENSCHUTZERKLAERUNG:
				setAllgemeineDatenschutzerklaerung((String)newValue);
				return;
			case AdoptionPackage.DATENSCHUTZ_UND_EINWILLIGUNG_TYPE__KENNTNISSNAHME_DATENSCHUTZERKLAERUNG:
				setKenntnissnahmeDatenschutzerklaerung((Boolean)newValue);
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
			case AdoptionPackage.DATENSCHUTZ_UND_EINWILLIGUNG_TYPE__ALLGEMEINE_DATENSCHUTZERKLAERUNG:
				setAllgemeineDatenschutzerklaerung(ALLGEMEINE_DATENSCHUTZERKLAERUNG_EDEFAULT);
				return;
			case AdoptionPackage.DATENSCHUTZ_UND_EINWILLIGUNG_TYPE__KENNTNISSNAHME_DATENSCHUTZERKLAERUNG:
				unsetKenntnissnahmeDatenschutzerklaerung();
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
			case AdoptionPackage.DATENSCHUTZ_UND_EINWILLIGUNG_TYPE__ALLGEMEINE_DATENSCHUTZERKLAERUNG:
				return ALLGEMEINE_DATENSCHUTZERKLAERUNG_EDEFAULT == null ? allgemeineDatenschutzerklaerung != null : !ALLGEMEINE_DATENSCHUTZERKLAERUNG_EDEFAULT.equals(allgemeineDatenschutzerklaerung);
			case AdoptionPackage.DATENSCHUTZ_UND_EINWILLIGUNG_TYPE__KENNTNISSNAHME_DATENSCHUTZERKLAERUNG:
				return isSetKenntnissnahmeDatenschutzerklaerung();
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
		result.append(" (allgemeineDatenschutzerklaerung: ");
		result.append(allgemeineDatenschutzerklaerung);
		result.append(", kenntnissnahmeDatenschutzerklaerung: ");
		if (kenntnissnahmeDatenschutzerklaerungESet) result.append(kenntnissnahmeDatenschutzerklaerung); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DatenschutzUndEinwilligungTypeImpl
