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
 * A representation of the model object '<em><b>Citation Contributorship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Citation Resource enables reference to any knowledge artifact for purposes of identification and attribution. The Citation Resource supports existing reference structures and developing publication practices such as versioning, expressing complex contributorship roles, and referencing computable resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CitationContributorship#getComplete <em>Complete</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationContributorship#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationContributorship#getSummary <em>Summary</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getCitationContributorship()
 * @model extendedMetaData="name='Citation.Contributorship' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CitationContributorship extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Complete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the list includes all authors and/or contributors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complete</em>' containment reference.
	 * @see #setComplete(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FHIRPackage#getCitationContributorship_Complete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='complete' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getComplete();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationContributorship#getComplete <em>Complete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete</em>' containment reference.
	 * @see #getComplete()
	 * @generated
	 */
	void setComplete(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CitationEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individual entity named as a contributor, for example in the author list or contributor list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getCitationContributorship_Entry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='entry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CitationEntry> getEntry();

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CitationSummary1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to record a display of the author/contributor list without separate data element for each list member.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Summary</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getCitationContributorship_Summary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='summary' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CitationSummary1> getSummary();

} // CitationContributorship
