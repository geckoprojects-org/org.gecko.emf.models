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
package net.opengis.fes;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spatial Operator Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.fes.SpatialOperatorType#getGeometryOperands <em>Geometry Operands</em>}</li>
 *   <li>{@link net.opengis.fes.SpatialOperatorType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see net.opengis.fes.FESPackage#getSpatialOperatorType()
 * @model extendedMetaData="name='SpatialOperatorType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SpatialOperatorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Geometry Operands</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry Operands</em>' containment reference.
	 * @see #setGeometryOperands(GeometryOperandsType)
	 * @see net.opengis.fes.FESPackage#getSpatialOperatorType_GeometryOperands()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GeometryOperands' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryOperandsType getGeometryOperands();

	/**
	 * Sets the value of the '{@link net.opengis.fes.SpatialOperatorType#getGeometryOperands <em>Geometry Operands</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry Operands</em>' containment reference.
	 * @see #getGeometryOperands()
	 * @generated
	 */
	void setGeometryOperands(GeometryOperandsType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(Object)
	 * @see net.opengis.fes.FESPackage#getSpatialOperatorType_Name()
	 * @model dataType="net.opengis.fes.SpatialOperatorNameType"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link net.opengis.fes.SpatialOperatorType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

} // SpatialOperatorType
