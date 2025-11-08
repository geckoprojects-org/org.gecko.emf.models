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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Card Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 A model card describes the intended uses of a machine learning model and potential limitations, including
 *                 biases and ethical considerations. Model cards typically contain the training parameters, which datasets
 *                 were used to train the model, performance metrics, and other relevant data useful for ML transparency.
 *                 This object SHOULD be specified for any component of type `machine-learning-model` and must not be specified
 *                 for other component types.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.ModelCardType#getModelParameters <em>Model Parameters</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ModelCardType#getQuantitativeAnalysis <em>Quantitative Analysis</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ModelCardType#getConsiderations <em>Considerations</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ModelCardType#getBomRef <em>Bom Ref</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getModelCardType()
 * @model extendedMetaData="name='modelCardType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ModelCardType extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Hyper-parameters for construction of the model.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Parameters</em>' containment reference.
	 * @see #setModelParameters(ModelParametersType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getModelCardType_ModelParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modelParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelParametersType getModelParameters();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ModelCardType#getModelParameters <em>Model Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Parameters</em>' containment reference.
	 * @see #getModelParameters()
	 * @generated
	 */
	void setModelParameters(ModelParametersType value);

	/**
	 * Returns the value of the '<em><b>Quantitative Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         A quantitative analysis of the model
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantitative Analysis</em>' containment reference.
	 * @see #setQuantitativeAnalysis(QuantitativeAnalysisType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getModelCardType_QuantitativeAnalysis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantitativeAnalysis' namespace='##targetNamespace'"
	 * @generated
	 */
	QuantitativeAnalysisType getQuantitativeAnalysis();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ModelCardType#getQuantitativeAnalysis <em>Quantitative Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantitative Analysis</em>' containment reference.
	 * @see #getQuantitativeAnalysis()
	 * @generated
	 */
	void setQuantitativeAnalysis(QuantitativeAnalysisType value);

	/**
	 * Returns the value of the '<em><b>Considerations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         What considerations should be taken into account regarding the model's construction, training,
	 *                         and application?
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Considerations</em>' containment reference.
	 * @see #setConsiderations(ConsiderationsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getModelCardType_Considerations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='considerations' namespace='##targetNamespace'"
	 * @generated
	 */
	ConsiderationsType getConsiderations();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ModelCardType#getConsiderations <em>Considerations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Considerations</em>' containment reference.
	 * @see #getConsiderations()
	 * @generated
	 */
	void setConsiderations(ConsiderationsType value);

	/**
	 * Returns the value of the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     An optional identifier which can be used to reference the model card elsewhere in the BOM.
	 *                     Every bom-ref must be unique within the BOM.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bom Ref</em>' attribute.
	 * @see #setBomRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getModelCardType_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ModelCardType#getBomRef <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bom Ref</em>' attribute.
	 * @see #getBomRef()
	 * @generated
	 */
	void setBomRef(String value);

} // ModelCardType
