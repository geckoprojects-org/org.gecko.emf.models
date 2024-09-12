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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ValueSet resource instance specifies a set of codes drawn from one or more code systems, intended for use in a particular context. Value sets link between [CodeSystem](codesystem.html) definitions and their use in [coded elements](terminologies.html).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ValueSetScope#getInclusionCriteria <em>Inclusion Criteria</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetScope#getExclusionCriteria <em>Exclusion Criteria</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getValueSetScope()
 * @model extendedMetaData="name='ValueSet.Scope' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ValueSetScope extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Inclusion Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Criteria describing which concepts or codes should be included and why.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inclusion Criteria</em>' containment reference.
	 * @see #setInclusionCriteria(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getValueSetScope_InclusionCriteria()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inclusionCriteria' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getInclusionCriteria();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetScope#getInclusionCriteria <em>Inclusion Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inclusion Criteria</em>' containment reference.
	 * @see #getInclusionCriteria()
	 * @generated
	 */
	void setInclusionCriteria(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Exclusion Criteria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Criteria describing which concepts or codes should be excluded and why.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclusion Criteria</em>' containment reference.
	 * @see #setExclusionCriteria(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getValueSetScope_ExclusionCriteria()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclusionCriteria' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getExclusionCriteria();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetScope#getExclusionCriteria <em>Exclusion Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusion Criteria</em>' containment reference.
	 * @see #getExclusionCriteria()
	 * @generated
	 */
	void setExclusionCriteria(org.hl7.fhir.String value);

} // ValueSetScope
