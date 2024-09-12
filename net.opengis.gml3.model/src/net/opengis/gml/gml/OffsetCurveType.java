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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offset Curve Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.OffsetCurveType#getOffsetBase <em>Offset Base</em>}</li>
 *   <li>{@link net.opengis.gml.gml.OffsetCurveType#getDistance <em>Distance</em>}</li>
 *   <li>{@link net.opengis.gml.gml.OffsetCurveType#getRefDirection <em>Ref Direction</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getOffsetCurveType()
 * @model extendedMetaData="name='OffsetCurveType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OffsetCurveType extends AbstractCurveSegmentType {
	/**
	 * Returns the value of the '<em><b>Offset Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Base</em>' containment reference.
	 * @see #setOffsetBase(CurvePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getOffsetCurveType_OffsetBase()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='offsetBase' namespace='##targetNamespace'"
	 * @generated
	 */
	CurvePropertyType getOffsetBase();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.OffsetCurveType#getOffsetBase <em>Offset Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Base</em>' containment reference.
	 * @see #getOffsetBase()
	 * @generated
	 */
	void setOffsetBase(CurvePropertyType value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' containment reference.
	 * @see #setDistance(LengthType)
	 * @see net.opengis.gml.gml.GMLPackage#getOffsetCurveType_Distance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='distance' namespace='##targetNamespace'"
	 * @generated
	 */
	LengthType getDistance();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.OffsetCurveType#getDistance <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' containment reference.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(LengthType value);

	/**
	 * Returns the value of the '<em><b>Ref Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Direction</em>' containment reference.
	 * @see #setRefDirection(VectorType)
	 * @see net.opengis.gml.gml.GMLPackage#getOffsetCurveType_RefDirection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='refDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	VectorType getRefDirection();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.OffsetCurveType#getRefDirection <em>Ref Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Direction</em>' containment reference.
	 * @see #getRefDirection()
	 * @generated
	 */
	void setRefDirection(VectorType value);

} // OffsetCurveType
