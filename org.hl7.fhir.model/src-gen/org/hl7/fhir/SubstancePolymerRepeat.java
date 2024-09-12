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
 * A representation of the model object '<em><b>Substance Polymer Repeat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Properties of a substance specific to it being a polymer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstancePolymerRepeat#getAverageMolecularFormula <em>Average Molecular Formula</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerRepeat#getRepeatUnitAmountType <em>Repeat Unit Amount Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstancePolymerRepeat#getRepeatUnit <em>Repeat Unit</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getSubstancePolymerRepeat()
 * @model extendedMetaData="name='SubstancePolymer.Repeat' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SubstancePolymerRepeat extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Average Molecular Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A representation of an (average) molecular formula from a polymer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Average Molecular Formula</em>' containment reference.
	 * @see #setAverageMolecularFormula(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getSubstancePolymerRepeat_AverageMolecularFormula()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='averageMolecularFormula' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAverageMolecularFormula();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerRepeat#getAverageMolecularFormula <em>Average Molecular Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Molecular Formula</em>' containment reference.
	 * @see #getAverageMolecularFormula()
	 * @generated
	 */
	void setAverageMolecularFormula(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Repeat Unit Amount Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the quantitative amount of Structural Repeat Units is captured (e.g. Exact, Numeric, Average).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repeat Unit Amount Type</em>' containment reference.
	 * @see #setRepeatUnitAmountType(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getSubstancePolymerRepeat_RepeatUnitAmountType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repeatUnitAmountType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRepeatUnitAmountType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstancePolymerRepeat#getRepeatUnitAmountType <em>Repeat Unit Amount Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Unit Amount Type</em>' containment reference.
	 * @see #getRepeatUnitAmountType()
	 * @generated
	 */
	void setRepeatUnitAmountType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Repeat Unit</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstancePolymerRepeatUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An SRU - Structural Repeat Unit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repeat Unit</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSubstancePolymerRepeat_RepeatUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='repeatUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstancePolymerRepeatUnit> getRepeatUnit();

} // SubstancePolymerRepeat
