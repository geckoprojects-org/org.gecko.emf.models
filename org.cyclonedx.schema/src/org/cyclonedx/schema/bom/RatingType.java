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
package org.cyclonedx.schema.bom;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rating Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.RatingType#getSource <em>Source</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RatingType#getScore <em>Score</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RatingType#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RatingType#getMethod <em>Method</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RatingType#getVector <em>Vector</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.RatingType#getJustification <em>Justification</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getRatingType()
 * @model extendedMetaData="name='ratingType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RatingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source that calculated the severity or risk rating of the vulnerability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(VulnerabilitySourceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRatingType_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	VulnerabilitySourceType getSource();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RatingType#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(VulnerabilitySourceType value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The numerical score of the rating.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(BigDecimal)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRatingType_Score()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
	 *        extendedMetaData="kind='element' name='score' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getScore();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RatingType#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.SeverityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textual representation of the severity that corresponds to the numerical score of the rating.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see org.cyclonedx.schema.bom.SeverityType
	 * @see #isSetSeverity()
	 * @see #unsetSeverity()
	 * @see #setSeverity(SeverityType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRatingType_Severity()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='severity' namespace='##targetNamespace'"
	 * @generated
	 */
	SeverityType getSeverity();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RatingType#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see org.cyclonedx.schema.bom.SeverityType
	 * @see #isSetSeverity()
	 * @see #unsetSeverity()
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(SeverityType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.RatingType#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSeverity()
	 * @see #getSeverity()
	 * @see #setSeverity(SeverityType)
	 * @generated
	 */
	void unsetSeverity();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.RatingType#getSeverity <em>Severity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Severity</em>' attribute is set.
	 * @see #unsetSeverity()
	 * @see #getSeverity()
	 * @see #setSeverity(SeverityType)
	 * @generated
	 */
	boolean isSetSeverity();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.ScoreSourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The risk scoring methodology/standard used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ScoreSourceType
	 * @see #isSetMethod()
	 * @see #unsetMethod()
	 * @see #setMethod(ScoreSourceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRatingType_Method()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 * @generated
	 */
	ScoreSourceType getMethod();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RatingType#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ScoreSourceType
	 * @see #isSetMethod()
	 * @see #unsetMethod()
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(ScoreSourceType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.RatingType#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMethod()
	 * @see #getMethod()
	 * @see #setMethod(ScoreSourceType)
	 * @generated
	 */
	void unsetMethod();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.RatingType#getMethod <em>Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Method</em>' attribute is set.
	 * @see #unsetMethod()
	 * @see #getMethod()
	 * @see #setMethod(ScoreSourceType)
	 * @generated
	 */
	boolean isSetMethod();

	/**
	 * Returns the value of the '<em><b>Vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textual representation of the metric values used to score the vulnerability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vector</em>' attribute.
	 * @see #setVector(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRatingType_Vector()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='element' name='vector' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVector();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RatingType#getVector <em>Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector</em>' attribute.
	 * @see #getVector()
	 * @generated
	 */
	void setVector(String value);

	/**
	 * Returns the value of the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional reason for rating the vulnerability as it was.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Justification</em>' attribute.
	 * @see #setJustification(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getRatingType_Justification()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='justification' namespace='##targetNamespace'"
	 * @generated
	 */
	String getJustification();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.RatingType#getJustification <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification</em>' attribute.
	 * @see #getJustification()
	 * @generated
	 */
	void setJustification(String value);

} // RatingType
