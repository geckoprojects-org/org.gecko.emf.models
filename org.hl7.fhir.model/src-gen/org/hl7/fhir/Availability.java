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
 * A representation of the model object '<em><b>Availability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Availability data for an {item}.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Availability#getAvailableTime <em>Available Time</em>}</li>
 *   <li>{@link org.hl7.fhir.Availability#getNotAvailableTime <em>Not Available Time</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getAvailability()
 * @model extendedMetaData="name='Availability' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Availability extends DataType {
	/**
	 * Returns the value of the '<em><b>Available Time</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AvailabilityAvailableTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Times the {item} is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Time</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getAvailability_AvailableTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='availableTime' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AvailabilityAvailableTime> getAvailableTime();

	/**
	 * Returns the value of the '<em><b>Not Available Time</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AvailabilityNotAvailableTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not available during this time due to provided reason.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Not Available Time</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getAvailability_NotAvailableTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notAvailableTime' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AvailabilityNotAvailableTime> getNotAvailableTime();

} // Availability
