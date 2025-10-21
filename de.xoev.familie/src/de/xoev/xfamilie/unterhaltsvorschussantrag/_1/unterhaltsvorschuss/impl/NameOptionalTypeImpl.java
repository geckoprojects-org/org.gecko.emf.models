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

import de.xoev.xfamilie.baukasten._1.baukasten.AllgemeinerNameType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.NameOptionalType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Optional Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.NameOptionalTypeImpl#getFamiliennameUnstrukturiert <em>Familienname Unstrukturiert</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.NameOptionalTypeImpl#getGeburtsnameUnstrukturiert <em>Geburtsname Unstrukturiert</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.NameOptionalTypeImpl#getVornamen <em>Vornamen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameOptionalTypeImpl extends MinimalEObjectImpl.Container implements NameOptionalType {
	/**
	 * The cached value of the '{@link #getFamiliennameUnstrukturiert() <em>Familienname Unstrukturiert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamiliennameUnstrukturiert()
	 * @generated
	 * @ordered
	 */
	protected AllgemeinerNameType familiennameUnstrukturiert;

	/**
	 * The cached value of the '{@link #getGeburtsnameUnstrukturiert() <em>Geburtsname Unstrukturiert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsnameUnstrukturiert()
	 * @generated
	 * @ordered
	 */
	protected AllgemeinerNameType geburtsnameUnstrukturiert;

	/**
	 * The cached value of the '{@link #getVornamen() <em>Vornamen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVornamen()
	 * @generated
	 * @ordered
	 */
	protected AllgemeinerNameType vornamen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameOptionalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getNameOptionalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeinerNameType getFamiliennameUnstrukturiert() {
		return familiennameUnstrukturiert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFamiliennameUnstrukturiert(AllgemeinerNameType newFamiliennameUnstrukturiert, NotificationChain msgs) {
		AllgemeinerNameType oldFamiliennameUnstrukturiert = familiennameUnstrukturiert;
		familiennameUnstrukturiert = newFamiliennameUnstrukturiert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__FAMILIENNAME_UNSTRUKTURIERT, oldFamiliennameUnstrukturiert, newFamiliennameUnstrukturiert);
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
	public void setFamiliennameUnstrukturiert(AllgemeinerNameType newFamiliennameUnstrukturiert) {
		if (newFamiliennameUnstrukturiert != familiennameUnstrukturiert) {
			NotificationChain msgs = null;
			if (familiennameUnstrukturiert != null)
				msgs = ((InternalEObject)familiennameUnstrukturiert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__FAMILIENNAME_UNSTRUKTURIERT, null, msgs);
			if (newFamiliennameUnstrukturiert != null)
				msgs = ((InternalEObject)newFamiliennameUnstrukturiert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__FAMILIENNAME_UNSTRUKTURIERT, null, msgs);
			msgs = basicSetFamiliennameUnstrukturiert(newFamiliennameUnstrukturiert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__FAMILIENNAME_UNSTRUKTURIERT, newFamiliennameUnstrukturiert, newFamiliennameUnstrukturiert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeinerNameType getGeburtsnameUnstrukturiert() {
		return geburtsnameUnstrukturiert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburtsnameUnstrukturiert(AllgemeinerNameType newGeburtsnameUnstrukturiert, NotificationChain msgs) {
		AllgemeinerNameType oldGeburtsnameUnstrukturiert = geburtsnameUnstrukturiert;
		geburtsnameUnstrukturiert = newGeburtsnameUnstrukturiert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__GEBURTSNAME_UNSTRUKTURIERT, oldGeburtsnameUnstrukturiert, newGeburtsnameUnstrukturiert);
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
	public void setGeburtsnameUnstrukturiert(AllgemeinerNameType newGeburtsnameUnstrukturiert) {
		if (newGeburtsnameUnstrukturiert != geburtsnameUnstrukturiert) {
			NotificationChain msgs = null;
			if (geburtsnameUnstrukturiert != null)
				msgs = ((InternalEObject)geburtsnameUnstrukturiert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__GEBURTSNAME_UNSTRUKTURIERT, null, msgs);
			if (newGeburtsnameUnstrukturiert != null)
				msgs = ((InternalEObject)newGeburtsnameUnstrukturiert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__GEBURTSNAME_UNSTRUKTURIERT, null, msgs);
			msgs = basicSetGeburtsnameUnstrukturiert(newGeburtsnameUnstrukturiert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__GEBURTSNAME_UNSTRUKTURIERT, newGeburtsnameUnstrukturiert, newGeburtsnameUnstrukturiert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeinerNameType getVornamen() {
		return vornamen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVornamen(AllgemeinerNameType newVornamen, NotificationChain msgs) {
		AllgemeinerNameType oldVornamen = vornamen;
		vornamen = newVornamen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__VORNAMEN, oldVornamen, newVornamen);
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
	public void setVornamen(AllgemeinerNameType newVornamen) {
		if (newVornamen != vornamen) {
			NotificationChain msgs = null;
			if (vornamen != null)
				msgs = ((InternalEObject)vornamen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__VORNAMEN, null, msgs);
			if (newVornamen != null)
				msgs = ((InternalEObject)newVornamen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__VORNAMEN, null, msgs);
			msgs = basicSetVornamen(newVornamen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__VORNAMEN, newVornamen, newVornamen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__FAMILIENNAME_UNSTRUKTURIERT:
				return basicSetFamiliennameUnstrukturiert(null, msgs);
			case UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__GEBURTSNAME_UNSTRUKTURIERT:
				return basicSetGeburtsnameUnstrukturiert(null, msgs);
			case UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__VORNAMEN:
				return basicSetVornamen(null, msgs);
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
			case UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__FAMILIENNAME_UNSTRUKTURIERT:
				return getFamiliennameUnstrukturiert();
			case UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__GEBURTSNAME_UNSTRUKTURIERT:
				return getGeburtsnameUnstrukturiert();
			case UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__VORNAMEN:
				return getVornamen();
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
			case UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__FAMILIENNAME_UNSTRUKTURIERT:
				setFamiliennameUnstrukturiert((AllgemeinerNameType)newValue);
				return;
			case UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__GEBURTSNAME_UNSTRUKTURIERT:
				setGeburtsnameUnstrukturiert((AllgemeinerNameType)newValue);
				return;
			case UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__VORNAMEN:
				setVornamen((AllgemeinerNameType)newValue);
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
			case UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__FAMILIENNAME_UNSTRUKTURIERT:
				setFamiliennameUnstrukturiert((AllgemeinerNameType)null);
				return;
			case UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__GEBURTSNAME_UNSTRUKTURIERT:
				setGeburtsnameUnstrukturiert((AllgemeinerNameType)null);
				return;
			case UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__VORNAMEN:
				setVornamen((AllgemeinerNameType)null);
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
			case UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__FAMILIENNAME_UNSTRUKTURIERT:
				return familiennameUnstrukturiert != null;
			case UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__GEBURTSNAME_UNSTRUKTURIERT:
				return geburtsnameUnstrukturiert != null;
			case UnterhaltsvorschussPackage.NAME_OPTIONAL_TYPE__VORNAMEN:
				return vornamen != null;
		}
		return super.eIsSet(featureID);
	}

} //NameOptionalTypeImpl
