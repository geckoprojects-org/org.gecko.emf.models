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
 * A representation of the model object '<em><b>Temporal Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.fes.TemporalCapabilitiesType#getTemporalOperands <em>Temporal Operands</em>}</li>
 *   <li>{@link net.opengis.fes.TemporalCapabilitiesType#getTemporalOperators <em>Temporal Operators</em>}</li>
 * </ul>
 *
 * @see net.opengis.fes.FESPackage#getTemporalCapabilitiesType()
 * @model extendedMetaData="name='Temporal_CapabilitiesType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TemporalCapabilitiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Temporal Operands</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Operands</em>' containment reference.
	 * @see #setTemporalOperands(TemporalOperandsType)
	 * @see net.opengis.fes.FESPackage#getTemporalCapabilitiesType_TemporalOperands()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TemporalOperands' namespace='##targetNamespace'"
	 * @generated
	 */
	TemporalOperandsType getTemporalOperands();

	/**
	 * Sets the value of the '{@link net.opengis.fes.TemporalCapabilitiesType#getTemporalOperands <em>Temporal Operands</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Operands</em>' containment reference.
	 * @see #getTemporalOperands()
	 * @generated
	 */
	void setTemporalOperands(TemporalOperandsType value);

	/**
	 * Returns the value of the '<em><b>Temporal Operators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Operators</em>' containment reference.
	 * @see #setTemporalOperators(TemporalOperatorsType)
	 * @see net.opengis.fes.FESPackage#getTemporalCapabilitiesType_TemporalOperators()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TemporalOperators' namespace='##targetNamespace'"
	 * @generated
	 */
	TemporalOperatorsType getTemporalOperators();

	/**
	 * Sets the value of the '{@link net.opengis.fes.TemporalCapabilitiesType#getTemporalOperators <em>Temporal Operators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal Operators</em>' containment reference.
	 * @see #getTemporalOperators()
	 * @generated
	 */
	void setTemporalOperators(TemporalOperatorsType value);

} // TemporalCapabilitiesType
