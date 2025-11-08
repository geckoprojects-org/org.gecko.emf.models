/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphics Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 A collection of graphics that represent various measurements.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.GraphicsCollectionType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.GraphicsCollectionType#getCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getGraphicsCollectionType()
 * @model extendedMetaData="name='graphicsCollectionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GraphicsCollectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         A description of this collection of graphics.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(EObject)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getGraphicsCollectionType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getDescription();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.GraphicsCollectionType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(EObject value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         A collection of graphics.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(CollectionType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getGraphicsCollectionType_Collection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='collection' namespace='##targetNamespace'"
	 * @generated
	 */
	CollectionType1 getCollection();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.GraphicsCollectionType#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(CollectionType1 value);

} // GraphicsCollectionType
