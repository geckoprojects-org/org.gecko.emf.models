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
 * A representation of the model object '<em><b>Multi Curve Domain Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.MultiCurveDomainType#getMultiCurve <em>Multi Curve</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getMultiCurveDomainType()
 * @model extendedMetaData="name='MultiCurveDomainType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MultiCurveDomainType extends DomainSetType {
	/**
	 * Returns the value of the '<em><b>Multi Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Curve</em>' containment reference.
	 * @see #setMultiCurve(MultiCurveType)
	 * @see net.opengis.gml.GMLPackage#getMultiCurveDomainType_MultiCurve()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MultiCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	MultiCurveType getMultiCurve();

	/**
	 * Sets the value of the '{@link net.opengis.gml.MultiCurveDomainType#getMultiCurve <em>Multi Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Curve</em>' containment reference.
	 * @see #getMultiCurve()
	 * @generated
	 */
	void setMultiCurve(MultiCurveType value);

} // MultiCurveDomainType
