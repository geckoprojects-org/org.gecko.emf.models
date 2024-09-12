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
 * A representation of the model object '<em><b>Value Set Expansion</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ValueSetExpansion#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetExpansion#getNext <em>Next</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetExpansion#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetExpansion#getTotal <em>Total</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetExpansion#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetExpansion#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetExpansion#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.ValueSetExpansion#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getValueSetExpansion()
 * @model extendedMetaData="name='ValueSet.Expansion' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ValueSetExpansion extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier that uniquely identifies this expansion of the valueset, based on a unique combination of the provided parameters, the system default parameters, and the underlying system code system versions etc. Systems may re-use the same identifier as long as those factors remain the same, and the expansion is the same, but are not required to do so. This is a business identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Uri)
	 * @see org.hl7.fhir.FHIRPackage#getValueSetExpansion_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetExpansion#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Uri value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * As per paging Search results, the next URLs are opaque to the client, have no dictated structure, and only the server understands them.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(Uri)
	 * @see org.hl7.fhir.FHIRPackage#getValueSetExpansion_Next()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='next' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getNext();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetExpansion#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Uri value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time at which the expansion was produced by the expanding system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' containment reference.
	 * @see #setTimestamp(DateTime)
	 * @see org.hl7.fhir.FHIRPackage#getValueSetExpansion_Timestamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getTimestamp();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetExpansion#getTimestamp <em>Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' containment reference.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(DateTime value);

	/**
	 * Returns the value of the '<em><b>Total</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total</em>' containment reference.
	 * @see #setTotal(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FHIRPackage#getValueSetExpansion_Total()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='total' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getTotal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetExpansion#getTotal <em>Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' containment reference.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL NOT be present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FHIRPackage#getValueSetExpansion_Offset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offset' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getOffset();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ValueSetExpansion#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ValueSetParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getValueSetExpansion_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetParameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ValueSetProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A property defines an additional slot through which additional information can be provided about a concept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getValueSetExpansion_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ValueSetContains}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The codes that are contained in the value set expansion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getValueSetExpansion_Contains()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contains' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueSetContains> getContains();

} // ValueSetExpansion
