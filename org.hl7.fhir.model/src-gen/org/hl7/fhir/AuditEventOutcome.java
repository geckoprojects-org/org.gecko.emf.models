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
 * A representation of the model object '<em><b>Audit Event Outcome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of an event relevant for purposes such as operations, privacy, security, maintenance, and performance analysis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AuditEventOutcome#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.AuditEventOutcome#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getAuditEventOutcome()
 * @model extendedMetaData="name='AuditEvent.Outcome' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AuditEventOutcome extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the event succeeded or failed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Coding)
	 * @see org.hl7.fhir.FHIRPackage#getAuditEventOutcome_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AuditEventOutcome#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Coding value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional details about the error. This may be a text description of the error or a system code that identifies the error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getAuditEventOutcome_Detail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getDetail();

} // AuditEventOutcome
