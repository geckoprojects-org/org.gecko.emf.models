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
 * A representation of the model object '<em><b>Get Aliases For Signer Ids</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIds#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIds#getOriginalSignerIds <em>Original Signer Ids</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetAliasesForSignerIds()
 * @model extendedMetaData="name='getAliasesForSignerIds' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetAliasesForSignerIds extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetAliasesForSignerIds_DomainName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='domainName'"
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetAliasesForSignerIds#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Original Signer Ids</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Signer Ids</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetAliasesForSignerIds_OriginalSignerIds()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='originalSignerIds'"
	 * @generated
	 */
	EList<SignerIdDTO> getOriginalSignerIds();

} // GetAliasesForSignerIds
