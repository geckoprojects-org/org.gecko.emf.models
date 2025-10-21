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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeKindWohnhaftBeiType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.WeitereGemeinsameKinderType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weitere Gemeinsame Kinder Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.WeitereGemeinsameKinderTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.WeitereGemeinsameKinderTypeImpl#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.WeitereGemeinsameKinderTypeImpl#getWohnhaftBei <em>Wohnhaft Bei</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeitereGemeinsameKinderTypeImpl extends MinimalEObjectImpl.Container implements WeitereGemeinsameKinderType {
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
	 * The cached value of the '{@link #getGeburtsdatum() <em>Geburtsdatum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdatum()
	 * @generated
	 * @ordered
	 */
	protected TeilbekanntesDatumType geburtsdatum;

	/**
	 * The cached value of the '{@link #getWohnhaftBei() <em>Wohnhaft Bei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnhaftBei()
	 * @generated
	 * @ordered
	 */
	protected CodeKindWohnhaftBeiType wohnhaftBei;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeitereGemeinsameKinderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getWeitereGemeinsameKinderType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeilbekanntesDatumType getGeburtsdatum() {
		return geburtsdatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburtsdatum(TeilbekanntesDatumType newGeburtsdatum, NotificationChain msgs) {
		TeilbekanntesDatumType oldGeburtsdatum = geburtsdatum;
		geburtsdatum = newGeburtsdatum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__GEBURTSDATUM, oldGeburtsdatum, newGeburtsdatum);
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
	public void setGeburtsdatum(TeilbekanntesDatumType newGeburtsdatum) {
		if (newGeburtsdatum != geburtsdatum) {
			NotificationChain msgs = null;
			if (geburtsdatum != null)
				msgs = ((InternalEObject)geburtsdatum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__GEBURTSDATUM, null, msgs);
			if (newGeburtsdatum != null)
				msgs = ((InternalEObject)newGeburtsdatum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__GEBURTSDATUM, null, msgs);
			msgs = basicSetGeburtsdatum(newGeburtsdatum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__GEBURTSDATUM, newGeburtsdatum, newGeburtsdatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeKindWohnhaftBeiType getWohnhaftBei() {
		return wohnhaftBei;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWohnhaftBei(CodeKindWohnhaftBeiType newWohnhaftBei, NotificationChain msgs) {
		CodeKindWohnhaftBeiType oldWohnhaftBei = wohnhaftBei;
		wohnhaftBei = newWohnhaftBei;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__WOHNHAFT_BEI, oldWohnhaftBei, newWohnhaftBei);
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
	public void setWohnhaftBei(CodeKindWohnhaftBeiType newWohnhaftBei) {
		if (newWohnhaftBei != wohnhaftBei) {
			NotificationChain msgs = null;
			if (wohnhaftBei != null)
				msgs = ((InternalEObject)wohnhaftBei).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__WOHNHAFT_BEI, null, msgs);
			if (newWohnhaftBei != null)
				msgs = ((InternalEObject)newWohnhaftBei).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__WOHNHAFT_BEI, null, msgs);
			msgs = basicSetWohnhaftBei(newWohnhaftBei, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__WOHNHAFT_BEI, newWohnhaftBei, newWohnhaftBei));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__NAME:
				return basicSetName(null, msgs);
			case UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__GEBURTSDATUM:
				return basicSetGeburtsdatum(null, msgs);
			case UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__WOHNHAFT_BEI:
				return basicSetWohnhaftBei(null, msgs);
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
			case UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__NAME:
				return getName();
			case UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__GEBURTSDATUM:
				return getGeburtsdatum();
			case UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__WOHNHAFT_BEI:
				return getWohnhaftBei();
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
			case UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__NAME:
				setName((NameNatuerlichePersonType)newValue);
				return;
			case UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__GEBURTSDATUM:
				setGeburtsdatum((TeilbekanntesDatumType)newValue);
				return;
			case UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__WOHNHAFT_BEI:
				setWohnhaftBei((CodeKindWohnhaftBeiType)newValue);
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
			case UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__NAME:
				setName((NameNatuerlichePersonType)null);
				return;
			case UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__GEBURTSDATUM:
				setGeburtsdatum((TeilbekanntesDatumType)null);
				return;
			case UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__WOHNHAFT_BEI:
				setWohnhaftBei((CodeKindWohnhaftBeiType)null);
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
			case UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__NAME:
				return name != null;
			case UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__GEBURTSDATUM:
				return geburtsdatum != null;
			case UnterhaltsvorschussPackage.WEITERE_GEMEINSAME_KINDER_TYPE__WOHNHAFT_BEI:
				return wohnhaftBei != null;
		}
		return super.eIsSet(featureID);
	}

} //WeitereGemeinsameKinderTypeImpl
