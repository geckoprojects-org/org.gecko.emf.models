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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ellipsoid Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basic encoding for ellipsoid objects, simplifying and restricting the DefinitionType as needed. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.EllipsoidBaseType#getEllipsoidName <em>Ellipsoid Name</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getEllipsoidBaseType()
 * @model abstract="true"
 *        extendedMetaData="name='EllipsoidBaseType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EllipsoidBaseType extends DefinitionType {
	/**
	 * Returns the value of the '<em><b>Ellipsoid Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name by which this ellipsoid is identified. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ellipsoid Name</em>' containment reference.
	 * @see #setEllipsoidName(CodeType)
	 * @see net.opengis.gml.GMLPackage#getEllipsoidBaseType_EllipsoidName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ellipsoidName' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getEllipsoidName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.EllipsoidBaseType#getEllipsoidName <em>Ellipsoid Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipsoid Name</em>' containment reference.
	 * @see #getEllipsoidName()
	 * @generated
	 */
	void setEllipsoidName(CodeType value);

} // EllipsoidBaseType
