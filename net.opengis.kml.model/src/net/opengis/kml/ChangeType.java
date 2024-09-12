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
 * A representation of the model object '<em><b>Change Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.ChangeType#getAbstractObjectGroupGroup <em>Abstract Object Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.ChangeType#getAbstractObjectGroup <em>Abstract Object Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getChangeType()
 * @model extendedMetaData="name='ChangeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ChangeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstract Object Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Object Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getChangeType_AbstractObjectGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractObjectGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractObjectGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Object Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Object Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getChangeType_AbstractObjectGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractObjectGroup' namespace='##targetNamespace' group='AbstractObjectGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getAbstractObjectGroup();

} // ChangeType
