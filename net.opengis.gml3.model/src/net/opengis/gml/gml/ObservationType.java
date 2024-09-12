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
package net.opengis.gml.gml;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.ObservationType#getValidTime <em>Valid Time</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ObservationType#getUsing <em>Using</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ObservationType#getTargetGroup <em>Target Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ObservationType#getTarget <em>Target</em>}</li>
 *   <li>{@link net.opengis.gml.gml.ObservationType#getResultOf <em>Result Of</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getObservationType()
 * @model extendedMetaData="name='ObservationType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ObservationType extends AbstractFeatureType {
	/**
	 * Returns the value of the '<em><b>Valid Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:validTime is a convenience property element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid Time</em>' containment reference.
	 * @see #setValidTime(TimePrimitivePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getObservationType_ValidTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='validTime' namespace='##targetNamespace'"
	 * @generated
	 */
	TimePrimitivePropertyType getValidTime();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ObservationType#getValidTime <em>Valid Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Time</em>' containment reference.
	 * @see #getValidTime()
	 * @generated
	 */
	void setValidTime(TimePrimitivePropertyType value);

	/**
	 * Returns the value of the '<em><b>Using</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using</em>' containment reference.
	 * @see #setUsing(ProcedurePropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getObservationType_Using()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='using' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcedurePropertyType getUsing();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ObservationType#getUsing <em>Using</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Using</em>' containment reference.
	 * @see #getUsing()
	 * @generated
	 */
	void setUsing(ProcedurePropertyType value);

	/**
	 * Returns the value of the '<em><b>Target Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Group</em>' attribute list.
	 * @see net.opengis.gml.gml.GMLPackage#getObservationType_TargetGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='target:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTargetGroup();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(TargetPropertyType)
	 * @see net.opengis.gml.gml.GMLPackage#getObservationType_Target()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace' group='target:group'"
	 * @generated
	 */
	TargetPropertyType getTarget();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ObservationType#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetPropertyType value);

	/**
	 * Returns the value of the '<em><b>Result Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Of</em>' containment reference.
	 * @see #setResultOf(ResultType)
	 * @see net.opengis.gml.gml.GMLPackage#getObservationType_ResultOf()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resultOf' namespace='##targetNamespace'"
	 * @generated
	 */
	ResultType getResultOf();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.ObservationType#getResultOf <em>Result Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Of</em>' containment reference.
	 * @see #getResultOf()
	 * @generated
	 */
	void setResultOf(ResultType value);

} // ObservationType
