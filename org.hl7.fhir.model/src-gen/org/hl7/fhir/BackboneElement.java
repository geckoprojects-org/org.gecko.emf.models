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
 * A representation of the model object '<em><b>Backbone Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base definition for all elements that are defined inside a resource - but not those in a data type.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.BackboneElement#getModifierExtension <em>Modifier Extension</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getBackboneElement()
 * @model extendedMetaData="name='BackboneElement' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BackboneElement extends Element {
	/**
	 * Returns the value of the '<em><b>Modifier Extension</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Extension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * May be used to represent additional information that is not part of the basic definition of the element and that modifies the understanding of the element in which it is contained and/or the understanding of the containing element's descendants. Usually modifier elements provide negation or qualification. To make the use of extensions safe and managable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer can define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions.
	 * 
	 * Modifier extensions SHALL NOT change the meaning of any elements on Resource or DomainResource (including cannot change the meaning of modifierExtension itself).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifier Extension</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getBackboneElement_ModifierExtension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modifierExtension' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Extension> getModifierExtension();

} // BackboneElement
