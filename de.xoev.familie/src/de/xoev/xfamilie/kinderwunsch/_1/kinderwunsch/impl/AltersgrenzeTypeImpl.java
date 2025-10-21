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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Altersgrenze Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AltersgrenzeTypeImpl#getGeburtsdatumAustragendenPerson <em>Geburtsdatum Austragenden Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AltersgrenzeTypeImpl#getGeburtsdatumNichtaustragendenPerson <em>Geburtsdatum Nichtaustragenden Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AltersgrenzeTypeImpl#isKeinerKannAustragen <em>Keiner Kann Austragen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AltersgrenzeTypeImpl extends MinimalEObjectImpl.Container implements AltersgrenzeType {
	/**
	 * The default value of the '{@link #getGeburtsdatumAustragendenPerson() <em>Geburtsdatum Austragenden Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdatumAustragendenPerson()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GEBURTSDATUM_AUSTRAGENDEN_PERSON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeburtsdatumAustragendenPerson() <em>Geburtsdatum Austragenden Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdatumAustragendenPerson()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar geburtsdatumAustragendenPerson = GEBURTSDATUM_AUSTRAGENDEN_PERSON_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeburtsdatumNichtaustragendenPerson() <em>Geburtsdatum Nichtaustragenden Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdatumNichtaustragendenPerson()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GEBURTSDATUM_NICHTAUSTRAGENDEN_PERSON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeburtsdatumNichtaustragendenPerson() <em>Geburtsdatum Nichtaustragenden Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdatumNichtaustragendenPerson()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar geburtsdatumNichtaustragendenPerson = GEBURTSDATUM_NICHTAUSTRAGENDEN_PERSON_EDEFAULT;

	/**
	 * The default value of the '{@link #isKeinerKannAustragen() <em>Keiner Kann Austragen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeinerKannAustragen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KEINER_KANN_AUSTRAGEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKeinerKannAustragen() <em>Keiner Kann Austragen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKeinerKannAustragen()
	 * @generated
	 * @ordered
	 */
	protected boolean keinerKannAustragen = KEINER_KANN_AUSTRAGEN_EDEFAULT;

	/**
	 * This is true if the Keiner Kann Austragen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keinerKannAustragenESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AltersgrenzeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.ALTERSGRENZE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getGeburtsdatumAustragendenPerson() {
		return geburtsdatumAustragendenPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeburtsdatumAustragendenPerson(XMLGregorianCalendar newGeburtsdatumAustragendenPerson) {
		XMLGregorianCalendar oldGeburtsdatumAustragendenPerson = geburtsdatumAustragendenPerson;
		geburtsdatumAustragendenPerson = newGeburtsdatumAustragendenPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ALTERSGRENZE_TYPE__GEBURTSDATUM_AUSTRAGENDEN_PERSON, oldGeburtsdatumAustragendenPerson, geburtsdatumAustragendenPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getGeburtsdatumNichtaustragendenPerson() {
		return geburtsdatumNichtaustragendenPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeburtsdatumNichtaustragendenPerson(XMLGregorianCalendar newGeburtsdatumNichtaustragendenPerson) {
		XMLGregorianCalendar oldGeburtsdatumNichtaustragendenPerson = geburtsdatumNichtaustragendenPerson;
		geburtsdatumNichtaustragendenPerson = newGeburtsdatumNichtaustragendenPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ALTERSGRENZE_TYPE__GEBURTSDATUM_NICHTAUSTRAGENDEN_PERSON, oldGeburtsdatumNichtaustragendenPerson, geburtsdatumNichtaustragendenPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isKeinerKannAustragen() {
		return keinerKannAustragen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeinerKannAustragen(boolean newKeinerKannAustragen) {
		boolean oldKeinerKannAustragen = keinerKannAustragen;
		keinerKannAustragen = newKeinerKannAustragen;
		boolean oldKeinerKannAustragenESet = keinerKannAustragenESet;
		keinerKannAustragenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ALTERSGRENZE_TYPE__KEINER_KANN_AUSTRAGEN, oldKeinerKannAustragen, keinerKannAustragen, !oldKeinerKannAustragenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetKeinerKannAustragen() {
		boolean oldKeinerKannAustragen = keinerKannAustragen;
		boolean oldKeinerKannAustragenESet = keinerKannAustragenESet;
		keinerKannAustragen = KEINER_KANN_AUSTRAGEN_EDEFAULT;
		keinerKannAustragenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.ALTERSGRENZE_TYPE__KEINER_KANN_AUSTRAGEN, oldKeinerKannAustragen, KEINER_KANN_AUSTRAGEN_EDEFAULT, oldKeinerKannAustragenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetKeinerKannAustragen() {
		return keinerKannAustragenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KinderwunschPackage.ALTERSGRENZE_TYPE__GEBURTSDATUM_AUSTRAGENDEN_PERSON:
				return getGeburtsdatumAustragendenPerson();
			case KinderwunschPackage.ALTERSGRENZE_TYPE__GEBURTSDATUM_NICHTAUSTRAGENDEN_PERSON:
				return getGeburtsdatumNichtaustragendenPerson();
			case KinderwunschPackage.ALTERSGRENZE_TYPE__KEINER_KANN_AUSTRAGEN:
				return isKeinerKannAustragen();
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
			case KinderwunschPackage.ALTERSGRENZE_TYPE__GEBURTSDATUM_AUSTRAGENDEN_PERSON:
				setGeburtsdatumAustragendenPerson((XMLGregorianCalendar)newValue);
				return;
			case KinderwunschPackage.ALTERSGRENZE_TYPE__GEBURTSDATUM_NICHTAUSTRAGENDEN_PERSON:
				setGeburtsdatumNichtaustragendenPerson((XMLGregorianCalendar)newValue);
				return;
			case KinderwunschPackage.ALTERSGRENZE_TYPE__KEINER_KANN_AUSTRAGEN:
				setKeinerKannAustragen((Boolean)newValue);
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
			case KinderwunschPackage.ALTERSGRENZE_TYPE__GEBURTSDATUM_AUSTRAGENDEN_PERSON:
				setGeburtsdatumAustragendenPerson(GEBURTSDATUM_AUSTRAGENDEN_PERSON_EDEFAULT);
				return;
			case KinderwunschPackage.ALTERSGRENZE_TYPE__GEBURTSDATUM_NICHTAUSTRAGENDEN_PERSON:
				setGeburtsdatumNichtaustragendenPerson(GEBURTSDATUM_NICHTAUSTRAGENDEN_PERSON_EDEFAULT);
				return;
			case KinderwunschPackage.ALTERSGRENZE_TYPE__KEINER_KANN_AUSTRAGEN:
				unsetKeinerKannAustragen();
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
			case KinderwunschPackage.ALTERSGRENZE_TYPE__GEBURTSDATUM_AUSTRAGENDEN_PERSON:
				return GEBURTSDATUM_AUSTRAGENDEN_PERSON_EDEFAULT == null ? geburtsdatumAustragendenPerson != null : !GEBURTSDATUM_AUSTRAGENDEN_PERSON_EDEFAULT.equals(geburtsdatumAustragendenPerson);
			case KinderwunschPackage.ALTERSGRENZE_TYPE__GEBURTSDATUM_NICHTAUSTRAGENDEN_PERSON:
				return GEBURTSDATUM_NICHTAUSTRAGENDEN_PERSON_EDEFAULT == null ? geburtsdatumNichtaustragendenPerson != null : !GEBURTSDATUM_NICHTAUSTRAGENDEN_PERSON_EDEFAULT.equals(geburtsdatumNichtaustragendenPerson);
			case KinderwunschPackage.ALTERSGRENZE_TYPE__KEINER_KANN_AUSTRAGEN:
				return isSetKeinerKannAustragen();
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
		result.append(" (geburtsdatumAustragendenPerson: ");
		result.append(geburtsdatumAustragendenPerson);
		result.append(", geburtsdatumNichtaustragendenPerson: ");
		result.append(geburtsdatumNichtaustragendenPerson);
		result.append(", keinerKannAustragen: ");
		if (keinerKannAustragenESet) result.append(keinerKannAustragen); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AltersgrenzeTypeImpl
