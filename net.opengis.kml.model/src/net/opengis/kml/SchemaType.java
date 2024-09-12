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
 * A representation of the model object '<em><b>Schema Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.SchemaType#getSimpleField <em>Simple Field</em>}</li>
 *   <li>{@link net.opengis.kml.SchemaType#getSchemaExtensionGroup <em>Schema Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.SchemaType#getSchemaExtension <em>Schema Extension</em>}</li>
 *   <li>{@link net.opengis.kml.SchemaType#getId <em>Id</em>}</li>
 *   <li>{@link net.opengis.kml.SchemaType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getSchemaType()
 * @model extendedMetaData="name='SchemaType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SchemaType extends EObject {
	/**
	 * Returns the value of the '<em><b>Simple Field</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.SimpleFieldType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Field</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getSchemaType_SimpleField()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SimpleField' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SimpleFieldType> getSimpleField();

	/**
	 * Returns the value of the '<em><b>Schema Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getSchemaType_SchemaExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='SchemaExtension:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSchemaExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Schema Extension</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Extension</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getSchemaType_SchemaExtension()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SchemaExtension' namespace='##targetNamespace' group='SchemaExtension:group'"
	 * @generated
	 */
	EList<EObject> getSchemaExtension();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.opengis.kml.KMLPackage#getSchemaType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.opengis.kml.SchemaType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.opengis.kml.KMLPackage#getSchemaType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.opengis.kml.SchemaType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SchemaType
