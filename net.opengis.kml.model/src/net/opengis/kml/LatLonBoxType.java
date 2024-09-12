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
 * A representation of the model object '<em><b>Lat Lon Box Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.LatLonBoxType#getRotation <em>Rotation</em>}</li>
 *   <li>{@link net.opengis.kml.LatLonBoxType#getLatLonBoxSimpleExtensionGroupGroup <em>Lat Lon Box Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.LatLonBoxType#getLatLonBoxSimpleExtensionGroup <em>Lat Lon Box Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.LatLonBoxType#getLatLonBoxObjectExtensionGroupGroup <em>Lat Lon Box Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.LatLonBoxType#getLatLonBoxObjectExtensionGroup <em>Lat Lon Box Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getLatLonBoxType()
 * @model extendedMetaData="name='LatLonBoxType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LatLonBoxType extends AbstractLatLonBoxType {
	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #isSetRotation()
	 * @see #unsetRotation()
	 * @see #setRotation(double)
	 * @see net.opengis.kml.KMLPackage#getLatLonBoxType_Rotation()
	 * @model default="0.0" unsettable="true" dataType="net.opengis.kml.Angle180Type"
	 *        extendedMetaData="kind='element' name='rotation' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRotation();

	/**
	 * Sets the value of the '{@link net.opengis.kml.LatLonBoxType#getRotation <em>Rotation</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.kml.LatLonBoxType#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotation()
	 * @see #getRotation()
	 * @see #setRotation(double)
	 * @generated
	 */
	void unsetRotation();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.LatLonBoxType#getRotation <em>Rotation</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Lat Lon Box Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Box Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLatLonBoxType_LatLonBoxSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LatLonBoxSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLatLonBoxSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Lat Lon Box Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Box Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLatLonBoxType_LatLonBoxSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LatLonBoxSimpleExtensionGroup' namespace='##targetNamespace' group='LatLonBoxSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getLatLonBoxSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Lat Lon Box Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Box Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLatLonBoxType_LatLonBoxObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LatLonBoxObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLatLonBoxObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Lat Lon Box Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Box Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getLatLonBoxType_LatLonBoxObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LatLonBoxObjectExtensionGroup' namespace='##targetNamespace' group='LatLonBoxObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getLatLonBoxObjectExtensionGroup();

} // LatLonBoxType
