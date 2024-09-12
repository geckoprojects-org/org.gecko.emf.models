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
 * A representation of the model object '<em><b>Base Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.BaseUnitType#getUnitsSystem <em>Units System</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getBaseUnitType()
 * @model extendedMetaData="name='BaseUnitType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BaseUnitType extends UnitDefinitionType {
	/**
	 * Returns the value of the '<em><b>Units System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units System</em>' containment reference.
	 * @see #setUnitsSystem(ReferenceType)
	 * @see net.opengis.gml.gml.GMLPackage#getBaseUnitType_UnitsSystem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='unitsSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getUnitsSystem();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.BaseUnitType#getUnitsSystem <em>Units System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units System</em>' containment reference.
	 * @see #getUnitsSystem()
	 * @generated
	 */
	void setUnitsSystem(ReferenceType value);

} // BaseUnitType
