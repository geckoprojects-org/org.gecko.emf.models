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

import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.PersonendatenType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personendaten Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.PersonendatenTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.PersonendatenTypeImpl#getWohnsitz <em>Wohnsitz</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.PersonendatenTypeImpl#getKrankenkasse <em>Krankenkasse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonendatenTypeImpl extends MinimalEObjectImpl.Container implements PersonendatenType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonType name;

	/**
	 * The cached value of the '{@link #getWohnsitz() <em>Wohnsitz</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnsitz()
	 * @generated
	 * @ordered
	 */
	protected EList<WohnsitzType> wohnsitz;

	/**
	 * The cached value of the '{@link #getKrankenkasse() <em>Krankenkasse</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKrankenkasse()
	 * @generated
	 * @ordered
	 */
	protected EList<KrankenkasseType> krankenkasse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonendatenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.PERSONENDATEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameNatuerlichePersonType newName, NotificationChain msgs) {
		NameNatuerlichePersonType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.PERSONENDATEN_TYPE__NAME, oldName, newName);
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
	public void setName(NameNatuerlichePersonType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.PERSONENDATEN_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.PERSONENDATEN_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.PERSONENDATEN_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WohnsitzType> getWohnsitz() {
		if (wohnsitz == null) {
			wohnsitz = new EObjectContainmentEList<WohnsitzType>(WohnsitzType.class, this, KinderwunschPackage.PERSONENDATEN_TYPE__WOHNSITZ);
		}
		return wohnsitz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KrankenkasseType> getKrankenkasse() {
		if (krankenkasse == null) {
			krankenkasse = new EObjectContainmentEList<KrankenkasseType>(KrankenkasseType.class, this, KinderwunschPackage.PERSONENDATEN_TYPE__KRANKENKASSE);
		}
		return krankenkasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinderwunschPackage.PERSONENDATEN_TYPE__NAME:
				return basicSetName(null, msgs);
			case KinderwunschPackage.PERSONENDATEN_TYPE__WOHNSITZ:
				return ((InternalEList<?>)getWohnsitz()).basicRemove(otherEnd, msgs);
			case KinderwunschPackage.PERSONENDATEN_TYPE__KRANKENKASSE:
				return ((InternalEList<?>)getKrankenkasse()).basicRemove(otherEnd, msgs);
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
			case KinderwunschPackage.PERSONENDATEN_TYPE__NAME:
				return getName();
			case KinderwunschPackage.PERSONENDATEN_TYPE__WOHNSITZ:
				return getWohnsitz();
			case KinderwunschPackage.PERSONENDATEN_TYPE__KRANKENKASSE:
				return getKrankenkasse();
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
			case KinderwunschPackage.PERSONENDATEN_TYPE__NAME:
				setName((NameNatuerlichePersonType)newValue);
				return;
			case KinderwunschPackage.PERSONENDATEN_TYPE__WOHNSITZ:
				getWohnsitz().clear();
				getWohnsitz().addAll((Collection<? extends WohnsitzType>)newValue);
				return;
			case KinderwunschPackage.PERSONENDATEN_TYPE__KRANKENKASSE:
				getKrankenkasse().clear();
				getKrankenkasse().addAll((Collection<? extends KrankenkasseType>)newValue);
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
			case KinderwunschPackage.PERSONENDATEN_TYPE__NAME:
				setName((NameNatuerlichePersonType)null);
				return;
			case KinderwunschPackage.PERSONENDATEN_TYPE__WOHNSITZ:
				getWohnsitz().clear();
				return;
			case KinderwunschPackage.PERSONENDATEN_TYPE__KRANKENKASSE:
				getKrankenkasse().clear();
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
			case KinderwunschPackage.PERSONENDATEN_TYPE__NAME:
				return name != null;
			case KinderwunschPackage.PERSONENDATEN_TYPE__WOHNSITZ:
				return wohnsitz != null && !wohnsitz.isEmpty();
			case KinderwunschPackage.PERSONENDATEN_TYPE__KRANKENKASSE:
				return krankenkasse != null && !krankenkasse.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PersonendatenTypeImpl
