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
 * A representation of the model object '<em><b>Money</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An amount of economic utility in some recognized currency.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Money#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.Money#getCurrency <em>Currency</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getMoney()
 * @model extendedMetaData="name='Money' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Money extends DataType {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numerical value (with implicit precision).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Decimal)
	 * @see org.hl7.fhir.FHIRPackage#getMoney_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Money#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Decimal value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ISO 4217 Currency Code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Currency</em>' containment reference.
	 * @see #setCurrency(Code)
	 * @see org.hl7.fhir.FHIRPackage#getMoney_Currency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='currency' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getCurrency();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Money#getCurrency <em>Currency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' containment reference.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(Code value);

} // Money
