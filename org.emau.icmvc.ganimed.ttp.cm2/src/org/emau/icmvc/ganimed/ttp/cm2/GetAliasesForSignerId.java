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
 * A representation of the model object '<em><b>Get Aliases For Signer Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerId#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerId#getOriginalSignerId <em>Original Signer Id</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetAliasesForSignerId()
 * @model extendedMetaData="name='getAliasesForSignerId' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetAliasesForSignerId extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetAliasesForSignerId_DomainName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='domainName'"
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerId#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Original Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Signer Id</em>' containment reference.
	 * @see #setOriginalSignerId(SignerIdDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetAliasesForSignerId_OriginalSignerId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='originalSignerId'"
	 * @generated
	 */
	SignerIdDTO getOriginalSignerId();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerId#getOriginalSignerId <em>Original Signer Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Signer Id</em>' containment reference.
	 * @see #getOriginalSignerId()
	 * @generated
	 */
	void setOriginalSignerId(SignerIdDTO value);

} // GetAliasesForSignerId
