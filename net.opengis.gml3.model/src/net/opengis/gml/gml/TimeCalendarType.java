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
 * A representation of the model object '<em><b>Time Calendar Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.TimeCalendarType#getReferenceFrame <em>Reference Frame</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getTimeCalendarType()
 * @model extendedMetaData="name='TimeCalendarType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TimeCalendarType extends TimeReferenceSystemType {
	/**
	 * Returns the value of the '<em><b>Reference Frame</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.TimeCalendarEraPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Frame</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getTimeCalendarType_ReferenceFrame()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenceFrame' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TimeCalendarEraPropertyType> getReferenceFrame();

} // TimeCalendarType
