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
 * A representation of the model object '<em><b>Schema Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.SchemaDataType#getSimpleData <em>Simple Data</em>}</li>
 *   <li>{@link net.opengis.kml.SchemaDataType#getSchemaDataExtensionGroup <em>Schema Data Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.SchemaDataType#getSchemaDataExtension <em>Schema Data Extension</em>}</li>
 *   <li>{@link net.opengis.kml.SchemaDataType#getSchemaUrl <em>Schema Url</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getSchemaDataType()
 * @model extendedMetaData="name='SchemaDataType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SchemaDataType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Simple Data</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.SimpleDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Data</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getSchemaDataType_SimpleData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SimpleData' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SimpleDataType> getSimpleData();

	/**
	 * Returns the value of the '<em><b>Schema Data Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Data Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getSchemaDataType_SchemaDataExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='SchemaDataExtension:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSchemaDataExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Schema Data Extension</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Data Extension</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getSchemaDataType_SchemaDataExtension()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SchemaDataExtension' namespace='##targetNamespace' group='SchemaDataExtension:group'"
	 * @generated
	 */
	EList<EObject> getSchemaDataExtension();

	/**
	 * Returns the value of the '<em><b>Schema Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Url</em>' attribute.
	 * @see #setSchemaUrl(String)
	 * @see net.opengis.kml.KMLPackage#getSchemaDataType_SchemaUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='schemaUrl'"
	 * @generated
	 */
	String getSchemaUrl();

	/**
	 * Sets the value of the '{@link net.opengis.kml.SchemaDataType#getSchemaUrl <em>Schema Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Url</em>' attribute.
	 * @see #getSchemaUrl()
	 * @generated
	 */
	void setSchemaUrl(String value);

} // SchemaDataType
