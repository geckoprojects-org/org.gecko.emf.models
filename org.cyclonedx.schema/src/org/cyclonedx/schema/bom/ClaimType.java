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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.ClaimType#getTarget <em>Target</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ClaimType#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ClaimType#getMitigationStrategies <em>Mitigation Strategies</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ClaimType#getReasoning <em>Reasoning</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ClaimType#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ClaimType#getCounterEvidence <em>Counter Evidence</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ClaimType#getExternalReferences <em>External References</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ClaimType#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ClaimType#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.ClaimType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getClaimType()
 * @model extendedMetaData="name='claim_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ClaimType extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The `bom-ref` to a target representing a specific system, application,
	 *                                                 API, module, team, person, process, business unit, company, etc...
	 *                                                 that this claim is being applied to.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getClaimType_Target()
	 * @model dataType="org.cyclonedx.schema.bom.RefLinkType"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ClaimType#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The specific statement or assertion about the target.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Predicate</em>' attribute.
	 * @see #setPredicate(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getClaimType_Predicate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='predicate' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPredicate();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ClaimType#getPredicate <em>Predicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' attribute.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(String value);

	/**
	 * Returns the value of the '<em><b>Mitigation Strategies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The list of  `bom-ref` to the evidence provided describing the
	 *                                                 mitigation strategies. Each mitigation strategy should include an
	 *                                                 explanation of how any weaknesses in the evidence will be mitigated.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mitigation Strategies</em>' containment reference.
	 * @see #setMitigationStrategies(MitigationStrategiesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getClaimType_MitigationStrategies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mitigationStrategies' namespace='##targetNamespace'"
	 * @generated
	 */
	MitigationStrategiesType getMitigationStrategies();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ClaimType#getMitigationStrategies <em>Mitigation Strategies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mitigation Strategies</em>' containment reference.
	 * @see #getMitigationStrategies()
	 * @generated
	 */
	void setMitigationStrategies(MitigationStrategiesType value);

	/**
	 * Returns the value of the '<em><b>Reasoning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The written explanation of why the evidence provided substantiates the claim.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reasoning</em>' attribute.
	 * @see #setReasoning(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getClaimType_Reasoning()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='reasoning' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReasoning();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ClaimType#getReasoning <em>Reasoning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reasoning</em>' attribute.
	 * @see #getReasoning()
	 * @generated
	 */
	void setReasoning(String value);

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The list of `bom-ref` to evidence that supports this claim.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getClaimType_Evidence()
	 * @model unique="false" dataType="org.cyclonedx.schema.bom.RefLinkType"
	 *        extendedMetaData="kind='element' name='evidence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getEvidence();

	/**
	 * Returns the value of the '<em><b>Counter Evidence</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 The list of `bom-ref` to counterEvidence that supports this claim.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Counter Evidence</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getClaimType_CounterEvidence()
	 * @model unique="false" dataType="org.cyclonedx.schema.bom.RefLinkType"
	 *        extendedMetaData="kind='element' name='counterEvidence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getCounterEvidence();

	/**
	 * Returns the value of the '<em><b>External References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the ability to document external references related to the claim the BOM describes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External References</em>' containment reference.
	 * @see #setExternalReferences(ExternalReferences)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getClaimType_ExternalReferences()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='externalReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	ExternalReferences getExternalReferences();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ClaimType#getExternalReferences <em>External References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External References</em>' containment reference.
	 * @see #getExternalReferences()
	 * @generated
	 */
	void setExternalReferences(ExternalReferences value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                 Allows any undeclared elements as long as the elements are placed in a different namespace.
	 *                                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getClaimType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':7' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                             An optional identifier which can be used to reference the object elsewhere
	 *                                             in the BOM. Every bom-ref must be unique within the BOM.
	 *                                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bom Ref</em>' attribute.
	 * @see #setBomRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getClaimType_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.ClaimType#getBomRef <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bom Ref</em>' attribute.
	 * @see #getBomRef()
	 * @generated
	 */
	void setBomRef(String value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User-defined attributes may be used on this element as long as they
	 *                                             do not have the same name as an existing attribute used by the schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getClaimType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':9' processing='lax'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ClaimType
