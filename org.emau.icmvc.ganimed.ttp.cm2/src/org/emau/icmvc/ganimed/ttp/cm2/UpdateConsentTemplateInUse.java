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
 * A representation of the model object '<em><b>Update Consent Template In Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentTemplateInUse#getConsentTemplate <em>Consent Template</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateConsentTemplateInUse()
 * @model extendedMetaData="name='updateConsentTemplateInUse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UpdateConsentTemplateInUse extends EObject {
	/**
	 * Returns the value of the '<em><b>Consent Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent Template</em>' containment reference.
	 * @see #setConsentTemplate(ConsentTemplateDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateConsentTemplateInUse_ConsentTemplate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='consentTemplate'"
	 * @generated
	 */
	ConsentTemplateDTO getConsentTemplate();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateConsentTemplateInUse#getConsentTemplate <em>Consent Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent Template</em>' containment reference.
	 * @see #getConsentTemplate()
	 * @generated
	 */
	void setConsentTemplate(ConsentTemplateDTO value);

} // UpdateConsentTemplateInUse
