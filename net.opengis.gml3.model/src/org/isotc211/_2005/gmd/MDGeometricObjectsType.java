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
package org.isotc211._2005.gmd;

import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.IntegerPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Geometric Objects Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDGeometricObjectsType#getGeometricObjectType <em>Geometric Object Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDGeometricObjectsType#getGeometricObjectCount <em>Geometric Object Count</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDGeometricObjectsType()
 * @model extendedMetaData="name='MD_GeometricObjects_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDGeometricObjectsType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Geometric Object Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometric Object Type</em>' containment reference.
	 * @see #setGeometricObjectType(MDGeometricObjectTypeCodePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDGeometricObjectsType_GeometricObjectType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geometricObjectType' namespace='##targetNamespace'"
	 * @generated
	 */
	MDGeometricObjectTypeCodePropertyType getGeometricObjectType();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDGeometricObjectsType#getGeometricObjectType <em>Geometric Object Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometric Object Type</em>' containment reference.
	 * @see #getGeometricObjectType()
	 * @generated
	 */
	void setGeometricObjectType(MDGeometricObjectTypeCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Geometric Object Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometric Object Count</em>' containment reference.
	 * @see #setGeometricObjectCount(IntegerPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDGeometricObjectsType_GeometricObjectCount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geometricObjectCount' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerPropertyType getGeometricObjectCount();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDGeometricObjectsType#getGeometricObjectCount <em>Geometric Object Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometric Object Count</em>' containment reference.
	 * @see #getGeometricObjectCount()
	 * @generated
	 */
	void setGeometricObjectCount(IntegerPropertyType value);

} // MDGeometricObjectsType
