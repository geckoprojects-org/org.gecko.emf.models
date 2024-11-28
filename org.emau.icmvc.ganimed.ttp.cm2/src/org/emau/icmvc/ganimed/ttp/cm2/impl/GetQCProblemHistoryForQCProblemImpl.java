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
import org.emau.icmvc.ganimed.ttp.cm2.GetQCProblemHistoryForQCProblem;
import org.emau.icmvc.ganimed.ttp.cm2.QcProblemDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get QC Problem History For QC Problem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetQCProblemHistoryForQCProblemImpl#getQcProblem <em>Qc Problem</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetQCProblemHistoryForQCProblemImpl#getConsentKey <em>Consent Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetQCProblemHistoryForQCProblemImpl extends MinimalEObjectImpl.Container implements GetQCProblemHistoryForQCProblem {
	/**
	 * The cached value of the '{@link #getQcProblem() <em>Qc Problem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQcProblem()
	 * @generated
	 * @ordered
	 */
	protected QcProblemDTO qcProblem;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetQCProblemHistoryForQCProblemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getGetQCProblemHistoryForQCProblem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QcProblemDTO getQcProblem() {
		return qcProblem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQcProblem(QcProblemDTO newQcProblem, NotificationChain msgs) {
		QcProblemDTO oldQcProblem = qcProblem;
		qcProblem = newQcProblem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__QC_PROBLEM, oldQcProblem, newQcProblem);
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
	public void setQcProblem(QcProblemDTO newQcProblem) {
		if (newQcProblem != qcProblem) {
			NotificationChain msgs = null;
			if (qcProblem != null)
				msgs = ((InternalEObject)qcProblem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__QC_PROBLEM, null, msgs);
			if (newQcProblem != null)
				msgs = ((InternalEObject)newQcProblem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__QC_PROBLEM, null, msgs);
			msgs = basicSetQcProblem(newQcProblem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__QC_PROBLEM, newQcProblem, newQcProblem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__CONSENT_KEY, oldConsentKey, newConsentKey);
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
				msgs = ((InternalEObject)consentKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__CONSENT_KEY, null, msgs);
			if (newConsentKey != null)
				msgs = ((InternalEObject)newConsentKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__CONSENT_KEY, null, msgs);
			msgs = basicSetConsentKey(newConsentKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__CONSENT_KEY, newConsentKey, newConsentKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__QC_PROBLEM:
				return basicSetQcProblem(null, msgs);
			case Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__CONSENT_KEY:
				return basicSetConsentKey(null, msgs);
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
			case Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__QC_PROBLEM:
				return getQcProblem();
			case Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__CONSENT_KEY:
				return getConsentKey();
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
			case Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__QC_PROBLEM:
				setQcProblem((QcProblemDTO)newValue);
				return;
			case Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__CONSENT_KEY:
				setConsentKey((ConsentKeyDTO)newValue);
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
			case Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__QC_PROBLEM:
				setQcProblem((QcProblemDTO)null);
				return;
			case Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__CONSENT_KEY:
				setConsentKey((ConsentKeyDTO)null);
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
			case Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__QC_PROBLEM:
				return qcProblem != null;
			case Cm2Package.GET_QC_PROBLEM_HISTORY_FOR_QC_PROBLEM__CONSENT_KEY:
				return consentKey != null;
		}
		return super.eIsSet(featureID);
	}

} //GetQCProblemHistoryForQCProblemImpl
