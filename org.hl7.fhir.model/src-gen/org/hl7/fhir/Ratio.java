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
 * A representation of the model object '<em><b>Ratio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A relationship of two Quantity values - expressed as a numerator and a denominator.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Ratio#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link org.hl7.fhir.Ratio#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getRatio()
 * @model extendedMetaData="name='Ratio' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Ratio extends DataType {
	/**
	 * Returns the value of the '<em><b>Numerator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the numerator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numerator</em>' containment reference.
	 * @see #setNumerator(Quantity)
	 * @see org.hl7.fhir.FHIRPackage#getRatio_Numerator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numerator' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getNumerator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Ratio#getNumerator <em>Numerator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator</em>' containment reference.
	 * @see #getNumerator()
	 * @generated
	 */
	void setNumerator(Quantity value);

	/**
	 * Returns the value of the '<em><b>Denominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the denominator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Denominator</em>' containment reference.
	 * @see #setDenominator(Quantity)
	 * @see org.hl7.fhir.FHIRPackage#getRatio_Denominator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='denominator' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getDenominator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Ratio#getDenominator <em>Denominator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator</em>' containment reference.
	 * @see #getDenominator()
	 * @generated
	 */
	void setDenominator(Quantity value);

} // Ratio
