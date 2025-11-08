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
 * A representation of the model object '<em><b>Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.MapType#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.MapType#getClaims <em>Claims</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.MapType#getCounterClaims <em>Counter Claims</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.MapType#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.MapType#getConfidence <em>Confidence</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getMapType()
 * @model extendedMetaData="name='map_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MapType extends EObject {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             The `bom-ref` to the requirement being attested to.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirement</em>' attribute.
	 * @see #setRequirement(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMapType_Requirement()
	 * @model dataType="org.cyclonedx.schema.bom.RefLinkType"
	 *        extendedMetaData="kind='element' name='requirement' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRequirement();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.MapType#getRequirement <em>Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' attribute.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(String value);

	/**
	 * Returns the value of the '<em><b>Claims</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             The list of `bom-ref` to the claims being attested to.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claims</em>' containment reference.
	 * @see #setClaims(ClaimsType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMapType_Claims()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claims' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimsType1 getClaims();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.MapType#getClaims <em>Claims</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claims</em>' containment reference.
	 * @see #getClaims()
	 * @generated
	 */
	void setClaims(ClaimsType1 value);

	/**
	 * Returns the value of the '<em><b>Counter Claims</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             The list of `bom-ref` to the counter claims being attested to.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Counter Claims</em>' containment reference.
	 * @see #setCounterClaims(CounterClaimsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMapType_CounterClaims()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='counterClaims' namespace='##targetNamespace'"
	 * @generated
	 */
	CounterClaimsType getCounterClaims();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.MapType#getCounterClaims <em>Counter Claims</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Claims</em>' containment reference.
	 * @see #getCounterClaims()
	 * @generated
	 */
	void setCounterClaims(CounterClaimsType value);

	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             The conformance of the claim meeting a requirement.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance</em>' containment reference.
	 * @see #setConformance(ConformanceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMapType_Conformance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conformance' namespace='##targetNamespace'"
	 * @generated
	 */
	ConformanceType getConformance();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.MapType#getConformance <em>Conformance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance</em>' containment reference.
	 * @see #getConformance()
	 * @generated
	 */
	void setConformance(ConformanceType value);

	/**
	 * Returns the value of the '<em><b>Confidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                             The confidence of the claim meeting the requirement.
	 *                                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confidence</em>' containment reference.
	 * @see #setConfidence(ConfidenceType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getMapType_Confidence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confidence' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfidenceType getConfidence();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.MapType#getConfidence <em>Confidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence</em>' containment reference.
	 * @see #getConfidence()
	 * @generated
	 */
	void setConfidence(ConfidenceType value);

} // MapType
