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
 * A representation of the model object '<em><b>Availability Not Available Time</b></em>'.
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
 *   <li>{@link org.hl7.fhir.AvailabilityNotAvailableTime#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.AvailabilityNotAvailableTime#getDuring <em>During</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getAvailabilityNotAvailableTime()
 * @model extendedMetaData="name='Availability.NotAvailableTime' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AvailabilityNotAvailableTime extends DataType {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reason presented to the user explaining why time not available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getAvailabilityNotAvailableTime_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AvailabilityNotAvailableTime#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>During</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Service not available during this period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>During</em>' containment reference.
	 * @see #setDuring(Period)
	 * @see org.hl7.fhir.FHIRPackage#getAvailabilityNotAvailableTime_During()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='during' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getDuring();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AvailabilityNotAvailableTime#getDuring <em>During</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>During</em>' containment reference.
	 * @see #getDuring()
	 * @generated
	 */
	void setDuring(Period value);

} // AvailabilityNotAvailableTime
