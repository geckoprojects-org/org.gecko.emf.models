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
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.GetAllConsentsForConsentTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get All Consents For Consent Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetAllConsentsForConsentTemplateImpl#getConsentTemplateKey <em>Consent Template Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetAllConsentsForConsentTemplateImpl extends MinimalEObjectImpl.Container implements GetAllConsentsForConsentTemplate {
	/**
	 * The cached value of the '{@link #getConsentTemplateKey() <em>Consent Template Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentTemplateKey()
	 * @generated
	 * @ordered
	 */
	protected ConsentTemplateKeyDTO consentTemplateKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetAllConsentsForConsentTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getGetAllConsentsForConsentTemplate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentTemplateKeyDTO getConsentTemplateKey() {
		return consentTemplateKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsentTemplateKey(ConsentTemplateKeyDTO newConsentTemplateKey, NotificationChain msgs) {
		ConsentTemplateKeyDTO oldConsentTemplateKey = consentTemplateKey;
		consentTemplateKey = newConsentTemplateKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE__CONSENT_TEMPLATE_KEY, oldConsentTemplateKey, newConsentTemplateKey);
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
	public void setConsentTemplateKey(ConsentTemplateKeyDTO newConsentTemplateKey) {
		if (newConsentTemplateKey != consentTemplateKey) {
			NotificationChain msgs = null;
			if (consentTemplateKey != null)
				msgs = ((InternalEObject)consentTemplateKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE__CONSENT_TEMPLATE_KEY, null, msgs);
			if (newConsentTemplateKey != null)
				msgs = ((InternalEObject)newConsentTemplateKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE__CONSENT_TEMPLATE_KEY, null, msgs);
			msgs = basicSetConsentTemplateKey(newConsentTemplateKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE__CONSENT_TEMPLATE_KEY, newConsentTemplateKey, newConsentTemplateKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE__CONSENT_TEMPLATE_KEY:
				return basicSetConsentTemplateKey(null, msgs);
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
			case Cm2Package.GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE__CONSENT_TEMPLATE_KEY:
				return getConsentTemplateKey();
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
			case Cm2Package.GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE__CONSENT_TEMPLATE_KEY:
				setConsentTemplateKey((ConsentTemplateKeyDTO)newValue);
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
			case Cm2Package.GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE__CONSENT_TEMPLATE_KEY:
				setConsentTemplateKey((ConsentTemplateKeyDTO)null);
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
			case Cm2Package.GET_ALL_CONSENTS_FOR_CONSENT_TEMPLATE__CONSENT_TEMPLATE_KEY:
				return consentTemplateKey != null;
		}
		return super.eIsSet(featureID);
	}

} //GetAllConsentsForConsentTemplateImpl
