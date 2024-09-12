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
 * A representation of the model object '<em><b>Multi Solid Domain Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.MultiSolidDomainType#getMultiSolid <em>Multi Solid</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getMultiSolidDomainType()
 * @model extendedMetaData="name='MultiSolidDomainType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MultiSolidDomainType extends DomainSetType {
	/**
	 * Returns the value of the '<em><b>Multi Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Solid</em>' containment reference.
	 * @see #setMultiSolid(MultiSolidType)
	 * @see net.opengis.gml.GMLPackage#getMultiSolidDomainType_MultiSolid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MultiSolid' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiSolidType getMultiSolid();

	/**
	 * Sets the value of the '{@link net.opengis.gml.MultiSolidDomainType#getMultiSolid <em>Multi Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Solid</em>' containment reference.
	 * @see #getMultiSolid()
	 * @generated
	 */
	void setMultiSolid(MultiSolidType value);

} // MultiSolidDomainType
