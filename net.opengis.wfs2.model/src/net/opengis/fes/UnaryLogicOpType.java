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
package net.opengis.fes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Logic Op Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.fes.UnaryLogicOpType#getComparisonOpsGroup <em>Comparison Ops Group</em>}</li>
 *   <li>{@link net.opengis.fes.UnaryLogicOpType#getComparisonOps <em>Comparison Ops</em>}</li>
 *   <li>{@link net.opengis.fes.UnaryLogicOpType#getSpatialOpsGroup <em>Spatial Ops Group</em>}</li>
 *   <li>{@link net.opengis.fes.UnaryLogicOpType#getSpatialOps <em>Spatial Ops</em>}</li>
 *   <li>{@link net.opengis.fes.UnaryLogicOpType#getTemporalOpsGroup <em>Temporal Ops Group</em>}</li>
 *   <li>{@link net.opengis.fes.UnaryLogicOpType#getTemporalOps <em>Temporal Ops</em>}</li>
 *   <li>{@link net.opengis.fes.UnaryLogicOpType#getLogicOpsGroup <em>Logic Ops Group</em>}</li>
 *   <li>{@link net.opengis.fes.UnaryLogicOpType#getLogicOps <em>Logic Ops</em>}</li>
 *   <li>{@link net.opengis.fes.UnaryLogicOpType#getExtensionOpsGroup <em>Extension Ops Group</em>}</li>
 *   <li>{@link net.opengis.fes.UnaryLogicOpType#getExtensionOps <em>Extension Ops</em>}</li>
 *   <li>{@link net.opengis.fes.UnaryLogicOpType#getFunction <em>Function</em>}</li>
 *   <li>{@link net.opengis.fes.UnaryLogicOpType#getIdGroup <em>Id Group</em>}</li>
 *   <li>{@link net.opengis.fes.UnaryLogicOpType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see net.opengis.fes.FESPackage#getUnaryLogicOpType()
 * @model extendedMetaData="name='UnaryLogicOpType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UnaryLogicOpType extends LogicOpsType {
	/**
	 * Returns the value of the '<em><b>Comparison Ops Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Ops Group</em>' attribute list.
	 * @see net.opengis.fes.FESPackage#getUnaryLogicOpType_ComparisonOpsGroup()
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
	 * @see net.opengis.fes.FESPackage#getUnaryLogicOpType_ComparisonOps()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='comparisonOps' namespace='##targetNamespace' group='comparisonOps:group'"
	 * @generated
	 */
	ComparisonOpsType getComparisonOps();

	/**
	 * Returns the value of the '<em><b>Spatial Ops Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Ops Group</em>' attribute list.
	 * @see net.opengis.fes.FESPackage#getUnaryLogicOpType_SpatialOpsGroup()
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
	 * @see net.opengis.fes.FESPackage#getUnaryLogicOpType_SpatialOps()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='spatialOps' namespace='##targetNamespace' group='spatialOps:group'"
	 * @generated
	 */
	SpatialOpsType getSpatialOps();

	/**
	 * Returns the value of the '<em><b>Temporal Ops Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Ops Group</em>' attribute list.
	 * @see net.opengis.fes.FESPackage#getUnaryLogicOpType_TemporalOpsGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='temporalOps:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTemporalOpsGroup();

	/**
	 * Returns the value of the '<em><b>Temporal Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Ops</em>' containment reference.
	 * @see net.opengis.fes.FESPackage#getUnaryLogicOpType_TemporalOps()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='temporalOps' namespace='##targetNamespace' group='temporalOps:group'"
	 * @generated
	 */
	TemporalOpsType getTemporalOps();

	/**
	 * Returns the value of the '<em><b>Logic Ops Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic Ops Group</em>' attribute list.
	 * @see net.opengis.fes.FESPackage#getUnaryLogicOpType_LogicOpsGroup()
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
	 * @see net.opengis.fes.FESPackage#getUnaryLogicOpType_LogicOps()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='logicOps' namespace='##targetNamespace' group='logicOps:group'"
	 * @generated
	 */
	LogicOpsType getLogicOps();

	/**
	 * Returns the value of the '<em><b>Extension Ops Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Ops Group</em>' attribute list.
	 * @see net.opengis.fes.FESPackage#getUnaryLogicOpType_ExtensionOpsGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='extensionOps:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getExtensionOpsGroup();

	/**
	 * Returns the value of the '<em><b>Extension Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Ops</em>' containment reference.
	 * @see net.opengis.fes.FESPackage#getUnaryLogicOpType_ExtensionOps()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='extensionOps' namespace='##targetNamespace' group='extensionOps:group'"
	 * @generated
	 */
	ExtensionOpsType getExtensionOps();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(FunctionType)
	 * @see net.opengis.fes.FESPackage#getUnaryLogicOpType_Function()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Function' namespace='##targetNamespace'"
	 * @generated
	 */
	FunctionType getFunction();

	/**
	 * Sets the value of the '{@link net.opengis.fes.UnaryLogicOpType#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(FunctionType value);

	/**
	 * Returns the value of the '<em><b>Id Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Group</em>' attribute list.
	 * @see net.opengis.fes.FESPackage#getUnaryLogicOpType_IdGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='_Id:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIdGroup();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.fes.AbstractIdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference list.
	 * @see net.opengis.fes.FESPackage#getUnaryLogicOpType_Id()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_Id' namespace='##targetNamespace' group='_Id:group'"
	 * @generated
	 */
	EList<AbstractIdType> getId();

} // UnaryLogicOpType
