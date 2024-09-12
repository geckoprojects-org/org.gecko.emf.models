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
package net.opengis.gml.gml;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectified Grid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.RectifiedGridType#getOrigin <em>Origin</em>}</li>
 *   <li>{@link net.opengis.gml.gml.RectifiedGridType#getOffsetVector <em>Offset Vector</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getRectifiedGridType()
 * @model extendedMetaData="name='RectifiedGridType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RectifiedGridType extends GridType {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(PointPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getRectifiedGridType_Origin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='origin' namespace='##targetNamespace'"
	 * @generated
	 */
	PointPropertyType getOrigin();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.RectifiedGridType#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(PointPropertyType value);

	/**
	 * Returns the value of the '<em><b>Offset Vector</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.VectorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Vector</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getRectifiedGridType_OffsetVector()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='offsetVector' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VectorType> getOffsetVector();

} // RectifiedGridType
