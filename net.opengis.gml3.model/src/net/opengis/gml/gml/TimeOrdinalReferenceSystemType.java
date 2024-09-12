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
 * A representation of the model object '<em><b>Time Ordinal Reference System Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.TimeOrdinalReferenceSystemType#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getTimeOrdinalReferenceSystemType()
 * @model extendedMetaData="name='TimeOrdinalReferenceSystemType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TimeOrdinalReferenceSystemType extends TimeReferenceSystemType {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.TimeOrdinalEraPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getTimeOrdinalReferenceSystemType_Component()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimeOrdinalEraPropertyType> getComponent();

} // TimeOrdinalReferenceSystemType
