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
 * A representation of the model object '<em><b>Get Consent Status Type From Excluding To Excluding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getSignerIds <em>Signer Ids</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getPolicyName <em>Policy Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getVersionFrom <em>Version From</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getVersionTo <em>Version To</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getConfig <em>Config</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetConsentStatusTypeFromExcludingToExcluding()
 * @model extendedMetaData="name='getConsentStatusTypeFromExcludingToExcluding' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetConsentStatusTypeFromExcludingToExcluding extends EObject {
	/**
	 * Returns the value of the '<em><b>Signer Ids</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signer Ids</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetConsentStatusTypeFromExcludingToExcluding_SignerIds()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='signerIds'"
	 * @generated
	 */
	EList<SignerIdDTO> getSignerIds();

	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetConsentStatusTypeFromExcludingToExcluding_DomainName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='domainName'"
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Policy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Name</em>' attribute.
	 * @see #setPolicyName(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetConsentStatusTypeFromExcludingToExcluding_PolicyName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='policyName'"
	 * @generated
	 */
	String getPolicyName();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getPolicyName <em>Policy Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Name</em>' attribute.
	 * @see #getPolicyName()
	 * @generated
	 */
	void setPolicyName(String value);

	/**
	 * Returns the value of the '<em><b>Version From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version From</em>' attribute.
	 * @see #setVersionFrom(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetConsentStatusTypeFromExcludingToExcluding_VersionFrom()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='versionFrom'"
	 * @generated
	 */
	String getVersionFrom();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getVersionFrom <em>Version From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version From</em>' attribute.
	 * @see #getVersionFrom()
	 * @generated
	 */
	void setVersionFrom(String value);

	/**
	 * Returns the value of the '<em><b>Version To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version To</em>' attribute.
	 * @see #setVersionTo(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetConsentStatusTypeFromExcludingToExcluding_VersionTo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='versionTo'"
	 * @generated
	 */
	String getVersionTo();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getVersionTo <em>Version To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version To</em>' attribute.
	 * @see #getVersionTo()
	 * @generated
	 */
	void setVersionTo(String value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(CheckConsentConfig)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetConsentStatusTypeFromExcludingToExcluding_Config()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='config'"
	 * @generated
	 */
	CheckConsentConfig getConfig();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetConsentStatusTypeFromExcludingToExcluding#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(CheckConsentConfig value);

} // GetConsentStatusTypeFromExcludingToExcluding
