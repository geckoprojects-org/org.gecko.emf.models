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
 * A representation of the model object '<em><b>Abstract Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.AbstractObjectType#getObjectSimpleExtensionGroupGroup <em>Object Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractObjectType#getObjectSimpleExtensionGroup <em>Object Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractObjectType#getId <em>Id</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractObjectType#getTargetId <em>Target Id</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getAbstractObjectType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractObjectType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractObjectType extends EObject {
	/**
	 * Returns the value of the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractObjectType_ObjectSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ObjectSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getObjectSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractObjectType_ObjectSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectSimpleExtensionGroup' namespace='##targetNamespace' group='ObjectSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getObjectSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.opengis.kml.KMLPackage#getAbstractObjectType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractObjectType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Id</em>' attribute.
	 * @see #setTargetId(String)
	 * @see net.opengis.kml.KMLPackage#getAbstractObjectType_TargetId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='targetId'"
	 * @generated
	 */
	String getTargetId();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractObjectType#getTargetId <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Id</em>' attribute.
	 * @see #getTargetId()
	 * @generated
	 */
	void setTargetId(String value);

} // AbstractObjectType
