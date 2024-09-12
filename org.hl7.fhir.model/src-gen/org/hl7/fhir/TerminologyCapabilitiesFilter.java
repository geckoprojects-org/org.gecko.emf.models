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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Capabilities Filter</b></em>'.
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
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesFilter#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.TerminologyCapabilitiesFilter#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getTerminologyCapabilitiesFilter()
 * @model extendedMetaData="name='TerminologyCapabilities.Filter' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TerminologyCapabilitiesFilter extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code of the property supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see org.hl7.fhir.FHIRPackage#getTerminologyCapabilitiesFilter_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.TerminologyCapabilitiesFilter#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Code}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operations supported for the property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Op</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getTerminologyCapabilitiesFilter_Op()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='op' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Code> getOp();

} // TerminologyCapabilitiesFilter
