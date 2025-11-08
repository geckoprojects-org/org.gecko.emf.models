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
 * A representation of the model object '<em><b>Proof Of Concept Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                             Evidence used to reproduce the vulnerability.
 *                         
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.ProofOfConceptType#getReproductionSteps <em>Reproduction Steps</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ProofOfConceptType#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ProofOfConceptType#getSupportingMaterial <em>Supporting Material</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getProofOfConceptType()
 * @model extendedMetaData="name='proofOfConcept_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ProofOfConceptType extends EObject {
	/**
	 * Returns the value of the '<em><b>Reproduction Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Precise steps to reproduce the vulnerability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reproduction Steps</em>' attribute.
	 * @see #setReproductionSteps(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getProofOfConceptType_ReproductionSteps()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='reproductionSteps' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReproductionSteps();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ProofOfConceptType#getReproductionSteps <em>Reproduction Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reproduction Steps</em>' attribute.
	 * @see #getReproductionSteps()
	 * @generated
	 */
	void setReproductionSteps(String value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the environment in which reproduction was possible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getProofOfConceptType_Environment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='environment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEnvironment();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ProofOfConceptType#getEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(String value);

	/**
	 * Returns the value of the '<em><b>Supporting Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting material that helps in reproducing or understanding how reproduction is possible. This may include screenshots, payloads, and PoC exploit code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Material</em>' containment reference.
	 * @see #setSupportingMaterial(SupportingMaterialType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getProofOfConceptType_SupportingMaterial()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	SupportingMaterialType getSupportingMaterial();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ProofOfConceptType#getSupportingMaterial <em>Supporting Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supporting Material</em>' containment reference.
	 * @see #getSupportingMaterial()
	 * @generated
	 */
	void setSupportingMaterial(SupportingMaterialType value);

} // ProofOfConceptType
