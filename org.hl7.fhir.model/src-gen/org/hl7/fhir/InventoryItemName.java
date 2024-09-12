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
 * A representation of the model object '<em><b>Inventory Item Name</b></em>'.
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
 *   <li>{@link org.hl7.fhir.InventoryItemName#getNameType <em>Name Type</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryItemName#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.fhir.InventoryItemName#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getInventoryItemName()
 * @model extendedMetaData="name='InventoryItem.Name' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InventoryItemName extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of name e.g. 'brand-name', 'functional-name', 'common-name'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Type</em>' containment reference.
	 * @see #setNameType(Coding)
	 * @see org.hl7.fhir.FHIRPackage#getInventoryItemName_NameType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nameType' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getNameType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemName#getNameType <em>Name Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Type</em>' containment reference.
	 * @see #getNameType()
	 * @generated
	 */
	void setNameType(Coding value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The language that the item name is expressed in.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(CommonLanguages)
	 * @see org.hl7.fhir.FHIRPackage#getInventoryItemName_Language()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	CommonLanguages getLanguage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemName#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(CommonLanguages value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name or designation that the item is given.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getInventoryItemName_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InventoryItemName#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

} // InventoryItemName
