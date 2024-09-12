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
 * A representation of the model object '<em><b>Abstract Overlay Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.AbstractOverlayType#getColor <em>Color</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractOverlayType#getDrawOrder <em>Draw Order</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractOverlayType#getIcon <em>Icon</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractOverlayType#getAbstractOverlaySimpleExtensionGroupGroup <em>Abstract Overlay Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractOverlayType#getAbstractOverlaySimpleExtensionGroup <em>Abstract Overlay Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractOverlayType#getAbstractOverlayObjectExtensionGroupGroup <em>Abstract Overlay Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractOverlayType#getAbstractOverlayObjectExtensionGroup <em>Abstract Overlay Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getAbstractOverlayType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractOverlayType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractOverlayType extends AbstractFeatureType {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"ffffffff"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #isSetColor()
	 * @see #unsetColor()
	 * @see #setColor(byte[])
	 * @see net.opengis.kml.KMLPackage#getAbstractOverlayType_Color()
	 * @model default="ffffffff" unsettable="true" dataType="net.opengis.kml.ColorType"
	 *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getColor();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractOverlayType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #isSetColor()
	 * @see #unsetColor()
	 * @see #getColor()
	 * @generated
	 */
	void setColor(byte[] value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.AbstractOverlayType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColor()
	 * @see #getColor()
	 * @see #setColor(byte[])
	 * @generated
	 */
	void unsetColor();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.AbstractOverlayType#getColor <em>Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Color</em>' attribute is set.
	 * @see #unsetColor()
	 * @see #getColor()
	 * @see #setColor(byte[])
	 * @generated
	 */
	boolean isSetColor();

	/**
	 * Returns the value of the '<em><b>Draw Order</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Draw Order</em>' attribute.
	 * @see #isSetDrawOrder()
	 * @see #unsetDrawOrder()
	 * @see #setDrawOrder(int)
	 * @see net.opengis.kml.KMLPackage#getAbstractOverlayType_DrawOrder()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='drawOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDrawOrder();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractOverlayType#getDrawOrder <em>Draw Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Draw Order</em>' attribute.
	 * @see #isSetDrawOrder()
	 * @see #unsetDrawOrder()
	 * @see #getDrawOrder()
	 * @generated
	 */
	void setDrawOrder(int value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.AbstractOverlayType#getDrawOrder <em>Draw Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDrawOrder()
	 * @see #getDrawOrder()
	 * @see #setDrawOrder(int)
	 * @generated
	 */
	void unsetDrawOrder();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.AbstractOverlayType#getDrawOrder <em>Draw Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Draw Order</em>' attribute is set.
	 * @see #unsetDrawOrder()
	 * @see #getDrawOrder()
	 * @see #setDrawOrder(int)
	 * @generated
	 */
	boolean isSetDrawOrder();

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference.
	 * @see #setIcon(LinkType)
	 * @see net.opengis.kml.KMLPackage#getAbstractOverlayType_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Icon' namespace='##targetNamespace'"
	 * @generated
	 */
	LinkType getIcon();

	/**
	 * Sets the value of the '{@link net.opengis.kml.AbstractOverlayType#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(LinkType value);

	/**
	 * Returns the value of the '<em><b>Abstract Overlay Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Overlay Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractOverlayType_AbstractOverlaySimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractOverlaySimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractOverlaySimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Overlay Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Overlay Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractOverlayType_AbstractOverlaySimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractOverlaySimpleExtensionGroup' namespace='##targetNamespace' group='AbstractOverlaySimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getAbstractOverlaySimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Overlay Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Overlay Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractOverlayType_AbstractOverlayObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractOverlayObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractOverlayObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Overlay Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Overlay Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getAbstractOverlayType_AbstractOverlayObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractOverlayObjectExtensionGroup' namespace='##targetNamespace' group='AbstractOverlayObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getAbstractOverlayObjectExtensionGroup();

} // AbstractOverlayType
