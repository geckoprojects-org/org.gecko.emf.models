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
package org.isotc211._2005.gmd;

import org.eclipse.emf.common.util.EList;

import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.RecordPropertyType;
import org.isotc211._2005.gco.RecordTypePropertyType;
import org.isotc211._2005.gco.UnitOfMeasurePropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DQ Quantitative Result Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Quantitative_conformance_measure from Quality Procedures.  -  - Renamed to remove implied use limitation -  - OCL - -- result is type specified by valueDomain - result.tupleType = valueDomain
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.DQQuantitativeResultType#getValueType <em>Value Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DQQuantitativeResultType#getValueUnit <em>Value Unit</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DQQuantitativeResultType#getErrorStatistic <em>Error Statistic</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DQQuantitativeResultType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getDQQuantitativeResultType()
 * @model extendedMetaData="name='DQ_QuantitativeResult_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DQQuantitativeResultType extends AbstractDQResultType {
	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' containment reference.
	 * @see #setValueType(RecordTypePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDQQuantitativeResultType_ValueType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueType' namespace='##targetNamespace'"
	 * @generated
	 */
	RecordTypePropertyType getValueType();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DQQuantitativeResultType#getValueType <em>Value Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' containment reference.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(RecordTypePropertyType value);

	/**
	 * Returns the value of the '<em><b>Value Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Unit</em>' containment reference.
	 * @see #setValueUnit(UnitOfMeasurePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDQQuantitativeResultType_ValueUnit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='valueUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitOfMeasurePropertyType getValueUnit();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DQQuantitativeResultType#getValueUnit <em>Value Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Unit</em>' containment reference.
	 * @see #getValueUnit()
	 * @generated
	 */
	void setValueUnit(UnitOfMeasurePropertyType value);

	/**
	 * Returns the value of the '<em><b>Error Statistic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Statistic</em>' containment reference.
	 * @see #setErrorStatistic(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDQQuantitativeResultType_ErrorStatistic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='errorStatistic' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getErrorStatistic();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DQQuantitativeResultType#getErrorStatistic <em>Error Statistic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Statistic</em>' containment reference.
	 * @see #getErrorStatistic()
	 * @generated
	 */
	void setErrorStatistic(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.RecordPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getDQQuantitativeResultType_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RecordPropertyType> getValue();

} // DQQuantitativeResultType
