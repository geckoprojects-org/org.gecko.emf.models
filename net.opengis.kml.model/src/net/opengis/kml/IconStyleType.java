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
 * A representation of the model object '<em><b>Icon Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.IconStyleType#getScale <em>Scale</em>}</li>
 *   <li>{@link net.opengis.kml.IconStyleType#getHeading <em>Heading</em>}</li>
 *   <li>{@link net.opengis.kml.IconStyleType#getIcon <em>Icon</em>}</li>
 *   <li>{@link net.opengis.kml.IconStyleType#getHotSpot <em>Hot Spot</em>}</li>
 *   <li>{@link net.opengis.kml.IconStyleType#getIconStyleSimpleExtensionGroupGroup <em>Icon Style Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.IconStyleType#getIconStyleSimpleExtensionGroup <em>Icon Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.IconStyleType#getIconStyleObjectExtensionGroupGroup <em>Icon Style Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.IconStyleType#getIconStyleObjectExtensionGroup <em>Icon Style Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getIconStyleType()
 * @model extendedMetaData="name='IconStyleType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IconStyleType extends AbstractColorStyleType {
	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #setScale(double)
	 * @see net.opengis.kml.KMLPackage#getIconStyleType_Scale()
	 * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='scale' namespace='##targetNamespace'"
	 * @generated
	 */
	double getScale();

	/**
	 * Sets the value of the '{@link net.opengis.kml.IconStyleType#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #getScale()
	 * @generated
	 */
	void setScale(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.IconStyleType#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScale()
	 * @see #getScale()
	 * @see #setScale(double)
	 * @generated
	 */
	void unsetScale();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.IconStyleType#getScale <em>Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scale</em>' attribute is set.
	 * @see #unsetScale()
	 * @see #getScale()
	 * @see #setScale(double)
	 * @generated
	 */
	boolean isSetScale();

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' attribute.
	 * @see #isSetHeading()
	 * @see #unsetHeading()
	 * @see #setHeading(double)
	 * @see net.opengis.kml.KMLPackage#getIconStyleType_Heading()
	 * @model default="0.0" unsettable="true" dataType="net.opengis.kml.Angle360Type"
	 *        extendedMetaData="kind='element' name='heading' namespace='##targetNamespace'"
	 * @generated
	 */
	double getHeading();

	/**
	 * Sets the value of the '{@link net.opengis.kml.IconStyleType#getHeading <em>Heading</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.kml.IconStyleType#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeading()
	 * @see #getHeading()
	 * @see #setHeading(double)
	 * @generated
	 */
	void unsetHeading();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.IconStyleType#getHeading <em>Heading</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference.
	 * @see #setIcon(BasicLinkType)
	 * @see net.opengis.kml.KMLPackage#getIconStyleType_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Icon' namespace='##targetNamespace'"
	 * @generated
	 */
	BasicLinkType getIcon();

	/**
	 * Sets the value of the '{@link net.opengis.kml.IconStyleType#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(BasicLinkType value);

	/**
	 * Returns the value of the '<em><b>Hot Spot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hot Spot</em>' containment reference.
	 * @see #setHotSpot(Vec2Type)
	 * @see net.opengis.kml.KMLPackage#getIconStyleType_HotSpot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hotSpot' namespace='##targetNamespace'"
	 * @generated
	 */
	Vec2Type getHotSpot();

	/**
	 * Sets the value of the '{@link net.opengis.kml.IconStyleType#getHotSpot <em>Hot Spot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Spot</em>' containment reference.
	 * @see #getHotSpot()
	 * @generated
	 */
	void setHotSpot(Vec2Type value);

	/**
	 * Returns the value of the '<em><b>Icon Style Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Style Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getIconStyleType_IconStyleSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='IconStyleSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIconStyleSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Icon Style Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Style Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getIconStyleType_IconStyleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IconStyleSimpleExtensionGroup' namespace='##targetNamespace' group='IconStyleSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getIconStyleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Icon Style Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Style Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getIconStyleType_IconStyleObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='IconStyleObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIconStyleObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Icon Style Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Style Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getIconStyleType_IconStyleObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IconStyleObjectExtensionGroup' namespace='##targetNamespace' group='IconStyleObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getIconStyleObjectExtensionGroup();

} // IconStyleType
