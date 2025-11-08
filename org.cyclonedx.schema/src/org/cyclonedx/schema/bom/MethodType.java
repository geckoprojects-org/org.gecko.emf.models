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
 * A representation of the model object '<em><b>Method Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.MethodType#getTechnique <em>Technique</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.MethodType#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.MethodType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getMethodType()
 * @model extendedMetaData="name='method_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MethodType extends EObject {
	/**
	 * Returns the value of the '<em><b>Technique</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.EvidenceTechnique}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The technique used in this method of analysis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technique</em>' attribute.
	 * @see org.cyclonedx.schema.bom.EvidenceTechnique
	 * @see #isSetTechnique()
	 * @see #unsetTechnique()
	 * @see #setTechnique(EvidenceTechnique)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMethodType_Technique()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='technique' namespace='##targetNamespace'"
	 * @generated
	 */
	EvidenceTechnique getTechnique();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.MethodType#getTechnique <em>Technique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technique</em>' attribute.
	 * @see org.cyclonedx.schema.bom.EvidenceTechnique
	 * @see #isSetTechnique()
	 * @see #unsetTechnique()
	 * @see #getTechnique()
	 * @generated
	 */
	void setTechnique(EvidenceTechnique value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.MethodType#getTechnique <em>Technique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTechnique()
	 * @see #getTechnique()
	 * @see #setTechnique(EvidenceTechnique)
	 * @generated
	 */
	void unsetTechnique();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.MethodType#getTechnique <em>Technique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Technique</em>' attribute is set.
	 * @see #unsetTechnique()
	 * @see #getTechnique()
	 * @see #setTechnique(EvidenceTechnique)
	 * @generated
	 */
	boolean isSetTechnique();

	/**
	 * Returns the value of the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The confidence of the evidence from 0 - 1, where 1 is 100% confidence. Confidence is specific to the technique used. Each technique of analysis can have independent confidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confidence</em>' attribute.
	 * @see #setConfidence(BigDecimal)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMethodType_Confidence()
	 * @model dataType="org.cyclonedx.schema.bom.DecimalPercentType" required="true"
	 *        extendedMetaData="kind='element' name='confidence' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getConfidence();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.MethodType#getConfidence <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence</em>' attribute.
	 * @see #getConfidence()
	 * @generated
	 */
	void setConfidence(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value or contents of the evidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMethodType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.MethodType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // MethodType
