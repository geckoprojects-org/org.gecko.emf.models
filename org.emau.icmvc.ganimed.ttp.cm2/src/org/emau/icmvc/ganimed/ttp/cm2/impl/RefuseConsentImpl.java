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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.RefuseConsent;
import org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refuse Consent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.RefuseConsentImpl#getConsentTemplateKey <em>Consent Template Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.RefuseConsentImpl#getSignerIds <em>Signer Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefuseConsentImpl extends MinimalEObjectImpl.Container implements RefuseConsent {
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
	 * The cached value of the '{@link #getSignerIds() <em>Signer Ids</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignerIds()
	 * @generated
	 * @ordered
	 */
	protected EList<SignerIdDTO> signerIds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefuseConsentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getRefuseConsent();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.REFUSE_CONSENT__CONSENT_TEMPLATE_KEY, oldConsentTemplateKey, newConsentTemplateKey);
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
				msgs = ((InternalEObject)consentTemplateKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.REFUSE_CONSENT__CONSENT_TEMPLATE_KEY, null, msgs);
			if (newConsentTemplateKey != null)
				msgs = ((InternalEObject)newConsentTemplateKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.REFUSE_CONSENT__CONSENT_TEMPLATE_KEY, null, msgs);
			msgs = basicSetConsentTemplateKey(newConsentTemplateKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.REFUSE_CONSENT__CONSENT_TEMPLATE_KEY, newConsentTemplateKey, newConsentTemplateKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SignerIdDTO> getSignerIds() {
		if (signerIds == null) {
			signerIds = new EObjectContainmentEList<SignerIdDTO>(SignerIdDTO.class, this, Cm2Package.REFUSE_CONSENT__SIGNER_IDS);
		}
		return signerIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.REFUSE_CONSENT__CONSENT_TEMPLATE_KEY:
				return basicSetConsentTemplateKey(null, msgs);
			case Cm2Package.REFUSE_CONSENT__SIGNER_IDS:
				return ((InternalEList<?>)getSignerIds()).basicRemove(otherEnd, msgs);
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
			case Cm2Package.REFUSE_CONSENT__CONSENT_TEMPLATE_KEY:
				return getConsentTemplateKey();
			case Cm2Package.REFUSE_CONSENT__SIGNER_IDS:
				return getSignerIds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Cm2Package.REFUSE_CONSENT__CONSENT_TEMPLATE_KEY:
				setConsentTemplateKey((ConsentTemplateKeyDTO)newValue);
				return;
			case Cm2Package.REFUSE_CONSENT__SIGNER_IDS:
				getSignerIds().clear();
				getSignerIds().addAll((Collection<? extends SignerIdDTO>)newValue);
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
			case Cm2Package.REFUSE_CONSENT__CONSENT_TEMPLATE_KEY:
				setConsentTemplateKey((ConsentTemplateKeyDTO)null);
				return;
			case Cm2Package.REFUSE_CONSENT__SIGNER_IDS:
				getSignerIds().clear();
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
			case Cm2Package.REFUSE_CONSENT__CONSENT_TEMPLATE_KEY:
				return consentTemplateKey != null;
			case Cm2Package.REFUSE_CONSENT__SIGNER_IDS:
				return signerIds != null && !signerIds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RefuseConsentImpl
