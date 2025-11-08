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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Metrics Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.PerformanceMetricsType#getPerformanceMetric <em>Performance Metric</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getPerformanceMetricsType()
 * @model extendedMetaData="name='performanceMetrics_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PerformanceMetricsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Performance Metric</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.PerformanceMetricType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Metric</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPerformanceMetricsType_PerformanceMetric()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performanceMetric' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PerformanceMetricType> getPerformanceMetric();

} // PerformanceMetricsType
