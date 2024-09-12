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
 * A representation of the model object '<em><b>Ground Overlay Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.GroundOverlayType#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link net.opengis.kml.GroundOverlayType#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.GroundOverlayType#getAltitudeModeGroup <em>Altitude Mode Group</em>}</li>
 *   <li>{@link net.opengis.kml.GroundOverlayType#getLatLonBox <em>Lat Lon Box</em>}</li>
 *   <li>{@link net.opengis.kml.GroundOverlayType#getGroundOverlaySimpleExtensionGroupGroup <em>Ground Overlay Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.GroundOverlayType#getGroundOverlaySimpleExtensionGroup <em>Ground Overlay Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.GroundOverlayType#getGroundOverlayObjectExtensionGroupGroup <em>Ground Overlay Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.GroundOverlayType#getGroundOverlayObjectExtensionGroup <em>Ground Overlay Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getGroundOverlayType()
 * @model extendedMetaData="name='GroundOverlayType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GroundOverlayType extends AbstractOverlayType {
	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' attribute.
	 * @see #isSetAltitude()
	 * @see #unsetAltitude()
	 * @see #setAltitude(double)
	 * @see net.opengis.kml.KMLPackage#getGroundOverlayType_Altitude()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getAltitude();

	/**
	 * Sets the value of the '{@link net.opengis.kml.GroundOverlayType#getAltitude <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' attribute.
	 * @see #isSetAltitude()
	 * @see #unsetAltitude()
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.GroundOverlayType#getAltitude <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAltitude()
	 * @see #getAltitude()
	 * @see #setAltitude(double)
	 * @generated
	 */
	void unsetAltitude();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.GroundOverlayType#getAltitude <em>Altitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Altitude</em>' attribute is set.
	 * @see #unsetAltitude()
	 * @see #getAltitude()
	 * @see #setAltitude(double)
	 * @generated
	 */
	boolean isSetAltitude();

	/**
	 * Returns the value of the '<em><b>Altitude Mode Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Mode Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getGroundOverlayType_AltitudeModeGroupGroup()
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
	 * @see net.opengis.kml.KMLPackage#getGroundOverlayType_AltitudeModeGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='altitudeModeGroup' namespace='##targetNamespace' group='altitudeModeGroup:group'"
	 * @generated
	 */
	EObject getAltitudeModeGroup();

	/**
	 * Returns the value of the '<em><b>Lat Lon Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Box</em>' containment reference.
	 * @see #setLatLonBox(LatLonBoxType)
	 * @see net.opengis.kml.KMLPackage#getGroundOverlayType_LatLonBox()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LatLonBox' namespace='##targetNamespace'"
	 * @generated
	 */
	LatLonBoxType getLatLonBox();

	/**
	 * Sets the value of the '{@link net.opengis.kml.GroundOverlayType#getLatLonBox <em>Lat Lon Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat Lon Box</em>' containment reference.
	 * @see #getLatLonBox()
	 * @generated
	 */
	void setLatLonBox(LatLonBoxType value);

	/**
	 * Returns the value of the '<em><b>Ground Overlay Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Overlay Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getGroundOverlayType_GroundOverlaySimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='GroundOverlaySimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGroundOverlaySimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Ground Overlay Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Overlay Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getGroundOverlayType_GroundOverlaySimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GroundOverlaySimpleExtensionGroup' namespace='##targetNamespace' group='GroundOverlaySimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getGroundOverlaySimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Ground Overlay Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Overlay Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getGroundOverlayType_GroundOverlayObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='GroundOverlayObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGroundOverlayObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Ground Overlay Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Overlay Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getGroundOverlayType_GroundOverlayObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GroundOverlayObjectExtensionGroup' namespace='##targetNamespace' group='GroundOverlayObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getGroundOverlayObjectExtensionGroup();

} // GroundOverlayType
