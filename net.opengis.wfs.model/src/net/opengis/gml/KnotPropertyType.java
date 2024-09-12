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
 * A representation of the model object '<em><b>Knot Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Encapsulates a knot to use it in a geometric type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.KnotPropertyType#getKnot <em>Knot</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getKnotPropertyType()
 * @model extendedMetaData="name='KnotPropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface KnotPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Knot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knot</em>' containment reference.
	 * @see #setKnot(KnotType)
	 * @see net.opengis.gml.GMLPackage#getKnotPropertyType_Knot()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Knot' namespace='##targetNamespace'"
	 * @generated
	 */
	KnotType getKnot();

	/**
	 * Sets the value of the '{@link net.opengis.gml.KnotPropertyType#getKnot <em>Knot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knot</em>' containment reference.
	 * @see #getKnot()
	 * @generated
	 */
	void setKnot(KnotType value);

} // KnotPropertyType
