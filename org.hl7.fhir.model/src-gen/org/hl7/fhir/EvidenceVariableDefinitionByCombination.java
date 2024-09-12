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
 * A representation of the model object '<em><b>Evidence Variable Definition By Combination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The EvidenceVariable resource describes an element that knowledge (Evidence) is about.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EvidenceVariableDefinitionByCombination#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableDefinitionByCombination#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link org.hl7.fhir.EvidenceVariableDefinitionByCombination#getCharacteristic <em>Characteristic</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getEvidenceVariableDefinitionByCombination()
 * @model extendedMetaData="name='EvidenceVariable.DefinitionByCombination' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EvidenceVariableDefinitionByCombination extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to specify if two or more characteristics are combined with OR or AND.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CharacteristicCombination)
	 * @see org.hl7.fhir.FHIRPackage#getEvidenceVariableDefinitionByCombination_Code()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacteristicCombination getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableDefinitionByCombination#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CharacteristicCombination value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the value of "n" when "at-least" or "at-most" codes are used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Threshold</em>' containment reference.
	 * @see #setThreshold(PositiveInt)
	 * @see org.hl7.fhir.FHIRPackage#getEvidenceVariableDefinitionByCombination_Threshold()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='threshold' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getThreshold();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EvidenceVariableDefinitionByCombination#getThreshold <em>Threshold</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' containment reference.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EvidenceVariableCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A defining factor of the characteristic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristic</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getEvidenceVariableDefinitionByCombination_Characteristic()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='characteristic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EvidenceVariableCharacteristic> getCharacteristic();

} // EvidenceVariableDefinitionByCombination
