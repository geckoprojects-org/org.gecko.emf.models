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
package net.opengis.gml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for features - follow gml:ArrayAssociationType pattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.FeatureArrayPropertyType#getFeatureGroup <em>Feature Group</em>}</li>
 *   <li>{@link net.opengis.gml.FeatureArrayPropertyType#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getFeatureArrayPropertyType()
 * @model extendedMetaData="name='FeatureArrayPropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FeatureArrayPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Group</em>' attribute list.
	 * @see net.opengis.gml.GMLPackage#getFeatureArrayPropertyType_FeatureGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_Feature:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getFeatureGroup();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.AbstractFeatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see net.opengis.gml.GMLPackage#getFeatureArrayPropertyType_Feature()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_Feature' namespace='##targetNamespace' group='_Feature:group'"
	 * @generated
	 */
	EList<AbstractFeatureType> getFeature();

} // FeatureArrayPropertyType
