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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rows Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.RowsType#getRow <em>Row</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getRowsType()
 * @model extendedMetaData="name='rows_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RowsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml.gml.RowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' containment reference list.
	 * @see net.opengis.gml.gml.GMLPackage#getRowsType_Row()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Row' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RowType> getRow();

} // RowsType
