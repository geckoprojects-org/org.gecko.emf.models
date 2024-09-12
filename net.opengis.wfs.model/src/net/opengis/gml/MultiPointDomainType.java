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
 * A representation of the model object '<em><b>Multi Point Domain Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.MultiPointDomainType#getMultiPoint <em>Multi Point</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getMultiPointDomainType()
 * @model extendedMetaData="name='MultiPointDomainType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MultiPointDomainType extends DomainSetType {
	/**
	 * Returns the value of the '<em><b>Multi Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Point</em>' containment reference.
	 * @see #setMultiPoint(MultiPointType)
	 * @see net.opengis.gml.GMLPackage#getMultiPointDomainType_MultiPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MultiPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiPointType getMultiPoint();

	/**
	 * Sets the value of the '{@link net.opengis.gml.MultiPointDomainType#getMultiPoint <em>Multi Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Point</em>' containment reference.
	 * @see #getMultiPoint()
	 * @generated
	 */
	void setMultiPoint(MultiPointType value);

} // MultiPointDomainType
