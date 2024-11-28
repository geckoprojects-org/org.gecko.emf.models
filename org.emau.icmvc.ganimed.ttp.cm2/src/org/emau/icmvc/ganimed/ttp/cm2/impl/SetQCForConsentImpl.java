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
package org.emau.icmvc.ganimed.ttp.cm2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.Qcdto;
import org.emau.icmvc.ganimed.ttp.cm2.SetQCForConsent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set QC For Consent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.SetQCForConsentImpl#getConsentKey <em>Consent Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.SetQCForConsentImpl#getQc <em>Qc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetQCForConsentImpl extends MinimalEObjectImpl.Container implements SetQCForConsent {
	/**
	 * The cached value of the '{@link #getConsentKey() <em>Consent Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentKey()
	 * @generated
	 * @ordered
	 */
	protected ConsentKeyDTO consentKey;

	/**
	 * The cached value of the '{@link #getQc() <em>Qc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQc()
	 * @generated
	 * @ordered
	 */
	protected Qcdto qc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetQCForConsentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getSetQCForConsent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentKeyDTO getConsentKey() {
		return consentKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsentKey(ConsentKeyDTO newConsentKey, NotificationChain msgs) {
		ConsentKeyDTO oldConsentKey = consentKey;
		consentKey = newConsentKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.SET_QC_FOR_CONSENT__CONSENT_KEY, oldConsentKey, newConsentKey);
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
	public void setConsentKey(ConsentKeyDTO newConsentKey) {
		if (newConsentKey != consentKey) {
			NotificationChain msgs = null;
			if (consentKey != null)
				msgs = ((InternalEObject)consentKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.SET_QC_FOR_CONSENT__CONSENT_KEY, null, msgs);
			if (newConsentKey != null)
				msgs = ((InternalEObject)newConsentKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.SET_QC_FOR_CONSENT__CONSENT_KEY, null, msgs);
			msgs = basicSetConsentKey(newConsentKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.SET_QC_FOR_CONSENT__CONSENT_KEY, newConsentKey, newConsentKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Qcdto getQc() {
		return qc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQc(Qcdto newQc, NotificationChain msgs) {
		Qcdto oldQc = qc;
		qc = newQc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.SET_QC_FOR_CONSENT__QC, oldQc, newQc);
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
	public void setQc(Qcdto newQc) {
		if (newQc != qc) {
			NotificationChain msgs = null;
			if (qc != null)
				msgs = ((InternalEObject)qc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.SET_QC_FOR_CONSENT__QC, null, msgs);
			if (newQc != null)
				msgs = ((InternalEObject)newQc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.SET_QC_FOR_CONSENT__QC, null, msgs);
			msgs = basicSetQc(newQc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.SET_QC_FOR_CONSENT__QC, newQc, newQc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.SET_QC_FOR_CONSENT__CONSENT_KEY:
				return basicSetConsentKey(null, msgs);
			case Cm2Package.SET_QC_FOR_CONSENT__QC:
				return basicSetQc(null, msgs);
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
			case Cm2Package.SET_QC_FOR_CONSENT__CONSENT_KEY:
				return getConsentKey();
			case Cm2Package.SET_QC_FOR_CONSENT__QC:
				return getQc();
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
			case Cm2Package.SET_QC_FOR_CONSENT__CONSENT_KEY:
				setConsentKey((ConsentKeyDTO)newValue);
				return;
			case Cm2Package.SET_QC_FOR_CONSENT__QC:
				setQc((Qcdto)newValue);
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
			case Cm2Package.SET_QC_FOR_CONSENT__CONSENT_KEY:
				setConsentKey((ConsentKeyDTO)null);
				return;
			case Cm2Package.SET_QC_FOR_CONSENT__QC:
				setQc((Qcdto)null);
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
			case Cm2Package.SET_QC_FOR_CONSENT__CONSENT_KEY:
				return consentKey != null;
			case Cm2Package.SET_QC_FOR_CONSENT__QC:
				return qc != null;
		}
		return super.eIsSet(featureID);
	}

} //SetQCForConsentImpl
