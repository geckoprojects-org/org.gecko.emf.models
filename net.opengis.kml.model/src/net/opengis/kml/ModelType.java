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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.ModelType#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.ModelType#getAltitudeModeGroup <em>Altitude Mode Group</em>}</li>
 *   <li>{@link net.opengis.kml.ModelType#getLocation <em>Location</em>}</li>
 *   <li>{@link net.opengis.kml.ModelType#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link net.opengis.kml.ModelType#getScale <em>Scale</em>}</li>
 *   <li>{@link net.opengis.kml.ModelType#getLink <em>Link</em>}</li>
 *   <li>{@link net.opengis.kml.ModelType#getResourceMap <em>Resource Map</em>}</li>
 *   <li>{@link net.opengis.kml.ModelType#getModelSimpleExtensionGroupGroup <em>Model Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.ModelType#getModelSimpleExtensionGroup <em>Model Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.ModelType#getModelObjectExtensionGroupGroup <em>Model Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.ModelType#getModelObjectExtensionGroup <em>Model Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getModelType()
 * @model extendedMetaData="name='ModelType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ModelType extends AbstractGeometryType {
	/**
	 * Returns the value of the '<em><b>Altitude Mode Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Mode Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getModelType_AltitudeModeGroupGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='altitudeModeGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAltitudeModeGroupGroup();

	/**
	 * Returns the value of the '<em><b>Altitude Mode Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Mode Group</em>' containment reference.
	 * @see net.opengis.kml.KMLPackage#getModelType_AltitudeModeGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='altitudeModeGroup' namespace='##targetNamespace' group='altitudeModeGroup:group'"
	 * @generated
	 */
	EObject getAltitudeModeGroup();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(LocationType)
	 * @see net.opengis.kml.KMLPackage#getModelType_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Location' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationType getLocation();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ModelType#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationType value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(OrientationType)
	 * @see net.opengis.kml.KMLPackage#getModelType_Orientation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	OrientationType getOrientation();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ModelType#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationType value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' containment reference.
	 * @see #setScale(ScaleType)
	 * @see net.opengis.kml.KMLPackage#getModelType_Scale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Scale' namespace='##targetNamespace'"
	 * @generated
	 */
	ScaleType getScale();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ModelType#getScale <em>Scale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' containment reference.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(ScaleType value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(LinkType)
	 * @see net.opengis.kml.KMLPackage#getModelType_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Link' namespace='##targetNamespace'"
	 * @generated
	 */
	LinkType getLink();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ModelType#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(LinkType value);

	/**
	 * Returns the value of the '<em><b>Resource Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Map</em>' containment reference.
	 * @see #setResourceMap(ResourceMapType)
	 * @see net.opengis.kml.KMLPackage#getModelType_ResourceMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ResourceMap' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceMapType getResourceMap();

	/**
	 * Sets the value of the '{@link net.opengis.kml.ModelType#getResourceMap <em>Resource Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Map</em>' containment reference.
	 * @see #getResourceMap()
	 * @generated
	 */
	void setResourceMap(ResourceMapType value);

	/**
	 * Returns the value of the '<em><b>Model Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getModelType_ModelSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ModelSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getModelSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Model Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getModelType_ModelSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModelSimpleExtensionGroup' namespace='##targetNamespace' group='ModelSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getModelSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Model Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getModelType_ModelObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='ModelObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getModelObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Model Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getModelType_ModelObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModelObjectExtensionGroup' namespace='##targetNamespace' group='ModelObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getModelObjectExtensionGroup();

} // ModelType
