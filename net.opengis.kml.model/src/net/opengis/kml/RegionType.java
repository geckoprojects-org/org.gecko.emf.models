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
 * A representation of the model object '<em><b>Region Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.RegionType#getLatLonAltBox <em>Lat Lon Alt Box</em>}</li>
 *   <li>{@link net.opengis.kml.RegionType#getLod <em>Lod</em>}</li>
 *   <li>{@link net.opengis.kml.RegionType#getRegionSimpleExtensionGroupGroup <em>Region Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.RegionType#getRegionSimpleExtensionGroup <em>Region Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.RegionType#getRegionObjectExtensionGroupGroup <em>Region Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.RegionType#getRegionObjectExtensionGroup <em>Region Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getRegionType()
 * @model extendedMetaData="name='RegionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RegionType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Lat Lon Alt Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Alt Box</em>' containment reference.
	 * @see #setLatLonAltBox(LatLonAltBoxType)
	 * @see net.opengis.kml.KMLPackage#getRegionType_LatLonAltBox()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LatLonAltBox' namespace='##targetNamespace'"
	 * @generated
	 */
	LatLonAltBoxType getLatLonAltBox();

	/**
	 * Sets the value of the '{@link net.opengis.kml.RegionType#getLatLonAltBox <em>Lat Lon Alt Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat Lon Alt Box</em>' containment reference.
	 * @see #getLatLonAltBox()
	 * @generated
	 */
	void setLatLonAltBox(LatLonAltBoxType value);

	/**
	 * Returns the value of the '<em><b>Lod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod</em>' containment reference.
	 * @see #setLod(LodType)
	 * @see net.opengis.kml.KMLPackage#getRegionType_Lod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Lod' namespace='##targetNamespace'"
	 * @generated
	 */
	LodType getLod();

	/**
	 * Sets the value of the '{@link net.opengis.kml.RegionType#getLod <em>Lod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod</em>' containment reference.
	 * @see #getLod()
	 * @generated
	 */
	void setLod(LodType value);

	/**
	 * Returns the value of the '<em><b>Region Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getRegionType_RegionSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='RegionSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getRegionSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Region Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getRegionType_RegionSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegionSimpleExtensionGroup' namespace='##targetNamespace' group='RegionSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getRegionSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Region Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getRegionType_RegionObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='RegionObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getRegionObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Region Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getRegionType_RegionObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RegionObjectExtensionGroup' namespace='##targetNamespace' group='RegionObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getRegionObjectExtensionGroup();

} // RegionType
