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
package net.opengis.ogc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.FilterType#getSpatialOpsGroup <em>Spatial Ops Group</em>}</li>
 *   <li>{@link net.opengis.ogc.FilterType#getSpatialOps <em>Spatial Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.FilterType#getComparisonOpsGroup <em>Comparison Ops Group</em>}</li>
 *   <li>{@link net.opengis.ogc.FilterType#getComparisonOps <em>Comparison Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.FilterType#getLogicOpsGroup <em>Logic Ops Group</em>}</li>
 *   <li>{@link net.opengis.ogc.FilterType#getLogicOps <em>Logic Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.FilterType#getIdGroup <em>Id Group</em>}</li>
 *   <li>{@link net.opengis.ogc.FilterType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.OGCPackage#getFilterType()
 * @model extendedMetaData="name='FilterType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FilterType extends EObject {
	/**
	 * Returns the value of the '<em><b>Spatial Ops Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Ops Group</em>' attribute list.
	 * @see net.opengis.ogc.OGCPackage#getFilterType_SpatialOpsGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='spatialOps:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getSpatialOpsGroup();

	/**
	 * Returns the value of the '<em><b>Spatial Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Ops</em>' containment reference.
	 * @see net.opengis.ogc.OGCPackage#getFilterType_SpatialOps()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='spatialOps' namespace='##targetNamespace' group='spatialOps:group'"
	 * @generated
	 */
	SpatialOpsType getSpatialOps();

	/**
	 * Returns the value of the '<em><b>Comparison Ops Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Ops Group</em>' attribute list.
	 * @see net.opengis.ogc.OGCPackage#getFilterType_ComparisonOpsGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='comparisonOps:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getComparisonOpsGroup();

	/**
	 * Returns the value of the '<em><b>Comparison Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Ops</em>' containment reference.
	 * @see net.opengis.ogc.OGCPackage#getFilterType_ComparisonOps()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='comparisonOps' namespace='##targetNamespace' group='comparisonOps:group'"
	 * @generated
	 */
	ComparisonOpsType getComparisonOps();

	/**
	 * Returns the value of the '<em><b>Logic Ops Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic Ops Group</em>' attribute list.
	 * @see net.opengis.ogc.OGCPackage#getFilterType_LogicOpsGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='logicOps:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLogicOpsGroup();

	/**
	 * Returns the value of the '<em><b>Logic Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic Ops</em>' containment reference.
	 * @see net.opengis.ogc.OGCPackage#getFilterType_LogicOps()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='logicOps' namespace='##targetNamespace' group='logicOps:group'"
	 * @generated
	 */
	LogicOpsType getLogicOps();

	/**
	 * Returns the value of the '<em><b>Id Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Group</em>' attribute list.
	 * @see net.opengis.ogc.OGCPackage#getFilterType_IdGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_Id:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIdGroup();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ogc.AbstractIdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference list.
	 * @see net.opengis.ogc.OGCPackage#getFilterType_Id()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_Id' namespace='##targetNamespace' group='_Id:group'"
	 * @generated
	 */
	EList<AbstractIdType> getId();

} // FilterType
