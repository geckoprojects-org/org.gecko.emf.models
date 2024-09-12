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
 * A representation of the model object '<em><b>Rectified Grid Coverage Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.RectifiedGridCoverageType#getRectifiedGridDomain <em>Rectified Grid Domain</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getRectifiedGridCoverageType()
 * @model extendedMetaData="name='RectifiedGridCoverageType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RectifiedGridCoverageType extends AbstractDiscreteCoverageType {
	/**
	 * Returns the value of the '<em><b>Rectified Grid Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rectified Grid Domain</em>' containment reference.
	 * @see #setRectifiedGridDomain(RectifiedGridDomainType)
	 * @see net.opengis.gml.GMLPackage#getRectifiedGridCoverageType_RectifiedGridDomain()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rectifiedGridDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	RectifiedGridDomainType getRectifiedGridDomain();

	/**
	 * Sets the value of the '{@link net.opengis.gml.RectifiedGridCoverageType#getRectifiedGridDomain <em>Rectified Grid Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rectified Grid Domain</em>' containment reference.
	 * @see #getRectifiedGridDomain()
	 * @generated
	 */
	void setRectifiedGridDomain(RectifiedGridDomainType value);

} // RectifiedGridCoverageType
