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

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.PointType#isExtrude <em>Extrude</em>}</li>
 *   <li>{@link net.opengis.kml.PointType#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.PointType#getAltitudeModeGroup <em>Altitude Mode Group</em>}</li>
 *   <li>{@link net.opengis.kml.PointType#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.opengis.kml.PointType#getPointSimpleExtensionGroupGroup <em>Point Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.PointType#getPointSimpleExtensionGroup <em>Point Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.PointType#getPointObjectExtensionGroupGroup <em>Point Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.PointType#getPointObjectExtensionGroup <em>Point Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getPointType()
 * @model extendedMetaData="name='PointType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PointType extends AbstractGeometryType {
	/**
	 * Returns the value of the '<em><b>Extrude</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrude</em>' attribute.
	 * @see #isSetExtrude()
	 * @see #unsetExtrude()
	 * @see #setExtrude(boolean)
	 * @see net.opengis.kml.KMLPackage#getPointType_Extrude()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='extrude' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isExtrude();

	/**
	 * Sets the value of the '{@link net.opengis.kml.PointType#isExtrude <em>Extrude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrude</em>' attribute.
	 * @see #isSetExtrude()
	 * @see #unsetExtrude()
	 * @see #isExtrude()
	 * @generated
	 */
	void setExtrude(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.PointType#isExtrude <em>Extrude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrude()
	 * @see #isExtrude()
	 * @see #setExtrude(boolean)
	 * @generated
	 */
	void unsetExtrude();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.PointType#isExtrude <em>Extrude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrude</em>' attribute is set.
	 * @see #unsetExtrude()
	 * @see #isExtrude()
	 * @see #setExtrude(boolean)
	 * @generated
	 */
	boolean isSetExtrude();

	/**
	 * Returns the value of the '<em><b>Altitude Mode Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Mode Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getPointType_AltitudeModeGroupGroup()
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
	 * @see net.opengis.kml.KMLPackage#getPointType_AltitudeModeGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='altitudeModeGroup' namespace='##targetNamespace' group='altitudeModeGroup:group'"
	 * @generated
	 */
	EObject getAltitudeModeGroup();

	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' attribute.
	 * @see #setCoordinates(List)
	 * @see net.opengis.kml.KMLPackage#getPointType_Coordinates()
	 * @model dataType="net.opengis.kml.CoordinatesType" many="false"
	 *        extendedMetaData="kind='element' name='coordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getCoordinates();

	/**
	 * Sets the value of the '{@link net.opengis.kml.PointType#getCoordinates <em>Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' attribute.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(List<String> value);

	/**
	 * Returns the value of the '<em><b>Point Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getPointType_PointSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PointSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPointSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Point Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getPointType_PointSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PointSimpleExtensionGroup' namespace='##targetNamespace' group='PointSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getPointSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Point Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getPointType_PointObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PointObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPointObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Point Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getPointType_PointObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PointObjectExtensionGroup' namespace='##targetNamespace' group='PointObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getPointObjectExtensionGroup();

} // PointType
