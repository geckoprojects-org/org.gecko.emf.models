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
 * A representation of the model object '<em><b>Citation Version</b></em>'.
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
 *   <li>{@link org.hl7.fhir.CitationVersion#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.fhir.CitationVersion#getBaseCitation <em>Base Citation</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getCitationVersion()
 * @model extendedMetaData="name='Citation.Version' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CitationVersion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version number or other version identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getCitationVersion_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getValue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationVersion#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Base Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Citation for the main version of the cited artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Citation</em>' containment reference.
	 * @see #setBaseCitation(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getCitationVersion_BaseCitation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='baseCitation' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getBaseCitation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CitationVersion#getBaseCitation <em>Base Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Citation</em>' containment reference.
	 * @see #getBaseCitation()
	 * @generated
	 */
	void setBaseCitation(Reference value);

} // CitationVersion
