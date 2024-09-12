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
 * A representation of the model object '<em><b>Balloon Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.BalloonStyleType#getColor <em>Color</em>}</li>
 *   <li>{@link net.opengis.kml.BalloonStyleType#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link net.opengis.kml.BalloonStyleType#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link net.opengis.kml.BalloonStyleType#getText <em>Text</em>}</li>
 *   <li>{@link net.opengis.kml.BalloonStyleType#getDisplayMode <em>Display Mode</em>}</li>
 *   <li>{@link net.opengis.kml.BalloonStyleType#getBalloonStyleSimpleExtensionGroupGroup <em>Balloon Style Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.BalloonStyleType#getBalloonStyleSimpleExtensionGroup <em>Balloon Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.BalloonStyleType#getBalloonStyleObjectExtensionGroupGroup <em>Balloon Style Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.BalloonStyleType#getBalloonStyleObjectExtensionGroup <em>Balloon Style Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getBalloonStyleType()
 * @model extendedMetaData="name='BalloonStyleType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BalloonStyleType extends AbstractSubStyleType {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"ffffffff"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #isSetColor()
	 * @see #unsetColor()
	 * @see #setColor(byte[])
	 * @see net.opengis.kml.KMLPackage#getBalloonStyleType_Color()
	 * @model default="ffffffff" unsettable="true" dataType="net.opengis.kml.ColorType"
	 *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getColor();

	/**
	 * Sets the value of the '{@link net.opengis.kml.BalloonStyleType#getColor <em>Color</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.kml.BalloonStyleType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColor()
	 * @see #getColor()
	 * @see #setColor(byte[])
	 * @generated
	 */
	void unsetColor();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.BalloonStyleType#getColor <em>Color</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Bg Color</b></em>' attribute.
	 * The default value is <code>"ffffffff"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bg Color</em>' attribute.
	 * @see #isSetBgColor()
	 * @see #unsetBgColor()
	 * @see #setBgColor(byte[])
	 * @see net.opengis.kml.KMLPackage#getBalloonStyleType_BgColor()
	 * @model default="ffffffff" unsettable="true" dataType="net.opengis.kml.ColorType"
	 *        extendedMetaData="kind='element' name='bgColor' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getBgColor();

	/**
	 * Sets the value of the '{@link net.opengis.kml.BalloonStyleType#getBgColor <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bg Color</em>' attribute.
	 * @see #isSetBgColor()
	 * @see #unsetBgColor()
	 * @see #getBgColor()
	 * @generated
	 */
	void setBgColor(byte[] value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.BalloonStyleType#getBgColor <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBgColor()
	 * @see #getBgColor()
	 * @see #setBgColor(byte[])
	 * @generated
	 */
	void unsetBgColor();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.BalloonStyleType#getBgColor <em>Bg Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bg Color</em>' attribute is set.
	 * @see #unsetBgColor()
	 * @see #getBgColor()
	 * @see #setBgColor(byte[])
	 * @generated
	 */
	boolean isSetBgColor();

	/**
	 * Returns the value of the '<em><b>Text Color</b></em>' attribute.
	 * The default value is <code>"ff000000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Color</em>' attribute.
	 * @see #isSetTextColor()
	 * @see #unsetTextColor()
	 * @see #setTextColor(byte[])
	 * @see net.opengis.kml.KMLPackage#getBalloonStyleType_TextColor()
	 * @model default="ff000000" unsettable="true" dataType="net.opengis.kml.ColorType"
	 *        extendedMetaData="kind='element' name='textColor' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getTextColor();

	/**
	 * Sets the value of the '{@link net.opengis.kml.BalloonStyleType#getTextColor <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' attribute.
	 * @see #isSetTextColor()
	 * @see #unsetTextColor()
	 * @see #getTextColor()
	 * @generated
	 */
	void setTextColor(byte[] value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.BalloonStyleType#getTextColor <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextColor()
	 * @see #getTextColor()
	 * @see #setTextColor(byte[])
	 * @generated
	 */
	void unsetTextColor();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.BalloonStyleType#getTextColor <em>Text Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Color</em>' attribute is set.
	 * @see #unsetTextColor()
	 * @see #getTextColor()
	 * @see #setTextColor(byte[])
	 * @generated
	 */
	boolean isSetTextColor();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see net.opengis.kml.KMLPackage#getBalloonStyleType_Text()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link net.opengis.kml.BalloonStyleType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Display Mode</b></em>' attribute.
	 * The default value is <code>"default"</code>.
	 * The literals are from the enumeration {@link net.opengis.kml.DisplayModeEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Mode</em>' attribute.
	 * @see net.opengis.kml.DisplayModeEnumType
	 * @see #isSetDisplayMode()
	 * @see #unsetDisplayMode()
	 * @see #setDisplayMode(DisplayModeEnumType)
	 * @see net.opengis.kml.KMLPackage#getBalloonStyleType_DisplayMode()
	 * @model default="default" unsettable="true"
	 *        extendedMetaData="kind='element' name='displayMode' namespace='##targetNamespace'"
	 * @generated
	 */
	DisplayModeEnumType getDisplayMode();

	/**
	 * Sets the value of the '{@link net.opengis.kml.BalloonStyleType#getDisplayMode <em>Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Mode</em>' attribute.
	 * @see net.opengis.kml.DisplayModeEnumType
	 * @see #isSetDisplayMode()
	 * @see #unsetDisplayMode()
	 * @see #getDisplayMode()
	 * @generated
	 */
	void setDisplayMode(DisplayModeEnumType value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.BalloonStyleType#getDisplayMode <em>Display Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayMode()
	 * @see #getDisplayMode()
	 * @see #setDisplayMode(DisplayModeEnumType)
	 * @generated
	 */
	void unsetDisplayMode();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.BalloonStyleType#getDisplayMode <em>Display Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Mode</em>' attribute is set.
	 * @see #unsetDisplayMode()
	 * @see #getDisplayMode()
	 * @see #setDisplayMode(DisplayModeEnumType)
	 * @generated
	 */
	boolean isSetDisplayMode();

	/**
	 * Returns the value of the '<em><b>Balloon Style Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balloon Style Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getBalloonStyleType_BalloonStyleSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='BalloonStyleSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBalloonStyleSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Balloon Style Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balloon Style Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getBalloonStyleType_BalloonStyleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BalloonStyleSimpleExtensionGroup' namespace='##targetNamespace' group='BalloonStyleSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getBalloonStyleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Balloon Style Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balloon Style Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getBalloonStyleType_BalloonStyleObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='BalloonStyleObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getBalloonStyleObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Balloon Style Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balloon Style Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getBalloonStyleType_BalloonStyleObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BalloonStyleObjectExtensionGroup' namespace='##targetNamespace' group='BalloonStyleObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getBalloonStyleObjectExtensionGroup();

} // BalloonStyleType
