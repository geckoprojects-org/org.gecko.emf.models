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
import de.xoev.xfamilie.baukasten._1.baukasten.CodeNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisbezugType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nachweisbezug Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachweisbezugTypeImpl#getDatenabrufBezug <em>Datenabruf Bezug</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachweisbezugTypeImpl#getDatenabrufId <em>Datenabruf Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NachweisbezugTypeImpl extends MinimalEObjectImpl.Container implements NachweisbezugType {
	/**
	 * The cached value of the '{@link #getDatenabrufBezug() <em>Datenabruf Bezug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenabrufBezug()
	 * @generated
	 * @ordered
	 */
	protected CodeNachweisbezugType datenabrufBezug;

	/**
	 * The default value of the '{@link #getDatenabrufId() <em>Datenabruf Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenabrufId()
	 * @generated
	 * @ordered
	 */
	protected static final String DATENABRUF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatenabrufId() <em>Datenabruf Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenabrufId()
	 * @generated
	 * @ordered
	 */
	protected String datenabrufId = DATENABRUF_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NachweisbezugTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.NACHWEISBEZUG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeNachweisbezugType getDatenabrufBezug() {
		return datenabrufBezug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatenabrufBezug(CodeNachweisbezugType newDatenabrufBezug, NotificationChain msgs) {
		CodeNachweisbezugType oldDatenabrufBezug = datenabrufBezug;
		datenabrufBezug = newDatenabrufBezug;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHWEISBEZUG_TYPE__DATENABRUF_BEZUG, oldDatenabrufBezug, newDatenabrufBezug);
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
	public void setDatenabrufBezug(CodeNachweisbezugType newDatenabrufBezug) {
		if (newDatenabrufBezug != datenabrufBezug) {
			NotificationChain msgs = null;
			if (datenabrufBezug != null)
				msgs = ((InternalEObject)datenabrufBezug).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.NACHWEISBEZUG_TYPE__DATENABRUF_BEZUG, null, msgs);
			if (newDatenabrufBezug != null)
				msgs = ((InternalEObject)newDatenabrufBezug).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.NACHWEISBEZUG_TYPE__DATENABRUF_BEZUG, null, msgs);
			msgs = basicSetDatenabrufBezug(newDatenabrufBezug, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHWEISBEZUG_TYPE__DATENABRUF_BEZUG, newDatenabrufBezug, newDatenabrufBezug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatenabrufId() {
		return datenabrufId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatenabrufId(String newDatenabrufId) {
		String oldDatenabrufId = datenabrufId;
		datenabrufId = newDatenabrufId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.NACHWEISBEZUG_TYPE__DATENABRUF_ID, oldDatenabrufId, datenabrufId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.NACHWEISBEZUG_TYPE__DATENABRUF_BEZUG:
				return basicSetDatenabrufBezug(null, msgs);
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
			case BaukastenPackage.NACHWEISBEZUG_TYPE__DATENABRUF_BEZUG:
				return getDatenabrufBezug();
			case BaukastenPackage.NACHWEISBEZUG_TYPE__DATENABRUF_ID:
				return getDatenabrufId();
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
			case BaukastenPackage.NACHWEISBEZUG_TYPE__DATENABRUF_BEZUG:
				setDatenabrufBezug((CodeNachweisbezugType)newValue);
				return;
			case BaukastenPackage.NACHWEISBEZUG_TYPE__DATENABRUF_ID:
				setDatenabrufId((String)newValue);
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
			case BaukastenPackage.NACHWEISBEZUG_TYPE__DATENABRUF_BEZUG:
				setDatenabrufBezug((CodeNachweisbezugType)null);
				return;
			case BaukastenPackage.NACHWEISBEZUG_TYPE__DATENABRUF_ID:
				setDatenabrufId(DATENABRUF_ID_EDEFAULT);
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
			case BaukastenPackage.NACHWEISBEZUG_TYPE__DATENABRUF_BEZUG:
				return datenabrufBezug != null;
			case BaukastenPackage.NACHWEISBEZUG_TYPE__DATENABRUF_ID:
				return DATENABRUF_ID_EDEFAULT == null ? datenabrufId != null : !DATENABRUF_ID_EDEFAULT.equals(datenabrufId);
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
		result.append(" (datenabrufId: ");
		result.append(datenabrufId);
		result.append(')');
		return result.toString();
	}

} //NachweisbezugTypeImpl
