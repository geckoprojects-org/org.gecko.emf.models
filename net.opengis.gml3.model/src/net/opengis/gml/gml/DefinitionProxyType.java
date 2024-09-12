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
package net.opengis.gml.gml;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Proxy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.DefinitionProxyType#getDefinitionRef <em>Definition Ref</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getDefinitionProxyType()
 * @model extendedMetaData="name='DefinitionProxyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DefinitionProxyType extends DefinitionType {
	/**
	 * Returns the value of the '<em><b>Definition Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Ref</em>' containment reference.
	 * @see #setDefinitionRef(ReferenceType)
	 * @see net.opengis.gml.gml.GMLPackage#getDefinitionProxyType_DefinitionRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='definitionRef' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getDefinitionRef();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.DefinitionProxyType#getDefinitionRef <em>Definition Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Ref</em>' containment reference.
	 * @see #getDefinitionRef()
	 * @generated
	 */
	void setDefinitionRef(ReferenceType value);

} // DefinitionProxyType
