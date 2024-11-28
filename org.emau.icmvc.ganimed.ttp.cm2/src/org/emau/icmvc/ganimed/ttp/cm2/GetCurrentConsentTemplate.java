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
package org.emau.icmvc.ganimed.ttp.cm2;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Current Consent Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplate#getConsentTemplateName <em>Consent Template Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplate#getDomainName <em>Domain Name</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetCurrentConsentTemplate()
 * @model extendedMetaData="name='getCurrentConsentTemplate' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetCurrentConsentTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Consent Template Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent Template Name</em>' attribute.
	 * @see #setConsentTemplateName(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetCurrentConsentTemplate_ConsentTemplateName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='consentTemplateName'"
	 * @generated
	 */
	String getConsentTemplateName();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplate#getConsentTemplateName <em>Consent Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent Template Name</em>' attribute.
	 * @see #getConsentTemplateName()
	 * @generated
	 */
	void setConsentTemplateName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetCurrentConsentTemplate_DomainName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='domainName'"
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplate#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

} // GetCurrentConsentTemplate
