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
package org.hl7.fhir;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a healthcare consumer’s  choices  or choices made on their behalf by a third party, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConsentData#getMeaning <em>Meaning</em>}</li>
 *   <li>{@link org.hl7.fhir.ConsentData#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getConsentData()
 * @model extendedMetaData="name='Consent.Data' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConsentData extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the resource reference is interpreted when testing consent restrictions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meaning</em>' containment reference.
	 * @see #setMeaning(ConsentDataMeaning)
	 * @see org.hl7.fhir.FHIRPackage#getConsentData_Meaning()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='meaning' namespace='##targetNamespace'"
	 * @generated
	 */
	ConsentDataMeaning getMeaning();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentData#getMeaning <em>Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meaning</em>' containment reference.
	 * @see #getMeaning()
	 * @generated
	 */
	void setMeaning(ConsentDataMeaning value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a specific resource that defines which resources are covered by this consent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getConsentData_Reference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConsentData#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

} // ConsentData
