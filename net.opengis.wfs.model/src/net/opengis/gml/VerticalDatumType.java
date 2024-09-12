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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertical Datum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A textual description and/or a set of parameters identifying a particular reference level surface used as a zero-height surface, including its position with respect to the Earth for any of the height types recognized by this standard. There are several types of Vertical Datums, and each may place constraints on the Coordinate Axis with which it is combined to create a Vertical CRS. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.VerticalDatumType#getVerticalDatumType <em>Vertical Datum Type</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getVerticalDatumType()
 * @model extendedMetaData="name='VerticalDatumType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface VerticalDatumType extends AbstractDatumType {
	/**
	 * Returns the value of the '<em><b>Vertical Datum Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Datum Type</em>' containment reference.
	 * @see #setVerticalDatumType(VerticalDatumTypeType)
	 * @see net.opengis.gml.GMLPackage#getVerticalDatumType_VerticalDatumType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='verticalDatumType' namespace='##targetNamespace'"
	 * @generated
	 */
	VerticalDatumTypeType getVerticalDatumType();

	/**
	 * Sets the value of the '{@link net.opengis.gml.VerticalDatumType#getVerticalDatumType <em>Vertical Datum Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Datum Type</em>' containment reference.
	 * @see #getVerticalDatumType()
	 * @generated
	 */
	void setVerticalDatumType(VerticalDatumTypeType value);

} // VerticalDatumType
