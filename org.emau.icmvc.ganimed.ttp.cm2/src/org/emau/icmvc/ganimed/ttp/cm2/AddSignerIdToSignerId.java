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
 * A representation of the model object '<em><b>Add Signer Id To Signer Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerId#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerId#getExistentSignerId <em>Existent Signer Id</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerId#getNewSignerId <em>New Signer Id</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAddSignerIdToSignerId()
 * @model extendedMetaData="name='addSignerIdToSignerId' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AddSignerIdToSignerId extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAddSignerIdToSignerId_DomainName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='domainName'"
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerId#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Existent Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Existent Signer Id</em>' containment reference.
	 * @see #setExistentSignerId(SignerIdDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAddSignerIdToSignerId_ExistentSignerId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='existentSignerId'"
	 * @generated
	 */
	SignerIdDTO getExistentSignerId();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerId#getExistentSignerId <em>Existent Signer Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Existent Signer Id</em>' containment reference.
	 * @see #getExistentSignerId()
	 * @generated
	 */
	void setExistentSignerId(SignerIdDTO value);

	/**
	 * Returns the value of the '<em><b>New Signer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Signer Id</em>' containment reference.
	 * @see #setNewSignerId(SignerIdDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getAddSignerIdToSignerId_NewSignerId()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='newSignerId'"
	 * @generated
	 */
	SignerIdDTO getNewSignerId();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.AddSignerIdToSignerId#getNewSignerId <em>New Signer Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Signer Id</em>' containment reference.
	 * @see #getNewSignerId()
	 * @generated
	 */
	void setNewSignerId(SignerIdDTO value);

} // AddSignerIdToSignerId
