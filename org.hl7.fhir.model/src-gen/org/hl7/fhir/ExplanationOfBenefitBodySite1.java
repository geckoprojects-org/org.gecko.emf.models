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
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Body Site1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitBodySite1#getSite <em>Site</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitBodySite1#getSubSite <em>Sub Site</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getExplanationOfBenefitBodySite1()
 * @model extendedMetaData="name='ExplanationOfBenefit.BodySite1' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ExplanationOfBenefitBodySite1 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical service site on the patient (limb, tooth, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getExplanationOfBenefitBodySite1_Site()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='site' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getSite();

	/**
	 * Returns the value of the '<em><b>Sub Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A region or surface of the bodySite, e.g. limb region or tooth surface(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Site</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getExplanationOfBenefitBodySite1_SubSite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subSite' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSubSite();

} // ExplanationOfBenefitBodySite1
