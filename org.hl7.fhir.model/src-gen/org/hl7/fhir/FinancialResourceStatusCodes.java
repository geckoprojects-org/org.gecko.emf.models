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
 * A representation of the model object '<em><b>Financial Resource Status Codes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.FinancialResourceStatusCodes#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getFinancialResourceStatusCodes()
 * @model extendedMetaData="name='FinancialResourceStatusCodes' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FinancialResourceStatusCodes extends Element {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.hl7.fhir.FinancialResourceStatusCodesEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.FinancialResourceStatusCodesEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(FinancialResourceStatusCodesEnum)
	 * @see org.hl7.fhir.FHIRPackage#getFinancialResourceStatusCodes_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	FinancialResourceStatusCodesEnum getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.FinancialResourceStatusCodes#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.hl7.fhir.FinancialResourceStatusCodesEnum
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(FinancialResourceStatusCodesEnum value);

	/**
	 * Unsets the value of the '{@link org.hl7.fhir.FinancialResourceStatusCodes#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(FinancialResourceStatusCodesEnum)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.hl7.fhir.FinancialResourceStatusCodes#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(FinancialResourceStatusCodesEnum)
	 * @generated
	 */
	boolean isSetValue();

} // FinancialResourceStatusCodes
