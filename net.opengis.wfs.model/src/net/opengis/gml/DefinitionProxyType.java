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
package net.opengis.gml;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Proxy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A proxy entry in a dictionary of definitions. An element of this type contains a reference to a remote definition object. This entry is expected to be convenient in allowing multiple elements in one XML document to contain short (abbreviated XPointer) references, which are resolved to an external definition provided in a Dictionary element in the same XML document. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.DefinitionProxyType#getDefinitionRef <em>Definition Ref</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getDefinitionProxyType()
 * @model extendedMetaData="name='DefinitionProxyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DefinitionProxyType extends DefinitionType {
	/**
	 * Returns the value of the '<em><b>Definition Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a remote entry in this dictionary, used when this dictionary entry is identified to allow external references to this specific entry. The remote entry referenced can be in a dictionary in the same or different XML document. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition Ref</em>' containment reference.
	 * @see #setDefinitionRef(ReferenceType)
	 * @see net.opengis.gml.GMLPackage#getDefinitionProxyType_DefinitionRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='definitionRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getDefinitionRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DefinitionProxyType#getDefinitionRef <em>Definition Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Ref</em>' containment reference.
	 * @see #getDefinitionRef()
	 * @generated
	 */
	void setDefinitionRef(ReferenceType value);

} // DefinitionProxyType
