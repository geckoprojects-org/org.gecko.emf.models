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
 * A representation of the model object '<em><b>Abstract Time Topology Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.AbstractTimeTopologyPrimitiveType#getComplex <em>Complex</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getAbstractTimeTopologyPrimitiveType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractTimeTopologyPrimitiveType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractTimeTopologyPrimitiveType extends AbstractTimePrimitiveType {
	/**
	 * Returns the value of the '<em><b>Complex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex</em>' containment reference.
	 * @see #setComplex(ReferenceType)
	 * @see net.opengis.gml.gml.GMLPackage#getAbstractTimeTopologyPrimitiveType_Complex()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='complex' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getComplex();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AbstractTimeTopologyPrimitiveType#getComplex <em>Complex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex</em>' containment reference.
	 * @see #getComplex()
	 * @generated
	 */
	void setComplex(ReferenceType value);

} // AbstractTimeTopologyPrimitiveType
