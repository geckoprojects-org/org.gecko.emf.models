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
package org.omg.bpmn.bpmn2;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.ItemDefinition#isIsCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.ItemDefinition#getImport <em>Import</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.ItemDefinition#getItemKind <em>Item Kind</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.ItemDefinition#getStructureRef <em>Structure Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getItemDefinition()
 * @model extendedMetaData="name='tItemDefinition' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ItemDefinition extends RootElement {
	/**
	 * Returns the value of the '<em><b>Is Collection</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Collection</em>' attribute.
	 * @see #setIsCollection(boolean)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getItemDefinition_IsCollection()
	 * @model default="false" ordered="false"
	 *        extendedMetaData="kind='attribute' name='isCollection'"
	 * @generated
	 */
	boolean isIsCollection();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.ItemDefinition#isIsCollection <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Collection</em>' attribute.
	 * @see #isIsCollection()
	 * @generated
	 */
	void setIsCollection(boolean value);

	/**
	 * Returns the value of the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' reference.
	 * @see #setImport(Import)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getItemDefinition_Import()
	 * @model transient="true" derived="true" ordered="false"
	 * @generated
	 */
	Import getImport();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.ItemDefinition#getImport <em>Import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import</em>' reference.
	 * @see #getImport()
	 * @generated
	 */
	void setImport(Import value);

	/**
	 * Returns the value of the '<em><b>Item Kind</b></em>' attribute.
	 * The default value is <code>"Information"</code>.
	 * The literals are from the enumeration {@link org.omg.bpmn.bpmn2.ItemKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Kind</em>' attribute.
	 * @see org.omg.bpmn.bpmn2.ItemKind
	 * @see #setItemKind(ItemKind)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getItemDefinition_ItemKind()
	 * @model default="Information" ordered="false"
	 *        extendedMetaData="kind='attribute' name='itemKind'"
	 * @generated
	 */
	ItemKind getItemKind();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.ItemDefinition#getItemKind <em>Item Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Kind</em>' attribute.
	 * @see org.omg.bpmn.bpmn2.ItemKind
	 * @see #getItemKind()
	 * @generated
	 */
	void setItemKind(ItemKind value);

	/**
	 * Returns the value of the '<em><b>Structure Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Ref</em>' reference.
	 * @see #setStructureRef(EObject)
	 * @see org.omg.bpmn.bpmn2.Bpmn2Package#getItemDefinition_StructureRef()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='structureRef'"
	 * @generated
	 */
	EObject getStructureRef();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.bpmn2.ItemDefinition#getStructureRef <em>Structure Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Ref</em>' reference.
	 * @see #getStructureRef()
	 * @generated
	 */
	void setStructureRef(EObject value);

} // ItemDefinition
