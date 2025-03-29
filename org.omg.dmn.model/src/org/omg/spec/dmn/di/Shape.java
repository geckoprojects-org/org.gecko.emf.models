/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.omg.spec.dmn.di;

import org.omg.spec.dmn.dc.Bounds;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.di.Shape#getBounds <em>Bounds</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.di.DIPackage#getShape()
 * @model abstract="true"
 *        extendedMetaData="name='Shape' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Shape extends DiagramElement {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the optional bounds of the shape relative to the origin of its nesting plane.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bounds</em>' containment reference.
	 * @see #setBounds(Bounds)
	 * @see org.omg.spec.dmn.di.DIPackage#getShape_Bounds()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bounds' namespace='http://www.omg.org/spec/DMN/20180521/DC/'"
	 * @generated
	 */
	Bounds getBounds();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.di.Shape#getBounds <em>Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' containment reference.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(Bounds value);

} // Shape
