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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topo Curve Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.TopoCurvePropertyType#getTopoCurve <em>Topo Curve</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getTopoCurvePropertyType()
 * @model extendedMetaData="name='TopoCurvePropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TopoCurvePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Topo Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topo Curve</em>' containment reference.
	 * @see #setTopoCurve(TopoCurveType)
	 * @see net.opengis.gml.GMLPackage#getTopoCurvePropertyType_TopoCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TopoCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoCurveType getTopoCurve();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TopoCurvePropertyType#getTopoCurve <em>Topo Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Curve</em>' containment reference.
	 * @see #getTopoCurve()
	 * @generated
	 */
	void setTopoCurve(TopoCurveType value);

} // TopoCurvePropertyType
