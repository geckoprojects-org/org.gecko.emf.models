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
package org.omg.dd.dc;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.dd.dc.Point#getX <em>X</em>}</li>
 *   <li>{@link org.omg.dd.dc.Point#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see org.omg.dd.dc.DcPackage#getPoint()
 * @model extendedMetaData="name='Point' kind='empty'"
 * @generated
 */
@ProviderType
public interface Point extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(float)
	 * @see org.omg.dd.dc.DcPackage#getPoint_X()
	 * @model default="0" required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='x'"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link org.omg.dd.dc.Point#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(float)
	 * @see org.omg.dd.dc.DcPackage#getPoint_Y()
	 * @model default="0" required="true" ordered="false"
	 *        extendedMetaData="kind='attribute' name='y'"
	 * @generated
	 */
	float getY();

	/**
	 * Sets the value of the '{@link org.omg.dd.dc.Point#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(float value);

} // Point
