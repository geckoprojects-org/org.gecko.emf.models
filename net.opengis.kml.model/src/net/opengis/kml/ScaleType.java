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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scale Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.ScaleType#getX <em>X</em>}</li>
 *   <li>{@link net.opengis.kml.ScaleType#getY <em>Y</em>}</li>
 *   <li>{@link net.opengis.kml.ScaleType#getZ <em>Z</em>}</li>
 *   <li>{@link net.opengis.kml.ScaleType#getScaleSimpleExtensionGroupGroup <em>Scale Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.ScaleType#getScaleSimpleExtensionGroup <em>Scale Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.ScaleType#getScaleObjectExtensionGroupGroup <em>Scale Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.ScaleType#getScaleObjectExtensionGroup <em>Scale Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getScaleType()
 * @model extendedMetaData="name='ScaleType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ScaleType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(double)
	 * @see net.opengis.kml.KMLPackage#getScaleType_X()
	 * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ScaleType#getX <em>X</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.kml.ScaleType#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(double)
	 * @generated
	 */
	void unsetX();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.ScaleType#getX <em>X</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #setY(double)
	 * @see net.opengis.kml.KMLPackage#getScaleType_Y()
	 * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='y' namespace='##targetNamespace'"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ScaleType#getY <em>Y</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.kml.ScaleType#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY()
	 * @see #getY()
	 * @see #setY(double)
	 * @generated
	 */
	void unsetY();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.ScaleType#getY <em>Y</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #isSetZ()
	 * @see #unsetZ()
	 * @see #setZ(double)
	 * @see net.opengis.kml.KMLPackage#getScaleType_Z()
	 * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	double getZ();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ScaleType#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #isSetZ()
	 * @see #unsetZ()
	 * @see #getZ()
	 * @generated
	 */
	void setZ(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.ScaleType#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetZ()
	 * @see #getZ()
	 * @see #setZ(double)
	 * @generated
	 */
	void unsetZ();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.ScaleType#getZ <em>Z</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Z</em>' attribute is set.
	 * @see #unsetZ()
	 * @see #getZ()
	 * @see #setZ(double)
	 * @generated
	 */
	boolean isSetZ();

	/**
	 * Returns the value of the '<em><b>Scale Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getScaleType_ScaleSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ScaleSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getScaleSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Scale Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getScaleType_ScaleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScaleSimpleExtensionGroup' namespace='##targetNamespace' group='ScaleSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getScaleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Scale Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getScaleType_ScaleObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ScaleObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getScaleObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Scale Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getScaleType_ScaleObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScaleObjectExtensionGroup' namespace='##targetNamespace' group='ScaleObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getScaleObjectExtensionGroup();

} // ScaleType
