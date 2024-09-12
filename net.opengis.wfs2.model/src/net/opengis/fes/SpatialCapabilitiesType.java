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
 * A representation of the model object '<em><b>Spatial Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.fes.SpatialCapabilitiesType#getGeometryOperands <em>Geometry Operands</em>}</li>
 *   <li>{@link net.opengis.fes.SpatialCapabilitiesType#getSpatialOperators <em>Spatial Operators</em>}</li>
 * </ul>
 *
 * @see net.opengis.fes.FESPackage#getSpatialCapabilitiesType()
 * @model extendedMetaData="name='Spatial_CapabilitiesType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SpatialCapabilitiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Geometry Operands</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry Operands</em>' containment reference.
	 * @see #setGeometryOperands(GeometryOperandsType)
	 * @see net.opengis.fes.FESPackage#getSpatialCapabilitiesType_GeometryOperands()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GeometryOperands' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryOperandsType getGeometryOperands();

	/**
	 * Sets the value of the '{@link net.opengis.fes.SpatialCapabilitiesType#getGeometryOperands <em>Geometry Operands</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry Operands</em>' containment reference.
	 * @see #getGeometryOperands()
	 * @generated
	 */
	void setGeometryOperands(GeometryOperandsType value);

	/**
	 * Returns the value of the '<em><b>Spatial Operators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Operators</em>' containment reference.
	 * @see #setSpatialOperators(SpatialOperatorsType)
	 * @see net.opengis.fes.FESPackage#getSpatialCapabilitiesType_SpatialOperators()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SpatialOperators' namespace='##targetNamespace'"
	 * @generated
	 */
	SpatialOperatorsType getSpatialOperators();

	/**
	 * Sets the value of the '{@link net.opengis.fes.SpatialCapabilitiesType#getSpatialOperators <em>Spatial Operators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spatial Operators</em>' containment reference.
	 * @see #getSpatialOperators()
	 * @generated
	 */
	void setSpatialOperators(SpatialOperatorsType value);

} // SpatialCapabilitiesType
