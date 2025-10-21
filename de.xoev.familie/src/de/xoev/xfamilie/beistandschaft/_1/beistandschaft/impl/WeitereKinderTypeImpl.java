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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonOhneGeburtsnameType;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereKinderType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weitere Kinder Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.WeitereKinderTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.WeitereKinderTypeImpl#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeitereKinderTypeImpl extends MinimalEObjectImpl.Container implements WeitereKinderType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonOhneGeburtsnameType name;

	/**
	 * The default value of the '{@link #getGeburtsdatum() <em>Geburtsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdatum()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GEBURTSDATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeburtsdatum() <em>Geburtsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdatum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar geburtsdatum = GEBURTSDATUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeitereKinderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeistandschaftPackage.Literals.WEITERE_KINDER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonOhneGeburtsnameType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameNatuerlichePersonOhneGeburtsnameType newName, NotificationChain msgs) {
		NameNatuerlichePersonOhneGeburtsnameType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.WEITERE_KINDER_TYPE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(NameNatuerlichePersonOhneGeburtsnameType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.WEITERE_KINDER_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.WEITERE_KINDER_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.WEITERE_KINDER_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getGeburtsdatum() {
		return geburtsdatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeburtsdatum(XMLGregorianCalendar newGeburtsdatum) {
		XMLGregorianCalendar oldGeburtsdatum = geburtsdatum;
		geburtsdatum = newGeburtsdatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.WEITERE_KINDER_TYPE__GEBURTSDATUM, oldGeburtsdatum, geburtsdatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BeistandschaftPackage.WEITERE_KINDER_TYPE__NAME:
				return basicSetName(null, msgs);
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
			case BeistandschaftPackage.WEITERE_KINDER_TYPE__NAME:
				return getName();
			case BeistandschaftPackage.WEITERE_KINDER_TYPE__GEBURTSDATUM:
				return getGeburtsdatum();
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
			case BeistandschaftPackage.WEITERE_KINDER_TYPE__NAME:
				setName((NameNatuerlichePersonOhneGeburtsnameType)newValue);
				return;
			case BeistandschaftPackage.WEITERE_KINDER_TYPE__GEBURTSDATUM:
				setGeburtsdatum((XMLGregorianCalendar)newValue);
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
			case BeistandschaftPackage.WEITERE_KINDER_TYPE__NAME:
				setName((NameNatuerlichePersonOhneGeburtsnameType)null);
				return;
			case BeistandschaftPackage.WEITERE_KINDER_TYPE__GEBURTSDATUM:
				setGeburtsdatum(GEBURTSDATUM_EDEFAULT);
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
			case BeistandschaftPackage.WEITERE_KINDER_TYPE__NAME:
				return name != null;
			case BeistandschaftPackage.WEITERE_KINDER_TYPE__GEBURTSDATUM:
				return GEBURTSDATUM_EDEFAULT == null ? geburtsdatum != null : !GEBURTSDATUM_EDEFAULT.equals(geburtsdatum);
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
		result.append(" (geburtsdatum: ");
		result.append(geburtsdatum);
		result.append(')');
		return result.toString();
	}

} //WeitereKinderTypeImpl
