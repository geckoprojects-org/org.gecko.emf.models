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

import javax.xml.datatype.XMLGregorianCalendar;

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
import org.emau.icmvc.ganimed.ttp.cm2.ConsentKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent Key DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentKeyDTOImpl#getConsentDate <em>Consent Date</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentKeyDTOImpl#getConsentTemplateKey <em>Consent Template Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.ConsentKeyDTOImpl#getSignerIds <em>Signer Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsentKeyDTOImpl extends MinimalEObjectImpl.Container implements ConsentKeyDTO {
	/**
	 * The default value of the '{@link #getConsentDate() <em>Consent Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CONSENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsentDate() <em>Consent Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar consentDate = CONSENT_DATE_EDEFAULT;

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
	protected ConsentKeyDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getConsentKeyDTO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getConsentDate() {
		return consentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsentDate(XMLGregorianCalendar newConsentDate) {
		XMLGregorianCalendar oldConsentDate = consentDate;
		consentDate = newConsentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_KEY_DTO__CONSENT_DATE, oldConsentDate, consentDate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_KEY_DTO__CONSENT_TEMPLATE_KEY, oldConsentTemplateKey, newConsentTemplateKey);
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
				msgs = ((InternalEObject)consentTemplateKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_KEY_DTO__CONSENT_TEMPLATE_KEY, null, msgs);
			if (newConsentTemplateKey != null)
				msgs = ((InternalEObject)newConsentTemplateKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.CONSENT_KEY_DTO__CONSENT_TEMPLATE_KEY, null, msgs);
			msgs = basicSetConsentTemplateKey(newConsentTemplateKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.CONSENT_KEY_DTO__CONSENT_TEMPLATE_KEY, newConsentTemplateKey, newConsentTemplateKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SignerIdDTO> getSignerIds() {
		if (signerIds == null) {
			signerIds = new EObjectContainmentEList<SignerIdDTO>(SignerIdDTO.class, this, Cm2Package.CONSENT_KEY_DTO__SIGNER_IDS);
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
			case Cm2Package.CONSENT_KEY_DTO__CONSENT_TEMPLATE_KEY:
				return basicSetConsentTemplateKey(null, msgs);
			case Cm2Package.CONSENT_KEY_DTO__SIGNER_IDS:
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
			case Cm2Package.CONSENT_KEY_DTO__CONSENT_DATE:
				return getConsentDate();
			case Cm2Package.CONSENT_KEY_DTO__CONSENT_TEMPLATE_KEY:
				return getConsentTemplateKey();
			case Cm2Package.CONSENT_KEY_DTO__SIGNER_IDS:
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
			case Cm2Package.CONSENT_KEY_DTO__CONSENT_DATE:
				setConsentDate((XMLGregorianCalendar)newValue);
				return;
			case Cm2Package.CONSENT_KEY_DTO__CONSENT_TEMPLATE_KEY:
				setConsentTemplateKey((ConsentTemplateKeyDTO)newValue);
				return;
			case Cm2Package.CONSENT_KEY_DTO__SIGNER_IDS:
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
			case Cm2Package.CONSENT_KEY_DTO__CONSENT_DATE:
				setConsentDate(CONSENT_DATE_EDEFAULT);
				return;
			case Cm2Package.CONSENT_KEY_DTO__CONSENT_TEMPLATE_KEY:
				setConsentTemplateKey((ConsentTemplateKeyDTO)null);
				return;
			case Cm2Package.CONSENT_KEY_DTO__SIGNER_IDS:
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
			case Cm2Package.CONSENT_KEY_DTO__CONSENT_DATE:
				return CONSENT_DATE_EDEFAULT == null ? consentDate != null : !CONSENT_DATE_EDEFAULT.equals(consentDate);
			case Cm2Package.CONSENT_KEY_DTO__CONSENT_TEMPLATE_KEY:
				return consentTemplateKey != null;
			case Cm2Package.CONSENT_KEY_DTO__SIGNER_IDS:
				return signerIds != null && !signerIds.isEmpty();
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
		result.append(" (consentDate: ");
		result.append(consentDate);
		result.append(')');
		return result.toString();
	}

} //ConsentKeyDTOImpl
