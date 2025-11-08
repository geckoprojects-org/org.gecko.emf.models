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
 * A representation of the model object '<em><b>Quantitative Analysis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.QuantitativeAnalysisType#getPerformanceMetrics <em>Performance Metrics</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.QuantitativeAnalysisType#getGraphics <em>Graphics</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getQuantitativeAnalysisType()
 * @model extendedMetaData="name='quantitativeAnalysis_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface QuantitativeAnalysisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Performance Metrics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Metrics</em>' containment reference.
	 * @see #setPerformanceMetrics(PerformanceMetricsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getQuantitativeAnalysisType_PerformanceMetrics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performanceMetrics' namespace='##targetNamespace'"
	 * @generated
	 */
	PerformanceMetricsType getPerformanceMetrics();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.QuantitativeAnalysisType#getPerformanceMetrics <em>Performance Metrics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Metrics</em>' containment reference.
	 * @see #getPerformanceMetrics()
	 * @generated
	 */
	void setPerformanceMetrics(PerformanceMetricsType value);

	/**
	 * Returns the value of the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     A collection of graphics that represent various measurements
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graphics</em>' containment reference.
	 * @see #setGraphics(GraphicsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getQuantitativeAnalysisType_Graphics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='graphics' namespace='##targetNamespace'"
	 * @generated
	 */
	GraphicsType getGraphics();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.QuantitativeAnalysisType#getGraphics <em>Graphics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphics</em>' containment reference.
	 * @see #getGraphics()
	 * @generated
	 */
	void setGraphics(GraphicsType value);

} // QuantitativeAnalysisType
