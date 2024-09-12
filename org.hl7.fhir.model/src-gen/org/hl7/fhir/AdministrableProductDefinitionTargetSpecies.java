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
 * A representation of the model object '<em><b>Administrable Product Definition Target Species</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A medicinal product in the final form which is suitable for administering to a patient (after any mixing of multiple components, dissolution etc. has been performed).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.AdministrableProductDefinitionTargetSpecies#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.AdministrableProductDefinitionTargetSpecies#getWithdrawalPeriod <em>Withdrawal Period</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getAdministrableProductDefinitionTargetSpecies()
 * @model extendedMetaData="name='AdministrableProductDefinition.TargetSpecies' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AdministrableProductDefinitionTargetSpecies extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coded expression for the species.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getAdministrableProductDefinitionTargetSpecies_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.AdministrableProductDefinitionTargetSpecies#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Withdrawal Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.AdministrableProductDefinitionWithdrawalPeriod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A species specific time during which consumption of animal product is not appropriate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Withdrawal Period</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getAdministrableProductDefinitionTargetSpecies_WithdrawalPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='withdrawalPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AdministrableProductDefinitionWithdrawalPeriod> getWithdrawalPeriod();

} // AdministrableProductDefinitionTargetSpecies
