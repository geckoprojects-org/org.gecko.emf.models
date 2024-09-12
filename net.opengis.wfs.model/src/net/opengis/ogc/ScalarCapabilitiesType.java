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
package net.opengis.ogc;

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
 *   <li>{@link net.opengis.ogc.ScalarCapabilitiesType#getLogicalOperators <em>Logical Operators</em>}</li>
 *   <li>{@link net.opengis.ogc.ScalarCapabilitiesType#getComparisonOperators <em>Comparison Operators</em>}</li>
 *   <li>{@link net.opengis.ogc.ScalarCapabilitiesType#getArithmeticOperators <em>Arithmetic Operators</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.OGCPackage#getScalarCapabilitiesType()
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
	 * @see net.opengis.ogc.OGCPackage#getScalarCapabilitiesType_LogicalOperators()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LogicalOperators' namespace='##targetNamespace'"
	 * @generated
	 */
	LogicalOperatorsType getLogicalOperators();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.ScalarCapabilitiesType#getLogicalOperators <em>Logical Operators</em>}' containment reference.
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
	 * @see net.opengis.ogc.OGCPackage#getScalarCapabilitiesType_ComparisonOperators()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ComparisonOperators' namespace='##targetNamespace'"
	 * @generated
	 */
	ComparisonOperatorsType getComparisonOperators();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.ScalarCapabilitiesType#getComparisonOperators <em>Comparison Operators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Operators</em>' containment reference.
	 * @see #getComparisonOperators()
	 * @generated
	 */
	void setComparisonOperators(ComparisonOperatorsType value);

	/**
	 * Returns the value of the '<em><b>Arithmetic Operators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arithmetic Operators</em>' containment reference.
	 * @see #setArithmeticOperators(ArithmeticOperatorsType)
	 * @see net.opengis.ogc.OGCPackage#getScalarCapabilitiesType_ArithmeticOperators()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ArithmeticOperators' namespace='##targetNamespace'"
	 * @generated
	 */
	ArithmeticOperatorsType getArithmeticOperators();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.ScalarCapabilitiesType#getArithmeticOperators <em>Arithmetic Operators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arithmetic Operators</em>' containment reference.
	 * @see #getArithmeticOperators()
	 * @generated
	 */
	void setArithmeticOperators(ArithmeticOperatorsType value);

} // ScalarCapabilitiesType
