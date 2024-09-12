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
 * A representation of the model object '<em><b>Grid Domain Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.GridDomainType#getGrid <em>Grid</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getGridDomainType()
 * @model extendedMetaData="name='GridDomainType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GridDomainType extends DomainSetType {
	/**
	 * Returns the value of the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' containment reference.
	 * @see #setGrid(GridType)
	 * @see net.opengis.gml.GMLPackage#getGridDomainType_Grid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Grid' namespace='##targetNamespace'"
	 * @generated
	 */
	GridType getGrid();

	/**
	 * Sets the value of the '{@link net.opengis.gml.GridDomainType#getGrid <em>Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' containment reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(GridType value);

} // GridDomainType
