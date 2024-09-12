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
 * A representation of the model object '<em><b>Charge Item Definition Property Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ChargeItemDefinition resource provides the properties that apply to the (billing) codes necessary to calculate costs and prices. The properties may differ largely depending on type and realm, therefore this resource gives only a rough structure and requires profiling for each type of billing code system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ChargeItemDefinitionPropertyGroup#getApplicability <em>Applicability</em>}</li>
 *   <li>{@link org.hl7.fhir.ChargeItemDefinitionPropertyGroup#getPriceComponent <em>Price Component</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getChargeItemDefinitionPropertyGroup()
 * @model extendedMetaData="name='ChargeItemDefinition.PropertyGroup' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ChargeItemDefinitionPropertyGroup extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Applicability</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ChargeItemDefinitionApplicability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expressions that describe applicability criteria for the priceComponent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicability</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getChargeItemDefinitionPropertyGroup_Applicability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicability' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ChargeItemDefinitionApplicability> getApplicability();

	/**
	 * Returns the value of the '<em><b>Price Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MonetaryComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The price for a ChargeItem may be calculated as a base price with surcharges/deductions that apply in certain conditions. A ChargeItemDefinition resource that defines the prices, factors and conditions that apply to a billing code is currently under development. The priceComponent element can be used to offer transparency to the recipient of the Invoice of how the prices have been calculated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Price Component</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getChargeItemDefinitionPropertyGroup_PriceComponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priceComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MonetaryComponent> getPriceComponent();

} // ChargeItemDefinitionPropertyGroup
