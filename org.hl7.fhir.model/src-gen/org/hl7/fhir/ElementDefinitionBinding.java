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
 * A representation of the model object '<em><b>Element Definition Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Captures constraints on each element within the resource, profile, or extension.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getStrength <em>Strength</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.ElementDefinitionBinding#getAdditional <em>Additional</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getElementDefinitionBinding()
 * @model extendedMetaData="name='ElementDefinition.Binding' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ElementDefinitionBinding extends BackboneType {
	/**
	 * Returns the value of the '<em><b>Strength</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strength</em>' containment reference.
	 * @see #setStrength(BindingStrength)
	 * @see org.hl7.fhir.FHIRPackage#getElementDefinitionBinding_Strength()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='strength' namespace='##targetNamespace'"
	 * @generated
	 */
	BindingStrength getStrength();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getStrength <em>Strength</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' containment reference.
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(BindingStrength value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the intended use of this particular set of codes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see org.hl7.fhir.FHIRPackage#getElementDefinitionBinding_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the value set that identifies the set of codes the binding refers to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(Canonical)
	 * @see org.hl7.fhir.FHIRPackage#getElementDefinitionBinding_ValueSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ElementDefinitionBinding#getValueSet <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(Canonical value);

	/**
	 * Returns the value of the '<em><b>Additional</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ElementDefinitionAdditional}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional bindings that help applications implementing this element. Additional bindings do not replace the main binding but provide more information and/or context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getElementDefinitionBinding_Additional()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additional' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ElementDefinitionAdditional> getAdditional();

} // ElementDefinitionBinding
