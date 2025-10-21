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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweisType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signatur Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.SignaturTypeImpl#isElektronischSignieren <em>Elektronisch Signieren</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.SignaturTypeImpl#getAnlage <em>Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignaturTypeImpl extends MinimalEObjectImpl.Container implements SignaturType {
	/**
	 * The default value of the '{@link #isElektronischSignieren() <em>Elektronisch Signieren</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElektronischSignieren()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELEKTRONISCH_SIGNIEREN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isElektronischSignieren() <em>Elektronisch Signieren</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElektronischSignieren()
	 * @generated
	 * @ordered
	 */
	protected boolean elektronischSignieren = ELEKTRONISCH_SIGNIEREN_EDEFAULT;

	/**
	 * This is true if the Elektronisch Signieren attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elektronischSignierenESet;

	/**
	 * The cached value of the '{@link #getAnlage() <em>Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnlage()
	 * @generated
	 * @ordered
	 */
	protected NachweisType anlage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignaturTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.SIGNATUR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isElektronischSignieren() {
		return elektronischSignieren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElektronischSignieren(boolean newElektronischSignieren) {
		boolean oldElektronischSignieren = elektronischSignieren;
		elektronischSignieren = newElektronischSignieren;
		boolean oldElektronischSignierenESet = elektronischSignierenESet;
		elektronischSignierenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.SIGNATUR_TYPE__ELEKTRONISCH_SIGNIEREN, oldElektronischSignieren, elektronischSignieren, !oldElektronischSignierenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetElektronischSignieren() {
		boolean oldElektronischSignieren = elektronischSignieren;
		boolean oldElektronischSignierenESet = elektronischSignierenESet;
		elektronischSignieren = ELEKTRONISCH_SIGNIEREN_EDEFAULT;
		elektronischSignierenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.SIGNATUR_TYPE__ELEKTRONISCH_SIGNIEREN, oldElektronischSignieren, ELEKTRONISCH_SIGNIEREN_EDEFAULT, oldElektronischSignierenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetElektronischSignieren() {
		return elektronischSignierenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisType getAnlage() {
		return anlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnlage(NachweisType newAnlage, NotificationChain msgs) {
		NachweisType oldAnlage = anlage;
		anlage = newAnlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.SIGNATUR_TYPE__ANLAGE, oldAnlage, newAnlage);
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
	public void setAnlage(NachweisType newAnlage) {
		if (newAnlage != anlage) {
			NotificationChain msgs = null;
			if (anlage != null)
				msgs = ((InternalEObject)anlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.SIGNATUR_TYPE__ANLAGE, null, msgs);
			if (newAnlage != null)
				msgs = ((InternalEObject)newAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.SIGNATUR_TYPE__ANLAGE, null, msgs);
			msgs = basicSetAnlage(newAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.SIGNATUR_TYPE__ANLAGE, newAnlage, newAnlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.SIGNATUR_TYPE__ANLAGE:
				return basicSetAnlage(null, msgs);
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
			case AdoptionPackage.SIGNATUR_TYPE__ELEKTRONISCH_SIGNIEREN:
				return isElektronischSignieren();
			case AdoptionPackage.SIGNATUR_TYPE__ANLAGE:
				return getAnlage();
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
			case AdoptionPackage.SIGNATUR_TYPE__ELEKTRONISCH_SIGNIEREN:
				setElektronischSignieren((Boolean)newValue);
				return;
			case AdoptionPackage.SIGNATUR_TYPE__ANLAGE:
				setAnlage((NachweisType)newValue);
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
			case AdoptionPackage.SIGNATUR_TYPE__ELEKTRONISCH_SIGNIEREN:
				unsetElektronischSignieren();
				return;
			case AdoptionPackage.SIGNATUR_TYPE__ANLAGE:
				setAnlage((NachweisType)null);
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
			case AdoptionPackage.SIGNATUR_TYPE__ELEKTRONISCH_SIGNIEREN:
				return isSetElektronischSignieren();
			case AdoptionPackage.SIGNATUR_TYPE__ANLAGE:
				return anlage != null;
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
		result.append(" (elektronischSignieren: ");
		if (elektronischSignierenESet) result.append(elektronischSignieren); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SignaturTypeImpl
