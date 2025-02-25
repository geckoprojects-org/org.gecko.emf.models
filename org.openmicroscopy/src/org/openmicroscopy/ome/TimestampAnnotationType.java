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
package org.openmicroscopy.ome;

import javax.xml.datatype.XMLGregorianCalendar;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timestamp Annotation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.TimestampAnnotationType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getTimestampAnnotationType()
 * @model extendedMetaData="name='TimestampAnnotation_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TimestampAnnotationType extends BasicAnnotation {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(XMLGregorianCalendar)
	 * @see org.openmicroscopy.ome.OMEPackage#getTimestampAnnotationType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getValue();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.TimestampAnnotationType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(XMLGregorianCalendar value);

} // TimestampAnnotationType
