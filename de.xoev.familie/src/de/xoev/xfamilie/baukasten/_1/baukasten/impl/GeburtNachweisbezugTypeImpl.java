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

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisbezugType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geburt Nachweisbezug Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtNachweisbezugTypeImpl#getNachweisbezug <em>Nachweisbezug</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeburtNachweisbezugTypeImpl extends GeburtTypeImpl implements GeburtNachweisbezugType {
	/**
	 * The cached value of the '{@link #getNachweisbezug() <em>Nachweisbezug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisbezug()
	 * @generated
	 * @ordered
	 */
	protected NachweisbezugType nachweisbezug;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeburtNachweisbezugTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.GEBURT_NACHWEISBEZUG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisbezugType getNachweisbezug() {
		return nachweisbezug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachweisbezug(NachweisbezugType newNachweisbezug, NotificationChain msgs) {
		NachweisbezugType oldNachweisbezug = nachweisbezug;
		nachweisbezug = newNachweisbezug;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.GEBURT_NACHWEISBEZUG_TYPE__NACHWEISBEZUG, oldNachweisbezug, newNachweisbezug);
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
	public void setNachweisbezug(NachweisbezugType newNachweisbezug) {
		if (newNachweisbezug != nachweisbezug) {
			NotificationChain msgs = null;
			if (nachweisbezug != null)
				msgs = ((InternalEObject)nachweisbezug).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.GEBURT_NACHWEISBEZUG_TYPE__NACHWEISBEZUG, null, msgs);
			if (newNachweisbezug != null)
				msgs = ((InternalEObject)newNachweisbezug).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.GEBURT_NACHWEISBEZUG_TYPE__NACHWEISBEZUG, null, msgs);
			msgs = basicSetNachweisbezug(newNachweisbezug, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.GEBURT_NACHWEISBEZUG_TYPE__NACHWEISBEZUG, newNachweisbezug, newNachweisbezug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.GEBURT_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				return basicSetNachweisbezug(null, msgs);
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
			case BaukastenPackage.GEBURT_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				return getNachweisbezug();
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
			case BaukastenPackage.GEBURT_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				setNachweisbezug((NachweisbezugType)newValue);
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
			case BaukastenPackage.GEBURT_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				setNachweisbezug((NachweisbezugType)null);
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
			case BaukastenPackage.GEBURT_NACHWEISBEZUG_TYPE__NACHWEISBEZUG:
				return nachweisbezug != null;
		}
		return super.eIsSet(featureID);
	}

} //GeburtNachweisbezugTypeImpl
