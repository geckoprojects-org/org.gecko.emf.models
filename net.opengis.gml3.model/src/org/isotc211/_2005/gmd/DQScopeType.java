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
package org.isotc211._2005.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211._2005.gco.AbstractObjectType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DQ Scope Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.DQScopeType#getLevel <em>Level</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DQScopeType#getExtent <em>Extent</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DQScopeType#getLevelDescription <em>Level Description</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getDQScopeType()
 * @model extendedMetaData="name='DQ_Scope_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DQScopeType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' containment reference.
	 * @see #setLevel(MDScopeCodePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDQScopeType_Level()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='level' namespace='##targetNamespace'"
	 * @generated
	 */
	MDScopeCodePropertyType getLevel();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DQScopeType#getLevel <em>Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' containment reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(MDScopeCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' containment reference.
	 * @see #setExtent(EXExtentPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDQScopeType_Extent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extent' namespace='##targetNamespace'"
	 * @generated
	 */
	EXExtentPropertyType getExtent();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DQScopeType#getExtent <em>Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' containment reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(EXExtentPropertyType value);

	/**
	 * Returns the value of the '<em><b>Level Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDScopeDescriptionPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Description</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getDQScopeType_LevelDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='levelDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDScopeDescriptionPropertyType> getLevelDescription();

} // DQScopeType
