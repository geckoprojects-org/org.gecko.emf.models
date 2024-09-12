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
 * A representation of the model object '<em><b>Scalar Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.fes.ScalarCapabilitiesType#getLogicalOperators <em>Logical Operators</em>}</li>
 *   <li>{@link net.opengis.fes.ScalarCapabilitiesType#getComparisonOperators <em>Comparison Operators</em>}</li>
 * </ul>
 *
 * @see net.opengis.fes.FESPackage#getScalarCapabilitiesType()
 * @model extendedMetaData="name='Scalar_CapabilitiesType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ScalarCapabilitiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Logical Operators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Operators</em>' containment reference.
	 * @see #setLogicalOperators(LogicalOperatorsType)
	 * @see net.opengis.fes.FESPackage#getScalarCapabilitiesType_LogicalOperators()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LogicalOperators' namespace='##targetNamespace'"
	 * @generated
	 */
	LogicalOperatorsType getLogicalOperators();

	/**
	 * Sets the value of the '{@link net.opengis.fes.ScalarCapabilitiesType#getLogicalOperators <em>Logical Operators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Operators</em>' containment reference.
	 * @see #getLogicalOperators()
	 * @generated
	 */
	void setLogicalOperators(LogicalOperatorsType value);

	/**
	 * Returns the value of the '<em><b>Comparison Operators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Operators</em>' containment reference.
	 * @see #setComparisonOperators(ComparisonOperatorsType)
	 * @see net.opengis.fes.FESPackage#getScalarCapabilitiesType_ComparisonOperators()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ComparisonOperators' namespace='##targetNamespace'"
	 * @generated
	 */
	ComparisonOperatorsType getComparisonOperators();

	/**
	 * Sets the value of the '{@link net.opengis.fes.ScalarCapabilitiesType#getComparisonOperators <em>Comparison Operators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Operators</em>' containment reference.
	 * @see #getComparisonOperators()
	 * @generated
	 */
	void setComparisonOperators(ComparisonOperatorsType value);

} // ScalarCapabilitiesType
