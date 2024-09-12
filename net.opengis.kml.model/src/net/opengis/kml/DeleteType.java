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
 * A representation of the model object '<em><b>Delete Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.DeleteType#getAbstractFeatureGroupGroup <em>Abstract Feature Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.DeleteType#getAbstractFeatureGroup <em>Abstract Feature Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getDeleteType()
 * @model extendedMetaData="name='DeleteType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeleteType extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstract Feature Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Feature Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getDeleteType_AbstractFeatureGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractFeatureGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractFeatureGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Feature Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractFeatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Feature Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getDeleteType_AbstractFeatureGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractFeatureGroup' namespace='##targetNamespace' group='AbstractFeatureGroup:group'"
	 * @generated
	 */
	EList<AbstractFeatureType> getAbstractFeatureGroup();

} // DeleteType
