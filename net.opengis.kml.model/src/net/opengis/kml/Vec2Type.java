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
package net.opengis.kml;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vec2 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.Vec2Type#getX <em>X</em>}</li>
 *   <li>{@link net.opengis.kml.Vec2Type#getXunits <em>Xunits</em>}</li>
 *   <li>{@link net.opengis.kml.Vec2Type#getY <em>Y</em>}</li>
 *   <li>{@link net.opengis.kml.Vec2Type#getYunits <em>Yunits</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getVec2Type()
 * @model extendedMetaData="name='vec2Type' kind='empty'"
 * @generated
 */
@ProviderType
public interface Vec2Type extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(double)
	 * @see net.opengis.kml.KMLPackage#getVec2Type_X()
	 * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='x'"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link net.opengis.kml.Vec2Type#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.Vec2Type#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(double)
	 * @generated
	 */
	void unsetX();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.Vec2Type#getX <em>X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X</em>' attribute is set.
	 * @see #unsetX()
	 * @see #getX()
	 * @see #setX(double)
	 * @generated
	 */
	boolean isSetX();

	/**
	 * Returns the value of the '<em><b>Xunits</b></em>' attribute.
	 * The default value is <code>"fraction"</code>.
	 * The literals are from the enumeration {@link net.opengis.kml.UnitsEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xunits</em>' attribute.
	 * @see net.opengis.kml.UnitsEnumType
	 * @see #isSetXunits()
	 * @see #unsetXunits()
	 * @see #setXunits(UnitsEnumType)
	 * @see net.opengis.kml.KMLPackage#getVec2Type_Xunits()
	 * @model default="fraction" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='xunits'"
	 * @generated
	 */
	UnitsEnumType getXunits();

	/**
	 * Sets the value of the '{@link net.opengis.kml.Vec2Type#getXunits <em>Xunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xunits</em>' attribute.
	 * @see net.opengis.kml.UnitsEnumType
	 * @see #isSetXunits()
	 * @see #unsetXunits()
	 * @see #getXunits()
	 * @generated
	 */
	void setXunits(UnitsEnumType value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.Vec2Type#getXunits <em>Xunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXunits()
	 * @see #getXunits()
	 * @see #setXunits(UnitsEnumType)
	 * @generated
	 */
	void unsetXunits();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.Vec2Type#getXunits <em>Xunits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Xunits</em>' attribute is set.
	 * @see #unsetXunits()
	 * @see #getXunits()
	 * @see #setXunits(UnitsEnumType)
	 * @generated
	 */
	boolean isSetXunits();

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #setY(double)
	 * @see net.opengis.kml.KMLPackage#getVec2Type_Y()
	 * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='y'"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link net.opengis.kml.Vec2Type#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.Vec2Type#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY()
	 * @see #getY()
	 * @see #setY(double)
	 * @generated
	 */
	void unsetY();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.Vec2Type#getY <em>Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y</em>' attribute is set.
	 * @see #unsetY()
	 * @see #getY()
	 * @see #setY(double)
	 * @generated
	 */
	boolean isSetY();

	/**
	 * Returns the value of the '<em><b>Yunits</b></em>' attribute.
	 * The default value is <code>"fraction"</code>.
	 * The literals are from the enumeration {@link net.opengis.kml.UnitsEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yunits</em>' attribute.
	 * @see net.opengis.kml.UnitsEnumType
	 * @see #isSetYunits()
	 * @see #unsetYunits()
	 * @see #setYunits(UnitsEnumType)
	 * @see net.opengis.kml.KMLPackage#getVec2Type_Yunits()
	 * @model default="fraction" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='yunits'"
	 * @generated
	 */
	UnitsEnumType getYunits();

	/**
	 * Sets the value of the '{@link net.opengis.kml.Vec2Type#getYunits <em>Yunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yunits</em>' attribute.
	 * @see net.opengis.kml.UnitsEnumType
	 * @see #isSetYunits()
	 * @see #unsetYunits()
	 * @see #getYunits()
	 * @generated
	 */
	void setYunits(UnitsEnumType value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.Vec2Type#getYunits <em>Yunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYunits()
	 * @see #getYunits()
	 * @see #setYunits(UnitsEnumType)
	 * @generated
	 */
	void unsetYunits();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.Vec2Type#getYunits <em>Yunits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Yunits</em>' attribute is set.
	 * @see #unsetYunits()
	 * @see #getYunits()
	 * @see #setYunits(UnitsEnumType)
	 * @generated
	 */
	boolean isSetYunits();

} // Vec2Type
