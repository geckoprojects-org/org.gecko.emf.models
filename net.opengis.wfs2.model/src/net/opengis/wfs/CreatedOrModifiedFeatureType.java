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
package net.opengis.wfs;

import net.opengis.fes.ResourceIdType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Created Or Modified Feature Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.CreatedOrModifiedFeatureType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.wfs.CreatedOrModifiedFeatureType#getResourceId <em>Resource Id</em>}</li>
 *   <li>{@link net.opengis.wfs.CreatedOrModifiedFeatureType#getHandle <em>Handle</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getCreatedOrModifiedFeatureType()
 * @model extendedMetaData="name='CreatedOrModifiedFeatureType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CreatedOrModifiedFeatureType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.wfs.WFSPackage#getCreatedOrModifiedFeatureType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Resource Id</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.fes.ResourceIdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Id</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getCreatedOrModifiedFeatureType_ResourceId()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ResourceId' namespace='http://www.opengis.net/fes/2.0' group='#group:0'"
	 * @generated
	 */
	EList<ResourceIdType> getResourceId();

	/**
	 * Returns the value of the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle</em>' attribute.
	 * @see #setHandle(String)
	 * @see net.opengis.wfs.WFSPackage#getCreatedOrModifiedFeatureType_Handle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='handle'"
	 * @generated
	 */
	String getHandle();

	/**
	 * Sets the value of the '{@link net.opengis.wfs.CreatedOrModifiedFeatureType#getHandle <em>Handle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle</em>' attribute.
	 * @see #getHandle()
	 * @generated
	 */
	void setHandle(String value);

} // CreatedOrModifiedFeatureType
