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

import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.DateTimePropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract DQ Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.AbstractDQElementType#getNameOfMeasure <em>Name Of Measure</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractDQElementType#getMeasureIdentification <em>Measure Identification</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractDQElementType#getMeasureDescription <em>Measure Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractDQElementType#getEvaluationMethodType <em>Evaluation Method Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractDQElementType#getEvaluationMethodDescription <em>Evaluation Method Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractDQElementType#getEvaluationProcedure <em>Evaluation Procedure</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractDQElementType#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.AbstractDQElementType#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractDQElementType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractDQ_Element_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractDQElementType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Name Of Measure</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.CharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Of Measure</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractDQElementType_NameOfMeasure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nameOfMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CharacterStringPropertyType> getNameOfMeasure();

	/**
	 * Returns the value of the '<em><b>Measure Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Identification</em>' containment reference.
	 * @see #setMeasureIdentification(MDIdentifierPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractDQElementType_MeasureIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measureIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	MDIdentifierPropertyType getMeasureIdentification();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.AbstractDQElementType#getMeasureIdentification <em>Measure Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Identification</em>' containment reference.
	 * @see #getMeasureIdentification()
	 * @generated
	 */
	void setMeasureIdentification(MDIdentifierPropertyType value);

	/**
	 * Returns the value of the '<em><b>Measure Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Description</em>' containment reference.
	 * @see #setMeasureDescription(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractDQElementType_MeasureDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='measureDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getMeasureDescription();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.AbstractDQElementType#getMeasureDescription <em>Measure Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Description</em>' containment reference.
	 * @see #getMeasureDescription()
	 * @generated
	 */
	void setMeasureDescription(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Evaluation Method Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Method Type</em>' containment reference.
	 * @see #setEvaluationMethodType(DQEvaluationMethodTypeCodePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractDQElementType_EvaluationMethodType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='evaluationMethodType' namespace='##targetNamespace'"
	 * @generated
	 */
	DQEvaluationMethodTypeCodePropertyType getEvaluationMethodType();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.AbstractDQElementType#getEvaluationMethodType <em>Evaluation Method Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Method Type</em>' containment reference.
	 * @see #getEvaluationMethodType()
	 * @generated
	 */
	void setEvaluationMethodType(DQEvaluationMethodTypeCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Evaluation Method Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Method Description</em>' containment reference.
	 * @see #setEvaluationMethodDescription(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractDQElementType_EvaluationMethodDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='evaluationMethodDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getEvaluationMethodDescription();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.AbstractDQElementType#getEvaluationMethodDescription <em>Evaluation Method Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Method Description</em>' containment reference.
	 * @see #getEvaluationMethodDescription()
	 * @generated
	 */
	void setEvaluationMethodDescription(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Evaluation Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Procedure</em>' containment reference.
	 * @see #setEvaluationProcedure(CICitationPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractDQElementType_EvaluationProcedure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='evaluationProcedure' namespace='##targetNamespace'"
	 * @generated
	 */
	CICitationPropertyType getEvaluationProcedure();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.AbstractDQElementType#getEvaluationProcedure <em>Evaluation Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Procedure</em>' containment reference.
	 * @see #getEvaluationProcedure()
	 * @generated
	 */
	void setEvaluationProcedure(CICitationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.DateTimePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractDQElementType_DateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DateTimePropertyType> getDateTime();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.DQResultPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getAbstractDQElementType_Result()
	 * @model containment="true" required="true" upper="2"
	 *        extendedMetaData="kind='element' name='result' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DQResultPropertyType> getResult();

} // AbstractDQElementType
