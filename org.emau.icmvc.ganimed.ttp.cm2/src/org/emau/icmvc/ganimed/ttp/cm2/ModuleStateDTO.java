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
 * A representation of the model object '<em><b>Module State DTO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO#getConsentState <em>Consent State</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO#getKey <em>Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO#getPolicyKeys <em>Policy Keys</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getModuleStateDTO()
 * @model extendedMetaData="name='moduleStateDTO' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ModuleStateDTO extends EObject {
	/**
	 * Returns the value of the '<em><b>Consent State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent State</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus
	 * @see #isSetConsentState()
	 * @see #unsetConsentState()
	 * @see #setConsentState(ConsentStatus)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getModuleStateDTO_ConsentState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='consentState'"
	 * @generated
	 */
	ConsentStatus getConsentState();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO#getConsentState <em>Consent State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent State</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.ConsentStatus
	 * @see #isSetConsentState()
	 * @see #unsetConsentState()
	 * @see #getConsentState()
	 * @generated
	 */
	void setConsentState(ConsentStatus value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO#getConsentState <em>Consent State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConsentState()
	 * @see #getConsentState()
	 * @see #setConsentState(ConsentStatus)
	 * @generated
	 */
	void unsetConsentState();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO#getConsentState <em>Consent State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Consent State</em>' attribute is set.
	 * @see #unsetConsentState()
	 * @see #getConsentState()
	 * @see #setConsentState(ConsentStatus)
	 * @generated
	 */
	boolean isSetConsentState();

	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(ModuleKeyDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getModuleStateDTO_Key()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='key'"
	 * @generated
	 */
	ModuleKeyDTO getKey();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ModuleStateDTO#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(ModuleKeyDTO value);

	/**
	 * Returns the value of the '<em><b>Policy Keys</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Keys</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getModuleStateDTO_PolicyKeys()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='policyKeys'"
	 * @generated
	 */
	EList<PolicyKeyDTO> getPolicyKeys();

} // ModuleStateDTO
