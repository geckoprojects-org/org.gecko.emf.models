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
import de.xoev.xfamilie.baukasten._1.baukasten.CodeStatusDatenabrufType;
import de.xoev.xfamilie.baukasten._1.baukasten.StatusDatenabrufType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Status Datenabruf Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.StatusDatenabrufTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.StatusDatenabrufTypeImpl#getHinweis <em>Hinweis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatusDatenabrufTypeImpl extends MinimalEObjectImpl.Container implements StatusDatenabrufType {
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeStatusDatenabrufType status;

	/**
	 * The default value of the '{@link #getHinweis() <em>Hinweis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHinweis()
	 * @generated
	 * @ordered
	 */
	protected static final String HINWEIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHinweis() <em>Hinweis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHinweis()
	 * @generated
	 * @ordered
	 */
	protected String hinweis = HINWEIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusDatenabrufTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.STATUS_DATENABRUF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeStatusDatenabrufType getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeStatusDatenabrufType newStatus, NotificationChain msgs) {
		CodeStatusDatenabrufType oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.STATUS_DATENABRUF_TYPE__STATUS, oldStatus, newStatus);
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
	public void setStatus(CodeStatusDatenabrufType newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.STATUS_DATENABRUF_TYPE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.STATUS_DATENABRUF_TYPE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.STATUS_DATENABRUF_TYPE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHinweis() {
		return hinweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHinweis(String newHinweis) {
		String oldHinweis = hinweis;
		hinweis = newHinweis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.STATUS_DATENABRUF_TYPE__HINWEIS, oldHinweis, hinweis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.STATUS_DATENABRUF_TYPE__STATUS:
				return basicSetStatus(null, msgs);
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
			case BaukastenPackage.STATUS_DATENABRUF_TYPE__STATUS:
				return getStatus();
			case BaukastenPackage.STATUS_DATENABRUF_TYPE__HINWEIS:
				return getHinweis();
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
			case BaukastenPackage.STATUS_DATENABRUF_TYPE__STATUS:
				setStatus((CodeStatusDatenabrufType)newValue);
				return;
			case BaukastenPackage.STATUS_DATENABRUF_TYPE__HINWEIS:
				setHinweis((String)newValue);
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
			case BaukastenPackage.STATUS_DATENABRUF_TYPE__STATUS:
				setStatus((CodeStatusDatenabrufType)null);
				return;
			case BaukastenPackage.STATUS_DATENABRUF_TYPE__HINWEIS:
				setHinweis(HINWEIS_EDEFAULT);
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
			case BaukastenPackage.STATUS_DATENABRUF_TYPE__STATUS:
				return status != null;
			case BaukastenPackage.STATUS_DATENABRUF_TYPE__HINWEIS:
				return HINWEIS_EDEFAULT == null ? hinweis != null : !HINWEIS_EDEFAULT.equals(hinweis);
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
		result.append(" (hinweis: ");
		result.append(hinweis);
		result.append(')');
		return result.toString();
	}

} //StatusDatenabrufTypeImpl
