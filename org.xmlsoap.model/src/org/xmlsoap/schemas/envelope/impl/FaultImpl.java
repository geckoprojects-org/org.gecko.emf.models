/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.xmlsoap.schemas.envelope.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xmlsoap.schemas.envelope.Detail;
import org.xmlsoap.schemas.envelope.EnvelopePackage;
import org.xmlsoap.schemas.envelope.Fault;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xmlsoap.schemas.envelope.impl.FaultImpl#getFaultcode <em>Faultcode</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.impl.FaultImpl#getFaultstring <em>Faultstring</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.impl.FaultImpl#getFaultactor <em>Faultactor</em>}</li>
 *   <li>{@link org.xmlsoap.schemas.envelope.impl.FaultImpl#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FaultImpl extends MinimalEObjectImpl.Container implements Fault {
	/**
	 * The default value of the '{@link #getFaultcode() <em>Faultcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultcode()
	 * @generated
	 * @ordered
	 */
	protected static final QName FAULTCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaultcode() <em>Faultcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultcode()
	 * @generated
	 * @ordered
	 */
	protected QName faultcode = FAULTCODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFaultstring() <em>Faultstring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultstring()
	 * @generated
	 * @ordered
	 */
	protected static final String FAULTSTRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaultstring() <em>Faultstring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultstring()
	 * @generated
	 * @ordered
	 */
	protected String faultstring = FAULTSTRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getFaultactor() <em>Faultactor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultactor()
	 * @generated
	 * @ordered
	 */
	protected static final String FAULTACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaultactor() <em>Faultactor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaultactor()
	 * @generated
	 * @ordered
	 */
	protected String faultactor = FAULTACTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected Detail detail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvelopePackage.Literals.FAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getFaultcode() {
		return faultcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFaultcode(QName newFaultcode) {
		QName oldFaultcode = faultcode;
		faultcode = newFaultcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvelopePackage.FAULT__FAULTCODE, oldFaultcode, faultcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFaultstring() {
		return faultstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFaultstring(String newFaultstring) {
		String oldFaultstring = faultstring;
		faultstring = newFaultstring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvelopePackage.FAULT__FAULTSTRING, oldFaultstring, faultstring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFaultactor() {
		return faultactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFaultactor(String newFaultactor) {
		String oldFaultactor = faultactor;
		faultactor = newFaultactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvelopePackage.FAULT__FAULTACTOR, oldFaultactor, faultactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Detail getDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetail(Detail newDetail, NotificationChain msgs) {
		Detail oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EnvelopePackage.FAULT__DETAIL, oldDetail, newDetail);
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
	public void setDetail(Detail newDetail) {
		if (newDetail != detail) {
			NotificationChain msgs = null;
			if (detail != null)
				msgs = ((InternalEObject)detail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EnvelopePackage.FAULT__DETAIL, null, msgs);
			if (newDetail != null)
				msgs = ((InternalEObject)newDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EnvelopePackage.FAULT__DETAIL, null, msgs);
			msgs = basicSetDetail(newDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvelopePackage.FAULT__DETAIL, newDetail, newDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnvelopePackage.FAULT__DETAIL:
				return basicSetDetail(null, msgs);
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
			case EnvelopePackage.FAULT__FAULTCODE:
				return getFaultcode();
			case EnvelopePackage.FAULT__FAULTSTRING:
				return getFaultstring();
			case EnvelopePackage.FAULT__FAULTACTOR:
				return getFaultactor();
			case EnvelopePackage.FAULT__DETAIL:
				return getDetail();
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
			case EnvelopePackage.FAULT__FAULTCODE:
				setFaultcode((QName)newValue);
				return;
			case EnvelopePackage.FAULT__FAULTSTRING:
				setFaultstring((String)newValue);
				return;
			case EnvelopePackage.FAULT__FAULTACTOR:
				setFaultactor((String)newValue);
				return;
			case EnvelopePackage.FAULT__DETAIL:
				setDetail((Detail)newValue);
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
			case EnvelopePackage.FAULT__FAULTCODE:
				setFaultcode(FAULTCODE_EDEFAULT);
				return;
			case EnvelopePackage.FAULT__FAULTSTRING:
				setFaultstring(FAULTSTRING_EDEFAULT);
				return;
			case EnvelopePackage.FAULT__FAULTACTOR:
				setFaultactor(FAULTACTOR_EDEFAULT);
				return;
			case EnvelopePackage.FAULT__DETAIL:
				setDetail((Detail)null);
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
			case EnvelopePackage.FAULT__FAULTCODE:
				return FAULTCODE_EDEFAULT == null ? faultcode != null : !FAULTCODE_EDEFAULT.equals(faultcode);
			case EnvelopePackage.FAULT__FAULTSTRING:
				return FAULTSTRING_EDEFAULT == null ? faultstring != null : !FAULTSTRING_EDEFAULT.equals(faultstring);
			case EnvelopePackage.FAULT__FAULTACTOR:
				return FAULTACTOR_EDEFAULT == null ? faultactor != null : !FAULTACTOR_EDEFAULT.equals(faultactor);
			case EnvelopePackage.FAULT__DETAIL:
				return detail != null;
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
		result.append(" (faultcode: ");
		result.append(faultcode);
		result.append(", faultstring: ");
		result.append(faultstring);
		result.append(", faultactor: ");
		result.append(faultactor);
		result.append(')');
		return result.toString();
	}

} //FaultImpl
