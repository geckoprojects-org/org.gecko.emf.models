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
package net.opengis.gml.gml;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Feature Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.DynamicFeatureCollectionType#getDynamicMembers <em>Dynamic Members</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getDynamicFeatureCollectionType()
 * @model extendedMetaData="name='DynamicFeatureCollectionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DynamicFeatureCollectionType extends DynamicFeatureType {
	/**
	 * Returns the value of the '<em><b>Dynamic Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Members</em>' containment reference.
	 * @see #setDynamicMembers(DynamicFeatureMemberType)
	 * @see net.opengis.gml.gml.GMLPackage#getDynamicFeatureCollectionType_DynamicMembers()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dynamicMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	DynamicFeatureMemberType getDynamicMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.DynamicFeatureCollectionType#getDynamicMembers <em>Dynamic Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Members</em>' containment reference.
	 * @see #getDynamicMembers()
	 * @generated
	 */
	void setDynamicMembers(DynamicFeatureMemberType value);

} // DynamicFeatureCollectionType
