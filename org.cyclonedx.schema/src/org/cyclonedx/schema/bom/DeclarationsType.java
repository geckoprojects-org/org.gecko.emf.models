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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.DeclarationsType#getAssessors <em>Assessors</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DeclarationsType#getAttestations <em>Attestations</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DeclarationsType#getClaims <em>Claims</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DeclarationsType#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DeclarationsType#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DeclarationsType#getAffirmation <em>Affirmation</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.DeclarationsType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getDeclarationsType()
 * @model extendedMetaData="name='declarationsType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeclarationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Assessors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The list of assessors evaluating claims and determining conformance to requirements and confidence in that assessment.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessors</em>' containment reference.
	 * @see #setAssessors(AssessorsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDeclarationsType_Assessors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assessors' namespace='##targetNamespace'"
	 * @generated
	 */
	AssessorsType getAssessors();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DeclarationsType#getAssessors <em>Assessors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessors</em>' containment reference.
	 * @see #getAssessors()
	 * @generated
	 */
	void setAssessors(AssessorsType value);

	/**
	 * Returns the value of the '<em><b>Attestations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The list of attestations asserted by an assessor that maps requirements to claims.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attestations</em>' containment reference.
	 * @see #setAttestations(AttestationsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDeclarationsType_Attestations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attestations' namespace='##targetNamespace'"
	 * @generated
	 */
	AttestationsType getAttestations();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DeclarationsType#getAttestations <em>Attestations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attestations</em>' containment reference.
	 * @see #getAttestations()
	 * @generated
	 */
	void setAttestations(AttestationsType value);

	/**
	 * Returns the value of the '<em><b>Claims</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The list of claims.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claims</em>' containment reference.
	 * @see #setClaims(ClaimsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDeclarationsType_Claims()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='claims' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimsType getClaims();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DeclarationsType#getClaims <em>Claims</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claims</em>' containment reference.
	 * @see #getClaims()
	 * @generated
	 */
	void setClaims(ClaimsType value);

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The list of evidence
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference.
	 * @see #setEvidence(EvidenceType1)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDeclarationsType_Evidence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='evidence' namespace='##targetNamespace'"
	 * @generated
	 */
	EvidenceType1 getEvidence();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DeclarationsType#getEvidence <em>Evidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evidence</em>' containment reference.
	 * @see #getEvidence()
	 * @generated
	 */
	void setEvidence(EvidenceType1 value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The list of targets which claims are made against.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference.
	 * @see #setTargets(TargetsType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDeclarationsType_Targets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targets' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetsType getTargets();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DeclarationsType#getTargets <em>Targets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targets</em>' containment reference.
	 * @see #getTargets()
	 * @generated
	 */
	void setTargets(TargetsType value);

	/**
	 * Returns the value of the '<em><b>Affirmation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         A concise statement affirmed by an individual regarding all declarations, often used for third-party auditor acceptance or recipient acknowledgment.
	 *                         It includes a list of authorized signatories who assert the validity of the document on behalf of the organization.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affirmation</em>' containment reference.
	 * @see #setAffirmation(AffirmationType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDeclarationsType_Affirmation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='affirmation' namespace='##targetNamespace'"
	 * @generated
	 */
	AffirmationType getAffirmation();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.DeclarationsType#getAffirmation <em>Affirmation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affirmation</em>' containment reference.
	 * @see #getAffirmation()
	 * @generated
	 */
	void setAffirmation(AffirmationType value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Allows any undeclared elements as long as the elements are placed in a different namespace.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getDeclarationsType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':6' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // DeclarationsType
