/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package net.opengis.ogc.features;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.features.Extent#getSpatialExtentGroup <em>Spatial Extent Group</em>}</li>
 *   <li>{@link net.opengis.ogc.features.Extent#getSpatialExtent <em>Spatial Extent</em>}</li>
 *   <li>{@link net.opengis.ogc.features.Extent#getTemporalExtentGroup <em>Temporal Extent Group</em>}</li>
 *   <li>{@link net.opengis.ogc.features.Extent#getTemporalExtent <em>Temporal Extent</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.features.OGCFeaturesPackage#getExtent()
 * @model extendedMetaData="name='ExtentType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Extent extends EObject {
	/**
	 * Returns the value of the '<em><b>Spatial Extent Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Extent Group</em>' attribute list.
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getExtent_SpatialExtentGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='SpatialExtent:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSpatialExtentGroup();

	/**
	 * Returns the value of the '<em><b>Spatial Extent</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ogc.features.SpatialExtent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Extent</em>' containment reference list.
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getExtent_SpatialExtent()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SpatialExtent' namespace='##targetNamespace' group='SpatialExtent:group'"
	 * @generated
	 */
	EList<SpatialExtent> getSpatialExtent();

	/**
	 * Returns the value of the '<em><b>Temporal Extent Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Extent Group</em>' attribute list.
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getExtent_TemporalExtentGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='TemporalExtent:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTemporalExtentGroup();

	/**
	 * Returns the value of the '<em><b>Temporal Extent</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ogc.features.TemporalExtent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Extent</em>' containment reference list.
	 * @see net.opengis.ogc.features.OGCFeaturesPackage#getExtent_TemporalExtent()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TemporalExtent' namespace='##targetNamespace' group='TemporalExtent:group'"
	 * @generated
	 */
	EList<TemporalExtent> getTemporalExtent();

} // Extent
