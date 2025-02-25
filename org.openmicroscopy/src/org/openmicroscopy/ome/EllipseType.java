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
 * A representation of the model object '<em><b>Ellipse Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.EllipseType#getRadiusX <em>Radius X</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.EllipseType#getRadiusY <em>Radius Y</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.EllipseType#getX <em>X</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.EllipseType#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getEllipseType()
 * @model extendedMetaData="name='Ellipse_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EllipseType extends Shape {
	/**
	 * Returns the value of the '<em><b>Radius X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The horizontal radius of the ellipse. [units pixels]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Radius X</em>' attribute.
	 * @see #isSetRadiusX()
	 * @see #unsetRadiusX()
	 * @see #setRadiusX(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getEllipseType_RadiusX()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='RadiusX'"
	 * @generated
	 */
	float getRadiusX();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.EllipseType#getRadiusX <em>Radius X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius X</em>' attribute.
	 * @see #isSetRadiusX()
	 * @see #unsetRadiusX()
	 * @see #getRadiusX()
	 * @generated
	 */
	void setRadiusX(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.EllipseType#getRadiusX <em>Radius X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRadiusX()
	 * @see #getRadiusX()
	 * @see #setRadiusX(float)
	 * @generated
	 */
	void unsetRadiusX();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.EllipseType#getRadiusX <em>Radius X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Radius X</em>' attribute is set.
	 * @see #unsetRadiusX()
	 * @see #getRadiusX()
	 * @see #setRadiusX(float)
	 * @generated
	 */
	boolean isSetRadiusX();

	/**
	 * Returns the value of the '<em><b>Radius Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The vertical radius of the ellipse. [units pixels]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Radius Y</em>' attribute.
	 * @see #isSetRadiusY()
	 * @see #unsetRadiusY()
	 * @see #setRadiusY(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getEllipseType_RadiusY()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='RadiusY'"
	 * @generated
	 */
	float getRadiusY();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.EllipseType#getRadiusY <em>Radius Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius Y</em>' attribute.
	 * @see #isSetRadiusY()
	 * @see #unsetRadiusY()
	 * @see #getRadiusY()
	 * @generated
	 */
	void setRadiusY(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.EllipseType#getRadiusY <em>Radius Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRadiusY()
	 * @see #getRadiusY()
	 * @see #setRadiusY(float)
	 * @generated
	 */
	void unsetRadiusY();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.EllipseType#getRadiusY <em>Radius Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Radius Y</em>' attribute is set.
	 * @see #unsetRadiusY()
	 * @see #getRadiusY()
	 * @see #setRadiusY(float)
	 * @generated
	 */
	boolean isSetRadiusY();

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The X coordinate of the center of the ellipse. [units pixels]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getEllipseType_X()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='X'"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.EllipseType#getX <em>X</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openmicroscopy.ome.EllipseType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(float)
	 * @generated
	 */
	void unsetX();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.EllipseType#getX <em>X</em>}' attribute is set.
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
	 *                 The Y coordinate of the center of the ellipse. [units pixels]
	 *               
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #setY(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getEllipseType_Y()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='Y'"
	 * @generated
	 */
	float getY();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.EllipseType#getY <em>Y</em>}' attribute.
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
	 * Unsets the value of the '{@link org.openmicroscopy.ome.EllipseType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY()
	 * @see #getY()
	 * @see #setY(float)
	 * @generated
	 */
	void unsetY();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.EllipseType#getY <em>Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y</em>' attribute is set.
	 * @see #unsetY()
	 * @see #getY()
	 * @see #setY(float)
	 * @generated
	 */
	boolean isSetY();

} // EllipseType
