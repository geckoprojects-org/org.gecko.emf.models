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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance Buffer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.fes.DistanceBufferType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.fes.DistanceBufferType#getExpressionGroup <em>Expression Group</em>}</li>
 *   <li>{@link net.opengis.fes.DistanceBufferType#getExpression <em>Expression</em>}</li>
 *   <li>{@link net.opengis.fes.DistanceBufferType#getAny <em>Any</em>}</li>
 *   <li>{@link net.opengis.fes.DistanceBufferType#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see net.opengis.fes.FESPackage#getDistanceBufferType()
 * @model extendedMetaData="name='DistanceBufferType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DistanceBufferType extends SpatialOpsType {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.fes.FESPackage#getDistanceBufferType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Expression Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Group</em>' attribute list.
	 * @see net.opengis.fes.FESPackage#getDistanceBufferType_ExpressionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='expression:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getExpressionGroup();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see net.opengis.fes.FESPackage#getDistanceBufferType_Expression()
	 * @model containment="true" upper="2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace' group='expression:group'"
	 * @generated
	 */
	EList<EObject> getExpression();

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see net.opengis.fes.FESPackage#getDistanceBufferType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='strict' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' containment reference.
	 * @see #setDistance(MeasureType)
	 * @see net.opengis.fes.FESPackage#getDistanceBufferType_Distance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Distance' namespace='##targetNamespace'"
	 * @generated
	 */
	MeasureType getDistance();

	/**
	 * Sets the value of the '{@link net.opengis.fes.DistanceBufferType#getDistance <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' containment reference.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(MeasureType value);

} // DistanceBufferType
