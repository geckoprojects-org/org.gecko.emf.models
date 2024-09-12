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
 * A representation of the model object '<em><b>Medication Knowledge Packaging</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about a medication that is used to support knowledge.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgePackaging#getCost <em>Cost</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicationKnowledgePackaging#getPackagedProduct <em>Packaged Product</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getMedicationKnowledgePackaging()
 * @model extendedMetaData="name='MedicationKnowledge.Packaging' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MedicationKnowledgePackaging extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Cost</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicationKnowledgeCost}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cost of the packaged medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getMedicationKnowledgePackaging_Cost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cost' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicationKnowledgeCost> getCost();

	/**
	 * Returns the value of the '<em><b>Packaged Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a PackagedProductDefinition that provides the details of the product that is in the packaging and is being priced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaged Product</em>' containment reference.
	 * @see #setPackagedProduct(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getMedicationKnowledgePackaging_PackagedProduct()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='packagedProduct' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPackagedProduct();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicationKnowledgePackaging#getPackagedProduct <em>Packaged Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packaged Product</em>' containment reference.
	 * @see #getPackagedProduct()
	 * @generated
	 */
	void setPackagedProduct(Reference value);

} // MedicationKnowledgePackaging
