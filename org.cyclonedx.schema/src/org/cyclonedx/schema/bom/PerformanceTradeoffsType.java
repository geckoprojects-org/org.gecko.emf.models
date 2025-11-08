/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Tradeoffs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.PerformanceTradeoffsType#getPerformanceTradeoff <em>Performance Tradeoff</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getPerformanceTradeoffsType()
 * @model extendedMetaData="name='performanceTradeoffs_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PerformanceTradeoffsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Performance Tradeoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Tradeoff</em>' attribute.
	 * @see #setPerformanceTradeoff(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPerformanceTradeoffsType_PerformanceTradeoff()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='performanceTradeoff' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPerformanceTradeoff();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PerformanceTradeoffsType#getPerformanceTradeoff <em>Performance Tradeoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Tradeoff</em>' attribute.
	 * @see #getPerformanceTradeoff()
	 * @generated
	 */
	void setPerformanceTradeoff(String value);

} // PerformanceTradeoffsType
