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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indirect Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.IndirectEntryType#getDefinitionProxy <em>Definition Proxy</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getIndirectEntryType()
 * @model extendedMetaData="name='IndirectEntryType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IndirectEntryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Definition Proxy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Proxy</em>' containment reference.
	 * @see #setDefinitionProxy(DefinitionProxyType)
	 * @see net.opengis.gml.gml.GMLPackage#getIndirectEntryType_DefinitionProxy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DefinitionProxy' namespace='##targetNamespace'"
	 * @generated
	 */
	DefinitionProxyType getDefinitionProxy();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.IndirectEntryType#getDefinitionProxy <em>Definition Proxy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Proxy</em>' containment reference.
	 * @see #getDefinitionProxy()
	 * @generated
	 */
	void setDefinitionProxy(DefinitionProxyType value);

} // IndirectEntryType
