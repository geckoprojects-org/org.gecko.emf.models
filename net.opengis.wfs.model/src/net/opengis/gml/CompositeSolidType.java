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
 * A representation of the model object '<em><b>Composite Solid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A composite solid is a geometry type with all the geometric properties of a (primitive) solid. 
 * 				Essentially, a composite solid is a collection of solids that join in pairs on common boundary surfaces and which, when considered as a whole, form a single solid.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.CompositeSolidType#getSolidMember <em>Solid Member</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getCompositeSolidType()
 * @model extendedMetaData="name='CompositeSolidType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CompositeSolidType extends AbstractSolidType {
	/**
	 * Returns the value of the '<em><b>Solid Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.SolidPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This element references or contains one solid in the composite solid. The solids are contiguous.
	 * NOTE: This definition allows for a nested structure, i.e. a CompositeSolid may use, for example, another CompositeSolid as a member.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solid Member</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getCompositeSolidType_SolidMember()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='solidMember' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SolidPropertyType> getSolidMember();

} // CompositeSolidType
