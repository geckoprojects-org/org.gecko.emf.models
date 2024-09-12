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
package net.opengis.kml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.ExtendedDataType#getData <em>Data</em>}</li>
 *   <li>{@link net.opengis.kml.ExtendedDataType#getSchemaData <em>Schema Data</em>}</li>
 *   <li>{@link net.opengis.kml.ExtendedDataType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getExtendedDataType()
 * @model extendedMetaData="name='ExtendedDataType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ExtendedDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getExtendedDataType_Data()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Data' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataType> getData();

	/**
	 * Returns the value of the '<em><b>Schema Data</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.SchemaDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Data</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getExtendedDataType_SchemaData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SchemaData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SchemaDataType> getSchemaData();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getExtendedDataType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // ExtendedDataType
