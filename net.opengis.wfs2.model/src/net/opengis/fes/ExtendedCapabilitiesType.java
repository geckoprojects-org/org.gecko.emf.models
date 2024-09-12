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
 * A representation of the model object '<em><b>Extended Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.fes.ExtendedCapabilitiesType#getAdditionalOperators <em>Additional Operators</em>}</li>
 * </ul>
 *
 * @see net.opengis.fes.FESPackage#getExtendedCapabilitiesType()
 * @model extendedMetaData="name='Extended_CapabilitiesType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ExtendedCapabilitiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Additional Operators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Operators</em>' containment reference.
	 * @see #setAdditionalOperators(AdditionalOperatorsType)
	 * @see net.opengis.fes.FESPackage#getExtendedCapabilitiesType_AdditionalOperators()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AdditionalOperators' namespace='##targetNamespace'"
	 * @generated
	 */
	AdditionalOperatorsType getAdditionalOperators();

	/**
	 * Sets the value of the '{@link net.opengis.fes.ExtendedCapabilitiesType#getAdditionalOperators <em>Additional Operators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Operators</em>' containment reference.
	 * @see #getAdditionalOperators()
	 * @generated
	 */
	void setAdditionalOperators(AdditionalOperatorsType value);

} // ExtendedCapabilitiesType
