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
package org.emau.icmvc.ganimed.ttp.cm2.config;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.emau.icmvc.ganimed.ttp.cm2.QCProblemType;
import org.emau.icmvc.ganimed.ttp.cm2.QCProblemTypeAction;
import org.emau.icmvc.ganimed.ttp.cm2.QCType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Control Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig#getType <em>Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig#getProblemType <em>Problem Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig#getProblemTypeAction <em>Problem Type Action</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig#getDefaultType <em>Default Type</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getQualityControlConfig()
 * @model extendedMetaData="name='QualityControlConfig' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface QualityControlConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.QCType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getQualityControlConfig_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type'"
	 * @generated
	 */
	EList<QCType> getType();

	/**
	 * Returns the value of the '<em><b>Problem Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Type</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getQualityControlConfig_ProblemType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='problem-type'"
	 * @generated
	 */
	EList<QCProblemType> getProblemType();

	/**
	 * Returns the value of the '<em><b>Problem Type Action</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.QCProblemTypeAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Type Action</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getQualityControlConfig_ProblemTypeAction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='problem-type-action'"
	 * @generated
	 */
	EList<QCProblemTypeAction> getProblemTypeAction();

	/**
	 * Returns the value of the '<em><b>Default Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Type</em>' attribute.
	 * @see #setDefaultType(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getQualityControlConfig_DefaultType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='default-type'"
	 * @generated
	 */
	String getDefaultType();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.QualityControlConfig#getDefaultType <em>Default Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Type</em>' attribute.
	 * @see #getDefaultType()
	 * @generated
	 */
	void setDefaultType(String value);

} // QualityControlConfig
