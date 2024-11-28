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
 * A representation of the model object '<em><b>Get Policy States For Signer Ids</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIds#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIds#getSignerIds <em>Signer Ids</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIds#isUseAliases <em>Use Aliases</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetPolicyStatesForSignerIds()
 * @model extendedMetaData="name='getPolicyStatesForSignerIds' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetPolicyStatesForSignerIds extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetPolicyStatesForSignerIds_DomainName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='domainName'"
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIds#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Signer Ids</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signer Ids</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetPolicyStatesForSignerIds_SignerIds()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='signerIds'"
	 * @generated
	 */
	EList<SignerIdDTO> getSignerIds();

	/**
	 * Returns the value of the '<em><b>Use Aliases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Aliases</em>' attribute.
	 * @see #isSetUseAliases()
	 * @see #unsetUseAliases()
	 * @see #setUseAliases(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetPolicyStatesForSignerIds_UseAliases()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='useAliases'"
	 * @generated
	 */
	boolean isUseAliases();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIds#isUseAliases <em>Use Aliases</em>}' attribute.
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
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIds#isUseAliases <em>Use Aliases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseAliases()
	 * @see #isUseAliases()
	 * @see #setUseAliases(boolean)
	 * @generated
	 */
	void unsetUseAliases();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetPolicyStatesForSignerIds#isUseAliases <em>Use Aliases</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Aliases</em>' attribute is set.
	 * @see #unsetUseAliases()
	 * @see #isUseAliases()
	 * @see #setUseAliases(boolean)
	 * @generated
	 */
	boolean isSetUseAliases();

} // GetPolicyStatesForSignerIds
