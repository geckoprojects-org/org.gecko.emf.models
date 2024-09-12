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
 * A representation of the model object '<em><b>Screen Overlay Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.ScreenOverlayType#getOverlayXY <em>Overlay XY</em>}</li>
 *   <li>{@link net.opengis.kml.ScreenOverlayType#getScreenXY <em>Screen XY</em>}</li>
 *   <li>{@link net.opengis.kml.ScreenOverlayType#getRotationXY <em>Rotation XY</em>}</li>
 *   <li>{@link net.opengis.kml.ScreenOverlayType#getSize <em>Size</em>}</li>
 *   <li>{@link net.opengis.kml.ScreenOverlayType#getRotation <em>Rotation</em>}</li>
 *   <li>{@link net.opengis.kml.ScreenOverlayType#getScreenOverlaySimpleExtensionGroupGroup <em>Screen Overlay Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.ScreenOverlayType#getScreenOverlaySimpleExtensionGroup <em>Screen Overlay Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.ScreenOverlayType#getScreenOverlayObjectExtensionGroupGroup <em>Screen Overlay Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.ScreenOverlayType#getScreenOverlayObjectExtensionGroup <em>Screen Overlay Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getScreenOverlayType()
 * @model extendedMetaData="name='ScreenOverlayType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ScreenOverlayType extends AbstractOverlayType {
	/**
	 * Returns the value of the '<em><b>Overlay XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlay XY</em>' containment reference.
	 * @see #setOverlayXY(Vec2Type)
	 * @see net.opengis.kml.KMLPackage#getScreenOverlayType_OverlayXY()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='overlayXY' namespace='##targetNamespace'"
	 * @generated
	 */
	Vec2Type getOverlayXY();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ScreenOverlayType#getOverlayXY <em>Overlay XY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlay XY</em>' containment reference.
	 * @see #getOverlayXY()
	 * @generated
	 */
	void setOverlayXY(Vec2Type value);

	/**
	 * Returns the value of the '<em><b>Screen XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen XY</em>' containment reference.
	 * @see #setScreenXY(Vec2Type)
	 * @see net.opengis.kml.KMLPackage#getScreenOverlayType_ScreenXY()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='screenXY' namespace='##targetNamespace'"
	 * @generated
	 */
	Vec2Type getScreenXY();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ScreenOverlayType#getScreenXY <em>Screen XY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen XY</em>' containment reference.
	 * @see #getScreenXY()
	 * @generated
	 */
	void setScreenXY(Vec2Type value);

	/**
	 * Returns the value of the '<em><b>Rotation XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation XY</em>' containment reference.
	 * @see #setRotationXY(Vec2Type)
	 * @see net.opengis.kml.KMLPackage#getScreenOverlayType_RotationXY()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rotationXY' namespace='##targetNamespace'"
	 * @generated
	 */
	Vec2Type getRotationXY();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ScreenOverlayType#getRotationXY <em>Rotation XY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation XY</em>' containment reference.
	 * @see #getRotationXY()
	 * @generated
	 */
	void setRotationXY(Vec2Type value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Vec2Type)
	 * @see net.opengis.kml.KMLPackage#getScreenOverlayType_Size()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	Vec2Type getSize();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ScreenOverlayType#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Vec2Type value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #isSetRotation()
	 * @see #unsetRotation()
	 * @see #setRotation(double)
	 * @see net.opengis.kml.KMLPackage#getScreenOverlayType_Rotation()
	 * @model default="0.0" unsettable="true" dataType="net.opengis.kml.Angle180Type"
	 *        extendedMetaData="kind='element' name='rotation' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRotation();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ScreenOverlayType#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #isSetRotation()
	 * @see #unsetRotation()
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.ScreenOverlayType#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotation()
	 * @see #getRotation()
	 * @see #setRotation(double)
	 * @generated
	 */
	void unsetRotation();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.ScreenOverlayType#getRotation <em>Rotation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotation</em>' attribute is set.
	 * @see #unsetRotation()
	 * @see #getRotation()
	 * @see #setRotation(double)
	 * @generated
	 */
	boolean isSetRotation();

	/**
	 * Returns the value of the '<em><b>Screen Overlay Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen Overlay Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getScreenOverlayType_ScreenOverlaySimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ScreenOverlaySimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getScreenOverlaySimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Screen Overlay Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen Overlay Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getScreenOverlayType_ScreenOverlaySimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScreenOverlaySimpleExtensionGroup' namespace='##targetNamespace' group='ScreenOverlaySimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getScreenOverlaySimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Screen Overlay Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen Overlay Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getScreenOverlayType_ScreenOverlayObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ScreenOverlayObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getScreenOverlayObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Screen Overlay Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen Overlay Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getScreenOverlayType_ScreenOverlayObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScreenOverlayObjectExtensionGroup' namespace='##targetNamespace' group='ScreenOverlayObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getScreenOverlayObjectExtensionGroup();

} // ScreenOverlayType
