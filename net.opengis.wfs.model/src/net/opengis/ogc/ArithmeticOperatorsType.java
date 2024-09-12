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
 * A representation of the model object '<em><b>Arithmetic Operators Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.ArithmeticOperatorsType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.ogc.ArithmeticOperatorsType#getSimpleArithmetic <em>Simple Arithmetic</em>}</li>
 *   <li>{@link net.opengis.ogc.ArithmeticOperatorsType#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.OGCPackage#getArithmeticOperatorsType()
 * @model extendedMetaData="name='ArithmeticOperatorsType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ArithmeticOperatorsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.ogc.OGCPackage#getArithmeticOperatorsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Simple Arithmetic</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ogc.SimpleArithmeticType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Arithmetic</em>' containment reference list.
	 * @see net.opengis.ogc.OGCPackage#getArithmeticOperatorsType_SimpleArithmetic()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SimpleArithmetic' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SimpleArithmeticType> getSimpleArithmetic();

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.ogc.FunctionsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see net.opengis.ogc.OGCPackage#getArithmeticOperatorsType_Functions()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Functions' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FunctionsType> getFunctions();

} // ArithmeticOperatorsType
