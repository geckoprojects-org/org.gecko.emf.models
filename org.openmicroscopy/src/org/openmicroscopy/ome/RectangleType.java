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
package org.openmicroscopy.ome;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.RectangleType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.RectangleType#getWidth <em>Width</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.RectangleType#getX <em>X</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.RectangleType#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getRectangleType()
 * @model extendedMetaData="name='Rectangle_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RectangleType extends Shape {
	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The height of the rectangle. [units pixels]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #isSetHeight()
	 * @see #unsetHeight()
	 * @see #setHeight(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getRectangleType_Height()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='Height'"
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.RectangleType#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #isSetHeight()
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.RectangleType#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeight()
	 * @see #getHeight()
	 * @see #setHeight(float)
	 * @generated
	 */
	void unsetHeight();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.RectangleType#getHeight <em>Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Height</em>' attribute is set.
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @see #setHeight(float)
	 * @generated
	 */
	boolean isSetHeight();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The width of the rectangle. [units pixels]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #setWidth(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getRectangleType_Width()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='Width'"
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.RectangleType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.RectangleType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWidth()
	 * @see #getWidth()
	 * @see #setWidth(float)
	 * @generated
	 */
	void unsetWidth();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.RectangleType#getWidth <em>Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Width</em>' attribute is set.
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @see #setWidth(float)
	 * @generated
	 */
	boolean isSetWidth();

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The X value of the left edge or the rectangle. [units pixels]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getRectangleType_X()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='X'"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.RectangleType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.RectangleType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(float)
	 * @generated
	 */
	void unsetX();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.RectangleType#getX <em>X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X</em>' attribute is set.
	 * @see #unsetX()
	 * @see #getX()
	 * @see #setX(float)
	 * @generated
	 */
	boolean isSetX();

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The y value of the top edge or the rectangle. [units pixels]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #setY(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getRectangleType_Y()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='Y'"
	 * @generated
	 */
	float getY();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.RectangleType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #getY()
	 * @generated
	 */
	void setY(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.RectangleType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY()
	 * @see #getY()
	 * @see #setY(float)
	 * @generated
	 */
	void unsetY();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.RectangleType#getY <em>Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y</em>' attribute is set.
	 * @see #unsetY()
	 * @see #getY()
	 * @see #setY(float)
	 * @generated
	 */
	boolean isSetY();

} // RectangleType
