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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Current Consent For Signer Ids And CT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT#getConsentTemplateKey <em>Consent Template Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT#getSignerIds <em>Signer Ids</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT#isIgnoreVersionNumber <em>Ignore Version Number</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT#isUseAliases <em>Use Aliases</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetCurrentConsentForSignerIdsAndCT()
 * @model extendedMetaData="name='getCurrentConsentForSignerIdsAndCT' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetCurrentConsentForSignerIdsAndCT extends EObject {
	/**
	 * Returns the value of the '<em><b>Consent Template Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent Template Key</em>' containment reference.
	 * @see #setConsentTemplateKey(ConsentTemplateKeyDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetCurrentConsentForSignerIdsAndCT_ConsentTemplateKey()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='consentTemplateKey'"
	 * @generated
	 */
	ConsentTemplateKeyDTO getConsentTemplateKey();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT#getConsentTemplateKey <em>Consent Template Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent Template Key</em>' containment reference.
	 * @see #getConsentTemplateKey()
	 * @generated
	 */
	void setConsentTemplateKey(ConsentTemplateKeyDTO value);

	/**
	 * Returns the value of the '<em><b>Signer Ids</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signer Ids</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetCurrentConsentForSignerIdsAndCT_SignerIds()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='signerIds'"
	 * @generated
	 */
	EList<SignerIdDTO> getSignerIds();

	/**
	 * Returns the value of the '<em><b>Ignore Version Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Version Number</em>' attribute.
	 * @see #isSetIgnoreVersionNumber()
	 * @see #unsetIgnoreVersionNumber()
	 * @see #setIgnoreVersionNumber(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetCurrentConsentForSignerIdsAndCT_IgnoreVersionNumber()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='ignoreVersionNumber'"
	 * @generated
	 */
	boolean isIgnoreVersionNumber();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT#isIgnoreVersionNumber <em>Ignore Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Version Number</em>' attribute.
	 * @see #isSetIgnoreVersionNumber()
	 * @see #unsetIgnoreVersionNumber()
	 * @see #isIgnoreVersionNumber()
	 * @generated
	 */
	void setIgnoreVersionNumber(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT#isIgnoreVersionNumber <em>Ignore Version Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIgnoreVersionNumber()
	 * @see #isIgnoreVersionNumber()
	 * @see #setIgnoreVersionNumber(boolean)
	 * @generated
	 */
	void unsetIgnoreVersionNumber();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT#isIgnoreVersionNumber <em>Ignore Version Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ignore Version Number</em>' attribute is set.
	 * @see #unsetIgnoreVersionNumber()
	 * @see #isIgnoreVersionNumber()
	 * @see #setIgnoreVersionNumber(boolean)
	 * @generated
	 */
	boolean isSetIgnoreVersionNumber();

	/**
	 * Returns the value of the '<em><b>Use Aliases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Aliases</em>' attribute.
	 * @see #isSetUseAliases()
	 * @see #unsetUseAliases()
	 * @see #setUseAliases(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetCurrentConsentForSignerIdsAndCT_UseAliases()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='useAliases'"
	 * @generated
	 */
	boolean isUseAliases();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT#isUseAliases <em>Use Aliases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Aliases</em>' attribute.
	 * @see #isSetUseAliases()
	 * @see #unsetUseAliases()
	 * @see #isUseAliases()
	 * @generated
	 */
	void setUseAliases(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT#isUseAliases <em>Use Aliases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseAliases()
	 * @see #isUseAliases()
	 * @see #setUseAliases(boolean)
	 * @generated
	 */
	void unsetUseAliases();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentForSignerIdsAndCT#isUseAliases <em>Use Aliases</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Aliases</em>' attribute is set.
	 * @see #unsetUseAliases()
	 * @see #isUseAliases()
	 * @see #setUseAliases(boolean)
	 * @generated
	 */
	boolean isSetUseAliases();

} // GetCurrentConsentForSignerIdsAndCT
