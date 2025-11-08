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
 * A representation of the model object '<em><b>Performance Metric Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.PerformanceMetricType#getType <em>Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.PerformanceMetricType#getValue <em>Value</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.PerformanceMetricType#getSlice <em>Slice</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.PerformanceMetricType#getConfidenceInterval <em>Confidence Interval</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getPerformanceMetricType()
 * @model extendedMetaData="name='performanceMetric_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PerformanceMetricType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             The type of performance metric.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPerformanceMetricType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PerformanceMetricType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             The value of the performance metric.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPerformanceMetricType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PerformanceMetricType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Slice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             The name of the slice this metric was computed on. By default, assume
	 *                                                             this metric is not sliced.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slice</em>' attribute.
	 * @see #setSlice(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPerformanceMetricType_Slice()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='slice' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSlice();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PerformanceMetricType#getSlice <em>Slice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slice</em>' attribute.
	 * @see #getSlice()
	 * @generated
	 */
	void setSlice(String value);

	/**
	 * Returns the value of the '<em><b>Confidence Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             The confidence interval of the metric.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confidence Interval</em>' containment reference.
	 * @see #setConfidenceInterval(ConfidenceIntervalType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getPerformanceMetricType_ConfidenceInterval()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confidenceInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfidenceIntervalType getConfidenceInterval();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.PerformanceMetricType#getConfidenceInterval <em>Confidence Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence Interval</em>' containment reference.
	 * @see #getConfidenceInterval()
	 * @generated
	 */
	void setConfidenceInterval(ConfidenceIntervalType value);

} // PerformanceMetricType
