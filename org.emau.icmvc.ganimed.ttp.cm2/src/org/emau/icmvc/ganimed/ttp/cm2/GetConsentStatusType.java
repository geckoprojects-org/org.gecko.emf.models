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

import org.emau.icmvc.ganimed.ttp.cm2.config.CheckConsentConfig;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Consent Status Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusType#getSignerIds <em>Signer Ids</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusType#getPolicyKey <em>Policy Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusType#getConfig <em>Config</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetConsentStatusType()
 * @model extendedMetaData="name='getConsentStatusType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetConsentStatusType extends EObject {
	/**
	 * Returns the value of the '<em><b>Signer Ids</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signer Ids</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetConsentStatusType_SignerIds()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='signerIds'"
	 * @generated
	 */
	EList<SignerIdDTO> getSignerIds();

	/**
	 * Returns the value of the '<em><b>Policy Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Key</em>' containment reference.
	 * @see #setPolicyKey(PolicyKeyDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetConsentStatusType_PolicyKey()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='policyKey'"
	 * @generated
	 */
	PolicyKeyDTO getPolicyKey();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusType#getPolicyKey <em>Policy Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Key</em>' containment reference.
	 * @see #getPolicyKey()
	 * @generated
	 */
	void setPolicyKey(PolicyKeyDTO value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(CheckConsentConfig)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetConsentStatusType_Config()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='config'"
	 * @generated
	 */
	CheckConsentConfig getConfig();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusType#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(CheckConsentConfig value);

} // GetConsentStatusType
