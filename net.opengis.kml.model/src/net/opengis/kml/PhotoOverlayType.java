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
 * A representation of the model object '<em><b>Photo Overlay Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.PhotoOverlayType#getRotation <em>Rotation</em>}</li>
 *   <li>{@link net.opengis.kml.PhotoOverlayType#getViewVolume <em>View Volume</em>}</li>
 *   <li>{@link net.opengis.kml.PhotoOverlayType#getImagePyramid <em>Image Pyramid</em>}</li>
 *   <li>{@link net.opengis.kml.PhotoOverlayType#getPoint <em>Point</em>}</li>
 *   <li>{@link net.opengis.kml.PhotoOverlayType#getShape <em>Shape</em>}</li>
 *   <li>{@link net.opengis.kml.PhotoOverlayType#getPhotoOverlaySimpleExtensionGroupGroup <em>Photo Overlay Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.PhotoOverlayType#getPhotoOverlaySimpleExtensionGroup <em>Photo Overlay Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.PhotoOverlayType#getPhotoOverlayObjectExtensionGroupGroup <em>Photo Overlay Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.PhotoOverlayType#getPhotoOverlayObjectExtensionGroup <em>Photo Overlay Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getPhotoOverlayType()
 * @model extendedMetaData="name='PhotoOverlayType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PhotoOverlayType extends AbstractOverlayType {
	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #isSetRotation()
	 * @see #unsetRotation()
	 * @see #setRotation(double)
	 * @see net.opengis.kml.KMLPackage#getPhotoOverlayType_Rotation()
	 * @model default="0.0" unsettable="true" dataType="net.opengis.kml.Angle180Type"
	 *        extendedMetaData="kind='element' name='rotation' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRotation();

	/**
	 * Sets the value of the '{@link net.opengis.kml.PhotoOverlayType#getRotation <em>Rotation</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.kml.PhotoOverlayType#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotation()
	 * @see #getRotation()
	 * @see #setRotation(double)
	 * @generated
	 */
	void unsetRotation();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.PhotoOverlayType#getRotation <em>Rotation</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>View Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Volume</em>' containment reference.
	 * @see #setViewVolume(ViewVolumeType)
	 * @see net.opengis.kml.KMLPackage#getPhotoOverlayType_ViewVolume()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ViewVolume' namespace='##targetNamespace'"
	 * @generated
	 */
	ViewVolumeType getViewVolume();

	/**
	 * Sets the value of the '{@link net.opengis.kml.PhotoOverlayType#getViewVolume <em>View Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Volume</em>' containment reference.
	 * @see #getViewVolume()
	 * @generated
	 */
	void setViewVolume(ViewVolumeType value);

	/**
	 * Returns the value of the '<em><b>Image Pyramid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Pyramid</em>' containment reference.
	 * @see #setImagePyramid(ImagePyramidType)
	 * @see net.opengis.kml.KMLPackage#getPhotoOverlayType_ImagePyramid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImagePyramid' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagePyramidType getImagePyramid();

	/**
	 * Sets the value of the '{@link net.opengis.kml.PhotoOverlayType#getImagePyramid <em>Image Pyramid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Pyramid</em>' containment reference.
	 * @see #getImagePyramid()
	 * @generated
	 */
	void setImagePyramid(ImagePyramidType value);

	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' containment reference.
	 * @see #setPoint(PointType)
	 * @see net.opengis.kml.KMLPackage#getPhotoOverlayType_Point()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Point' namespace='##targetNamespace'"
	 * @generated
	 */
	PointType getPoint();

	/**
	 * Sets the value of the '{@link net.opengis.kml.PhotoOverlayType#getPoint <em>Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point</em>' containment reference.
	 * @see #getPoint()
	 * @generated
	 */
	void setPoint(PointType value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * The default value is <code>"rectangle"</code>.
	 * The literals are from the enumeration {@link net.opengis.kml.ShapeEnumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see net.opengis.kml.ShapeEnumType
	 * @see #isSetShape()
	 * @see #unsetShape()
	 * @see #setShape(ShapeEnumType)
	 * @see net.opengis.kml.KMLPackage#getPhotoOverlayType_Shape()
	 * @model default="rectangle" unsettable="true"
	 *        extendedMetaData="kind='element' name='shape' namespace='##targetNamespace'"
	 * @generated
	 */
	ShapeEnumType getShape();

	/**
	 * Sets the value of the '{@link net.opengis.kml.PhotoOverlayType#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see net.opengis.kml.ShapeEnumType
	 * @see #isSetShape()
	 * @see #unsetShape()
	 * @see #getShape()
	 * @generated
	 */
	void setShape(ShapeEnumType value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.PhotoOverlayType#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShape()
	 * @see #getShape()
	 * @see #setShape(ShapeEnumType)
	 * @generated
	 */
	void unsetShape();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.PhotoOverlayType#getShape <em>Shape</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shape</em>' attribute is set.
	 * @see #unsetShape()
	 * @see #getShape()
	 * @see #setShape(ShapeEnumType)
	 * @generated
	 */
	boolean isSetShape();

	/**
	 * Returns the value of the '<em><b>Photo Overlay Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo Overlay Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getPhotoOverlayType_PhotoOverlaySimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PhotoOverlaySimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPhotoOverlaySimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Photo Overlay Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo Overlay Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getPhotoOverlayType_PhotoOverlaySimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PhotoOverlaySimpleExtensionGroup' namespace='##targetNamespace' group='PhotoOverlaySimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getPhotoOverlaySimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Photo Overlay Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo Overlay Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getPhotoOverlayType_PhotoOverlayObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PhotoOverlayObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPhotoOverlayObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Photo Overlay Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo Overlay Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getPhotoOverlayType_PhotoOverlayObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PhotoOverlayObjectExtensionGroup' namespace='##targetNamespace' group='PhotoOverlayObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getPhotoOverlayObjectExtensionGroup();

} // PhotoOverlayType
