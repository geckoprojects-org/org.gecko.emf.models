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
 * A representation of the model object '<em><b>Camera Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.CameraType#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link net.opengis.kml.CameraType#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link net.opengis.kml.CameraType#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link net.opengis.kml.CameraType#getHeading <em>Heading</em>}</li>
 *   <li>{@link net.opengis.kml.CameraType#getTilt <em>Tilt</em>}</li>
 *   <li>{@link net.opengis.kml.CameraType#getRoll <em>Roll</em>}</li>
 *   <li>{@link net.opengis.kml.CameraType#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.CameraType#getAltitudeModeGroup <em>Altitude Mode Group</em>}</li>
 *   <li>{@link net.opengis.kml.CameraType#getCameraSimpleExtensionGroupGroup <em>Camera Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.CameraType#getCameraSimpleExtensionGroup <em>Camera Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.CameraType#getCameraObjectExtensionGroupGroup <em>Camera Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.CameraType#getCameraObjectExtensionGroup <em>Camera Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getCameraType()
 * @model extendedMetaData="name='CameraType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CameraType extends AbstractViewType {
	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #isSetLongitude()
	 * @see #unsetLongitude()
	 * @see #setLongitude(double)
	 * @see net.opengis.kml.KMLPackage#getCameraType_Longitude()
	 * @model default="0.0" unsettable="true" dataType="net.opengis.kml.Angle180Type"
	 *        extendedMetaData="kind='element' name='longitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLongitude();

	/**
	 * Sets the value of the '{@link net.opengis.kml.CameraType#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #isSetLongitude()
	 * @see #unsetLongitude()
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.CameraType#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLongitude()
	 * @see #getLongitude()
	 * @see #setLongitude(double)
	 * @generated
	 */
	void unsetLongitude();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.CameraType#getLongitude <em>Longitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Longitude</em>' attribute is set.
	 * @see #unsetLongitude()
	 * @see #getLongitude()
	 * @see #setLongitude(double)
	 * @generated
	 */
	boolean isSetLongitude();

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #isSetLatitude()
	 * @see #unsetLatitude()
	 * @see #setLatitude(double)
	 * @see net.opengis.kml.KMLPackage#getCameraType_Latitude()
	 * @model default="0.0" unsettable="true" dataType="net.opengis.kml.Angle90Type"
	 *        extendedMetaData="kind='element' name='latitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLatitude();

	/**
	 * Sets the value of the '{@link net.opengis.kml.CameraType#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #isSetLatitude()
	 * @see #unsetLatitude()
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.CameraType#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLatitude()
	 * @see #getLatitude()
	 * @see #setLatitude(double)
	 * @generated
	 */
	void unsetLatitude();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.CameraType#getLatitude <em>Latitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Latitude</em>' attribute is set.
	 * @see #unsetLatitude()
	 * @see #getLatitude()
	 * @see #setLatitude(double)
	 * @generated
	 */
	boolean isSetLatitude();

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' attribute.
	 * @see #isSetAltitude()
	 * @see #unsetAltitude()
	 * @see #setAltitude(double)
	 * @see net.opengis.kml.KMLPackage#getCameraType_Altitude()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getAltitude();

	/**
	 * Sets the value of the '{@link net.opengis.kml.CameraType#getAltitude <em>Altitude</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.kml.CameraType#getAltitude <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAltitude()
	 * @see #getAltitude()
	 * @see #setAltitude(double)
	 * @generated
	 */
	void unsetAltitude();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.CameraType#getAltitude <em>Altitude</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Heading</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' attribute.
	 * @see #isSetHeading()
	 * @see #unsetHeading()
	 * @see #setHeading(double)
	 * @see net.opengis.kml.KMLPackage#getCameraType_Heading()
	 * @model default="0.0" unsettable="true" dataType="net.opengis.kml.Angle360Type"
	 *        extendedMetaData="kind='element' name='heading' namespace='##targetNamespace'"
	 * @generated
	 */
	double getHeading();

	/**
	 * Sets the value of the '{@link net.opengis.kml.CameraType#getHeading <em>Heading</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.kml.CameraType#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeading()
	 * @see #getHeading()
	 * @see #setHeading(double)
	 * @generated
	 */
	void unsetHeading();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.CameraType#getHeading <em>Heading</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Tilt</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tilt</em>' attribute.
	 * @see #isSetTilt()
	 * @see #unsetTilt()
	 * @see #setTilt(double)
	 * @see net.opengis.kml.KMLPackage#getCameraType_Tilt()
	 * @model default="0.0" unsettable="true" dataType="net.opengis.kml.Anglepos180Type"
	 *        extendedMetaData="kind='element' name='tilt' namespace='##targetNamespace'"
	 * @generated
	 */
	double getTilt();

	/**
	 * Sets the value of the '{@link net.opengis.kml.CameraType#getTilt <em>Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tilt</em>' attribute.
	 * @see #isSetTilt()
	 * @see #unsetTilt()
	 * @see #getTilt()
	 * @generated
	 */
	void setTilt(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.CameraType#getTilt <em>Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTilt()
	 * @see #getTilt()
	 * @see #setTilt(double)
	 * @generated
	 */
	void unsetTilt();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.CameraType#getTilt <em>Tilt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tilt</em>' attribute is set.
	 * @see #unsetTilt()
	 * @see #getTilt()
	 * @see #setTilt(double)
	 * @generated
	 */
	boolean isSetTilt();

	/**
	 * Returns the value of the '<em><b>Roll</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll</em>' attribute.
	 * @see #isSetRoll()
	 * @see #unsetRoll()
	 * @see #setRoll(double)
	 * @see net.opengis.kml.KMLPackage#getCameraType_Roll()
	 * @model default="0.0" unsettable="true" dataType="net.opengis.kml.Angle180Type"
	 *        extendedMetaData="kind='element' name='roll' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRoll();

	/**
	 * Sets the value of the '{@link net.opengis.kml.CameraType#getRoll <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll</em>' attribute.
	 * @see #isSetRoll()
	 * @see #unsetRoll()
	 * @see #getRoll()
	 * @generated
	 */
	void setRoll(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.CameraType#getRoll <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRoll()
	 * @see #getRoll()
	 * @see #setRoll(double)
	 * @generated
	 */
	void unsetRoll();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.CameraType#getRoll <em>Roll</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Roll</em>' attribute is set.
	 * @see #unsetRoll()
	 * @see #getRoll()
	 * @see #setRoll(double)
	 * @generated
	 */
	boolean isSetRoll();

	/**
	 * Returns the value of the '<em><b>Altitude Mode Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Mode Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getCameraType_AltitudeModeGroupGroup()
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
	 * @see net.opengis.kml.KMLPackage#getCameraType_AltitudeModeGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='altitudeModeGroup' namespace='##targetNamespace' group='altitudeModeGroup:group'"
	 * @generated
	 */
	EObject getAltitudeModeGroup();

	/**
	 * Returns the value of the '<em><b>Camera Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Camera Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getCameraType_CameraSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='CameraSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getCameraSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Camera Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Camera Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getCameraType_CameraSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CameraSimpleExtensionGroup' namespace='##targetNamespace' group='CameraSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getCameraSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Camera Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Camera Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getCameraType_CameraObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='CameraObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getCameraObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Camera Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Camera Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getCameraType_CameraObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CameraObjectExtensionGroup' namespace='##targetNamespace' group='CameraObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getCameraObjectExtensionGroup();

} // CameraType
