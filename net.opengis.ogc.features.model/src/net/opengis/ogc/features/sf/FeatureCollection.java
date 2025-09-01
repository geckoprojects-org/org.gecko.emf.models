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
package net.opengis.ogc.features.sf;

import net.opengis.gml.gml.AbstractFeatureType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.features.sf.FeatureCollection#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.ogc.features.sf.FeatureCollection#getFeatureMember <em>Feature Member</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.features.sf.SFPackage#getFeatureCollection()
 * @model extendedMetaData="name='FeatureCollectionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FeatureCollection extends AbstractFeatureType {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.ogc.features.sf.SFPackage#getFeatureCollection_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:9'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Feature Member</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ogc.features.sf.FeatureMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Member</em>' containment reference list.
	 * @see net.opengis.ogc.features.sf.SFPackage#getFeatureCollection_FeatureMember()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='featureMember' namespace='##targetNamespace' group='#group:9'"
	 * @generated
	 */
	EList<FeatureMember> getFeatureMember();

} // FeatureCollection
