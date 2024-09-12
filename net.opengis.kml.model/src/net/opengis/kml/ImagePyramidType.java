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
 * A representation of the model object '<em><b>Image Pyramid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.ImagePyramidType#getTileSize <em>Tile Size</em>}</li>
 *   <li>{@link net.opengis.kml.ImagePyramidType#getMaxWidth <em>Max Width</em>}</li>
 *   <li>{@link net.opengis.kml.ImagePyramidType#getMaxHeight <em>Max Height</em>}</li>
 *   <li>{@link net.opengis.kml.ImagePyramidType#getGridOrigin <em>Grid Origin</em>}</li>
 *   <li>{@link net.opengis.kml.ImagePyramidType#getImagePyramidSimpleExtensionGroupGroup <em>Image Pyramid Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.ImagePyramidType#getImagePyramidSimpleExtensionGroup <em>Image Pyramid Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.ImagePyramidType#getImagePyramidObjectExtensionGroupGroup <em>Image Pyramid Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.ImagePyramidType#getImagePyramidObjectExtensionGroup <em>Image Pyramid Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getImagePyramidType()
 * @model extendedMetaData="name='ImagePyramidType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ImagePyramidType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Tile Size</b></em>' attribute.
	 * The default value is <code>"256"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile Size</em>' attribute.
	 * @see #isSetTileSize()
	 * @see #unsetTileSize()
	 * @see #setTileSize(int)
	 * @see net.opengis.kml.KMLPackage#getImagePyramidType_TileSize()
	 * @model default="256" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='tileSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getTileSize();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ImagePyramidType#getTileSize <em>Tile Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile Size</em>' attribute.
	 * @see #isSetTileSize()
	 * @see #unsetTileSize()
	 * @see #getTileSize()
	 * @generated
	 */
	void setTileSize(int value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.ImagePyramidType#getTileSize <em>Tile Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTileSize()
	 * @see #getTileSize()
	 * @see #setTileSize(int)
	 * @generated
	 */
	void unsetTileSize();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.ImagePyramidType#getTileSize <em>Tile Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tile Size</em>' attribute is set.
	 * @see #unsetTileSize()
	 * @see #getTileSize()
	 * @see #setTileSize(int)
	 * @generated
	 */
	boolean isSetTileSize();

	/**
	 * Returns the value of the '<em><b>Max Width</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Width</em>' attribute.
	 * @see #isSetMaxWidth()
	 * @see #unsetMaxWidth()
	 * @see #setMaxWidth(int)
	 * @see net.opengis.kml.KMLPackage#getImagePyramidType_MaxWidth()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='maxWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	int getMaxWidth();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ImagePyramidType#getMaxWidth <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Width</em>' attribute.
	 * @see #isSetMaxWidth()
	 * @see #unsetMaxWidth()
	 * @see #getMaxWidth()
	 * @generated
	 */
	void setMaxWidth(int value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.ImagePyramidType#getMaxWidth <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxWidth()
	 * @see #getMaxWidth()
	 * @see #setMaxWidth(int)
	 * @generated
	 */
	void unsetMaxWidth();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.ImagePyramidType#getMaxWidth <em>Max Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Width</em>' attribute is set.
	 * @see #unsetMaxWidth()
	 * @see #getMaxWidth()
	 * @see #setMaxWidth(int)
	 * @generated
	 */
	boolean isSetMaxWidth();

	/**
	 * Returns the value of the '<em><b>Max Height</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Height</em>' attribute.
	 * @see #isSetMaxHeight()
	 * @see #unsetMaxHeight()
	 * @see #setMaxHeight(int)
	 * @see net.opengis.kml.KMLPackage#getImagePyramidType_MaxHeight()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='maxHeight' namespace='##targetNamespace'"
	 * @generated
	 */
	int getMaxHeight();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ImagePyramidType#getMaxHeight <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Height</em>' attribute.
	 * @see #isSetMaxHeight()
	 * @see #unsetMaxHeight()
	 * @see #getMaxHeight()
	 * @generated
	 */
	void setMaxHeight(int value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.ImagePyramidType#getMaxHeight <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxHeight()
	 * @see #getMaxHeight()
	 * @see #setMaxHeight(int)
	 * @generated
	 */
	void unsetMaxHeight();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.ImagePyramidType#getMaxHeight <em>Max Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Height</em>' attribute is set.
	 * @see #unsetMaxHeight()
	 * @see #getMaxHeight()
	 * @see #setMaxHeight(int)
	 * @generated
	 */
	boolean isSetMaxHeight();

	/**
	 * Returns the value of the '<em><b>Grid Origin</b></em>' attribute.
	 * The default value is <code>"lowerLeft"</code>.
	 * The literals are from the enumeration {@link net.opengis.kml.GridOriginEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Origin</em>' attribute.
	 * @see net.opengis.kml.GridOriginEnumType
	 * @see #isSetGridOrigin()
	 * @see #unsetGridOrigin()
	 * @see #setGridOrigin(GridOriginEnumType)
	 * @see net.opengis.kml.KMLPackage#getImagePyramidType_GridOrigin()
	 * @model default="lowerLeft" unsettable="true"
	 *        extendedMetaData="kind='element' name='gridOrigin' namespace='##targetNamespace'"
	 * @generated
	 */
	GridOriginEnumType getGridOrigin();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ImagePyramidType#getGridOrigin <em>Grid Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Origin</em>' attribute.
	 * @see net.opengis.kml.GridOriginEnumType
	 * @see #isSetGridOrigin()
	 * @see #unsetGridOrigin()
	 * @see #getGridOrigin()
	 * @generated
	 */
	void setGridOrigin(GridOriginEnumType value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.ImagePyramidType#getGridOrigin <em>Grid Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGridOrigin()
	 * @see #getGridOrigin()
	 * @see #setGridOrigin(GridOriginEnumType)
	 * @generated
	 */
	void unsetGridOrigin();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.ImagePyramidType#getGridOrigin <em>Grid Origin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grid Origin</em>' attribute is set.
	 * @see #unsetGridOrigin()
	 * @see #getGridOrigin()
	 * @see #setGridOrigin(GridOriginEnumType)
	 * @generated
	 */
	boolean isSetGridOrigin();

	/**
	 * Returns the value of the '<em><b>Image Pyramid Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Pyramid Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getImagePyramidType_ImagePyramidSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ImagePyramidSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getImagePyramidSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Image Pyramid Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Pyramid Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getImagePyramidType_ImagePyramidSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImagePyramidSimpleExtensionGroup' namespace='##targetNamespace' group='ImagePyramidSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getImagePyramidSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Image Pyramid Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Pyramid Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getImagePyramidType_ImagePyramidObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ImagePyramidObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getImagePyramidObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Image Pyramid Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Pyramid Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getImagePyramidType_ImagePyramidObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImagePyramidObjectExtensionGroup' namespace='##targetNamespace' group='ImagePyramidObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getImagePyramidObjectExtensionGroup();

} // ImagePyramidType
