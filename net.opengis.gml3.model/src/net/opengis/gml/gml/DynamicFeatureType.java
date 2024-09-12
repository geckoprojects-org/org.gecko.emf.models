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
package net.opengis.gml.gml;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Feature Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.DynamicFeatureType#getValidTime <em>Valid Time</em>}</li>
 *   <li>{@link net.opengis.gml.gml.DynamicFeatureType#getHistoryGroup <em>History Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.DynamicFeatureType#getHistory <em>History</em>}</li>
 *   <li>{@link net.opengis.gml.gml.DynamicFeatureType#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link net.opengis.gml.gml.DynamicFeatureType#getDataSourceReference <em>Data Source Reference</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getDynamicFeatureType()
 * @model extendedMetaData="name='DynamicFeatureType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DynamicFeatureType extends AbstractFeatureType {
	/**
	 * Returns the value of the '<em><b>Valid Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:validTime is a convenience property element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid Time</em>' containment reference.
	 * @see #setValidTime(TimePrimitivePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getDynamicFeatureType_ValidTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validTime' namespace='##targetNamespace'"
	 * @generated
	 */
	TimePrimitivePropertyType getValidTime();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.DynamicFeatureType#getValidTime <em>Valid Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Time</em>' containment reference.
	 * @see #getValidTime()
	 * @generated
	 */
	void setValidTime(TimePrimitivePropertyType value);

	/**
	 * Returns the value of the '<em><b>History Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A generic sequence of events constitute a gml:history of an object.
	 * The gml:history element contains a set of elements in the substitution group headed by the abstract element gml:AbstractTimeSlice, representing the time-varying properties of interest. The history property of a dynamic feature associates a feature instance with a sequence of time slices (i.e. change events) that encapsulate the evolution of the feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>History Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getDynamicFeatureType_HistoryGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='history:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getHistoryGroup();

	/**
	 * Returns the value of the '<em><b>History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A generic sequence of events constitute a gml:history of an object.
	 * The gml:history element contains a set of elements in the substitution group headed by the abstract element gml:AbstractTimeSlice, representing the time-varying properties of interest. The history property of a dynamic feature associates a feature instance with a sequence of time slices (i.e. change events) that encapsulate the evolution of the feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>History</em>' containment reference.
	 * @see #setHistory(HistoryPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getDynamicFeatureType_History()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='history' namespace='##targetNamespace' group='history:group'"
	 * @generated
	 */
	HistoryPropertyType getHistory();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.DynamicFeatureType#getHistory <em>History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>History</em>' containment reference.
	 * @see #getHistory()
	 * @generated
	 */
	void setHistory(HistoryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evidence is represented by a simple gml:dataSource or gml:dataSourceReference property that indicates the source of the temporal data. The remote link attributes of the gml:dataSource element have been deprecated along with its current type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Source</em>' containment reference.
	 * @see #setDataSource(StringOrRefType)
	 * @see net.opengis.gml.gml.GMLPackage#getDynamicFeatureType_DataSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataSource' namespace='##targetNamespace'"
	 * @generated
	 */
	StringOrRefType getDataSource();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.DynamicFeatureType#getDataSource <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' containment reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(StringOrRefType value);

	/**
	 * Returns the value of the '<em><b>Data Source Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evidence is represented by a simple gml:dataSource or gml:dataSourceReference property that indicates the source of the temporal data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Source Reference</em>' containment reference.
	 * @see #setDataSourceReference(ReferenceType)
	 * @see net.opengis.gml.gml.GMLPackage#getDynamicFeatureType_DataSourceReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataSourceReference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getDataSourceReference();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.DynamicFeatureType#getDataSourceReference <em>Data Source Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Reference</em>' containment reference.
	 * @see #getDataSourceReference()
	 * @generated
	 */
	void setDataSourceReference(ReferenceType value);

} // DynamicFeatureType
