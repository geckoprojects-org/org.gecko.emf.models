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

import net.opengis.ogc.FeatureIdType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Features Not Locked Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.FeaturesNotLockedType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.wfs.FeaturesNotLockedType#getFeatureId <em>Feature Id</em>}</li>
 * </ul>
 *
 * @see net.opengis.wfs.WFSPackage#getFeaturesNotLockedType()
 * @model extendedMetaData="name='FeaturesNotLockedType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FeaturesNotLockedType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.wfs.WFSPackage#getFeaturesNotLockedType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Feature Id</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ogc.FeatureIdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Id</em>' containment reference list.
	 * @see net.opengis.wfs.WFSPackage#getFeaturesNotLockedType_FeatureId()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FeatureId' namespace='http://www.opengis.net/ogc' group='#group:0'"
	 * @generated
	 */
	EList<FeatureIdType> getFeatureId();

} // FeaturesNotLockedType
