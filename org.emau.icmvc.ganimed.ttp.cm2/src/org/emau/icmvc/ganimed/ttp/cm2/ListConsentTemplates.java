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
 * A representation of the model object '<em><b>List Consent Templates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplates#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplates#isOnlyFinal <em>Only Final</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getListConsentTemplates()
 * @model extendedMetaData="name='listConsentTemplates' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ListConsentTemplates extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getListConsentTemplates_DomainName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='domainName'"
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplates#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Only Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Only Final</em>' attribute.
	 * @see #isSetOnlyFinal()
	 * @see #unsetOnlyFinal()
	 * @see #setOnlyFinal(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getListConsentTemplates_OnlyFinal()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='onlyFinal'"
	 * @generated
	 */
	boolean isOnlyFinal();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplates#isOnlyFinal <em>Only Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only Final</em>' attribute.
	 * @see #isSetOnlyFinal()
	 * @see #unsetOnlyFinal()
	 * @see #isOnlyFinal()
	 * @generated
	 */
	void setOnlyFinal(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplates#isOnlyFinal <em>Only Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOnlyFinal()
	 * @see #isOnlyFinal()
	 * @see #setOnlyFinal(boolean)
	 * @generated
	 */
	void unsetOnlyFinal();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ListConsentTemplates#isOnlyFinal <em>Only Final</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Only Final</em>' attribute is set.
	 * @see #unsetOnlyFinal()
	 * @see #isOnlyFinal()
	 * @see #setOnlyFinal(boolean)
	 * @generated
	 */
	boolean isSetOnlyFinal();

} // ListConsentTemplates
