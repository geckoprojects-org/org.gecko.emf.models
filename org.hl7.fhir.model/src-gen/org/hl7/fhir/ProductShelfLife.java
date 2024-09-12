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
 * A representation of the model object '<em><b>Product Shelf Life</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The shelf-life and storage information for a medicinal product item or container can be described using this class.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProductShelfLife#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductShelfLife#getPeriodDuration <em>Period Duration</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductShelfLife#getPeriodString <em>Period String</em>}</li>
 *   <li>{@link org.hl7.fhir.ProductShelfLife#getSpecialPrecautionsForStorage <em>Special Precautions For Storage</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getProductShelfLife()
 * @model extendedMetaData="name='ProductShelfLife' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ProductShelfLife extends BackboneType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This describes the shelf life, taking into account various scenarios such as shelf life of the packaged Medicinal Product itself, shelf life after transformation where necessary and shelf life after the first opening of a bottle, etc. The shelf life type shall be specified using an appropriate controlled vocabulary The controlled term and the controlled term identifier shall be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getProductShelfLife_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProductShelfLife#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Period Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Duration</em>' containment reference.
	 * @see #setPeriodDuration(Duration)
	 * @see org.hl7.fhir.FHIRPackage#getProductShelfLife_PeriodDuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='periodDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getPeriodDuration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProductShelfLife#getPeriodDuration <em>Period Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Duration</em>' containment reference.
	 * @see #getPeriodDuration()
	 * @generated
	 */
	void setPeriodDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Period String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period String</em>' containment reference.
	 * @see #setPeriodString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getProductShelfLife_PeriodString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='periodString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPeriodString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProductShelfLife#getPeriodString <em>Period String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period String</em>' containment reference.
	 * @see #getPeriodString()
	 * @generated
	 */
	void setPeriodString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Special Precautions For Storage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Special precautions for storage, if any, can be specified using an appropriate controlled vocabulary The controlled term and the controlled term identifier shall be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Special Precautions For Storage</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getProductShelfLife_SpecialPrecautionsForStorage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialPrecautionsForStorage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSpecialPrecautionsForStorage();

} // ProductShelfLife
