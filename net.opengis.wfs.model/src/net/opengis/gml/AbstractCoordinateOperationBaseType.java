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
 * A representation of the model object '<em><b>Abstract Coordinate Operation Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basic encoding for coordinate operation objects, simplifying and restricting the DefinitionType as needed. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.AbstractCoordinateOperationBaseType#getCoordinateOperationName <em>Coordinate Operation Name</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getAbstractCoordinateOperationBaseType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractCoordinateOperationBaseType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractCoordinateOperationBaseType extends DefinitionType {
	/**
	 * Returns the value of the '<em><b>Coordinate Operation Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name by which this coordinate operation is identified. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordinate Operation Name</em>' containment reference.
	 * @see #setCoordinateOperationName(CodeType)
	 * @see net.opengis.gml.GMLPackage#getAbstractCoordinateOperationBaseType_CoordinateOperationName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coordinateOperationName' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getCoordinateOperationName();

	/**
	 * Sets the value of the '{@link net.opengis.gml.AbstractCoordinateOperationBaseType#getCoordinateOperationName <em>Coordinate Operation Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate Operation Name</em>' containment reference.
	 * @see #getCoordinateOperationName()
	 * @generated
	 */
	void setCoordinateOperationName(CodeType value);

} // AbstractCoordinateOperationBaseType
