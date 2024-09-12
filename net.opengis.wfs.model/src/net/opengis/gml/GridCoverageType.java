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
 * A representation of the model object '<em><b>Grid Coverage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.GridCoverageType#getGridDomain <em>Grid Domain</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getGridCoverageType()
 * @model extendedMetaData="name='GridCoverageType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GridCoverageType extends AbstractDiscreteCoverageType {
	/**
	 * Returns the value of the '<em><b>Grid Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Domain</em>' containment reference.
	 * @see #setGridDomain(GridDomainType)
	 * @see net.opengis.gml.GMLPackage#getGridCoverageType_GridDomain()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='gridDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	GridDomainType getGridDomain();

	/**
	 * Sets the value of the '{@link net.opengis.gml.GridCoverageType#getGridDomain <em>Grid Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Domain</em>' containment reference.
	 * @see #getGridDomain()
	 * @generated
	 */
	void setGridDomain(GridDomainType value);

} // GridCoverageType
