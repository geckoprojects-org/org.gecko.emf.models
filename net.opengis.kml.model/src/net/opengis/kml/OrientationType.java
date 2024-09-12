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
 * A representation of the model object '<em><b>Orientation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.OrientationType#getHeading <em>Heading</em>}</li>
 *   <li>{@link net.opengis.kml.OrientationType#getTilt <em>Tilt</em>}</li>
 *   <li>{@link net.opengis.kml.OrientationType#getRoll <em>Roll</em>}</li>
 *   <li>{@link net.opengis.kml.OrientationType#getOrientationSimpleExtensionGroupGroup <em>Orientation Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.OrientationType#getOrientationSimpleExtensionGroup <em>Orientation Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.OrientationType#getOrientationObjectExtensionGroupGroup <em>Orientation Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.OrientationType#getOrientationObjectExtensionGroup <em>Orientation Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getOrientationType()
 * @model extendedMetaData="name='OrientationType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OrientationType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Heading</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' attribute.
	 * @see #isSetHeading()
	 * @see #unsetHeading()
	 * @see #setHeading(double)
	 * @see net.opengis.kml.KMLPackage#getOrientationType_Heading()
	 * @model default="0.0" unsettable="true" dataType="net.opengis.kml.Angle360Type"
	 *        extendedMetaData="kind='element' name='heading' namespace='##targetNamespace'"
	 * @generated
	 */
	double getHeading();

	/**
	 * Sets the value of the '{@link net.opengis.kml.OrientationType#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' attribute.
	 * @see #isSetHeading()
	 * @see #unsetHeading()
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.OrientationType#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeading()
	 * @see #getHeading()
	 * @see #setHeading(double)
	 * @generated
	 */
	void unsetHeading();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.OrientationType#getHeading <em>Heading</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Heading</em>' attribute is set.
	 * @see #unsetHeading()
	 * @see #getHeading()
	 * @see #setHeading(double)
	 * @generated
	 */
	boolean isSetHeading();

	/**
	 * Returns the value of the '<em><b>Tilt</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tilt</em>' attribute.
	 * @see #isSetTilt()
	 * @see #unsetTilt()
	 * @see #setTilt(double)
	 * @see net.opengis.kml.KMLPackage#getOrientationType_Tilt()
	 * @model default="0.0" unsettable="true" dataType="net.opengis.kml.Anglepos180Type"
	 *        extendedMetaData="kind='element' name='tilt' namespace='##targetNamespace'"
	 * @generated
	 */
	double getTilt();

	/**
	 * Sets the value of the '{@link net.opengis.kml.OrientationType#getTilt <em>Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tilt</em>' attribute.
	 * @see #isSetTilt()
	 * @see #unsetTilt()
	 * @see #getTilt()
	 * @generated
	 */
	void setTilt(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.OrientationType#getTilt <em>Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTilt()
	 * @see #getTilt()
	 * @see #setTilt(double)
	 * @generated
	 */
	void unsetTilt();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.OrientationType#getTilt <em>Tilt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tilt</em>' attribute is set.
	 * @see #unsetTilt()
	 * @see #getTilt()
	 * @see #setTilt(double)
	 * @generated
	 */
	boolean isSetTilt();

	/**
	 * Returns the value of the '<em><b>Roll</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll</em>' attribute.
	 * @see #isSetRoll()
	 * @see #unsetRoll()
	 * @see #setRoll(double)
	 * @see net.opengis.kml.KMLPackage#getOrientationType_Roll()
	 * @model default="0.0" unsettable="true" dataType="net.opengis.kml.Angle180Type"
	 *        extendedMetaData="kind='element' name='roll' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRoll();

	/**
	 * Sets the value of the '{@link net.opengis.kml.OrientationType#getRoll <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll</em>' attribute.
	 * @see #isSetRoll()
	 * @see #unsetRoll()
	 * @see #getRoll()
	 * @generated
	 */
	void setRoll(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.OrientationType#getRoll <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRoll()
	 * @see #getRoll()
	 * @see #setRoll(double)
	 * @generated
	 */
	void unsetRoll();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.OrientationType#getRoll <em>Roll</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Roll</em>' attribute is set.
	 * @see #unsetRoll()
	 * @see #getRoll()
	 * @see #setRoll(double)
	 * @generated
	 */
	boolean isSetRoll();

	/**
	 * Returns the value of the '<em><b>Orientation Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getOrientationType_OrientationSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='OrientationSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getOrientationSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Orientation Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getOrientationType_OrientationSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrientationSimpleExtensionGroup' namespace='##targetNamespace' group='OrientationSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getOrientationSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Orientation Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getOrientationType_OrientationObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='OrientationObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getOrientationObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Orientation Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getOrientationType_OrientationObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrientationObjectExtensionGroup' namespace='##targetNamespace' group='OrientationObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getOrientationObjectExtensionGroup();

} // OrientationType
