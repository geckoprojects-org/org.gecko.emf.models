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
package net.opengis.gml;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Solid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A MultiSolid is defined by one or more Solids, referenced through solidMember elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.MultiSolidType#getSolidMember <em>Solid Member</em>}</li>
 *   <li>{@link net.opengis.gml.MultiSolidType#getSolidMembers <em>Solid Members</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getMultiSolidType()
 * @model extendedMetaData="name='MultiSolidType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MultiSolidType extends AbstractGeometricAggregateType {
	/**
	 * Returns the value of the '<em><b>Solid Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.SolidPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element either references a solid via the XLink-attributes or contains the solid element. A solid element is any element which is substitutable for "_Solid".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solid Member</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getMultiSolidType_SolidMember()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='solidMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SolidPropertyType> getSolidMember();

	/**
	 * Returns the value of the '<em><b>Solid Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element contains a list of solids. The order of the elements is significant and shall be preserved when processing the array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solid Members</em>' containment reference.
	 * @see #setSolidMembers(SolidArrayPropertyType)
	 * @see net.opengis.gml.GMLPackage#getMultiSolidType_SolidMembers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='solidMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	SolidArrayPropertyType getSolidMembers();

	/**
	 * Sets the value of the '{@link net.opengis.gml.MultiSolidType#getSolidMembers <em>Solid Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solid Members</em>' containment reference.
	 * @see #getSolidMembers()
	 * @generated
	 */
	void setSolidMembers(SolidArrayPropertyType value);

} // MultiSolidType
