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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Logic Op Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.BinaryLogicOpType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.ogc.BinaryLogicOpType#getComparisonOpsGroup <em>Comparison Ops Group</em>}</li>
 *   <li>{@link net.opengis.ogc.BinaryLogicOpType#getComparisonOps <em>Comparison Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.BinaryLogicOpType#getSpatialOpsGroup <em>Spatial Ops Group</em>}</li>
 *   <li>{@link net.opengis.ogc.BinaryLogicOpType#getSpatialOps <em>Spatial Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.BinaryLogicOpType#getLogicOpsGroup <em>Logic Ops Group</em>}</li>
 *   <li>{@link net.opengis.ogc.BinaryLogicOpType#getLogicOps <em>Logic Ops</em>}</li>
 *   <li>{@link net.opengis.ogc.BinaryLogicOpType#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.OGCPackage#getBinaryLogicOpType()
 * @model extendedMetaData="name='BinaryLogicOpType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BinaryLogicOpType extends LogicOpsType {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.ogc.OGCPackage#getBinaryLogicOpType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Comparison Ops Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Ops Group</em>' attribute list.
	 * @see net.opengis.ogc.OGCPackage#getBinaryLogicOpType_ComparisonOpsGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='comparisonOps:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getComparisonOpsGroup();

	/**
	 * Returns the value of the '<em><b>Comparison Ops</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ogc.ComparisonOpsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Ops</em>' containment reference list.
	 * @see net.opengis.ogc.OGCPackage#getBinaryLogicOpType_ComparisonOps()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='comparisonOps' namespace='##targetNamespace' group='comparisonOps:group'"
	 * @generated
	 */
	EList<ComparisonOpsType> getComparisonOps();

	/**
	 * Returns the value of the '<em><b>Spatial Ops Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Ops Group</em>' attribute list.
	 * @see net.opengis.ogc.OGCPackage#getBinaryLogicOpType_SpatialOpsGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='spatialOps:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getSpatialOpsGroup();

	/**
	 * Returns the value of the '<em><b>Spatial Ops</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ogc.SpatialOpsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Ops</em>' containment reference list.
	 * @see net.opengis.ogc.OGCPackage#getBinaryLogicOpType_SpatialOps()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='spatialOps' namespace='##targetNamespace' group='spatialOps:group'"
	 * @generated
	 */
	EList<SpatialOpsType> getSpatialOps();

	/**
	 * Returns the value of the '<em><b>Logic Ops Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic Ops Group</em>' attribute list.
	 * @see net.opengis.ogc.OGCPackage#getBinaryLogicOpType_LogicOpsGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='logicOps:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getLogicOpsGroup();

	/**
	 * Returns the value of the '<em><b>Logic Ops</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ogc.LogicOpsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic Ops</em>' containment reference list.
	 * @see net.opengis.ogc.OGCPackage#getBinaryLogicOpType_LogicOps()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='logicOps' namespace='##targetNamespace' group='logicOps:group'"
	 * @generated
	 */
	EList<LogicOpsType> getLogicOps();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ogc.FunctionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference list.
	 * @see net.opengis.ogc.OGCPackage#getBinaryLogicOpType_Function()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Function' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FunctionType> getFunction();

} // BinaryLogicOpType
