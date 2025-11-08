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
 * A representation of the model object '<em><b>Model Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.ModelParametersType#getApproach <em>Approach</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ModelParametersType#getTask <em>Task</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ModelParametersType#getArchitectureFamily <em>Architecture Family</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ModelParametersType#getModelArchitecture <em>Model Architecture</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ModelParametersType#getDatasets <em>Datasets</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ModelParametersType#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ModelParametersType#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getModelParametersType()
 * @model extendedMetaData="name='modelParameters_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ModelParametersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Approach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The overall approach to learning used by the model for problem solving.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Approach</em>' containment reference.
	 * @see #setApproach(ApproachType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getModelParametersType_Approach()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='approach' namespace='##targetNamespace'"
	 * @generated
	 */
	ApproachType getApproach();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ModelParametersType#getApproach <em>Approach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approach</em>' containment reference.
	 * @see #getApproach()
	 * @generated
	 */
	void setApproach(ApproachType value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Directly influences the input and/or output. Examples include classification,
	 *                                     regression, clustering, etc.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Task</em>' attribute.
	 * @see #setTask(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getModelParametersType_Task()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='task' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTask();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ModelParametersType#getTask <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' attribute.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(String value);

	/**
	 * Returns the value of the '<em><b>Architecture Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The model architecture family such as transformer network, convolutional neural
	 *                                     network, residual neural network, LSTM neural network, etc.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Architecture Family</em>' attribute.
	 * @see #setArchitectureFamily(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getModelParametersType_ArchitectureFamily()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='architectureFamily' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArchitectureFamily();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ModelParametersType#getArchitectureFamily <em>Architecture Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture Family</em>' attribute.
	 * @see #getArchitectureFamily()
	 * @generated
	 */
	void setArchitectureFamily(String value);

	/**
	 * Returns the value of the '<em><b>Model Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The specific architecture of the model such as GPT-1, ResNet-50, YOLOv3, etc.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Architecture</em>' attribute.
	 * @see #setModelArchitecture(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getModelParametersType_ModelArchitecture()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='modelArchitecture' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModelArchitecture();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ModelParametersType#getModelArchitecture <em>Model Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Architecture</em>' attribute.
	 * @see #getModelArchitecture()
	 * @generated
	 */
	void setModelArchitecture(String value);

	/**
	 * Returns the value of the '<em><b>Datasets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The datasets used to train and evaluate the model.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datasets</em>' containment reference.
	 * @see #setDatasets(DatasetsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getModelParametersType_Datasets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='datasets' namespace='##targetNamespace'"
	 * @generated
	 */
	DatasetsType getDatasets();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ModelParametersType#getDatasets <em>Datasets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datasets</em>' containment reference.
	 * @see #getDatasets()
	 * @generated
	 */
	void setDatasets(DatasetsType value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The input format(s) of the model
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference.
	 * @see #setInputs(InputsType3)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getModelParametersType_Inputs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inputs' namespace='##targetNamespace'"
	 * @generated
	 */
	InputsType3 getInputs();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ModelParametersType#getInputs <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' containment reference.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(InputsType3 value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The output format(s) from the model
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference.
	 * @see #setOutputs(OutputsType3)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getModelParametersType_Outputs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outputs' namespace='##targetNamespace'"
	 * @generated
	 */
	OutputsType3 getOutputs();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ModelParametersType#getOutputs <em>Outputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputs</em>' containment reference.
	 * @see #getOutputs()
	 * @generated
	 */
	void setOutputs(OutputsType3 value);

} // ModelParametersType
