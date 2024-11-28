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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Current Consent Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetCurrentConsentTemplateImpl#getConsentTemplateName <em>Consent Template Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetCurrentConsentTemplateImpl#getDomainName <em>Domain Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetCurrentConsentTemplateImpl extends MinimalEObjectImpl.Container implements GetCurrentConsentTemplate {
	/**
	 * The default value of the '{@link #getConsentTemplateName() <em>Consent Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentTemplateName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSENT_TEMPLATE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsentTemplateName() <em>Consent Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentTemplateName()
	 * @generated
	 * @ordered
	 */
	protected String consentTemplateName = CONSENT_TEMPLATE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected String domainName = DOMAIN_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetCurrentConsentTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getGetCurrentConsentTemplate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConsentTemplateName() {
		return consentTemplateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsentTemplateName(String newConsentTemplateName) {
		String oldConsentTemplateName = consentTemplateName;
		consentTemplateName = newConsentTemplateName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_CURRENT_CONSENT_TEMPLATE__CONSENT_TEMPLATE_NAME, oldConsentTemplateName, consentTemplateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomainName() {
		return domainName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainName(String newDomainName) {
		String oldDomainName = domainName;
		domainName = newDomainName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_CURRENT_CONSENT_TEMPLATE__DOMAIN_NAME, oldDomainName, domainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cm2Package.GET_CURRENT_CONSENT_TEMPLATE__CONSENT_TEMPLATE_NAME:
				return getConsentTemplateName();
			case Cm2Package.GET_CURRENT_CONSENT_TEMPLATE__DOMAIN_NAME:
				return getDomainName();
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
			case Cm2Package.GET_CURRENT_CONSENT_TEMPLATE__CONSENT_TEMPLATE_NAME:
				setConsentTemplateName((String)newValue);
				return;
			case Cm2Package.GET_CURRENT_CONSENT_TEMPLATE__DOMAIN_NAME:
				setDomainName((String)newValue);
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
			case Cm2Package.GET_CURRENT_CONSENT_TEMPLATE__CONSENT_TEMPLATE_NAME:
				setConsentTemplateName(CONSENT_TEMPLATE_NAME_EDEFAULT);
				return;
			case Cm2Package.GET_CURRENT_CONSENT_TEMPLATE__DOMAIN_NAME:
				setDomainName(DOMAIN_NAME_EDEFAULT);
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
			case Cm2Package.GET_CURRENT_CONSENT_TEMPLATE__CONSENT_TEMPLATE_NAME:
				return CONSENT_TEMPLATE_NAME_EDEFAULT == null ? consentTemplateName != null : !CONSENT_TEMPLATE_NAME_EDEFAULT.equals(consentTemplateName);
			case Cm2Package.GET_CURRENT_CONSENT_TEMPLATE__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
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
		result.append(" (consentTemplateName: ");
		result.append(consentTemplateName);
		result.append(", domainName: ");
		result.append(domainName);
		result.append(')');
		return result.toString();
	}

} //GetCurrentConsentTemplateImpl
