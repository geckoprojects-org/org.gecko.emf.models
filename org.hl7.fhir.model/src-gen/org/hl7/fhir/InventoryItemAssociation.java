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
 * A representation of the model object '<em><b>Inventory Item Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A functional description of an inventory item used in inventory and supply-related workflows.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.InventoryItemAssociation#getAssociationType <em>Association Type</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryItemAssociation#getRelatedItem <em>Related Item</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryItemAssociation#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getInventoryItemAssociation()
 * @model extendedMetaData="name='InventoryItem.Association' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InventoryItemAssociation extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Association Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute defined the type of association when establishing associations or relations between items, e.g. 'packaged within' or 'used with' or 'to be mixed with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association Type</em>' containment reference.
	 * @see #setAssociationType(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getInventoryItemAssociation_AssociationType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='associationType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getAssociationType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemAssociation#getAssociationType <em>Association Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Type</em>' containment reference.
	 * @see #getAssociationType()
	 * @generated
	 */
	void setAssociationType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Related Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The related item or product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Item</em>' containment reference.
	 * @see #setRelatedItem(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getInventoryItemAssociation_RelatedItem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relatedItem' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRelatedItem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemAssociation#getRelatedItem <em>Related Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Item</em>' containment reference.
	 * @see #getRelatedItem()
	 * @generated
	 */
	void setRelatedItem(Reference value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of the related product in this product - Numerator is the quantity of the related product. Denominator is the quantity of the present product. For example a value of 20 means that this product contains 20 units of the related product; a value of 1:20 means the inverse - that the contained product contains 20 units of the present product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Ratio)
	 * @see org.hl7.fhir.FHIRPackage#getInventoryItemAssociation_Quantity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Ratio getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemAssociation#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Ratio value);

} // InventoryItemAssociation
