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

import de.xoev.xfamilie.baukasten._1.baukasten.AllgemeinerNameType;
import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
import de.xoev.xfamilie.baukasten._1.baukasten.FamiliennameUnstrukturiertType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Familienname Unstrukturiert Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.FamiliennameUnstrukturiertTypeImpl#getNachname <em>Nachname</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.FamiliennameUnstrukturiertTypeImpl#getNachnamepass <em>Nachnamepass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FamiliennameUnstrukturiertTypeImpl extends MinimalEObjectImpl.Container implements FamiliennameUnstrukturiertType {
	/**
	 * The cached value of the '{@link #getNachname() <em>Nachname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachname()
	 * @generated
	 * @ordered
	 */
	protected AllgemeinerNameType nachname;

	/**
	 * The cached value of the '{@link #getNachnamepass() <em>Nachnamepass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachnamepass()
	 * @generated
	 * @ordered
	 */
	protected AllgemeinerNameType nachnamepass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamiliennameUnstrukturiertTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.FAMILIENNAME_UNSTRUKTURIERT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeinerNameType getNachname() {
		return nachname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachname(AllgemeinerNameType newNachname, NotificationChain msgs) {
		AllgemeinerNameType oldNachname = nachname;
		nachname = newNachname;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAME, oldNachname, newNachname);
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
	public void setNachname(AllgemeinerNameType newNachname) {
		if (newNachname != nachname) {
			NotificationChain msgs = null;
			if (nachname != null)
				msgs = ((InternalEObject)nachname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAME, null, msgs);
			if (newNachname != null)
				msgs = ((InternalEObject)newNachname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAME, null, msgs);
			msgs = basicSetNachname(newNachname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAME, newNachname, newNachname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeinerNameType getNachnamepass() {
		return nachnamepass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachnamepass(AllgemeinerNameType newNachnamepass, NotificationChain msgs) {
		AllgemeinerNameType oldNachnamepass = nachnamepass;
		nachnamepass = newNachnamepass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAMEPASS, oldNachnamepass, newNachnamepass);
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
	public void setNachnamepass(AllgemeinerNameType newNachnamepass) {
		if (newNachnamepass != nachnamepass) {
			NotificationChain msgs = null;
			if (nachnamepass != null)
				msgs = ((InternalEObject)nachnamepass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAMEPASS, null, msgs);
			if (newNachnamepass != null)
				msgs = ((InternalEObject)newNachnamepass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAMEPASS, null, msgs);
			msgs = basicSetNachnamepass(newNachnamepass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAMEPASS, newNachnamepass, newNachnamepass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAME:
				return basicSetNachname(null, msgs);
			case BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAMEPASS:
				return basicSetNachnamepass(null, msgs);
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
			case BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAME:
				return getNachname();
			case BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAMEPASS:
				return getNachnamepass();
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
			case BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAME:
				setNachname((AllgemeinerNameType)newValue);
				return;
			case BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAMEPASS:
				setNachnamepass((AllgemeinerNameType)newValue);
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
			case BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAME:
				setNachname((AllgemeinerNameType)null);
				return;
			case BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAMEPASS:
				setNachnamepass((AllgemeinerNameType)null);
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
			case BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAME:
				return nachname != null;
			case BaukastenPackage.FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAMEPASS:
				return nachnamepass != null;
		}
		return super.eIsSet(featureID);
	}

} //FamiliennameUnstrukturiertTypeImpl
