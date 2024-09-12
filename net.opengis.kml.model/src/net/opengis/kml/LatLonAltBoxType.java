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
 * A representation of the model object '<em><b>Lat Lon Alt Box Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.LatLonAltBoxType#getMinAltitude <em>Min Altitude</em>}</li>
 *   <li>{@link net.opengis.kml.LatLonAltBoxType#getMaxAltitude <em>Max Altitude</em>}</li>
 *   <li>{@link net.opengis.kml.LatLonAltBoxType#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.LatLonAltBoxType#getAltitudeModeGroup <em>Altitude Mode Group</em>}</li>
 *   <li>{@link net.opengis.kml.LatLonAltBoxType#getLatLonAltBoxSimpleExtensionGroupGroup <em>Lat Lon Alt Box Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.LatLonAltBoxType#getLatLonAltBoxSimpleExtensionGroup <em>Lat Lon Alt Box Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.LatLonAltBoxType#getLatLonAltBoxObjectExtensionGroupGroup <em>Lat Lon Alt Box Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.LatLonAltBoxType#getLatLonAltBoxObjectExtensionGroup <em>Lat Lon Alt Box Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getLatLonAltBoxType()
 * @model extendedMetaData="name='LatLonAltBoxType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LatLonAltBoxType extends AbstractLatLonBoxType {
	/**
	 * Returns the value of the '<em><b>Min Altitude</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Altitude</em>' attribute.
	 * @see #isSetMinAltitude()
	 * @see #unsetMinAltitude()
	 * @see #setMinAltitude(double)
	 * @see net.opengis.kml.KMLPackage#getLatLonAltBoxType_MinAltitude()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='minAltitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinAltitude();

	/**
	 * Sets the value of the '{@link net.opengis.kml.LatLonAltBoxType#getMinAltitude <em>Min Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Altitude</em>' attribute.
	 * @see #isSetMinAltitude()
	 * @see #unsetMinAltitude()
	 * @see #getMinAltitude()
	 * @generated
	 */
	void setMinAltitude(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.LatLonAltBoxType#getMinAltitude <em>Min Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinAltitude()
	 * @see #getMinAltitude()
	 * @see #setMinAltitude(double)
	 * @generated
	 */
	void unsetMinAltitude();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.LatLonAltBoxType#getMinAltitude <em>Min Altitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Altitude</em>' attribute is set.
	 * @see #unsetMinAltitude()
	 * @see #getMinAltitude()
	 * @see #setMinAltitude(double)
	 * @generated
	 */
	boolean isSetMinAltitude();

	/**
	 * Returns the value of the '<em><b>Max Altitude</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Altitude</em>' attribute.
	 * @see #isSetMaxAltitude()
	 * @see #unsetMaxAltitude()
	 * @see #setMaxAltitude(double)
	 * @see net.opengis.kml.KMLPackage#getLatLonAltBoxType_MaxAltitude()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='maxAltitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaxAltitude();

	/**
	 * Sets the value of the '{@link net.opengis.kml.LatLonAltBoxType#getMaxAltitude <em>Max Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Altitude</em>' attribute.
	 * @see #isSetMaxAltitude()
	 * @see #unsetMaxAltitude()
	 * @see #getMaxAltitude()
	 * @generated
	 */
	void setMaxAltitude(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.LatLonAltBoxType#getMaxAltitude <em>Max Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxAltitude()
	 * @see #getMaxAltitude()
	 * @see #setMaxAltitude(double)
	 * @generated
	 */
	void unsetMaxAltitude();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.LatLonAltBoxType#getMaxAltitude <em>Max Altitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Altitude</em>' attribute is set.
	 * @see #unsetMaxAltitude()
	 * @see #getMaxAltitude()
	 * @see #setMaxAltitude(double)
	 * @generated
	 */
	boolean isSetMaxAltitude();

	/**
	 * Returns the value of the '<em><b>Altitude Mode Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Mode Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLatLonAltBoxType_AltitudeModeGroupGroup()
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
	 * @see net.opengis.kml.KMLPackage#getLatLonAltBoxType_AltitudeModeGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='altitudeModeGroup' namespace='##targetNamespace' group='altitudeModeGroup:group'"
	 * @generated
	 */
	EObject getAltitudeModeGroup();

	/**
	 * Returns the value of the '<em><b>Lat Lon Alt Box Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Alt Box Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLatLonAltBoxType_LatLonAltBoxSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LatLonAltBoxSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLatLonAltBoxSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Lat Lon Alt Box Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Alt Box Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLatLonAltBoxType_LatLonAltBoxSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LatLonAltBoxSimpleExtensionGroup' namespace='##targetNamespace' group='LatLonAltBoxSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getLatLonAltBoxSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Lat Lon Alt Box Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Alt Box Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLatLonAltBoxType_LatLonAltBoxObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LatLonAltBoxObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLatLonAltBoxObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Lat Lon Alt Box Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Alt Box Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getLatLonAltBoxType_LatLonAltBoxObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LatLonAltBoxObjectExtensionGroup' namespace='##targetNamespace' group='LatLonAltBoxObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getLatLonAltBoxObjectExtensionGroup();

} // LatLonAltBoxType
