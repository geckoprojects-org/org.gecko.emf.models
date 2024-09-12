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
 * A representation of the model object '<em><b>Person Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Demographics and administrative information about a person independent of a specific health-related context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.PersonLink#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.PersonLink#getAssurance <em>Assurance</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getPersonLink()
 * @model extendedMetaData="name='Person.Link' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PersonLink extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource to which this actual person is associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getPersonLink_Target()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTarget();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PersonLink#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Reference value);

	/**
	 * Returns the value of the '<em><b>Assurance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level of assurance that this link is associated with the target resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assurance</em>' containment reference.
	 * @see #setAssurance(IdentityAssuranceLevel)
	 * @see org.hl7.fhir.FHIRPackage#getPersonLink_Assurance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assurance' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentityAssuranceLevel getAssurance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.PersonLink#getAssurance <em>Assurance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assurance</em>' containment reference.
	 * @see #getAssurance()
	 * @generated
	 */
	void setAssurance(IdentityAssuranceLevel value);

} // PersonLink
