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
 * A representation of the model object '<em><b>Concept Map Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A statement of relationships from one set of concepts to one or more other concepts - either concepts in code systems, or data element/data element concepts, or classes in class models.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ConceptMapElement#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ConceptMapElement#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.hl7.fhir.ConceptMapElement#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.ConceptMapElement#getNoMap <em>No Map</em>}</li>
 *   <li>{@link org.hl7.fhir.ConceptMapElement#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getConceptMapElement()
 * @model extendedMetaData="name='ConceptMap.Element' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ConceptMapElement extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identity (code or path) or the element/item being mapped.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see org.hl7.fhir.FHIRPackage#getConceptMapElement_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConceptMapElement#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Display</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The display for the code. The display is only provided to help editors when editing the concept map.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display</em>' containment reference.
	 * @see #setDisplay(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getConceptMapElement_Display()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='display' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDisplay();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConceptMapElement#getDisplay <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display</em>' containment reference.
	 * @see #getDisplay()
	 * @generated
	 */
	void setDisplay(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of concepts from the ConceptMap.group.source code system which are all being mapped to the target as part of this mapping rule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(Canonical)
	 * @see org.hl7.fhir.FHIRPackage#getConceptMapElement_ValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConceptMapElement#getValueSet <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(Canonical value);

	/**
	 * Returns the value of the '<em><b>No Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If noMap = true this indicates that no mapping to a target concept exists for this source concept.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Map</em>' containment reference.
	 * @see #setNoMap(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FHIRPackage#getConceptMapElement_NoMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noMap' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getNoMap();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ConceptMapElement#getNoMap <em>No Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Map</em>' containment reference.
	 * @see #getNoMap()
	 * @generated
	 */
	void setNoMap(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ConceptMapTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A concept from the target value set that this concept maps to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getConceptMapElement_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConceptMapTarget> getTarget();

} // ConceptMapElement
