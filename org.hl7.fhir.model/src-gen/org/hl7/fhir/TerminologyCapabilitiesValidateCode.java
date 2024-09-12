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
 * A representation of the model object '<em><b>Terminology Capabilities Validate Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesValidateCode#getTranslations <em>Translations</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getTerminologyCapabilitiesValidateCode()
 * @model extendedMetaData="name='TerminologyCapabilities.ValidateCode' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TerminologyCapabilitiesValidateCode extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether translations are validated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FHIRPackage#getTerminologyCapabilitiesValidateCode_Translations()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='translations' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getTranslations();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TerminologyCapabilitiesValidateCode#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(org.hl7.fhir.Boolean value);

} // TerminologyCapabilitiesValidateCode
