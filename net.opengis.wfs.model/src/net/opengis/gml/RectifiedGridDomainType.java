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
 * A representation of the model object '<em><b>Rectified Grid Domain Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.RectifiedGridDomainType#getRectifiedGrid <em>Rectified Grid</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getRectifiedGridDomainType()
 * @model extendedMetaData="name='RectifiedGridDomainType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RectifiedGridDomainType extends DomainSetType {
	/**
	 * Returns the value of the '<em><b>Rectified Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Should be substitutionGroup="gml:Grid" but changed in order to accomplish Xerces-J schema validation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rectified Grid</em>' containment reference.
	 * @see #setRectifiedGrid(RectifiedGridType)
	 * @see net.opengis.gml.GMLPackage#getRectifiedGridDomainType_RectifiedGrid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RectifiedGrid' namespace='##targetNamespace'"
	 * @generated
	 */
	RectifiedGridType getRectifiedGrid();

	/**
	 * Sets the value of the '{@link net.opengis.gml.RectifiedGridDomainType#getRectifiedGrid <em>Rectified Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rectified Grid</em>' containment reference.
	 * @see #getRectifiedGrid()
	 * @generated
	 */
	void setRectifiedGrid(RectifiedGridType value);

} // RectifiedGridDomainType
