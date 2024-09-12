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
 * A representation of the model object '<em><b>List Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.ListStyleType#getListItemType <em>List Item Type</em>}</li>
 *   <li>{@link net.opengis.kml.ListStyleType#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link net.opengis.kml.ListStyleType#getItemIcon <em>Item Icon</em>}</li>
 *   <li>{@link net.opengis.kml.ListStyleType#getMaxSnippetLines <em>Max Snippet Lines</em>}</li>
 *   <li>{@link net.opengis.kml.ListStyleType#getListStyleSimpleExtensionGroupGroup <em>List Style Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.ListStyleType#getListStyleSimpleExtensionGroup <em>List Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.ListStyleType#getListStyleObjectExtensionGroupGroup <em>List Style Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.ListStyleType#getListStyleObjectExtensionGroup <em>List Style Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getListStyleType()
 * @model extendedMetaData="name='ListStyleType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ListStyleType extends AbstractSubStyleType {
	/**
	 * Returns the value of the '<em><b>List Item Type</b></em>' attribute.
	 * The default value is <code>"check"</code>.
	 * The literals are from the enumeration {@link net.opengis.kml.ListItemTypeEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Item Type</em>' attribute.
	 * @see net.opengis.kml.ListItemTypeEnumType
	 * @see #isSetListItemType()
	 * @see #unsetListItemType()
	 * @see #setListItemType(ListItemTypeEnumType)
	 * @see net.opengis.kml.KMLPackage#getListStyleType_ListItemType()
	 * @model default="check" unsettable="true"
	 *        extendedMetaData="kind='element' name='listItemType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListItemTypeEnumType getListItemType();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ListStyleType#getListItemType <em>List Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Item Type</em>' attribute.
	 * @see net.opengis.kml.ListItemTypeEnumType
	 * @see #isSetListItemType()
	 * @see #unsetListItemType()
	 * @see #getListItemType()
	 * @generated
	 */
	void setListItemType(ListItemTypeEnumType value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.ListStyleType#getListItemType <em>List Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetListItemType()
	 * @see #getListItemType()
	 * @see #setListItemType(ListItemTypeEnumType)
	 * @generated
	 */
	void unsetListItemType();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.ListStyleType#getListItemType <em>List Item Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>List Item Type</em>' attribute is set.
	 * @see #unsetListItemType()
	 * @see #getListItemType()
	 * @see #setListItemType(ListItemTypeEnumType)
	 * @generated
	 */
	boolean isSetListItemType();

	/**
	 * Returns the value of the '<em><b>Bg Color</b></em>' attribute.
	 * The default value is <code>"ffffffff"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bg Color</em>' attribute.
	 * @see #isSetBgColor()
	 * @see #unsetBgColor()
	 * @see #setBgColor(byte[])
	 * @see net.opengis.kml.KMLPackage#getListStyleType_BgColor()
	 * @model default="ffffffff" unsettable="true" dataType="net.opengis.kml.ColorType"
	 *        extendedMetaData="kind='element' name='bgColor' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getBgColor();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ListStyleType#getBgColor <em>Bg Color</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.kml.ListStyleType#getBgColor <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBgColor()
	 * @see #getBgColor()
	 * @see #setBgColor(byte[])
	 * @generated
	 */
	void unsetBgColor();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.ListStyleType#getBgColor <em>Bg Color</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Item Icon</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.ItemIconType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Icon</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getListStyleType_ItemIcon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemIcon' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemIconType> getItemIcon();

	/**
	 * Returns the value of the '<em><b>Max Snippet Lines</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Snippet Lines</em>' attribute.
	 * @see #isSetMaxSnippetLines()
	 * @see #unsetMaxSnippetLines()
	 * @see #setMaxSnippetLines(int)
	 * @see net.opengis.kml.KMLPackage#getListStyleType_MaxSnippetLines()
	 * @model default="2" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='maxSnippetLines' namespace='##targetNamespace'"
	 * @generated
	 */
	int getMaxSnippetLines();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ListStyleType#getMaxSnippetLines <em>Max Snippet Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Snippet Lines</em>' attribute.
	 * @see #isSetMaxSnippetLines()
	 * @see #unsetMaxSnippetLines()
	 * @see #getMaxSnippetLines()
	 * @generated
	 */
	void setMaxSnippetLines(int value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.ListStyleType#getMaxSnippetLines <em>Max Snippet Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxSnippetLines()
	 * @see #getMaxSnippetLines()
	 * @see #setMaxSnippetLines(int)
	 * @generated
	 */
	void unsetMaxSnippetLines();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.ListStyleType#getMaxSnippetLines <em>Max Snippet Lines</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Snippet Lines</em>' attribute is set.
	 * @see #unsetMaxSnippetLines()
	 * @see #getMaxSnippetLines()
	 * @see #setMaxSnippetLines(int)
	 * @generated
	 */
	boolean isSetMaxSnippetLines();

	/**
	 * Returns the value of the '<em><b>List Style Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Style Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getListStyleType_ListStyleSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ListStyleSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getListStyleSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>List Style Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Style Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getListStyleType_ListStyleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListStyleSimpleExtensionGroup' namespace='##targetNamespace' group='ListStyleSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getListStyleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>List Style Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Style Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getListStyleType_ListStyleObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ListStyleObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getListStyleObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>List Style Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Style Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getListStyleType_ListStyleObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListStyleObjectExtensionGroup' namespace='##targetNamespace' group='ListStyleObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getListStyleObjectExtensionGroup();

} // ListStyleType
