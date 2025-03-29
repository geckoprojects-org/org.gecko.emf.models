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
package org.omg.spec.dmn.dc;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Color is a data type that represents a color value in the RGB format.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dc.Color#getBlue <em>Blue</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dc.Color#getGreen <em>Green</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dc.Color#getRed <em>Red</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dc.DCPackage#getColor()
 * @model extendedMetaData="name='Color' kind='empty'"
 * @generated
 */
@ProviderType
public interface Color extends EObject {
	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #isSetBlue()
	 * @see #unsetBlue()
	 * @see #setBlue(int)
	 * @see org.omg.spec.dmn.dc.DCPackage#getColor_Blue()
	 * @model unsettable="true" dataType="org.omg.spec.dmn.dc.Rgb" required="true"
	 *        extendedMetaData="kind='attribute' name='blue'"
	 * @generated
	 */
	int getBlue();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dc.Color#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #isSetBlue()
	 * @see #unsetBlue()
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(int value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.dmn.dc.Color#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlue()
	 * @see #getBlue()
	 * @see #setBlue(int)
	 * @generated
	 */
	void unsetBlue();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.dmn.dc.Color#getBlue <em>Blue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Blue</em>' attribute is set.
	 * @see #unsetBlue()
	 * @see #getBlue()
	 * @see #setBlue(int)
	 * @generated
	 */
	boolean isSetBlue();

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #isSetGreen()
	 * @see #unsetGreen()
	 * @see #setGreen(int)
	 * @see org.omg.spec.dmn.dc.DCPackage#getColor_Green()
	 * @model unsettable="true" dataType="org.omg.spec.dmn.dc.Rgb" required="true"
	 *        extendedMetaData="kind='attribute' name='green'"
	 * @generated
	 */
	int getGreen();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dc.Color#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #isSetGreen()
	 * @see #unsetGreen()
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(int value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.dmn.dc.Color#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGreen()
	 * @see #getGreen()
	 * @see #setGreen(int)
	 * @generated
	 */
	void unsetGreen();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.dmn.dc.Color#getGreen <em>Green</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Green</em>' attribute is set.
	 * @see #unsetGreen()
	 * @see #getGreen()
	 * @see #setGreen(int)
	 * @generated
	 */
	boolean isSetGreen();

	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #isSetRed()
	 * @see #unsetRed()
	 * @see #setRed(int)
	 * @see org.omg.spec.dmn.dc.DCPackage#getColor_Red()
	 * @model unsettable="true" dataType="org.omg.spec.dmn.dc.Rgb" required="true"
	 *        extendedMetaData="kind='attribute' name='red'"
	 * @generated
	 */
	int getRed();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dc.Color#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #isSetRed()
	 * @see #unsetRed()
	 * @see #getRed()
	 * @generated
	 */
	void setRed(int value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.dmn.dc.Color#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRed()
	 * @see #getRed()
	 * @see #setRed(int)
	 * @generated
	 */
	void unsetRed();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.dmn.dc.Color#getRed <em>Red</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Red</em>' attribute is set.
	 * @see #unsetRed()
	 * @see #getRed()
	 * @see #setRed(int)
	 * @generated
	 */
	boolean isSetRed();

} // Color
